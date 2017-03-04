package com.example.unifood.models;

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
    private Product product;

    @Before
    public void setUp(){
        product = new Product(NAME, COST, DESCRIPTION);
    }

    @Test
    public void testConstructor(){
        assertEquals(NAME, product.getName());
        assertEquals(COST, product.getCost());
        assertEquals(DESCRIPTION, product.getDescription());
        assertTrue(product.isAvailable());
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
        assertEquals(NEW_AVAILABILITY, product.isAvailable());
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
