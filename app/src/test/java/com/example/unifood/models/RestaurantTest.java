package com.example.unifood.models;

import com.example.unifood.exceptions.RestaurantException;

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
    private final float INITIAL_RATE = 0;
    private final float FINAL_RATE = 3.4F;
    public final float DELTA = 0.0001f;
    private Restaurant restaurant;
    private Product product1;
    private Product product2;
    private Review review1;
    private Review review2;
    private Review review3;

    @Before
    public void setUp(){
        try {
            restaurant = new Restaurant(NAME, CAMPUSID, LOCALIZATION);
        } catch (RestaurantException e) {
            e.printStackTrace();
        }

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

        restaurant.addReview(null);
        assertEquals(1, restaurant.getReviewList().size());
    }

    @Test
    public void testRemoveReview(){
        restaurant.addReview(review1);

        restaurant.removeReview(null);
        assertEquals(1, restaurant.getReviewList().size());

        restaurant.removeReview(review1);
        assertTrue(restaurant.getReviewList().isEmpty());
    }

    @Test
    public void testAddProduct() {
        restaurant.addProduct(null);
        assertTrue(restaurant.getProductList().isEmpty());
        restaurant.addProduct(product1);
        assertTrue(restaurant.getProductList().contains(product1));
    }

    @Test
    public void testRemoveProduct() {
        restaurant.addProduct(product2);

        restaurant.removeProduct(null);
        assertEquals(1, restaurant.getProductList().size());

        restaurant.removeProduct(product2);
        assertTrue(restaurant.getProductList().isEmpty());
    }

    @Test
    public void testUpdateRating() {
        restaurant.updateRating();
        assertEquals(INITIAL_RATE, restaurant.getRate(), DELTA);

        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);

        restaurant.updateRating();

        assertEquals(FINAL_RATE, restaurant.getRate(), DELTA);
    }
}
