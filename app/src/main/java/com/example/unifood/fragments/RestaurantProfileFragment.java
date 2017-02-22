package com.example.unifood.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;


public class RestaurantProfileFragment extends Fragment {
    TextView restaurantName;
    TextView restaurantUni;
    TextView restaurantLocal;
    String[] restInfos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            restInfos = bundle.getStringArray("info");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_restaurant_profile, container, false);

        restaurantName = (TextView) rootView.findViewById(R.id.rest_profile_name);
        restaurantName.setText(restInfos[0]);
        restaurantUni = (TextView) rootView.findViewById(R.id.rest_profile_uni);
        restaurantUni.setText(restInfos[1]);
        restaurantLocal = (TextView) getView().findViewById(R.id.rest_profile_local);
        restaurantLocal.setText(restInfos[2]);

        return rootView;
    }

    public void setRestaurantInfo(String name, String uni, String local) {
        restaurantName.setText(name);
        restaurantUni.setText(uni);
        restaurantLocal.setText(local);
    }
}
