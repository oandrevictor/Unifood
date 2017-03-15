package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidDateException;
import com.example.unifood.exceptions.InvalidRateException;
import com.example.unifood.exceptions.InvalidRestaurantId;
import com.example.unifood.exceptions.InvalidUserIdException;
import com.example.unifood.exceptions.ReviewException;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by laybson on 25/02/17.
 */

public class ReviewTest {
    private final String NEW_ID = "a97bg-j-hn87";
    private final String USERID = "a97bg-jh45u-hn87";
    private final String NEW_USERID = "a97bg-jh45u-hn88";
    private final String INVALID_USERID = "";
    private final String RESTAURANTID = "fh8r6-hhf9w-377y";
    private final String NEW_RESTAURANTID = "fh8f6-hhf9w-377y";
    private final String INVALID_RESTAURANTID = "";
    private final float RATE = 4;
    private final float NEW_RATE = 5;
    private final float INVALID_RATE = -1;
    private final String COMMENT = "fh8r6-hhf9w-377y";
    private final String NEW_COMMENT = "fh8r6-hhf9w-377y";
    private final String DATE = "08/01/2017";
    private final String NEW_DATE = "21/06/2017";
    private final String INVALID_DATE = "";

    private Review review1;
    private Review review2;


    @Before
    public void setUp(){
        try {
            review1 = new Review(USERID, RESTAURANTID, RATE, DATE);
            review2 = new Review(USERID, RESTAURANTID, RATE, COMMENT, DATE);
        } catch (ReviewException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstructorWithoutComment(){
        assertEquals(USERID, review1.getUserId());
        assertEquals(RESTAURANTID, review1.getRestaurantId());
        assertEquals(RATE, review1.getRate());
        assertEquals(DATE, review1.getDate());
        assertTrue(review1.getComment().isEmpty());
    }

    @Test
    public void testConstructorWithComment(){
        assertEquals(USERID, review2.getUserId());
        assertEquals(RESTAURANTID, review2.getRestaurantId());
        assertEquals(RATE, review2.getRate());
        assertEquals(COMMENT, review2.getComment());
        assertEquals(DATE, review2.getDate());
    }

    @Test (expected = ReviewException.class)
    public void testValidateComment() throws ReviewException {
        review2 = new Review(USERID, RESTAURANTID, RATE, null, DATE);
    }

    @Test (expected = InvalidUserIdException.class)
    public void testNullUserId() throws ReviewException {
        review2 = new Review(null, RESTAURANTID, RATE, COMMENT, DATE);
    }

    @Test (expected = InvalidUserIdException.class)
    public void testEmptyUserId() throws ReviewException {
        review2 = new Review(INVALID_USERID, RESTAURANTID, RATE, COMMENT, DATE);
    }

    @Test (expected = InvalidRestaurantId.class)
    public void testNullRestaurantId() throws ReviewException {
        review2 = new Review(USERID, null, RATE, COMMENT, DATE);
    }

    @Test (expected = InvalidRestaurantId.class)
    public void testEmptyRestaurantId() throws ReviewException {
        review2 = new Review(USERID, INVALID_RESTAURANTID, RATE, COMMENT, DATE);
    }

    @Test (expected = InvalidRateException.class)
    public void testInvalidRate() throws ReviewException {
        review2 = new Review(USERID, RESTAURANTID, INVALID_RATE, COMMENT, DATE);
    }

    @Test (expected = InvalidDateException.class)
    public void testNullDate() throws ReviewException {
        review2 = new Review(USERID, RESTAURANTID, RATE, COMMENT, null);
    }

    @Test (expected = InvalidDateException.class)
    public void testEmptyDate() throws ReviewException {
        review2 = new Review(USERID, RESTAURANTID, RATE, COMMENT, INVALID_DATE);
    }

    @Test
    public void testEditReview() {
        review2.setComment(NEW_COMMENT);
        review2.setDate(NEW_DATE);
        review2.setId(NEW_ID);
        review2.setRate(NEW_RATE);
        review2.setRestaurantId(NEW_RESTAURANTID);
        review2.setUserId(NEW_USERID);

        assertEquals(NEW_COMMENT, review2.getComment());
        assertEquals(NEW_DATE, review2.getDate());
        assertEquals(NEW_ID, review2.getId());
        assertEquals(NEW_RATE, review2.getRate());
        assertEquals(NEW_RESTAURANTID, review2.getRestaurantId());
        assertEquals(NEW_USERID, review2.getUserId());
    }
}
