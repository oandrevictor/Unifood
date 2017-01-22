package com.example.unifood.activities.helpers;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.models.University;

import java.util.ArrayList;

/**
 * Created by André  on 20/01/17.
 */

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder>{
    private Context mContext;
    private ArrayList<University> unis;

    public UserListAdapter(Context context, ArrayList<University> unis) {
        this.mContext = context;
        this.unis =unis;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.user_list_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int i) {
        // Move the mCursor to the position of the item to be displayed
        if (i<unis.size()) {
            University u = unis.get(i);
            holder.nameTextView.setText(u.getName());
            holder.partySizeTextView.setText(u.getId());
        }



    }

    @Override
    public int getItemCount() {
        return unis.size();
    }

    /**
     * Inner class to hold the views needed to display a single item in the recycler-view
     */
    class UserViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView partySizeTextView;

        /**
         * Constructor for our ViewHolder. Within this constructor, we get a reference to our
         * TextViews
         *
         * @param itemView The View that you inflated in
         *                 {@link UserListAdapter#onCreateViewHolder(ViewGroup, int)}
         */
        public UserViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.name_text_view);
            partySizeTextView = (TextView) itemView.findViewById(R.id.university_text_view);
        }

    }
}
