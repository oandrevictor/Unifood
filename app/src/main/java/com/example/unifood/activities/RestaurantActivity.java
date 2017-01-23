package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.unifood.R;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        String uniId = getIntent().getStringExtra("UNI_ID"); //*Fix for restaurant
        TextView restaurantName = (TextView) findViewById(R.id.restaurant_title);
        restaurantName.setText(uniId);
    }
}
