package com.example.unifood.models;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class RestaurantTest {

    private final String NAME = "Seu Olavo";
    private final String NEW_NAME = "O&S Burg";
    private final String CAMPUSID = "49c74eb3-9e4b-41c1-b928-2df460f860b4";
    private final String NEW_CAMPUSID = "0f841c1-b928-2df4";
    private final String LOCALIZATION = "Pracinha de humanas";
    private final String NEW_LOCALIZATION = "Pracinha perto do bloco BG";
    private final String DESCRIPTION = "Melhor x egg burg da UFCG";
    private final String USERID = "b159-151e772";
    private final String NEW_ID = "fh8r6-hhf9w-377y";
    private final String REVIEWID = "9e4b-41c1-b928";
    private Restaurant restaurant;

    @Before
    public void setUp(){
       restaurant = new Restaurant(NAME, CAMPUSID, LOCALIZATION);
    }

    @Test
    public void testConstructor(){
        assertEquals(NAME, restaurant.getName());
        assertEquals(CAMPUSID, restaurant.getCampusId());
        assertEquals(LOCALIZATION, restaurant.getLocalization());
        assertTrue(restaurant.getShortDescription().isEmpty());
    }

    @Test
    public void testEditRestaurant(){
        restaurant.setName(NEW_NAME);
        restaurant.setCampusId(NEW_CAMPUSID);
        restaurant.setLocalization(NEW_LOCALIZATION);
        restaurant.setId(NEW_ID);
        restaurant.setShortDescription(DESCRIPTION);
        restaurant.setUserId(USERID);

        assertEquals(NEW_NAME, restaurant.getName());
        assertEquals(NEW_CAMPUSID, restaurant.getCampusId());
        assertEquals(NEW_LOCALIZATION, restaurant.getLocalization());
        assertEquals(NEW_ID, restaurant.getId());
        assertEquals(DESCRIPTION, restaurant.getShortDescription());
        assertEquals(USERID, restaurant.getUserId());
    }

    @Test
    public void testAddRate(){
        assertTrue(restaurant.getReviewList().isEmpty());
        restaurant.addRate(REVIEWID);
        assertTrue(restaurant.getReviewList().contains(REVIEWID));
    }
}
