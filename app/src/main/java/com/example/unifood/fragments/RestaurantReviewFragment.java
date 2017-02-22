package com.example.unifood.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantReviewRecyclerViewAdapter;


public class RestaurantReviewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_review_list, container, false);
        return view;
    }



    public void updateRecycler(RestaurantReviewRecyclerViewAdapter mAdapter) {
        RecyclerView restaurantReviewListRecyclerView = (RecyclerView) getView().findViewById(R.id.review_list);
        restaurantReviewListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantReviewListRecyclerView.setAdapter(mAdapter);
    }

}
