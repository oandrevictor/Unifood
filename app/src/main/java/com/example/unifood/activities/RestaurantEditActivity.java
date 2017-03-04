package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.models.Restaurant;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class RestaurantEditActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private DatabaseReference restaurantRef;
    private DatabaseReference userRef;
    private String campus;
    private String restaurantId;
    private String userId;

    public final String VAZIO = "";

    @InjectView(R.id.rest_edit_name)  EditText nameField;
    @InjectView(R.id.rest_edit_local) EditText localField;
    @InjectView(R.id.rest_edit_email) EditText emailField;
    @InjectView(R.id.confirm_password) EditText passwordField;
    @InjectView(R.id.confirm_email) EditText emailConfirmField;
    @InjectView(R.id.update_b)   Button updateButton;
    @InjectView(R.id.delete_button) Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_edit);

        ButterKnife.inject(this);
        setUpFirebase();
        setRestaurantId();

        restaurantRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant restaurant = dataSnapshot.getValue(Restaurant.class);
                emailField.setText(mFirebaseUser.getEmail());
                nameField.setText(restaurant.getName());
                localField.setText(restaurant.getLocalization());
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
        onClickDeleteButton();
    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        userId  =  FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

    public void updateInfo() {

        String name = nameField.getText().toString();
        String local = localField.getText().toString();
        String email = emailField.getText().toString();

        final ProgressDialog progressDialog = startDialog(getString(R.string.updateDialog), updateButton);

        mFirebaseUser.updateEmail(email);

        if (!name.equals(VAZIO))  restaurantRef.child("name").setValue(name);
        if (!local.equals(VAZIO)) restaurantRef.child("localization").setValue(local, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                if (firebaseError != null) {
                    Toast.makeText(RestaurantEditActivity.this, "Perfil do restaurante não atualizado!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(RestaurantEditActivity.this, "Perfil do restaurante atualizado.", Toast.LENGTH_SHORT).show();
                }
                finishDialog(progressDialog, updateButton);
            }
        });
        startHomeActivity();
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

    private ProgressDialog startDialog(String message, Button bt) {
        bt.setEnabled(false);
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(message);
        progressDialog.show();

        return progressDialog;
    }

    private void finishDialog(ProgressDialog pg, Button bt) {
        pg.dismiss();
        bt.setEnabled(true);
    }

    private void startHomeActivity(){
        Class homeActivity = RestaurantHomeActivity.class;
        Intent goToHome = new Intent(this, homeActivity);
        startActivity(goToHome);
    }

    private void onClickDeleteButton() {
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleterFirebaseUser();
                deleteUser();
            }
        });
    }

    private void startLoginActivity() {
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(this, loginActivity);
        startActivity(goToLogin);
    }

    private void deleterFirebaseUser() {

        String email = emailConfirmField.getText().toString();
        String passowrd = passwordField.getText().toString();

        AuthCredential credential = EmailAuthProvider.getCredential(email, passowrd);

        mFirebaseUser.reauthenticate(credential)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        mFirebaseUser.delete()
                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                    }
                                });
                    }
                });

    }

    private void deleteRestaurant() {
        restaurantRef = mDatabase.child("restaurants").child(restaurantId);
        restaurantRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                deleteRestaurant();
                dataSnapshot.getRef().removeValue();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void deleteUser() {
        userRef = mDatabase.child("users").child(userId);
        userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                dataSnapshot.getRef().removeValue();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


}