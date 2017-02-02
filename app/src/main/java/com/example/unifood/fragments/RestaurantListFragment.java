package com.example.unifood.fragments;

import android.os.Bundle;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantListAdapter;
import com.example.unifood.adapters.UniversityListAdapter;

import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class RestaurantListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_restaurants_list, container, false);
        return rootView;
    }

    public void updateRecycler(RestaurantListAdapter mAdapter){
        RecyclerView restaurantsListRecyclerView = (RecyclerView) getView().findViewById(R.id.restaurants_list);
        restaurantsListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantsListRecyclerView.setAdapter(mAdapter);
    }
}
