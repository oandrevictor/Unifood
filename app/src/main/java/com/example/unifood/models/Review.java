package com.example.unifood.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Review {

    private String id;
    private String userId;
    private String restaurantId;
    private int rate;
    private String comment;
    private String date;
    private int likes;
    private int dislikes;

    private final String EMPTY_COMMENT = "";

    public Review () {
    }



    public Review(String userId, String restaurantId, int rate, String date) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.rate = rate;
        this.date = date;
        this.comment = EMPTY_COMMENT;
        this.dislikes = 0;
        this.likes = 0;
    }

    public Review(String userId, String restaurantId,int rate, String comment, String date) {
        this(userId, restaurantId, rate, date);
        this.comment = comment;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getcomment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

}
