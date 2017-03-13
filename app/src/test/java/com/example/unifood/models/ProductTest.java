package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidDescriptionException;
import com.example.unifood.exceptions.InvalidProductCostException;
import com.example.unifood.exceptions.InvalidProductNameException;
import com.example.unifood.exceptions.ProductException;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Unit tests for Product
 */

public class ProductTest {

    private final String NAME = "Pastel";
    private final String NEW_NAME = "Coxinha";
    private final float COST = 3.9f;
    private final float NEW_COST = 2.5f;
    private final boolean NEW_AVAILABILITY = false;
    private final String DESCRIPTION = "Pastel recheado de queijo";
    private final String NEW_DESCRIPTION = "Coxinha de frango";
    private final String NEW_ID = "2447-9-4b11";
    public final String INVALID_NAME = "ab";
    public final float INVALID_COST = -1F;
    private final String INVALID_DESCRIPTION = "Imagine theres no heaven\n" +
                                                      "Its easy if you try\n" +
                                                      "No hell below us\n" +
                                                      "Above us only sky\n" +
                                                      "Imagine all the people\n" +
                                                      "Living for today\n" +
                                                      "You may say Im a dreamer";
    private Product product;

    @Before
    public void setUp(){
        try {
            product = new Product(NAME, COST, DESCRIPTION);
        } catch (ProductException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstructor(){
        assertEquals(NAME, product.getName());
        assertEquals(COST, product.getCost());
        assertEquals(DESCRIPTION, product.getDescription());
        assertTrue(product.getAvailability());
    }

    @Test (expected = InvalidProductNameException.class)
    public void testNullName() throws ProductException {
        product = new Product(null, COST, DESCRIPTION);
    }

    @Test (expected = InvalidProductNameException.class)
    public void testInvalidName() throws ProductException {
        product = new Product(INVALID_NAME, COST, DESCRIPTION);
    }

    @Test (expected = InvalidProductCostException.class)
    public void testInvalidCost() throws ProductException {
        product = new Product(NAME, INVALID_COST, DESCRIPTION);
    }

    @Test (expected = InvalidDescriptionException.class)
    public void testNullDescription() throws ProductException {
        product = new Product(NAME, COST, null);
    }

    @Test (expected = InvalidDescriptionException.class)
    public void testInvalidDescription() throws ProductException {
        product = new Product(NAME, COST, INVALID_DESCRIPTION);
    }

    @Test
    public void testEditProduct(){
        product.setName(null);
        product.setCost(-1);
        product.setAvailability(NEW_AVAILABILITY);
        product.setDescription(null);
        product.setId(null);

        assertEquals(NAME, product.getName());
        assertEquals(COST, product.getCost());
        assertEquals(NEW_AVAILABILITY, product.getAvailability());
        assertEquals(DESCRIPTION, product.getDescription());
        assertFalse(product.getId().isEmpty());

        product.setName(NEW_NAME);
        product.setCost(NEW_COST);
        product.setDescription(NEW_DESCRIPTION);
        product.setId(NEW_ID);

        assertEquals(NEW_NAME, product.getName());
        assertEquals(NEW_COST, product.getCost());
        assertEquals(NEW_DESCRIPTION, product.getDescription());
        assertEquals(NEW_ID, product.getId());
    }
}
