package com.example.unifood.models;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for Campus model.
 *
 * Created by Rafaela Araújo on 23/02/2017.
 */
public class CampusTest {

    private final String CAMPUS_NAME = "Campus A";
    private final String RESTAURANT_NAME = "Restaurant";
    private final List<String> RESTAURANT_LIST = new ArrayList() {{
            add("Restaurant A");
            add("Restaurant B");
            add("Restaurant C");}};

    @Test
    public void constructorTest() {
        Campus campus = new Campus(CAMPUS_NAME);
        Assert.assertEquals(CAMPUS_NAME,campus.getName());
    }

    @Test
    public void addGetRestaurantTest() {
        Campus campus = new Campus(CAMPUS_NAME);
        campus.addRestaurant(null);

        Assert.assertEquals(0, campus.getRestaurants().size());

        campus.addRestaurant(RESTAURANT_NAME);

        Assert.assertEquals(1, campus.getRestaurants().size());
    }

    @Test
    public void removeRestaurantTest() {
        Campus campus = new Campus(CAMPUS_NAME);
        campus.addRestaurant(RESTAURANT_NAME);

        Assert.assertEquals(1, campus.getRestaurants().size());

        campus.removeRestaurant(null);

        Assert.assertEquals(1, campus.getRestaurants().size());

        campus.removeRestaurant(RESTAURANT_NAME);
        Assert.assertEquals(0, campus.getRestaurants().size());
    }

    @Test
    public void setRestaurantsTest() {
        Campus campus = new Campus(CAMPUS_NAME);

        Assert.assertEquals(0, campus.getRestaurants().size());

        campus.setRestaurants(null);

        Assert.assertEquals(0, campus.getRestaurants().size());

        campus.setRestaurants(RESTAURANT_LIST);

        Assert.assertEquals(3, campus.getRestaurants().size());
    }
}