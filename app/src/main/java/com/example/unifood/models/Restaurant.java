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
    private Float rate;

    private final String EMPTY = "";

    public Restaurant() {
        this.id = UUID.randomUUID().toString();
        this.localization = EMPTY;
        this.shortDescription = EMPTY;
        this.userId = EMPTY;
        this.reviewList = new ArrayList<Review>();
        this.productList = new ArrayList<Product>();
        this.rate = 0f;
    }

    public Restaurant(String name,  String campusId, String localization) {
        this();
        this.name = name;
        this.campusId = campusId;
        this.localization = localization;
    }


    public void addReview(Review review) {
        if (review != null) {
            this.reviewList.add(review);
        }
    }

    public boolean removeReview(Review review) {
        if (review != null && this.reviewList.contains(review)) {
            return this.reviewList.remove(review);
        }

        return false;
    }

    public void addProduct(Product product) {
        if (product != null) {
            this.productList.add(product);
        }
    }

    public boolean removeProduct(Product product) {
        if (product != null && this.productList.contains(product)) {
            return this.productList.remove(product);
        }

        return false;
    }

    public void updateRating() {
        float restRate = 0f;
        for (Review r: reviewList) {
            restRate += r.getRate();
        }

        if (reviewList.size() > 0) {
            this.rate = restRate / reviewList.size();
        } else {
            this.rate = restRate;
        }
    }


    // Getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        if (localization != null) {
            this.localization = localization;
        }
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        if (shortDescription != null) {
            this.shortDescription = shortDescription;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId1) {
        if (campusId1 != null) {
            this.campusId = campusId1;
        }
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        if (reviewList != null) {
            this.reviewList = reviewList;
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        if (productList != null) {
            this.productList = productList;
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

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate1) {
        if (rate1 >= 0) {
            this.rate = rate1;
        }
    }
    @Override
    public boolean equals(Object o){
        if (o!=null){
           if (o instanceof Restaurant){
               Restaurant r2 = (Restaurant) o;
               return r2.getId().equals(this.getId());
            }
        }
        return false;
    }
    public void update(Restaurant r){
        this.name = r.getName();
        this.localization = r.getLocalization();
        this.reviewList = r.getReviewList();
        this.rate = r.rate;
    }

}