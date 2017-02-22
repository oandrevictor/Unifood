package com.example.unifood.models;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String id;
    private String name;
    private String localization;
    private String shortDescription;
    private String campusId;
    private List<Review> reviewList;
    private List<Product> productList;
    private String userId;

    private final String EMPTY = "";

    public Restaurant() {
        this.id = UUID.randomUUID().toString();
        this.localization = EMPTY;
        this.shortDescription = EMPTY;
        this.userId = EMPTY;
        this.reviewList = new ArrayList<Review>();
        this.productList = new ArrayList<Product>();
    }

    public Restaurant(String name,  String campusId, String localization) {
        this();
        this.name = name;
        this.campusId = campusId;
        this.localization = localization;
    }


    public void addRate(Review review) {
        this.reviewList.add(review);
    }

    private void addProduct(Product product) {
        this.productList.add(product);
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCampusId() {
        return campusId;
    }



    public String getCampus() {
        return campusId;
    }

    public void setCampusId(String campusId1) {
        this.campusId = campusId1;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}