package com.example.unifood.models;


import com.example.unifood.exceptions.StudentException;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;

/**
 * Created by laybson on 25/02/17.
 */

public class StudentInfoTest {

    private final String CAMPUSID = "49c74eb3-9e4b-41c1-b928-2df460f860b4";
    private final String NEW_CAMPUSID = "0f841c1-b928-2df4";
    private final String RESTAURANTID = "fh8r6-hhf9w-377y";
    private final String NEW_RESTAURANTID = "fh8r6-hhf9w-377x";
    private final String PRODUCTID = "2447-9-4b11";
    private final String NEW_PRODUCTID = "2447-9-4b10";

    private StudentInfo student;

    @Before
    public void setUp(){
        try {
            student = new StudentInfo(CAMPUSID);
        } catch (StudentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstructor(){
        assertEquals(CAMPUSID, student.getCampusId());
        assertTrue(student.getFavProducts().isEmpty());
        assertTrue(student.getFavRestaurants().isEmpty());
    }


    @Test (expected = StudentException.class)
    public void testNullCampus() throws StudentException{
        student = new StudentInfo(null);
    }


    @Test
    public void testAddRestaurantToFavorites() {
        assertTrue(student.getFavRestaurants().isEmpty());
        student.addRestaurantToFavorites(RESTAURANTID);
        assertTrue(student.getFavRestaurants().size() == 1);
        assertTrue(student.getFavRestaurants().contains(RESTAURANTID));
        assertFalse(student.addRestaurantToFavorites(null));
    }

    @Test
    public void testAddProductToFavorites() {
        assertTrue(student.getFavProducts().isEmpty());
        student.addProductToFavorites(PRODUCTID);
        assertTrue(student.getFavProducts().size() == 1);
        assertTrue(student.getFavProducts().contains(PRODUCTID));
        assertFalse(student.addProductToFavorites(null));
    }

    @Test
    public void testDelRestaurantFromFavorites() {
        student.addRestaurantToFavorites(RESTAURANTID);
        assertTrue(student.getFavRestaurants().size() == 1);
        assertTrue(student.getFavRestaurants().contains(RESTAURANTID));
        assertTrue(student.delRestaurantFromFavorites(RESTAURANTID));
        assertTrue(student.getFavRestaurants().isEmpty());
        assertFalse(student.getFavRestaurants().contains(RESTAURANTID));
        assertFalse(student.delRestaurantFromFavorites(RESTAURANTID));
    }

    @Test
    public void delProductFromFavorites() {
        student.addProductToFavorites(PRODUCTID);
        assertTrue(student.getFavProducts().size() == 1);
        assertTrue(student.getFavProducts().contains(PRODUCTID));
        assertTrue(student.delProductFromFavorites(PRODUCTID));
        assertTrue(student.getFavProducts().isEmpty());
        assertFalse(student.getFavProducts().contains(PRODUCTID));
        assertFalse(student.delProductFromFavorites(PRODUCTID));
    }

    @Test
    public void testSets() {
        ArrayList<String> newFavProducts = new ArrayList<String>();
        ArrayList<String> newFavRestaurants = new ArrayList<String>();
        newFavProducts.add(NEW_PRODUCTID);
        newFavRestaurants.add(NEW_RESTAURANTID);
        student.setCampusId(NEW_CAMPUSID);
        student.setFavProducts(newFavProducts);
        student.setFavRestaurants(newFavRestaurants);
        assertEquals(newFavProducts, student.getFavProducts());
        assertEquals(newFavRestaurants, student.getFavRestaurants());
    }

}
