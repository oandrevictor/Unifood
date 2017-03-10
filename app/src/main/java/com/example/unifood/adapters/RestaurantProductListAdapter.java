package com.example.unifood.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.unifood.R;
import com.example.unifood.activities.ProductActivity;
import com.example.unifood.models.Product;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


public class RestaurantProductListAdapter extends RecyclerView.Adapter<RestaurantProductListAdapter.ViewHolder> {
    private Context mContext;
    private Product product;
    private final List<Product> mProducts;

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;

    private boolean isOwner;
    private String type;


    public RestaurantProductListAdapter(Context context, List<Product> products) {
        this.mProducts = products;
        this.mContext = context;
        setUpFirebase();
        isOwner();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_restaurant_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        if (position < mProducts.size()) {
            product = mProducts.get(position);
            holder.setProduct(product);
            holder.mNameView.setText(product.getName());
            if (product.getAvailability()) {
                holder.mCostView.setText(formatDecimal(String.valueOf(product.getCost())) + "  ");
            } else {
                holder.mCostView.setError("Produto indisponível.");
            }
            holder.mDescriptionView.setText(product.getDescription());

            holder.setIsOwner(this.isOwner);

            getRestaurantId(new Callbackable() {
                @Override
                public void doCallback(String restaurantId) {
                    holder.setRestaurantId(restaurantId);
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public static String formatDecimal(String value) {
        NumberFormat df = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return df.format(Double.valueOf(value));
    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    private void isOwner() {
        String userUid = mFirebaseUser.getUid();
        DatabaseReference mTypeRef = mDatabase.child("users").child(userUid).child("userInfo").child("type");
        mTypeRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String TYPE_OWNER = "owner";
                type = dataSnapshot.getValue(String.class);
                isOwner = (type.equals(TYPE_OWNER));
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void getRestaurantId(Callbackable callback) {

        final Callbackable mCallback = callback;

        if (this.isOwner) {
            String userUid = mFirebaseUser.getUid();
            DatabaseReference restaurantRef = mDatabase.child("users").child(userUid).child("ownerInfo").child("restaurantId");
            restaurantRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String restaurantId = dataSnapshot.getValue(String.class);
                    mCallback.doCallback(restaurantId);
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }


    // View Holder CLASS

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mDescriptionView;
        public final TextView mCostView;
        public Product mProduct;
        private boolean isOwner;
        private String restaurantId;


        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mNameView = (TextView) itemView.findViewById(R.id.rest_product_name);
            mDescriptionView = (TextView) itemView.findViewById(R.id.rest_product_description);
            mCostView = (TextView) itemView.findViewById(R.id.rest_product_cost);

            mNameView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isOwner) {
                        startsProductActivity();
                    }
                }
            });
        }

        private void startsProductActivity() {
            Class productActivity = ProductActivity.class;
            Intent intent = new Intent(mContext, productActivity);
            intent.putExtra("ID_EXTRA", new String[] {mProduct.getId(), restaurantId});
            mContext.startActivity(intent);
        }

        private void setProduct(Product prod) {
            this.mProduct = prod;
        }

        public void setIsOwner(boolean flag) {
            this.isOwner = flag;
        }

        public void setRestaurantId(String restaurantId) {
            this.restaurantId = restaurantId;
        }
    }


    // Callback Interface

    public interface Callbackable {
        public void doCallback(String restaurantId);
    }

}
