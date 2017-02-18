package com.example.unifood.firebase.utils;

import android.app.Fragment;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.unifood.adapters.RestaurantListAdapter;
import com.example.unifood.fragments.RestaurantListFragment;
import com.example.unifood.models.Restaurant;
import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;

/**
 * Created by oandrevictor on 18/02/17.
 */

public class LoadRestaurants extends AsyncTask<String, Void, String> {
    DataSnapshot snapshot;
    ArrayList<Restaurant> restaurantSet;
    AppCompatActivity activity;
    int fragmentId;

    public LoadRestaurants(DataSnapshot snapshot, ArrayList<Restaurant> restaurantSet, AppCompatActivity activity, int fragmentId){
        this.restaurantSet = restaurantSet;
        this.snapshot = snapshot;
        this.fragmentId = fragmentId;
        this.activity = activity;
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
        RestaurantListAdapter restAdapter = new RestaurantListAdapter(activity, restaurantSet);
        Fragment fragment1 = activity.getFragmentManager().findFragmentById(fragmentId);
        RestaurantListFragment fragment = (RestaurantListFragment) activity.getFragmentManager().findFragmentById(fragmentId);
        fragment.updateRecycler(restAdapter);
    }

    @Override
    protected void onPreExecute() {}

    @Override
    protected void onProgressUpdate(Void... values) {}
}
