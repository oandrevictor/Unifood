package com.example.unifood.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.models.Product;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Locale;
import java.util.regex.Pattern;

import butterknife.ButterKnife;
import butterknife.InjectView;

import static java.lang.String.*;

public class ProductActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private DatabaseReference productListRef;

    private String productId;
    private String restId;

    private Product mProduct;
    private int mProductIndex;

    @InjectView(R.id.product_name_edit) EditText nameField;
    @InjectView(R.id.product_cost_edit) EditText costField;
    @InjectView(R.id.product_description_edit) EditText descriptionField;
    @InjectView(R.id.checkbox_disp) CheckBox checkBoxDisp;
    @InjectView(R.id.update_product_button) Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        setUpFirebase();
        ButterKnife.inject(this);

        loadDatabaseReferences();

        onClickButton();
        onCheckBoxClicked();
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
                            productListRef.child(Integer.toString(mProductIndex)).child("availability").addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(DataSnapshot dataSnapshotx) {
                                    Boolean availability = dataSnapshotx.getValue(Boolean.class);
                                    if (availability) {
                                        checkBoxDisp.setChecked(true);
                                    } else {
                                        checkBoxDisp.setChecked(false);
                                    }
                                }

                                @Override
                                public void onCancelled(DatabaseError databaseError) {

                                }
                            });

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

    private void onCheckBoxClicked() {
        checkBoxDisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // faz nada
            }
        });
    }

    private void updateInfo() {

        String VAZIO = "";
        String prodIndex = Integer.toString(mProductIndex);

        String name = nameField.getText().toString();
        String cost = costField.getText().toString();
        cost = formatCost(cost);
        String description = descriptionField.getText().toString();
        boolean avaliability = checkBoxDisp.isChecked();

        if (!validate(name, cost)) {
            Toast.makeText(getBaseContext(), "Cadastro de produto falhou.", Toast.LENGTH_LONG).show();
            button.setEnabled(true);
            return;
        }

        final ProgressDialog progressDialog = startDialog(getString(R.string.updateDialog), button);

        if (!description.equals(VAZIO)) mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("description").setValue(description);
        if (!name.equals(VAZIO))  mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("name").setValue(name);
        mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("availability").setValue(avaliability);
        mDatabase.child("restaurants").child(restId).child("productList").child(prodIndex).child("cost").setValue(Float.parseFloat(cost), new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError firebaseError, DatabaseReference firebase) {
                if (firebaseError != null) {
                    Toast.makeText(ProductActivity.this, "Produto não atualizado!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(ProductActivity.this, "Produto atualizado.", Toast.LENGTH_SHORT).show();
                }
                finishDialog(progressDialog, button);
            }
        });
        startHomeActivity();
    }

    private String formatCost(String cost) {
        cost = cost.replaceAll(",", ".");
        return cost;
    }

    public void startHomeActivity(){
        Class homeActivity = RestaurantHomeActivity.class;
        Intent goToHome = new Intent(this, homeActivity);
        startActivity(goToHome);
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

    public boolean validate(String prodName, String prodPrice) {
        boolean valid = true;
        if (prodName.isEmpty()) {
            nameField.setError("Um produto precisa de um nome!");
            valid = false;
        } else {
            nameField.setError(null);
        }

        String regexStr = "^\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regexStr);
        System.out.println(prodPrice.matches(String.valueOf(pattern)));
        if (!prodPrice.matches(String.valueOf(pattern))) {
            costField.setError("Formato de preço inválido.");
            valid = false;
        } else {
            costField.setError(null);
        }

        return valid;
    }

}

