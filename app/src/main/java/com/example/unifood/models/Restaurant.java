package com.example.unifood.models;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String id;
    private String name;
    private String localization;
    private String shortDescription;
    private String universityId;
    private List<String> reviewList;
    private List<String> productList;

    private final String EMPTY = new String();

    public Restaurant() {
        this.id = UUID.randomUUID().toString();;
        this.reviewList = new ArrayList<String>();
        this.productList = new ArrayList<String >();
    }

    public Restaurant(String name,  String universityId) {
        this();
        this.name = name;
        this.universityId = universityId;

        this.localization = EMPTY;
        this.shortDescription = EMPTY;
        this.reviewList = new ArrayList<>();
        this.productList = new ArrayList<>();
    }
    public String getId(){return id;}
    public void setId(String newId){this.id= newId;}

    public void addRate(String reviewId) {
        this.reviewList.add(reviewId);
    }

    private void addProduct(String productId) {
        this.productList.add(productId);
    }

    private void removeProduct(String productId) {
        this.productList.remove(productId);
    }

    private Product getProduct(String id) {
        // TODO
        // an idea:

        Product tempProduct = null;

        for (String product:productList) {
            if (product.equals(id)) {
                //return product;
            }
        }

        return tempProduct;
    }

    private void editProduct() {
        // TODO
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

    public String getUniversity() {
        return universityId;
    }

    public void setUniversity(String universityId) {
        this.universityId = universityId;
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

}