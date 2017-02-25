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
    private final float INITIAL_RATE = 0;
    private final float FINAL_RATE = 3.4F;
    private Restaurant restaurant;
    private Product product1;
    private Product product2;
    private Review review1;
    private Review review2;
    private Review review3;

    @Before
    public void setUp(){
        restaurant = new Restaurant(NAME, CAMPUSID, LOCALIZATION);

        product1 = new Product();
        product2 = new Product();

        review1 = new Review();
        review2 = new Review();
        review3 = new Review();

        review1.setRate(4.5f);
        review2.setRate(2.1f);
        review3.setRate(3.6f);
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
    public void testAddReview() {
        restaurant.addReview(review1);
        assertTrue(restaurant.getReviewList().contains(review1));
    }

    @Test
    public void testAddProduct() {
        assertTrue(restaurant.getProductList().isEmpty());
        restaurant.addProduct(product1);
        assertTrue(restaurant.getProductList().contains(product1));
    }

    @Test
    public void testRemoveProduct() {
        restaurant.addProduct(product2);
        assertTrue(restaurant.getProductList().contains(product2));
        restaurant.removeProduct(product2);
        assertFalse(restaurant.getProductList().contains(product2));
    }

    @Test
    public void testGetRating() {
        assertEquals(INITIAL_RATE, restaurant.getRating());

        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);

        assertEquals(FINAL_RATE, restaurant.getRating(), 0.0001f);
    }
}
