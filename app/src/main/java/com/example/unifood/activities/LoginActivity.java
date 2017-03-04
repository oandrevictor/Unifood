package com.example.unifood.activities;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LoginActivity extends AppCompatActivity {

    // ATRIBUTES

    protected EditText emailEditText;
    protected EditText passwordEditText;
    protected Button logInButton;
    protected TextView signUpTextView;
    protected TextView restaurantSignUpTextView;
    private DatabaseReference mDatabase;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    DatabaseReference ref;
    String userType;



    private boolean mVisible;

    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */

    // METHODS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
        }

        mVisible = true;
        mDatabase = FirebaseDatabase.getInstance().getReference();
        String userType =  "";

        // Set up all ids from layouts for this onCreate method
        findViewsByIdOnCreate();

        // Set up the user interaction to manually show or hide the system UI.

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.

        mFirebaseAuth = FirebaseAuth.getInstance();
	        restaurantSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RestaurantRegisterActivity.class);
                startActivity(intent);
            }
        });


    }

    /**
     * Find all id's used in onCreate method.
     */
    private void findViewsByIdOnCreate() {


        signUpTextView = (TextView) findViewById(R.id.sign_up_text);
        emailEditText = (EditText) findViewById(R.id.email_field);
        passwordEditText = (EditText) findViewById(R.id.password_field);
        logInButton = (Button) findViewById(R.id.login_button);
        restaurantSignUpTextView = (TextView) findViewById(R.id.sign_up_restaurant_text) ;
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
    }


    /**
     * Create intent for conection with singUp view
     */
    private void singUp() {
        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Setting an OnClickListener to do initialize Restaurant or Student Home Acitivy when login button is clicked.
     */
    private void pressLoginButton() {
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin() {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        email = email.trim();
        password = password.trim();

        if (email.isEmpty() || password.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
            builder.setMessage(R.string.login_error_message)
                    .setTitle(R.string.error_title)
                    .setPositiveButton(android.R.string.ok, null);
            AlertDialog dialog = builder.create();
            dialog.show();
        } else {
            final ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Entrando...");
            progressDialog.show();
            logInButton.setEnabled(false);
            mFirebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                mFirebaseUser = mFirebaseAuth.getCurrentUser();
                                String uid = mFirebaseUser.getUid();
                                ref = mDatabase.child("users").child(uid).child("userInfo").child("type");
                                ref.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        userType = dataSnapshot.getValue(String.class);
                                        if (userType.equals("student")){
                                            progressDialog.dismiss();
                                            logInButton.setEnabled(true);
                                            startStudentHome();
                                        } else if (userType.equals("owner")) {
                                            progressDialog.dismiss();
                                            logInButton.setEnabled(true);
                                            startRestaurntHome();
                                        }
                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                    }
                                });
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage(task.getException().getMessage())
                                        .setTitle(R.string.error_title)
                                        .setPositiveButton(android.R.string.ok, null);
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                progressDialog.dismiss();
                                logInButton.setEnabled(true);
                            }
                        }
                    });
        }
    }

    private void startStudentHome(){
        Class studentHome = StudentHomeActivity.class;
        Intent goToSHome = new Intent(this, studentHome);
        startActivity(goToSHome);
    }

    private void startRestaurntHome() {
        Class restaurantHome = RestaurantHomeActivity.class;
        Intent goToRHome = new Intent(this, restaurantHome);
        goToRHome.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(goToRHome);
        finish();
    }

    /**
     * This is the state in which the app interacts with the user.
     * The app stays in this state until something happens to take focus away from the app
     */
    @Override
    protected void onResume() {
        super.onResume();

        singUp();
        pressLoginButton();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button.
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}
