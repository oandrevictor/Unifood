package com.example.unifood.models;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String name;
    private String localization;
    private String shortDescription;
    private String campusId;
    private List<String> reviewList;
    private List<String> productList;
    private String userId;

    private final String EMPTY = "";

    public Restaurant() {
        this.localization = EMPTY;
        this.shortDescription = EMPTY;
        this.userId = EMPTY;
        this.reviewList = new ArrayList<String>();
        this.productList = new ArrayList<String >();
    }

    public Restaurant(String name,  String campusId, String localization) {
        this();
        this.name = name;
        this.campusId = campusId;
	    this.localization = localization;
	}


    public void addRate(String reviewId) {
        this.reviewList.add(reviewId);
    }

    private void addProduct(String productId) {
        this.productList.add(productId);
    }

    private void removeProduct(String productId) {
        this.productList.remove(productId);
    }

 
    // Getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCampus() {
        return campusId;
    }

    public void setCampusId(String campusId1) {
        this.campusId = campusId1;
    }

    public List<String> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<String> reviewList) {
        this.reviewList = reviewList;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
