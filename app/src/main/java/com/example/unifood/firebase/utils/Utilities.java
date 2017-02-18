package com.example.unifood.firebase.utils;

import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.unifood.adapters.RestaurantListAdapter;
import com.example.unifood.fragments.RestaurantListFragment;
import com.example.unifood.models.Restaurant;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by oandrevictor on 18/02/17.
 */

public class Utilities {

    public void setUpFirebase(FirebaseAuth mFirebaseAuth, FirebaseUser mFirebaseUser, DatabaseReference mDatabase){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }




}


