package com.example.unifood.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.models.Product;
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

public class ProductActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private DatabaseReference productListRef;

    private String productId;
    private String restId;

    private Product mProduct;

    @InjectView(R.id.product_name_edit) TextView nameField;
    @InjectView(R.id.product_cost_edit) TextView costField;
    @InjectView(R.id.product_description_edit) TextView descriptionField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        setUpFirebase();
        ButterKnife.inject(this);

        loadDatabaseReferences();

    }

    private void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    private void loadDatabaseReferences() {
        Intent intentProductSelected = getIntent();

        if (intentProductSelected.hasExtra("ID_EXTRA")) {
            String[] extra = getIntent().getStringArrayExtra("ID_EXTRA");

            productId = extra[0];
            restId = extra[1];
        }

        if (productId != null && restId != null) {

            productListRef = mDatabase.child("restaurants").child(restId).child("productList");

            productListRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    for (DataSnapshot prodSnapshot: dataSnapshot.getChildren()) {
                        mProduct = prodSnapshot.getValue(Product.class);
                        if (mProduct.getId().equals(productId)) {
                            nameField.setText(mProduct.getName());
                            costField.setText(Float.toString(mProduct.getCost()));
                            descriptionField.setText(mProduct.getDescription());
                        }
                    }

                }
                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }

}

