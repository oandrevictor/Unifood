package com.example.unifood.models;

import com.example.unifood.exceptions.OwnerException;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class OwnerInfoTest {

    private final String RESTAURANTID = "30102447-3aab-4b11-b159-151e7723ab27";
    private final String NEW_RESTAURANTID = "30102447-9-151e7723ab27";
    private OwnerInfo owner;

    @Before
    public void setUp(){
        try {
            owner = new OwnerInfo(RESTAURANTID);
        } catch (OwnerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstructor(){
        assertEquals(RESTAURANTID, owner.getRestaurantId());
    }

    @Test
    public void testEditOwnerInfo(){
        owner.setRestaurantId(null);
        assertEquals(RESTAURANTID, owner.getRestaurantId());

        owner.setRestaurantId(NEW_RESTAURANTID);
        assertEquals(NEW_RESTAURANTID, owner.getRestaurantId());
    }
}
