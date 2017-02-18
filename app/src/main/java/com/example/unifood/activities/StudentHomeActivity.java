package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.unifood.R;
import com.example.unifood.firebase.utils.Utilities;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.University;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class StudentHomeActivity extends AppCompatActivity  {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<University> dataSet = new ArrayList<>();
    private ArrayList<Restaurant> restaurantSet = new ArrayList<>();
    private Utilities util;

    private TabHost tabHost;
    private TabSpec spec1,spec2,spec3;

    DatabaseReference ref;
    DatabaseReference restRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        ButterKnife.inject(this);

        util = new Utilities();
        util.setUpFirebase(mFirebaseAuth,mFirebaseUser,mDatabase);

        setUpHostBar();



    }


    private void setUpHostBar(){

        tabHost=(TabHost)findViewById(R.id.host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Favoritas");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Favoritas");

        spec2 = tabHost.newTabSpec("Todas");
        spec2.setIndicator("Todas");
        spec2.setContent(R.id.tab2);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
