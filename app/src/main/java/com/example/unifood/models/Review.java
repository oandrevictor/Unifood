package com.example.unifood.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Review {

    private String userId;
    private int rate;
    private String comment;
    private String date;
    private int likes;
    private int dislikes;

    private final String EMPTY_COMMENT = "";

    public Review () {

    }

    public Review(String userId, int rate, String comment, String date) {
        this.userId = userId;
        this.rate = rate;
        this.date = date;
        this.comment = comment;
        this.dislikes = 0;
        this.likes = 0;
    }

    public Review(String userId, int rate, String date) {
        this.userId = userId;
        this.rate = rate;
        this.date = date;
        this.comment = EMPTY_COMMENT;
        this.dislikes = 0;
        this.likes = 0;
    }

    // Getters and Setters

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
