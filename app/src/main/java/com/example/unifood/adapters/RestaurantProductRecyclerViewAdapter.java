package com.example.unifood.adapters;

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

    private final List<Product> mProducts;
    private final RestaurantProductFragment.OnListFragmentInteractionListener mListener;

    public RestaurantProductRecyclerViewAdapter(List<Product> products, RestaurantProductFragment.OnListFragmentInteractionListener listener) {
        mProducts = products;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_restaurant_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mProduct = mProducts.get(position);
        holder.mNameView.setText(mProducts.get(position).getName());
        holder.mDescriptionView.setText(mProducts.get(position).getDescription());
        holder.mCostView.setText( Float.toString( mProducts.get(position).getCost() ) );

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mProduct);
                }
            }
        });
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

    }

}
