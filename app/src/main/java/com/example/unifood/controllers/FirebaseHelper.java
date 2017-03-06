package com.example.unifood.controllers;

import android.util.Log;
import com.example.unifood.models.University;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirebaseHelper {
    private DatabaseReference mDatabase;
    private DatabaseReference ref;
    private University  uni;

    public FirebaseHelper(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public University getUniversity(String uniId1){
        ref = mDatabase.child("universities").child(uniId1);

        ref.addListenerForSingleValueEvent (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                uni = snapshot.getValue(University.class);
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
