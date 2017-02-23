package com.example.unifood.models;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class RestaurantTest {

    Restaurant restaurant;

    @Before
    public void setUp(){
       restaurant = new Restaurant("Seu Olavo", "49c74eb3-9e4b-41c1-b928-2df460f860b4", "Pracinha do bloco BG");
    }

    @Test
    public void testConstructor(){
        assertEquals("Seu Olavo", restaurant.getName());
        assertEquals("49c74eb3-9e4b-41c1-b928-2df460f860b4", restaurant.getCampusId());
        assertEquals("Pracinha do bloco BG", restaurant.getLocalization());

        assertTrue(restaurant.getShortDescription().isEmpty());
        restaurant.setShortDescription("Melhor x egg burg da UFCG");
        assertEquals("Melhor x egg burg da UFCG", restaurant.getShortDescription());
    }

    @Test
    public void testAddRate(){
        assertTrue(restaurant.getReviewList().isEmpty());
        restaurant.addRate("9e4b-41c1-b928");
        assertFalse(restaurant.getReviewList().isEmpty());
        assertTrue(restaurant.getReviewList().contains("9e4b-41c1-b928"));
    }
}
