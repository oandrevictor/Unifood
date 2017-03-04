package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantProductListAdapter;
import com.example.unifood.adapters.RestaurantReviewListAdapter;
import com.example.unifood.fragments.RestaurantHomeProductFragment;
import com.example.unifood.fragments.RestaurantHomeReviewFragment;
import com.example.unifood.models.Campus;
import com.example.unifood.models.Product;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.Review;

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
import java.util.regex.Pattern;

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
    private RestaurantReviewListAdapter reviewAdapter;
    private ArrayList<Product> productSet = new ArrayList<>();
    private RestaurantProductListAdapter productAdapter;

    @InjectView(R.id.rest_profile_name) TextView restName;
    @InjectView(R.id.rest_profile_uni) TextView restCampus;
    @InjectView(R.id.rest_profile_local) TextView restLocal;
    @InjectView(R.id.rest_profile_rating) TextView restRate;
    @InjectView(R.id.product_name) EditText productName;
    @InjectView(R.id.product_price) EditText productPrice;
    @InjectView(R.id.product_description) EditText productDescription;
    @InjectView(R.id.new_product_button) Button newProductButton;

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
                if (restID != null) {

                    restaurantRef = mDatabase.child("restaurants").child(restID);
                    loadProfile();
                    loadProducts();
                    loadReviews();

                    RestaurantHomeProductFragment fragment = (RestaurantHomeProductFragment) getFragmentManager().findFragmentById(R.id.home_restaurant_products);
                    productAdapter = new RestaurantProductListAdapter(RestaurantHomeActivity.this, productSet);
                    fragment.updateRecycler(productAdapter);

                    RestaurantHomeReviewFragment fragment2 = (RestaurantHomeReviewFragment) getFragmentManager().findFragmentById(R.id.home_restaurant_reviews);
                    reviewAdapter = new RestaurantReviewListAdapter(RestaurantHomeActivity.this, reviewSet);
                    fragment2.updateRecycler(reviewAdapter);

                    addListenerNewProduct();
                } else {
                    finish();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_rest, menu);
        return true;
    }

    private void loadProfile() {
        restaurantRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant rest = dataSnapshot.getValue(Restaurant.class);
                restName.setText(rest.getName());
                mDatabase.child("campus").child(rest.getCampusId()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshotx) {
                        Campus campus = dataSnapshotx.getValue(Campus.class);
                        restCampus.setText("Campus: " + campus.getName());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                restLocal.setText(rest.getLocalization());
                String rate = Float.toString(rest.getRate());
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

    public void addListenerNewProduct() {
        newProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewProduct();
            }
        });
    }

    private void createNewProduct() {
        String name = productName.getText().toString();
        String price = productPrice.getText().toString();
        price = price.replaceAll(",", ".");
        String description = productDescription.getText().toString();

        if (!validate(name, price)) {
            Toast.makeText(getBaseContext(), "Cadastro de produto falhou.", Toast.LENGTH_LONG).show();
            newProductButton.setEnabled(true);
            return;
        }

        newProductButton.setEnabled(false);

        final ProgressDialog progressDialog = startDialog(getString(R.string.addProductDialog), newProductButton);

        final Product newProduct = new Product(name, Float.parseFloat(price), description);

        restaurantRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Restaurant restaurant = dataSnapshot.getValue(Restaurant.class);
                List<Product> mProducts = restaurant.getProductList();
                mProducts.add(newProduct);
                restaurantRef.child("productList").setValue(mProducts, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                        if (firebaseError != null) {
                            progressDialog.dismiss();
                            Toast.makeText(RestaurantHomeActivity.this, "Produto não adicionado!", Toast.LENGTH_SHORT).show();

                        } else {
                            progressDialog.dismiss();
                            Toast.makeText(RestaurantHomeActivity.this, "Produto adicionado.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                finishDialog(progressDialog, newProductButton);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }

        });
        clearTextViews();
    }

    public boolean validate(String prodName, String prodPrice) {
        boolean valid = true;
        if (prodName.isEmpty()) {
            productName.setError("Um produto precisa de um nome!");
            valid = false;
        } else {
            productName.setError(null);
        }

        String regexStr = "^\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regexStr);
        System.out.println(prodPrice.matches(String.valueOf(pattern)));
        if (!prodPrice.matches(String.valueOf(pattern))) {
            productPrice.setError("Formato de preço inválido.");
            valid = false;
        } else {
            productPrice.setError(null);
        }

        return valid;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.user_update) {
            startEditActivity();
            return true;
        }
        else if(id == R.id.user_logout){

            mFirebaseAuth.signOut(); // SignOut of Firebase
            startLogInActivity();
            return true;
        }
        else if(id == R.id.user_delete){

            startDeleteActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void clearTextViews() {
        productName.getText().clear();
        productPrice.getText().clear();
        productDescription.getText().clear();

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

    private void startEditActivity(){
        Class editActivity = RestaurantEditActivity.class;
        Intent goToEdit = new Intent(this, editActivity);
        goToEdit.putExtra("REST_ID", restID);
        startActivity(goToEdit);
    }

    private void startLogInActivity() {
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(this, loginActivity);
        startActivity(goToLogin);
        finish();
    }

    private void startDeleteActivity(){
        Class deleteActivity = RestaurantDeleteActivity.class;
        Intent goToEdit = new Intent(this, deleteActivity);
        goToEdit.putExtra("REST_ID", restID);
        startActivity(goToEdit);
    }

}
