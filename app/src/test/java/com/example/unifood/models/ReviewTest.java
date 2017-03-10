package com.example.unifood.models;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by laybson on 25/02/17.
 */

public class ReviewTest {
    private final String USERID = "a97bg-jh45u-hn87";
    private final String RESTAURANTID = "fh8r6-hhf9w-377y";
    private final float RATE = 7;
    private final String COMMENT = "fh8r6-hhf9w-377y";
    private final String DATE = "08/01/2017";

    private Review review1;
    private Review review2;


    @Before
    public void setUp(){
        review1 = new Review(USERID, RESTAURANTID, RATE, DATE);
        review2 = new Review(USERID, RESTAURANTID, RATE, COMMENT, DATE);
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
}
