package com.example.unifood.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class RestaurantProfileFragment extends Fragment {
    @InjectView(R.id.rest_profile_name) TextView restaurantName;
    @InjectView(R.id.rest_profile_uni) TextView restaurantUni;
    @InjectView(R.id.rest_profile_local) TextView restaurantLocal;
    String[] restInfos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null) {
            restInfos = bundle.getStringArray("rInfos");
            restaurantName.setText(restInfos[0]);
            restaurantUni.setText(restInfos[1]);
            restaurantLocal.setText(restInfos[2]);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_restaurant_profile, container, false);
        ButterKnife.inject(rootView);
        return rootView;
    }

}
