package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.unifood.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class StudentEditActivity extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    String campus;

    @InjectView(R.id.user_edit_first_name) EditText firstNameField;
    @InjectView(R.id.user_edit_last_name) EditText lastNameField;
    @InjectView(R.id.campus_spinner) Spinner campusField;
    @InjectView(R.id.user_edit_email) EditText emailField;
    @InjectView(R.id.update_button) Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_edit);
        ButterKnife.inject(this);
        setUpFirebase();
        emailField.setText(mFirebaseUser.getEmail());
        mDatabase.child("campus").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Is better to use a List, because you don't know the size
                // of the iterator returned by dataSnapshot.getChildren() to
                // initialize the array
                final List<String> campusNames = new ArrayList<String>();
                final List<String> campusId = new ArrayList<String>();

                for (DataSnapshot campusSnapshot: dataSnapshot.getChildren()) {
                    String areaName = campusSnapshot.child("name").getValue(String.class);
                    campusNames.add(areaName);
                    campusId.add(campusSnapshot.getKey());
                }

                Spinner campusSpinner = (Spinner) findViewById(R.id.campus_spinner);
                ArrayAdapter<String> campusAdapter = new ArrayAdapter<String>(StudentEditActivity.this, android.R.layout.simple_spinner_item, campusNames);
                campusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                campusSpinner.setAdapter(campusAdapter);

                campusSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1,
                                               int arg2, long arg3) {
                        campus= campusId.get(arg2);

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateInfo();
            }
        });

    }

    public void updateInfo(){
        String firstName = firstNameField.getText().toString();
        String lastName = lastNameField.getText().toString();
        String email = emailField.getText().toString();

        updateButton.setEnabled(false);
        final ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Atualizando.");
        progressDialog.show();

        mFirebaseUser.updateEmail(email);
        String uid = mFirebaseUser.getUid();

        DatabaseReference uInfo = mDatabase.child("users").child(uid).child("userInfo");
        uInfo.child("firstName").setValue(firstName);
        uInfo.child("lastName").setValue(lastName);
        mDatabase.child("users").child(uid).child("studentInfo").child("campusId").setValue(campus, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                if (firebaseError != null) {
                    progressDialog.dismiss();
                    Toast.makeText(StudentEditActivity.this, "Não foi possível Atualizar", Toast.LENGTH_SHORT).show();

                } else {
                    progressDialog.dismiss();
                    Toast.makeText(StudentEditActivity.this, "Informações Atualizadas", Toast.LENGTH_SHORT).show();
                }
                startHomeActivity();
            }
        });

    }

    public void startHomeActivity(){
        Class homeActivity = StudentHomeActivity.class;
        Intent goToHome = new Intent(this, homeActivity);
        startActivity(goToHome);
    }


    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

}

