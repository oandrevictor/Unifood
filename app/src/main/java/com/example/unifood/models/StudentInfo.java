package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {


    private String campusId;
    private List<String> favRestaurants;
    private List<String> favProducts;

    public StudentInfo() {
        this.favProducts = new ArrayList<String>();
        this.favRestaurants = new ArrayList<String>();
    }

    public StudentInfo(String campusId) {
        this();
        this.campusId = campusId;
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

}
