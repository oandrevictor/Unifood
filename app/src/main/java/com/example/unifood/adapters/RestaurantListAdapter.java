package com.example.unifood.adapters;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.activities.RestaurantActivity;
import com.example.unifood.activities.UniversityActivity;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.University;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static com.example.unifood.R.string.university;


public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder>{
    private Context mContext;
    private ArrayList<Restaurant> restaurants;
    private Restaurant rst;

    public RestaurantListAdapter(Context context, ArrayList<Restaurant> restaurants) {
        this.mContext = context;
        this.restaurants = restaurants;
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_restaurant_list, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int i) {
        // Move the mCursor to the position of the item to be displayed
        if (i< restaurants.size()) {
            rst = restaurants.get(i);
            holder.setRestaurant(rst);
            holder.titleTextView.setText(rst.getName());
            holder.localizationTextView.setText(rst.getLocalization());
            holder.rating.setText(String.format("%.2f", rst.getRate()));
        }

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    /**
     * Inner class to hold the views needed to display a single item in the recycler-view
     */
    class RestaurantViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView rating;
        TextView localizationTextView;
        Restaurant restaurant;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.restaurant_item_title);
            rating = (TextView) itemView.findViewById(R.id.restaurant_rating_value);
            localizationTextView = (TextView) itemView.findViewById(R.id.restaurant_item_location);
            titleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //* we are actually open the restaurant view, but thats a detail;
                    Class restaurantActivity = RestaurantActivity.class;
                    Intent intent = new Intent(mContext, restaurantActivity);
                    intent.putExtra("REST_ID", restaurant.getId());
                    mContext.startActivity(intent);
                }
            });

        }
        public void setRestaurant(Restaurant restaurant1){
            this.restaurant = restaurant1;
        }

    }
}
