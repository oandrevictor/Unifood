package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oandrevictor on 22/01/17.
 */

public class Campus {
    private String id;
    private String name;
    private List<Restaurant> restaurants;

    public Campus(){
        this.restaurants = new ArrayList<Restaurant>();
    }

    public Campus(String id, String name){
        this();
        this.name = name;
        this.id = id;
    }
    public String getId(){ return id;}
    public void setId(String id1){this.id = id1;}

    public String getName(){
        return name;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public boolean addRestaurant(Restaurant restaurant){
        return restaurants.add(restaurant);
    }
    public List<Restaurant> getRestaurants(){return restaurants;}
    public void setRestaurants(List<Restaurant> restaurants1){
        this.restaurants= restaurants1;
    }
    public boolean removeRestaurant(Restaurant restaurant){
        return restaurants.remove(restaurant);
    }


}
