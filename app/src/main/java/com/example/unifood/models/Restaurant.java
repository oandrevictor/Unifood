package com.example.unifood.models;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String id;
    private String name;
    private String localization;
    private String shortDescription;
    private University university;
    private List<Review> reviewList;
    private List<Product> productList;

    private final String EMPTY = "";

    public Restaurant() {
        id = UUID.randomUUID().toString();
        this.localization = EMPTY;
        this.shortDescription = EMPTY;
        this.reviewList = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    public Restaurant(String name,  University university) {
        this();
        this.name = name;
        this.university = university;
    }

    public String getId(){
        return id;
    }

    public void setId(String id1) {
        this.id= id1;
    }

    public void addRate(Review review) {
        this.reviewList.add(review);
    }

    private void addProduct(Product product) {
        this.productList.add(product);
    }

    private void removeProduct(String id) {
        Product removedProduct = getProduct(id);
        this.productList.remove(removedProduct);
    }

    private Product getProduct(String id) {
        // TODO
        // an idea:

        Product tempProduct = null;

        for (Product product:productList) {
            if (product.getId().equals(id)) {
                return product;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
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

}