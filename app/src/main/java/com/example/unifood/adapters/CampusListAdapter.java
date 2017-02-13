package com.example.unifood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class CampusListAdapter extends RecyclerView.Adapter<CampusListAdapter.RestaurantViewHolder> {

    private List<Restaurant> restaurantList;
    public CampusListAdapter(){}

    /**
     * Constructor for CampusListAdapter that accepts
     * a list with restaraunts of a campus university to display.
     *
     * @param restaurantList List with restaraunts of a campus university
     */
    public CampusListAdapter(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    @Override
    public CampusListAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.campus_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        RestaurantViewHolder viewHolder = new RestaurantViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CampusListAdapter.RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);
        holder.bind(restaurant.getName());

        // TODO Display algo restaurant's icon (image)
    }

    @Override
    public int getItemCount() {
        return this.restaurantList.size();
    }


    // ViewHolder

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView;

        public RestaurantViewHolder(View itemView) {
            super(itemView);

            // TODO Change var's name from tv_item_restaurant for another better
            nameTextView = (TextView) itemView.findViewById(R.id.tv_item_restaurant);
        }

        /**
         * Take a restaurant's name as input and use it to display within a list item.
         * @param restaurantName Position of the item in the list
         */
        void bind(String restaurantName) {
            nameTextView.setText(restaurantName);
        }

    }

}
