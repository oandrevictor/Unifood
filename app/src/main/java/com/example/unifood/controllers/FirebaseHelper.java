package com.example.unifood.controllers;

import android.util.Log;

import com.example.unifood.models.Campus;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.University;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by oandrevictor on 23/01/17.
 */

public class FirebaseHelper {
    private DatabaseReference mDatabase;
    private DatabaseReference ref;
    private University  uni;
    private String uniId;

    public FirebaseHelper(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public University getUniversity(String uniId1){
        this.uniId = uniId1;
        ref = mDatabase.child("universities");

        ref.addListenerForSingleValueEvent (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                University unit = snapshot.getValue(University.class);
                if (unit != null && unit.getId() == uniId){
                    uni = unit;
                }

                Log.e("Entrou " ,""+snapshot.getChildrenCount());
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });


        return uni;
    }



}
