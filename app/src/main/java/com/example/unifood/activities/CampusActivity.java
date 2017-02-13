package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.unifood.R;
import com.example.unifood.adapters.CampusListAdapter;
import com.example.unifood.models.Restaurant;

import java.util.ArrayList;

public class CampusActivity extends AppCompatActivity {

    private CampusListAdapter adapter;
    private RecyclerView restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the user interface layout for this Activity
        setContentView(R.layout.activity_campus);

        // Store a reference to the RecyclerView in mNumbersList
        restaurantList = (RecyclerView) findViewById(R.id.rv_restaurants);

        // Create a LinearLayoutManager variable called layoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        restaurantList.setLayoutManager(layoutManager);

        // Designate that the contents of the RecyclerView won't change an item's size
        restaurantList.setHasFixedSize(true);

        // TODO Change 'new ArrayList<Restaurant>()' for the real campus' restaurant's list
        adapter = new CampusListAdapter(new ArrayList<Restaurant>());
        restaurantList.setAdapter(adapter);

    }

    /**
     * Restore the instance state if it was once stored.
     * @param savedInstanceState
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // mTextView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
    }

    /**
     * Invoked when the activity may be temporarily destroyed, save the instance state here
     */
    @Override
    public void onSaveInstanceState (Bundle outState) {
        // outState.putString(TEXT_VIEW_KEY, mTextView.getText());

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }

}