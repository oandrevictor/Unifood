package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by oandrevictor on 22/01/17.
 */

public class Campus {
    private String id;
    private String name;
    private List<String> restaurants;

    public Campus(){
        this.id = UUID.randomUUID().toString();
        this.restaurants = new ArrayList<String>();
    }

    public Campus(String name){
        this();
        this.name = name;
    }

    public String getId(){ return id;}

    public void setId(String id1) {
        if (id1 != null) {
            this.id = id1;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name1) {
        if (name1 != null) {
            this.name = name1;
        }
    }

    public List<String> getRestaurants(){ return restaurants; }

    public void setRestaurants(List<String> restaurants1) {
        if (restaurants1 != null) {
            this.restaurants= restaurants1;
        }
    }

    public boolean addRestaurant(String restaurantId) {
        if (restaurantId != null) {
            return restaurants.add(restaurantId);
        }

        return false;
    }

    public boolean removeRestaurant(String restaurantId) {
        if (restaurantId != null) {
            return restaurants.remove(restaurantId);
        }

        return false;
    }


}
