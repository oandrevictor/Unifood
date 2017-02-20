package com.example.unifood.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.unifood.R;
import com.example.unifood.firebase.utils.Utilities;
import com.example.unifood.models.Product;
import com.example.unifood.models.Review;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<Review> reviewSet = new ArrayList<>();
    private ArrayList<Product> productSet = new ArrayList<>();

    private Utilities util;

    private TabHost tabHost;
    private TabSpec spec1, spec2, spec3;

    DatabaseReference profileRef;
    DatabaseReference reviewsRef;
    DatabaseReference productsRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        setUpFirebase();
        setUpHostBar();

        loadProfile();
        loadReviews();
        loadProducts();

    }

    private void loadProfile() {
        profileRef = mDatabase.child("restaurants");
    }

    private void loadReviews() {
        reviewsRef = mDatabase.child("reviews");

    }

    private void loadProducts() {
        productsRef = mDatabase.child("products");
    }

    @Override
    public void onBackPressed() {
    }

    private void setUpHostBar(){

        tabHost =(TabHost)findViewById(R.id.host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Informações");
        spec1.setIndicator("Informações");
        spec1.setContent(R.id.tab1);

        spec2 = tabHost.newTabSpec("Cardápio");
        spec2.setIndicator("Cardápio");
        spec2.setContent(R.id.tab2);

        spec3 = tabHost.newTabSpec("Avaliações");
        spec3.setIndicator("Avaliações");
        spec3.setContent(R.id.tab3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);

    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
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
