package com.example.unifood.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test001"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    boolean b13 = university1.removeCampus("81590a16-8f83-4cfa-b624-11d3353e52f8");
    university1.setName("310432b2-bbdc-4327-8dd8-4eee1a883b11");
    university1.setName("3d912473-a9e4-4edf-a6d1-3f6818834d70");
    com.example.unifood.models.University university19 = new com.example.unifood.models.University("12/03/2017");
    boolean b21 = university19.addCampus("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str22 = university19.getName();
    java.util.List<java.lang.String> list_str23 = university19.getAllCampus();
    university1.setAllCampus(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "12/03/2017"+ "'", str22.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test002"); }

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
    java.lang.String str24 = product13.getName();
    product13.setDescription("f01dbd23-efa7-49fb-8603-33a9d3dcb96c");
    boolean b27 = product13.getAvailability();
    java.lang.String str28 = product13.getName();
    java.lang.String str29 = product13.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "f9846890-2eec-4f6c-94bc-e9bb106bb645"+ "'", str10.equals("f9846890-2eec-4f6c-94bc-e9bb106bb645"));
    
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
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test003"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review0.setRate((float)(-1L));
    java.lang.String str10 = review0.getRestaurantId();
    java.lang.String str11 = review0.getRestaurantId();
    java.lang.String str12 = review0.getId();
    review0.setId("396a4937-9452-484e-b1eb-dbb739fc5680");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test004"); }

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
    restaurant0.setName("e2144475-af4e-4137-826c-e2b1a9f36f62");
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.util.List<com.example.unifood.models.Product> list_product23 = restaurant19.getProductList();
    restaurant19.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant19.setApproved(false);
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product29 = new com.example.unifood.models.Product();
    boolean b30 = product29.getAvailability();
    restaurant28.addProduct(product29);
    restaurant28.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant19.update(restaurant28);
    java.util.List<com.example.unifood.models.Review> list_review35 = restaurant19.getReviewList();
    restaurant0.setReviewList(list_review35);
    restaurant0.updateRating();
    java.util.List<com.example.unifood.models.Product> list_product38 = restaurant0.getProductList();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product38);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test005"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b12 = university1.removeCampus("bf93221f-f963-4560-8f4a-9bd0a88f2bc4");
    boolean b14 = university1.addCampus("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    university1.setName("0787174c-4cad-4937-8581-9e2857bc0965");
    java.lang.String str17 = university1.getName();
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavRestaurants();
    studentInfo19.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    studentInfo19.setFavRestaurants(list_str25);
    java.lang.String str27 = studentInfo19.getCampusId();
    java.util.List<java.lang.String> list_str28 = studentInfo19.getFavProducts();
    com.example.unifood.models.Campus campus29 = new com.example.unifood.models.Campus();
    boolean b31 = campus29.removeRestaurant("hi!");
    java.lang.String[] str_array56 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str57 = new java.util.ArrayList<java.lang.String>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str57, str_array56);
    campus29.setRestaurants((java.util.List<java.lang.String>)arraylist_str57);
    java.lang.String str60 = campus29.getId();
    boolean b62 = campus29.removeRestaurant("10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str63 = campus29.getName();
    java.util.List<java.lang.String> list_str64 = campus29.getRestaurants();
    studentInfo19.setFavProducts(list_str64);
    university1.setAllCampus(list_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0787174c-4cad-4937-8581-9e2857bc0965"+ "'", str17.equals("0787174c-4cad-4937-8581-9e2857bc0965"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "b3660a10-0a45-4a63-a48b-cafcf60da884"+ "'", str27.equals("b3660a10-0a45-4a63-a48b-cafcf60da884"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "ae7db493-6fe0-4986-a063-d2d070b2dcdb"+ "'", str60.equals("ae7db493-6fe0-4986-a063-d2d070b2dcdb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str64);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test006"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    restaurant0.setRate((java.lang.Float)0.0f);
    java.lang.String str11 = restaurant0.getLocalization();
    com.example.unifood.models.Review review16 = new com.example.unifood.models.Review("84c380a1-fee2-4bfe-82b9-7668a6f07e00", "1fcc4f0c-26bc-4946-bf17-5d8a16792f98", 0.0f, "10649ddd-831c-4a5d-b54e-db55a76d1419");
    review16.setRestaurantId("com.example.unifood.exceptions.InvalidRestaurantNameException");
    review16.setDate("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    restaurant0.addReview(review16);
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    restaurant22.addProduct(product23);
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant22.getProductList();
    restaurant22.setUserId("hi!");
    restaurant22.setName("12/03/2017");
    java.lang.String str31 = restaurant22.getCampusId();
    java.lang.String str32 = restaurant22.getUserId();
    restaurant22.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.util.List<com.example.unifood.models.Review> list_review35 = restaurant22.getReviewList();
    restaurant0.setReviewList(list_review35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review35);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test007"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.lang.String str3 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "05d6d3a4-b9be-4b71-8358-e00ca05e6909"+ "'", str2.equals("05d6d3a4-b9be-4b71-8358-e00ca05e6909"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test008"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getFirstName();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setFirstName("850c66ab-1149-4a36-b911-3dc319169391");
    java.lang.String str8 = userInfo0.getLastName();
    java.lang.String str9 = userInfo0.getType();
    
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test009"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("16cb478c-8a6e-49fc-af83-c6fe026d107d", "4c03c015-9b73-4582-a68c-6a745ffd0ba1", 10.0f, "0dab1c9a-73a3-40c8-a692-af81f288fa09", "18e207e3-9a55-4e75-b70d-d91dffad8bc9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test010"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str7 = review0.getUserId();
    review0.setRestaurantId("97c6065a-5ace-4e48-924e-726a0720cea6");
    review0.setUserId("0df57624-e802-4310-9f52-20c7b3d07ad6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test011"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("884ccf9b-f5d8-4efa-b69a-71e5ff4b08c7");
    ownerInfo1.setRestaurantId("774bbc3b-8131-4fe6-9b66-5bfd40d76cf8");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test012"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("d6f287cf-eb37-4b25-bb5f-c03b89831215");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    boolean b6 = campus2.removeRestaurant("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavRestaurants();
    studentInfo8.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    studentInfo8.setFavRestaurants(list_str14);
    java.lang.String str16 = studentInfo8.getCampusId();
    java.util.List<java.lang.String> list_str17 = studentInfo8.getFavRestaurants();
    java.util.List<java.lang.String> list_str18 = studentInfo8.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo8.getFavRestaurants();
    java.util.List<java.lang.String> list_str20 = studentInfo8.getFavRestaurants();
    campus2.setRestaurants(list_str20);
    campus1.setRestaurants(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "b3660a10-0a45-4a63-a48b-cafcf60da884"+ "'", str16.equals("b3660a10-0a45-4a63-a48b-cafcf60da884"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test013"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("94efe791-29d9-44b8-a61a-a5e706fd82cd");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test014"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.lang.String str11 = review0.getRestaurantId();
    java.lang.String str12 = review0.getComment();
    java.lang.String str13 = review0.getDate();
    review0.setRestaurantId("");
    review0.setRate((float)'#');
    review0.setRestaurantId("2a640a55-d291-4d78-b499-cbe180a8c701");
    review0.setRestaurantId("bd4f1e95-4bf1-4630-abec-30f70ccfbff2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a7f88f28-d728-4cc0-82b9-46eaad96df5f"+ "'", str12.equals("a7f88f28-d728-4cc0-82b9-46eaad96df5f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str13.equals("2016930c-728d-45c5-a236-9c4833a30246"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test015"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("ab3ba457-f9a8-416f-872c-51f3f6ab602f");
    ownerInfo0.setRestaurantId("d4d080c9-ca01-49dd-8eb0-a9da64067acc");
    ownerInfo0.setRestaurantId("0a01c867-0399-4a19-98f2-2b9dbaefe3f0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test016"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    restaurant3.setShortDescription("cd4867d8-bf69-49f8-8afe-83927c39eaba");
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant10.updateRating();
    java.lang.String str16 = restaurant10.getShortDescription();
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant20.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str23 = restaurant20.getShortDescription();
    boolean b25 = restaurant20.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant20.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product29 = new com.example.unifood.models.Product();
    boolean b30 = product29.getAvailability();
    restaurant28.addProduct(product29);
    java.util.List<com.example.unifood.models.Product> list_product32 = restaurant28.getProductList();
    restaurant28.setUserId("hi!");
    restaurant28.setName("12/03/2017");
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getId();
    boolean b39 = restaurant28.removeReview(review37);
    com.example.unifood.models.Restaurant restaurant40 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product41 = new com.example.unifood.models.Product();
    boolean b42 = product41.getAvailability();
    restaurant40.addProduct(product41);
    product41.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b46 = restaurant28.removeProduct(product41);
    restaurant20.addProduct(product41);
    product41.setName("bf93221f-f963-4560-8f4a-9bd0a88f2bc4");
    restaurant10.addProduct(product41);
    boolean b51 = restaurant3.equals((java.lang.Object)product41);
    product41.setName("c28192ff-273c-4a31-9582-5ba3ad6cd6a5");
    java.lang.String str54 = product41.getName();
    float f55 = product41.getCost();
    product41.setDescription("6eadf2cc-8094-4c03-a424-275c022b9ded");
    float f58 = product41.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "950b19bd-f72a-44e0-8a2e-ebc843077c77"+ "'", str5.equals("950b19bd-f72a-44e0-8a2e-ebc843077c77"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "80edef0b-df0c-4f61-b885-bf5483aa2ef3"+ "'", str38.equals("80edef0b-df0c-4f61-b885-bf5483aa2ef3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "c28192ff-273c-4a31-9582-5ba3ad6cd6a5"+ "'", str54.equals("c28192ff-273c-4a31-9582-5ba3ad6cd6a5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f55 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f58 == 0.0f);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test017"); }

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
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    boolean b16 = studentInfo14.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str17 = studentInfo14.getFavRestaurants();
    boolean b18 = restaurant0.equals((java.lang.Object)studentInfo14);
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    studentInfo19.setCampusId("");
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    studentInfo19.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    studentInfo19.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str33 = studentInfo19.getCampusId();
    java.lang.String str34 = studentInfo19.getCampusId();
    boolean b36 = studentInfo19.delRestaurantFromFavorites("com.example.unifood.exceptions.StudentException");
    boolean b38 = studentInfo19.delProductFromFavorites("cac17277-9555-4716-8268-db3950599eca");
    boolean b40 = studentInfo19.delRestaurantFromFavorites("a32072e2-9bd2-4c22-9b38-cf9487145555");
    com.example.unifood.models.University university42 = new com.example.unifood.models.University("hi!");
    java.lang.String str43 = university42.getId();
    java.util.List<java.lang.String> list_str44 = university42.getAllCampus();
    boolean b46 = university42.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.util.List<java.lang.String> list_str47 = university42.getAllCampus();
    studentInfo19.setFavProducts(list_str47);
    studentInfo14.setFavRestaurants(list_str47);
    com.example.unifood.models.Campus campus51 = new com.example.unifood.models.Campus("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str52 = campus51.getName();
    java.util.List<java.lang.String> list_str53 = campus51.getRestaurants();
    studentInfo14.setFavRestaurants(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str33.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str34.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "16c931d4-42b9-41b0-9cb2-5a469f40eb41"+ "'", str43.equals("16c931d4-42b9-41b0-9cb2-5a469f40eb41"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str52.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test018"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    java.lang.String str10 = studentInfo0.getCampusId();
    boolean b12 = studentInfo0.addRestaurantToFavorites("dc3009ab-4e71-4853-844b-8f9576dbc28c");
    boolean b14 = studentInfo0.addProductToFavorites("3717b6c7-b0b0-4897-b818-92659d332e3a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str10.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test019"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("", "5beb2219-fc29-4877-a901-dfea9af9f55d", 10.0f, "66904561-333e-4a37-a75a-611c0621fe83");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test020"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    review0.setUserId("53d5e04e-abb5-45a7-a278-d742367421a0");
    review0.setUserId("");
    java.lang.String str10 = review0.getId();
    review0.setRestaurantId("041f0a74-169e-4210-9a45-d7590efa37d2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test021"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setRestaurantId("ec1c7744-8529-4314-837e-cb723075bf0b");
    java.lang.String str8 = review0.getComment();
    java.lang.String str9 = review0.getDate();
    java.lang.String str10 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test022"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("", "36a16465-b78b-4e27-a07b-1daf83018bef", (float)1L, "c14a5efd-6438-48b2-a392-473e7c7f6c04", "b5310abe-6686-4d95-a4fa-910d88197ca7");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test023"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.String str10 = restaurant0.getUserId();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f15 = product14.getCost();
    java.lang.String str16 = product14.getDescription();
    restaurant0.addProduct(product14);
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    review18.setId("");
    java.lang.String str21 = review18.getUserId();
    review18.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str24 = review18.getRestaurantId();
    review18.setRate((float)(byte)0);
    restaurant0.addReview(review18);
    review18.setId("a90f578d-1035-4250-a00e-7ed00597a4d3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "12/03/2017"+ "'", str16.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test024"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getDate();
    java.lang.String str8 = review0.getRestaurantId();
    review0.setRestaurantId("b1e0ce4f-fe08-425e-8497-24824ac3c0d9");
    review0.setComment("7c382e92-acef-4318-a40d-158e77003992");
    review0.setDate("50e2197b-20e0-4a53-90b1-3533f42f7aa6");
    java.lang.String str15 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "b1e0ce4f-fe08-425e-8497-24824ac3c0d9"+ "'", str15.equals("b1e0ce4f-fe08-425e-8497-24824ac3c0d9"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test025"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("eded2c27-2d44-4371-b6f1-7f0cb66909b3");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test026"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setApproved(true);
    java.lang.String str14 = restaurant3.getName();
    restaurant3.setCampusId("4fb5f9db-fa7a-4e2d-b041-535ceed8d1de");
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "9bb4ec51-2299-41a3-b764-2192d7b57501"+ "'", str14.equals("9bb4ec51-2299-41a3-b764-2192d7b57501"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test027"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setLastName("2af0b02e-4c9a-4970-a399-ff63e0300464");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test028"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", "com.example.unifood.exceptions.OwnerException", "a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant3.setName("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    java.lang.String str6 = restaurant3.getShortDescription();
    java.lang.String str7 = restaurant3.getId();
    com.example.unifood.models.Product product8 = null;
    boolean b9 = restaurant3.removeProduct(product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a6c77761-63c9-4c6b-bda8-1cd5229678b0"+ "'", str7.equals("a6c77761-63c9-4c6b-bda8-1cd5229678b0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test029"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("8fb81efd-e454-4b41-837c-440f27d5e941");
    review0.setRate((float)(short)1);
    review0.setId("e543d0dd-7b59-46bf-a7c0-c7ef44c0b746");
    java.lang.String str11 = review0.getComment();
    float f12 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 1.0f);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test030"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setLastName("5a768843-8dc8-45b5-baf6-85706b277c5f");
    userInfo0.setFirstName("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setLastName("82c1d71c-7d9a-4fe3-90d2-3ae03afa19a4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test031"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    restaurant3.setUserId("49f86ca5-9a90-47a6-9268-c72162277e22");
    restaurant3.setShortDescription("125b4204-dcae-4e42-a590-90f7932b7a3f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test032"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    com.example.unifood.models.Review review6 = null;
    restaurant0.addReview(review6);
    restaurant0.setShortDescription("75e0de5b-af05-410e-9afa-c211b35b0e94");
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    boolean b14 = restaurant0.equals((java.lang.Object)product11);
    java.lang.String str15 = product11.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test033"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    boolean b7 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.University university9 = new com.example.unifood.models.University("hi!");
    boolean b11 = university9.removeCampus("hi!");
    java.lang.String str12 = university9.getId();
    university9.setName("603fd35b-ea62-491b-8376-4e5ebb75b266");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    studentInfo15.setCampusId("");
    studentInfo15.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo15.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b23 = studentInfo15.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus25 = new com.example.unifood.models.Campus();
    boolean b27 = campus25.removeRestaurant("hi!");
    campus25.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str30 = campus25.getRestaurants();
    studentInfo24.setFavRestaurants(list_str30);
    studentInfo15.setFavProducts(list_str30);
    java.util.List<java.lang.String> list_str33 = studentInfo15.getFavRestaurants();
    university9.setAllCampus(list_str33);
    studentInfo0.setFavProducts(list_str33);
    boolean b37 = studentInfo0.delRestaurantFromFavorites("684723e7-4299-4585-9d31-63c2ba22c787");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "c075d52f-fbd8-471a-b7b6-552cb155a248"+ "'", str12.equals("c075d52f-fbd8-471a-b7b6-552cb155a248"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test034"); }

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
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review27.setUserId("");
    review27.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    float f32 = review27.getRate();
    boolean b33 = restaurant12.removeReview(review27);
    review27.setComment("0daa91b1-d5d0-4037-891c-58f0636ac1bc");
    java.lang.String str36 = review27.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "f5e6d4d9-2722-4482-bb04-ad90075f9007"+ "'", str19.equals("f5e6d4d9-2722-4482-bb04-ad90075f9007"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f32 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "75e0de5b-af05-410e-9afa-c211b35b0e94"+ "'", str36.equals("75e0de5b-af05-410e-9afa-c211b35b0e94"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test035"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    boolean b4 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test036"); }

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
    review10.setUserId("822dd05c-198a-4327-b7dc-8d252f81520b");
    java.lang.String str24 = review10.getDate();
    
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
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test037"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setName("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    boolean b9 = university1.addCampus("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6");
    com.example.unifood.models.Campus campus10 = new com.example.unifood.models.Campus();
    boolean b12 = campus10.removeRestaurant("hi!");
    campus10.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str15 = campus10.getRestaurants();
    java.lang.String str16 = campus10.getId();
    java.lang.String str17 = campus10.getName();
    java.lang.String str18 = campus10.getId();
    java.util.List<java.lang.String> list_str19 = campus10.getRestaurants();
    university1.setAllCampus(list_str19);
    java.util.List<java.lang.String> list_str21 = university1.getAllCampus();
    java.lang.String str22 = university1.getId();
    java.util.List<java.lang.String> list_str23 = university1.getAllCampus();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    studentInfo24.setCampusId("");
    studentInfo24.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo24.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b32 = studentInfo24.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str33 = studentInfo24.getCampusId();
    boolean b35 = studentInfo24.addRestaurantToFavorites("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    com.example.unifood.models.University university37 = new com.example.unifood.models.University("hi!");
    java.lang.String str38 = university37.getId();
    java.lang.String[] str_array67 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str68 = new java.util.ArrayList<java.lang.String>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str68, str_array67);
    university37.setAllCampus((java.util.List<java.lang.String>)arraylist_str68);
    studentInfo24.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str68);
    boolean b73 = studentInfo24.delProductFromFavorites("6713a429-f3c4-4ee4-9263-be97d5542cfe");
    com.example.unifood.models.StudentInfo studentInfo74 = new com.example.unifood.models.StudentInfo();
    studentInfo74.setCampusId("");
    studentInfo74.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo74.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str81 = studentInfo74.getFavProducts();
    studentInfo24.setFavRestaurants(list_str81);
    university1.setAllCampus(list_str81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "bc78959a-dca8-4f10-9113-5f81239c6dde"+ "'", str16.equals("bc78959a-dca8-4f10-9113-5f81239c6dde"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str17.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "bc78959a-dca8-4f10-9113-5f81239c6dde"+ "'", str18.equals("bc78959a-dca8-4f10-9113-5f81239c6dde"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str22.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str33.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "fc036572-b9ec-4a7e-8f76-e2836f1fc7f7"+ "'", str38.equals("fc036572-b9ec-4a7e-8f76-e2836f1fc7f7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str81);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test038"); }

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
    java.lang.String str34 = restaurant0.getName();
    restaurant0.setApproved(false);
    restaurant0.setRate((java.lang.Float)35.0f);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str34.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test039"); }

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
    java.lang.String str21 = university1.getId();
    java.lang.String str22 = university1.getName();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavRestaurants();
    studentInfo24.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo29 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str30 = studentInfo29.getFavProducts();
    studentInfo24.setFavRestaurants(list_str30);
    java.lang.String str32 = studentInfo24.getCampusId();
    java.util.List<java.lang.String> list_str33 = studentInfo24.getFavRestaurants();
    java.util.List<java.lang.String> list_str34 = studentInfo24.getFavProducts();
    university1.setAllCampus(list_str34);
    university1.setName("93a8b983-ac56-46ea-ad8e-3a9119e3c762");
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str21.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "b3660a10-0a45-4a63-a48b-cafcf60da884"+ "'", str32.equals("b3660a10-0a45-4a63-a48b-cafcf60da884"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test040"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.addRestaurant("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    campus0.setName("2a27c49d-821c-4230-8ca3-c93c5a8f4b54");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test041"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("6c7bf211-c6d2-4f9e-9c67-3d386ead4562");
    boolean b3 = studentInfo1.addProductToFavorites("7882fd11-9d00-4080-89e6-252b499af655");
    java.lang.String str4 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "6c7bf211-c6d2-4f9e-9c67-3d386ead4562"+ "'", str4.equals("6c7bf211-c6d2-4f9e-9c67-3d386ead4562"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test042"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3c180ad7-267c-47e3-bdaa-08230d053f5a");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.addRestaurant("909998ce-8d41-44b5-b1e3-cba08439db3b");
    java.lang.String str5 = campus1.getId();
    boolean b7 = campus1.addRestaurant("b3982dee-a3aa-42bc-89e5-e548172f5a2b");
    boolean b9 = campus1.addRestaurant("1dc7662f-858c-446e-b460-112b4c568ecd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5bf85bde-01b4-4072-9122-561ae01d1ec5"+ "'", str2.equals("5bf85bde-01b4-4072-9122-561ae01d1ec5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5bf85bde-01b4-4072-9122-561ae01d1ec5"+ "'", str5.equals("5bf85bde-01b4-4072-9122-561ae01d1ec5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test043"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.String str10 = restaurant0.getUserId();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f15 = product14.getCost();
    java.lang.String str16 = product14.getDescription();
    restaurant0.addProduct(product14);
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    review18.setId("");
    java.lang.String str21 = review18.getUserId();
    review18.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str24 = review18.getRestaurantId();
    review18.setRate((float)(byte)0);
    restaurant0.addReview(review18);
    restaurant0.setName("2865634a-bba2-4826-82de-8b6ff1c73c1c");
    restaurant0.setShortDescription("b82299be-5fed-4ea3-b437-3446ff3f6b7e");
    restaurant0.setShortDescription("b5e92389-aa3f-4dcf-b208-d494266d63ef");
    restaurant0.setLocalization("466861b5-c53e-4431-a3cf-8980950f4a9d");
    boolean b36 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "12/03/2017"+ "'", str16.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test044"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("");
    com.example.unifood.models.University university12 = new com.example.unifood.models.University("hi!");
    java.lang.String str13 = university12.getId();
    boolean b15 = university12.addCampus("hi!");
    java.lang.String str16 = university12.getId();
    university12.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    com.example.unifood.models.University university20 = new com.example.unifood.models.University("hi!");
    boolean b22 = university20.removeCampus("hi!");
    com.example.unifood.models.University university24 = new com.example.unifood.models.University("hi!");
    java.lang.String str25 = university24.getId();
    boolean b27 = university24.addCampus("hi!");
    java.lang.String str28 = university24.getId();
    university24.setName("12/03/2017");
    java.util.List<java.lang.String> list_str31 = university24.getAllCampus();
    university20.setAllCampus(list_str31);
    java.util.List<java.lang.String> list_str33 = university20.getAllCampus();
    university12.setAllCampus(list_str33);
    java.util.List<java.lang.String> list_str35 = university12.getAllCampus();
    university1.setAllCampus(list_str35);
    boolean b38 = university1.addCampus("6d874e94-287d-4dd4-b345-3dda47e1c3e2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "82ccff0a-7576-4386-8a13-4a4fbd318463"+ "'", str13.equals("82ccff0a-7576-4386-8a13-4a4fbd318463"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "82ccff0a-7576-4386-8a13-4a4fbd318463"+ "'", str16.equals("82ccff0a-7576-4386-8a13-4a4fbd318463"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "fd253735-b6b3-42c6-8e11-ff1b643c0322"+ "'", str25.equals("fd253735-b6b3-42c6-8e11-ff1b643c0322"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "fd253735-b6b3-42c6-8e11-ff1b643c0322"+ "'", str28.equals("fd253735-b6b3-42c6-8e11-ff1b643c0322"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test045"); }

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
    product29.setAvailability(false);
    product29.setId("");
    
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

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test046"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    float f3 = product0.getCost();
    java.lang.String str4 = product0.getDescription();
    product0.setAvailability(true);
    product0.setCost((float)1);
    product0.setAvailability(false);
    product0.setAvailability(false);
    boolean b13 = product0.getAvailability();
    product0.setDescription("8a9b9306-5e6f-45ec-bc49-f3053bfaa1dc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test047"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b9 = restaurant8.getApproved();
    java.lang.String str10 = restaurant8.getId();
    restaurant0.update(restaurant8);
    java.lang.String str12 = restaurant8.getName();
    java.lang.String str13 = restaurant8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "e8fa9e27-3277-4329-a9b1-6fcad53bec3c"+ "'", str10.equals("e8fa9e27-3277-4329-a9b1-6fcad53bec3c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str12.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str13.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test048"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus0.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.lang.String str16 = campus0.getId();
    boolean b18 = campus0.removeRestaurant("5bc8149d-6c54-4627-b286-9cb7d1dbd0f4");
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "24c17bfd-1d7c-461a-8a90-912a969e51c4"+ "'", str16.equals("24c17bfd-1d7c-461a-8a90-912a969e51c4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test049"); }

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
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product43 = new com.example.unifood.models.Product();
    boolean b44 = product43.getAvailability();
    restaurant42.addProduct(product43);
    java.util.List<com.example.unifood.models.Product> list_product46 = restaurant42.getProductList();
    com.example.unifood.models.Product product47 = new com.example.unifood.models.Product();
    product47.setDescription("hi!");
    boolean b50 = restaurant42.removeProduct(product47);
    restaurant42.setCampusId("com.example.unifood.exceptions.OwnerException");
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review58.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    restaurant42.addReview(review58);
    float f62 = review58.getRate();
    review58.setDate("64a174b7-c8e6-48f7-bd49-217619611384");
    boolean b65 = restaurant3.removeReview(review58);
    restaurant3.setRate((java.lang.Float)(-1.0f));
    com.example.unifood.models.Review review73 = new com.example.unifood.models.Review("add01af6-9901-43d3-950c-81f3702a5d12", "61147561-d24f-4a49-b295-70696006c96d", (float)(byte)1, "1a1f4baa-144f-4a2a-8f04-65ea83560f2d", "84fe6ce9-ea28-4361-b232-f1d6cd071155");
    java.lang.String str74 = review73.getRestaurantId();
    boolean b75 = restaurant3.removeReview(review73);
    java.lang.String str76 = review73.getRestaurantId();
    
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
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f62 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "61147561-d24f-4a49-b295-70696006c96d"+ "'", str74.equals("61147561-d24f-4a49-b295-70696006c96d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "61147561-d24f-4a49-b295-70696006c96d"+ "'", str76.equals("61147561-d24f-4a49-b295-70696006c96d"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test050"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    java.util.List<java.lang.String> list_str4 = university1.getAllCampus();
    boolean b6 = university1.addCampus("com.example.unifood.exceptions.InvalidRestaurantIdException");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    java.lang.String str8 = restaurant7.getUserId();
    restaurant7.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant7.updateRating();
    restaurant7.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    boolean b15 = product14.getAvailability();
    product14.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b18 = product14.getAvailability();
    boolean b19 = restaurant7.removeProduct(product14);
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str24 = restaurant23.getName();
    restaurant7.update(restaurant23);
    restaurant7.setLocalization("ddc183b1-0bcb-4e49-8eb8-ce29738b2e1c");
    com.example.unifood.models.StudentInfo studentInfo28 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus29 = new com.example.unifood.models.Campus();
    boolean b31 = campus29.removeRestaurant("hi!");
    campus29.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str34 = campus29.getRestaurants();
    studentInfo28.setFavRestaurants(list_str34);
    boolean b37 = studentInfo28.addProductToFavorites("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    com.example.unifood.models.Campus campus38 = new com.example.unifood.models.Campus();
    boolean b40 = campus38.removeRestaurant("hi!");
    campus38.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str43 = campus38.getRestaurants();
    java.lang.String str44 = campus38.getId();
    java.lang.String str45 = campus38.getName();
    java.lang.String str46 = campus38.getId();
    java.lang.String str47 = campus38.getId();
    campus38.setId("");
    boolean b51 = campus38.removeRestaurant("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    com.example.unifood.models.StudentInfo studentInfo53 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str54 = studentInfo53.getFavRestaurants();
    campus38.setRestaurants(list_str54);
    studentInfo28.setFavRestaurants(list_str54);
    com.example.unifood.models.StudentInfo studentInfo57 = new com.example.unifood.models.StudentInfo();
    studentInfo57.setCampusId("");
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str66 = new java.util.ArrayList<java.lang.String>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str66, str_array65);
    studentInfo57.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    studentInfo28.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    boolean b70 = restaurant7.equals((java.lang.Object)arraylist_str66);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str66);
    boolean b73 = university1.addCampus("f92f744a-d2c1-483e-8033-afcde8e3dde7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str24.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "20a40794-111d-48dc-ac67-2a801bd49996"+ "'", str44.equals("20a40794-111d-48dc-ac67-2a801bd49996"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str45.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "20a40794-111d-48dc-ac67-2a801bd49996"+ "'", str46.equals("20a40794-111d-48dc-ac67-2a801bd49996"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "20a40794-111d-48dc-ac67-2a801bd49996"+ "'", str47.equals("20a40794-111d-48dc-ac67-2a801bd49996"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test051"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("75ff667f-21df-457d-81ab-c93c2a048281", "c627fb33-d35b-43ed-b3f0-b80d550c1232", "cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5");
    restaurant3.setId("6741ff98-c6d7-4158-b49b-f0d2a2a5e319");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test052"); }

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
    review20.setDate("com.example.unifood.exceptions.ReviewException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3fbc3a09-19cf-4707-9305-9786854f9db8"+ "'", str5.equals("3fbc3a09-19cf-4707-9305-9786854f9db8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "be74c0b5-a302-47b0-9a4a-4b66bb77ed3c"+ "'", str21.equals("be74c0b5-a302-47b0-9a4a-4b66bb77ed3c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test053"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("687c94a8-4d6b-417b-bc44-fda2c3685fc2", "ebaf42b5-b200-4151-be51-b6605db430c9", "df51efe6-b929-4442-a9c1-473cf89ee794");
    java.lang.String str4 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ebaf42b5-b200-4151-be51-b6605db430c9"+ "'", str4.equals("ebaf42b5-b200-4151-be51-b6605db430c9"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test054"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.Campus campus4 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str5 = campus4.getId();
    boolean b7 = campus4.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.lang.String str8 = campus4.getId();
    boolean b10 = campus4.removeRestaurant("e2c5a479-863d-468d-b3ec-388be48481a6");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus12 = new com.example.unifood.models.Campus();
    boolean b14 = campus12.removeRestaurant("hi!");
    campus12.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str17 = campus12.getRestaurants();
    studentInfo11.setFavRestaurants(list_str17);
    java.lang.String str19 = studentInfo11.getCampusId();
    java.lang.String str20 = studentInfo11.getCampusId();
    boolean b22 = studentInfo11.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    java.lang.String[] str_array80 = new java.lang.String[] { "cde62678-4a38-48f3-8486-51d54fb5e8c8", "016f7a51-1523-4248-8cce-d7af4447fbc2", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "9cef684b-9583-4350-bc7f-52fdf83f721b", "b9a35319-fcc8-40c8-9a6c-cc193698fa7e", "2016930c-728d-45c5-a236-9c4833a30246", "2b840dda-3718-464e-a39f-2e9719d2b246", "8ce830fe-1366-4bd5-a822-511d9d102587", "8ce830fe-1366-4bd5-a822-511d9d102587", "c1d3b8a3-adce-431f-a302-6cd30c1e553d", "com.example.unifood.exceptions.UserException", "com.example.unifood.exceptions.InvalidRestaurantNameException", "5a768843-8dc8-45b5-baf6-85706b277c5f", "1cc346cd-7e37-4aa5-a18f-4211b5a529c9", "3db35cfa-ac0a-4288-9084-8d042e570026", "322c0567-95f6-47cd-bed2-9cdd49776e37", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "c0679c38-8adf-4203-85c8-515aaf773e20", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "9741db0d-f106-4ae0-9562-dbd17d50d5a3", "811f8a1d-ca60-461d-828c-6680d7547043", "322c0567-95f6-47cd-bed2-9cdd49776e37", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c", "e38e11da-1219-443d-93b7-8c6ea82bea05", "f6ca0495-0d1d-4653-b4e4-20d665aafe5f", "c81d3daf-7c34-4870-802e-061eeb5c81e5", "efbb39b8-b569-44a5-8350-5d34ec9574db", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "15149c67-efc5-4744-85b0-8dc2ac121df7", "49976e80-f69f-4380-aa76-dc904dcb2eca", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "49b07ce6-aac6-463b-a3cc-21e21430bc86", "53d5e04e-abb5-45a7-a278-d742367421a0", "9d54bba1-c011-40fe-a86a-2b02e99ae523", "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8", "09c560d8-ad4a-4efc-a7b7-3894259139d4", "", "d054f793-8da1-4b53-9056-26346d97b155", "49976e80-f69f-4380-aa76-dc904dcb2eca", "f71e4521-c797-403b-bb13-9b84cfa3a1f7", "090d4d8e-cace-44ee-8920-101722da86af", "9e087ae8-80e1-4932-9bf9-0925df2c9f7e", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "a04223f0-b1c0-449c-afab-59a81cef4343", "e2c7a34a-8060-4430-9d69-dd5848b101c6", "7b379d86-fcc6-43c8-a85d-c887cc492e73", "15149c67-efc5-4744-85b0-8dc2ac121df7", "a339ea1e-a8f5-4f77-af1e-264cde0ed0dd", "7fb4b671-eeeb-4d73-8c40-91baed7167c3", "016f7a51-1523-4248-8cce-d7af4447fbc2", "8e6dda6d-66e5-4521-8634-e164e3b1c34c", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "8ce830fe-1366-4bd5-a822-511d9d102587" };
    java.util.ArrayList<java.lang.String> arraylist_str81 = new java.util.ArrayList<java.lang.String>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str81, str_array80);
    studentInfo11.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str81);
    campus4.setRestaurants((java.util.List<java.lang.String>)arraylist_str81);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str81);
    boolean b87 = studentInfo1.addProductToFavorites("4dc8646f-7290-42dc-94e6-bc8c32fb1495");
    boolean b89 = studentInfo1.addRestaurantToFavorites("cb4ac244-f7bb-4b89-bef2-8d7ff9ec1411");
    java.lang.String str90 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ba5fe116-aaec-40bc-8279-72c30fffd6ae"+ "'", str5.equals("ba5fe116-aaec-40bc-8279-72c30fffd6ae"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ba5fe116-aaec-40bc-8279-72c30fffd6ae"+ "'", str8.equals("ba5fe116-aaec-40bc-8279-72c30fffd6ae"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "49976e80-f69f-4380-aa76-dc904dcb2eca"+ "'", str90.equals("49976e80-f69f-4380-aa76-dc904dcb2eca"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test055"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    java.util.List<com.example.unifood.models.Review> list_review7 = null;
    restaurant0.setReviewList(list_review7);
    restaurant0.setShortDescription("41da4592-e08b-4f37-8e70-2df375b06c8f");
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test056"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    boolean b32 = campus0.removeRestaurant("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str33 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test057"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("1b5b19bf-3f56-4021-b96f-3cdd3c17d4ae");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test058"); }

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
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant35.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str38 = restaurant35.getShortDescription();
    boolean b40 = restaurant35.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    review41.setId("");
    java.lang.String str44 = review41.getUserId();
    review41.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f47 = review41.getRate();
    boolean b48 = restaurant35.removeReview(review41);
    java.lang.String str49 = review41.getComment();
    restaurant3.addReview(review41);
    java.lang.String str51 = restaurant3.getLocalization();
    restaurant3.setShortDescription("");
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f47 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str49.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "ccd59dcf-7a32-4aa9-b3c0-6caab218d93f"+ "'", str51.equals("ccd59dcf-7a32-4aa9-b3c0-6caab218d93f"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test059"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setLocalization("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    restaurant0.setLocalization("f666c841-c560-4874-8cbd-008c848d1f42");
    java.lang.Float f11 = restaurant0.getRate();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product("b4a7c4bb-fb01-4b40-b048-22c9ffa9235c", (float)1, "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b");
    restaurant0.addProduct(product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "8872ee63-d935-40e3-aa5b-ed8347ea9c7b"+ "'", str4.equals("8872ee63-d935-40e3-aa5b-ed8347ea9c7b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test060"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("55828b2f-d311-46b6-8244-bd26feb289f6");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str2.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "55828b2f-d311-46b6-8244-bd26feb289f6"+ "'", str5.equals("55828b2f-d311-46b6-8244-bd26feb289f6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "55828b2f-d311-46b6-8244-bd26feb289f6"+ "'", str6.equals("55828b2f-d311-46b6-8244-bd26feb289f6"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test061"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    boolean b6 = university1.addCampus("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b8 = university1.addCampus("6af9cce1-e394-4f10-9510-635f008d9600");
    java.lang.String str9 = university1.getName();
    java.lang.String str10 = university1.getName();
    java.util.List<java.lang.String> list_str11 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "055af44c-3880-408e-a380-43f35a4538a7"+ "'", str2.equals("055af44c-3880-408e-a380-43f35a4538a7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test062"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("368632da-b397-426c-82f5-8e42695f5bf8");
    java.lang.String str2 = campus1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "09138c74-432f-4337-be28-e67ee82710a0"+ "'", str2.equals("09138c74-432f-4337-be28-e67ee82710a0"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test063"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("bc047bd9-5095-4cf0-9686-5fdde9276971", "bb6264ea-8d6c-4bf2-bfbe-7a763522f7c7", (float)(short)10, "e8d12f63-b805-497e-b9f1-cbcf9d03bc67");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test064"); }

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
    review4.setComment("291773e4-9d5d-46d2-8f2f-f794d51a97ec");
    review4.setId("650676a4-4830-420c-a7e9-b50bc7edce08");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test065"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    boolean b3 = studentInfo1.delProductFromFavorites("7b9b4bea-19ad-42b7-b753-2c811dd9acaf");
    boolean b5 = studentInfo1.delProductFromFavorites("");
    boolean b7 = studentInfo1.addProductToFavorites("b5d81c16-9127-4608-86e1-0054691c776f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test066"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c7492f51-751c-49fa-9823-c9ff6db2c39f", "", "5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getFirstName();
    userInfo3.setLastName("db00679c-7c4a-4b6c-94c4-cca621166c6e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str5.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str6.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test067"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product9 = new com.example.unifood.models.Product();
    boolean b10 = product9.getAvailability();
    restaurant8.addProduct(product9);
    java.util.List<com.example.unifood.models.Product> list_product12 = restaurant8.getProductList();
    restaurant8.setUserId("hi!");
    restaurant8.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str21 = restaurant20.getUserId();
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant25.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str28 = restaurant25.getShortDescription();
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    java.lang.String str30 = review29.getDate();
    java.lang.String str31 = review29.getComment();
    com.example.unifood.models.Review review32 = new com.example.unifood.models.Review();
    review32.setId("");
    java.lang.String str35 = review32.getUserId();
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setRate((float)10L);
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setId("");
    java.lang.String str42 = review39.getUserId();
    java.lang.String str43 = review39.getRestaurantId();
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setId("");
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review52.setUserId("");
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    java.lang.String str56 = review55.getDate();
    java.lang.String str57 = review55.getComment();
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review();
    review58.setId("");
    com.example.unifood.models.Review review61 = new com.example.unifood.models.Review();
    review61.setId("");
    java.lang.String str64 = review61.getUserId();
    java.lang.String str65 = review61.getRestaurantId();
    java.lang.String str66 = review61.getDate();
    com.example.unifood.models.Review review67 = new com.example.unifood.models.Review();
    java.lang.String str68 = review67.getId();
    com.example.unifood.models.Review review74 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review74.setUserId("");
    com.example.unifood.models.Review review77 = new com.example.unifood.models.Review();
    review77.setId("");
    com.example.unifood.models.Review[] review_array80 = new com.example.unifood.models.Review[] { review29, review32, review36, review39, review44, review52, review55, review58, review61, review67, review74, review77 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review81 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review81, review_array80);
    restaurant25.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review81);
    java.util.List<com.example.unifood.models.Product> list_product84 = restaurant25.getProductList();
    restaurant20.setProductList(list_product84);
    restaurant8.setProductList(list_product84);
    java.lang.String str87 = restaurant8.getLocalization();
    java.util.List<com.example.unifood.models.Product> list_product88 = restaurant8.getProductList();
    restaurant3.setProductList(list_product88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "bda81eda-d01b-4a1c-bf0f-4490fba81bbc"+ "'", str5.equals("bda81eda-d01b-4a1c-bf0f-4490fba81bbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "a32ff8e7-46ef-47e8-b261-4603ee22503e"+ "'", str68.equals("a32ff8e7-46ef-47e8-b261-4603ee22503e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + ""+ "'", str87.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product88);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test068"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str4 = restaurant3.getCampusId();
    restaurant3.setCampusId("08ef2ed8-271a-4aad-9415-47b0dba1b9a7");
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product("hi!", (float)(byte)0, "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    float f11 = product10.getCost();
    product10.setDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    restaurant3.addProduct(product10);
    product10.setAvailability(false);
    product10.setCost((float)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "90afc816-9759-4b54-86ff-a1b7beb18772"+ "'", str4.equals("90afc816-9759-4b54-86ff-a1b7beb18772"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test069"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str9 = restaurant0.getCampusId();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str16 = restaurant13.getShortDescription();
    boolean b18 = restaurant13.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review19 = new com.example.unifood.models.Review();
    review19.setId("");
    java.lang.String str22 = review19.getUserId();
    review19.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f25 = review19.getRate();
    boolean b26 = restaurant13.removeReview(review19);
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setUserId("hi!");
    restaurant27.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product36 = restaurant27.getProductList();
    restaurant13.setProductList(list_product36);
    restaurant0.setProductList(list_product36);
    java.lang.String str39 = restaurant0.getUserId();
    java.lang.String str40 = restaurant0.getShortDescription();
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    review41.setId("");
    java.lang.String str44 = review41.getUserId();
    java.lang.String str45 = review41.getRestaurantId();
    java.lang.String str46 = review41.getUserId();
    review41.setRate(32.0f);
    boolean b49 = restaurant0.removeReview(review41);
    java.lang.String str50 = restaurant0.getLocalization();
    restaurant0.setUserId("f97c6c3e-183e-4803-92a5-8e1be9983d71");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f25 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "3f1f2c41-cbe8-4647-a5f0-123f0f1af573"+ "'", str50.equals("3f1f2c41-cbe8-4647-a5f0-123f0f1af573"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test070"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("761640ef-807b-4ed9-9d4e-f8bbaf85efd7");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test071"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getDate();
    review7.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review7.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review7.setRate(0.0f);
    boolean b15 = restaurant0.removeReview(review7);
    java.lang.String str16 = restaurant0.getUserId();
    restaurant0.setShortDescription("6119cadc-d254-438f-87fa-2d1f146a442d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test072"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    boolean b9 = studentInfo0.addProductToFavorites("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavRestaurants();
    boolean b13 = studentInfo0.delRestaurantFromFavorites("32f01847-2cae-4789-9e81-1bfd0d3a0b3a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test073"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("7071a3a8-0659-48de-9594-da8247027c10", 0.0f, "18040e04-0844-4cac-8d6c-c57f545a74d8");
    product3.setName("43c02386-89f3-428b-95b8-1f13bd9922d9");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test074"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    com.example.unifood.models.Review review8 = new com.example.unifood.models.Review("84c380a1-fee2-4bfe-82b9-7668a6f07e00", "1fcc4f0c-26bc-4946-bf17-5d8a16792f98", 0.0f, "10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str9 = review8.getDate();
    restaurant3.addReview(review8);
    java.util.List<com.example.unifood.models.Product> list_product11 = null;
    restaurant3.setProductList(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str9.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test075"); }

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
    java.lang.String str16 = restaurant3.getUserId();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant17.getProductList();
    restaurant17.setUserId("hi!");
    restaurant17.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review26 = restaurant17.getReviewList();
    restaurant3.setReviewList(list_review26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review26);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test076"); }

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
    com.example.unifood.models.Review review24 = null;
    boolean b25 = restaurant0.removeReview(review24);
    java.lang.Object obj26 = null;
    boolean b27 = restaurant0.equals(obj26);
    com.example.unifood.models.Restaurant restaurant31 = new com.example.unifood.models.Restaurant("137eddc9-74ea-4676-8ec0-5c55498d6d17", "3f1d8f40-44f8-458b-a784-7c1c32ce69d6", "5905c9ec-8594-480a-98d9-f263a8aa7afa");
    java.lang.String str32 = restaurant31.getUserId();
    java.lang.String str33 = restaurant31.getLocalization();
    restaurant31.setUserId("7df88144-033b-4859-9ab5-ada8e7b5b055");
    java.lang.Float f36 = restaurant31.getRate();
    restaurant0.update(restaurant31);
    com.example.unifood.models.Restaurant restaurant41 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b42 = restaurant41.getApproved();
    restaurant41.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Product> list_product45 = restaurant41.getProductList();
    java.util.List<com.example.unifood.models.Product> list_product46 = null;
    restaurant41.setProductList(list_product46);
    restaurant0.update(restaurant41);
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "39009db1-df0c-4e62-bca6-5a45a86f063d"+ "'", str22.equals("39009db1-df0c-4e62-bca6-5a45a86f063d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "5905c9ec-8594-480a-98d9-f263a8aa7afa"+ "'", str33.equals("5905c9ec-8594-480a-98d9-f263a8aa7afa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f36 + "' != '" + 0.0f+ "'", f36.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product45);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test077"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("40696869-ae94-4e36-820e-8cbb4ae747a4");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("0daedaea-7648-4afb-950f-31db8343760d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "40696869-ae94-4e36-820e-8cbb4ae747a4"+ "'", str2.equals("40696869-ae94-4e36-820e-8cbb4ae747a4"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test078"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getComment();
    review0.setRate((float)(-1));
    review0.setRestaurantId("7c28746d-fa6e-4f54-bc22-b1dea765936c");
    review0.setId("77a05c63-7625-49e2-958a-bcdae3563994");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "b61bca86-ed3b-46ef-8b57-9e8e736aa37f"+ "'", str1.equals("b61bca86-ed3b-46ef-8b57-9e8e736aa37f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test079"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getId();
    java.lang.String str5 = review0.getId();
    float f6 = review0.getRate();
    java.lang.String str7 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "46050f1b-a446-4f02-9ab7-57dade7b2098"+ "'", str4.equals("46050f1b-a446-4f02-9ab7-57dade7b2098"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "46050f1b-a446-4f02-9ab7-57dade7b2098"+ "'", str5.equals("46050f1b-a446-4f02-9ab7-57dade7b2098"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test080"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("40ca69c9-5c86-4daa-a0e7-a14320e13e90");

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test081"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review6 = null;
    restaurant3.setReviewList(list_review6);
    java.util.List<com.example.unifood.models.Product> list_product8 = restaurant3.getProductList();
    java.lang.String str9 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "12/03/2017"+ "'", str9.equals("12/03/2017"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test082"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("00387c66-74c4-4462-8a1c-60f83181234e", "f0154754-58f7-4596-aff9-406aad29f6ef", (float)0, "4205927b-34eb-43b1-bac8-f49da88781e8", "64ae221d-667d-437f-870b-fef02d80a5de");
    review5.setDate("95c4bab9-4e02-4466-ad95-44e492c4edce");
    java.lang.String str8 = review5.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "f0154754-58f7-4596-aff9-406aad29f6ef"+ "'", str8.equals("f0154754-58f7-4596-aff9-406aad29f6ef"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test083"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    review0.setRate((float)(short)1);
    review0.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test084"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    restaurant3.setShortDescription("c0679c38-8adf-4203-85c8-515aaf773e20");
    java.lang.String str16 = restaurant3.getUserId();
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant20.setName("12/03/2017");
    java.lang.String str23 = restaurant20.getUserId();
    restaurant20.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Restaurant restaurant26 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product27 = new com.example.unifood.models.Product();
    boolean b28 = product27.getAvailability();
    restaurant26.addProduct(product27);
    java.util.List<com.example.unifood.models.Product> list_product30 = restaurant26.getProductList();
    restaurant26.setUserId("hi!");
    restaurant26.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product35 = restaurant26.getProductList();
    restaurant20.setProductList(list_product35);
    restaurant20.setName("76fe9853-ea57-4556-ac71-95373a19a23f");
    java.util.List<com.example.unifood.models.Review> list_review39 = restaurant20.getReviewList();
    restaurant3.setReviewList(list_review39);
    restaurant3.setLocalization("fd21b6dc-68c3-4d5e-92f0-60daca18d597");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00a80698-5dcc-4f53-8de2-eaec89537d25"+ "'", str16.equals("00a80698-5dcc-4f53-8de2-eaec89537d25"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review39);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test085"); }

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
    restaurant3.setApproved(true);
    java.lang.String str22 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "fc573eb7-dae4-4c70-b96b-0f5abc5163d1"+ "'", str14.equals("fc573eb7-dae4-4c70-b96b-0f5abc5163d1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "fc573eb7-dae4-4c70-b96b-0f5abc5163d1"+ "'", str16.equals("fc573eb7-dae4-4c70-b96b-0f5abc5163d1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str22.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test086"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    com.example.unifood.models.Restaurant restaurant5 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product6 = new com.example.unifood.models.Product();
    boolean b7 = product6.getAvailability();
    restaurant5.addProduct(product6);
    restaurant5.setShortDescription("");
    restaurant5.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant5.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant15.getProductList();
    restaurant5.setProductList(list_product19);
    restaurant3.setProductList(list_product19);
    java.lang.Float f22 = restaurant3.getRate();
    restaurant3.setApproved(true);
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product26 = new com.example.unifood.models.Product();
    boolean b27 = product26.getAvailability();
    restaurant25.addProduct(product26);
    java.util.List<com.example.unifood.models.Product> list_product29 = restaurant25.getProductList();
    restaurant25.setUserId("hi!");
    restaurant25.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str34 = restaurant25.getCampusId();
    com.example.unifood.models.Restaurant restaurant38 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant38.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str41 = restaurant38.getShortDescription();
    boolean b43 = restaurant38.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setId("");
    java.lang.String str47 = review44.getUserId();
    review44.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f50 = review44.getRate();
    boolean b51 = restaurant38.removeReview(review44);
    com.example.unifood.models.Restaurant restaurant52 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product53 = new com.example.unifood.models.Product();
    boolean b54 = product53.getAvailability();
    restaurant52.addProduct(product53);
    java.util.List<com.example.unifood.models.Product> list_product56 = restaurant52.getProductList();
    restaurant52.setUserId("hi!");
    restaurant52.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product61 = restaurant52.getProductList();
    restaurant38.setProductList(list_product61);
    restaurant25.setProductList(list_product61);
    restaurant3.update(restaurant25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f22 + "' != '" + 0.0f+ "'", f22.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f50 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product61);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test087"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str11 = restaurant0.getUserId();
    restaurant0.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str18 = restaurant17.getName();
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.util.List<com.example.unifood.models.Product> list_product23 = restaurant19.getProductList();
    restaurant19.updateRating();
    java.lang.String str25 = restaurant19.getShortDescription();
    java.lang.String str26 = restaurant19.getName();
    java.util.List<com.example.unifood.models.Product> list_product27 = restaurant19.getProductList();
    restaurant17.setProductList(list_product27);
    restaurant0.setProductList(list_product27);
    com.example.unifood.models.Product product30 = new com.example.unifood.models.Product();
    product30.setDescription("hi!");
    float f33 = product30.getCost();
    java.lang.String str34 = product30.getDescription();
    restaurant0.addProduct(product30);
    java.lang.String str36 = product30.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str18.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f33 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test088"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("f4064b0d-1212-4d37-b018-9b8eff34d5f8", "1ac6ab5e-a672-4895-adf4-57ec7d2244b0", "964dfeaa-0946-4970-81ef-c212e6ad1a2e");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant7.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str10 = restaurant7.getShortDescription();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    product11.setDescription("hi!");
    java.lang.String str14 = product11.getDescription();
    boolean b15 = restaurant7.removeProduct(product11);
    restaurant7.setShortDescription("791f8349-92dc-4d5c-9e5b-4f0889f1e9b0");
    restaurant3.update(restaurant7);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant7.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test089"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("ac51a7a5-9871-4de6-87fc-f82caeac426a");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ac51a7a5-9871-4de6-87fc-f82caeac426a"+ "'", str2.equals("ac51a7a5-9871-4de6-87fc-f82caeac426a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ac51a7a5-9871-4de6-87fc-f82caeac426a"+ "'", str3.equals("ac51a7a5-9871-4de6-87fc-f82caeac426a"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test090"); }

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
    java.lang.String str13 = restaurant9.getId();
    restaurant9.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant9.setUserId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    restaurant0.update(restaurant9);
    java.lang.String str19 = restaurant9.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0e26f930-77d1-4938-839c-4b7b04fb3134"+ "'", str13.equals("0e26f930-77d1-4938-839c-4b7b04fb3134"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test091"); }

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
    boolean b19 = studentInfo0.delRestaurantFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    java.util.List<java.lang.String> list_str20 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("5023f368-94aa-4bc1-91ba-f002f0919f27");
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test092"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("b676177c-e64a-41a0-8888-7f2dd89e8060");
    campus1.setName("3fcb0ac4-7d96-4071-a6d0-8f688fbf3bd8");
    java.lang.String str4 = campus1.getId();
    boolean b6 = campus1.removeRestaurant("2230fc1f-a8ce-41f5-a9ff-b153e8683ea3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e7f431cb-8edb-4456-bbab-7204d99f7ffa"+ "'", str4.equals("e7f431cb-8edb-4456-bbab-7204d99f7ffa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test093"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("36bd04c3-f456-4a88-8133-0659d5227a0f", "55828b2f-d311-46b6-8244-bd26feb289f6", (float)0, "597f2261-632f-4adc-a489-628feb63880d");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test094"); }

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
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    boolean b32 = product31.getAvailability();
    restaurant3.addProduct(product31);
    product31.setDescription("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    boolean b36 = product31.getAvailability();
    
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
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test095"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("47faf2e0-af9a-4f10-b291-1286388a6b65");
    java.lang.String str2 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "47faf2e0-af9a-4f10-b291-1286388a6b65"+ "'", str2.equals("47faf2e0-af9a-4f10-b291-1286388a6b65"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test096"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant3.getProductList();
    java.lang.Float f10 = restaurant3.getRate();
    restaurant3.setCampusId("7284f181-d539-4aa1-b879-90089b983cfb");
    com.example.unifood.models.Product product13 = null;
    restaurant3.addProduct(product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f10 + "' != '" + 0.0f+ "'", f10.equals(0.0f));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test097"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    restaurant0.setCampusId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    com.example.unifood.models.Product product13 = null;
    restaurant0.addProduct(product13);
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test098"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setCampusId("ed8899de-d74b-4c5b-bafd-c89f775d295a");
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str13 = restaurant12.getUserId();
    restaurant12.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b16 = restaurant0.equals((java.lang.Object)"adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str17 = restaurant0.getShortDescription();
    java.lang.String str18 = restaurant0.getName();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    product19.setDescription("hi!");
    java.lang.String str22 = product19.getDescription();
    product19.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str25 = product19.getDescription();
    java.lang.String str26 = product19.getId();
    boolean b27 = restaurant0.removeProduct(product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str26.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test099"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("d3621539-7d39-481b-9fc2-42fd593a7135");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test100"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str14 = campus0.getId();
    campus0.setName("c540a787-8e6d-4ecb-95ca-f1d4551fcd80");
    java.util.List<java.lang.String> list_str17 = campus0.getRestaurants();
    campus0.setId("7112ad78-afe2-4681-bb63-66c58d50e07e");
    java.lang.String str20 = campus0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "968c4160-cbf5-4c1c-b7d6-aea9e54f09f7"+ "'", str14.equals("968c4160-cbf5-4c1c-b7d6-aea9e54f09f7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "7112ad78-afe2-4681-bb63-66c58d50e07e"+ "'", str20.equals("7112ad78-afe2-4681-bb63-66c58d50e07e"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test101"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("7c382e92-acef-4318-a40d-158e77003992");
    java.lang.String str2 = studentInfo1.getCampusId();
    boolean b4 = studentInfo1.delProductFromFavorites("84c13f96-190d-4e6c-a978-51ca79b1df84");
    boolean b6 = studentInfo1.delRestaurantFromFavorites("988dc332-6ff3-41e8-8f89-62bab20f549d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7c382e92-acef-4318-a40d-158e77003992"+ "'", str2.equals("7c382e92-acef-4318-a40d-158e77003992"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test102"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    boolean b7 = university1.addCampus("10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str8 = university1.getName();
    java.lang.String str9 = university1.getName();
    java.lang.String str10 = university1.getName();
    university1.setName("1ddf92f7-0bef-4d54-a2d9-29a8a504662f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7b0dcda3-f2bb-4e77-b1ac-51bdfcaabbdd"+ "'", str2.equals("7b0dcda3-f2bb-4e77-b1ac-51bdfcaabbdd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7b0dcda3-f2bb-4e77-b1ac-51bdfcaabbdd"+ "'", str5.equals("7b0dcda3-f2bb-4e77-b1ac-51bdfcaabbdd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test103"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setUserId("hi!");
    restaurant7.setName("12/03/2017");
    java.lang.String str16 = restaurant7.getCampusId();
    java.lang.String str17 = restaurant7.getUserId();
    java.lang.Float f18 = restaurant7.getRate();
    restaurant0.update(restaurant7);
    restaurant0.setLocalization("04796684-7ec9-4382-8b4d-0ba69bb4d7b4");
    boolean b22 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f18 + "' != '" + 0.0f+ "'", f18.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test104"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("239d950c-a53b-45db-9e8f-483a040e426a");
    university1.setName("71cf3554-3a7b-4ac1-85c8-6901f2458f2d");
    university1.setId("5ef2a8d7-ee9f-4378-ac7b-cb8c4df4ff8e");
    university1.setName("98bae4e7-30d8-494b-8675-a432603cd42f");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test105"); }

    com.example.unifood.exceptions.ReviewException reviewException0 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException1 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str2 = invalidRestaurantIdException1.toString();
    reviewException0.addSuppressed((java.lang.Throwable)invalidRestaurantIdException1);
    com.example.unifood.exceptions.InvalidTypeException invalidTypeException4 = new com.example.unifood.exceptions.InvalidTypeException();
    invalidRestaurantIdException1.addSuppressed((java.lang.Throwable)invalidTypeException4);
    java.lang.Throwable[] throwable_array6 = invalidRestaurantIdException1.getSuppressed();
    com.example.unifood.exceptions.OwnerException ownerException7 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException8 = new com.example.unifood.exceptions.OwnerException();
    ownerException7.addSuppressed((java.lang.Throwable)ownerException8);
    java.lang.String str10 = ownerException7.toString();
    java.lang.Throwable[] throwable_array11 = ownerException7.getSuppressed();
    invalidRestaurantIdException1.addSuppressed((java.lang.Throwable)ownerException7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str2.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str10.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array11);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test106"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setUserId("hi!");
    restaurant7.setName("12/03/2017");
    java.lang.String str16 = restaurant7.getCampusId();
    java.lang.String str17 = restaurant7.getUserId();
    java.lang.Float f18 = restaurant7.getRate();
    restaurant0.update(restaurant7);
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product();
    boolean b22 = product21.getAvailability();
    restaurant20.addProduct(product21);
    java.util.List<com.example.unifood.models.Product> list_product24 = restaurant20.getProductList();
    restaurant20.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant20.setApproved(false);
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product30 = new com.example.unifood.models.Product();
    boolean b31 = product30.getAvailability();
    restaurant29.addProduct(product30);
    restaurant29.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant20.update(restaurant29);
    java.util.List<com.example.unifood.models.Product> list_product36 = restaurant29.getProductList();
    restaurant7.setProductList(list_product36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f18 + "' != '" + 0.0f+ "'", f18.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product36);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test107"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    product8.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b12 = product8.getAvailability();
    java.lang.String str13 = product8.getDescription();
    boolean b14 = restaurant3.removeProduct(product8);
    product8.setDescription("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6");
    java.lang.String str17 = product8.getName();
    java.lang.String str18 = product8.getName();
    java.lang.String str19 = product8.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str13.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4d24848f-e6f2-40c0-9353-ac505c78931b"+ "'", str19.equals("4d24848f-e6f2-40c0-9353-ac505c78931b"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test108"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("e8689ebd-3dea-487d-8d40-a3c18909a109", "b4707d3e-d497-4017-a7dc-4bf791b391bc", (float)(byte)10, "00882ad9-4479-43c8-97e9-24bba73c74df");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test109"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    boolean b3 = university1.addCampus("f30d8e07-3aaa-4fd2-8d2f-508e4a8333a4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test110"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("e4f7334f-6568-4d08-9f18-f1931bdcd53a");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("de786c40-08a1-4529-9a5c-1d73b08cec1d");
    boolean b5 = studentInfo1.addProductToFavorites("417f3e0b-e3cc-4dc6-bd5c-2e87683b0394");
    java.util.List<java.lang.String> list_str6 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test111"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product0.setCost((float)' ');
    float f5 = product0.getCost();
    product0.setDescription("825150bc-640c-420f-a88a-4fd6a6439069");
    boolean b8 = product0.getAvailability();
    product0.setCost((float)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test112"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    boolean b3 = university1.addCampus("c0679c38-8adf-4203-85c8-515aaf773e20");
    university1.setName("3ceda175-3ee8-4462-bf35-4b2462ced264");
    java.lang.String str6 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3ceda175-3ee8-4462-bf35-4b2462ced264"+ "'", str6.equals("3ceda175-3ee8-4462-bf35-4b2462ced264"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test113"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setName("");
    float f5 = product0.getCost();
    product0.setName("ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    java.lang.String str8 = product0.getDescription();
    product0.setName("8664e462-8683-4210-8fa3-b99e2a278578");
    java.lang.String str11 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test114"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    restaurant3.setCampusId("aec87e91-9578-4a99-b0c2-833caf90c601");
    restaurant3.setShortDescription("6292f4c2-dc79-49de-afc3-0117c86a49f3");
    java.lang.String str18 = restaurant3.getLocalization();
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant22.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str25 = restaurant22.getShortDescription();
    boolean b27 = restaurant22.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant22.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
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
    restaurant22.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review89);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review89);
    java.lang.String str94 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str18.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
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
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "356d2af6-be23-4bc9-a48d-978c5ababc72"+ "'", str76.equals("356d2af6-be23-4bc9-a48d-978c5ababc72"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str94 + "' != '" + ""+ "'", str94.equals(""));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test115"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    boolean b13 = restaurant9.getApproved();
    restaurant9.setCampusId("ba69067d-e3bd-4093-876a-8471267d6846");
    java.lang.String str16 = restaurant9.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0b47040e-0dde-4f70-9814-b69b61f1b96d"+ "'", str5.equals("0b47040e-0dde-4f70-9814-b69b61f1b96d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test116"); }

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
    restaurant11.updateRating();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    product13.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b17 = product13.getAvailability();
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant11.addProduct(product13);
    restaurant0.update(restaurant11);
    restaurant11.setUserId("74237342-5cf5-495c-86de-c1bc12d8c326");
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    review24.setId("");
    java.lang.String str27 = review24.getUserId();
    review24.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str30 = review24.getDate();
    review24.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review24.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review24.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    boolean b37 = restaurant11.removeReview(review24);
    com.example.unifood.models.Product product38 = new com.example.unifood.models.Product();
    product38.setDescription("hi!");
    java.lang.String str41 = product38.getDescription();
    product38.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str44 = product38.getDescription();
    boolean b45 = restaurant11.removeProduct(product38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test117"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("df08df98-14ec-42ca-8358-d6c255ab896d", "d9200fb5-f81f-4788-8586-336a23f81552", (float)(byte)10, "d07e476e-cb4d-45e9-8155-58166cdd0c15", "a02646ac-defa-4c39-82eb-d1fd23fd3bd4");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test118"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setRestaurantId("ec1c7744-8529-4314-837e-cb723075bf0b");
    float f8 = review0.getRate();
    review0.setRestaurantId("a8ae89ff-3481-4cd6-b41e-ee31dcc6829e");
    review0.setComment("db1a63a7-de28-4c76-8fc3-6d352ca7ef93");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test119"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus0.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    campus0.setName("ced6e91b-9cd9-49c4-91b3-b718083b5bff");
    campus0.setName("c9107d05-b646-4bac-bf92-00cdcc3f6c6a");
    java.lang.String str20 = campus0.getId();
    boolean b22 = campus0.removeRestaurant("0b671c11-3de0-49a2-9ab6-83c364a53d1a");
    java.lang.String str23 = campus0.getId();
    java.lang.String str24 = campus0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "6cb6d8ab-5467-462b-977c-0456b80af034"+ "'", str20.equals("6cb6d8ab-5467-462b-977c-0456b80af034"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "6cb6d8ab-5467-462b-977c-0456b80af034"+ "'", str23.equals("6cb6d8ab-5467-462b-977c-0456b80af034"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "6cb6d8ab-5467-462b-977c-0456b80af034"+ "'", str24.equals("6cb6d8ab-5467-462b-977c-0456b80af034"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test120"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setName("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    boolean b9 = university1.addCampus("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6");
    com.example.unifood.models.Campus campus10 = new com.example.unifood.models.Campus();
    boolean b12 = campus10.removeRestaurant("hi!");
    campus10.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str15 = campus10.getRestaurants();
    java.lang.String str16 = campus10.getId();
    java.lang.String str17 = campus10.getName();
    java.lang.String str18 = campus10.getId();
    java.util.List<java.lang.String> list_str19 = campus10.getRestaurants();
    university1.setAllCampus(list_str19);
    java.util.List<java.lang.String> list_str21 = university1.getAllCampus();
    java.lang.String str22 = university1.getId();
    java.util.List<java.lang.String> list_str23 = university1.getAllCampus();
    boolean b25 = university1.removeCampus("81c77406-02a7-40b2-9136-f952f2242165");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "a3e81425-37b0-4de7-9dd2-11588180ea3b"+ "'", str16.equals("a3e81425-37b0-4de7-9dd2-11588180ea3b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str17.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "a3e81425-37b0-4de7-9dd2-11588180ea3b"+ "'", str18.equals("a3e81425-37b0-4de7-9dd2-11588180ea3b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str22.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test121"); }

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
    java.lang.String str17 = restaurant3.getUserId();
    boolean b18 = restaurant3.getApproved();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test122"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    restaurant0.setRate((java.lang.Float)0.0f);
    java.lang.Float f12 = restaurant0.getRate();
    restaurant0.setUserId("b576c0f9-dfb3-48ff-b929-61e0cc49f6aa");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f12 + "' != '" + 0.0f+ "'", f12.equals(0.0f));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test123"); }

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
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getId();
    java.lang.String str22 = review20.getUserId();
    restaurant0.addReview(review20);
    java.util.List<com.example.unifood.models.Product> list_product24 = null;
    restaurant0.setProductList(list_product24);
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant29.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str32 = restaurant29.getShortDescription();
    boolean b34 = restaurant29.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review35 = new com.example.unifood.models.Review();
    review35.setId("");
    java.lang.String str38 = review35.getUserId();
    review35.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f41 = review35.getRate();
    boolean b42 = restaurant29.removeReview(review35);
    restaurant29.setLocalization("");
    restaurant0.update(restaurant29);
    restaurant0.setId("f1075df9-f286-462a-8dd0-d8f9bae65121");
    restaurant0.updateRating();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "d2e64a07-b287-4f80-b615-da4156b5b61e"+ "'", str21.equals("d2e64a07-b287-4f80-b615-da4156b5b61e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f41 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test124"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("263f6e2f-5528-4bc1-9255-40d78ed260d1", "7440a268-243f-4521-b7e0-bee3dd2850c5", "872197f4-51ae-4b2e-b876-cb563683b484");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test125"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    java.lang.String str7 = restaurant3.getLocalization();
    restaurant3.setLocalization("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    restaurant3.setUserId("041f0a74-169e-4210-9a45-d7590efa37d2");
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant15.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str18 = restaurant15.getShortDescription();
    com.example.unifood.models.Review review19 = new com.example.unifood.models.Review();
    java.lang.String str20 = review19.getDate();
    java.lang.String str21 = review19.getComment();
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    java.lang.String str25 = review22.getUserId();
    com.example.unifood.models.Review review26 = new com.example.unifood.models.Review();
    review26.setRate((float)10L);
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    review29.setId("");
    java.lang.String str32 = review29.getUserId();
    java.lang.String str33 = review29.getRestaurantId();
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    review34.setId("");
    com.example.unifood.models.Review review42 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review42.setUserId("");
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    java.lang.String str46 = review45.getDate();
    java.lang.String str47 = review45.getComment();
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    review48.setId("");
    com.example.unifood.models.Review review51 = new com.example.unifood.models.Review();
    review51.setId("");
    java.lang.String str54 = review51.getUserId();
    java.lang.String str55 = review51.getRestaurantId();
    java.lang.String str56 = review51.getDate();
    com.example.unifood.models.Review review57 = new com.example.unifood.models.Review();
    java.lang.String str58 = review57.getId();
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review64.setUserId("");
    com.example.unifood.models.Review review67 = new com.example.unifood.models.Review();
    review67.setId("");
    com.example.unifood.models.Review[] review_array70 = new com.example.unifood.models.Review[] { review19, review22, review26, review29, review34, review42, review45, review48, review51, review57, review64, review67 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review71 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review71, review_array70);
    restaurant15.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review71);
    java.util.List<com.example.unifood.models.Product> list_product74 = restaurant15.getProductList();
    restaurant3.setProductList(list_product74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "bfb1b818-805a-42ba-8c0d-f35ad58018d4"+ "'", str58.equals("bfb1b818-805a-42ba-8c0d-f35ad58018d4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product74);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test126"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("c1cec074-e206-4180-8491-8f9d96b4ca34");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test127"); }

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
    float f19 = review12.getRate();
    java.lang.String str20 = review12.getUserId();
    review12.setRate((float)(short)100);
    review12.setRate(0.0f);
    java.lang.String str25 = review12.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "953c9d39-735d-4520-985a-93ec46e57997"+ "'", str10.equals("953c9d39-735d-4520-985a-93ec46e57997"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f19 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str25.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test128"); }

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
    java.lang.String str26 = restaurant0.getLocalization();
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str26.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test129"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test130"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.updateRating();
    com.example.unifood.models.Review review3 = new com.example.unifood.models.Review();
    review3.setId("");
    java.lang.String str6 = review3.getUserId();
    review3.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str9 = review3.getRestaurantId();
    review3.setRate((float)(byte)0);
    review3.setComment("");
    review3.setRate((float)1);
    java.lang.String str16 = review3.getComment();
    review3.setUserId("9bb4ec51-2299-41a3-b764-2192d7b57501");
    review3.setDate("");
    java.lang.String str21 = review3.getRestaurantId();
    restaurant0.addReview(review3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test131"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    java.lang.String str3 = userInfo0.getFirstName();
    userInfo0.setLastName("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    userInfo0.setLastName("b8e49135-96cf-4501-bebc-4b42fdc40049");
    java.lang.String str8 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3c11ad74-3d0c-460b-a7f3-db24d1b7225f"+ "'", str8.equals("3c11ad74-3d0c-460b-a7f3-db24d1b7225f"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test132"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setCampusId("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    review7.setId("");
    java.lang.String str10 = review7.getUserId();
    review7.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review7.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str15 = review7.getUserId();
    java.lang.String str16 = review7.getUserId();
    restaurant0.addReview(review7);
    java.lang.String str18 = review7.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "c04ddf61-4079-4e72-b593-c43d85e3734b"+ "'", str4.equals("c04ddf61-4079-4e72-b593-c43d85e3734b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str18.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test133"); }

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
    restaurant11.updateRating();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    product13.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b17 = product13.getAvailability();
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant11.addProduct(product13);
    restaurant0.update(restaurant11);
    restaurant11.setUserId("74237342-5cf5-495c-86de-c1bc12d8c326");
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    review24.setId("");
    java.lang.String str27 = review24.getUserId();
    review24.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str30 = review24.getDate();
    review24.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review24.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review24.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    boolean b37 = restaurant11.removeReview(review24);
    restaurant11.setUserId("d5ac37fb-ca0d-41c8-b956-24fd3a737480");
    java.lang.String str40 = restaurant11.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test134"); }

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
    java.util.List<com.example.unifood.models.Review> list_review17 = restaurant0.getReviewList();
    java.lang.String str18 = restaurant0.getName();
    
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
    org.junit.Assert.assertNotNull(list_review17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test135"); }

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
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    boolean b16 = studentInfo14.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str17 = studentInfo14.getFavRestaurants();
    boolean b18 = restaurant0.equals((java.lang.Object)studentInfo14);
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    studentInfo19.setCampusId("");
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    studentInfo19.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    studentInfo19.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str33 = studentInfo19.getCampusId();
    java.lang.String str34 = studentInfo19.getCampusId();
    boolean b36 = studentInfo19.delRestaurantFromFavorites("com.example.unifood.exceptions.StudentException");
    boolean b38 = studentInfo19.delProductFromFavorites("cac17277-9555-4716-8268-db3950599eca");
    boolean b40 = studentInfo19.delRestaurantFromFavorites("a32072e2-9bd2-4c22-9b38-cf9487145555");
    com.example.unifood.models.University university42 = new com.example.unifood.models.University("hi!");
    java.lang.String str43 = university42.getId();
    java.util.List<java.lang.String> list_str44 = university42.getAllCampus();
    boolean b46 = university42.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.util.List<java.lang.String> list_str47 = university42.getAllCampus();
    studentInfo19.setFavProducts(list_str47);
    studentInfo14.setFavRestaurants(list_str47);
    com.example.unifood.models.StudentInfo studentInfo51 = new com.example.unifood.models.StudentInfo("7c382e92-acef-4318-a40d-158e77003992");
    java.lang.String str52 = studentInfo51.getCampusId();
    java.util.List<java.lang.String> list_str53 = studentInfo51.getFavProducts();
    studentInfo14.setFavRestaurants(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str33.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str34.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "f6f1384f-7c82-4618-9902-e0b0f8df2c96"+ "'", str43.equals("f6f1384f-7c82-4618-9902-e0b0f8df2c96"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "7c382e92-acef-4318-a40d-158e77003992"+ "'", str52.equals("7c382e92-acef-4318-a40d-158e77003992"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test136"); }

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
    restaurant9.setName("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    restaurant22.addProduct(product23);
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant22.getProductList();
    restaurant22.setUserId("hi!");
    restaurant22.setName("12/03/2017");
    com.example.unifood.models.Review review31 = new com.example.unifood.models.Review();
    java.lang.String str32 = review31.getId();
    boolean b33 = restaurant22.removeReview(review31);
    java.lang.String str34 = review31.getId();
    review31.setRate(10.0f);
    restaurant21.addReview(review31);
    java.util.List<com.example.unifood.models.Product> list_product38 = restaurant21.getProductList();
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b43 = restaurant42.getApproved();
    java.lang.String str44 = restaurant42.getId();
    java.util.List<com.example.unifood.models.Review> list_review45 = restaurant42.getReviewList();
    java.lang.String str46 = restaurant42.getCampusId();
    restaurant42.setUserId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    java.util.List<com.example.unifood.models.Product> list_product49 = restaurant42.getProductList();
    restaurant21.setProductList(list_product49);
    restaurant9.update(restaurant21);
    java.lang.String str52 = restaurant21.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "9ce21614-0fe0-4313-afbe-34c3dcf655f5"+ "'", str32.equals("9ce21614-0fe0-4313-afbe-34c3dcf655f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "9ce21614-0fe0-4313-afbe-34c3dcf655f5"+ "'", str34.equals("9ce21614-0fe0-4313-afbe-34c3dcf655f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "fbdf1cda-5291-40cb-9930-6c80d3ec0b57"+ "'", str44.equals("fbdf1cda-5291-40cb-9930-6c80d3ec0b57"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str46.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str52.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test137"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("87229e63-e927-4901-97ef-90801d78d9d4");
    university1.setName("70b3fcb0-bca5-4a4d-b6a3-362191149f60");
    university1.setId("66662d53-cdfc-4b60-bb1a-d4535919f4f2");
    java.lang.String str10 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "227890b4-ba41-4f65-8a89-ff3a214a2921"+ "'", str2.equals("227890b4-ba41-4f65-8a89-ff3a214a2921"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "70b3fcb0-bca5-4a4d-b6a3-362191149f60"+ "'", str10.equals("70b3fcb0-bca5-4a4d-b6a3-362191149f60"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test138"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    restaurant0.setName("7d61cabf-4abb-45b3-909b-49d8efd513c4");
    restaurant0.setUserId("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "459d1054-32dc-4632-99db-17b8d91e37ee"+ "'", str4.equals("459d1054-32dc-4632-99db-17b8d91e37ee"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test139"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo1.setFavRestaurants(list_str7);
    studentInfo1.setCampusId("");
    boolean b12 = studentInfo1.addProductToFavorites("c344a276-d296-4a93-901a-3f3f9e3e0191");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test140"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    java.lang.String str7 = restaurant3.getCampusId();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str12 = restaurant11.getShortDescription();
    java.lang.Float f13 = restaurant11.getRate();
    restaurant11.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f16 = restaurant11.getRate();
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant20.setName("12/03/2017");
    java.lang.String str23 = restaurant20.getUserId();
    restaurant20.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review26 = new com.example.unifood.models.Review();
    java.lang.String str27 = review26.getId();
    boolean b28 = restaurant20.equals((java.lang.Object)review26);
    restaurant11.update(restaurant20);
    java.lang.String str30 = restaurant11.getLocalization();
    restaurant3.update(restaurant11);
    java.lang.String str32 = restaurant11.getCampusId();
    com.example.unifood.models.Restaurant restaurant36 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant36.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str39 = restaurant36.getLocalization();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setRate((float)10L);
    review40.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant36.addReview(review40);
    review40.setComment("9305da89-539a-448c-9adb-9046a4885ebe");
    review40.setDate("b252c406-c2cd-473c-9a08-8dad188552a0");
    float f50 = review40.getRate();
    restaurant11.addReview(review40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f13 + "' != '" + 0.0f+ "'", f13.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f16 + "' != '" + 0.0f+ "'", f16.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "c484d7bd-fb5f-418c-bba3-fd1d74d17d12"+ "'", str27.equals("c484d7bd-fb5f-418c-bba3-fd1d74d17d12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str30.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str32.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str39.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f50 == 10.0f);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test141"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("5d054af0-c80d-4035-bb25-9ed4d59f9c35");

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test142"); }

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
    com.example.unifood.exceptions.StudentException studentException14 = new com.example.unifood.exceptions.StudentException();
    ownerException8.addSuppressed((java.lang.Throwable)studentException14);
    java.lang.String str16 = studentException14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.example.unifood.exceptions.StudentException"+ "'", str16.equals("com.example.unifood.exceptions.StudentException"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test143"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str9 = review0.getUserId();
    review0.setUserId("b0b0b700-7ebd-489d-85cc-58091d6c4b3e");
    review0.setRestaurantId("7e9cb1e8-4c8d-4c1c-b183-7eeb1f0f60e3");
    java.lang.String str14 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "b0b0b700-7ebd-489d-85cc-58091d6c4b3e"+ "'", str14.equals("b0b0b700-7ebd-489d-85cc-58091d6c4b3e"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test144"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("hi!");
    java.lang.String str6 = university5.getId();
    boolean b8 = university5.addCampus("hi!");
    java.lang.String str9 = university5.getId();
    university5.setName("12/03/2017");
    java.util.List<java.lang.String> list_str12 = university5.getAllCampus();
    university1.setAllCampus(list_str12);
    java.lang.String str14 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ce9d3301-bef6-4a98-a97e-272e76c4527a"+ "'", str6.equals("ce9d3301-bef6-4a98-a97e-272e76c4527a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ce9d3301-bef6-4a98-a97e-272e76c4527a"+ "'", str9.equals("ce9d3301-bef6-4a98-a97e-272e76c4527a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "bc2e90bb-e875-426c-b947-df74b8cbd083"+ "'", str14.equals("bc2e90bb-e875-426c-b947-df74b8cbd083"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test145"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("e0cc53cf-03b8-43f0-b9e4-7fbb9dde94c0");
    boolean b3 = studentInfo1.addProductToFavorites("4064d44f-2b50-4bd0-a33e-9ee9b563c63c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test146"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    com.example.unifood.models.University university7 = new com.example.unifood.models.University("hi!");
    java.lang.String str8 = university7.getId();
    java.lang.String[] str_array37 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    university7.setAllCampus((java.util.List<java.lang.String>)arraylist_str38);
    university7.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    com.example.unifood.models.Campus campus43 = new com.example.unifood.models.Campus();
    boolean b45 = campus43.removeRestaurant("hi!");
    campus43.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str48 = campus43.getRestaurants();
    boolean b50 = campus43.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b52 = campus43.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b54 = campus43.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str55 = campus43.getName();
    boolean b57 = campus43.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.Campus campus58 = new com.example.unifood.models.Campus();
    boolean b60 = campus58.removeRestaurant("hi!");
    campus58.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str63 = campus58.getRestaurants();
    boolean b65 = campus58.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b67 = campus58.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b69 = campus58.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str70 = campus58.getName();
    com.example.unifood.models.StudentInfo studentInfo71 = new com.example.unifood.models.StudentInfo();
    studentInfo71.setCampusId("");
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str80 = new java.util.ArrayList<java.lang.String>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str80, str_array79);
    studentInfo71.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    campus58.setRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    campus43.setRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    university7.setAllCampus((java.util.List<java.lang.String>)arraylist_str80);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("f5ac1eb1-e3fe-476a-b567-57059e8e233f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e534b425-955d-4d89-b7ed-256dba229bee"+ "'", str8.equals("e534b425-955d-4d89-b7ed-256dba229bee"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str55.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str70.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

}
