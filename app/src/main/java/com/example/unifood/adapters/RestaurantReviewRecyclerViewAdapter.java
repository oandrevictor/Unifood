package com.example.unifood.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.fragments.RestaurantReviewFragment;
import com.example.unifood.models.Review;

import java.util.List;


public class RestaurantReviewRecyclerViewAdapter extends RecyclerView.Adapter<RestaurantReviewRecyclerViewAdapter.ViewHolder> {

    private final List<Review> mReviews;
    private final RestaurantReviewFragment.OnListFragmentInteractionListener mListener;

    public RestaurantReviewRecyclerViewAdapter(List<Review> reviews, RestaurantReviewFragment.OnListFragmentInteractionListener listener) {
        mReviews = reviews;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_restaurant_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mReview = mReviews.get(position);
        holder.mRate.setText( Float.toString( mReviews.get(position).getRate() ) );
        holder.mDate.setText(mReviews.get(position).getDate());
        holder.mComment.setText(mReviews.get(position).getComment());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mReview);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mReviews.size();
    }



    // View Holder CLASS

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mRate;
        public final TextView mDate;
        public final TextView mComment;
        public Review mReview;


        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mRate = (TextView) itemView.findViewById(R.id.rest_review_rate);
            mDate = (TextView) itemView.findViewById(R.id.rest_review_date);
            mComment = (TextView) itemView.findViewById(R.id.rest_review_comment);

        }

    }
}
