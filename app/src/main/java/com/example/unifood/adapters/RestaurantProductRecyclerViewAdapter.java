package com.example.unifood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.unifood.R;
import com.example.unifood.fragments.RestaurantProductFragment;
import com.example.unifood.models.Product;
import java.util.List;


public class RestaurantProductRecyclerViewAdapter extends RecyclerView.Adapter<RestaurantProductRecyclerViewAdapter.ViewHolder> {
    private Context mContext;
    private final List<Product> mProducts;
    private Product product;

    public RestaurantProductRecyclerViewAdapter(Context context, List<Product> products) {
        mProducts = products;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_restaurant_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        if (position < mProducts.size()) {
            product = mProducts.get(position);
            holder.setProduct(product);
            holder.mNameView.setText(product.getName());
            holder.mCostView.setText((int) product.getCost());
            holder.mDescriptionView.setText(product.getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }



    // View Holder CLASS

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mDescriptionView;
        public final TextView mCostView;
        public Product mProduct;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mNameView = (TextView) itemView.findViewById(R.id.rest_product_name);
            mDescriptionView = (TextView) itemView.findViewById(R.id.rest_product_description);
            mCostView = (TextView) itemView.findViewById(R.id.rest_product_cost);
        }

        private void setProduct(Product prod) {
            this.mProduct = prod;
        }

    }



}
