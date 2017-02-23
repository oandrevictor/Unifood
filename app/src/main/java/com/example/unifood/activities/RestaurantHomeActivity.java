package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.firebase.utils.LoadProducts;
import com.example.unifood.firebase.utils.LoadReviews;
import com.example.unifood.models.Product;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.Review;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class RestaurantHomeActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;

    private TabHost tabHost;
    private TabHost.TabSpec spec1, spec2, spec3;

    String restID;
    DatabaseReference restaurantRef;
    DatabaseReference reviewsRef;
    DatabaseReference productsRef;

    private ArrayList<Review> reviewSet = new ArrayList<>();
    private ArrayList<Product> productSet = new ArrayList<>();

    @InjectView(R.id.rest_profile_name) TextView restName;
    @InjectView(R.id.rest_profile_uni) TextView restCampus;
    @InjectView(R.id.rest_profile_local) TextView restLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_home);
        setUpFirebase();
        setUpHostBar();
        ButterKnife.inject(this);

        String userUid = mFirebaseUser.getUid();
        DatabaseReference restIDref = mDatabase.child("users").child(userUid).child("ownerInfo").child("restaurantId");
        restIDref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                restID = dataSnapshot.getValue(String.class);
                restaurantRef = mDatabase.child("restaurants").child(restID);
                loadProfile();
                loadProducts();
                loadReviews();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    private void loadProfile() {
        restaurantRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant rest = dataSnapshot.getValue(Restaurant.class);
                restName.setText(rest.getName());
                restCampus.setText(rest.getCampus());
                restLocal.setText(rest.getLocalization());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    private void loadProducts() {
        productsRef = restaurantRef.child("productList");
        productsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                new LoadProducts(dataSnapshot, productSet, RestaurantHomeActivity.this, R.id.home_restaurant_products).execute();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    private void loadReviews() {
        reviewsRef = restaurantRef.child("reviewList");
        reviewsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                new LoadReviews(dataSnapshot, reviewSet, RestaurantHomeActivity.this, R.id.home_restaurant_reviews).execute();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    private void setUpHostBar(){

        tabHost = (TabHost) findViewById(R.id.restaurantHome_host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Perfil");
        spec1.setIndicator("Perfil");
        spec1.setContent(R.id.home_Tab1);

        spec2 = tabHost.newTabSpec("Cardápio");
        spec2.setIndicator("Cardápio");
        spec2.setContent(R.id.home_tab2);

        spec3 = tabHost.newTabSpec("Avaliações");
        spec3.setIndicator("Avaliações");
        spec3.setContent(R.id.home_tab3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);

    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }
}
