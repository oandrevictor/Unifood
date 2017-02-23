package com.example.unifood.firebase.utils;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.unifood.adapters.RestaurantProductRecyclerViewAdapter;
import com.example.unifood.adapters.RestaurantReviewRecyclerViewAdapter;
import com.example.unifood.fragments.RestaurantHomeReviewFragment;
import com.example.unifood.fragments.RestaurantProductFragment;
import com.example.unifood.fragments.RestaurantReviewFragment;
import com.example.unifood.models.Review;
import com.google.firebase.database.DataSnapshot;

import java.util.List;

/**
 * Created by gabml on 22/02/2017.
 */

public class LoadReviews extends AsyncTask<String, Void, String> {
    DataSnapshot snapshot;
    List<Review> reviewsSet;
    AppCompatActivity activity;
    int fragmentId;
    String type;

    public LoadReviews(DataSnapshot snapshot, List<Review> reviewsSet, AppCompatActivity activity, int fragmentId, String type){
        this.reviewsSet = reviewsSet;
        this.snapshot = snapshot;
        this.fragmentId = fragmentId;
        this.activity = activity;
        this.type = type;
    }

    @Override
    protected String doInBackground(String... params) {
        Log.e("Count " ,""+snapshot.getChildrenCount());
        for (DataSnapshot postSnapshot: snapshot.getChildren()) {
            Review rev = postSnapshot.getValue(Review.class);
            reviewsSet.add(rev);
        }
        return "Executed";
    }

    @Override
    protected void onPostExecute(String result) {
        RestaurantReviewRecyclerViewAdapter restAdapter = new RestaurantReviewRecyclerViewAdapter(activity, reviewsSet);
        if (type.equals("student")) {
            RestaurantReviewFragment fragment = (RestaurantReviewFragment) activity.getFragmentManager().findFragmentById(fragmentId);
            fragment.updateRecycler(restAdapter);
        } else if (type.equals("home")) {
            RestaurantHomeReviewFragment fragment = (RestaurantHomeReviewFragment) activity.getFragmentManager().findFragmentById(fragmentId);
            fragment.updateRecycler(restAdapter);
        }
    }

    @Override
    protected void onPreExecute() {}

    @Override
    protected void onProgressUpdate(Void... values) {}
}