package com.example.unifood.models;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private String email;
    private String password;
    private String localization;
    private String shortDescription;
    private University university;
    private List<Review> reviewList;
    private List<Product> productList;

    private final String EMPTY = new String();

    public Restaurant() {

    }

    public Restaurant(String name, String email, String password, University university) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.university = university;

        this.localization = EMPTY;
        this.shortDescription = EMPTY;
        this.reviewList = new ArrayList<>();
        this.productList = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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