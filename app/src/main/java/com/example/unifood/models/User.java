package com.example.unifood.models;

import android.content.Context;
import android.database.Cursor;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<String> favRestaurants;
    private List<String> favProducts;

    private  Util util;

    public User() {
        this.id = UUID.randomUUID().toString();;
        this.favProducts = new ArrayList<String>();
        this.favRestaurants = new ArrayList<String>();
    }

    public User(String id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.favRestaurants = new ArrayList<String>();
        this.favProducts = new ArrayList<String>();
    }

    public void addRestaurantToFavorites(String restaurantId) {
        favRestaurants.add(restaurantId);
    }

    public void addProductToFavorites(String productId) {
        favProducts.add(productId);
    }

    public void delRestaurantFromFavorites(String restaurantId) {
        if (favRestaurants.contains(restaurantId)){
            favProducts.remove(restaurantId);
        } else {
            // TODO
        }
    }

    public void delProductFromFavorites(String productId) {
        if (favProducts.contains(productId)){
            favProducts.remove(productId);
        } else {
            // TODO
        }
    }

    public void rate(int rate, String comment, Restaurant restaurant) {

        this.util = Util.getInstancia();
        String currentDate = util.getCurrentDate();

        Review myRate = new Review(id, rate, comment, currentDate);

        restaurant.addRate(myRate.getId());
    }

    public void editReview(Restaurant restaurant) {
        //TODO
    }



    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFavRestaurants() {
        return favRestaurants;
    }

    public void setFavRestaurants(List<String> favRestaurants) {
        this.favRestaurants = favRestaurants;
    }

    public List<String> getFavProducts() {
        return favProducts;
    }

    public void setFavProducts(List<String> favProducts) {
        this.favProducts = favProducts;
    }

}
