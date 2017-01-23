package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.controllers.FirebaseHelper;

public class UniversityActivity extends AppCompatActivity {
    FirebaseHelper fHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fHelper = new FirebaseHelper();
        setContentView(R.layout.activity_university);
        String uniId = getIntent().getStringExtra("UNI_ID"); //*Fix for restaurant
        String name;
        if (fHelper.getUniversity(uniId) != null){
            name = fHelper.getUniversity(uniId).getName();
        } else {
            name = "Not working yet!";
        }
        TextView restaurantName = (TextView) findViewById(R.id.restaurant_title);
        restaurantName.setText(name);
    }
}
