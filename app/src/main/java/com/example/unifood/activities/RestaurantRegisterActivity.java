package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.models.StudentInfo;
import com.example.unifood.models.UserInfo;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class RestaurantRegisterActivity extends AppCompatActivity {
    private static final String TAG = "Restaurant_SignupAct";
    private FirebaseAuth mFirebaseAuth;
    UserInfo userInfo;
    StudentInfo studentInfo;

    @InjectView(R.id.user_first_name_field) EditText user_first_nameText;
    @InjectView(R.id.user_last_name_field) EditText user_last_nameText;
    @InjectView(R.id.user_email_field) EditText user_emailText;
    @InjectView(R.id.user_password_field) EditText user_passwordText;
    @InjectView(R.id.restaurant_name_field) EditText restaurant_nameText;
    @InjectView(R.id.restaurant_description) EditText restaurant_descriptionText;
    @InjectView(R.id.auto_complete_campus) MultiAutoCompleteTextView restaurant_university_campus;
    @InjectView(R.id.restaurant_location) EditText restaurant_locationText;
    @InjectView(R.id.restaurant_sing_up_button) Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_register);
        ButterKnife.inject(this);

        mFirebaseAuth = FirebaseAuth.getInstance();

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
    }

    private void signup() {
        Log.d(TAG, "Registrar restaurante");

        String user_firstName = user_first_nameText.getText().toString();
        String user_lastName = user_last_nameText.getText().toString();
        String user_email = user_emailText.getText().toString();
        String user_password = user_passwordText.getText().toString();
        String restaurant_name = user_first_nameText.getText().toString();
        String restaurant_description = restaurant_descriptionText.getText().toString();
        String restaurant_university = restaurant_university_campus.getText().toString();
        String restaurant_location = restaurant_locationText.getText().toString();

        if (!(validateUser(user_firstName, user_lastName, user_email, user_password) && validateRestaurant(restaurant_name, restaurant_description, restaurant_university, restaurant_location))) {
            onSignupFailed();
            return;
        }

        signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(this,
                R.style.AppTheme);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getText(R.string.creating_account));
        progressDialog.show();

    }

    private void onSignupFailed() {

    }

    private boolean validateRestaurant(String restaurant_name, String restaurant_description, String restaurant_university, String restaurant_location) {
        return false;
    }

    private boolean validateUser(String user_firstName, String user_lastName, String user_email, String user_password) {
        return false;
    }
}
