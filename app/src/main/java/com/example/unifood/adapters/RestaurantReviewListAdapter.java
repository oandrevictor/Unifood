package com.example.unifood.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.activities.ProductActivity;
import com.example.unifood.activities.RestaurantHomeActivity;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.Review;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class RestaurantReviewListAdapter extends RecyclerView.Adapter<RestaurantReviewListAdapter.ViewHolder> {
    private Context mContext;
    private Review review;
    private final List<Review> mReviews;

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;

    private String restaurantId;
    private String userId;

    public RestaurantReviewListAdapter(Context context, List<Review> reviews, String restaurantId) {
        this(context, reviews);
        this.restaurantId = restaurantId;
    }

    public RestaurantReviewListAdapter(Context context, List<Review> reviews) {
        this.mReviews = reviews;
        this.mContext = context;
        setUpFirebase();
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

            if (restaurantId != null) holder.setRestaurantId(restaurantId);
            userId = mFirebaseAuth.getCurrentUser().getUid();
            holder.setCurrentUserId(userId);

            review = mReviews.get(position);
            holder.setReview(review);
            holder.mRate.setText("★" + Math.round(mReviews.get(position).getRate()));
            holder.mDate.setText(mReviews.get(position).getDate());
            holder.mComment.setText(mReviews.get(position).getComment());
            holder.setIndex(position);

        }

    }

    @Override
    public int getItemCount() {
        return mReviews.size();
    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }



    // View Holder CLASS

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final TextView mRate;
        public final TextView mDate;
        public final TextView mComment;

        public Review mReview;

        private String userId;
        private String restaurantId;

        private DatabaseReference commentRef;
        private DatabaseReference rateRef;
        private int index;


        public ViewHolder(View itemView) {
            super(itemView);

            mView = itemView;
            mRate = (TextView) itemView.findViewById(R.id.rest_review_rate);
            mDate = (TextView) itemView.findViewById(R.id.rest_review_date);
            mComment = (TextView) itemView.findViewById(R.id.rest_review_comment);

            mRate.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (userId.equals(mReview.getUserId()))
                        confirmeDelete();

                    return false;
                }
            });

        }

        private void confirmeDelete() {

            AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
            builder.setTitle("Deletar comentário");
            builder.setMessage("Você tem certeza?");

            builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    deleteComment();
                }
            });

            builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // Do nothing
                    dialog.dismiss();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
        }

        private void deleteComment() {

            mReviews.remove(index);

            commentRef = mDatabase.child("restaurants").child(restaurantId).child("reviewList");
            commentRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    dataSnapshot.getRef().setValue(mReviews);
                    calculateRate();
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

            notifyChange();
            Toast.makeText(mContext, "Avaliação deletada.", Toast.LENGTH_SHORT).show();

        }

        private void notifyChange() {
            RestaurantReviewListAdapter.super.notifyDataSetChanged();
        }

        public void setReview(Review review) {
            this.mReview = review;
        }

        public void setCurrentUserId(String userId) {
            this.userId = userId;
        }

        public void setRestaurantId(String restaurantId) {
            this.restaurantId = restaurantId;
        }

        public void setIndex(int position) {
            this.index = position;
        }

        private void calculateRate() {
            final DatabaseReference restaurantRef = mDatabase.child("restaurants").child(restaurantId);
            restaurantRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Restaurant restaurant = dataSnapshot.getValue(Restaurant.class);
                    restaurant.updateRating();
                    Float rate = restaurant.getRate();
                    restaurantRef.child("rate").setValue(rate);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }

}
