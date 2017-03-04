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
    @InjectView(R.id.rest_edit_description) EditText descriptionField;
    @InjectView(R.id.rest_edit_local) EditText localField;
    @InjectView(R.id.rest_edit_email) EditText emailField;
    @InjectView(R.id.update_b)   Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_edit);

        ButterKnife.inject(this);
        setUpFirebase();
        setRestaurantId();
        setTextsViews();

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateInfo();
            }
        });
    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        userId  =  FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

    public void updateInfo() {

        String name = nameField.getText().toString();
        String description = descriptionField.getText().toString();
        String local = localField.getText().toString();
        String email = emailField.getText().toString();

        if (!validate(name, description, local, email)) {
            Toast.makeText(getBaseContext(), "Complete os campos corretamente.", Toast.LENGTH_LONG).show();
            updateButton.setEnabled(true);
            return;
        }

        final ProgressDialog progressDialog = startDialog(getString(R.string.updateDialog), updateButton);

        mFirebaseUser.updateEmail(email);

        restaurantRef.child("name").setValue(name);
        restaurantRef.child("description").setValue(description);
        restaurantRef.child("localization").setValue(local, new DatabaseReference.CompletionListener() {
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

    private void setTextsViews() {
        restaurantRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant restaurant = dataSnapshot.getValue(Restaurant.class);
                emailField.setText(mFirebaseUser.getEmail());
                nameField.setText(restaurant.getName());
                descriptionField.setText(restaurant.getShortDescription());
                localField.setText(restaurant.getLocalization());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private boolean validate(String name, String description, String local, String email) {
        boolean valid = true;

        if (name.isEmpty() || name.length() < 2) {
            nameField.setError(getText(R.string.three_characters));
            valid = false;
        } else {
            nameField.setError(null);
        }

        if (description.isEmpty() || description.length() <= 10 || description.length() > 100) {
            descriptionField.setError(getText(R.string.between_ten_oneH_characters));
            valid = false;
        } else {
            descriptionField.setError(null);
        }

        if (local.isEmpty() || local.length() <= 10 || local.length() > 50) {
            localField.setError(getText(R.string.between_ten_fifty_characters));
            valid = false;
        } else {
            localField.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailField.setError(getText(R.string.valid_email));
            valid = false;
        } else {
            emailField.setError(null);
        }

        return valid;
    }


}