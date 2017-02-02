package com.example.unifood.activities;

import android.app.Fragment;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantListAdapter;
import com.example.unifood.fragments.RestaurantListFragment;
import com.example.unifood.fragments.UniversitiesListFragment;
import com.example.unifood.adapters.UniversityListAdapter;
import com.example.unifood.models.Campus;
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
import butterknife.InjectView;

import static android.R.attr.fragment;

public class AdminUniversityActivity extends AppCompatActivity {
    String universityName;
    String campusName;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<University> dataSet = new ArrayList<>();
    private ArrayList<Restaurant> restaurantSet = new ArrayList<>();

    DatabaseReference ref;
    DatabaseReference restRef;


    @InjectView(R.id.name_text_field) EditText name;
    @InjectView(R.id.new_campus_field) EditText campusname;
    @InjectView(R.id.create_button)    Button createButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_university);
        setUpFirebase();
        ButterKnife.inject(this);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                universityName = name.getText().toString();
                campusName = campusname.getText().toString();

                Campus campus = new Campus(campusName);

                University university = new University(universityName);
                university.addCampus(campus.getId());
                mDatabase.child("universities").push().setValue(university);

                Class mainA = MainActivity.class;
                Intent goHome = new Intent(AdminUniversityActivity.this, mainA);
                startActivity(goHome);

            }
        });


        dataSet = new ArrayList<University>();
        ref = mDatabase.child("universities");
        restRef = mDatabase.child("restaurants");

        ref.addValueEventListener (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                new AdminUniversityActivity.LongOperation(snapshot).execute();
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });

        restRef.addValueEventListener (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                new AdminUniversityActivity.LoadRestaurants(snapshot).execute();
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });



    }


    /**
     * Gets a reference from the database at Firebase server as well the Auth system and the current user.
     */
    private void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    protected class LongOperation extends AsyncTask<String, Void, String> {
        DataSnapshot snapshot;
        public LongOperation(DataSnapshot snapshot){
            this.snapshot = snapshot;
        }

        @Override
        protected String doInBackground(String... params) {
            Log.e("Count " ,""+snapshot.getChildrenCount());
            for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                University uni = postSnapshot.getValue(University.class);
                dataSet.add(uni);
            }
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            UniversityListAdapter mAdapter = new UniversityListAdapter(AdminUniversityActivity.this, dataSet);
            UniversitiesListFragment fragment = (UniversitiesListFragment) getFragmentManager().findFragmentById(R.id.fragment_place);
            fragment.updateRecycler(mAdapter);
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}
    }



    public class LoadRestaurants extends AsyncTask<String, Void, String> {
        DataSnapshot snapshot;
        public LoadRestaurants(DataSnapshot snapshot){
            this.snapshot = snapshot;
        }

        @Override
        protected String doInBackground(String... params) {
            Log.e("Count " ,""+snapshot.getChildrenCount());
            for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                Restaurant rst = postSnapshot.getValue(Restaurant.class);
                restaurantSet.add(rst);
            }
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            RestaurantListAdapter restAdapter = new RestaurantListAdapter(AdminUniversityActivity.this, restaurantSet);
            Fragment fragment1 = getFragmentManager().findFragmentById(R.id.fragment_place2);
            RestaurantListFragment fragment = (RestaurantListFragment) getFragmentManager().findFragmentById(R.id.fragment_place2);
            fragment.updateRecycler(restAdapter);
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}
    }

}
