package com.example.unifood.activities;


import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.database.contracts.UserContract;

/**
 * Created by André  on 20/01/17.
 */

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder>{
    private Cursor mCursor;
    private Context mContext;

    public UserListAdapter(Context context, Cursor cursor) {
        this.mContext = context;
        this.mCursor = cursor;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.user_list_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        // Move the mCursor to the position of the item to be displayed
        if (!mCursor.moveToPosition(position))
            return; // bail if returned null
        String name = mCursor.getString(mCursor.getColumnIndex(UserContract.UserEntry.COLUMN_FIRST_NAME));
        int partySize = mCursor.getInt(mCursor.getColumnIndex(UserContract.UserEntry._ID));

        holder.nameTextView.setText(name);
        holder.partySizeTextView.setText(String.valueOf(partySize));
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
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
