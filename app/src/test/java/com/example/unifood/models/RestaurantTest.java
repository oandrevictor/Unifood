package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidCampusIdException;
import com.example.unifood.exceptions.InvalidLocalizationException;
import com.example.unifood.exceptions.InvalidRestaurantNameException;
import com.example.unifood.exceptions.RestaurantException;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertNotEquals;

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
    public final ArrayList<Review> REVIEW_LIST = new ArrayList<>();
    public final ArrayList<Product> PRODUCT_LIST = new ArrayList<>();
    public final float RATE1 = 4.5f;
    public final float RATE2 = 2.1f;
    public final float RATE3 = 3.6f;
    private final float INITIAL_RATE = 0;
    private final float FINAL_RATE = 3.4F;
    public final float DELTA = 0.0001f;
    public final String INVALID_NAME = "abc";
    public final String INVALID_CAMPUS = "";
    public final String INVALID_LOCALIZATION = "123456789";
    private Restaurant restaurant;
    private Product product1;
    private Product product2;
    private Review review1;
    private Review review2;
    private Review review3;
    private Restaurant restaurant2;
    private Restaurant restaurant3;

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

        review1.setRate(RATE1);
        review2.setRate(RATE2);
        review3.setRate(RATE3);
    }

    @Test
    public void testConstructor(){
        assertEquals(NAME, restaurant.getName());
        assertEquals(CAMPUSID, restaurant.getCampusId());
        assertEquals(LOCALIZATION, restaurant.getLocalization());
        assertTrue(restaurant.getShortDescription().isEmpty());
    }

    @Test (expected = InvalidRestaurantNameException.class)
    public void testNullName() throws RestaurantException {
        restaurant = new Restaurant(null, CAMPUSID, LOCALIZATION);
    }

    @Test (expected = InvalidRestaurantNameException.class)
    public void testInvalidName() throws RestaurantException {
        restaurant = new Restaurant(INVALID_NAME, CAMPUSID, LOCALIZATION);
    }

    @Test (expected = InvalidCampusIdException.class)
    public void testNullCampusId() throws RestaurantException {
        restaurant = new Restaurant(NAME, null, LOCALIZATION);
    }

    @Test (expected = InvalidCampusIdException.class)
    public void testInvalidCampusId() throws RestaurantException {
        restaurant = new Restaurant(NAME, INVALID_CAMPUS, LOCALIZATION);
    }

    @Test (expected = InvalidLocalizationException.class)
    public void testNullLocalization() throws RestaurantException {
        restaurant = new Restaurant(NAME, CAMPUSID, null);
    }

    @Test (expected = InvalidLocalizationException.class)
    public void testInvalidLocalization() throws RestaurantException {
        restaurant = new Restaurant(NAME, CAMPUSID, INVALID_LOCALIZATION);
    }

    @Test
    public void testEditRestaurant(){
        restaurant.setName(NEW_NAME);
        restaurant.setCampusId(NEW_CAMPUSID);
        restaurant.setLocalization(NEW_LOCALIZATION);
        restaurant.setId(NEW_ID);
        restaurant.setShortDescription(DESCRIPTION);
        restaurant.setUserId(USERID);
        restaurant.setReviewList(REVIEW_LIST);
        restaurant.setProductList(PRODUCT_LIST);
        restaurant.setRate(FINAL_RATE);
        restaurant.setApproved(true);

        assertEquals(NEW_NAME, restaurant.getName());
        assertEquals(NEW_CAMPUSID, restaurant.getCampusId());
        assertEquals(NEW_LOCALIZATION, restaurant.getLocalization());
        assertEquals(NEW_ID, restaurant.getId());
        assertEquals(DESCRIPTION, restaurant.getShortDescription());
        assertEquals(USERID, restaurant.getUserId());
        assertEquals(REVIEW_LIST, restaurant.getReviewList());
        assertEquals(PRODUCT_LIST, restaurant.getProductList());
        assertEquals(FINAL_RATE, restaurant.getRate(), DELTA);
        assertTrue(restaurant.getApproved());
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

    @Test
    public void testEquals(){
        assertFalse(restaurant.equals(null));

        restaurant2 = new Restaurant();
        restaurant2.setId(restaurant.getId());
        assertTrue(restaurant.equals(restaurant2));

        restaurant3 = new Restaurant();
        assertFalse(restaurant.equals(restaurant3));
    }

    @Test
    public void testUpdate(){
        try{
            restaurant2 = new Restaurant(NEW_NAME, NEW_CAMPUSID, NEW_LOCALIZATION);
            restaurant2.setRate(FINAL_RATE);
            restaurant2.setReviewList(REVIEW_LIST);
        }catch(RestaurantException e){
            e.printStackTrace();
        }
        restaurant.update(restaurant2);

        assertEquals(NEW_NAME, restaurant.getName());
        assertEquals(NEW_LOCALIZATION, restaurant.getLocalization());
        assertEquals(FINAL_RATE, restaurant.getRate());
        assertEquals(REVIEW_LIST, restaurant.getReviewList());
    }
}
