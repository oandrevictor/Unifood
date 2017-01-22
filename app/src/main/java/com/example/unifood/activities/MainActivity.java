package com.example.unifood.activities;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.activities.helpers.UserListAdapter;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private UserListAdapter mAdapter;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<String> dataSet = new ArrayList<>();

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpFirebase();

        if (mFirebaseUser == null) {
            // Not logged in, launch the Log In activity
            startLogInActivity();
        }

        Button signOutButton = (Button) this.findViewById(R.id.sign_out_button);
        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.signOut(); // SignOut of Firebase
                startLogInActivity(); //* Not sure if will work, starts the LogInActivity Again
            }
        });


        RecyclerView userlistRecyclerView;
        // Set local attributes to corresponding views
        userlistRecyclerView = (RecyclerView) this.findViewById(R.id.all_users_list_view);
        // Set layout for the RecyclerView, because it's a list we are using the linear layout
        userlistRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        TextView counterTextView = (TextView) findViewById(R.id.result_counter);
        DatabaseReference ref = mDatabase.child(getString(R.string.users));
        dataSet = new ArrayList<String>();
        dataSet.add("x");
        mAdapter = new UserListAdapter(this, dataSet);


        // Link the adapter to the RecyclerView
        userlistRecyclerView.setAdapter(mAdapter);

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
}
