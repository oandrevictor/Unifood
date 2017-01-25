package com.example.unifood.activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.activities.helpers.UniversityListAdapter;
import com.example.unifood.controllers.FirebaseHelper;
import com.example.unifood.models.University;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.R.attr.name;

public class UniversityActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private DatabaseReference ref;
    private String uniId;
    private University uni;
    private String idListed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        uniId = getIntent().getStringExtra("UNI_ID"); //*Fix for restaurant
        String name;
        name = "Not working yet!";
        idListed = "";
        idListed += uniId;
        idListed += "    ";
        new LoadUniversities().execute();


    }
    protected class LoadUniversities extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            mDatabase = FirebaseDatabase.getInstance().getReference();
            ref = mDatabase.child("universities");
            ref.addListenerForSingleValueEvent (new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    Log.e("Count " ,""+snapshot.getChildrenCount());
                    for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                        University unit = postSnapshot.getValue(University.class);
                        idListed += (unit.getId() + "/n");
                        if (unit.getId().equals(uniId)){
                            uni = unit;
                        }
                    }


                    Log.e("Entrou " ,""+snapshot.getChildrenCount());
                }
                @Override
                public void onCancelled(DatabaseError firebaseError) {
                    Log.e("The read failed: " ,firebaseError.getMessage());
                }
            });
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            //String Uniname = uni.getName();
            TextView restaurantName = (TextView) findViewById(R.id.restaurant_title);
            if (uni == null) {
                restaurantName.setText(idListed);
            }else{restaurantName.setText(uni.getName());}
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}
    }
}
