package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.firebase.utils.LoadProducts;
import com.example.unifood.firebase.utils.LoadReviews;
import com.example.unifood.fragments.RestaurantProfileFragment;
import com.example.unifood.models.Product;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.Review;
import com.example.unifood.models.Util;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class RestaurantActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;

    private TabHost tabHost;
    private TabSpec spec1, spec2, spec3;

    DatabaseReference restaurantRef;
    DatabaseReference reviewsRef;
    DatabaseReference productsRef;

    private String restaurantUId;
    private ArrayList<Review> reviewSet = new ArrayList<>();
    private ArrayList<Product> productSet = new ArrayList<>();

    @InjectView(R.id.rest_profile_name) TextView restName;
    @InjectView(R.id.rest_profile_uni) TextView restCampus;
    @InjectView(R.id.rest_profile_local) TextView restLocal;
    @InjectView(R.id.new_review_comment) EditText newCommentText;
    @InjectView(R.id.new_review_rate) RatingBar newRateStar;
    @InjectView(R.id.new_review_button) Button newReviewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        setUpFirebase();
        setUpHostBar();
        ButterKnife.inject(this);

        Intent intentRestaurantSelected = getIntent();
        if (intentRestaurantSelected.hasExtra("REST_ID")) {
            restaurantUId = intentRestaurantSelected.getStringExtra("REST_ID");
        }

        if (restaurantUId != null) {
            restaurantRef = mDatabase.child("restaurants").child(restaurantUId);
            loadProfile();
            loadProducts();
            loadReviews();
        }

        addListenerRatingBar();

    }

    private void loadProfile() {
        restaurantRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant rest = dataSnapshot.getValue(Restaurant.class);
                restName.setText(rest.getName());
                restCampus.setText(rest.getCampusId());
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
                new LoadProducts(dataSnapshot, productSet, RestaurantActivity.this, R.id.restaurant_products, "student").execute();
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
                new LoadReviews(dataSnapshot, reviewSet, RestaurantActivity.this, R.id.restaurant_reviews, "student").execute();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    private void setUpHostBar(){

        tabHost =(TabHost) findViewById(R.id.restaurant_host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Perfil");
        spec1.setIndicator("Perfil");
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

    public void addListenerRatingBar() {
        newReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewReview();
            }
        });
    }

    private void createNewReview() {
        Float newRate = newRateStar.getRating();
        String newComment = newCommentText.getText().toString();
        String newData = Util.getInstancia().getCurrentDate();

        if (!validate(newRate)) {
            Toast.makeText(getBaseContext(), "Por favor, avalie entre 1-5 estrelas", Toast.LENGTH_LONG).show();
            newReviewButton.setEnabled(true);
            return;
        }

        newReviewButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Avaliando...");
        progressDialog.show();

        final Review newReview = new Review(mFirebaseUser.getUid(), restaurantUId, newRate, newComment, newData);

        restaurantRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant restaurant = dataSnapshot.getValue(Restaurant.class);
                List<Review> mReviews = restaurant.getReviewList();
                mReviews.add(newReview);
                restaurantRef.child("reviewList").setValue(mReviews, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                        if (firebaseError != null) {
                            progressDialog.dismiss();
                            Toast.makeText(RestaurantActivity.this, "Avaliação não adicionada!", Toast.LENGTH_SHORT).show();
                        } else {
                            progressDialog.dismiss();
                            Toast.makeText(RestaurantActivity.this, "Restaurante avaliado.", Toast.LENGTH_SHORT).show();
                        }
                        newReviewButton.setEnabled(true);
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });

    }

    private boolean validate(Float newRate) {
        boolean valid = true;

        if (!(newRate > 0)) {
            valid = false;
        }

        return valid;
    }

}