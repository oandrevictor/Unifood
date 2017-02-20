package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.controllers.FirebaseHelper;
import com.example.unifood.firebase.utils.LoadRestaurants;
import com.example.unifood.firebase.utils.Utilities;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.University;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class StudentHomeActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<University> dataSet = new ArrayList<>();
    private ArrayList<Restaurant> restaurantSet = new ArrayList<>();
    private ArrayList<Restaurant> faveRestaurantSet = new ArrayList<>();

    private Utilities util;

    private TabHost tabHost;
    private TabSpec spec1,spec2,spec3;

    DatabaseReference ref;
    DatabaseReference restRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        ButterKnife.inject(this);

        setUpFirebase();

        setUpHostBar();

        loadAllRestaurants();

        loadSavedRestaurants();

    }
    @Override
    public void onBackPressed() {
    }

    private void loadAllRestaurants(){
        restRef = mDatabase.child("restaurants");
        restRef.addValueEventListener (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                new LoadRestaurants(snapshot, restaurantSet, StudentHomeActivity.this, R.id.all_restaurants).execute();
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });

    }

    private void loadSavedRestaurants(){
        ref = mDatabase.child("users").child(mFirebaseUser.getUid()).child("StudentInfo").child("favRestaurants");
        ref.addValueEventListener (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshotx) {

                new LoadRestaurants(snapshotx, faveRestaurantSet, StudentHomeActivity.this, R.id.saved_restaurants).execute();
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });
    }

    private void setUpHostBar(){

        tabHost =(TabHost)findViewById(R.id.host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Favoritas");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Favoritas");

        spec2 = tabHost.newTabSpec("Todas");
        spec2.setIndicator("Todas");
        spec2.setContent(R.id.tab2);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);

    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}