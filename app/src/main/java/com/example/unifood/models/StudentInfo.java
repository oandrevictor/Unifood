package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oandrevictor on 27/01/17.
 */

public class StudentInfo{


    private String campusId;
    private List<String> favRestaurants;
    private List<String> favProducts;

    public StudentInfo() {
        super();
        this.favProducts = new ArrayList<String>();
        this.favRestaurants = new ArrayList<String>();
    }

    public StudentInfo(String campusId) {
        this.campusId = campusId;
        this.favProducts = new ArrayList<String>();
        this.favRestaurants = new ArrayList<String>();
    }


    public void addRestaurantToFavorites(String restaurantId) {
        favRestaurants.add(restaurantId);
    }

    public void addProductToFavorites(String productId) {
        favProducts.add(productId);
    }

    public boolean delRestaurantFromFavorites(String restaurantId) {
        if (favRestaurants.contains(restaurantId)){
            return favProducts.remove(restaurantId);
        } else {
            return false;
        }
    }

    public boolean delProductFromFavorites(String productId) {
        if (favProducts.contains(productId)){
            return favProducts.remove(productId);

        } else {
            return false;
        }
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

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }



}
