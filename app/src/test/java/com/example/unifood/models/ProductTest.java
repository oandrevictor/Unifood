package com.example.unifood.models;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Unit tests for Product
 */

public class ProductTest {

    @Test
    public void testConstructor(){
        Product product = new Product("Coxinha", 3.9f, true);
        assertEquals("Coxinha", product.getName());
        assertEquals(3.9f, product.getCost());
        assertTrue(product.isAvailability());
    }
}
