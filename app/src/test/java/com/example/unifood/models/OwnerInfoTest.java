package com.example.unifood.models;

import org.junit.Test;

import static junit.framework.Assert.*;

public class OwnerInfoTest {

    @Test
    public void testConstructor(){
        String restaurantId = "30102447-3aab-4b11-b159-151e7723ab27";
        OwnerInfo owner = new OwnerInfo(restaurantId);
        assertEquals("30102447-3aab-4b11-b159-151e7723ab27", owner.getRestaurantId());
    }
}
