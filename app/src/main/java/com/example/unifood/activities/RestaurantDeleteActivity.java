package com.example.unifood.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.unifood.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class RestaurantDeleteActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private DatabaseReference restaurantRef;
    private DatabaseReference userRef;
    private String restaurantId;
    private String userId;

    @InjectView(R.id.confirm_password) EditText passwordField;
    @InjectView(R.id.confirm_email) EditText emailConfirmField;
    @InjectView(R.id.delete_button) Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_delete);
        ButterKnife.inject(this);
        setUpFirebase();
        setRestaurantId();
        onClickDeleteButton();
    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        userId  =  FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

    private void setRestaurantId() {
        Intent intentRestaurantSelected = getIntent();
        if (intentRestaurantSelected.hasExtra("REST_ID"))
            restaurantId = intentRestaurantSelected.getStringExtra("REST_ID");

        setRestaurantRef();
    }

    private void setRestaurantRef() {
        if (restaurantId != null)
            restaurantRef = mDatabase.child("restaurants").child(restaurantId);
    }

    private void onClickDeleteButton() {
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleterFirebaseUser();
            }
        });
    }

    private void startBlankActivity() {
        Class blankActivity = BlankActivity.class;
        Intent goToBlank = new Intent(this, blankActivity);
        goToBlank.putExtra("REST_ID", restaurantId);
        startActivity(goToBlank);
    }

    private void deleterFirebaseUser() {

        if (mFirebaseUser != null) {

            String email = emailConfirmField.getText().toString();
            String password = passwordField.getText().toString();

            AuthCredential credential = EmailAuthProvider
                    .getCredential(email, password);

            mFirebaseUser.reauthenticate(credential)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            startBlankActivity();

                            mFirebaseUser.delete()
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {

                                        }
                                    });
                        }
                    });

        }
    }

}
