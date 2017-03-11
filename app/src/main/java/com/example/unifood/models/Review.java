package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidDateException;
import com.example.unifood.exceptions.InvalidRateException;
import com.example.unifood.exceptions.InvalidRestaurantId;
import com.example.unifood.exceptions.InvalidUserIdException;
import com.example.unifood.exceptions.ReviewException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import static android.R.attr.data;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class Review {

    private String id;
    private String userId;
    private String restaurantId;
    private float rate;
    private String comment;
    private String date;

    private final String EMPTY_COMMENT = "";

    public Review () {
        this.id = UUID.randomUUID().toString();
    }

    public Review(String userId, String restaurantId, float rate, String date) throws ReviewException{
        this();
        validate(userId, restaurantId, rate, date);
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.rate = rate;
        this.date = date;
        this.comment = EMPTY_COMMENT;
    }

    public Review(String userId, String restaurantId, float rate, String comment, String date) throws ReviewException{
        this(userId, restaurantId, rate, date);
        validateComment(comment);
        this.comment = comment;
    }

    private void validate(String userId, String restaurantId, float rate, String date) throws ReviewException
    {
        validateUserId(userId);
        validateRestaurantId(restaurantId);
        validateRate(rate);
        validateDate(date);
    }


    private void validateComment(String comment) throws ReviewException {
        if (comment !=null){
            return;
        }
        throw new ReviewException();
    }

    private void validateUserId(String userId) throws InvalidUserIdException {
        if (userId!=null && userId.length()>0){return;}
        throw new InvalidUserIdException();
    }
    private void validateRestaurantId(String restaurantId) throws InvalidRestaurantId {
        if(restaurantId!=null && restaurantId.length()>0){return;}
        throw new InvalidRestaurantId();
    }
    private void validateRate(float rate) throws InvalidRateException {
        if (rate>=0 && rate <=5) {return;}
        throw new InvalidRateException();
    }
    private void validateDate(String date) throws InvalidDateException {
        if (date!=null&& date.length() >0){return;}
        throw new InvalidDateException();
    }
    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        if (restaurantId != null) {
            this.restaurantId = restaurantId;
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        if (userId != null) {
            this.userId = userId;
        }
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        if (rate >= 0) {
            this.rate = rate;
        }
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        if (comment != null) {
            this.comment = comment;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date != null) {
            this.date = date;
        }
    }

}
