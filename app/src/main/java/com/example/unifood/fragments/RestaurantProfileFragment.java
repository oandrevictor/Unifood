package com.example.unifood.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;


public class RestaurantProfileFragment extends Fragment {
    TextView restaurantName;
    TextView restaurantUni;
    TextView restaurantLocal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurant_profile, container, false);

        restaurantName = (TextView) getView().findViewById(R.id.rest_profile_name);
        restaurantUni = (TextView) getView().findViewById(R.id.rest_profile_uni);
        restaurantLocal = (TextView) getView().findViewById(R.id.rest_profile_local);

        return rootView;
    }

    public void setRestaurantInfo(String name, String uni, String local) {
        restaurantName.setText(name);
        restaurantUni.setText(uni);
        restaurantLocal.setText(local);
    }
}
