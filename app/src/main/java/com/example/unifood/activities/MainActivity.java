package com.example.unifood.activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.User;
import com.example.unifood.database.DbHelper;
import com.example.unifood.database.UserDbController;
import com.example.unifood.database.test.TestUtil;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase mDb;
    private UserListAdapter mAdapter;
    private UserDbController userDbController;

    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();

        if (firebaseUser == null) {
            // Not logged in, launch the Log In activity
            login();
        }


        Button loginButton = (Button) this.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    login();
            }
        });
        RecyclerView userlistRecyclerView;

        // Set local attributes to corresponding views
        userlistRecyclerView = (RecyclerView) this.findViewById(R.id.all_users_list_view);
        // Set layout for the RecyclerView, because it's a list we are using the linear layout
        userlistRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        DbHelper dbHelper = new DbHelper(this);
        mDb = dbHelper.getWritableDatabase();
        TestUtil.insertFakeData(mDb);

        UserDbController userDbController = new UserDbController(this);
        userDbController.delete(2);
        Cursor cursor = userDbController.getAll();

        int count = cursor.getCount();

        TextView myAwesomeTextView = (TextView)findViewById(R.id.result_counter);
        myAwesomeTextView.setText(Integer.toString(count));


        mAdapter = new UserListAdapter(this, cursor);
        // Link the adapter to the RecyclerView
        userlistRecyclerView.setAdapter(mAdapter);

    }
    private void login(){
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(this,loginActivity);
        startActivity(goToLogin);

    }


}
