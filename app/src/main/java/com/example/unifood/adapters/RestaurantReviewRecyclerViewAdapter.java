package com.example.unifood.adapters;

import android.content.Context;
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
    private Context mContext;
    private Review review;
    private final List<Review> mReviews;

    public RestaurantReviewRecyclerViewAdapter(Context context, List<Review> reviews) {
        this.mReviews = reviews;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_restaurant_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        if (position < mReviews.size()) {
            review = mReviews.get(position);
            holder.setReview(review);
            holder.mRate.setText("★" + Math.round(mReviews.get(position).getRate()));
            holder.mDate.setText(mReviews.get(position).getDate());
            holder.mComment.setText(mReviews.get(position).getComment());
        }

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

        public void setReview(Review review) {
            this.mReview = review;
        }
    }

}
