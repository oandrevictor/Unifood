package com.example.unifood.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("", (-1.0f), "hi!");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductNameException");
    } catch (com.example.unifood.exceptions.InvalidProductNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("hi!", "hi!", (float)(byte)1, "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidDateException");
    } catch (com.example.unifood.exceptions.InvalidDateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("", "", (float)100L, "67a826d0-ad9d-49db-8997-58baff1011a9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidFirstNameException");
    } catch (com.example.unifood.exceptions.InvalidFirstNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("", "67a826d0-ad9d-49db-8997-58baff1011a9", (float)(byte)10, "hi!", "322c0567-95f6-47cd-bed2-9cdd49776e37");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusNameException");
    } catch (com.example.unifood.exceptions.InvalidCampusNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("", (float)(byte)-1, "3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductNameException");
    } catch (com.example.unifood.exceptions.InvalidProductNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "a04223f0-b1c0-449c-afab-59a81cef4343", (float)100, "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "", (float)(byte)0, "a04223f0-b1c0-449c-afab-59a81cef4343", "adb74c6f-c839-47cc-b096-1c12240d6afd");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("adb74c6f-c839-47cc-b096-1c12240d6afd", "435ac483-0bc9-41d2-b04d-3c696a180a7c", (float)100L, "a04223f0-b1c0-449c-afab-59a81cef4343");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    com.example.unifood.exceptions.InvalidFirstNameException invalidFirstNameException0 = new com.example.unifood.exceptions.InvalidFirstNameException();

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("9cef684b-9583-4350-bc7f-52fdf83f721b", "", (float)(byte)1, "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "67a826d0-ad9d-49db-8997-58baff1011a9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", 100.0f, "3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("", "3db35cfa-ac0a-4288-9084-8d042e570026", (float)(byte)100, "2016930c-728d-45c5-a236-9c4833a30246");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    studentInfo3.setCampusId("");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    studentInfo3.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    campus1.setRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    campus1.setName("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9"+ "'", str2.equals("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("53d740cc-3498-48a3-8d69-2631da037847", "5ed892b7-8b07-4339-8318-fe7c666739ed", (float)(-1), "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("392d78ad-3469-4abe-83e2-8fc3d2096494", "a3b987c2-9db2-4892-bf67-5beb5e226c6b", (float)10L, "ec1c7744-8529-4314-837e-cb723075bf0b");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "d054f793-8da1-4b53-9056-26346d97b155", 100.0f, "0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    java.lang.String str10 = restaurant0.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "efbb39b8-b569-44a5-8350-5d34ec9574db"+ "'", str8.equals("efbb39b8-b569-44a5-8350-5d34ec9574db"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    java.lang.String str13 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    university1.setName("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e6acb160-dff8-4e78-9a49-6e86cc2a4663"+ "'", str2.equals("e6acb160-dff8-4e78-9a49-6e86cc2a4663"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    product3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b7 = product3.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.lang.String str6 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "78df657c-5d1a-4a93-909c-f2adb2f9dacd"+ "'", str2.equals("78df657c-5d1a-4a93-909c-f2adb2f9dacd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "78df657c-5d1a-4a93-909c-f2adb2f9dacd"+ "'", str6.equals("78df657c-5d1a-4a93-909c-f2adb2f9dacd"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a04223f0-b1c0-449c-afab-59a81cef4343"+ "'", str2.equals("a04223f0-b1c0-449c-afab-59a81cef4343"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    review0.setRate((float)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str7 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b15 = studentInfo0.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b17 = studentInfo0.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str20 = campus19.getId();
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    studentInfo21.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    campus19.setRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    java.lang.String str35 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "8ce830fe-1366-4bd5-a822-511d9d102587"+ "'", str20.equals("8ce830fe-1366-4bd5-a822-511d9d102587"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str35.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str12 = campus0.getName();
    boolean b14 = campus0.removeRestaurant("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    java.lang.String str7 = restaurant3.getLocalization();
    restaurant3.setCampusId("9bb4ec51-2299-41a3-b764-2192d7b57501");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("cde62678-4a38-48f3-8486-51d54fb5e8c8", "1e6a2d9d-9f40-49e0-8bc1-b9b85020de59", (float)(byte)10, "5a768843-8dc8-45b5-baf6-85706b277c5f", "81044927-9a8d-4832-b445-01ac529dcb62");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setId("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str6 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.addRestaurant("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("c1839dde-2a89-4fce-a06f-c96ccbb3f563", "0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", (-1.0f), "19c7d5e9-6bde-438f-aa67-83a5a8eeebdc");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setType("376f29dd-77f2-4b44-8c95-b9ac348c4e6f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str5.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("32bef74e-15d2-4f2b-849c-199055557d88", "38e9601d-4195-43c5-8f2c-566c2ef91772", (float)(short)10, "090d4d8e-cace-44ee-8920-101722da86af", "5ed892b7-8b07-4339-8318-fe7c666739ed");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("1ede2012-6d8b-4886-b09c-d88386ee74f6", "49976e80-f69f-4380-aa76-dc904dcb2eca", (float)(short)0, "7fb4b671-eeeb-4d73-8c40-91baed7167c3", "2016930c-728d-45c5-a236-9c4833a30246");

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    com.example.unifood.exceptions.StudentException studentException0 = new com.example.unifood.exceptions.StudentException();
    com.example.unifood.exceptions.OwnerException ownerException1 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException2 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException1.addSuppressed((java.lang.Throwable)invalidCampusIdException2);
    java.lang.Throwable[] throwable_array4 = ownerException1.getSuppressed();
    java.lang.String str5 = ownerException1.toString();
    studentException0.addSuppressed((java.lang.Throwable)ownerException1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "b80d0c79-546e-4f90-8fb2-cf05b7896bcc", (float)100, "3cf41e8a-0978-423d-8b1d-d36337a6148a");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    boolean b9 = studentInfo0.delProductFromFavorites("2adc96c3-f320-42fb-97f3-c22c606913fb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    boolean b12 = product7.getAvailability();
    float f13 = product7.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.0f);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    restaurant11.addProduct(product12);
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant11.getProductList();
    restaurant11.setUserId("hi!");
    restaurant11.setName("12/03/2017");
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getId();
    boolean b22 = restaurant11.removeReview(review20);
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product24 = new com.example.unifood.models.Product();
    boolean b25 = product24.getAvailability();
    restaurant23.addProduct(product24);
    product24.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b29 = restaurant11.removeProduct(product24);
    restaurant3.addProduct(product24);
    restaurant3.setId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    java.lang.String str33 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "6c7bf211-c6d2-4f9e-9c67-3d386ead4562"+ "'", str21.equals("6c7bf211-c6d2-4f9e-9c67-3d386ead4562"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str33.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("hi!", "1aa0d499-6b74-40e4-ae8d-5c2cd81523c3", (float)(-1L), "5a768843-8dc8-45b5-baf6-85706b277c5f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getUserId();
    java.lang.String str5 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    userInfo0.setType("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ccf553f7-d9de-49ff-80df-05ba74bcec16"+ "'", str6.equals("ccf553f7-d9de-49ff-80df-05ba74bcec16"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str4 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    studentInfo7.setCampusId("");
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str16);
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    studentInfo19.setCampusId("");
    studentInfo19.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo19.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str26 = studentInfo19.getFavProducts();
    studentInfo7.setFavProducts(list_str26);
    studentInfo0.setFavRestaurants(list_str26);
    boolean b30 = studentInfo0.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("7b379d86-fcc6-43c8-a85d-c887cc492e73");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.lang.String str11 = campus0.getId();
    campus0.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    java.lang.String str14 = campus0.getId();
    java.lang.String str15 = campus0.getId();
    campus0.setId("dc3009ab-4e71-4853-844b-8f9576dbc28c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "8c6a248c-b6a6-4203-85bb-f9fcf6c4e147"+ "'", str6.equals("8c6a248c-b6a6-4203-85bb-f9fcf6c4e147"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str14.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str15.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    boolean b10 = university1.addCampus("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    java.lang.String str6 = restaurant0.getShortDescription();
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getUserId();
    review0.setRestaurantId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    review0.setComment("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3184f966-dfc6-45cd-8356-eacfc8a555bd"+ "'", str1.equals("3184f966-dfc6-45cd-8356-eacfc8a555bd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("f923bbf8-46b6-4279-9cf8-11e1ff2d5c5b", "1cc346cd-7e37-4aa5-a18f-4211b5a529c9", (float)(byte)100, "eca1f4fe-b307-4be9-8cf3-180c48bcbfd0");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4", "8ef2eb1c-6eaa-459e-96ae-f92134f1053c", (-1.0f), "d054f793-8da1-4b53-9056-26346d97b155");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    boolean b10 = studentInfo0.delRestaurantFromFavorites("");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str8 = review0.getComment();
    review0.setRestaurantId("f79ee0cc-de3f-4609-8494-f27553a1bb32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"+ "'", str8.equals("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    java.lang.String str4 = university1.getId();
    university1.setId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    java.lang.String str7 = university1.getId();
    boolean b9 = university1.removeCampus("2ca23794-72a3-4cca-8687-a1b0e6c8a5c2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "82f9966f-8a91-47b9-8ec4-ec9d2b0423c6"+ "'", str2.equals("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "82f9966f-8a91-47b9-8ec4-ec9d2b0423c6"+ "'", str4.equals("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9"+ "'", str7.equals("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("ed8899de-d74b-4c5b-bafd-c89f775d295a", "eca1f4fe-b307-4be9-8cf3-180c48bcbfd0", (float)(short)-1, "a3b987c2-9db2-4892-bf67-5beb5e226c6b", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    university1.setName("983a5c4e-aa49-46e5-83ef-45159624651e");
    boolean b8 = university1.addCampus("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "84e3215a-cb95-4021-8594-50fe3409fae3"+ "'", str2.equals("84e3215a-cb95-4021-8594-50fe3409fae3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.Campus campus9 = new com.example.unifood.models.Campus();
    boolean b11 = campus9.removeRestaurant("hi!");
    java.lang.String[] str_array36 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array36);
    campus9.setRestaurants((java.util.List<java.lang.String>)arraylist_str37);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str37);
    studentInfo0.setCampusId("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    boolean b44 = studentInfo0.addProductToFavorites("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("3cf41e8a-0978-423d-8b1d-d36337a6148a", "a9a6d832-db46-43f7-8078-9b0af2950add", (float)(short)-1, "f79ee0cc-de3f-4609-8494-f27553a1bb32");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    product3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    product3.setAvailability(false);
    product3.setAvailability(false);
    product3.setId("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    campus1.setName("bf93221f-f963-4560-8f4a-9bd0a88f2bc4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "021b6656-991a-4ba5-a77b-c45fab5c35b9"+ "'", str2.equals("021b6656-991a-4ba5-a77b-c45fab5c35b9"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant8.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str11 = restaurant8.getShortDescription();
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    java.lang.String str14 = review12.getComment();
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review();
    review15.setId("");
    java.lang.String str18 = review15.getUserId();
    com.example.unifood.models.Review review19 = new com.example.unifood.models.Review();
    review19.setRate((float)10L);
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    java.lang.String str25 = review22.getUserId();
    java.lang.String str26 = review22.getRestaurantId();
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    review27.setId("");
    com.example.unifood.models.Review review35 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review35.setUserId("");
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review();
    java.lang.String str39 = review38.getDate();
    java.lang.String str40 = review38.getComment();
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    review41.setId("");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setId("");
    java.lang.String str47 = review44.getUserId();
    java.lang.String str48 = review44.getRestaurantId();
    java.lang.String str49 = review44.getDate();
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    java.lang.String str51 = review50.getId();
    com.example.unifood.models.Review review57 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review57.setUserId("");
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review();
    review60.setId("");
    com.example.unifood.models.Review[] review_array63 = new com.example.unifood.models.Review[] { review12, review15, review19, review22, review27, review35, review38, review41, review44, review50, review57, review60 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review64 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review64, review_array63);
    restaurant8.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review64);
    java.util.List<com.example.unifood.models.Product> list_product67 = restaurant8.getProductList();
    restaurant3.setProductList(list_product67);
    boolean b69 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "cbab882e-b57c-4a7a-8205-e76bf105871d"+ "'", str51.equals("cbab882e-b57c-4a7a-8205-e76bf105871d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    campus0.setId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    boolean b34 = campus0.addRestaurant("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    review0.setId("47faf2e0-af9a-4f10-b291-1286388a6b65");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setName("59b6ade5-3811-4088-b13a-ef845448e8af");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1dbd805e-56e3-4ae1-ba27-156ae053a84c"+ "'", str2.equals("1dbd805e-56e3-4ae1-ba27-156ae053a84c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1dbd805e-56e3-4ae1-ba27-156ae053a84c"+ "'", str5.equals("1dbd805e-56e3-4ae1-ba27-156ae053a84c"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3c180ad7-267c-47e3-bdaa-08230d053f5a");
    campus1.setName("e2c7a34a-8060-4430-9d69-dd5848b101c6");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant10.setUserId("hi!");
    restaurant10.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review19 = restaurant10.getReviewList();
    restaurant0.setReviewList(list_review19);
    boolean b21 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("7b379d86-fcc6-43c8-a85d-c887cc492e73", "e0ed697c-d17d-4982-81ea-097a494113d9", 10.0f, "a04223f0-b1c0-449c-afab-59a81cef4343", "9626d0ba-fe19-4356-a232-426c972c7dfc");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "9bb4ec51-2299-41a3-b764-2192d7b57501");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    studentInfo0.setCampusId("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("ba061308-092f-40b1-9a8e-465a56f359d0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b10 = studentInfo0.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavProducts();
    boolean b13 = studentInfo0.addRestaurantToFavorites("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    studentInfo0.setCampusId("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review0.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    review0.setDate("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("45ff5ab3-6561-44f6-9c93-3f3be9ded172", "1dbd805e-56e3-4ae1-ba27-156ae053a84c", (float)10L, "c81d3daf-7c34-4870-802e-061eeb5c81e5", "b9e667e0-fd20-499f-8dee-17f8fff1afd9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("1cc346cd-7e37-4aa5-a18f-4211b5a529c9", "e8e3014e-33aa-43e7-bb64-b61e035fc513", 1.0f, "46968e03-114d-4a8c-aa28-11a47b6f8199");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    review5.setRestaurantId("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    java.lang.String str10 = review5.getComment();
    review5.setRate((float)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str10.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("f8c20ede-2bde-4e30-8dfb-1a90e6639fd5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3f1d8f40-44f8-458b-a784-7c1c32ce69d6"+ "'", str5.equals("3f1d8f40-44f8-458b-a784-7c1c32ce69d6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.addRestaurantToFavorites("90afc816-9759-4b54-86ff-a1b7beb18772");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f11 = product10.getCost();
    java.lang.String str12 = product10.getId();
    restaurant0.addProduct(product10);
    restaurant0.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str20 = restaurant19.getUserId();
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant24.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str27 = restaurant24.getShortDescription();
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    java.lang.String str29 = review28.getDate();
    java.lang.String str30 = review28.getComment();
    com.example.unifood.models.Review review31 = new com.example.unifood.models.Review();
    review31.setId("");
    java.lang.String str34 = review31.getUserId();
    com.example.unifood.models.Review review35 = new com.example.unifood.models.Review();
    review35.setRate((float)10L);
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review();
    review38.setId("");
    java.lang.String str41 = review38.getUserId();
    java.lang.String str42 = review38.getRestaurantId();
    com.example.unifood.models.Review review43 = new com.example.unifood.models.Review();
    review43.setId("");
    com.example.unifood.models.Review review51 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review51.setUserId("");
    com.example.unifood.models.Review review54 = new com.example.unifood.models.Review();
    java.lang.String str55 = review54.getDate();
    java.lang.String str56 = review54.getComment();
    com.example.unifood.models.Review review57 = new com.example.unifood.models.Review();
    review57.setId("");
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review();
    review60.setId("");
    java.lang.String str63 = review60.getUserId();
    java.lang.String str64 = review60.getRestaurantId();
    java.lang.String str65 = review60.getDate();
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    java.lang.String str67 = review66.getId();
    com.example.unifood.models.Review review73 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review73.setUserId("");
    com.example.unifood.models.Review review76 = new com.example.unifood.models.Review();
    review76.setId("");
    com.example.unifood.models.Review[] review_array79 = new com.example.unifood.models.Review[] { review28, review31, review35, review38, review43, review51, review54, review57, review60, review66, review73, review76 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review80 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review80, review_array79);
    restaurant24.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review80);
    java.util.List<com.example.unifood.models.Product> list_product83 = restaurant24.getProductList();
    restaurant19.setProductList(list_product83);
    restaurant0.setProductList(list_product83);
    java.lang.String str86 = restaurant0.getName();
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "291773e4-9d5d-46d2-8f2f-f794d51a97ec"+ "'", str4.equals("291773e4-9d5d-46d2-8f2f-f794d51a97ec"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str12.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "f56551c3-7958-4c53-9dfb-322009fc47b0"+ "'", str67.equals("f56551c3-7958-4c53-9dfb-322009fc47b0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "84c380a1-fee2-4bfe-82b9-7668a6f07e00"+ "'", str86.equals("84c380a1-fee2-4bfe-82b9-7668a6f07e00"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    float f3 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    studentInfo0.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    studentInfo0.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getComment();
    java.lang.String str3 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeProduct(product13);
    product13.setCost((float)100);
    float f21 = product13.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "8ad6c68f-c1f5-48da-9394-cc66a42c7c76"+ "'", str10.equals("8ad6c68f-c1f5-48da-9394-cc66a42c7c76"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f21 == 100.0f);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    com.example.unifood.models.Review review6 = null;
    restaurant0.addReview(review6);
    java.lang.String str8 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1ac6ab5e-a672-4895-adf4-57ec7d2244b0"+ "'", str8.equals("1ac6ab5e-a672-4895-adf4-57ec7d2244b0"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", (float)(byte)100, "84e3215a-cb95-4021-8594-50fe3409fae3", "9cef684b-9583-4350-bc7f-52fdf83f721b");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    boolean b5 = studentInfo0.delProductFromFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    boolean b8 = studentInfo0.addProductToFavorites("b1e0ce4f-fe08-425e-8497-24824ac3c0d9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("a376faec-3be2-4815-b7e4-69d17b21ca91", "19c7d5e9-6bde-438f-aa67-83a5a8eeebdc", (float)(short)100, "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    review0.setUserId("27fab29a-8261-4cad-9980-1ab61f13cf41");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "95b73b3b-16ad-4007-a183-e5dfafbbaa1e"+ "'", str2.equals("95b73b3b-16ad-4007-a183-e5dfafbbaa1e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    boolean b15 = product14.getAvailability();
    restaurant13.addProduct(product14);
    java.lang.String str17 = restaurant13.getId();
    restaurant13.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant13.setApproved(true);
    restaurant13.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    boolean b24 = restaurant9.equals((java.lang.Object)"f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    restaurant9.setUserId("ed8899de-d74b-4c5b-bafd-c89f775d295a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "195fa07f-c70f-4ebf-a58e-fa03f417b14b"+ "'", str5.equals("195fa07f-c70f-4ebf-a58e-fa03f417b14b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "31a672f1-8d67-41fd-af08-42b81295d7f4"+ "'", str17.equals("31a672f1-8d67-41fd-af08-42b81295d7f4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    studentInfo3.setCampusId("");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    studentInfo3.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    campus1.setRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    java.lang.String str16 = campus1.getId();
    boolean b18 = campus1.addRestaurant("1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    java.lang.String str19 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "c9019d8a-e614-486b-837e-8748d9c86132"+ "'", str2.equals("c9019d8a-e614-486b-837e-8748d9c86132"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "c9019d8a-e614-486b-837e-8748d9c86132"+ "'", str16.equals("c9019d8a-e614-486b-837e-8748d9c86132"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a04223f0-b1c0-449c-afab-59a81cef4343"+ "'", str19.equals("a04223f0-b1c0-449c-afab-59a81cef4343"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    java.lang.String str13 = restaurant9.getId();
    restaurant9.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f20 = product19.getCost();
    java.lang.String str21 = product19.getId();
    restaurant9.addProduct(product19);
    restaurant9.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str29 = restaurant28.getUserId();
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant33.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str36 = restaurant33.getShortDescription();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getDate();
    java.lang.String str39 = review37.getComment();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setId("");
    java.lang.String str43 = review40.getUserId();
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setRate((float)10L);
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    java.lang.String str50 = review47.getUserId();
    java.lang.String str51 = review47.getRestaurantId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review();
    review52.setId("");
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review60.setUserId("");
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review();
    java.lang.String str64 = review63.getDate();
    java.lang.String str65 = review63.getComment();
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    review66.setId("");
    com.example.unifood.models.Review review69 = new com.example.unifood.models.Review();
    review69.setId("");
    java.lang.String str72 = review69.getUserId();
    java.lang.String str73 = review69.getRestaurantId();
    java.lang.String str74 = review69.getDate();
    com.example.unifood.models.Review review75 = new com.example.unifood.models.Review();
    java.lang.String str76 = review75.getId();
    com.example.unifood.models.Review review82 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review82.setUserId("");
    com.example.unifood.models.Review review85 = new com.example.unifood.models.Review();
    review85.setId("");
    com.example.unifood.models.Review[] review_array88 = new com.example.unifood.models.Review[] { review37, review40, review44, review47, review52, review60, review63, review66, review69, review75, review82, review85 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review89 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b90 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review89, review_array88);
    restaurant33.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review89);
    java.util.List<com.example.unifood.models.Product> list_product92 = restaurant33.getProductList();
    restaurant28.setProductList(list_product92);
    restaurant9.setProductList(list_product92);
    restaurant0.setProductList(list_product92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e9990043-a6ec-4857-b63d-fb3f60effac6"+ "'", str4.equals("e9990043-a6ec-4857-b63d-fb3f60effac6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "f0abce46-2656-46af-99c4-cc4f3ce992d7"+ "'", str13.equals("f0abce46-2656-46af-99c4-cc4f3ce992d7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "6def54f2-7835-4f8e-8a12-544711769448"+ "'", str21.equals("6def54f2-7835-4f8e-8a12-544711769448"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "c69b76b5-c0a6-4cae-8b04-c1e0547d77e8"+ "'", str76.equals("c69b76b5-c0a6-4cae-8b04-c1e0547d77e8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product92);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    boolean b8 = studentInfo0.delProductFromFavorites("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo();
    studentInfo9.setCampusId("");
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    studentInfo9.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str18);
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    studentInfo21.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo21.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str28 = studentInfo21.getFavProducts();
    studentInfo9.setFavProducts(list_str28);
    com.example.unifood.models.Campus campus30 = new com.example.unifood.models.Campus();
    boolean b32 = campus30.removeRestaurant("hi!");
    campus30.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str35 = campus30.getRestaurants();
    studentInfo9.setFavRestaurants(list_str35);
    studentInfo0.setFavRestaurants(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    review5.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review5.setUserId("06cccbeb-fd5c-4531-b0fc-216ad9f70ccb");
    java.lang.String str13 = review5.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str13.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.lang.String str11 = campus0.getId();
    java.lang.String str12 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "8a07b7c4-7848-400b-b6ea-42cac26b0db7"+ "'", str6.equals("8a07b7c4-7848-400b-b6ea-42cac26b0db7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    java.lang.String str17 = review9.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    product7.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b11 = product7.getAvailability();
    boolean b12 = restaurant0.removeProduct(product7);
    product7.setId("03b11d7c-17ee-42b3-8d2b-a1582b7ae26f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant10.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str13 = restaurant10.getShortDescription();
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    java.lang.String str15 = review14.getDate();
    java.lang.String str16 = review14.getComment();
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setRate((float)10L);
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    review24.setId("");
    java.lang.String str27 = review24.getUserId();
    java.lang.String str28 = review24.getRestaurantId();
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    review29.setId("");
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review37.setUserId("");
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    java.lang.String str41 = review40.getDate();
    java.lang.String str42 = review40.getComment();
    com.example.unifood.models.Review review43 = new com.example.unifood.models.Review();
    review43.setId("");
    com.example.unifood.models.Review review46 = new com.example.unifood.models.Review();
    review46.setId("");
    java.lang.String str49 = review46.getUserId();
    java.lang.String str50 = review46.getRestaurantId();
    java.lang.String str51 = review46.getDate();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review();
    java.lang.String str53 = review52.getId();
    com.example.unifood.models.Review review59 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review59.setUserId("");
    com.example.unifood.models.Review review62 = new com.example.unifood.models.Review();
    review62.setId("");
    com.example.unifood.models.Review[] review_array65 = new com.example.unifood.models.Review[] { review14, review17, review21, review24, review29, review37, review40, review43, review46, review52, review59, review62 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review66 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review66, review_array65);
    restaurant10.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review66);
    restaurant0.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review66);
    boolean b70 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "6d3048fd-be9f-46dc-8d3b-af0f3e74336b"+ "'", str53.equals("6d3048fd-be9f-46dc-8d3b-af0f3e74336b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("hi!", "cc66dadd-fcba-49ac-836f-c77a82d11050", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("966eb1c9-3eb2-4ca2-91cb-de5257760e00", "53d5e04e-abb5-45a7-a278-d742367421a0", "ec1c7744-8529-4314-837e-cb723075bf0b");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    restaurant0.setId("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.util.List<com.example.unifood.models.Product> list_product10 = null;
    restaurant0.setProductList(list_product10);
    restaurant0.setName("e38e11da-1219-443d-93b7-8c6ea82bea05");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.updateRating();
    java.lang.String str6 = restaurant0.getShortDescription();
    java.lang.String str7 = restaurant0.getName();
    com.example.unifood.models.Review review8 = new com.example.unifood.models.Review();
    java.lang.String str9 = review8.getDate();
    float f10 = review8.getRate();
    float f11 = review8.getRate();
    java.lang.String str12 = review8.getId();
    boolean b13 = restaurant0.removeReview(review8);
    review8.setComment("8c9cb989-277e-45da-a189-194e1666de8e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "f7d0a803-e524-44d4-af40-1b3785b0c6a0"+ "'", str12.equals("f7d0a803-e524-44d4-af40-1b3785b0c6a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.String str3 = ownerException0.toString();
    java.lang.String str4 = ownerException0.toString();
    java.lang.String str5 = ownerException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str3.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str4.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setId("");
    java.lang.String str15 = review12.getUserId();
    review12.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str18 = review12.getRestaurantId();
    boolean b19 = restaurant0.removeReview(review12);
    review12.setRate((float)'#');
    java.lang.String str22 = review12.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "fde75b42-0c98-4497-90a3-eaf498e34ad2"+ "'", str10.equals("fde75b42-0c98-4497-90a3-eaf498e34ad2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str22.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str6 = product0.getDescription();
    float f7 = product0.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("430eb310-03ac-4a61-9c78-e4ed541082c4");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant0.getName();
    java.lang.String str8 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str7.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b9 = product8.getAvailability();
    product8.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str12 = product8.getId();
    restaurant3.addProduct(product8);
    java.lang.String str14 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str12.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str14.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getUserId();
    review0.setRestaurantId("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2891a841-1e45-480f-8dbd-9c150442eb18"+ "'", str1.equals("2891a841-1e45-480f-8dbd-9c150442eb18"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getId();
    campus0.setId("119f287e-61c5-497a-b55c-17489bcb03e9");
    java.lang.String str4 = campus0.getId();
    com.example.unifood.models.University university6 = new com.example.unifood.models.University("hi!");
    java.lang.String str7 = university6.getId();
    java.lang.String[] str_array36 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array36);
    university6.setAllCampus((java.util.List<java.lang.String>)arraylist_str37);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e1c9a537-9947-424b-9bcc-d347af2548de"+ "'", str1.equals("e1c9a537-9947-424b-9bcc-d347af2548de"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "119f287e-61c5-497a-b55c-17489bcb03e9"+ "'", str4.equals("119f287e-61c5-497a-b55c-17489bcb03e9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4763e357-528e-4bc8-8acc-36ac0bc21b95"+ "'", str7.equals("4763e357-528e-4bc8-8acc-36ac0bc21b95"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setName("12/03/2017");
    java.util.List<java.lang.String> list_str8 = university1.getAllCampus();
    java.util.List<java.lang.String> list_str9 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "81590a16-8f83-4cfa-b624-11d3353e52f8"+ "'", str2.equals("81590a16-8f83-4cfa-b624-11d3353e52f8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "81590a16-8f83-4cfa-b624-11d3353e52f8"+ "'", str5.equals("81590a16-8f83-4cfa-b624-11d3353e52f8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("2adc96c3-f320-42fb-97f3-c22c606913fb");
    university1.setName("");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setCost(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    restaurant3.addProduct(product16);
    java.lang.Float f18 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f18 + "' != '" + 0.0f+ "'", f18.equals(0.0f));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    restaurant3.setLocalization("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    java.lang.String str11 = review10.getDate();
    review10.setRate((float)0);
    review10.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review10.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str18 = review10.getComment();
    boolean b19 = restaurant3.removeReview(review10);
    java.lang.String str20 = review10.getRestaurantId();
    java.lang.String str21 = review10.getDate();
    float f22 = review10.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"+ "'", str18.equals("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f22 == 0.0f);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = product0.getAvailability();
    java.lang.String str7 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("902f9631-5def-4d0f-9c96-e969fa810f24", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", (float)10, "1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    boolean b15 = product14.getAvailability();
    restaurant13.addProduct(product14);
    java.util.List<com.example.unifood.models.Product> list_product17 = restaurant13.getProductList();
    restaurant13.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getId();
    boolean b22 = restaurant13.removeReview(review20);
    review20.setComment("cee8ca5c-7aba-430f-8c09-de542ba28019");
    restaurant9.addReview(review20);
    review20.setUserId("090d4d8e-cace-44ee-8920-101722da86af");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5675838f-a901-49fe-bbef-8588ac00bd79"+ "'", str5.equals("5675838f-a901-49fe-bbef-8588ac00bd79"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "c8be3a66-b9ec-40e5-81b7-94a4ee8d939a"+ "'", str21.equals("c8be3a66-b9ec-40e5-81b7-94a4ee8d939a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str4 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.lang.String str7 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00a80698-5dcc-4f53-8de2-eaec89537d25"+ "'", str7.equals("00a80698-5dcc-4f53-8de2-eaec89537d25"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("cb4ac244-f7bb-4b89-bef2-8d7ff9ec1411", "", "ef1b541b-217c-4e6a-8ace-6b62d84aad2c");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusIdException");
    } catch (com.example.unifood.exceptions.InvalidCampusIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review14.setUserId("");
    java.lang.String str17 = review14.getUserId();
    review14.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b20 = restaurant0.removeReview(review14);
    review14.setId("53385034-c596-4b8b-96bd-a5bd2910707a");
    java.lang.String str23 = review14.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str23.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("42b8c9a6-a014-4a39-b2af-ca3bffb7a25e", "", "662e553a-b2a3-4886-92c5-e407af9a0086");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusIdException");
    } catch (com.example.unifood.exceptions.InvalidCampusIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    studentInfo2.setCampusId("");
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo2.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    studentInfo14.setCampusId("");
    studentInfo14.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo14.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str21 = studentInfo14.getFavProducts();
    studentInfo2.setFavProducts(list_str21);
    studentInfo1.setFavProducts(list_str21);
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    studentInfo1.setFavRestaurants(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getRestaurantId();
    java.lang.String str7 = review0.getUserId();
    java.lang.String str8 = review0.getUserId();
    review0.setUserId("d696b0ec-a37a-4c5e-bdf1-d957e2f2abf5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "bac8edc6-ea8c-44c4-b10c-6914383cf9d0"+ "'", str2.equals("bac8edc6-ea8c-44c4-b10c-6914383cf9d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = product1.getName();
    product1.setId("2af0b02e-4c9a-4970-a399-ff63e0300464");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.addRestaurantToFavorites("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    boolean b13 = studentInfo0.delRestaurantFromFavorites("53385034-c596-4b8b-96bd-a5bd2910707a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("a71e608a-71d0-4577-96d5-8e389cac3108");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b15 = studentInfo0.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b17 = studentInfo0.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str20 = campus19.getId();
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    studentInfo21.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    campus19.setRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    boolean b36 = studentInfo0.delProductFromFavorites("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    boolean b38 = studentInfo0.delRestaurantFromFavorites("64a174b7-c8e6-48f7-bd49-217619611384");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "9e33915e-bf30-4cef-9b94-35782a89f467"+ "'", str20.equals("9e33915e-bf30-4cef-9b94-35782a89f467"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b10 = studentInfo0.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavProducts();
    boolean b13 = studentInfo0.addRestaurantToFavorites("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    boolean b15 = studentInfo0.delRestaurantFromFavorites("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0");
    studentInfo0.setCampusId("b6fd1026-57eb-4577-a667-6dac64083d57");
    boolean b19 = studentInfo0.delRestaurantFromFavorites("2d9e3875-451e-4f7d-9ec4-7d52e0dfc476");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getFirstName();
    userInfo3.setType("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo3.setType("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("09c560d8-ad4a-4efc-a7b7-3894259139d4");

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = campus0.getName();
    java.lang.String str10 = campus0.getName();
    boolean b12 = campus0.removeRestaurant("e41a6d9c-54ce-40ae-9b87-9dd82f9a7da4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "b2a1c763-333a-4b58-b38b-ff37f8c40e9f"+ "'", str6.equals("b2a1c763-333a-4b58-b38b-ff37f8c40e9f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str10.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("43590002-ff0f-4cc9-8729-316ebc4fb5e8", "", (float)(short)100, "8fb81efd-e454-4b41-837c-440f27d5e941", "edc43374-1bb5-47a3-893f-7363f36242e4");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = product1.getName();
    product1.setName("63ec1eb5-f875-4903-9752-86c4ad4c4ed9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str2 = campus1.getRestaurants();
    boolean b4 = campus1.removeRestaurant("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("hi!", (float)(byte)0, "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    float f4 = product3.getCost();
    product3.setName("911084da-c86d-49e6-8f26-2d8886db9319");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("15149c67-efc5-4744-85b0-8dc2ac121df7");
    boolean b17 = studentInfo0.delRestaurantFromFavorites("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    boolean b10 = studentInfo0.addProductToFavorites("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    java.lang.String str11 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getFirstName();
    java.lang.String str7 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str5.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant17.getProductList();
    restaurant3.setProductList(list_product26);
    java.lang.String str28 = restaurant3.getUserId();
    com.example.unifood.models.Product product29 = new com.example.unifood.models.Product();
    boolean b30 = product29.getAvailability();
    product29.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product29.setAvailability(true);
    product29.setCost((float)(byte)10);
    boolean b37 = restaurant3.removeProduct(product29);
    com.example.unifood.models.Restaurant restaurant41 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str42 = restaurant41.getName();
    com.example.unifood.models.Restaurant restaurant43 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product44 = new com.example.unifood.models.Product();
    boolean b45 = product44.getAvailability();
    restaurant43.addProduct(product44);
    java.util.List<com.example.unifood.models.Product> list_product47 = restaurant43.getProductList();
    restaurant43.updateRating();
    java.lang.String str49 = restaurant43.getShortDescription();
    java.lang.String str50 = restaurant43.getName();
    java.util.List<com.example.unifood.models.Product> list_product51 = restaurant43.getProductList();
    restaurant41.setProductList(list_product51);
    restaurant3.setProductList(list_product51);
    com.example.unifood.models.Product product57 = new com.example.unifood.models.Product("hi!", (float)(byte)0, "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    float f58 = product57.getCost();
    restaurant3.addProduct(product57);
    java.lang.Float f60 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str42.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f58 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f60 + "' != '" + 0.0f+ "'", f60.equals(0.0f));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    com.example.unifood.exceptions.StudentException studentException0 = new com.example.unifood.exceptions.StudentException();
    java.lang.String str1 = studentException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.StudentException"+ "'", str1.equals("com.example.unifood.exceptions.StudentException"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    restaurant0.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    java.lang.String str25 = review21.getRestaurantId();
    restaurant0.addReview(review21);
    java.lang.String str27 = review21.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("f0abce46-2656-46af-99c4-cc4f3ce992d7", "00c21b13-bd60-4d6c-95c6-aa73a51a7075", (float)(short)10, "cda102ed-5d20-4a30-b455-702bfe3561b2", "6af9cce1-e394-4f10-9510-635f008d9600");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b10 = studentInfo0.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavProducts();
    boolean b13 = studentInfo0.addRestaurantToFavorites("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    boolean b15 = studentInfo0.delRestaurantFromFavorites("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0");
    studentInfo0.setCampusId("b6fd1026-57eb-4577-a667-6dac64083d57");
    studentInfo0.setCampusId("45ff5ab3-6561-44f6-9c93-3f3be9ded172");
    studentInfo0.setCampusId("090d4d8e-cace-44ee-8920-101722da86af");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b7 = university1.addCampus("87229e63-e927-4901-97ef-90801d78d9d4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("5675838f-a901-49fe-bbef-8588ac00bd79", (float)100L, "3717b6c7-b0b0-4897-b818-92659d332e3a");

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getUserId();
    review0.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    com.example.unifood.exceptions.InvalidTypeException invalidTypeException0 = new com.example.unifood.exceptions.InvalidTypeException();
    java.lang.String str1 = invalidTypeException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.InvalidTypeException"+ "'", str1.equals("com.example.unifood.exceptions.InvalidTypeException"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b23 = product22.getAvailability();
    product22.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b26 = restaurant0.removeProduct(product22);
    java.lang.String str27 = product22.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "12/03/2017"+ "'", str27.equals("12/03/2017"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str6 = product0.getDescription();
    product0.setAvailability(false);
    product0.setId("5f5c4b81-254c-4177-bece-07521f3cb9d5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    boolean b15 = campus0.addRestaurant("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("2adc96c3-f320-42fb-97f3-c22c606913fb", "67a826d0-ad9d-49db-8997-58baff1011a9", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setType("7c325c23-bce5-40b9-af79-00398f526ab9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str4.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeProduct(product13);
    boolean b19 = product13.getAvailability();
    product13.setId("8e069f68-c995-4d5a-9117-23fad524d3d9");
    java.lang.String str22 = product13.getDescription();
    java.lang.String str23 = product13.getDescription();
    boolean b24 = product13.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "396a4937-9452-484e-b1eb-dbb739fc5680"+ "'", str10.equals("396a4937-9452-484e-b1eb-dbb739fc5680"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setRestaurantId("55763602-a4bd-4dd4-9876-48d4b9c1c63a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("119f287e-61c5-497a-b55c-17489bcb03e9");
    boolean b3 = university1.addCampus("0f3a0031-4538-4866-b77f-a1045008f006");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("f71e4521-c797-403b-bb13-9b84cfa3a1f7");
    java.lang.String str2 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f71e4521-c797-403b-bb13-9b84cfa3a1f7"+ "'", str2.equals("f71e4521-c797-403b-bb13-9b84cfa3a1f7"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    java.lang.String str9 = restaurant0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    restaurant3.setName("95706a5a-e6f8-400b-9261-78253844c050");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b3 = university1.removeCampus("5da43343-cf4e-4c7d-ac37-3c06354ba0d2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    java.util.List<java.lang.String> list_str8 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("15149c67-efc5-4744-85b0-8dc2ac121df7");
    ownerInfo1.setRestaurantId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str4.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("e304f8eb-2dd5-4183-bfbc-58b30cd1b029", "b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4", "09c560d8-ad4a-4efc-a7b7-3894259139d4");
    userInfo3.setType("ef1b541b-217c-4e6a-8ace-6b62d84aad2c");

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    float f5 = product3.getCost();
    java.lang.String str6 = product3.getName();
    java.lang.String str7 = product3.getDescription();
    float f8 = product3.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "e8588626-52d3-4ed2-8bd5-24c0755bae64"+ "'", str6.equals("e8588626-52d3-4ed2-8bd5-24c0755bae64"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/03/2017"+ "'", str7.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 100.0f);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setDescription("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    product0.setAvailability(true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    userInfo0.setType("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    java.lang.String str5 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "cde62678-4a38-48f3-8486-51d54fb5e8c8"+ "'", str5.equals("cde62678-4a38-48f3-8486-51d54fb5e8c8"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("53385034-c596-4b8b-96bd-a5bd2910707a");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    boolean b15 = restaurant3.getApproved();
    restaurant3.setLocalization("f0abce46-2656-46af-99c4-cc4f3ce992d7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getName();
    boolean b10 = university1.removeCampus("0787174c-4cad-4937-8581-9e2857bc0965");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "edc47eff-c991-488a-9ea7-ea42ad9aad63"+ "'", str2.equals("edc47eff-c991-488a-9ea7-ea42ad9aad63"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "edc47eff-c991-488a-9ea7-ea42ad9aad63"+ "'", str5.equals("edc47eff-c991-488a-9ea7-ea42ad9aad63"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    studentInfo3.setCampusId("");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    studentInfo3.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    campus1.setRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    boolean b17 = campus1.addRestaurant("com.example.unifood.exceptions.InvalidProductNameException");
    boolean b19 = campus1.removeRestaurant("48af3aad-919d-4ef4-8028-3a57694cd73d");
    boolean b21 = campus1.removeRestaurant("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "fd6c7c60-1643-4f79-aaf6-7d9533a7d89f"+ "'", str2.equals("fd6c7c60-1643-4f79-aaf6-7d9533a7d89f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    java.lang.String str4 = review0.getId();
    java.lang.String str5 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("ccf553f7-d9de-49ff-80df-05ba74bcec16", "392d78ad-3469-4abe-83e2-8fc3d2096494", 10.0f, "8e069f68-c995-4d5a-9117-23fad524d3d9", "2b840dda-3718-464e-a39f-2e9719d2b246");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getType();
    java.lang.String str7 = userInfo3.getType();
    java.lang.String str8 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str6.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str7.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str8.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException0 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException1 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException0.addSuppressed((java.lang.Throwable)invalidCampusNameException1);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException3 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException1.addSuppressed((java.lang.Throwable)invalidDescriptionException3);
    com.example.unifood.exceptions.UserException userException5 = new com.example.unifood.exceptions.UserException();
    java.lang.String str6 = userException5.toString();
    invalidDescriptionException3.addSuppressed((java.lang.Throwable)userException5);
    com.example.unifood.exceptions.OwnerException ownerException8 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException9 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException8.addSuppressed((java.lang.Throwable)invalidCampusIdException9);
    java.lang.String str11 = ownerException8.toString();
    java.lang.String str12 = ownerException8.toString();
    userException5.addSuppressed((java.lang.Throwable)ownerException8);
    java.lang.Throwable throwable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    ownerException8.addSuppressed(throwable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("e304f8eb-2dd5-4183-bfbc-58b30cd1b029", "b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4", "09c560d8-ad4a-4efc-a7b7-3894259139d4");
    java.lang.String str4 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e304f8eb-2dd5-4183-bfbc-58b30cd1b029"+ "'", str4.equals("e304f8eb-2dd5-4183-bfbc-58b30cd1b029"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    java.util.List<com.example.unifood.models.Review> list_review15 = restaurant3.getReviewList();
    java.lang.String str16 = restaurant3.getName();
    java.lang.String str17 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "12/03/2017"+ "'", str16.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "12/03/2017"+ "'", str17.equals("12/03/2017"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("edf01dd6-a35a-426f-808e-d6346b5af74f");
    university1.setName("fcf4a53c-cc22-423a-bfaf-dea98ceedcea");

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    boolean b9 = studentInfo0.addProductToFavorites("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    boolean b11 = studentInfo0.delRestaurantFromFavorites("e304f8eb-2dd5-4183-bfbc-58b30cd1b029");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setType("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b");
    userInfo3.setFirstName("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    java.lang.String str8 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1fcc4f0c-26bc-4946-bf17-5d8a16792f98"+ "'", str8.equals("1fcc4f0c-26bc-4946-bf17-5d8a16792f98"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    java.lang.String str7 = restaurant3.getLocalization();
    restaurant3.setName("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.lang.String str10 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setName("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    boolean b9 = university1.addCampus("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6");
    java.util.List<java.lang.String> list_str10 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    java.lang.String str2 = studentInfo1.getCampusId();
    java.lang.String str3 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "b9a35319-fcc8-40c8-9a6c-cc193698fa7e"+ "'", str2.equals("b9a35319-fcc8-40c8-9a6c-cc193698fa7e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "b9a35319-fcc8-40c8-9a6c-cc193698fa7e"+ "'", str3.equals("b9a35319-fcc8-40c8-9a6c-cc193698fa7e"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant17.getProductList();
    restaurant3.setProductList(list_product26);
    restaurant3.setName("");
    restaurant3.setLocalization("ccd59dcf-7a32-4aa9-b3c0-6caab218d93f");
    com.example.unifood.models.Product product35 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f36 = product35.getCost();
    product35.setAvailability(false);
    product35.setId("42ff3df8-22e9-4277-9924-c3723c127d45");
    boolean b41 = restaurant3.removeProduct(product35);
    java.lang.String str42 = product35.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f36 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "42ff3df8-22e9-4277-9924-c3723c127d45"+ "'", str42.equals("42ff3df8-22e9-4277-9924-c3723c127d45"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.addRestaurantToFavorites("ba061308-092f-40b1-9a8e-465a56f359d0");
    studentInfo0.setCampusId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    boolean b10 = studentInfo0.addProductToFavorites("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review();
    review4.setId("");
    java.lang.String str7 = review4.getUserId();
    review4.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review4.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str12 = review4.getRestaurantId();
    boolean b13 = restaurant0.removeReview(review4);
    java.lang.String str14 = review4.getId();
    review4.setRate((float)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    boolean b3 = university1.addCampus("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str4 = university1.getName();
    com.example.unifood.models.Campus campus5 = new com.example.unifood.models.Campus();
    boolean b7 = campus5.removeRestaurant("hi!");
    campus5.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str10 = campus5.getRestaurants();
    java.lang.String str11 = campus5.getId();
    java.lang.String str12 = campus5.getName();
    java.lang.String str13 = campus5.getId();
    java.util.List<java.lang.String> list_str14 = campus5.getRestaurants();
    university1.setAllCampus(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4a6765dc-3fa3-4cc6-951b-6da12f6d451f"+ "'", str11.equals("4a6765dc-3fa3-4cc6-951b-6da12f6d451f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4a6765dc-3fa3-4cc6-951b-6da12f6d451f"+ "'", str13.equals("4a6765dc-3fa3-4cc6-951b-6da12f6d451f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException0 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException1 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException0.addSuppressed((java.lang.Throwable)invalidCampusNameException1);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException3 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException1.addSuppressed((java.lang.Throwable)invalidDescriptionException3);
    java.lang.Throwable throwable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    invalidDescriptionException3.addSuppressed(throwable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("c1d3b8a3-adce-431f-a302-6cd30c1e553d", "63ec1eb5-f875-4903-9752-86c4ad4c4ed9", (float)'4', "67a826d0-ad9d-49db-8997-58baff1011a9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("cf499805-54d6-4e7b-bf12-6f077f4d32ed", "429114d9-61a0-4f78-988a-207ce1bf7c5d", "e9990043-a6ec-4857-b63d-fb3f60effac6");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant7.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str10 = restaurant7.getShortDescription();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    product11.setDescription("hi!");
    java.lang.String str14 = product11.getDescription();
    boolean b15 = restaurant7.removeProduct(product11);
    product11.setName("67a826d0-ad9d-49db-8997-58baff1011a9");
    product11.setDescription("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    product11.setAvailability(true);
    restaurant3.addProduct(product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus0.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    campus0.setId("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.lang.String str18 = campus0.getId();
    boolean b20 = campus0.removeRestaurant("8664e462-8683-4210-8fa3-b99e2a278578");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "53d5e04e-abb5-45a7-a278-d742367421a0"+ "'", str18.equals("53d5e04e-abb5-45a7-a278-d742367421a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus5 = new com.example.unifood.models.Campus();
    boolean b7 = campus5.removeRestaurant("hi!");
    campus5.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str10 = campus5.getRestaurants();
    java.lang.String str11 = campus5.getId();
    java.lang.String str12 = campus5.getName();
    campus5.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str15 = campus5.getRestaurants();
    studentInfo0.setFavRestaurants(list_str15);
    boolean b18 = studentInfo0.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.util.List<java.lang.String> list_str19 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str20 = null;
    studentInfo0.setFavRestaurants(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00387c66-74c4-4462-8a1c-60f83181234e"+ "'", str11.equals("00387c66-74c4-4462-8a1c-60f83181234e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    com.example.unifood.models.Restaurant restaurant5 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant9.setName("12/03/2017");
    java.lang.String str12 = restaurant9.getUserId();
    restaurant9.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review();
    java.lang.String str16 = review15.getId();
    boolean b17 = restaurant9.equals((java.lang.Object)review15);
    restaurant9.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product();
    boolean b22 = product21.getAvailability();
    restaurant20.addProduct(product21);
    java.util.List<com.example.unifood.models.Product> list_product24 = restaurant20.getProductList();
    restaurant20.setUserId("hi!");
    restaurant20.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review29 = restaurant20.getReviewList();
    restaurant9.setReviewList(list_review29);
    restaurant5.setReviewList(list_review29);
    restaurant3.setReviewList(list_review29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "488a4dbb-94ab-477f-a161-4ce60c44a097"+ "'", str16.equals("488a4dbb-94ab-477f-a161-4ce60c44a097"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review29);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    java.lang.String str5 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("", (float)(byte)10, "59b6ade5-3811-4088-b13a-ef845448e8af");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductNameException");
    } catch (com.example.unifood.exceptions.InvalidProductNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getId();
    float f5 = review0.getRate();
    review0.setUserId("bfd7dfc1-c6e9-4ad1-9666-5b0d50bead65");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "9728848b-4ae9-472f-9679-04acb178c69c"+ "'", str4.equals("9728848b-4ae9-472f-9679-04acb178c69c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("adb74c6f-c839-47cc-b096-1c12240d6afd", "a6a15e37-de72-4c55-91a1-ffacd16484c8", 100.0f, "f855e190-a302-4805-98f4-7977f9215e99", "a7ebaf4b-ff03-4b84-bd80-94754b28f994");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str4 = product3.getName();
    product3.setDescription("dec4c4c3-fa87-4960-9380-5d3942209356");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str4.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b10 = studentInfo0.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavProducts();
    boolean b13 = studentInfo0.addRestaurantToFavorites("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    boolean b15 = studentInfo0.delRestaurantFromFavorites("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0");
    studentInfo0.setCampusId("b6fd1026-57eb-4577-a667-6dac64083d57");
    studentInfo0.setCampusId("45ff5ab3-6561-44f6-9c93-3f3be9ded172");
    java.util.List<java.lang.String> list_str20 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("b878dc6e-48f9-441a-929c-5b631521b5e8", "71a129ae-ceff-442e-a98f-035e16019be4", (float)(byte)-1, "70b5ca2b-e711-47c9-9b12-1ac5733682bc", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("22ad7b07-f59a-4272-bf9c-378211cbc4dc", "0f3a0031-4538-4866-b77f-a1045008f006", "9bb4ec51-2299-41a3-b764-2192d7b57501");
    userInfo3.setType("8922762e-c394-4758-8e43-89d8388d9c11");

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "85ed6fab-d3ad-41a7-a821-1fbba23035bb"+ "'", str9.equals("85ed6fab-d3ad-41a7-a821-1fbba23035bb"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    float f4 = product0.getCost();
    product0.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    java.util.List<java.lang.String> list_str7 = campus1.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "c16e5b62-0f31-47a6-8ed7-bfecbd323f44"+ "'", str2.equals("c16e5b62-0f31-47a6-8ed7-bfecbd323f44"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b3 = university1.addCampus("42065d2c-2510-414f-b1ed-b86067b8f731");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    float f3 = product0.getCost();
    java.lang.String str4 = product0.getDescription();
    product0.setAvailability(true);
    product0.setCost((float)1);
    product0.setAvailability(false);
    product0.setId("ab587090-a221-41ca-8734-fee2af876904");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant17.getProductList();
    restaurant3.setProductList(list_product26);
    restaurant3.setName("");
    restaurant3.setLocalization("ccd59dcf-7a32-4aa9-b3c0-6caab218d93f");
    restaurant3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("d710df2d-976a-46d0-a963-3905a87b1799", "", "de786c40-08a1-4529-9a5c-1d73b08cec1d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusIdException");
    } catch (com.example.unifood.exceptions.InvalidCampusIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str2 = university1.getName();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    university1.setName("aabd70ed-be9f-4452-9625-3f6b64c27121");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str2.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    boolean b12 = product7.getAvailability();
    product7.setId("");
    java.lang.String str15 = product7.getName();
    java.lang.String str16 = product7.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f11 = product10.getCost();
    java.lang.String str12 = product10.getId();
    restaurant0.addProduct(product10);
    java.lang.String str14 = product10.getId();
    java.lang.String str15 = product10.getName();
    product10.setAvailability(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cd560d8f-28e7-4b43-b906-20258edc001d"+ "'", str4.equals("cd560d8f-28e7-4b43-b906-20258edc001d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "027ed234-51bd-41f3-9bc7-616a2817ba9d"+ "'", str12.equals("027ed234-51bd-41f3-9bc7-616a2817ba9d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "027ed234-51bd-41f3-9bc7-616a2817ba9d"+ "'", str14.equals("027ed234-51bd-41f3-9bc7-616a2817ba9d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("850c66ab-1149-4a36-b911-3dc319169391");
    java.lang.Float f9 = restaurant0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "3d912473-a9e4-4edf-a6d1-3f6818834d70"+ "'", str4.equals("3d912473-a9e4-4edf-a6d1-3f6818834d70"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f9 + "' != '" + 0.0f+ "'", f9.equals(0.0f));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    userInfo0.setLastName("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    userInfo0.setType("8ce830fe-1366-4bd5-a822-511d9d102587");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    university1.setName("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f01dbd23-efa7-49fb-8603-33a9d3dcb96c"+ "'", str2.equals("f01dbd23-efa7-49fb-8603-33a9d3dcb96c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    product3.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    product3.setCost((float)0);
    java.lang.String str10 = product3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "12/03/2017"+ "'", str10.equals("12/03/2017"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("c1d3b8a3-adce-431f-a302-6cd30c1e553d", "46befd1b-8b45-47ff-9ce8-24209f693c28", 10.0f, "12/03/2017", "74237342-5cf5-495c-86de-c1bc12d8c326");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.University university11 = new com.example.unifood.models.University("hi!");
    java.lang.String str12 = university11.getId();
    java.lang.String[] str_array41 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    university11.setAllCampus((java.util.List<java.lang.String>)arraylist_str42);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str42);
    boolean b47 = campus0.removeRestaurant("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    java.lang.String str48 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "b697af8d-55e3-4dc7-a299-28b29d5b5e1a"+ "'", str6.equals("b697af8d-55e3-4dc7-a299-28b29d5b5e1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "c8865e1e-d199-436e-af88-60b74b0d5b95"+ "'", str12.equals("c8865e1e-d199-436e-af88-60b74b0d5b95"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str48.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    campus0.setId("");
    com.example.unifood.models.Campus campus12 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str13 = campus12.getId();
    boolean b15 = campus12.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.lang.String str16 = campus12.getId();
    boolean b18 = campus12.removeRestaurant("e2c5a479-863d-468d-b3ec-388be48481a6");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus20 = new com.example.unifood.models.Campus();
    boolean b22 = campus20.removeRestaurant("hi!");
    campus20.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str25 = campus20.getRestaurants();
    studentInfo19.setFavRestaurants(list_str25);
    java.lang.String str27 = studentInfo19.getCampusId();
    java.lang.String str28 = studentInfo19.getCampusId();
    boolean b30 = studentInfo19.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    java.lang.String[] str_array88 = new java.lang.String[] { "cde62678-4a38-48f3-8486-51d54fb5e8c8", "016f7a51-1523-4248-8cce-d7af4447fbc2", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "9cef684b-9583-4350-bc7f-52fdf83f721b", "b9a35319-fcc8-40c8-9a6c-cc193698fa7e", "2016930c-728d-45c5-a236-9c4833a30246", "2b840dda-3718-464e-a39f-2e9719d2b246", "8ce830fe-1366-4bd5-a822-511d9d102587", "8ce830fe-1366-4bd5-a822-511d9d102587", "c1d3b8a3-adce-431f-a302-6cd30c1e553d", "com.example.unifood.exceptions.UserException", "com.example.unifood.exceptions.InvalidRestaurantNameException", "5a768843-8dc8-45b5-baf6-85706b277c5f", "1cc346cd-7e37-4aa5-a18f-4211b5a529c9", "3db35cfa-ac0a-4288-9084-8d042e570026", "322c0567-95f6-47cd-bed2-9cdd49776e37", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "c0679c38-8adf-4203-85c8-515aaf773e20", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "9741db0d-f106-4ae0-9562-dbd17d50d5a3", "811f8a1d-ca60-461d-828c-6680d7547043", "322c0567-95f6-47cd-bed2-9cdd49776e37", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c", "e38e11da-1219-443d-93b7-8c6ea82bea05", "f6ca0495-0d1d-4653-b4e4-20d665aafe5f", "c81d3daf-7c34-4870-802e-061eeb5c81e5", "efbb39b8-b569-44a5-8350-5d34ec9574db", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "15149c67-efc5-4744-85b0-8dc2ac121df7", "49976e80-f69f-4380-aa76-dc904dcb2eca", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "49b07ce6-aac6-463b-a3cc-21e21430bc86", "53d5e04e-abb5-45a7-a278-d742367421a0", "9d54bba1-c011-40fe-a86a-2b02e99ae523", "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8", "09c560d8-ad4a-4efc-a7b7-3894259139d4", "", "d054f793-8da1-4b53-9056-26346d97b155", "49976e80-f69f-4380-aa76-dc904dcb2eca", "f71e4521-c797-403b-bb13-9b84cfa3a1f7", "090d4d8e-cace-44ee-8920-101722da86af", "9e087ae8-80e1-4932-9bf9-0925df2c9f7e", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "a04223f0-b1c0-449c-afab-59a81cef4343", "e2c7a34a-8060-4430-9d69-dd5848b101c6", "7b379d86-fcc6-43c8-a85d-c887cc492e73", "15149c67-efc5-4744-85b0-8dc2ac121df7", "a339ea1e-a8f5-4f77-af1e-264cde0ed0dd", "7fb4b671-eeeb-4d73-8c40-91baed7167c3", "016f7a51-1523-4248-8cce-d7af4447fbc2", "8e6dda6d-66e5-4521-8634-e164e3b1c34c", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "8ce830fe-1366-4bd5-a822-511d9d102587" };
    java.util.ArrayList<java.lang.String> arraylist_str89 = new java.util.ArrayList<java.lang.String>();
    boolean b90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str89, str_array88);
    studentInfo19.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str89);
    campus12.setRestaurants((java.util.List<java.lang.String>)arraylist_str89);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str89);
    com.example.unifood.models.University university95 = new com.example.unifood.models.University("hi!");
    boolean b97 = university95.removeCampus("hi!");
    java.util.List<java.lang.String> list_str98 = university95.getAllCampus();
    campus0.setRestaurants(list_str98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "db32dad4-1897-4e87-9198-afc34d07d431"+ "'", str6.equals("db32dad4-1897-4e87-9198-afc34d07d431"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "db32dad4-1897-4e87-9198-afc34d07d431"+ "'", str8.equals("db32dad4-1897-4e87-9198-afc34d07d431"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "18040e04-0844-4cac-8d6c-c57f545a74d8"+ "'", str13.equals("18040e04-0844-4cac-8d6c-c57f545a74d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "18040e04-0844-4cac-8d6c-c57f545a74d8"+ "'", str16.equals("18040e04-0844-4cac-8d6c-c57f545a74d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str98);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    restaurant0.setShortDescription("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant0.getReviewList();
    java.lang.String str13 = restaurant0.getCampusId();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant17.getApproved();
    java.lang.String str19 = restaurant17.getId();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review25.setUserId("");
    java.lang.String str28 = review25.getUserId();
    review25.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b31 = restaurant17.removeReview(review25);
    boolean b32 = restaurant0.equals((java.lang.Object)review25);
    restaurant0.setShortDescription("f923bbf8-46b6-4279-9cf8-11e1ff2d5c5b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "7b9b4bea-19ad-42b7-b753-2c811dd9acaf"+ "'", str19.equals("7b9b4bea-19ad-42b7-b753-2c811dd9acaf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("03d6f458-9b02-4a10-bdd2-2aab61b1d4de");
    java.lang.String str2 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "03d6f458-9b02-4a10-bdd2-2aab61b1d4de"+ "'", str2.equals("03d6f458-9b02-4a10-bdd2-2aab61b1d4de"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str6.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    product3.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    product3.setCost((float)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "239d950c-a53b-45db-9e8f-483a040e426a"+ "'", str2.equals("239d950c-a53b-45db-9e8f-483a040e426a"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.String str3 = ownerException0.toString();
    java.lang.Throwable[] throwable_array4 = ownerException0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str3.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    userInfo3.setLastName("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5");
    java.lang.String str6 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5"+ "'", str6.equals("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    java.lang.String str9 = campus0.getId();
    campus0.setId("");
    boolean b13 = campus0.removeRestaurant("f923bbf8-46b6-4279-9cf8-11e1ff2d5c5b");
    boolean b15 = campus0.removeRestaurant("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0b671c11-3de0-49a2-9ab6-83c364a53d1a"+ "'", str6.equals("0b671c11-3de0-49a2-9ab6-83c364a53d1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0b671c11-3de0-49a2-9ab6-83c364a53d1a"+ "'", str8.equals("0b671c11-3de0-49a2-9ab6-83c364a53d1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0b671c11-3de0-49a2-9ab6-83c364a53d1a"+ "'", str9.equals("0b671c11-3de0-49a2-9ab6-83c364a53d1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = campus0.getName();
    java.lang.String str10 = campus0.getName();
    com.example.unifood.models.Campus campus11 = new com.example.unifood.models.Campus();
    boolean b13 = campus11.removeRestaurant("hi!");
    campus11.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str16 = campus11.getRestaurants();
    boolean b18 = campus11.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b20 = campus11.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b22 = campus11.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b24 = campus11.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus11.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.util.List<java.lang.String> list_str27 = campus11.getRestaurants();
    boolean b29 = campus11.removeRestaurant("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    campus11.setId("38e9601d-4195-43c5-8f2c-566c2ef91772");
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b35 = studentInfo33.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.util.List<java.lang.String> list_str36 = studentInfo33.getFavProducts();
    campus11.setRestaurants(list_str36);
    campus0.setRestaurants(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0cfcdbeb-be42-4396-b8dd-583d1c141f80"+ "'", str6.equals("0cfcdbeb-be42-4396-b8dd-583d1c141f80"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str10.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str15 = restaurant3.getCampusId();
    restaurant3.setCampusId("82a3735c-51a5-4196-b1e2-ba5966598a25");
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product("1cc346cd-7e37-4aa5-a18f-4211b5a529c9", (float)10L, "15149c67-efc5-4744-85b0-8dc2ac121df7");
    product21.setCost((float)(short)10);
    restaurant3.addProduct(product21);
    restaurant3.updateRating();
    java.lang.String str26 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "82a3735c-51a5-4196-b1e2-ba5966598a25"+ "'", str26.equals("82a3735c-51a5-4196-b1e2-ba5966598a25"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getCampusId();
    restaurant0.setCampusId("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    restaurant0.setUserId("a339ea1e-a8f5-4f77-af1e-264cde0ed0dd");
    restaurant0.setShortDescription("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    java.lang.String str14 = review12.getComment();
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review();
    review15.setId("");
    java.lang.String str18 = review15.getUserId();
    java.lang.String str19 = review15.getRestaurantId();
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getDate();
    java.lang.String str22 = review20.getComment();
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    java.lang.String str24 = review23.getDate();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    java.lang.String str26 = review25.getId();
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getId();
    boolean b36 = restaurant27.removeReview(review34);
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getDate();
    java.lang.String str39 = review37.getComment();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setRate((float)10L);
    review40.setDate("hi!");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review50.setUserId("");
    com.example.unifood.models.Review[] review_array53 = new com.example.unifood.models.Review[] { review9, review12, review15, review20, review23, review25, review34, review37, review40, review50 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review54 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review54, review_array53);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review54);
    restaurant3.setName("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review64.setUserId("");
    java.lang.String str67 = review64.getUserId();
    float f68 = review64.getRate();
    review64.setRestaurantId("c7492f51-751c-49fa-9823-c9ff6db2c39f");
    boolean b71 = restaurant3.removeReview(review64);
    java.lang.String str72 = review64.getUserId();
    review64.setRate((float)(short)10);
    java.lang.String str75 = review64.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "5ded886a-3fa7-4a68-be6f-6c24c22c35f3"+ "'", str26.equals("5ded886a-3fa7-4a68-be6f-6c24c22c35f3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "64ae221d-667d-437f-870b-fef02d80a5de"+ "'", str35.equals("64ae221d-667d-437f-870b-fef02d80a5de"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + ""+ "'", str67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f68 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + ""+ "'", str72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("b7a30b3f-b42e-4837-9603-7c47ef1ae682");

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("a1c6cab2-02e3-48dc-8d5c-893212f3e1a9", "e0ff690d-cc70-4ca7-8c59-adec9fbb61de", 32.0f, "4a1faca8-27ea-4dd8-9833-9159f8937bd9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setName("f65fd1ab-e41f-47d2-a90c-f40397952597");

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setCampusId("com.example.unifood.exceptions.OwnerException");
    com.example.unifood.models.Review review16 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review16.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    restaurant0.addReview(review16);
    float f20 = review16.getRate();
    review16.setDate("64a174b7-c8e6-48f7-bd49-217619611384");
    review16.setRestaurantId("e9235121-99bf-400f-b59d-c6c80d92e3b8");
    java.lang.String str25 = review16.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "64a174b7-c8e6-48f7-bd49-217619611384"+ "'", str25.equals("64a174b7-c8e6-48f7-bd49-217619611384"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    boolean b13 = restaurant9.getApproved();
    java.util.List<com.example.unifood.models.Product> list_product14 = null;
    restaurant9.setProductList(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5905c9ec-8594-480a-98d9-f263a8aa7afa"+ "'", str5.equals("5905c9ec-8594-480a-98d9-f263a8aa7afa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeProduct(product13);
    boolean b19 = product13.getAvailability();
    product13.setId("8e069f68-c995-4d5a-9117-23fad524d3d9");
    java.lang.String str22 = product13.getDescription();
    java.lang.String str23 = product13.getDescription();
    product13.setName("72da193f-87b2-493c-bf64-0b447b98f52a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1e6f9c22-8d05-422f-a097-950b251e2a74"+ "'", str10.equals("1e6f9c22-8d05-422f-a097-950b251e2a74"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("5cad58f0-a042-4e13-90be-466b381fa540", "a6bf0ef2-fb6e-4cb6-8394-1d24ac774bd0", 100.0f, "d6f2d706-bf0f-4b13-8c1d-025b9740c5ba", "028d9e90-8f7a-426f-9bb1-f298fcad31ed");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    product0.setCost((float)(short)0);
    java.lang.String str7 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    product7.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b11 = product7.getAvailability();
    boolean b12 = restaurant0.removeProduct(product7);
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str17 = restaurant16.getName();
    restaurant0.update(restaurant16);
    java.lang.String str19 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str17.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a2aa7eb7-a775-435b-9fe6-380043fd44c8"+ "'", str19.equals("a2aa7eb7-a775-435b-9fe6-380043fd44c8"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    studentInfo1.setCampusId("f71e4521-c797-403b-bb13-9b84cfa3a1f7");
    boolean b5 = studentInfo1.addProductToFavorites("1e60986b-63af-45ae-bb3c-cdc613474aff");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setAvailability(false);
    product3.setName("ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    product3.setCost((float)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    review12.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review12.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeReview(review12);
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.lang.String str23 = restaurant19.getId();
    restaurant19.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.update(restaurant19);
    restaurant0.setCampusId("a7dabb6b-5097-4ecc-a832-8624bb019f5f");
    com.example.unifood.models.Restaurant restaurant29 = null;
    // The following exception was thrown during execution in test generation
    try {
    restaurant0.update(restaurant29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "78727a8f-699e-464e-8ee8-be0980d2e483"+ "'", str10.equals("78727a8f-699e-464e-8ee8-be0980d2e483"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "f078bb62-b596-4c4e-b144-cfdfe59f6f43"+ "'", str23.equals("f078bb62-b596-4c4e-b144-cfdfe59f6f43"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c31f3d5f-78cf-4dfa-8587-cc944b8072df", "c8be3a66-b9ec-40e5-81b7-94a4ee8d939a", "8922762e-c394-4758-8e43-89d8388d9c11");

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str6 = university1.getName();
    boolean b8 = university1.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university10 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus11 = new com.example.unifood.models.Campus();
    boolean b13 = campus11.removeRestaurant("hi!");
    campus11.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str16 = campus11.getRestaurants();
    university10.setAllCampus(list_str16);
    java.util.List<java.lang.String> list_str18 = university10.getAllCampus();
    university1.setAllCampus(list_str18);
    java.util.List<java.lang.String> list_str20 = university1.getAllCampus();
    com.example.unifood.models.Campus campus21 = new com.example.unifood.models.Campus();
    boolean b23 = campus21.removeRestaurant("hi!");
    campus21.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str26 = campus21.getRestaurants();
    java.lang.String str27 = campus21.getId();
    java.lang.String str28 = campus21.getName();
    campus21.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str31 = campus21.getRestaurants();
    com.example.unifood.models.StudentInfo studentInfo32 = new com.example.unifood.models.StudentInfo();
    studentInfo32.setCampusId("");
    studentInfo32.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo32.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str39 = studentInfo32.getFavProducts();
    campus21.setRestaurants(list_str39);
    university1.setAllCampus(list_str39);
    boolean b43 = university1.addCampus("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    java.util.List<java.lang.String> list_str44 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "58f62521-916b-4794-9575-f2e814108adf"+ "'", str27.equals("58f62521-916b-4794-9575-f2e814108adf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str28.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    restaurant3.setCampusId("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.lang.String str8 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/03/2017"+ "'", str8.equals("12/03/2017"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.University university11 = new com.example.unifood.models.University("hi!");
    java.lang.String str12 = university11.getId();
    java.lang.String[] str_array41 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    university11.setAllCampus((java.util.List<java.lang.String>)arraylist_str42);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str42);
    boolean b47 = campus0.addRestaurant("5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str48 = campus0.getId();
    boolean b50 = campus0.addRestaurant("61147561-d24f-4a49-b295-70696006c96d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1590669e-f842-461a-8298-36f281e91a9e"+ "'", str6.equals("1590669e-f842-461a-8298-36f281e91a9e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a168391a-9f26-4a84-960a-4f621dfd173e"+ "'", str12.equals("a168391a-9f26-4a84-960a-4f621dfd173e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str48.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    boolean b15 = restaurant3.getApproved();
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str20 = restaurant19.getShortDescription();
    java.lang.Float f21 = restaurant19.getRate();
    restaurant19.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f24 = restaurant19.getRate();
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant28.setName("12/03/2017");
    java.lang.String str31 = restaurant28.getUserId();
    restaurant28.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getId();
    boolean b36 = restaurant28.equals((java.lang.Object)review34);
    restaurant19.update(restaurant28);
    com.example.unifood.models.Review review43 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review43.setUserId("");
    review43.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    float f48 = review43.getRate();
    boolean b49 = restaurant28.removeReview(review43);
    review43.setComment("0daa91b1-d5d0-4037-891c-58f0636ac1bc");
    restaurant3.addReview(review43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f21 + "' != '" + 0.0f+ "'", f21.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f24 + "' != '" + 0.0f+ "'", f24.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "f1a38d36-527d-45f5-82f7-a9fc8da0f531"+ "'", str35.equals("f1a38d36-527d-45f5-82f7-a9fc8da0f531"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f48 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.updateRating();
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    restaurant4.addProduct(product5);
    java.util.List<com.example.unifood.models.Product> list_product8 = restaurant4.getProductList();
    restaurant4.setUserId("hi!");
    restaurant4.setName("12/03/2017");
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review();
    java.lang.String str14 = review13.getId();
    boolean b15 = restaurant4.removeReview(review13);
    com.example.unifood.models.Review review16 = new com.example.unifood.models.Review();
    review16.setId("");
    java.lang.String str19 = review16.getUserId();
    review16.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str22 = review16.getRestaurantId();
    boolean b23 = restaurant4.removeReview(review16);
    review16.setRestaurantId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    restaurant0.addReview(review16);
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setUserId("hi!");
    restaurant27.setName("12/03/2017");
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    java.lang.String str37 = review36.getId();
    boolean b38 = restaurant27.removeReview(review36);
    com.example.unifood.models.Restaurant restaurant39 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product40 = new com.example.unifood.models.Product();
    boolean b41 = product40.getAvailability();
    restaurant39.addProduct(product40);
    product40.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b45 = restaurant27.removeProduct(product40);
    product40.setCost((float)100);
    boolean b48 = restaurant0.removeProduct(product40);
    com.example.unifood.models.Restaurant restaurant52 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant52.setName("12/03/2017");
    java.lang.String str55 = restaurant52.getUserId();
    restaurant52.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review();
    java.lang.String str59 = review58.getId();
    boolean b60 = restaurant52.equals((java.lang.Object)review58);
    boolean b62 = restaurant52.equals((java.lang.Object)(byte)-1);
    com.example.unifood.models.Restaurant restaurant63 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product64 = new com.example.unifood.models.Product();
    boolean b65 = product64.getAvailability();
    restaurant63.addProduct(product64);
    boolean b67 = restaurant52.removeProduct(product64);
    restaurant0.addProduct(product64);
    com.example.unifood.models.Restaurant restaurant69 = new com.example.unifood.models.Restaurant();
    java.lang.String str70 = restaurant69.getUserId();
    restaurant69.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant69.updateRating();
    restaurant69.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product76 = new com.example.unifood.models.Product();
    boolean b77 = product76.getAvailability();
    product76.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b80 = product76.getAvailability();
    boolean b81 = restaurant69.removeProduct(product76);
    com.example.unifood.models.Restaurant restaurant85 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant85.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.util.List<com.example.unifood.models.Review> list_review88 = restaurant85.getReviewList();
    restaurant69.setReviewList(list_review88);
    restaurant0.setReviewList(list_review88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "7d40e1e0-0e93-44f9-b76d-6ad8bc0170eb"+ "'", str14.equals("7d40e1e0-0e93-44f9-b76d-6ad8bc0170eb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "d24e774f-b96c-4734-8716-7660070ed6c9"+ "'", str37.equals("d24e774f-b96c-4734-8716-7660070ed6c9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "bfdf79ec-4de1-4046-a349-5b7be8537764"+ "'", str59.equals("bfdf79ec-4de1-4046-a349-5b7be8537764"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + ""+ "'", str70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review88);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    userInfo3.setLastName("23fa2178-de19-425a-9618-737d5c76fcc3");

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    java.lang.String str12 = campus0.getName();
    boolean b14 = campus0.removeRestaurant("9728848b-4ae9-472f-9679-04acb178c69c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("62987e65-841a-4428-9a65-871cfb981131");

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    com.example.unifood.models.Product product9 = new com.example.unifood.models.Product();
    product9.setDescription("hi!");
    java.lang.String str12 = product9.getDescription();
    product9.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b15 = restaurant0.removeProduct(product9);
    java.lang.Float f16 = restaurant0.getRate();
    java.lang.String str17 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f16 + "' != '" + 0.0f+ "'", f16.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "3120c7d1-27d9-44f5-b78a-4afc3874fa27"+ "'", str17.equals("3120c7d1-27d9-44f5-b78a-4afc3874fa27"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    restaurant9.setUserId("hi!");
    restaurant9.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product18 = restaurant9.getProductList();
    restaurant3.setProductList(list_product18);
    java.lang.String str20 = restaurant3.getLocalization();
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str25 = restaurant24.getShortDescription();
    java.lang.Float f26 = restaurant24.getRate();
    restaurant24.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product30 = new com.example.unifood.models.Product();
    boolean b31 = product30.getAvailability();
    restaurant29.addProduct(product30);
    java.util.List<com.example.unifood.models.Product> list_product33 = restaurant29.getProductList();
    restaurant29.setUserId("hi!");
    restaurant29.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str38 = restaurant29.getCampusId();
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant42.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str45 = restaurant42.getShortDescription();
    boolean b47 = restaurant42.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    review48.setId("");
    java.lang.String str51 = review48.getUserId();
    review48.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f54 = review48.getRate();
    boolean b55 = restaurant42.removeReview(review48);
    com.example.unifood.models.Restaurant restaurant56 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product57 = new com.example.unifood.models.Product();
    boolean b58 = product57.getAvailability();
    restaurant56.addProduct(product57);
    java.util.List<com.example.unifood.models.Product> list_product60 = restaurant56.getProductList();
    restaurant56.setUserId("hi!");
    restaurant56.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product65 = restaurant56.getProductList();
    restaurant42.setProductList(list_product65);
    restaurant29.setProductList(list_product65);
    restaurant24.setProductList(list_product65);
    restaurant3.setProductList(list_product65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str20.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f26 + "' != '" + 0.0f+ "'", f26.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f54 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product65);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getUserId();
    java.lang.String str3 = review0.getComment();
    java.lang.String str4 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9af82747-9c84-450f-ab4f-aec0067c1556"+ "'", str1.equals("9af82747-9c84-450f-ab4f-aec0067c1556"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setRate(10.0f);
    review0.setRestaurantId("53d740cc-3498-48a3-8d69-2631da037847");
    review0.setDate("f0abce46-2656-46af-99c4-cc4f3ce992d7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getName();
    java.lang.String str2 = campus0.getId();
    java.lang.String str3 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "03825168-f8c0-4a5e-bee1-6a9503b76215"+ "'", str2.equals("03825168-f8c0-4a5e-bee1-6a9503b76215"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "03825168-f8c0-4a5e-bee1-6a9503b76215"+ "'", str3.equals("03825168-f8c0-4a5e-bee1-6a9503b76215"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("cf499805-54d6-4e7b-bf12-6f077f4d32ed", "429114d9-61a0-4f78-988a-207ce1bf7c5d", "e9990043-a6ec-4857-b63d-fb3f60effac6");
    restaurant3.setName("74f95efc-4632-4202-8762-1b343f4d768b");

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    boolean b5 = studentInfo1.delProductFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    boolean b7 = studentInfo1.delProductFromFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    studentInfo8.setCampusId("");
    studentInfo8.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo8.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b16 = studentInfo8.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus18 = new com.example.unifood.models.Campus();
    boolean b20 = campus18.removeRestaurant("hi!");
    campus18.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str23 = campus18.getRestaurants();
    studentInfo17.setFavRestaurants(list_str23);
    studentInfo8.setFavProducts(list_str23);
    java.util.List<java.lang.String> list_str26 = studentInfo8.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str26);
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7a653f47-c1df-45ff-ae1f-b877ee03e2fc"+ "'", str5.equals("7a653f47-c1df-45ff-ae1f-b877ee03e2fc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str14 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str15 = studentInfo0.getFavProducts();
    boolean b17 = studentInfo0.delProductFromFavorites("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str18 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str14.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getUserId();
    review0.setRate((float)1L);
    java.lang.String str7 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.updateRating();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant9.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str12 = restaurant9.getLocalization();
    java.lang.String str13 = restaurant9.getCampusId();
    java.lang.String str14 = restaurant9.getName();
    restaurant9.updateRating();
    restaurant0.update(restaurant9);
    restaurant9.setLocalization("a838cd01-d14c-4a55-bb8a-f2dbe9d18ed2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str12.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str13.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str14.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    ownerInfo1.setRestaurantId("hi!");
    ownerInfo1.setRestaurantId("0229ea27-a568-4fbb-b746-44d3922125ef");

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    boolean b7 = university1.removeCampus("2688a34f-d13c-4dac-8b6f-83522c9be91d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4c9327c3-ac82-4a5a-9401-9139fea602da"+ "'", str2.equals("4c9327c3-ac82-4a5a-9401-9139fea602da"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.addRestaurantToFavorites("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str7 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str7.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("238114aa-d8cb-4de7-84e9-2cbd67b9bed6", "3db35cfa-ac0a-4288-9084-8d042e570026", (float)100, "de786c40-08a1-4529-9a5c-1d73b08cec1d", "f56551c3-7958-4c53-9dfb-322009fc47b0");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    java.lang.String str14 = review12.getComment();
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review();
    review15.setId("");
    java.lang.String str18 = review15.getUserId();
    java.lang.String str19 = review15.getRestaurantId();
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getDate();
    java.lang.String str22 = review20.getComment();
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    java.lang.String str24 = review23.getDate();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    java.lang.String str26 = review25.getId();
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getId();
    boolean b36 = restaurant27.removeReview(review34);
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getDate();
    java.lang.String str39 = review37.getComment();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setRate((float)10L);
    review40.setDate("hi!");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review50.setUserId("");
    com.example.unifood.models.Review[] review_array53 = new com.example.unifood.models.Review[] { review9, review12, review15, review20, review23, review25, review34, review37, review40, review50 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review54 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review54, review_array53);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review54);
    restaurant3.setName("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");
    java.lang.String str59 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "f1075df9-f286-462a-8dd0-d8f9bae65121"+ "'", str26.equals("f1075df9-f286-462a-8dd0-d8f9bae65121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "3c61b557-9564-4b23-b1ab-d112ba97627c"+ "'", str35.equals("3c61b557-9564-4b23-b1ab-d112ba97627c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("bd6ba047-d3b3-4365-b3c1-e5c4068052c1");
    java.lang.String str2 = campus1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "70b4929c-9054-4962-bf93-0ab8fef598b0"+ "'", str2.equals("70b4929c-9054-4962-bf93-0ab8fef598b0"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    review5.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    review5.setDate("5f549e06-72c7-4c21-9698-5857aa4f3922");
    review5.setComment("fe163ce7-43b1-4bf0-8441-0df49312a735");

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    com.example.unifood.models.University university0 = new com.example.unifood.models.University();
    university0.setName("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str3 = university0.getName();
    java.lang.String str4 = university0.getName();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo();
    studentInfo5.setCampusId("");
    java.util.List<java.lang.String> list_str8 = studentInfo5.getFavRestaurants();
    boolean b10 = studentInfo5.delProductFromFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    java.util.List<java.lang.String> list_str11 = studentInfo5.getFavRestaurants();
    university0.setAllCampus(list_str11);
    java.lang.String str13 = university0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str3.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str4.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d255af9a-b76d-43de-9ac7-c782a9a20824"+ "'", str13.equals("d255af9a-b76d-43de-9ac7-c782a9a20824"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str2 = university1.getName();
    university1.setId("3587eec9-cda9-4168-9830-7f6b8c414f9a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str2.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str4 = restaurant3.getName();
    java.lang.String str5 = restaurant3.getId();
    restaurant3.setCampusId("16bc091e-53dc-406d-8c7e-15d5c23036ca");
    restaurant3.setShortDescription("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str4.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7112ad78-afe2-4681-bb63-66c58d50e07e"+ "'", str5.equals("7112ad78-afe2-4681-bb63-66c58d50e07e"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    review0.setRestaurantId("235b3d9e-76ed-4ea6-93de-8bc06052762f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("3eb01d1b-8df4-4077-9221-8c1b6b20a4fb", "0f3a0031-4538-4866-b77f-a1045008f006", (float)100, "a6a15e37-de72-4c55-91a1-ffacd16484c8", "46f9268d-e951-4e27-bd0d-641c5497edc9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setRate((float)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("50dddc45-0f79-46bb-ac93-9f188aafc8e0");

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("9626d0ba-fe19-4356-a232-426c972c7dfc", "4f54b634-288e-42c6-b781-2869535b5bb5", 0.0f, "f666c841-c560-4874-8cbd-008c848d1f42");
    review4.setId("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("82a3735c-51a5-4196-b1e2-ba5966598a25", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c");
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    restaurant4.addProduct(product5);
    java.util.List<com.example.unifood.models.Product> list_product8 = restaurant4.getProductList();
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b13 = restaurant12.getApproved();
    java.lang.String str14 = restaurant12.getId();
    restaurant4.update(restaurant12);
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product();
    boolean b18 = product17.getAvailability();
    restaurant16.addProduct(product17);
    java.util.List<com.example.unifood.models.Product> list_product20 = restaurant16.getProductList();
    restaurant16.setUserId("hi!");
    restaurant16.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str29 = restaurant28.getUserId();
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant33.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str36 = restaurant33.getShortDescription();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getDate();
    java.lang.String str39 = review37.getComment();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setId("");
    java.lang.String str43 = review40.getUserId();
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setRate((float)10L);
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    java.lang.String str50 = review47.getUserId();
    java.lang.String str51 = review47.getRestaurantId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review();
    review52.setId("");
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review60.setUserId("");
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review();
    java.lang.String str64 = review63.getDate();
    java.lang.String str65 = review63.getComment();
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    review66.setId("");
    com.example.unifood.models.Review review69 = new com.example.unifood.models.Review();
    review69.setId("");
    java.lang.String str72 = review69.getUserId();
    java.lang.String str73 = review69.getRestaurantId();
    java.lang.String str74 = review69.getDate();
    com.example.unifood.models.Review review75 = new com.example.unifood.models.Review();
    java.lang.String str76 = review75.getId();
    com.example.unifood.models.Review review82 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review82.setUserId("");
    com.example.unifood.models.Review review85 = new com.example.unifood.models.Review();
    review85.setId("");
    com.example.unifood.models.Review[] review_array88 = new com.example.unifood.models.Review[] { review37, review40, review44, review47, review52, review60, review63, review66, review69, review75, review82, review85 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review89 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b90 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review89, review_array88);
    restaurant33.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review89);
    java.util.List<com.example.unifood.models.Product> list_product92 = restaurant33.getProductList();
    restaurant28.setProductList(list_product92);
    restaurant16.setProductList(list_product92);
    restaurant12.setProductList(list_product92);
    boolean b96 = restaurant3.equals((java.lang.Object)list_product92);
    restaurant3.setLocalization("1aa0d499-6b74-40e4-ae8d-5c2cd81523c3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "971840e2-7f03-4c42-86c0-e2896f455dc8"+ "'", str14.equals("971840e2-7f03-4c42-86c0-e2896f455dc8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "bdf95a57-5b98-4b3c-a89e-8a8d8377d616"+ "'", str76.equals("bdf95a57-5b98-4b3c-a89e-8a8d8377d616"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setFirstName("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    userInfo0.setFirstName("");
    userInfo0.setType("b9f0aa13-89e0-43e3-8cfd-757491affeff");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("5ed892b7-8b07-4339-8318-fe7c666739ed", (float)'#', "7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    java.lang.String str4 = product3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5ed892b7-8b07-4339-8318-fe7c666739ed"+ "'", str4.equals("5ed892b7-8b07-4339-8318-fe7c666739ed"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    product5.setCost((float)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant17.getProductList();
    restaurant3.setProductList(list_product26);
    restaurant3.setName("");
    restaurant3.setLocalization("ccd59dcf-7a32-4aa9-b3c0-6caab218d93f");
    com.example.unifood.models.Product product35 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f36 = product35.getCost();
    product35.setAvailability(false);
    product35.setId("42ff3df8-22e9-4277-9924-c3723c127d45");
    boolean b41 = restaurant3.removeProduct(product35);
    restaurant3.setCampusId("430eb310-03ac-4a61-9c78-e4ed541082c4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f36 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setCampusId("com.example.unifood.exceptions.OwnerException");
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("b80d0c79-546e-4f90-8fb2-cf05b7896bcc", "71a129ae-ceff-442e-a98f-035e16019be4", "");

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("0787174c-4cad-4937-8581-9e2857bc0965", "2688a34f-d13c-4dac-8b6f-83522c9be91d", (float)10, "42b8c9a6-a014-4a39-b2af-ca3bffb7a25e");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getUserId();
    review0.setRestaurantId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    float f5 = review0.getRate();
    java.lang.String str6 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "b2d2a2e5-86f2-4b88-9de2-25cffd9ced7a"+ "'", str1.equals("b2d2a2e5-86f2-4b88-9de2-25cffd9ced7a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00a80698-5dcc-4f53-8de2-eaec89537d25"+ "'", str6.equals("00a80698-5dcc-4f53-8de2-eaec89537d25"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.addRestaurantToFavorites("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    studentInfo12.setCampusId("");
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    studentInfo24.setCampusId("");
    studentInfo24.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo24.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str31 = studentInfo24.getFavProducts();
    studentInfo12.setFavProducts(list_str31);
    com.example.unifood.models.Campus campus33 = new com.example.unifood.models.Campus();
    boolean b35 = campus33.removeRestaurant("hi!");
    campus33.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str38 = campus33.getRestaurants();
    studentInfo12.setFavRestaurants(list_str38);
    studentInfo0.setFavRestaurants(list_str38);
    boolean b42 = studentInfo0.delRestaurantFromFavorites("edc47eff-c991-488a-9ea7-ea42ad9aad63");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("2130c8e6-fe0d-42bc-9ac9-1ffecaf802a3", "52d95481-1e46-40d0-acca-334901b04410", (float)10, "5cc13964-43ac-4253-b71c-ea9fd24a692f", "791f8349-92dc-4d5c-9e5b-4f0889f1e9b0");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    review0.setId("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    review0.setId("7b379d86-fcc6-43c8-a85d-c887cc492e73");
    review0.setRestaurantId("791f8349-92dc-4d5c-9e5b-4f0889f1e9b0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d242ac4c-f8bf-426f-99c2-364739f2367e"+ "'", str2.equals("d242ac4c-f8bf-426f-99c2-364739f2367e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("3717b6c7-b0b0-4897-b818-92659d332e3a", "e2c7a34a-8060-4430-9d69-dd5848b101c6", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidLocalizationException");
    } catch (com.example.unifood.exceptions.InvalidLocalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    boolean b5 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("87229e63-e927-4901-97ef-90801d78d9d4", "ccd59dcf-7a32-4aa9-b3c0-6caab218d93f", "7112ad78-afe2-4681-bb63-66c58d50e07e");

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("49976e80-f69f-4380-aa76-dc904dcb2eca", (-1.0f), "f9aed092-86fa-4154-b725-059acdbc7d63");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductCostException");
    } catch (com.example.unifood.exceptions.InvalidProductCostException e) {
      // Expected exception.
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getId();
    product3.setDescription("d0efb8a3-3c54-4621-acb0-0ceb72881372");
    product3.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    product3.setName("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "6c07bb61-3238-4cd2-8b15-803092b90294"+ "'", str5.equals("6c07bb61-3238-4cd2-8b15-803092b90294"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    com.example.unifood.exceptions.InvalidTypeException invalidTypeException0 = new com.example.unifood.exceptions.InvalidTypeException();
    java.lang.Throwable throwable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    invalidTypeException0.addSuppressed(throwable1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getUserId();
    review0.setRate(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b23 = product22.getAvailability();
    product22.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b26 = restaurant0.removeProduct(product22);
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setUserId("hi!");
    restaurant27.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review36 = restaurant27.getReviewList();
    com.example.unifood.models.Restaurant restaurant37 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product38 = new com.example.unifood.models.Product();
    boolean b39 = product38.getAvailability();
    restaurant37.addProduct(product38);
    java.util.List<com.example.unifood.models.Product> list_product41 = restaurant37.getProductList();
    restaurant37.setUserId("hi!");
    restaurant37.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    boolean b46 = restaurant27.equals((java.lang.Object)"3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str47 = restaurant27.getUserId();
    com.example.unifood.models.Restaurant restaurant51 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str52 = restaurant51.getShortDescription();
    java.lang.Float f53 = restaurant51.getRate();
    com.example.unifood.models.Restaurant restaurant54 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product55 = new com.example.unifood.models.Product();
    boolean b56 = product55.getAvailability();
    restaurant54.addProduct(product55);
    java.util.List<com.example.unifood.models.Product> list_product58 = restaurant54.getProductList();
    restaurant54.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Restaurant restaurant61 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product62 = new com.example.unifood.models.Product();
    boolean b63 = product62.getAvailability();
    restaurant61.addProduct(product62);
    java.util.List<com.example.unifood.models.Product> list_product65 = restaurant61.getProductList();
    restaurant61.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant61.setApproved(false);
    com.example.unifood.models.Restaurant restaurant70 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product71 = new com.example.unifood.models.Product();
    boolean b72 = product71.getAvailability();
    restaurant70.addProduct(product71);
    restaurant70.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant61.update(restaurant70);
    java.util.List<com.example.unifood.models.Review> list_review77 = restaurant61.getReviewList();
    restaurant54.setReviewList(list_review77);
    restaurant51.setReviewList(list_review77);
    boolean b80 = restaurant27.equals((java.lang.Object)list_review77);
    restaurant0.setReviewList(list_review77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f53 + "' != '" + 0.0f+ "'", f53.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    java.lang.String str6 = restaurant0.getLocalization();
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    java.lang.String str8 = restaurant7.getUserId();
    java.lang.String str9 = restaurant7.getLocalization();
    restaurant7.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    product12.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product12.setAvailability(true);
    product12.setCost((float)(byte)10);
    restaurant7.addProduct(product12);
    java.lang.String str21 = product12.getDescription();
    java.lang.String str22 = product12.getId();
    restaurant0.addProduct(product12);
    java.lang.String str24 = product12.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str21.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "f0d566cb-cf48-40dc-b17a-8082bca32a82"+ "'", str22.equals("f0d566cb-cf48-40dc-b17a-8082bca32a82"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "f0d566cb-cf48-40dc-b17a-8082bca32a82"+ "'", str24.equals("f0d566cb-cf48-40dc-b17a-8082bca32a82"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.util.List<com.example.unifood.models.Product> list_product2 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product2);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str2.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    boolean b12 = product7.getAvailability();
    boolean b13 = product7.getAvailability();
    product7.setAvailability(false);
    product7.setCost((float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    product3.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    product3.setCost((float)0);
    product3.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    java.lang.String str12 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d6f3b56e-06b1-4ffe-af0b-6861611c3b37"+ "'", str4.equals("d6f3b56e-06b1-4ffe-af0b-6861611c3b37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d6f3b56e-06b1-4ffe-af0b-6861611c3b37"+ "'", str12.equals("d6f3b56e-06b1-4ffe-af0b-6861611c3b37"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    restaurant9.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.update(restaurant9);
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant0.getReviewList();
    restaurant0.setId("f8c20ede-2bde-4e30-8dfb-1a90e6639fd5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    userInfo3.setType("1e6a2d9d-9f40-49e0-8bc1-b9b85020de59");

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    restaurant3.setCampusId("6cdbf9de-ccbb-4e55-b121-4d3b0ef54646");
    restaurant3.setId("d40e1b03-f6f6-4e93-9b9a-8ed1eaf9f938");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "dac02838-9dbb-48f8-840f-5c2575bfecbd"+ "'", str5.equals("dac02838-9dbb-48f8-840f-5c2575bfecbd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    restaurant0.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product();
    boolean b22 = product21.getAvailability();
    product21.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b25 = restaurant0.removeProduct(product21);
    restaurant0.setId("efbb39b8-b569-44a5-8350-5d34ec9574db");
    java.lang.String str28 = restaurant0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "12/03/2017"+ "'", str28.equals("12/03/2017"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    float f3 = product0.getCost();
    product0.setId("");
    product0.setName("com.example.unifood.exceptions.InvalidProductCostException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("a714e2e4-9a9f-4636-a3e8-c11ded26eceb", "c1839dde-2a89-4fce-a06f-c96ccbb3f563", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    review10.setId("");
    java.lang.String str13 = review10.getUserId();
    java.lang.String str14 = review10.getRestaurantId();
    java.lang.String str15 = review10.getDate();
    restaurant0.addReview(review10);
    review10.setId("a2e9bd71-7815-44e4-901d-1157f1703824");
    java.lang.String str19 = review10.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    restaurant3.addProduct(product16);
    product16.setId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    float f20 = product16.getCost();
    product16.setId("1aa0d499-6b74-40e4-ae8d-5c2cd81523c3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 10.0f);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setId("");
    java.lang.String str15 = review12.getUserId();
    review12.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str18 = review12.getRestaurantId();
    boolean b19 = restaurant0.removeReview(review12);
    boolean b21 = restaurant0.equals((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "6d874e94-287d-4dd4-b345-3dda47e1c3e2"+ "'", str10.equals("6d874e94-287d-4dd4-b345-3dda47e1c3e2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("com.example.unifood.exceptions.OwnerException");

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("51998cce-1219-4bac-b3bf-a4db195dc527");

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("5b5c2ba0-a11b-40c7-8280-ad87cf0056d7", (float)(byte)10, "a7cc89e0-bc6d-4944-a6c9-f4f9e906b446");

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    com.example.unifood.models.Campus campus7 = new com.example.unifood.models.Campus();
    boolean b9 = campus7.removeRestaurant("hi!");
    java.lang.String[] str_array34 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    campus7.setRestaurants((java.util.List<java.lang.String>)arraylist_str35);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str35);
    java.util.List<java.lang.String> list_str39 = null;
    university1.setAllCampus(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "998a891c-76e5-4840-b1a5-a94b23f06450"+ "'", str2.equals("998a891c-76e5-4840-b1a5-a94b23f06450"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getLocalization();
    java.lang.String str7 = restaurant3.getCampusId();
    java.lang.String str8 = restaurant3.getName();
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant3.getProductList();
    java.lang.String str10 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str6.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str7.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str8.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str10.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    restaurant3.setLocalization("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    java.lang.Float f10 = restaurant3.getRate();
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant3.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f10 + "' != '" + 0.0f+ "'", f10.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str2 = campus1.getName();
    boolean b4 = campus1.removeRestaurant("a339ea1e-a8f5-4f77-af1e-264cde0ed0dd");
    campus1.setId("ec090dde-3ceb-476b-a011-689921e90eac");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str2.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b15 = studentInfo0.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.util.List<java.lang.String> list_str16 = studentInfo0.getFavRestaurants();
    java.lang.String str17 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str17.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("028d9e90-8f7a-426f-9bb1-f298fcad31ed");
    boolean b3 = campus1.removeRestaurant("f4c5b8c3-3c11-4032-a3a2-60f2be579cd0");
    campus1.setName("ec090dde-3ceb-476b-a011-689921e90eac");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setName("efbb39b8-b569-44a5-8350-5d34ec9574db");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.lang.String str10 = restaurant6.getId();
    restaurant6.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant6.setLocalization("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    restaurant6.setLocalization("f666c841-c560-4874-8cbd-008c848d1f42");
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    review17.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    review17.setRestaurantId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    boolean b25 = restaurant6.removeReview(review17);
    restaurant3.update(restaurant6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1c6da8a9-8b9b-4db7-89db-45956ef9db40"+ "'", str10.equals("1c6da8a9-8b9b-4db7-89db-45956ef9db40"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("239d950c-a53b-45db-9e8f-483a040e426a");
    ownerInfo1.setRestaurantId("aabd70ed-be9f-4452-9625-3f6b64c27121");

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = review5.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str6.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("23fa2178-de19-425a-9618-737d5c76fcc3");

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("hi!");
    java.lang.String str6 = university5.getId();
    boolean b8 = university5.addCampus("hi!");
    java.lang.String str9 = university5.getId();
    university5.setName("12/03/2017");
    java.util.List<java.lang.String> list_str12 = university5.getAllCampus();
    university1.setAllCampus(list_str12);
    university1.setName("825150bc-640c-420f-a88a-4fd6a6439069");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "df7c6ae5-5856-4101-b2d4-197b72ed10db"+ "'", str6.equals("df7c6ae5-5856-4101-b2d4-197b72ed10db"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "df7c6ae5-5856-4101-b2d4-197b72ed10db"+ "'", str9.equals("df7c6ae5-5856-4101-b2d4-197b72ed10db"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getDate();
    java.lang.String str9 = review7.getComment();
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    review10.setId("");
    java.lang.String str13 = review10.getUserId();
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    review14.setRate((float)10L);
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    java.lang.String str21 = review17.getRestaurantId();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review30.setUserId("");
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    java.lang.String str34 = review33.getDate();
    java.lang.String str35 = review33.getComment();
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setId("");
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    java.lang.String str43 = review39.getRestaurantId();
    java.lang.String str44 = review39.getDate();
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    java.lang.String str46 = review45.getId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review52.setUserId("");
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    review55.setId("");
    com.example.unifood.models.Review[] review_array58 = new com.example.unifood.models.Review[] { review7, review10, review14, review17, review22, review30, review33, review36, review39, review45, review52, review55 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review59 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review59, review_array58);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review59);
    java.util.List<com.example.unifood.models.Product> list_product62 = restaurant3.getProductList();
    restaurant3.setCampusId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    com.example.unifood.models.Product product65 = new com.example.unifood.models.Product();
    boolean b66 = product65.getAvailability();
    product65.setName("3255b7a1-8533-43de-820d-ad22e5728de6");
    boolean b69 = restaurant3.equals((java.lang.Object)"3255b7a1-8533-43de-820d-ad22e5728de6");
    com.example.unifood.models.Review review70 = new com.example.unifood.models.Review();
    review70.setId("");
    java.lang.String str73 = review70.getUserId();
    review70.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review70.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str78 = review70.getRestaurantId();
    review70.setComment("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b81 = restaurant3.removeReview(review70);
    java.lang.Float f82 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "5023f368-94aa-4bc1-91ba-f002f0919f27"+ "'", str46.equals("5023f368-94aa-4bc1-91ba-f002f0919f27"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f82 + "' != '" + 0.0f+ "'", f82.equals(0.0f));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("9af82747-9c84-450f-ab4f-aec0067c1556", "e81ced6d-b7af-4906-8c34-54fe52110316", "922c0bcf-ad7e-4896-94cc-0f25264cdca2");

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setName("b676177c-e64a-41a0-8888-7f2dd89e8060");
    university1.setName("7de577c2-7483-4581-8047-651e6a4ea04b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeProduct(product13);
    product13.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str21 = product13.getDescription();
    java.lang.String str22 = product13.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "b96fad62-576f-43d3-b616-2ee6d93e78e1"+ "'", str10.equals("b96fad62-576f-43d3-b616-2ee6d93e78e1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str21.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str22.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    product3.setId("c566696d-01ac-40d0-9c13-a136126b449f");

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("12/03/2017");
    boolean b14 = product7.getAvailability();
    boolean b15 = product7.getAvailability();
    product7.setDescription("67a046c8-a221-48d0-89ab-00bb86a65a68");
    product7.setDescription("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    product7.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getDate();
    java.lang.String str8 = review0.getRestaurantId();
    review0.setRestaurantId("b1e0ce4f-fe08-425e-8497-24824ac3c0d9");
    java.lang.String str11 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review();
    review4.setId("");
    java.lang.String str7 = review4.getUserId();
    review4.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review4.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str12 = review4.getRestaurantId();
    boolean b13 = restaurant0.removeReview(review4);
    restaurant0.setShortDescription("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.lang.String str16 = restaurant0.getCampusId();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product("392d78ad-3469-4abe-83e2-8fc3d2096494", 1.0f, "75e0de5b-af05-410e-9afa-c211b35b0e94");
    product20.setId("");
    product20.setAvailability(true);
    restaurant0.addProduct(product20);
    restaurant0.setLocalization("5675838f-a901-49fe-bbef-8588ac00bd79");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    java.lang.String str19 = restaurant0.getUserId();
    java.lang.String str20 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("f65fd1ab-e41f-47d2-a90c-f40397952597", "e552c982-61df-4ac2-a552-65d03051cef3", (float)100, "1c3dd0fc-e808-440f-800a-cdb79c0d9851", "ee3e7097-4eed-4d70-a084-49efff46f6ac");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("61147561-d24f-4a49-b295-70696006c96d", "a119a696-228e-421c-8a30-41c04e6e52ea", (float)'#', "46968e03-114d-4a8c-aa28-11a47b6f8199", "73c0dd45-897d-4eb2-8356-deb3b8e00fa5");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("d9be4513-9875-41b9-9a19-d94242b78def");

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    java.util.List<com.example.unifood.models.Review> list_review15 = restaurant3.getReviewList();
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product();
    boolean b18 = product17.getAvailability();
    restaurant16.addProduct(product17);
    java.util.List<com.example.unifood.models.Product> list_product20 = restaurant16.getProductList();
    restaurant16.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant16.setApproved(false);
    restaurant16.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    restaurant3.update(restaurant16);
    restaurant3.setLocalization("add01af6-9901-43d3-950c-81f3702a5d12");
    java.lang.String str30 = restaurant3.getLocalization();
    java.lang.String str31 = restaurant3.getLocalization();
    java.lang.String str32 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "add01af6-9901-43d3-950c-81f3702a5d12"+ "'", str30.equals("add01af6-9901-43d3-950c-81f3702a5d12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "add01af6-9901-43d3-950c-81f3702a5d12"+ "'", str31.equals("add01af6-9901-43d3-950c-81f3702a5d12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "acf48c39-d366-4bdf-a3ff-483a32c34364"+ "'", str32.equals("acf48c39-d366-4bdf-a3ff-483a32c34364"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("1e6a2d9d-9f40-49e0-8bc1-b9b85020de59");

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant0.getName();
    restaurant0.setId("3db35cfa-ac0a-4288-9084-8d042e570026");
    restaurant0.setName("b20fdb04-eb44-4feb-86d8-727927a5303b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str7.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setName("b676177c-e64a-41a0-8888-7f2dd89e8060");
    java.lang.String str13 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str13.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setFirstName("b6fd1026-57eb-4577-a667-6dac64083d57");
    userInfo0.setFirstName("");
    java.lang.String str10 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setFirstName("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    userInfo0.setLastName("66bec123-5439-4b8b-9bcd-b4d7aa7fa48f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setLocalization("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    restaurant0.setLocalization("f666c841-c560-4874-8cbd-008c848d1f42");
    com.example.unifood.models.Review review11 = new com.example.unifood.models.Review();
    review11.setId("");
    java.lang.String str14 = review11.getUserId();
    review11.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    review11.setRestaurantId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    boolean b19 = restaurant0.removeReview(review11);
    java.util.List<com.example.unifood.models.Review> list_review20 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "c657631a-83f3-4277-80fc-df139742b29b"+ "'", str4.equals("c657631a-83f3-4277-80fc-df139742b29b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review20);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    restaurant0.setLocalization("f695ed82-229b-4109-958e-25c92fc7e7c5");
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    product12.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product12.setCost((float)' ');
    boolean b17 = restaurant0.equals((java.lang.Object)product12);
    float f18 = product12.getCost();
    product12.setId("ccd59dcf-7a32-4aa9-b3c0-6caab218d93f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 32.0f);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b23 = product22.getAvailability();
    product22.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b26 = restaurant0.removeProduct(product22);
    java.lang.String str27 = restaurant0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setLocalization("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    restaurant0.setLocalization("f666c841-c560-4874-8cbd-008c848d1f42");
    com.example.unifood.models.Review review11 = new com.example.unifood.models.Review();
    review11.setId("");
    java.lang.String str14 = review11.getUserId();
    review11.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    review11.setRestaurantId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    boolean b19 = restaurant0.removeReview(review11);
    java.lang.String str20 = restaurant0.getId();
    boolean b21 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "884ccf9b-f5d8-4efa-b69a-71e5ff4b08c7"+ "'", str4.equals("884ccf9b-f5d8-4efa-b69a-71e5ff4b08c7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "884ccf9b-f5d8-4efa-b69a-71e5ff4b08c7"+ "'", str20.equals("884ccf9b-f5d8-4efa-b69a-71e5ff4b08c7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str4 = product3.getName();
    java.lang.String str5 = product3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str4.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str5.equals("2016930c-728d-45c5-a236-9c4833a30246"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    java.lang.Float f8 = restaurant3.getRate();
    com.example.unifood.models.Product product9 = new com.example.unifood.models.Product();
    product9.setDescription("hi!");
    java.lang.String str12 = product9.getDescription();
    product9.setCost((float)(byte)0);
    restaurant3.addProduct(product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b3 = studentInfo1.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b5 = studentInfo1.delProductFromFavorites("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    boolean b7 = studentInfo1.addProductToFavorites("902f9631-5def-4d0f-9c96-e969fa810f24");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    campus1.setId("acf48c39-d366-4bdf-a3ff-483a32c34364");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "118689b1-40c2-4b3e-a2c2-38ff64fa142c"+ "'", str2.equals("118689b1-40c2-4b3e-a2c2-38ff64fa142c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.lang.String str7 = restaurant3.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    review0.setRestaurantId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    float f8 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant10.setUserId("hi!");
    restaurant10.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    boolean b19 = restaurant0.equals((java.lang.Object)"3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str20 = restaurant0.getUserId();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    review21.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review21.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str29 = review21.getId();
    boolean b30 = restaurant0.removeReview(review21);
    restaurant0.setRate((java.lang.Float)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    boolean b13 = restaurant3.equals((java.lang.Object)(byte)-1);
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    boolean b16 = product15.getAvailability();
    restaurant14.addProduct(product15);
    boolean b18 = restaurant3.removeProduct(product15);
    java.lang.String str19 = product15.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "b0f6fbc2-a700-40b9-8275-01f155e602b1"+ "'", str10.equals("b0f6fbc2-a700-40b9-8275-01f155e602b1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    restaurant0.setShortDescription("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant0.getReviewList();
    java.lang.String str13 = restaurant0.getCampusId();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant17.getApproved();
    java.lang.String str19 = restaurant17.getId();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review25.setUserId("");
    java.lang.String str28 = review25.getUserId();
    review25.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b31 = restaurant17.removeReview(review25);
    boolean b32 = restaurant0.equals((java.lang.Object)review25);
    java.lang.String str33 = review25.getId();
    java.lang.String str34 = review25.getDate();
    float f35 = review25.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "b252c406-c2cd-473c-9a08-8dad188552a0"+ "'", str19.equals("b252c406-c2cd-473c-9a08-8dad188552a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "67f43e77-131c-48f4-9bf7-76320844084d"+ "'", str33.equals("67f43e77-131c-48f4-9bf7-76320844084d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str34.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 1.0f);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str15 = restaurant3.getCampusId();
    restaurant3.setCampusId("82a3735c-51a5-4196-b1e2-ba5966598a25");
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product("1cc346cd-7e37-4aa5-a18f-4211b5a529c9", (float)10L, "15149c67-efc5-4744-85b0-8dc2ac121df7");
    product21.setCost((float)(short)10);
    restaurant3.addProduct(product21);
    restaurant3.updateRating();
    java.lang.String str26 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "9bb4ec51-2299-41a3-b764-2192d7b57501"+ "'", str26.equals("9bb4ec51-2299-41a3-b764-2192d7b57501"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.lang.String str11 = review0.getRestaurantId();
    review0.setComment("6cdbf9de-ccbb-4e55-b121-4d3b0ef54646");
    float f14 = review0.getRate();
    java.lang.String str15 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "6cdbf9de-ccbb-4e55-b121-4d3b0ef54646"+ "'", str15.equals("6cdbf9de-ccbb-4e55-b121-4d3b0ef54646"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    restaurant3.setId("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    boolean b7 = restaurant3.getApproved();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant11.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str14 = restaurant11.getShortDescription();
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review();
    java.lang.String str16 = review15.getDate();
    java.lang.String str17 = review15.getComment();
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    review18.setId("");
    java.lang.String str21 = review18.getUserId();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setRate((float)10L);
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    review25.setId("");
    java.lang.String str28 = review25.getUserId();
    java.lang.String str29 = review25.getRestaurantId();
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    review30.setId("");
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review38.setUserId("");
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    java.lang.String str42 = review41.getDate();
    java.lang.String str43 = review41.getComment();
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setId("");
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    java.lang.String str50 = review47.getUserId();
    java.lang.String str51 = review47.getRestaurantId();
    java.lang.String str52 = review47.getDate();
    com.example.unifood.models.Review review53 = new com.example.unifood.models.Review();
    java.lang.String str54 = review53.getId();
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review60.setUserId("");
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review();
    review63.setId("");
    com.example.unifood.models.Review[] review_array66 = new com.example.unifood.models.Review[] { review15, review18, review22, review25, review30, review38, review41, review44, review47, review53, review60, review63 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review67 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review67, review_array66);
    restaurant11.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review67);
    java.util.List<com.example.unifood.models.Product> list_product70 = restaurant11.getProductList();
    restaurant11.setCampusId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    com.example.unifood.models.Product product73 = new com.example.unifood.models.Product();
    boolean b74 = product73.getAvailability();
    product73.setName("3255b7a1-8533-43de-820d-ad22e5728de6");
    boolean b77 = restaurant11.equals((java.lang.Object)"3255b7a1-8533-43de-820d-ad22e5728de6");
    com.example.unifood.models.Review review78 = new com.example.unifood.models.Review();
    review78.setId("");
    java.lang.String str81 = review78.getUserId();
    review78.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review78.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str86 = review78.getRestaurantId();
    review78.setComment("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b89 = restaurant11.removeReview(review78);
    restaurant3.addReview(review78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "66b6a3d8-3894-4fc7-acaa-27dfd7f07e89"+ "'", str54.equals("66b6a3d8-3894-4fc7-acaa-27dfd7f07e89"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant3.setUserId("5aa3e6c8-b159-46f6-b439-3a1dcaed2d47");
    java.lang.String str9 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de2ace5c-0aa8-4d05-a5e8-49634c6c28f6"+ "'", str9.equals("de2ace5c-0aa8-4d05-a5e8-49634c6c28f6"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    java.lang.String str9 = campus0.getId();
    campus0.setId("");
    boolean b13 = campus0.removeRestaurant("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    boolean b15 = campus0.removeRestaurant("53487191-c429-45c3-a6ae-be21246704e3");
    boolean b17 = campus0.removeRestaurant("de2ace5c-0aa8-4d05-a5e8-49634c6c28f6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3f29bd6c-0c82-43b4-ab44-e9f15ccd226a"+ "'", str6.equals("3f29bd6c-0c82-43b4-ab44-e9f15ccd226a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3f29bd6c-0c82-43b4-ab44-e9f15ccd226a"+ "'", str8.equals("3f29bd6c-0c82-43b4-ab44-e9f15ccd226a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "3f29bd6c-0c82-43b4-ab44-e9f15ccd226a"+ "'", str9.equals("3f29bd6c-0c82-43b4-ab44-e9f15ccd226a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.addRestaurantToFavorites("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str12 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str12.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    userInfo3.setLastName("ac51a7a5-9871-4de6-87fc-f82caeac426a");
    java.lang.String str10 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "9e087ae8-80e1-4932-9bf9-0925df2c9f7e"+ "'", str10.equals("9e087ae8-80e1-4932-9bf9-0925df2c9f7e"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Review review11 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review11.setUserId("");
    java.lang.String str14 = review11.getUserId();
    review11.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b17 = restaurant3.removeReview(review11);
    float f18 = review11.getRate();
    review11.setUserId("36bd04c3-f456-4a88-8133-0659d5227a0f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f3fc90c1-836b-4f80-a3c2-5cb84a4c68ea"+ "'", str5.equals("f3fc90c1-836b-4f80-a3c2-5cb84a4c68ea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 1.0f);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("f65fd1ab-e41f-47d2-a90c-f40397952597");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus3 = new com.example.unifood.models.Campus();
    boolean b5 = campus3.removeRestaurant("hi!");
    campus3.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str8 = campus3.getRestaurants();
    studentInfo2.setFavRestaurants(list_str8);
    com.example.unifood.models.University university11 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus12 = new com.example.unifood.models.Campus();
    boolean b14 = campus12.removeRestaurant("hi!");
    campus12.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str17 = campus12.getRestaurants();
    university11.setAllCampus(list_str17);
    studentInfo2.setFavRestaurants(list_str17);
    studentInfo1.setFavProducts(list_str17);
    boolean b22 = studentInfo1.delProductFromFavorites("62f85ba0-7dbe-4929-900f-915158d317eb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("36e9cd33-a1c0-4732-a96b-fce5ebc8d118", "03d6f458-9b02-4a10-bdd2-2aab61b1d4de", (float)10, "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    studentInfo12.setCampusId("");
    studentInfo12.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo12.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavProducts();
    studentInfo0.setFavProducts(list_str19);
    boolean b22 = studentInfo0.delRestaurantFromFavorites("636ed751-d54f-4477-99f0-03f904dd2fd0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("811f8a1d-ca60-461d-828c-6680d7547043", "a6bf0ef2-fb6e-4cb6-8394-1d24ac774bd0", "5cad58f0-a042-4e13-90be-466b381fa540");
    java.lang.String str4 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a6bf0ef2-fb6e-4cb6-8394-1d24ac774bd0"+ "'", str4.equals("a6bf0ef2-fb6e-4cb6-8394-1d24ac774bd0"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("1d4c33db-a409-4716-bace-aecdf5121e1e");

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("9c79c876-a93d-4813-92df-b21535c292d5");

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str6 = review0.getDate();
    review0.setDate("998a891c-76e5-4840-b1a5-a94b23f06450");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    java.lang.String str6 = restaurant0.getShortDescription();
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getDate();
    java.lang.String str9 = review7.getId();
    java.lang.String str10 = review7.getComment();
    review7.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str13 = review7.getRestaurantId();
    java.lang.String str14 = review7.getUserId();
    java.lang.String str15 = review7.getUserId();
    boolean b16 = restaurant0.removeReview(review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0ca9664d-8c78-494a-b042-96c74ecb2137"+ "'", str9.equals("0ca9664d-8c78-494a-b042-96c74ecb2137"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setName("fcf4a53c-cc22-423a-bfaf-dea98ceedcea");
    restaurant0.setRate((java.lang.Float)1.0f);
    restaurant0.setUserId("89afd63c-d576-4913-8a77-be38651f287f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    boolean b8 = studentInfo0.delProductFromFavorites("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    com.example.unifood.models.University university10 = new com.example.unifood.models.University("hi!");
    java.lang.String str11 = university10.getId();
    java.util.List<java.lang.String> list_str12 = university10.getAllCampus();
    studentInfo0.setFavProducts(list_str12);
    java.util.List<java.lang.String> list_str14 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ad9e1a89-ce46-4d03-9bbc-c729c44aba5c"+ "'", str11.equals("ad9e1a89-ce46-4d03-9bbc-c729c44aba5c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant17.getProductList();
    restaurant3.setProductList(list_product26);
    com.example.unifood.models.Restaurant restaurant31 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str32 = restaurant31.getName();
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    java.util.List<com.example.unifood.models.Product> list_product37 = restaurant33.getProductList();
    restaurant33.updateRating();
    java.lang.String str39 = restaurant33.getShortDescription();
    java.lang.String str40 = restaurant33.getName();
    java.util.List<com.example.unifood.models.Product> list_product41 = restaurant33.getProductList();
    restaurant31.setProductList(list_product41);
    restaurant3.setProductList(list_product41);
    restaurant3.setCampusId("867e7d5f-4050-479c-8c70-57bfe3d565dc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str32.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product41);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    float f5 = product3.getCost();
    java.lang.String str6 = product3.getName();
    java.lang.String str7 = product3.getDescription();
    product3.setName("53d5e04e-abb5-45a7-a278-d742367421a0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "e8588626-52d3-4ed2-8bd5-24c0755bae64"+ "'", str6.equals("e8588626-52d3-4ed2-8bd5-24c0755bae64"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/03/2017"+ "'", str7.equals("12/03/2017"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    restaurant3.setLocalization("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    restaurant3.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5", "16c89e8f-dcdc-4632-8a9b-1653843567f5", (float)(short)1, "76fe9853-ea57-4556-ac71-95373a19a23f");
    review4.setRestaurantId("");
    review4.setId("ab79e951-8fc0-4083-9c98-e2c24bf95840");

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant3.getReviewList();
    restaurant3.setApproved(true);
    restaurant3.setShortDescription("c3a9485a-8ef4-4c7e-b777-95f2224142fd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getId();
    campus0.setId("119f287e-61c5-497a-b55c-17489bcb03e9");
    boolean b5 = campus0.removeRestaurant("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "30b8f772-650c-47f7-8b30-c1be04518acd"+ "'", str1.equals("30b8f772-650c-47f7-8b30-c1be04518acd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    java.lang.String str4 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("04a1e0df-560d-416e-92d4-378868d609c7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str3.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str4.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setDescription("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    product0.setDescription("c1ae1892-b492-41e0-9d4c-c9cd686e8a51");

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    java.lang.String str2 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "6c2f90b1-d9b0-400d-8b43-0893724d6fd6"+ "'", str2.equals("6c2f90b1-d9b0-400d-8b43-0893724d6fd6"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getLastName();
    userInfo0.setLastName("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    java.lang.String str3 = userInfo0.getFirstName();
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setType("27fab29a-8261-4cad-9980-1ab61f13cf41");
    userInfo0.setLastName("6c4c9076-aeac-4c07-b6bc-73b8d8f0a4be");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    com.example.unifood.models.University university0 = new com.example.unifood.models.University();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    java.lang.String str7 = campus1.getId();
    java.lang.String str8 = campus1.getName();
    campus1.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str11 = campus1.getRestaurants();
    java.util.List<java.lang.String> list_str12 = campus1.getRestaurants();
    university0.setAllCampus(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "e4d01025-945d-482e-b8db-4905c06a3464"+ "'", str7.equals("e4d01025-945d-482e-b8db-4905c06a3464"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str8.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b15 = studentInfo0.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b17 = studentInfo0.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    boolean b19 = studentInfo0.addProductToFavorites("0d44eb89-6d09-4828-979e-7df1e55ff022");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    product7.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b11 = product7.getAvailability();
    boolean b12 = restaurant0.removeProduct(product7);
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str17 = restaurant16.getName();
    restaurant0.update(restaurant16);
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    java.lang.String str20 = restaurant19.getUserId();
    java.lang.String str21 = restaurant19.getLocalization();
    restaurant19.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product24 = new com.example.unifood.models.Product();
    boolean b25 = product24.getAvailability();
    product24.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product24.setAvailability(true);
    product24.setCost((float)(byte)10);
    restaurant19.addProduct(product24);
    restaurant0.addProduct(product24);
    product24.setAvailability(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str17.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.University university11 = new com.example.unifood.models.University("hi!");
    java.lang.String str12 = university11.getId();
    java.lang.String[] str_array41 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    university11.setAllCampus((java.util.List<java.lang.String>)arraylist_str42);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str42);
    boolean b47 = campus0.addRestaurant("5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str48 = campus0.getId();
    campus0.setName("08ef2ed8-271a-4aad-9415-47b0dba1b9a7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "156886f0-2a98-416f-b9c0-ca700da59d3d"+ "'", str6.equals("156886f0-2a98-416f-b9c0-ca700da59d3d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "cfd07324-ef31-4e17-be95-ae330cf0650e"+ "'", str12.equals("cfd07324-ef31-4e17-be95-ae330cf0650e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str48.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str4 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    studentInfo8.setCampusId("");
    studentInfo8.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b14 = studentInfo8.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str16 = studentInfo15.getFavRestaurants();
    studentInfo8.setFavProducts(list_str16);
    studentInfo0.setFavProducts(list_str16);
    boolean b20 = studentInfo0.delProductFromFavorites("55d45579-dc9b-49f1-a439-f2a4c989c1eb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    restaurant3.setShortDescription("c0679c38-8adf-4203-85c8-515aaf773e20");
    restaurant3.setApproved(true);
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setId("");
    java.lang.String str15 = review12.getUserId();
    review12.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str18 = review12.getRestaurantId();
    boolean b19 = restaurant0.removeReview(review12);
    review12.setRestaurantId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    review12.setComment("59b6ade5-3811-4088-b13a-ef845448e8af");
    float f24 = review12.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "a634cdea-2df8-4ff2-80c2-fbceac3d0480"+ "'", str10.equals("a634cdea-2df8-4ff2-80c2-fbceac3d0480"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f24 == 0.0f);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    review12.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review12.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeReview(review12);
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.lang.String str23 = restaurant19.getId();
    restaurant19.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.update(restaurant19);
    restaurant19.updateRating();
    com.example.unifood.models.Restaurant restaurant31 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant31.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str34 = restaurant31.getShortDescription();
    com.example.unifood.models.Review review35 = new com.example.unifood.models.Review();
    java.lang.String str36 = review35.getDate();
    java.lang.String str37 = review35.getComment();
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review();
    review38.setId("");
    java.lang.String str41 = review38.getUserId();
    com.example.unifood.models.Review review42 = new com.example.unifood.models.Review();
    review42.setRate((float)10L);
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    review45.setId("");
    java.lang.String str48 = review45.getUserId();
    java.lang.String str49 = review45.getRestaurantId();
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review58.setUserId("");
    com.example.unifood.models.Review review61 = new com.example.unifood.models.Review();
    java.lang.String str62 = review61.getDate();
    java.lang.String str63 = review61.getComment();
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review();
    review64.setId("");
    com.example.unifood.models.Review review67 = new com.example.unifood.models.Review();
    review67.setId("");
    java.lang.String str70 = review67.getUserId();
    java.lang.String str71 = review67.getRestaurantId();
    java.lang.String str72 = review67.getDate();
    com.example.unifood.models.Review review73 = new com.example.unifood.models.Review();
    java.lang.String str74 = review73.getId();
    com.example.unifood.models.Review review80 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review80.setUserId("");
    com.example.unifood.models.Review review83 = new com.example.unifood.models.Review();
    review83.setId("");
    com.example.unifood.models.Review[] review_array86 = new com.example.unifood.models.Review[] { review35, review38, review42, review45, review50, review58, review61, review64, review67, review73, review80, review83 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review87 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b88 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review87, review_array86);
    restaurant31.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review87);
    restaurant19.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "55828b2f-d311-46b6-8244-bd26feb289f6"+ "'", str10.equals("55828b2f-d311-46b6-8244-bd26feb289f6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "d833bc95-24de-47d6-b1ed-18228dde24cf"+ "'", str23.equals("d833bc95-24de-47d6-b1ed-18228dde24cf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "e92b4a2a-f3bc-4b00-8732-e346ae29b2c4"+ "'", str74.equals("e92b4a2a-f3bc-4b00-8732-e346ae29b2c4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("edf01dd6-a35a-426f-808e-d6346b5af74f");
    university1.setId("3f1d8f40-44f8-458b-a784-7c1c32ce69d6");
    boolean b5 = university1.removeCampus("9befae08-3641-4d76-a03a-fd4046ab0bc7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    boolean b4 = studentInfo1.addProductToFavorites("abd293bf-2239-4c98-b7ba-ff7036c5aa21");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    restaurant0.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    restaurant0.setShortDescription("13f98119-ba54-4465-bf81-4bb02912af47");
    restaurant0.setName("63d9aec0-76a5-435f-9c93-e0aac2c8b34e");
    restaurant0.setName("8664e462-8683-4210-8fa3-b99e2a278578");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setFirstName("b6fd1026-57eb-4577-a667-6dac64083d57");
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    java.lang.String str10 = userInfo0.getLastName();
    java.lang.String str11 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Restaurant restaurant5 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product6 = new com.example.unifood.models.Product();
    boolean b7 = product6.getAvailability();
    restaurant5.addProduct(product6);
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant5.getProductList();
    restaurant5.setUserId("hi!");
    restaurant5.setName("12/03/2017");
    java.lang.String str14 = restaurant5.getCampusId();
    java.lang.String str15 = restaurant5.getUserId();
    restaurant5.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.util.List<com.example.unifood.models.Review> list_review18 = restaurant5.getReviewList();
    restaurant0.setReviewList(list_review18);
    restaurant0.setShortDescription("7ff0a566-b540-4528-aabb-d358a9a46d4e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review18);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant0.getName();
    java.util.List<com.example.unifood.models.Product> list_product8 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str7.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setUserId("hi!");
    restaurant7.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant7.getReviewList();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    boolean b26 = restaurant7.equals((java.lang.Object)"3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    java.lang.String str28 = review27.getId();
    java.lang.String str29 = review27.getUserId();
    restaurant7.addReview(review27);
    restaurant3.update(restaurant7);
    java.lang.String str32 = restaurant3.getUserId();
    restaurant3.setLocalization("9a557890-b5c1-4460-a030-67989b53a000");
    java.lang.String str35 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0375996c-5fbe-4716-818a-5c42766daf2e"+ "'", str28.equals("0375996c-5fbe-4716-818a-5c42766daf2e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "9a557890-b5c1-4460-a030-67989b53a000"+ "'", str35.equals("9a557890-b5c1-4460-a030-67989b53a000"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("ca4a646d-3cc8-4cc0-9b41-40eb17520a41");
    java.util.List<java.lang.String> list_str2 = campus1.getRestaurants();
    java.lang.String str3 = campus1.getId();
    boolean b5 = campus1.removeRestaurant("4a1faca8-27ea-4dd8-9833-9159f8937bd9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2ce53d4c-3a07-46fe-b5c1-c6aaf07bb1fe"+ "'", str3.equals("2ce53d4c-3a07-46fe-b5c1-c6aaf07bb1fe"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review0.setComment("22d944a9-1bc9-4722-89e4-e2c91eeee1ea");
    java.lang.String str10 = review0.getId();
    float f11 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant0.getName();
    restaurant0.setId("3db35cfa-ac0a-4288-9084-8d042e570026");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product();
    boolean b18 = product17.getAvailability();
    restaurant16.addProduct(product17);
    java.util.List<com.example.unifood.models.Product> list_product20 = restaurant16.getProductList();
    restaurant16.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant16.getReviewList();
    restaurant13.setReviewList(list_review23);
    java.util.List<com.example.unifood.models.Review> list_review25 = restaurant13.getReviewList();
    restaurant0.setReviewList(list_review25);
    boolean b27 = restaurant0.getApproved();
    java.util.List<com.example.unifood.models.Review> list_review28 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str7.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review28);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    userInfo0.setLastName("85f3bee0-b6f3-4de4-84fc-4e487a6b1fc2");

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("9e33915e-bf30-4cef-9b94-35782a89f467", "80edcdaa-061a-4071-84f5-b4958cb78c91", (float)' ', "6570c66e-106a-45b5-b21b-6957af6be4db", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review0.setRate((float)(-1L));
    java.lang.String str10 = review0.getRestaurantId();
    java.lang.String str11 = review0.getUserId();
    java.lang.String str12 = review0.getId();
    java.lang.String str13 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str13.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    java.util.List<com.example.unifood.models.Review> list_review15 = restaurant3.getReviewList();
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product();
    boolean b18 = product17.getAvailability();
    restaurant16.addProduct(product17);
    java.util.List<com.example.unifood.models.Product> list_product20 = restaurant16.getProductList();
    restaurant16.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant16.setApproved(false);
    restaurant16.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    restaurant3.update(restaurant16);
    restaurant3.setLocalization("add01af6-9901-43d3-950c-81f3702a5d12");
    java.lang.String str30 = restaurant3.getLocalization();
    java.lang.String str31 = restaurant3.getName();
    java.lang.String str32 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "add01af6-9901-43d3-950c-81f3702a5d12"+ "'", str30.equals("add01af6-9901-43d3-950c-81f3702a5d12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str31.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "add01af6-9901-43d3-950c-81f3702a5d12"+ "'", str32.equals("add01af6-9901-43d3-950c-81f3702a5d12"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("ec1c7744-8529-4314-837e-cb723075bf0b", "", "3f63b5ac-6bfb-4aed-9267-2294d60a0239");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusIdException");
    } catch (com.example.unifood.exceptions.InvalidCampusIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    campus1.setRestaurants(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2115f877-dd54-4623-9a57-298b950a0f9e"+ "'", str2.equals("2115f877-dd54-4623-9a57-298b950a0f9e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    restaurant3.setId("e38e11da-1219-443d-93b7-8c6ea82bea05");
    java.lang.String str10 = restaurant3.getShortDescription();
    java.lang.String str11 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2db8940e-5623-4aaa-a1c0-b3fc73af20d6"+ "'", str5.equals("2db8940e-5623-4aaa-a1c0-b3fc73af20d6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "e38e11da-1219-443d-93b7-8c6ea82bea05"+ "'", str11.equals("e38e11da-1219-443d-93b7-8c6ea82bea05"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    studentInfo0.setCampusId("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavProducts();
    java.lang.String str10 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00c21b13-bd60-4d6c-95c6-aa73a51a7075"+ "'", str10.equals("00c21b13-bd60-4d6c-95c6-aa73a51a7075"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setCost(100.0f);
    boolean b7 = product3.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("a889cdd9-5758-40f3-8616-4909048ca3f7", 0.0f, "17604120-3f03-41bc-ac7a-f4e923901ad5");

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("239d950c-a53b-45db-9e8f-483a040e426a", "adb74c6f-c839-47cc-b096-1c12240d6afd", 1.0f, "49976e80-f69f-4380-aa76-dc904dcb2eca", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str6 = review5.getId();
    java.lang.String str7 = review5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "25febfd4-1ff3-4def-b38b-977a76b141bd"+ "'", str6.equals("25febfd4-1ff3-4def-b38b-977a76b141bd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9"+ "'", str7.equals("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("884ccf9b-f5d8-4efa-b69a-71e5ff4b08c7");

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeProduct(product13);
    product13.setCost((float)100);
    boolean b21 = product13.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "c7f3c2dc-9d52-491f-9ed9-0736f8b15439"+ "'", str10.equals("c7f3c2dc-9d52-491f-9ed9-0736f8b15439"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str4 = restaurant3.getName();
    java.lang.String str5 = restaurant3.getId();
    restaurant3.setCampusId("16bc091e-53dc-406d-8c7e-15d5c23036ca");
    java.lang.String str8 = restaurant3.getShortDescription();
    restaurant3.setId("64a174b7-c8e6-48f7-bd49-217619611384");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str4.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8c040642-dc94-4cfb-9806-6d3178994ef9"+ "'", str5.equals("8c040642-dc94-4cfb-9806-6d3178994ef9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b10 = studentInfo0.addProductToFavorites("e8e3014e-33aa-43e7-bb64-b61e035fc513");
    com.example.unifood.models.University university12 = new com.example.unifood.models.University("hi!");
    boolean b14 = university12.removeCampus("hi!");
    university12.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str17 = university12.getName();
    boolean b19 = university12.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university21 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus22 = new com.example.unifood.models.Campus();
    boolean b24 = campus22.removeRestaurant("hi!");
    campus22.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str27 = campus22.getRestaurants();
    university21.setAllCampus(list_str27);
    java.util.List<java.lang.String> list_str29 = university21.getAllCampus();
    university12.setAllCampus(list_str29);
    java.util.List<java.lang.String> list_str31 = university12.getAllCampus();
    studentInfo0.setFavProducts(list_str31);
    java.lang.String str33 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str33.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    restaurant4.addProduct(product5);
    java.lang.String str8 = restaurant4.getId();
    restaurant4.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f15 = product14.getCost();
    java.lang.String str16 = product14.getId();
    restaurant4.addProduct(product14);
    restaurant4.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    boolean b21 = restaurant4.equals((java.lang.Object)"63d9aec0-76a5-435f-9c93-e0aac2c8b34e");
    restaurant0.update(restaurant4);
    restaurant0.setId("c3a9485a-8ef4-4c7e-b777-95f2224142fd");
    java.lang.Float f25 = restaurant0.getRate();
    restaurant0.setRate((java.lang.Float)0.0f);
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9ba3a02e-f2cc-4792-9803-73cab8e17df9"+ "'", str8.equals("9ba3a02e-f2cc-4792-9803-73cab8e17df9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "e7580797-b6dd-4993-bf93-ce15feaacf76"+ "'", str16.equals("e7580797-b6dd-4993-bf93-ce15feaacf76"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f25 + "' != '" + 0.0f+ "'", f25.equals(0.0f));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("3e0125c9-ceba-41fb-9a7a-7cdb4b03e56e", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c", (float)' ', "3fcb0ac4-7d96-4071-a6d0-8f688fbf3bd8");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("58f62521-916b-4794-9575-f2e814108adf", "f4c5b8c3-3c11-4032-a3a2-60f2be579cd0", "1dbd805e-56e3-4ae1-ba27-156ae053a84c");

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delProductFromFavorites("090d4d8e-cace-44ee-8920-101722da86af");
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("7de2ed1d-f078-440b-9d52-26bb5403c2b3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setFirstName("b6fd1026-57eb-4577-a667-6dac64083d57");
    userInfo0.setType("a78204f1-ede6-4e45-8113-466448888b40");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c7492f51-751c-49fa-9823-c9ff6db2c39f", "", "5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5ed892b7-8b07-4339-8318-fe7c666739ed"+ "'", str5.equals("5ed892b7-8b07-4339-8318-fe7c666739ed"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.updateRating();
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    restaurant4.addProduct(product5);
    java.util.List<com.example.unifood.models.Product> list_product8 = restaurant4.getProductList();
    restaurant4.setUserId("hi!");
    restaurant4.setName("12/03/2017");
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review();
    java.lang.String str14 = review13.getId();
    boolean b15 = restaurant4.removeReview(review13);
    com.example.unifood.models.Review review16 = new com.example.unifood.models.Review();
    review16.setId("");
    java.lang.String str19 = review16.getUserId();
    review16.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str22 = review16.getRestaurantId();
    boolean b23 = restaurant4.removeReview(review16);
    review16.setRestaurantId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    restaurant0.addReview(review16);
    boolean b28 = restaurant0.equals((java.lang.Object)"041f0a74-169e-4210-9a45-d7590efa37d2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "cbdda979-2fe6-4f05-bc1c-34a52a5bc5d1"+ "'", str14.equals("cbdda979-2fe6-4f05-bc1c-34a52a5bc5d1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant14.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str17 = restaurant14.getShortDescription();
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    java.lang.String str19 = review18.getDate();
    java.lang.String str20 = review18.getComment();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    review25.setRate((float)10L);
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    review28.setId("");
    java.lang.String str31 = review28.getUserId();
    java.lang.String str32 = review28.getRestaurantId();
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    review33.setId("");
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review41.setUserId("");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    java.lang.String str45 = review44.getDate();
    java.lang.String str46 = review44.getComment();
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    java.lang.String str53 = review50.getUserId();
    java.lang.String str54 = review50.getRestaurantId();
    java.lang.String str55 = review50.getDate();
    com.example.unifood.models.Review review56 = new com.example.unifood.models.Review();
    java.lang.String str57 = review56.getId();
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review63.setUserId("");
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    review66.setId("");
    com.example.unifood.models.Review[] review_array69 = new com.example.unifood.models.Review[] { review18, review21, review25, review28, review33, review41, review44, review47, review50, review56, review63, review66 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review70 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review70, review_array69);
    restaurant14.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review70);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review70);
    com.example.unifood.models.Restaurant restaurant77 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant77.setName("12/03/2017");
    java.lang.String str80 = restaurant77.getUserId();
    restaurant77.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review83 = new com.example.unifood.models.Review();
    java.lang.String str84 = review83.getId();
    boolean b85 = restaurant77.equals((java.lang.Object)review83);
    java.lang.Float f86 = restaurant77.getRate();
    boolean b87 = restaurant3.equals((java.lang.Object)f86);
    restaurant3.setCampusId("904de44c-2fcc-4342-bf78-0e04d027811d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "ddffe39e-07d3-4861-9c28-cd7c915eee32"+ "'", str57.equals("ddffe39e-07d3-4861-9c28-cd7c915eee32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "ef48fd18-53cd-4aba-8c06-b55c4a203e2b"+ "'", str84.equals("ef48fd18-53cd-4aba-8c06-b55c4a203e2b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f86 + "' != '" + 0.0f+ "'", f86.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setCampusId("com.example.unifood.exceptions.OwnerException");
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    restaurant11.addProduct(product12);
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant11.getProductList();
    restaurant11.setUserId("hi!");
    restaurant11.setName("12/03/2017");
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getId();
    boolean b22 = restaurant11.removeReview(review20);
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    java.lang.String str24 = review23.getDate();
    review23.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review23.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b29 = restaurant11.removeReview(review23);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    java.lang.String str34 = restaurant30.getId();
    restaurant30.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant11.update(restaurant30);
    restaurant0.update(restaurant30);
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    review39.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    restaurant30.addReview(review39);
    java.lang.String str46 = review39.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "5f50618a-2579-44d1-b865-1d73003607d1"+ "'", str21.equals("5f50618a-2579-44d1-b865-1d73003607d1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "5b650c6a-7478-4b82-83ec-712c725c56dd"+ "'", str34.equals("5b650c6a-7478-4b82-83ec-712c725c56dd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("94b81efc-debb-4018-aa53-f3f45c40a55b");

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    restaurant0.setId("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str10 = restaurant0.getCampusId();
    restaurant0.setShortDescription("43590002-ff0f-4cc9-8729-316ebc4fb5e8");
    restaurant0.setName("1ede2012-6d8b-4886-b09c-d88386ee74f6");
    restaurant0.setId("bcb5231e-854a-42c7-81cf-bcde53ee699a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus5 = new com.example.unifood.models.Campus();
    boolean b7 = campus5.removeRestaurant("hi!");
    campus5.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str10 = campus5.getRestaurants();
    java.lang.String str11 = campus5.getId();
    java.lang.String str12 = campus5.getName();
    campus5.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str15 = campus5.getRestaurants();
    studentInfo0.setFavRestaurants(list_str15);
    boolean b18 = studentInfo0.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    boolean b20 = studentInfo0.delRestaurantFromFavorites("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    studentInfo0.setCampusId("cd088984-e93b-4b0f-b737-fbc6859344ef");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "48eb6aa5-2d30-4b21-96f5-4494cdce631a"+ "'", str11.equals("48eb6aa5-2d30-4b21-96f5-4494cdce631a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setUserId("");
    restaurant3.setRate((java.lang.Float)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b15 = studentInfo0.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b17 = studentInfo0.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str20 = campus19.getId();
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    studentInfo21.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    campus19.setRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    boolean b36 = studentInfo0.delProductFromFavorites("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    com.example.unifood.models.StudentInfo studentInfo38 = new com.example.unifood.models.StudentInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    studentInfo39.setCampusId("");
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str48, str_array47);
    studentInfo39.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str48);
    com.example.unifood.models.StudentInfo studentInfo51 = new com.example.unifood.models.StudentInfo();
    studentInfo51.setCampusId("");
    studentInfo51.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo51.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str58 = studentInfo51.getFavProducts();
    studentInfo39.setFavProducts(list_str58);
    studentInfo38.setFavProducts(list_str58);
    studentInfo0.setFavProducts(list_str58);
    boolean b63 = studentInfo0.delProductFromFavorites("3e05f84f-fae9-4094-b787-f1eb3d49517a");
    boolean b65 = studentInfo0.addProductToFavorites("396a4937-9452-484e-b1eb-dbb739fc5680");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "f83265ce-fd72-40dc-a341-0a77f34086e0"+ "'", str20.equals("f83265ce-fd72-40dc-a341-0a77f34086e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setCampusId("ed8899de-d74b-4c5b-bafd-c89f775d295a");
    restaurant0.setApproved(true);
    java.lang.String str11 = restaurant0.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("8e069f68-c995-4d5a-9117-23fad524d3d9", "d2c231e2-7a36-4c3e-85a5-77d4735a3460", (float)1, "c9e89708-6a8e-4d47-843b-d720cb9cb6ab", "46f5197c-98ce-455a-af52-486ce64dd879");

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    boolean b16 = restaurant3.equals((java.lang.Object)100.0f);
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    java.lang.String str18 = review17.getDate();
    float f19 = review17.getRate();
    java.lang.String str20 = review17.getUserId();
    java.lang.String str21 = review17.getComment();
    boolean b22 = restaurant3.removeReview(review17);
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant();
    java.lang.String str24 = restaurant23.getUserId();
    java.lang.String str25 = restaurant23.getLocalization();
    restaurant23.updateRating();
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setUserId("hi!");
    restaurant27.setName("12/03/2017");
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    java.lang.String str37 = review36.getId();
    boolean b38 = restaurant27.removeReview(review36);
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    review39.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str45 = review39.getRestaurantId();
    boolean b46 = restaurant27.removeReview(review39);
    review39.setRestaurantId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    restaurant23.addReview(review39);
    com.example.unifood.models.Restaurant restaurant50 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product51 = new com.example.unifood.models.Product();
    boolean b52 = product51.getAvailability();
    restaurant50.addProduct(product51);
    java.util.List<com.example.unifood.models.Product> list_product54 = restaurant50.getProductList();
    restaurant50.setUserId("hi!");
    restaurant50.setName("12/03/2017");
    com.example.unifood.models.Review review59 = new com.example.unifood.models.Review();
    java.lang.String str60 = review59.getId();
    boolean b61 = restaurant50.removeReview(review59);
    com.example.unifood.models.Restaurant restaurant62 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product63 = new com.example.unifood.models.Product();
    boolean b64 = product63.getAvailability();
    restaurant62.addProduct(product63);
    product63.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b68 = restaurant50.removeProduct(product63);
    product63.setCost((float)100);
    boolean b71 = restaurant23.removeProduct(product63);
    boolean b72 = restaurant3.removeProduct(product63);
    com.example.unifood.models.Review review73 = new com.example.unifood.models.Review();
    java.lang.String str74 = review73.getId();
    java.lang.String str75 = review73.getUserId();
    boolean b76 = restaurant3.removeReview(review73);
    java.lang.String str77 = review73.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f19 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "3d6a6f45-ed37-4f1b-bb82-d5b1e22c0d5e"+ "'", str37.equals("3d6a6f45-ed37-4f1b-bb82-d5b1e22c0d5e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "13dfee7d-97f1-412c-a7a0-e00e68cf6396"+ "'", str60.equals("13dfee7d-97f1-412c-a7a0-e00e68cf6396"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "fa774d0a-dfa1-40a6-8c01-1d7f32acc0ab"+ "'", str74.equals("fa774d0a-dfa1-40a6-8c01-1d7f32acc0ab"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str15 = restaurant3.getCampusId();
    restaurant3.setCampusId("82a3735c-51a5-4196-b1e2-ba5966598a25");
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product("1cc346cd-7e37-4aa5-a18f-4211b5a529c9", (float)10L, "15149c67-efc5-4744-85b0-8dc2ac121df7");
    product21.setCost((float)(short)10);
    restaurant3.addProduct(product21);
    product21.setDescription("396a4937-9452-484e-b1eb-dbb739fc5680");
    product21.setDescription("e3cce922-7349-4e53-bd81-74c2f9691201");
    java.lang.String str29 = product21.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "5beb2219-fc29-4877-a901-dfea9af9f55d"+ "'", str29.equals("5beb2219-fc29-4877-a901-dfea9af9f55d"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.addCampus("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    boolean b5 = university1.addCampus("b6792249-a15c-420b-9817-44c9aa457e85");
    java.lang.String str6 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    university1.setId("0baecc35-df86-4223-8916-df65673623be");
    java.lang.String str14 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0baecc35-df86-4223-8916-df65673623be"+ "'", str14.equals("0baecc35-df86-4223-8916-df65673623be"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.delProductFromFavorites("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    studentInfo4.setCampusId("");
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str13, str_array12);
    studentInfo4.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str13);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str13);
    boolean b18 = studentInfo0.addRestaurantToFavorites("9befae08-3641-4d76-a03a-fd4046ab0bc7");
    boolean b20 = studentInfo0.delRestaurantFromFavorites("791f8349-92dc-4d5c-9e5b-4f0889f1e9b0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("8a10075d-10be-45a5-9235-ef85ad59e328", "3f29bd6c-0c82-43b4-ab44-e9f15ccd226a", (float)(-1L), "fcf4a53c-cc22-423a-bfaf-dea98ceedcea");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("74237342-5cf5-495c-86de-c1bc12d8c326", (float)(-1L), "03b11d7c-17ee-42b3-8d2b-a1582b7ae26f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductCostException");
    } catch (com.example.unifood.exceptions.InvalidProductCostException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    review0.setUserId("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    review0.setComment("6c131d36-5c7b-4dd7-8d26-6356ffc532b8");
    java.lang.String str8 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f15 = review9.getRate();
    boolean b16 = restaurant3.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant17.getProductList();
    restaurant3.setProductList(list_product26);
    java.lang.String str28 = restaurant3.getUserId();
    com.example.unifood.models.Product product29 = new com.example.unifood.models.Product();
    boolean b30 = product29.getAvailability();
    product29.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product29.setAvailability(true);
    product29.setCost((float)(byte)10);
    boolean b37 = restaurant3.removeProduct(product29);
    com.example.unifood.models.Restaurant restaurant41 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str42 = restaurant41.getName();
    com.example.unifood.models.Restaurant restaurant43 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product44 = new com.example.unifood.models.Product();
    boolean b45 = product44.getAvailability();
    restaurant43.addProduct(product44);
    java.util.List<com.example.unifood.models.Product> list_product47 = restaurant43.getProductList();
    restaurant43.updateRating();
    java.lang.String str49 = restaurant43.getShortDescription();
    java.lang.String str50 = restaurant43.getName();
    java.util.List<com.example.unifood.models.Product> list_product51 = restaurant43.getProductList();
    restaurant41.setProductList(list_product51);
    restaurant3.setProductList(list_product51);
    java.lang.String str54 = restaurant3.getId();
    java.lang.String str55 = restaurant3.getUserId();
    java.lang.String str56 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str42.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "fef8f1a5-3913-4b27-8338-06f1510dcc4e"+ "'", str54.equals("fef8f1a5-3913-4b27-8338-06f1510dcc4e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str56.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getLocalization();
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    review7.setRate((float)10L);
    review7.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant3.addReview(review7);
    restaurant3.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str6.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    java.lang.String str16 = restaurant13.getUserId();
    java.lang.String str17 = restaurant13.getLocalization();
    restaurant0.update(restaurant13);
    java.lang.String str19 = restaurant13.getLocalization();
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant();
    java.lang.String str21 = restaurant20.getUserId();
    java.lang.String str22 = restaurant20.getUserId();
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant20.getReviewList();
    restaurant13.update(restaurant20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str19.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("1a277d77-2b50-4f35-ae96-722655f36319", (float)(-1), "cf499805-54d6-4e7b-bf12-6f077f4d32ed");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductCostException");
    } catch (com.example.unifood.exceptions.InvalidProductCostException e) {
      // Expected exception.
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "fcf4a53c-cc22-423a-bfaf-dea98ceedcea", "8e6dda6d-66e5-4521-8634-e164e3b1c34c");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2de14f91-715c-407e-9855-53cb5ef7cc46");

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    product7.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b11 = product7.getAvailability();
    boolean b12 = restaurant0.removeProduct(product7);
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str17 = restaurant16.getName();
    restaurant0.update(restaurant16);
    com.example.unifood.models.UserInfo userInfo19 = new com.example.unifood.models.UserInfo();
    java.lang.String str20 = userInfo19.getFirstName();
    java.lang.String str21 = userInfo19.getFirstName();
    userInfo19.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str24 = userInfo19.getFirstName();
    boolean b25 = restaurant0.equals((java.lang.Object)str24);
    java.util.List<com.example.unifood.models.Review> list_review26 = restaurant0.getReviewList();
    java.lang.String str27 = restaurant0.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str17.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str27.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant6.getReviewList();
    restaurant3.setReviewList(list_review13);
    java.util.List<com.example.unifood.models.Review> list_review15 = restaurant3.getReviewList();
    java.lang.String str16 = restaurant3.getName();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str30 = restaurant29.getUserId();
    com.example.unifood.models.Restaurant restaurant34 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant34.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str37 = restaurant34.getShortDescription();
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review();
    java.lang.String str39 = review38.getDate();
    java.lang.String str40 = review38.getComment();
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    review41.setId("");
    java.lang.String str44 = review41.getUserId();
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    review45.setRate((float)10L);
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    review48.setId("");
    java.lang.String str51 = review48.getUserId();
    java.lang.String str52 = review48.getRestaurantId();
    com.example.unifood.models.Review review53 = new com.example.unifood.models.Review();
    review53.setId("");
    com.example.unifood.models.Review review61 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review61.setUserId("");
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review();
    java.lang.String str65 = review64.getDate();
    java.lang.String str66 = review64.getComment();
    com.example.unifood.models.Review review67 = new com.example.unifood.models.Review();
    review67.setId("");
    com.example.unifood.models.Review review70 = new com.example.unifood.models.Review();
    review70.setId("");
    java.lang.String str73 = review70.getUserId();
    java.lang.String str74 = review70.getRestaurantId();
    java.lang.String str75 = review70.getDate();
    com.example.unifood.models.Review review76 = new com.example.unifood.models.Review();
    java.lang.String str77 = review76.getId();
    com.example.unifood.models.Review review83 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review83.setUserId("");
    com.example.unifood.models.Review review86 = new com.example.unifood.models.Review();
    review86.setId("");
    com.example.unifood.models.Review[] review_array89 = new com.example.unifood.models.Review[] { review38, review41, review45, review48, review53, review61, review64, review67, review70, review76, review83, review86 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review90 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b91 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review90, review_array89);
    restaurant34.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review90);
    java.util.List<com.example.unifood.models.Product> list_product93 = restaurant34.getProductList();
    restaurant29.setProductList(list_product93);
    restaurant17.setProductList(list_product93);
    restaurant3.setProductList(list_product93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "12/03/2017"+ "'", str16.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "7cb9ce7e-e31c-4e7c-b7c4-5312e11f368c"+ "'", str77.equals("7cb9ce7e-e31c-4e7c-b7c4-5312e11f368c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product93);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.addRestaurant("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    campus0.setId("2c77b540-e32f-45f5-92bd-7642661e7716");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    restaurant0.setRate((java.lang.Float)0.0f);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setId("");
    java.lang.String str15 = review12.getUserId();
    java.lang.String str16 = review12.getRestaurantId();
    boolean b17 = restaurant0.removeReview(review12);
    java.lang.String str18 = review12.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus5 = new com.example.unifood.models.Campus();
    boolean b7 = campus5.removeRestaurant("hi!");
    campus5.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str10 = campus5.getRestaurants();
    java.lang.String str11 = campus5.getId();
    java.lang.String str12 = campus5.getName();
    campus5.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str15 = campus5.getRestaurants();
    studentInfo0.setFavRestaurants(list_str15);
    boolean b18 = studentInfo0.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus();
    boolean b21 = campus19.removeRestaurant("hi!");
    campus19.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str24 = campus19.getRestaurants();
    boolean b26 = campus19.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b28 = campus19.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b30 = campus19.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b32 = campus19.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus19.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.util.List<java.lang.String> list_str35 = campus19.getRestaurants();
    studentInfo0.setFavRestaurants(list_str35);
    studentInfo0.setCampusId("62987e65-841a-4428-9a65-871cfb981131");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a468052e-db90-4779-a9b3-fff5b5d622ba"+ "'", str11.equals("a468052e-db90-4779-a9b3-fff5b5d622ba"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setId("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    review0.setUserId("239d950c-a53b-45db-9e8f-483a040e426a");
    review0.setRate((float)(short)-1);
    review0.setRestaurantId("9efdf4e3-9f76-42e1-99ca-b299ef37f5e0");
    review0.setRate((float)1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("b697af8d-55e3-4dc7-a299-28b29d5b5e1a", "1e2cb753-1a98-4c7c-993b-ab44c281e6d7", (float)' ', "bf719fa2-623c-40d9-abb9-6f9bf7f630cc");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("392d78ad-3469-4abe-83e2-8fc3d2096494", 1.0f, "75e0de5b-af05-410e-9afa-c211b35b0e94");
    product3.setId("");
    boolean b6 = product3.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("d163bdfa-80ef-44e2-918e-7897348e2871");

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getDate();
    java.lang.String str9 = review7.getComment();
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    review10.setId("");
    java.lang.String str13 = review10.getUserId();
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    review14.setRate((float)10L);
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    java.lang.String str21 = review17.getRestaurantId();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review30.setUserId("");
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    java.lang.String str34 = review33.getDate();
    java.lang.String str35 = review33.getComment();
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setId("");
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    java.lang.String str43 = review39.getRestaurantId();
    java.lang.String str44 = review39.getDate();
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    java.lang.String str46 = review45.getId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review52.setUserId("");
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    review55.setId("");
    com.example.unifood.models.Review[] review_array58 = new com.example.unifood.models.Review[] { review7, review10, review14, review17, review22, review30, review33, review36, review39, review45, review52, review55 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review59 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review59, review_array58);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review59);
    java.util.List<com.example.unifood.models.Product> list_product62 = restaurant3.getProductList();
    restaurant3.setCampusId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    com.example.unifood.models.Product product65 = new com.example.unifood.models.Product();
    boolean b66 = product65.getAvailability();
    product65.setName("3255b7a1-8533-43de-820d-ad22e5728de6");
    boolean b69 = restaurant3.equals((java.lang.Object)"3255b7a1-8533-43de-820d-ad22e5728de6");
    java.lang.String str70 = restaurant3.getCampusId();
    java.lang.String str71 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "e0d85312-2930-47e0-bb40-e93f743fb6cb"+ "'", str46.equals("e0d85312-2930-47e0-bb40-e93f743fb6cb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9"+ "'", str70.equals("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "3d044d98-af07-4542-aca4-4271f61edf74"+ "'", str71.equals("3d044d98-af07-4542-aca4-4271f61edf74"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.delProductFromFavorites("c0679c38-8adf-4203-85c8-515aaf773e20");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("ba69067d-e3bd-4093-876a-8471267d6846");
    boolean b3 = campus1.removeRestaurant("3717b6c7-b0b0-4897-b818-92659d332e3a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    restaurant0.setId("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str10 = restaurant0.getCampusId();
    restaurant0.setShortDescription("43590002-ff0f-4cc9-8729-316ebc4fb5e8");
    restaurant0.setName("1ede2012-6d8b-4886-b09c-d88386ee74f6");
    java.lang.String str15 = restaurant0.getLocalization();
    com.example.unifood.models.UserInfo userInfo19 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    java.lang.String str20 = userInfo19.getFirstName();
    java.lang.String str21 = userInfo19.getLastName();
    boolean b22 = restaurant0.equals((java.lang.Object)str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "d2c231e2-7a36-4c3e-85a5-77d4735a3460"+ "'", str20.equals("d2c231e2-7a36-4c3e-85a5-77d4735a3460"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "376f29dd-77f2-4b44-8c95-b9ac348c4e6f"+ "'", str21.equals("376f29dd-77f2-4b44-8c95-b9ac348c4e6f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str16 = restaurant15.getUserId();
    restaurant15.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant15.updateRating();
    restaurant0.update(restaurant15);
    java.lang.String str21 = restaurant15.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "addba82a-78b9-4322-a99a-7ed6a35c8105"+ "'", str4.equals("addba82a-78b9-4322-a99a-7ed6a35c8105"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    restaurant4.addProduct(product5);
    java.util.List<com.example.unifood.models.Product> list_product8 = restaurant4.getProductList();
    restaurant4.setUserId("hi!");
    restaurant4.setName("12/03/2017");
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review();
    java.lang.String str14 = review13.getId();
    boolean b15 = restaurant4.removeReview(review13);
    java.lang.String str16 = review13.getId();
    review13.setRate(10.0f);
    restaurant3.addReview(review13);
    java.lang.Float f20 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0c5b0aca-37f1-4571-98a6-e7dc29884b25"+ "'", str14.equals("0c5b0aca-37f1-4571-98a6-e7dc29884b25"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0c5b0aca-37f1-4571-98a6-e7dc29884b25"+ "'", str16.equals("0c5b0aca-37f1-4571-98a6-e7dc29884b25"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f20 + "' != '" + 0.0f+ "'", f20.equals(0.0f));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant14.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str17 = restaurant14.getShortDescription();
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    java.lang.String str19 = review18.getDate();
    java.lang.String str20 = review18.getComment();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    review25.setRate((float)10L);
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    review28.setId("");
    java.lang.String str31 = review28.getUserId();
    java.lang.String str32 = review28.getRestaurantId();
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    review33.setId("");
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review41.setUserId("");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    java.lang.String str45 = review44.getDate();
    java.lang.String str46 = review44.getComment();
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    java.lang.String str53 = review50.getUserId();
    java.lang.String str54 = review50.getRestaurantId();
    java.lang.String str55 = review50.getDate();
    com.example.unifood.models.Review review56 = new com.example.unifood.models.Review();
    java.lang.String str57 = review56.getId();
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review63.setUserId("");
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    review66.setId("");
    com.example.unifood.models.Review[] review_array69 = new com.example.unifood.models.Review[] { review18, review21, review25, review28, review33, review41, review44, review47, review50, review56, review63, review66 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review70 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review70, review_array69);
    restaurant14.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review70);
    java.util.List<com.example.unifood.models.Product> list_product73 = restaurant14.getProductList();
    restaurant3.setProductList(list_product73);
    com.example.unifood.models.Restaurant restaurant75 = new com.example.unifood.models.Restaurant();
    java.lang.String str76 = restaurant75.getUserId();
    restaurant75.updateRating();
    restaurant3.update(restaurant75);
    java.lang.String str79 = restaurant3.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "8de27154-3b14-4424-b26e-8371c0e0e22a"+ "'", str57.equals("8de27154-3b14-4424-b26e-8371c0e0e22a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + ""+ "'", str76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + ""+ "'", str79.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("55dabc7b-3fe7-4421-a040-d45c92cd70da");

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant3.getUserId();
    com.example.unifood.models.Review review8 = new com.example.unifood.models.Review();
    review8.setId("");
    java.lang.String str11 = review8.getUserId();
    review8.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str14 = review8.getRestaurantId();
    review8.setRestaurantId("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b17 = restaurant3.removeReview(review8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("9e07b376-c51f-4d86-97b2-e0560ef5c7b1", "6db24d8b-795e-4f18-90c1-0829082a61ed", 0.0f, "9b2b0e9c-d4e3-4f54-81b4-5eb5bc461249", "6ce991ef-1e5f-48b7-aad9-18b7d1b0d9ed");

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str14 = campus0.getId();
    campus0.setId("feead3ac-95d2-40b0-975f-07d3dc66037a");
    java.lang.String str17 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "7b6c8683-682e-4d4a-8b27-d922df9c9f7e"+ "'", str14.equals("7b6c8683-682e-4d4a-8b27-d922df9c9f7e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "feead3ac-95d2-40b0-975f-07d3dc66037a"+ "'", str17.equals("feead3ac-95d2-40b0-975f-07d3dc66037a"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    review5.setRestaurantId("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    review5.setId("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    java.lang.String str12 = review5.getComment();
    review5.setRestaurantId("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str12.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    studentInfo0.setCampusId("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavRestaurants();
    com.example.unifood.models.Campus campus13 = new com.example.unifood.models.Campus();
    boolean b15 = campus13.removeRestaurant("hi!");
    campus13.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str18 = campus13.getRestaurants();
    java.lang.String str19 = campus13.getId();
    java.lang.String str20 = campus13.getName();
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    java.util.List<java.lang.String> list_str24 = studentInfo21.getFavRestaurants();
    campus13.setRestaurants(list_str24);
    studentInfo11.setFavRestaurants(list_str24);
    studentInfo0.setFavProducts(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "625d733b-5851-44b0-824d-15975f50500c"+ "'", str19.equals("625d733b-5851-44b0-824d-15975f50500c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str20.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    float f8 = product0.getCost();
    product0.setAvailability(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    java.lang.String str4 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    java.lang.String str7 = ownerInfo0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str3.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str4.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9741db0d-f106-4ae0-9562-dbd17d50d5a3"+ "'", str7.equals("9741db0d-f106-4ae0-9562-dbd17d50d5a3"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("1d94a4ce-cef9-49e0-802d-05ee4d25de76", "bd6ba047-d3b3-4365-b3c1-e5c4068052c1", 0.0f, "3fcb0ac4-7d96-4071-a6d0-8f688fbf3bd8", "43590002-ff0f-4cc9-8729-316ebc4fb5e8");
    review5.setRate((float)(short)-1);
    java.lang.String str8 = review5.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3fcb0ac4-7d96-4071-a6d0-8f688fbf3bd8"+ "'", str8.equals("3fcb0ac4-7d96-4071-a6d0-8f688fbf3bd8"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    java.lang.String str3 = userInfo0.getFirstName();
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setType("27fab29a-8261-4cad-9980-1ab61f13cf41");
    userInfo0.setType("a7ebaf4b-ff03-4b84-bd80-94754b28f994");
    java.lang.String str10 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    restaurant0.setShortDescription("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant0.getReviewList();
    java.lang.String str13 = restaurant0.getCampusId();
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    boolean b16 = product15.getAvailability();
    restaurant14.addProduct(product15);
    java.util.List<com.example.unifood.models.Product> list_product18 = restaurant14.getProductList();
    restaurant14.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    java.lang.String str22 = review21.getId();
    boolean b23 = restaurant14.removeReview(review21);
    java.lang.String str24 = restaurant14.getCampusId();
    restaurant0.update(restaurant14);
    restaurant14.setUserId("0f3a0031-4538-4866-b77f-a1045008f006");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "e5753dee-5dc5-48e6-87a7-df8c8eb5bd98"+ "'", str22.equals("e5753dee-5dc5-48e6-87a7-df8c8eb5bd98"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review("239d950c-a53b-45db-9e8f-483a040e426a", "adb74c6f-c839-47cc-b096-1c12240d6afd", 1.0f, "49976e80-f69f-4380-aa76-dc904dcb2eca", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str14 = review13.getId();
    restaurant3.addReview(review13);
    java.lang.String str16 = review13.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "6840a356-aa11-4e61-8251-d11bedf808e0"+ "'", str5.equals("6840a356-aa11-4e61-8251-d11bedf808e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "47746bc2-b343-4909-bee3-2d83bd9ab276"+ "'", str14.equals("47746bc2-b343-4909-bee3-2d83bd9ab276"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "239d950c-a53b-45db-9e8f-483a040e426a"+ "'", str16.equals("239d950c-a53b-45db-9e8f-483a040e426a"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException0 = new com.example.unifood.exceptions.InvalidProductNameException();
    java.lang.String str1 = invalidProductNameException0.toString();
    com.example.unifood.exceptions.OwnerException ownerException2 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException3 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException2.addSuppressed((java.lang.Throwable)invalidCampusIdException3);
    java.lang.Throwable[] throwable_array5 = ownerException2.getSuppressed();
    java.lang.String str6 = ownerException2.toString();
    java.lang.Throwable[] throwable_array7 = ownerException2.getSuppressed();
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException8 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str9 = invalidRestaurantNameException8.toString();
    java.lang.Throwable[] throwable_array10 = invalidRestaurantNameException8.getSuppressed();
    java.lang.String str11 = invalidRestaurantNameException8.toString();
    ownerException2.addSuppressed((java.lang.Throwable)invalidRestaurantNameException8);
    invalidProductNameException0.addSuppressed((java.lang.Throwable)invalidRestaurantNameException8);
    java.lang.String str14 = invalidProductNameException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.InvalidProductNameException"+ "'", str1.equals("com.example.unifood.exceptions.InvalidProductNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str9.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str11.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.InvalidProductNameException"+ "'", str14.equals("com.example.unifood.exceptions.InvalidProductNameException"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setAvailability(true);
    product0.setCost(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    java.lang.String str13 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7393fe25-660b-4d55-a755-22ca7c412925"+ "'", str5.equals("7393fe25-660b-4d55-a755-22ca7c412925"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str13.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setApproved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setCost((float)'#');
    float f7 = product3.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 35.0f);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getDate();
    java.lang.String str9 = review7.getComment();
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    review10.setId("");
    java.lang.String str13 = review10.getUserId();
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    review14.setRate((float)10L);
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    java.lang.String str21 = review17.getRestaurantId();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review30.setUserId("");
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    java.lang.String str34 = review33.getDate();
    java.lang.String str35 = review33.getComment();
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setId("");
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    java.lang.String str43 = review39.getRestaurantId();
    java.lang.String str44 = review39.getDate();
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    java.lang.String str46 = review45.getId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review52.setUserId("");
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    review55.setId("");
    com.example.unifood.models.Review[] review_array58 = new com.example.unifood.models.Review[] { review7, review10, review14, review17, review22, review30, review33, review36, review39, review45, review52, review55 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review59 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review59, review_array58);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review59);
    java.util.List<com.example.unifood.models.Product> list_product62 = restaurant3.getProductList();
    java.lang.String str63 = restaurant3.getCampusId();
    com.example.unifood.models.Product product64 = new com.example.unifood.models.Product();
    boolean b65 = product64.getAvailability();
    product64.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b68 = product64.getAvailability();
    float f69 = product64.getCost();
    product64.setId("0daa91b1-d5d0-4037-891c-58f0636ac1bc");
    product64.setAvailability(true);
    boolean b74 = restaurant3.removeProduct(product64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "7bd08a6b-b727-4df9-b4a8-fc773acbf6a2"+ "'", str46.equals("7bd08a6b-b727-4df9-b4a8-fc773acbf6a2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str63.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f69 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant0.getName();
    restaurant0.setId("3db35cfa-ac0a-4288-9084-8d042e570026");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product();
    boolean b18 = product17.getAvailability();
    restaurant16.addProduct(product17);
    java.util.List<com.example.unifood.models.Product> list_product20 = restaurant16.getProductList();
    restaurant16.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant16.getReviewList();
    restaurant13.setReviewList(list_review23);
    java.util.List<com.example.unifood.models.Review> list_review25 = restaurant13.getReviewList();
    restaurant0.setReviewList(list_review25);
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str7.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review25);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant14.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str17 = restaurant14.getShortDescription();
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    java.lang.String str19 = review18.getDate();
    java.lang.String str20 = review18.getComment();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    review25.setRate((float)10L);
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    review28.setId("");
    java.lang.String str31 = review28.getUserId();
    java.lang.String str32 = review28.getRestaurantId();
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    review33.setId("");
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review41.setUserId("");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    java.lang.String str45 = review44.getDate();
    java.lang.String str46 = review44.getComment();
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    java.lang.String str53 = review50.getUserId();
    java.lang.String str54 = review50.getRestaurantId();
    java.lang.String str55 = review50.getDate();
    com.example.unifood.models.Review review56 = new com.example.unifood.models.Review();
    java.lang.String str57 = review56.getId();
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review63.setUserId("");
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    review66.setId("");
    com.example.unifood.models.Review[] review_array69 = new com.example.unifood.models.Review[] { review18, review21, review25, review28, review33, review41, review44, review47, review50, review56, review63, review66 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review70 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review70, review_array69);
    restaurant14.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review70);
    java.util.List<com.example.unifood.models.Product> list_product73 = restaurant14.getProductList();
    restaurant3.setProductList(list_product73);
    restaurant3.setApproved(true);
    java.util.List<com.example.unifood.models.Review> list_review77 = restaurant3.getReviewList();
    restaurant3.setUserId("0443a495-187d-4e8b-baa9-bb7cbdacbe5a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "4205927b-34eb-43b1-bac8-f49da88781e8"+ "'", str57.equals("4205927b-34eb-43b1-bac8-f49da88781e8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review77);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("966eb1c9-3eb2-4ca2-91cb-de5257760e00");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "966eb1c9-3eb2-4ca2-91cb-de5257760e00"+ "'", str2.equals("966eb1c9-3eb2-4ca2-91cb-de5257760e00"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str13 = restaurant12.getUserId();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant17.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str20 = restaurant17.getShortDescription();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    java.lang.String str22 = review21.getDate();
    java.lang.String str23 = review21.getComment();
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    review24.setId("");
    java.lang.String str27 = review24.getUserId();
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    review28.setRate((float)10L);
    com.example.unifood.models.Review review31 = new com.example.unifood.models.Review();
    review31.setId("");
    java.lang.String str34 = review31.getUserId();
    java.lang.String str35 = review31.getRestaurantId();
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setId("");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review44.setUserId("");
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    java.lang.String str48 = review47.getDate();
    java.lang.String str49 = review47.getComment();
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    com.example.unifood.models.Review review53 = new com.example.unifood.models.Review();
    review53.setId("");
    java.lang.String str56 = review53.getUserId();
    java.lang.String str57 = review53.getRestaurantId();
    java.lang.String str58 = review53.getDate();
    com.example.unifood.models.Review review59 = new com.example.unifood.models.Review();
    java.lang.String str60 = review59.getId();
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review66.setUserId("");
    com.example.unifood.models.Review review69 = new com.example.unifood.models.Review();
    review69.setId("");
    com.example.unifood.models.Review[] review_array72 = new com.example.unifood.models.Review[] { review21, review24, review28, review31, review36, review44, review47, review50, review53, review59, review66, review69 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review73 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review73, review_array72);
    restaurant17.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review73);
    java.util.List<com.example.unifood.models.Product> list_product76 = restaurant17.getProductList();
    restaurant12.setProductList(list_product76);
    restaurant0.setProductList(list_product76);
    java.lang.String str79 = restaurant0.getLocalization();
    java.util.List<com.example.unifood.models.Product> list_product80 = restaurant0.getProductList();
    restaurant0.setLocalization("addba82a-78b9-4322-a99a-7ed6a35c8105");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "8a4aabd0-e430-4f19-96d1-452cdbe2a986"+ "'", str60.equals("8a4aabd0-e430-4f19-96d1-452cdbe2a986"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + ""+ "'", str79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product80);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeProduct(product13);
    product13.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str21 = product13.getDescription();
    product13.setCost(10.0f);
    boolean b24 = product13.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "429a2818-ec94-4d38-8e60-29ecc71c4aaa"+ "'", str10.equals("429a2818-ec94-4d38-8e60-29ecc71c4aaa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str21.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    review12.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review12.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeReview(review12);
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.lang.String str23 = restaurant19.getId();
    restaurant19.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.update(restaurant19);
    restaurant19.updateRating();
    java.lang.String str28 = restaurant19.getId();
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product30 = new com.example.unifood.models.Product();
    boolean b31 = product30.getAvailability();
    restaurant29.addProduct(product30);
    java.util.List<com.example.unifood.models.Product> list_product33 = restaurant29.getProductList();
    restaurant29.setUserId("hi!");
    restaurant29.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review38 = restaurant29.getReviewList();
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant42.setName("12/03/2017");
    java.lang.String str45 = restaurant42.getUserId();
    java.lang.String str46 = restaurant42.getLocalization();
    restaurant29.update(restaurant42);
    restaurant29.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    java.lang.String str53 = review50.getUserId();
    java.lang.String str54 = review50.getRestaurantId();
    restaurant29.addReview(review50);
    java.lang.String str56 = review50.getUserId();
    java.lang.String str57 = review50.getUserId();
    boolean b58 = restaurant19.removeReview(review50);
    review50.setComment("82c6ce4c-1ae9-44e3-b51a-eb720b3cd059");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1885e40f-90c6-49e4-9952-a20141098d38"+ "'", str10.equals("1885e40f-90c6-49e4-9952-a20141098d38"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "5b2281a2-71ff-46d0-b204-2c60fc6aea17"+ "'", str23.equals("5b2281a2-71ff-46d0-b204-2c60fc6aea17"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str28.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str46.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f8 = restaurant3.getRate();
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant12.setName("12/03/2017");
    java.lang.String str15 = restaurant12.getUserId();
    restaurant12.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    java.lang.String str19 = review18.getId();
    boolean b20 = restaurant12.equals((java.lang.Object)review18);
    restaurant3.update(restaurant12);
    java.lang.String str22 = restaurant12.getLocalization();
    java.util.List<com.example.unifood.models.Product> list_product23 = restaurant12.getProductList();
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant12.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "16e71992-73fb-4e8a-8346-413b38708bc7"+ "'", str19.equals("16e71992-73fb-4e8a-8346-413b38708bc7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str22.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant0.removeReview(review9);
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    java.lang.String str13 = review12.getDate();
    review12.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review12.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = restaurant0.removeReview(review12);
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.lang.String str23 = restaurant19.getId();
    restaurant19.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.update(restaurant19);
    restaurant19.updateRating();
    java.lang.String str28 = restaurant19.getId();
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product30 = new com.example.unifood.models.Product();
    boolean b31 = product30.getAvailability();
    restaurant29.addProduct(product30);
    java.util.List<com.example.unifood.models.Product> list_product33 = restaurant29.getProductList();
    restaurant29.setUserId("hi!");
    restaurant29.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review38 = restaurant29.getReviewList();
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant42.setName("12/03/2017");
    java.lang.String str45 = restaurant42.getUserId();
    java.lang.String str46 = restaurant42.getLocalization();
    restaurant29.update(restaurant42);
    restaurant29.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    java.lang.String str53 = review50.getUserId();
    java.lang.String str54 = review50.getRestaurantId();
    restaurant29.addReview(review50);
    java.lang.String str56 = review50.getUserId();
    java.lang.String str57 = review50.getUserId();
    boolean b58 = restaurant19.removeReview(review50);
    java.lang.String str59 = review50.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "c0fe21ef-f189-46a8-a70f-f3ef267fcccb"+ "'", str10.equals("c0fe21ef-f189-46a8-a70f-f3ef267fcccb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "f008a827-f469-4b24-8a20-023d30564542"+ "'", str23.equals("f008a827-f469-4b24-8a20-023d30564542"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str28.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str46.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str59);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    product3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    product3.setAvailability(false);
    product3.setAvailability(false);
    product3.setName("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    product3.setId("ba952efb-159f-4c03-8529-8a007d153296");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("3e05f84f-fae9-4094-b787-f1eb3d49517a");

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    float f3 = product0.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str12 = campus0.getName();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    studentInfo13.setCampusId("");
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array21);
    studentInfo13.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str22);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str22);
    java.lang.String str26 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "8fdc456d-ad0f-4b72-a63b-f8f06d46c428"+ "'", str26.equals("8fdc456d-ad0f-4b72-a63b-f8f06d46c428"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getDate();
    java.lang.String str9 = review7.getComment();
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    review10.setId("");
    java.lang.String str13 = review10.getUserId();
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    review14.setRate((float)10L);
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    java.lang.String str21 = review17.getRestaurantId();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review30.setUserId("");
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    java.lang.String str34 = review33.getDate();
    java.lang.String str35 = review33.getComment();
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setId("");
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    java.lang.String str43 = review39.getRestaurantId();
    java.lang.String str44 = review39.getDate();
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    java.lang.String str46 = review45.getId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review52.setUserId("");
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    review55.setId("");
    com.example.unifood.models.Review[] review_array58 = new com.example.unifood.models.Review[] { review7, review10, review14, review17, review22, review30, review33, review36, review39, review45, review52, review55 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review59 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review59, review_array58);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review59);
    java.util.List<com.example.unifood.models.Product> list_product62 = restaurant3.getProductList();
    java.lang.String str63 = restaurant3.getCampusId();
    restaurant3.setShortDescription("f1075df9-f286-462a-8dd0-d8f9bae65121");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "441fe2dc-1a48-4cae-8ade-9f1b4da8baa1"+ "'", str46.equals("441fe2dc-1a48-4cae-8ade-9f1b4da8baa1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str63.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getName();
    restaurant3.setRate((java.lang.Float)10.0f);
    restaurant3.setRate((java.lang.Float)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    restaurant0.setLocalization("f695ed82-229b-4109-958e-25c92fc7e7c5");
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    product12.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product12.setCost((float)' ');
    boolean b17 = restaurant0.equals((java.lang.Object)product12);
    product12.setName("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    float f20 = product12.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 32.0f);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant18.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str21 = restaurant18.getShortDescription();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    java.lang.String str23 = review22.getDate();
    java.lang.String str24 = review22.getComment();
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    review25.setId("");
    java.lang.String str28 = review25.getUserId();
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    review29.setRate((float)10L);
    com.example.unifood.models.Review review32 = new com.example.unifood.models.Review();
    review32.setId("");
    java.lang.String str35 = review32.getUserId();
    java.lang.String str36 = review32.getRestaurantId();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    review37.setId("");
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review45.setUserId("");
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    java.lang.String str49 = review48.getDate();
    java.lang.String str50 = review48.getComment();
    com.example.unifood.models.Review review51 = new com.example.unifood.models.Review();
    review51.setId("");
    com.example.unifood.models.Review review54 = new com.example.unifood.models.Review();
    review54.setId("");
    java.lang.String str57 = review54.getUserId();
    java.lang.String str58 = review54.getRestaurantId();
    java.lang.String str59 = review54.getDate();
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review();
    java.lang.String str61 = review60.getId();
    com.example.unifood.models.Review review67 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review67.setUserId("");
    com.example.unifood.models.Review review70 = new com.example.unifood.models.Review();
    review70.setId("");
    com.example.unifood.models.Review[] review_array73 = new com.example.unifood.models.Review[] { review22, review25, review29, review32, review37, review45, review48, review51, review54, review60, review67, review70 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review74 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review74, review_array73);
    restaurant18.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review74);
    java.util.List<com.example.unifood.models.Product> list_product77 = restaurant18.getProductList();
    restaurant18.setCampusId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    restaurant18.setLocalization("8e069f68-c995-4d5a-9117-23fad524d3d9");
    com.example.unifood.models.Review review82 = null;
    restaurant18.addReview(review82);
    restaurant3.update(restaurant18);
    restaurant18.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "963a63a2-b81d-4268-a20f-dbd808873522"+ "'", str61.equals("963a63a2-b81d-4268-a20f-dbd808873522"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product77);

  }

}
