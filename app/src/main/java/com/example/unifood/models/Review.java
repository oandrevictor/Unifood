package com.example.unifood.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Review {

    private String id;
    private String userId;
    private String restaurantId;
    private float rate;
    private String comment;
    private String date;
    private int likes;
    private int dislikes;

    private final String EMPTY_COMMENT = "";

    public Review () {
        this.id = UUID.randomUUID().toString();
        this.dislikes = 0;
        this.likes = 0;
    }



    public Review(String userId, String restaurantId, float rate, String date) {
        this();
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.rate = rate;
        this.date = date;
        this.comment = EMPTY_COMMENT;
    }

    public Review(String userId, String restaurantId, float rate, String comment, String date) {
        this(userId, restaurantId, rate, date);
        this.comment = comment;
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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        if (likes >= 0) {
            this.likes = likes;
        }
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        if (dislikes >= 0) {
            this.dislikes = dislikes;
        }
    }

}
