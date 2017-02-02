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
import com.example.unifood.activities.UniversityActivity;
import com.example.unifood.models.University;

import java.util.ArrayList;

/**
 * Created by André  on 20/01/17.
 */

public class UniversityListAdapter extends RecyclerView.Adapter<UniversityListAdapter.UniversityViewHolder>{
    private Context mContext;
    private ArrayList<University> unis;
    private University u;

    public UniversityListAdapter(Context context, ArrayList<University> unis) {
        this.mContext = context;
        this.unis =unis;
    }

    @Override
    public UniversityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.user_list_item, parent, false);
        return new UniversityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UniversityViewHolder holder, int i) {
        // Move the mCursor to the position of the item to be displayed
        if (i<unis.size()) {
            u = unis.get(i);
            holder.setUniversity(u);
            holder.nameTextView.setText(u.getName());
        }

    }

    @Override
    public int getItemCount() {
        return unis.size();
    }

    /**
     * Inner class to hold the views needed to display a single item in the recycler-view
     */
    class UniversityViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView partySizeTextView;
        Button openButton;
        University university;

        /**
         * Constructor for our ViewHolder. Within this constructor, we get a reference to our
         * TextViews
         *
         * @param itemView The View that you inflated in
         *                 {@link UniversityListAdapter#onCreateViewHolder(ViewGroup, int)}
         */
        public UniversityViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.university_title_text);
            openButton = (Button)itemView.findViewById(R.id.open_item_button);
            openButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //* we are actually open the restaurant view, but thats a detail;
                    Class universityActivity = UniversityActivity.class;
                    Intent intent = new Intent(mContext, universityActivity);
                    intent.putExtra("UNI_ID", university.getId());
                    mContext.startActivity(intent);
                }
            });

        }
        public void setUniversity(University university1){
            this.university = university1;
        }

    }
}
