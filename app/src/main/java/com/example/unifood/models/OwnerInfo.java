package com.example.unifood.models;

/**
 * Created by gabim on 05/02/2017.
 */

public class OwnerInfo {

    public String getRestaurantId() {
        return restaurantId;
    }

    public OwnerInfo(){

    }

    public OwnerInfo(String restaurantId){
        this.restaurantId = restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    private String restaurantId;
}
