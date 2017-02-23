package com.example.unifood.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;


public class RestaurantProfileFragment extends Fragment {
    protected TextView restaurantName;
    protected TextView restaurantCampus;
    protected TextView restaurantLocal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_restaurant_profile, container, false);

        restaurantName = (TextView) rootView.findViewById(R.id.rest_profile_name);
        restaurantCampus = (TextView) rootView.findViewById(R.id.rest_profile_uni);
        restaurantLocal = (TextView) rootView.findViewById(R.id.rest_profile_local);

        return rootView;
    }

}
