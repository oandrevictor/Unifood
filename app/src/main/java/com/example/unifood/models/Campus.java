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

    public void setId(String id1){this.id = id1;}

    public String getName(){
        return name;
    }

    public void setName(String name1){
        this.name = name1;
    }
    public boolean addRestaurant(String restaurantId){
        return restaurants.add(restaurantId);
    }
    public List<String> getRestaurants(){return restaurants;}
    public void setRestaurants(List<String> restaurants1){
        this.restaurants= restaurants1;
    }
    public boolean removeRestaurant(String restaurantId){
        return restaurants.remove(restaurantId);

    }


}
