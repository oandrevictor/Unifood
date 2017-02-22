package com.example.unifood.firebase.utils;

import android.app.Fragment;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.unifood.adapters.RestaurantListAdapter;
import com.example.unifood.adapters.RestaurantProductRecyclerViewAdapter;
import com.example.unifood.fragments.RestaurantListFragment;
import com.example.unifood.fragments.RestaurantProductFragment;
import com.example.unifood.models.Product;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.Review;
import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;
import java.util.List;

public class LoadProducts extends AsyncTask<String, Void, String> {
    DataSnapshot snapshot;
    List<Product> productsSet;
    AppCompatActivity activity;
    int fragmentId;

    public LoadProducts(DataSnapshot snapshot, List<Product> productsSet, AppCompatActivity activity, int fragmentId){
        this.productsSet = productsSet;
        this.snapshot = snapshot;
        this.fragmentId = fragmentId;
        this.activity = activity;
    }

    @Override
    protected String doInBackground(String... params) {
        Log.e("Count " ,""+snapshot.getChildrenCount());
        for (DataSnapshot postSnapshot: snapshot.getChildren()) {
            Product prod = postSnapshot.getValue(Product.class);
            productsSet.add(prod);
        }
        return "Executed";
    }

    @Override
    protected void onPostExecute(String result) {
        RestaurantProductRecyclerViewAdapter restAdapter = new RestaurantProductRecyclerViewAdapter(activity, productsSet);
        RestaurantProductFragment fragment = (RestaurantProductFragment) activity.getFragmentManager().findFragmentById(fragmentId);
        fragment.updateRecycler(restAdapter);
    }

    @Override
    protected void onPreExecute() {}

    @Override
    protected void onProgressUpdate(Void... values) {}
}
