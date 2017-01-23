package com.example.unifood.models;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private List<String> favRestaurants;
    private List<String> favProducts;

    private  Util util;

    public User() {
        this.id = UUID.randomUUID().toString();;
        this.favProducts = new ArrayList<String>();
        this.favRestaurants = new ArrayList<String>();

    }

    public User(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
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
            return false;
        }
    }

    public void delProductFromFavorites(String productId) {
        if (favProducts.contains(productId)){
            favProducts.remove(productId);

        } else {
            return false;
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
