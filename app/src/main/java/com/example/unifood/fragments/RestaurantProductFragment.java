package com.example.unifood.fragments;

import android.os.Bundle;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantProductRecyclerViewAdapter;

import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RestaurantProductFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_restaurant_product_list, container, false);
        return rootView;
    }

    public void updateRecycler(RestaurantProductRecyclerViewAdapter mAdapter){
        RecyclerView restaurantProductsListRecyclerView = (RecyclerView) getView().findViewById(R.id.product_list);
        restaurantProductsListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantProductsListRecyclerView.setAdapter(mAdapter);
    }
}
