package com.example.unifood.models;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by laybson on 25/02/17.
 */

public class StudentInfoTest {

    private final String CAMPUSID = "49c74eb3-9e4b-41c1-b928-2df460f860b4";
    private final String RESTAURANTID = "fh8r6-hhf9w-377y";
    private final String PRODUCTID = "2447-9-4b11";

    private StudentInfo student;

    @Before
    public void setUp(){ student = new StudentInfo(CAMPUSID); }

    @Test
    public void testConstructor(){
        assertEquals(CAMPUSID, student.getCampusId());
        assertTrue(student.getFavProducts().isEmpty());
        assertTrue(student.getFavRestaurants().isEmpty());
    }

    @Test
    public void testAddRestaurantToFavorites() {
        assertTrue(student.getFavRestaurants().isEmpty());
        //student.addRestaurantToFavorites(RESTAURANTID);
        assertTrue(student.getFavRestaurants().size() == 1);
        assertTrue(student.getFavRestaurants().contains(RESTAURANTID));
    }

    @Test
    public void testAddProductToFavorites() {
        assertTrue(student.getFavProducts().isEmpty());
        //student.addProductToFavorites(PRODUCTID);
        assertTrue(student.getFavProducts().size() == 1);
        assertTrue(student.getFavProducts().contains(PRODUCTID));
    }

    @Test
    public void testDelRestaurantFromFavorites() {
        //student.addRestaurantToFavorites(RESTAURANTID);
        assertTrue(student.getFavRestaurants().size() == 1);
        assertTrue(student.getFavRestaurants().contains(RESTAURANTID));
        assertTrue(student.delRestaurantFromFavorites(RESTAURANTID));
        assertTrue(student.getFavRestaurants().isEmpty());
        assertFalse(student.getFavRestaurants().contains(RESTAURANTID));
        assertFalse(student.delRestaurantFromFavorites(RESTAURANTID));
    }

    @Test
    public void delProductFromFavorites() {
        //student.addProductToFavorites(PRODUCTID);
        assertTrue(student.getFavProducts().size() == 1);
        assertTrue(student.getFavProducts().contains(PRODUCTID));
        assertTrue(student.delProductFromFavorites(PRODUCTID));
        assertTrue(student.getFavProducts().isEmpty());
        assertFalse(student.getFavProducts().contains(PRODUCTID));
        assertFalse(student.delProductFromFavorites(PRODUCTID));
    }

}
