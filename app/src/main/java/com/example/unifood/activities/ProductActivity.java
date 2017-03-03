package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private int mProductIndex;

    @InjectView(R.id.product_name_edit) TextView nameField;
    @InjectView(R.id.product_cost_edit) TextView costField;
    @InjectView(R.id.product_description_edit) TextView descriptionField;
    @InjectView(R.id.update_product_button) Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        setUpFirebase();
        ButterKnife.inject(this);

        loadDatabaseReferences();

        onClickButton();

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
                    int index = 0;
                    for (DataSnapshot prodSnapshot: dataSnapshot.getChildren()) {
                        mProduct = prodSnapshot.getValue(Product.class);
                        if (mProduct.getId().equals(productId)) {
                            mProductIndex = index;
                            nameField.setText(mProduct.getName());
                            costField.setText(Float.toString(mProduct.getCost()));
                            descriptionField.setText(mProduct.getDescription());
                        }
                        index++;
                    } // ends for

                }
                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }

    private void onClickButton() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateInfo();
            }
        });
    }

    private void updateInfo() {

        String VAZIO = "";
        String prodIndex = Integer.toString(mProductIndex);

        String name = nameField.getText().toString();
        String cost = costField.getText().toString();
        cost = cost.replaceAll(",", ".");
        String description = descriptionField.getText().toString();

        updatingDialog();

        if (!description.equals(VAZIO)) mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("description").setValue(description);
        if (!name.equals(VAZIO))  mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("name").setValue(name);
        mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("cost").setValue(Float.parseFloat(cost));
    }

    private void updatingDialog() {
        button.setEnabled(false);
        final ProgressDialog progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Atualizando.");
        progressDialog.show();
    }

}

