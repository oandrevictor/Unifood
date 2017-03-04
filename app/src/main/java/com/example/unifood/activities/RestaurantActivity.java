package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantProductListAdapter;
import com.example.unifood.adapters.RestaurantReviewListAdapter;
import com.example.unifood.fragments.RestaurantProductFragment;
import com.example.unifood.fragments.RestaurantReviewFragment;
import com.example.unifood.models.Product;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.Review;
import com.example.unifood.models.StudentInfo;
import com.example.unifood.models.Util;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
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
    DatabaseReference studentInfoRef;

    private String restaurantUId;
    private ArrayList<Review> reviewSet = new ArrayList<>();
    RestaurantReviewListAdapter reviewAdapter;
    private ArrayList<Product> productSet = new ArrayList<>();
    RestaurantProductListAdapter productAdapter;

    @InjectView(R.id.rest_profile_name) TextView restName;
    @InjectView(R.id.rest_profile_uni) TextView restCampus;
    @InjectView(R.id.rest_profile_local) TextView restLocal;
    @InjectView(R.id.rest_profile_rating) TextView restRate;
    @InjectView(R.id.new_review_comment) EditText newCommentText;
    @InjectView(R.id.new_review_rate) RatingBar newRateStar;
    @InjectView(R.id.new_review_button) Button newReviewButton;
    @InjectView(R.id.favButton) FloatingActionButton favButton;

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

            RestaurantProductFragment fragment = (RestaurantProductFragment) getFragmentManager().findFragmentById(R.id.restaurant_products);
            productAdapter = new RestaurantProductListAdapter(this, productSet);
            fragment.updateRecycler(productAdapter);

            RestaurantReviewFragment fragment2 = (RestaurantReviewFragment) getFragmentManager().findFragmentById(R.id.restaurant_reviews);
            reviewAdapter = new RestaurantReviewListAdapter(this, reviewSet);
            fragment2.updateRecycler(reviewAdapter);
        }

        listenerRatingBar();
    }

    @Override
    protected void onResume() {
        super.onResume();

        listenerFavButton();
    }

    private void loadProfile() {
        restaurantRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant rest = dataSnapshot.getValue(Restaurant.class);
                restName.setText(rest.getName());
                restCampus.setText("Campus: " + rest.getCampusId());
                restLocal.setText(rest.getLocalization());
                String rate = String.format("%.2f", rest.getRate());
                restRate.setText("Avaliação: " + rate);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    private void loadProducts() {
        productsRef = restaurantRef.child("productList");
        productsRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Product product = dataSnapshot.getValue(Product.class);
                productSet.add(product);
                productAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void loadReviews() {
        reviewsRef = restaurantRef.child("reviewList");
        reviewsRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Review review = dataSnapshot.getValue(Review.class);
                reviewSet.add(review);
                reviewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void setUpHostBar(){

        tabHost =(TabHost) findViewById(R.id.restaurant_host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Perfil");
        spec1.setIndicator("Perfil");
        spec1.setContent(R.id.tab_1);

        spec2 = tabHost.newTabSpec("Cardápio");
        spec2.setIndicator("Cardápio");
        spec2.setContent(R.id.tab_2);

        spec3 = tabHost.newTabSpec("Avaliações");
        spec3.setIndicator("Avaliações");
        spec3.setContent(R.id.tab_3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);

    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public void listenerRatingBar() {
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

        final ProgressDialog progressDialog = startDialog(getString(R.string.reviewDialog), newReviewButton);

        final Review newReview = new Review(mFirebaseUser.getUid(), restaurantUId, newRate, newComment, newData);

        restaurantRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant restaurant = dataSnapshot.getValue(Restaurant.class);
                List<Review> mReviews = restaurant.getReviewList();
                mReviews.add(newReview);
                restaurant.updateRating();
                Float rate = restaurant.getRate();
                restaurantRef.child("rate").setValue(rate);
                restaurantRef.child("reviewList").setValue(mReviews, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                        if (firebaseError != null) {
                            Toast.makeText(RestaurantActivity.this, "Avaliação não adicionada!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(RestaurantActivity.this, "Restaurante avaliado.", Toast.LENGTH_SHORT).show();
                        }
                        finishDialog(progressDialog, newReviewButton);
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        clearTextViews();
    }

    private boolean validate(Float newRate) {
        boolean valid = true;

        if (!(newRate > 0)) {
            valid = false;
        }

        return valid;
    }

    private void listenerFavButton() {
        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoritingRestaurant();
            }
        });
    }

    private void favoritingRestaurant() {

        String userUid = mFirebaseUser.getUid();
        studentInfoRef = mDatabase.child("users").child(userUid).child("studentInfo");

        studentInfoRef.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                StudentInfo student = dataSnapshot.getValue(StudentInfo.class);

                final List<String> mFavRest = student.getFavRestaurants();

                if (mFavRest.contains(restaurantUId)) {
                    //favButton.setBackgroundResource(R.drawable.staroff);
                    removeFavRestDialog(mFavRest);
                } else {
                    mFavRest.add(restaurantUId);
                    //favButton.setBackgroundResource(R.drawable.staron);
                    studentInfoRef.child("favRestaurants").setValue(mFavRest);
                    Toast.makeText(RestaurantActivity.this, "Restaurante adicionado aos favoritos.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    private void removeFavRestDialog(final List<String> mFavRest) {
        AlertDialog.Builder builder = new AlertDialog.Builder(RestaurantActivity.this);
        builder.setTitle("Remover favorito");
        builder.setMessage("O restaurante já está na sua lista de favoritos. Deseja remove-lo?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                mFavRest.remove(restaurantUId);
                studentInfoRef.child("favRestaurants").setValue(mFavRest);
                Toast.makeText(RestaurantActivity.this, "Restaurante removido dos favoritos.", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do nothing
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    private void clearTextViews() {
        newCommentText.getText().clear();
        newRateStar.clearAnimation();
    }

    private ProgressDialog startDialog(String message, Button bt) {
        bt.setEnabled(false);
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(message);
        progressDialog.show();

        return progressDialog;
    }

    private void finishDialog(ProgressDialog pg, Button bt) {
        pg.dismiss();
        bt.setEnabled(true);
    }

}