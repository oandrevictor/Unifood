package com.example.unifood.activities;

/**
 * Created by gabmla on 20/01/17.
 */

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.exceptions.InvalidFirstNameException;
import com.example.unifood.exceptions.StudentException;
import com.example.unifood.exceptions.UserException;
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


public class SignUpActivity extends AppCompatActivity {
    private static final String TAG = "User_Signup_Activity";
    private final String STUDENT_TYPE = "student";
    private FirebaseAuth mFirebaseAuth;
    UserInfo userInfo;
    StudentInfo studentInfo;
    String campus;
    FirebaseUser mFirebaseUser;
    DatabaseReference mDatabase;


    @InjectView(R.id.first_name) EditText first_nameText;
    @InjectView(R.id.last_name) EditText last_nameText;
    @InjectView(R.id.input_email) EditText emailText;
    @InjectView(R.id.input_password) EditText passwordText;
    @InjectView(R.id.btn_signup) Button signupButton;
    @InjectView(R.id.link_login) TextView toLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.inject(this);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
        loadCampus();
        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the registration screen and return to the Login activity
                finish();
            }
        });
    }

    public void loadCampus(){

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

                Spinner campusSpinner = (Spinner) findViewById(R.id.sign_up_campus_spinner);
                ArrayAdapter<String> campusAdapter = new ArrayAdapter<String>(SignUpActivity.this, android.R.layout.simple_spinner_item, campusNames);
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
    }

    public void signup(){
        Log.d(TAG, getString(R.string.register));
        String firstName = first_nameText.getText().toString();
        String lastName = last_nameText.getText().toString();
        String user_campus = campus;
        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();

        if (!validate(firstName,lastName,user_campus,email,password)) {
            onSignupFailed();
            return;
        }

        try {
            studentInfo = new StudentInfo(user_campus);
        } catch (StudentException e) {
            onSignupFailed();
            return;
        }


        try {
            userInfo = new UserInfo(firstName,lastName,STUDENT_TYPE);
        } catch (UserException e) {
            if (e instanceof InvalidFirstNameException){
                first_nameText.setError(getText(R.string.four_characters));
            }
            onSignupFailed();
            return;
        }

        signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getText(R.string.creating_account));
        progressDialog.show();

        mFirebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mFirebaseUser = mFirebaseAuth.getCurrentUser();
                            mDatabase = FirebaseDatabase.getInstance().getReference();
                            String mUserId  = mFirebaseUser.getUid();
                            mDatabase.child("users").child(mUserId).child("userInfo").setValue(userInfo);
                            mDatabase.child("users").child(mUserId).child("studentInfo").setValue(studentInfo);
                            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);
                            builder.setMessage(task.getException().getMessage())
                                    .setTitle(R.string.error_title)
                                    .setPositiveButton(android.R.string.ok, null);
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        progressDialog.dismiss();
                        onSignupSuccess();
                    }
                });



    }

    public void onSignupSuccess() {
        signupButton.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), R.string.register_fail, Toast.LENGTH_LONG).show();
        signupButton.setEnabled(true);
    }

    public boolean validate(String firstName, String lastName, String university, String email, String password) {
        boolean valid = true;


        if (lastName.isEmpty() || lastName.length() < 3) {
            last_nameText.setError(getText(R.string.four_characters));
            valid = false;
        } else {
            last_nameText.setError(null);
        }



        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailText.setError(getText(R.string.valid_email));
            valid = false;
        } else {
            emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            passwordText.setError(getText(R.string.between_four_ten_characters));
            valid = false;
        } else {
            passwordText.setError(null);
        }

        return valid;
    }

}