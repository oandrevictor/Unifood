package com.example.unifood.models;

import android.content.Context;
import android.database.Cursor;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Restaurant> favRestaurants;
    private List<Product> favProducts;

    private  Util util;

    public User() {

    }

    public User(String id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.favRestaurants = new ArrayList<Restaurant>();
        this.favProducts = new ArrayList<Product>();
    }

    public void addRestaurantToFavorites(Restaurant restaurant) {
        favRestaurants.add(restaurant);
    }

    public void addProductToFavorites(Product product) {
        favProducts.add(product);
    }

    public void delRestaurantFromFavorites(Restaurant restaurant) {
        if (favRestaurants.contains(restaurant)){
            favProducts.remove(restaurant);
        } else {
            // TODO
        }
    }

    public void delProductFromFavorites(Product product) {
        if (favProducts.contains(product)){
            favProducts.remove(product);
        } else {
            // TODO
        }
    }

    public void rate(int rate, String comment, Restaurant restaurant) {

        this.util = Util.getInstancia();
        String currentDate = util.getCurrentDate();

        Review myRate = new Review(id, rate, comment, currentDate);

        restaurant.addRate(myRate);
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

    public List<Restaurant> getFavRestaurants() {
        return favRestaurants;
    }

    public void setFavRestaurants(List<Restaurant> favRestaurants) {
        this.favRestaurants = favRestaurants;
    }

    public List<Product> getFavProducts() {
        return favProducts;
    }

    public void setFavProducts(List<Product> favProducts) {
        this.favProducts = favProducts;
    }

}
