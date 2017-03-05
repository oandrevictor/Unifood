package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.StudentInfo;
import com.example.unifood.models.UserInfo;
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
    ProgressDialog progressDialog;


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
        getStudent();
        mDatabase.child("campus").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
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

    private void getStudent(){
        progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
        mDatabase.child("users").child(mFirebaseUser.getUid()).child("userInfo").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshoty) {
                UserInfo info = snapshoty.getValue(UserInfo.class);
                firstNameField.setText(info.getFirstName());
                lastNameField.setText(info.getLastName());
                progressDialog.dismiss();
            }


            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
                progressDialog.dismiss();

            }
        });
    }

    public void updateInfo(){
        String firstName = firstNameField.getText().toString();
        String lastName = lastNameField.getText().toString();
        String email = emailField.getText().toString();

        if (!validate(firstName, lastName, email)) {
            Toast.makeText(getBaseContext(), "Complete os campos corretamente.", Toast.LENGTH_LONG).show();
            updateButton.setEnabled(true);
            return;
        }

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

    public boolean validate(String firstName, String lastName, String email) {
        boolean valid = true;

        if (firstName.isEmpty() || firstName.length() < 3) {
            firstNameField.setError(getText(R.string.four_characters));
            valid = false;
        } else {
            firstNameField.setError(null);
        }

        if (lastName.isEmpty() || lastName.length() < 3) {
            lastNameField.setError(getText(R.string.four_characters));
            valid = false;
        } else {
            lastNameField.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailField.setError(getText(R.string.valid_email));
            valid = false;
        } else {
            emailField.setError(null);
        }

        return valid;
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

