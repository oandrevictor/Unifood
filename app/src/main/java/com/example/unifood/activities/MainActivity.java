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
import com.example.unifood.database.test.TestUtil;
import com.example.unifood.database.contracts.UserContract;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase mDb;
    private UserListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        User.remove(mDb,2);
        Cursor cursor = getAllGuests();

        int count = cursor.getCount();

        TextView myAwesomeTextView = (TextView)findViewById(R.id.result_counter);
        myAwesomeTextView.setText(Integer.toString(count));


        mAdapter = new UserListAdapter(this, cursor);
        // Link the adapter to the RecyclerView
        userlistRecyclerView.setAdapter(mAdapter);

    }
    private void login(){
        Context context = MainActivity.this;
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(context,loginActivity);
        startActivity(goToLogin);

    }

    private Cursor getAllGuests() {
        // COMPLETED (6) Inside, call query on mDb passing in the table name and projection String [] order by COLUMN_TIMESTAMP
        return mDb.query(
                UserContract.UserEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                UserContract.UserEntry.COLUMN_TIMESTAMP
        );
    }
}
