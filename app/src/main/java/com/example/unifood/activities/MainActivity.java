package com.example.unifood.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.unifood.R;
import com.example.unifood.adapters.UniversityListAdapter;
import com.example.unifood.models.University;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static android.R.attr.type;

public class MainActivity extends AppCompatActivity {
    private UniversityListAdapter mAdapter;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<University> dataSet = new ArrayList<>();
    DatabaseReference ref;
    String userType;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_main);
        setUpFirebase();

        if (mFirebaseUser == null) {
            // Not logged in, launch the Log In activity
            startLogInActivity();
        }
        else{
            String uid = mFirebaseUser.getUid();
            ref= mDatabase.child("users").child(uid).child("userInfo").child("type");
            userType = "";
            ref.addValueEventListener (new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    Log.e("h", snapshot.getKey());
                    userType = snapshot.getValue(String.class);
                    if (userType.equals("student")){
                        startStudentHome();
                    } else if (userType.equals("owner")) {
                        startRestaurntHome();
                    }
                }
                @Override
                public void onCancelled(DatabaseError firebaseError) {
                    Log.e("The read failed: " ,firebaseError.getMessage());
                }
            });

        }

        // Click SignOut Button
        Button signOutButton = (Button) this.findViewById(R.id.sign_out_button);
        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.signOut(); // SignOut of Firebase
                startLogInActivity(); //* Not sure if will work, starts the LogInActivity Again
            }
        });

        // Click Admin Button
        Button admButton = (Button) this.findViewById(R.id.admin_button);
        admButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAdmActivity();
            }
        });
        dataSet = new ArrayList<University>();
        ref = mDatabase.child("universities");

        ref.addValueEventListener (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                new LongOperation(snapshot).execute();
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Gets a reference from the database at Firebase server as well the Auth system and the current user.
     */
    private void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    /**
     * Starts the LogInActivity
     */
    private void startLogInActivity() {
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(this, loginActivity);
        startActivity(goToLogin);
    }

    private void startAdmActivity() {
        Class admActivity = AdminUniversityActivity.class;
        Intent goToAdm = new Intent(this, admActivity);
        startActivity(goToAdm);
    }

    private void startStudentHome(){
        Class studentHome = StudentHomeActivity.class;
        Intent goToSHome = new Intent(this, studentHome);
        startActivity(goToSHome);
    }

    private void startRestaurntHome() {
        Class restaurantHome = RestaurantHomeActivity.class;
        Intent goToRHome = new Intent(this, restaurantHome);
        System.out.println("Vou startar owner ein");
        startActivity(goToRHome);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName(getString(R.string.main_page)) // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse(getString(R.string.enter_your_url)))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
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
/*
            ref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    Log.e("Count " ,""+snapshot.getChildrenCount());
                    for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                        University uni = postSnapshot.getValue(University.class);
                        dataSet.add(uni);
                    }
                }
                @Override
                public void onCancelled(DatabaseError firebaseError) {
                    Log.e("The read failed: " ,firebaseError.getMessage());
                }
            });*/
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            mAdapter = new UniversityListAdapter(MainActivity.this, dataSet);
            // Link the adapter to the RecyclerView
            RecyclerView universityListRecyclerView;
            // Set local attributes to corresponding views
            universityListRecyclerView = (RecyclerView) MainActivity.this.findViewById(R.id.all_universities_list);
            // Set layout for the RecyclerView, because it's a list we are using the linear layout
            universityListRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            universityListRecyclerView.setAdapter(mAdapter);
            setProgressBarIndeterminateVisibility(false);
        }

        @Override
        protected void onPreExecute() {

            setProgressBarIndeterminateVisibility(true);
        }

        @Override
        protected void onProgressUpdate(Void... values) {}
    }

}
