package com.example.unifood.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantReviewRecyclerViewAdapter;
import com.example.unifood.models.Review;
import com.example.unifood.models.Util;

import java.util.List;

import butterknife.InjectView;


public class RestaurantReviewFragment extends Fragment {

    @InjectView(R.id.new_review_comment) EditText newCommentText;
    @InjectView(R.id.new_review_rate) RatingBar newRateStar;
    @InjectView(R.id.new_review_button)  Button newReviewButton;

    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;
    private List<Review> mRestaurantReviewList;

    public RestaurantReviewFragment() {

    }

    public static RestaurantReviewFragment newInstance(int columnCount) {
        RestaurantReviewFragment fragment = new RestaurantReviewFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }

        addListenerRatingBar();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_review_list, container, false);


        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new RestaurantReviewRecyclerViewAdapter(mRestaurantReviewList, mListener));
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void setReviewList(List<Review> reviews) {
        this.mRestaurantReviewList = reviews;
    }

    public void addListenerRatingBar() {
        newReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewReview();
            }
        });
    }

    private void createNewReview() {

        Float newRate = newRateStar.getRating();
        String newComment = newCommentText.getText().toString();

        mListener.newReviewFromFragment(newRate, newComment);
        // TODO: verificar se essa chamada está realmente chamando o método newReview.. na activity
    }

    public interface OnListFragmentInteractionListener {
        void onListFragmentInteraction(Review item);

        void newReviewFromFragment(float newRate, String newComment);
    }

}
