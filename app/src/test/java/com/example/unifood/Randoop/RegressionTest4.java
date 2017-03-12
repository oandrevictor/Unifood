package com.example.unifood.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    java.lang.Float f12 = restaurant3.getRate();
    java.lang.String str13 = restaurant3.getId();
    java.lang.String str14 = restaurant3.getShortDescription();
    restaurant3.setShortDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "20e24253-9d1b-41e7-873b-4e751c54b7a2"+ "'", str10.equals("20e24253-9d1b-41e7-873b-4e751c54b7a2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f12 + "' != '" + 0.0f+ "'", f12.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "b99a4d12-146f-4195-9810-35a82d09ef5b"+ "'", str13.equals("b99a4d12-146f-4195-9810-35a82d09ef5b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getType();
    java.lang.String str7 = userInfo3.getType();
    java.lang.String str8 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str6.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str7.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str8.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("f33159e8-a57a-4349-861f-f2b3b36479fd", "911084da-c86d-49e6-8f26-2d8886db9319", "8486b532-ad8c-4ee4-95f6-cc223414be34");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

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
    boolean b78 = restaurant3.getApproved();
    java.lang.String str79 = restaurant3.getLocalization();
    java.lang.String str80 = restaurant3.getId();
    
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
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "299f4c14-3484-4ef2-86e9-f62035d2f41b"+ "'", str57.equals("299f4c14-3484-4ef2-86e9-f62035d2f41b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str79.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"+ "'", str80.equals("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    campus0.setName("356355fb-92eb-464e-ae48-bb58ea231323");
    campus0.setName("d5361f91-34f2-40b8-8873-232fde8af91a");
    java.lang.String str16 = campus0.getName();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d5361f91-34f2-40b8-8873-232fde8af91a"+ "'", str16.equals("d5361f91-34f2-40b8-8873-232fde8af91a"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

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
    boolean b49 = campus0.removeRestaurant("238114aa-d8cb-4de7-84e9-2cbd67b9bed6");
    java.lang.String str50 = campus0.getId();
    campus0.setName("9f337cda-8463-4ca4-9944-8a2d1036ad55");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "7a61f11e-1f61-4444-8b86-cd73303b2549"+ "'", str6.equals("7a61f11e-1f61-4444-8b86-cd73303b2549"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d28ded76-9c15-4979-8464-d45d2c21ae4e"+ "'", str12.equals("d28ded76-9c15-4979-8464-d45d2c21ae4e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str50.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str3 = userInfo0.getLastName();
    java.lang.String str4 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str3.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    boolean b13 = university1.removeCampus("81590a16-8f83-4cfa-b624-11d3353e52f8");
    java.lang.String str14 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str14.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setId("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str5 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a04223f0-b1c0-449c-afab-59a81cef4343"+ "'", str5.equals("a04223f0-b1c0-449c-afab-59a81cef4343"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

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
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product24 = new com.example.unifood.models.Product();
    boolean b25 = product24.getAvailability();
    restaurant23.addProduct(product24);
    java.util.List<com.example.unifood.models.Product> list_product27 = restaurant23.getProductList();
    restaurant23.setUserId("hi!");
    restaurant23.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review32 = restaurant23.getReviewList();
    com.example.unifood.models.Restaurant restaurant36 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant36.setName("12/03/2017");
    java.lang.String str39 = restaurant36.getUserId();
    java.lang.String str40 = restaurant36.getLocalization();
    restaurant23.update(restaurant36);
    restaurant23.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    restaurant0.update(restaurant23);
    java.lang.String str45 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "30294913-b680-4f5b-abb6-cfd0f8f1b0b2"+ "'", str8.equals("30294913-b680-4f5b-abb6-cfd0f8f1b0b2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ace9a392-519b-4b7b-844a-f67add70dbde"+ "'", str16.equals("ace9a392-519b-4b7b-844a-f67add70dbde"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str40.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("e82eac9e-148e-4239-b8d6-1291815984ca", "add01af6-9901-43d3-950c-81f3702a5d12", (float)100, "04a1e0df-560d-416e-92d4-378868d609c7");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

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
    boolean b49 = campus0.addRestaurant("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    java.util.List<java.lang.String> list_str50 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "53f8b911-e2c0-4de9-80c9-46c70e18917c"+ "'", str6.equals("53f8b911-e2c0-4de9-80c9-46c70e18917c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "5763fb9d-c3d2-43bd-bad1-80419979b6d1"+ "'", str12.equals("5763fb9d-c3d2-43bd-bad1-80419979b6d1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

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
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    studentInfo22.setCampusId("");
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str31, str_array30);
    studentInfo22.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str31);
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    studentInfo34.setCampusId("");
    studentInfo34.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo34.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str41 = studentInfo34.getFavProducts();
    studentInfo22.setFavProducts(list_str41);
    com.example.unifood.models.Campus campus43 = new com.example.unifood.models.Campus();
    boolean b45 = campus43.removeRestaurant("hi!");
    campus43.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str48 = campus43.getRestaurants();
    studentInfo22.setFavRestaurants(list_str48);
    university1.setAllCampus(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "b51673da-46cf-47c3-8cb4-b70ad90613d8"+ "'", str16.equals("b51673da-46cf-47c3-8cb4-b70ad90613d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str17.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "b51673da-46cf-47c3-8cb4-b70ad90613d8"+ "'", str18.equals("b51673da-46cf-47c3-8cb4-b70ad90613d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("c16e5b62-0f31-47a6-8ed7-bfecbd323f44", (float)'4', "bcee5d51-04e6-485f-8dc5-c0658b2b5ed2");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("7112ad78-afe2-4681-bb63-66c58d50e07e");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    java.lang.String str6 = restaurant0.getShortDescription();
    boolean b7 = restaurant0.getApproved();
    restaurant0.setUserId("76415ea9-c1f3-4173-b4e3-a24ccb6c9edc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    boolean b5 = studentInfo0.delProductFromFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("5e786f23-932e-4123-b51a-15e28b5a30f0");
    boolean b9 = studentInfo0.delProductFromFavorites("904de44c-2fcc-4342-bf78-0e04d027811d");
    boolean b11 = studentInfo0.addProductToFavorites("1123fd96-e2c4-4e36-bf0b-655a71aa51e9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

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
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f32 = product31.getCost();
    product31.setAvailability(false);
    product31.setId("42ff3df8-22e9-4277-9924-c3723c127d45");
    restaurant3.addProduct(product31);
    java.util.List<com.example.unifood.models.Product> list_product38 = restaurant3.getProductList();
    
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
    org.junit.Assert.assertTrue(f32 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product38);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    restaurant3.setRate((java.lang.Float)32.0f);
    java.lang.String str8 = restaurant3.getShortDescription();
    restaurant3.setCampusId("1d085404-2578-482b-901c-068b998c0e83");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("com.example.unifood.exceptions.InvalidDateException", (float)'a', "b4a7c4bb-fb01-4b40-b048-22c9ffa9235c");
    java.lang.String str4 = product3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.InvalidDateException"+ "'", str4.equals("com.example.unifood.exceptions.InvalidDateException"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("417f3e0b-e3cc-4dc6-bd5c-2e87683b0394", "224e0f6e-d1ef-42f5-abf9-d41b5d9448d0", "93c7f398-2c1a-4d22-be63-bb66ddfccb15");
    java.lang.String str4 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "417f3e0b-e3cc-4dc6-bd5c-2e87683b0394"+ "'", str4.equals("417f3e0b-e3cc-4dc6-bd5c-2e87683b0394"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setType("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b");
    userInfo3.setFirstName("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    java.lang.String str8 = userInfo3.getType();
    java.lang.String str9 = userInfo3.getType();
    userInfo3.setType("f9f685ca-5764-4887-a9b7-8d83c81461e1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b"+ "'", str8.equals("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b"+ "'", str9.equals("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

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
    restaurant0.setCampusId("8c9cb989-277e-45da-a189-194e1666de8e");
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    java.lang.String str25 = review22.getUserId();
    review22.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str28 = review22.getDate();
    review22.setRate(10.0f);
    review22.setRestaurantId("53d740cc-3498-48a3-8d69-2631da037847");
    java.lang.String str33 = review22.getComment();
    restaurant0.addReview(review22);
    java.lang.Float f35 = restaurant0.getRate();
    
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
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str33.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f35 + "' != '" + 0.0f+ "'", f35.equals(0.0f));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("8ef2eb1c-6eaa-459e-96ae-f92134f1053c", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "15149c67-efc5-4744-85b0-8dc2ac121df7");
    restaurant3.updateRating();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getUserId();
    restaurant9.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str13 = restaurant9.getUserId();
    java.lang.Float f14 = restaurant9.getRate();
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant9.getProductList();
    restaurant3.setProductList(list_product15);
    restaurant3.setRate((java.lang.Float)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5706ae41-febd-432a-a7ba-cb76c52b448e"+ "'", str5.equals("5706ae41-febd-432a-a7ba-cb76c52b448e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f14 + "' != '" + 0.0f+ "'", f14.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("8fb81efd-e454-4b41-837c-440f27d5e941");
    review0.setRate((float)(short)1);
    review0.setUserId("cd04d3ea-9c61-47e6-ab64-c445cda7dbfe");
    java.lang.String str11 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d92ddaf7-d7d7-4577-847b-d5f3a5dc8874"+ "'", str11.equals("d92ddaf7-d7d7-4577-847b-d5f3a5dc8874"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    studentInfo11.setCampusId("");
    studentInfo11.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo11.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavProducts();
    campus0.setRestaurants(list_str18);
    boolean b21 = campus0.removeRestaurant("983a5c4e-aa49-46e5-83ef-45159624651e");
    campus0.setId("603fd35b-ea62-491b-8376-4e5ebb75b266");
    java.lang.String str24 = campus0.getId();
    boolean b26 = campus0.addRestaurant("5675838f-a901-49fe-bbef-8588ac00bd79");
    boolean b28 = campus0.removeRestaurant("967eae0b-5900-4252-b25d-f59736812eb1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "60d5fa42-7d1c-4fe8-afe5-1a84d9f019b7"+ "'", str6.equals("60d5fa42-7d1c-4fe8-afe5-1a84d9f019b7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "603fd35b-ea62-491b-8376-4e5ebb75b266"+ "'", str24.equals("603fd35b-ea62-491b-8376-4e5ebb75b266"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.String str10 = restaurant0.getUserId();
    restaurant0.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.Float f13 = restaurant0.getRate();
    java.lang.String str14 = restaurant0.getLocalization();
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant15.getProductList();
    restaurant15.setUserId("hi!");
    restaurant15.setName("12/03/2017");
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    java.lang.String str25 = review24.getId();
    boolean b26 = restaurant15.removeReview(review24);
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    product28.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b33 = restaurant15.removeProduct(product28);
    boolean b34 = product28.getAvailability();
    product28.setId("8e069f68-c995-4d5a-9117-23fad524d3d9");
    java.lang.String str37 = product28.getDescription();
    java.lang.String str38 = product28.getDescription();
    product28.setId("5da24ab6-8bfc-4f94-acd4-b942fc8737d3");
    boolean b41 = restaurant0.removeProduct(product28);
    product28.setCost((float)1);
    product28.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f13 + "' != '" + 0.0f+ "'", f13.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "7d1bdf0e-edad-4881-9e8c-6fb359baf874"+ "'", str25.equals("7d1bdf0e-edad-4881-9e8c-6fb359baf874"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("822dd05c-198a-4327-b7dc-8d252f81520b", "7241fc08-f727-43b6-a704-8a3bdf8ab6f6", (float)' ', "dc2bf82c-f02e-45a8-89ef-51deeab2dffa", "com.example.unifood.exceptions.InvalidRestaurantIdException");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

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
    product21.setCost(0.0f);
    product21.setDescription("3f29bd6c-0c82-43b4-ab44-e9f15ccd226a");
    product21.setId("27ac6ae0-25d7-427d-9bff-93fd18b81339");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("2adc96c3-f320-42fb-97f3-c22c606913fb", "67a826d0-ad9d-49db-8997-58baff1011a9", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setLastName("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    java.lang.String str6 = userInfo3.getType();
    java.lang.String str7 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str6.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str7.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("322c0567-95f6-47cd-bed2-9cdd49776e37", "84c380a1-fee2-4bfe-82b9-7668a6f07e00", "d4347eb6-192e-4976-b563-60f0e7c43424");
    java.lang.String str4 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d4347eb6-192e-4976-b563-60f0e7c43424"+ "'", str4.equals("d4347eb6-192e-4976-b563-60f0e7c43424"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("cbab882e-b57c-4a7a-8205-e76bf105871d", "8486b532-ad8c-4ee4-95f6-cc223414be34", (float)'a', "b63d2730-5a92-4552-a4ac-db1fb9cc2203", "b80d0c79-546e-4f90-8fb2-cf05b7896bcc");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

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
    java.util.List<com.example.unifood.models.Product> list_product34 = restaurant0.getProductList();
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product36 = new com.example.unifood.models.Product();
    boolean b37 = product36.getAvailability();
    restaurant35.addProduct(product36);
    java.util.List<com.example.unifood.models.Product> list_product39 = restaurant35.getProductList();
    restaurant35.setUserId("hi!");
    restaurant35.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review44 = restaurant35.getReviewList();
    com.example.unifood.models.Restaurant restaurant48 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant48.setName("12/03/2017");
    java.lang.String str51 = restaurant48.getUserId();
    java.lang.String str52 = restaurant48.getLocalization();
    restaurant35.update(restaurant48);
    restaurant35.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Product product56 = new com.example.unifood.models.Product();
    boolean b57 = product56.getAvailability();
    product56.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b60 = restaurant35.removeProduct(product56);
    boolean b61 = restaurant0.removeProduct(product56);
    java.lang.String str62 = product56.getId();
    java.lang.String str63 = product56.getName();
    
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
    org.junit.Assert.assertNotNull(list_product34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str52.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "0d9ad281-22bc-4f8c-b74a-e4cca2799b28"+ "'", str62.equals("0d9ad281-22bc-4f8c-b74a-e4cca2799b28"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("0495a317-6bd9-4cf8-bcd4-a5bec8eff848");
    studentInfo1.setCampusId("b9b4792b-29f4-426c-a83a-2e908c34a218");

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    com.example.unifood.models.University university0 = new com.example.unifood.models.University();
    university0.setName("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str3 = university0.getName();
    university0.setName("d4347eb6-192e-4976-b563-60f0e7c43424");
    university0.setName("7b9b4bea-19ad-42b7-b753-2c811dd9acaf");
    university0.setName("13c75407-e7ad-4d88-bfeb-3bc68ba70151");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str3.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

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
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getDate();
    review20.setRate((float)0);
    review20.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review20.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str28 = review20.getUserId();
    boolean b29 = restaurant0.removeReview(review20);
    java.lang.String str30 = restaurant0.getId();
    restaurant0.setName("d7f92956-a18e-4738-a19a-e87665cc72e3");
    
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
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "5f13914e-633b-4e3b-bcf7-9c51549ed23c"+ "'", str30.equals("5f13914e-633b-4e3b-bcf7-9c51549ed23c"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.String str8 = restaurant3.getUserId();
    com.example.unifood.models.Review review9 = null;
    restaurant3.addReview(review9);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant3.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "5f549e06-72c7-4c21-9698-5857aa4f3922"+ "'", str8.equals("5f549e06-72c7-4c21-9698-5857aa4f3922"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

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
    java.lang.String str27 = restaurant0.getShortDescription();
    restaurant0.setLocalization("38eca368-1e98-4441-a7c6-f620597217c4");
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

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
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product("9a21bad7-b577-4aa6-b5f2-af6ad3409249", 0.0f, "631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    restaurant0.addProduct(product23);
    product23.setAvailability(false);
    
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

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    studentInfo1.setCampusId("89f58dbc-2af7-4a83-80de-f53f2422b7a0");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    java.lang.String str4 = userInfo3.getFirstName();
    userInfo3.setFirstName("d710df2d-976a-46d0-a963-3905a87b1799");
    userInfo3.setFirstName("df5273de-bd27-4a50-8918-303ed42b3e94");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d2c231e2-7a36-4c3e-85a5-77d4735a3460"+ "'", str4.equals("d2c231e2-7a36-4c3e-85a5-77d4735a3460"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("4186fa03-dffa-470d-9d7a-6de64c544dca");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

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
    restaurant12.setId("09a32faf-1595-49fc-8656-dc5c5351b506");
    java.lang.String str36 = restaurant12.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "c3eadaa1-d1c2-4f16-81eb-c90961a2b020"+ "'", str19.equals("c3eadaa1-d1c2-4f16-81eb-c90961a2b020"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f32 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str36.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

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
    boolean b38 = university1.removeCampus("522c66bb-123a-4623-9a83-7383e7284635");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "7422350d-e3c4-43d0-8a49-118f7656dbf9"+ "'", str13.equals("7422350d-e3c4-43d0-8a49-118f7656dbf9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "7422350d-e3c4-43d0-8a49-118f7656dbf9"+ "'", str16.equals("7422350d-e3c4-43d0-8a49-118f7656dbf9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "e034fe2d-e0c5-479a-87ef-3c169a92e9db"+ "'", str25.equals("e034fe2d-e0c5-479a-87ef-3c169a92e9db"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "e034fe2d-e0c5-479a-87ef-3c169a92e9db"+ "'", str28.equals("e034fe2d-e0c5-479a-87ef-3c169a92e9db"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

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
    boolean b82 = restaurant3.getApproved();
    
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "3768a39b-5981-4d18-b549-0ccfbeb5b786"+ "'", str46.equals("3768a39b-5981-4d18-b549-0ccfbeb5b786"));
    
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
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    java.lang.String str5 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    review7.setUserId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    review7.setRestaurantId("034414f7-4b07-4a6c-9279-334c5374a4dd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "288aafac-fe5c-4674-be35-c17e6ae5d56f"+ "'", str8.equals("288aafac-fe5c-4674-be35-c17e6ae5d56f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("048b0a1f-9e71-40b9-9e4e-a1018331dae0", "7acd9cc1-ce34-4b1b-aaea-10dc65149ae1", "0ec3cd6d-747a-45a3-8bee-5ffdac26a400");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f8 = restaurant3.getRate();
    restaurant3.setUserId("8922762e-c394-4758-8e43-89d8388d9c11");
    restaurant3.updateRating();
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    product13.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product13.setAvailability(true);
    boolean b20 = restaurant3.removeProduct(product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review0.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    review0.setRate((float)(short)0);
    review0.setUserId("b146ecb8-4b56-4d81-be3b-3894f8af53d7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    restaurant0.setId("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str10 = restaurant0.getCampusId();
    restaurant0.setApproved(true);
    java.lang.String str13 = restaurant0.getCampusId();
    java.lang.String str14 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9"+ "'", str14.equals("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    java.lang.String[] str_array69 = new java.lang.String[] { "cde62678-4a38-48f3-8486-51d54fb5e8c8", "016f7a51-1523-4248-8cce-d7af4447fbc2", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "9cef684b-9583-4350-bc7f-52fdf83f721b", "b9a35319-fcc8-40c8-9a6c-cc193698fa7e", "2016930c-728d-45c5-a236-9c4833a30246", "2b840dda-3718-464e-a39f-2e9719d2b246", "8ce830fe-1366-4bd5-a822-511d9d102587", "8ce830fe-1366-4bd5-a822-511d9d102587", "c1d3b8a3-adce-431f-a302-6cd30c1e553d", "com.example.unifood.exceptions.UserException", "com.example.unifood.exceptions.InvalidRestaurantNameException", "5a768843-8dc8-45b5-baf6-85706b277c5f", "1cc346cd-7e37-4aa5-a18f-4211b5a529c9", "3db35cfa-ac0a-4288-9084-8d042e570026", "322c0567-95f6-47cd-bed2-9cdd49776e37", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "c0679c38-8adf-4203-85c8-515aaf773e20", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "9741db0d-f106-4ae0-9562-dbd17d50d5a3", "811f8a1d-ca60-461d-828c-6680d7547043", "322c0567-95f6-47cd-bed2-9cdd49776e37", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c", "e38e11da-1219-443d-93b7-8c6ea82bea05", "f6ca0495-0d1d-4653-b4e4-20d665aafe5f", "c81d3daf-7c34-4870-802e-061eeb5c81e5", "efbb39b8-b569-44a5-8350-5d34ec9574db", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "15149c67-efc5-4744-85b0-8dc2ac121df7", "49976e80-f69f-4380-aa76-dc904dcb2eca", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "49b07ce6-aac6-463b-a3cc-21e21430bc86", "53d5e04e-abb5-45a7-a278-d742367421a0", "9d54bba1-c011-40fe-a86a-2b02e99ae523", "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8", "09c560d8-ad4a-4efc-a7b7-3894259139d4", "", "d054f793-8da1-4b53-9056-26346d97b155", "49976e80-f69f-4380-aa76-dc904dcb2eca", "f71e4521-c797-403b-bb13-9b84cfa3a1f7", "090d4d8e-cace-44ee-8920-101722da86af", "9e087ae8-80e1-4932-9bf9-0925df2c9f7e", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "a04223f0-b1c0-449c-afab-59a81cef4343", "e2c7a34a-8060-4430-9d69-dd5848b101c6", "7b379d86-fcc6-43c8-a85d-c887cc492e73", "15149c67-efc5-4744-85b0-8dc2ac121df7", "a339ea1e-a8f5-4f77-af1e-264cde0ed0dd", "7fb4b671-eeeb-4d73-8c40-91baed7167c3", "016f7a51-1523-4248-8cce-d7af4447fbc2", "8e6dda6d-66e5-4521-8634-e164e3b1c34c", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "8ce830fe-1366-4bd5-a822-511d9d102587" };
    java.util.ArrayList<java.lang.String> arraylist_str70 = new java.util.ArrayList<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str70, str_array69);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str70);
    boolean b74 = studentInfo0.delProductFromFavorites("4f54b634-288e-42c6-b781-2869535b5bb5");
    boolean b76 = studentInfo0.addProductToFavorites("c84f0394-6747-4586-8752-1eb463b198b9");
    java.lang.String str77 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant0.getReviewList();
    restaurant0.setRate((java.lang.Float)0.0f);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant12.getProductList();
    restaurant12.setUserId("hi!");
    restaurant12.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant12.getProductList();
    restaurant12.setShortDescription("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant12.getReviewList();
    java.lang.String str25 = restaurant12.getCampusId();
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b30 = restaurant29.getApproved();
    java.lang.String str31 = restaurant29.getId();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review37.setUserId("");
    java.lang.String str40 = review37.getUserId();
    review37.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b43 = restaurant29.removeReview(review37);
    boolean b44 = restaurant12.equals((java.lang.Object)review37);
    restaurant0.addReview(review37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "81468976-d5da-47df-8eaf-addc1e6c20cd"+ "'", str31.equals("81468976-d5da-47df-8eaf-addc1e6c20cd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getCampusId();
    restaurant0.setCampusId("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    restaurant0.setId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    boolean b7 = restaurant0.getApproved();
    com.example.unifood.models.Review review8 = new com.example.unifood.models.Review();
    review8.setId("");
    java.lang.String str11 = review8.getUserId();
    review8.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str14 = review8.getDate();
    review8.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review8.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review8.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    restaurant0.addReview(review8);
    restaurant0.setRate((java.lang.Float)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    studentInfo1.setCampusId("3b3d7df8-b1cc-4ba3-8318-a86c840dda4a");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("822dd05c-198a-4327-b7dc-8d252f81520b");
    java.util.List<java.lang.String> list_str6 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("f7e7ee16-9b0a-41a7-b8d1-e3980c85e45f", (float)' ', "09ebdce8-dd6d-495a-87b1-5c181c56cf93");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

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
    java.lang.String str24 = product12.getName();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "9f79a65e-5d56-44da-ac6c-6dc3a64cc3bd"+ "'", str22.equals("9f79a65e-5d56-44da-ac6c-6dc3a64cc3bd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getComment();
    java.lang.String str3 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "eac8f549-57f6-4c23-a424-a36f69f0367d"+ "'", str1.equals("eac8f549-57f6-4c23-a424-a36f69f0367d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b10 = campus0.addRestaurant("51998cce-1219-4bac-b3bf-a4db195dc527");
    java.lang.String str11 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "55795b6b-aaa8-45a1-940b-d6e68acc7ffd"+ "'", str6.equals("55795b6b-aaa8-45a1-940b-d6e68acc7ffd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    java.lang.String str9 = review0.getComment();
    review0.setDate("84e3215a-cb95-4021-8594-50fe3409fae3");
    review0.setRate((float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("08ef2ed8-271a-4aad-9415-47b0dba1b9a7");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "08ef2ed8-271a-4aad-9415-47b0dba1b9a7"+ "'", str2.equals("08ef2ed8-271a-4aad-9415-47b0dba1b9a7"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d4347eb6-192e-4976-b563-60f0e7c43424", "14564b45-b104-409a-ae4d-8bf9aa3d8148", "89afd63c-d576-4913-8a77-be38651f287f");
    userInfo3.setLastName("ad95aa68-c9d4-4e3c-b79f-0e340fc78a53");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String str3 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "49976e80-f69f-4380-aa76-dc904dcb2eca"+ "'", str3.equals("49976e80-f69f-4380-aa76-dc904dcb2eca"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b3660a10-0a45-4a63-a48b-cafcf60da884");
    studentInfo1.setCampusId("efbb39b8-b569-44a5-8350-5d34ec9574db");
    boolean b5 = studentInfo1.delProductFromFavorites("14564b45-b104-409a-ae4d-8bf9aa3d8148");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    review5.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review5.setComment("8e069f68-c995-4d5a-9117-23fad524d3d9");
    review5.setDate("2d88e3e8-25d3-48e6-8156-fc7a40cbf371");
    review5.setRate((float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    java.lang.String str9 = university1.getId();
    boolean b11 = university1.addCampus("c28192ff-273c-4a31-9582-5ba3ad6cd6a5");
    boolean b13 = university1.addCampus("5a768843-8dc8-45b5-baf6-85706b277c5f");
    boolean b15 = university1.removeCampus("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    boolean b17 = university1.addCampus("84132e2b-1d5a-4886-9edd-b08db65d8de5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3f1f76ef-f981-4d87-80d5-f611831f4c87"+ "'", str2.equals("3f1f76ef-f981-4d87-80d5-f611831f4c87"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3f1f76ef-f981-4d87-80d5-f611831f4c87"+ "'", str5.equals("3f1f76ef-f981-4d87-80d5-f611831f4c87"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str9.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

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
    boolean b19 = university1.addCampus("");
    
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
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

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
    studentInfo0.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<java.lang.String> list_str23 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

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
    boolean b17 = restaurant0.equals((java.lang.Object)"63d9aec0-76a5-435f-9c93-e0aac2c8b34e");
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    java.lang.String str19 = restaurant18.getUserId();
    java.lang.String str20 = restaurant18.getLocalization();
    restaurant18.updateRating();
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
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    review34.setId("");
    java.lang.String str37 = review34.getUserId();
    review34.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str40 = review34.getRestaurantId();
    boolean b41 = restaurant22.removeReview(review34);
    review34.setRestaurantId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    restaurant18.addReview(review34);
    com.example.unifood.models.Restaurant restaurant45 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product46 = new com.example.unifood.models.Product();
    boolean b47 = product46.getAvailability();
    restaurant45.addProduct(product46);
    java.util.List<com.example.unifood.models.Product> list_product49 = restaurant45.getProductList();
    restaurant45.setUserId("hi!");
    restaurant45.setName("12/03/2017");
    com.example.unifood.models.Review review54 = new com.example.unifood.models.Review();
    java.lang.String str55 = review54.getId();
    boolean b56 = restaurant45.removeReview(review54);
    boolean b57 = restaurant18.removeReview(review54);
    boolean b58 = restaurant0.removeReview(review54);
    com.example.unifood.models.Restaurant restaurant59 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product60 = new com.example.unifood.models.Product();
    boolean b61 = product60.getAvailability();
    restaurant59.addProduct(product60);
    java.lang.String str63 = restaurant59.getId();
    restaurant59.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant59.setApproved(true);
    restaurant59.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review70 = restaurant59.getReviewList();
    restaurant0.setReviewList(list_review70);
    restaurant0.setLocalization("1507d7b1-8bb2-4047-96fe-82811c41439e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0fcda7ac-af9a-482e-97ec-20e8c2919db2"+ "'", str4.equals("0fcda7ac-af9a-482e-97ec-20e8c2919db2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "97421bf4-db97-43d3-bc06-bc48715ab356"+ "'", str12.equals("97421bf4-db97-43d3-bc06-bc48715ab356"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "81ba53e0-422f-4597-aed6-991c7e9cde68"+ "'", str32.equals("81ba53e0-422f-4597-aed6-991c7e9cde68"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "f8d9c04d-e931-4167-b0ca-98c17b926f66"+ "'", str55.equals("f8d9c04d-e931-4167-b0ca-98c17b926f66"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "cedf6fa9-de15-49e7-aaf7-4c9f00a6aea2"+ "'", str63.equals("cedf6fa9-de15-49e7-aaf7-4c9f00a6aea2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review70);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("7abf4d3d-b259-4908-8e6b-f617c87176f2");
    java.lang.String str2 = campus1.getId();
    java.util.List<java.lang.String> list_str3 = campus1.getRestaurants();
    campus1.setName("47945630-e567-4cf1-bb33-35df2661de35");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "faf0a989-1774-4420-89f7-aa26a3b07d4d"+ "'", str2.equals("faf0a989-1774-4420-89f7-aa26a3b07d4d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    review5.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    review5.setDate("2af0b02e-4c9a-4970-a399-ff63e0300464");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("7112ad78-afe2-4681-bb63-66c58d50e07e");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("0da99290-441d-4c53-abff-e4fc9c8ee647");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.removeCampus("fac38639-0887-4f75-9179-fdad7fe2aec7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8c73065c-fec4-4912-8b5c-0dfafc1da79a"+ "'", str2.equals("8c73065c-fec4-4912-8b5c-0dfafc1da79a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getRestaurantId();
    review0.setComment("6621a3a3-4757-411c-afe0-c60cd3c6a97d");
    java.lang.String str11 = review0.getDate();
    review0.setRate((float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getId();
    java.lang.String str2 = review0.getUserId();
    review0.setRestaurantId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.lang.String str5 = review0.getRestaurantId();
    review0.setDate("b878dc6e-48f9-441a-929c-5b631521b5e8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8107dbf2-653f-490f-a98e-a77bf57f22e5"+ "'", str1.equals("8107dbf2-653f-490f-a98e-a77bf57f22e5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00a80698-5dcc-4f53-8de2-eaec89537d25"+ "'", str5.equals("00a80698-5dcc-4f53-8de2-eaec89537d25"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    java.util.List<java.lang.String> list_str4 = university1.getAllCampus();
    boolean b6 = university1.addCampus("com.example.unifood.exceptions.InvalidRestaurantIdException");
    boolean b8 = university1.addCampus("154fffbb-c920-465f-ab05-2f25ee336187");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6", "fde75b42-0c98-4497-90a3-eaf498e34ad2", "b6792249-a15c-420b-9817-44c9aa457e85");
    restaurant3.setShortDescription("4095eb38-f7d8-4310-9a1e-68274ed1223b");
    restaurant3.setName("7df88144-033b-4859-9ab5-ada8e7b5b055");
    java.lang.String str8 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "fde75b42-0c98-4497-90a3-eaf498e34ad2"+ "'", str8.equals("fde75b42-0c98-4497-90a3-eaf498e34ad2"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

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
    restaurant0.setShortDescription("4dc32edb-837b-4c73-8d72-66df1a3ebd2c");
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant24.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str27 = restaurant24.getShortDescription();
    boolean b29 = restaurant24.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.util.List<com.example.unifood.models.Product> list_product30 = restaurant24.getProductList();
    restaurant0.update(restaurant24);
    com.example.unifood.models.Review review32 = new com.example.unifood.models.Review();
    review32.setId("");
    java.lang.String str35 = review32.getUserId();
    review32.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review32.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review32.setComment("22d944a9-1bc9-4722-89e4-e2c91eeee1ea");
    boolean b42 = restaurant0.removeReview(review32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "364cae21-2c09-4066-a187-9a1f2a698e9b"+ "'", str10.equals("364cae21-2c09-4066-a187-9a1f2a698e9b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    boolean b3 = university1.addCampus("c0679c38-8adf-4203-85c8-515aaf773e20");
    university1.setId("ae91f11d-dca1-4f18-869c-4190e5461bde");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("9626d0ba-fe19-4356-a232-426c972c7dfc", "4f54b634-288e-42c6-b781-2869535b5bb5", 0.0f, "f666c841-c560-4874-8cbd-008c848d1f42");
    java.lang.String str5 = review4.getRestaurantId();
    java.lang.String str6 = review4.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str5.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "f666c841-c560-4874-8cbd-008c848d1f42"+ "'", str6.equals("f666c841-c560-4874-8cbd-008c848d1f42"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("22ad7b07-f59a-4272-bf9c-378211cbc4dc");
    java.util.List<java.lang.String> list_str2 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setName("efbb39b8-b569-44a5-8350-5d34ec9574db");
    boolean b7 = restaurant3.equals((java.lang.Object)"687c94a8-4d6b-417b-bc44-fda2c3685fc2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

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
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException14 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str15 = invalidRestaurantNameException14.toString();
    userException5.addSuppressed((java.lang.Throwable)invalidRestaurantNameException14);
    java.lang.String str17 = invalidRestaurantNameException14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str15.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str17.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.String str10 = restaurant0.getUserId();
    restaurant0.setId("196f0ccf-3520-4047-a4a5-6dbd7d850da4");
    restaurant0.setName("6528c820-2c6e-4424-adc3-c18b8e14e2b6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("d6df1b87-a5b7-4af3-ab66-be45705259d4", (float)'#', "57972280-5b1d-4ed3-88fb-4d84f5cc842a");

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    boolean b32 = campus0.removeRestaurant("2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("5f5c4b81-254c-4177-bece-07521f3cb9d5");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavRestaurants();
    campus0.setRestaurants(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.lang.String[] str_array31 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str32);
    university1.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    boolean b38 = university1.removeCampus("c86f9786-8c29-4ebd-afd2-3876b40f0b47");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "91d0ca4b-23d5-44ef-9195-0230eac15a32"+ "'", str2.equals("91d0ca4b-23d5-44ef-9195-0230eac15a32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    float f6 = product0.getCost();
    product0.setCost((float)1);
    boolean b9 = product0.getAvailability();
    float f10 = product0.getCost();
    java.lang.String str11 = product0.getDescription();
    java.lang.String str12 = product0.getDescription();
    java.lang.String str13 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("7fb29310-ac88-4372-a1c5-0ecca40390e7");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4", "2d9e3875-451e-4f7d-9ec4-7d52e0dfc476", "7fb29310-ac88-4372-a1c5-0ecca40390e7");
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review();
    review4.setId("");
    java.lang.String str7 = review4.getUserId();
    review4.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str10 = review4.getDate();
    review4.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str13 = review4.getUserId();
    java.lang.String str14 = review4.getId();
    boolean b15 = restaurant3.removeReview(review4);
    review4.setUserId("5d5ece3f-4f85-44d3-9a52-049dea6bd8aa");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setLastName("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setType("9177b50b-86bb-45a0-bcfc-679787c40e0f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9d54bba1-c011-40fe-a86a-2b02e99ae523"+ "'", str6.equals("9d54bba1-c011-40fe-a86a-2b02e99ae523"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b9 = restaurant8.getApproved();
    java.lang.String str10 = restaurant8.getId();
    restaurant0.update(restaurant8);
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant8.getReviewList();
    java.lang.String str13 = restaurant8.getCampusId();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    product14.setDescription("hi!");
    java.lang.String str17 = product14.getDescription();
    java.lang.String str18 = product14.getDescription();
    boolean b19 = restaurant8.removeProduct(product14);
    boolean b20 = product14.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "e555a931-394c-4dde-b748-626ea14e491c"+ "'", str10.equals("e555a931-394c-4dde-b748-626ea14e491c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str13.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    boolean b15 = product14.getAvailability();
    restaurant13.addProduct(product14);
    java.util.List<com.example.unifood.models.Product> list_product17 = restaurant13.getProductList();
    restaurant13.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant13.setApproved(false);
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    restaurant22.addProduct(product23);
    restaurant22.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant13.update(restaurant22);
    java.util.List<com.example.unifood.models.Review> list_review29 = restaurant13.getReviewList();
    restaurant6.setReviewList(list_review29);
    restaurant3.setReviewList(list_review29);
    restaurant3.setId("94cff566-8f46-4475-8c23-466342c42efb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review29);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    review0.setComment("");
    review0.setRate((float)1);
    java.lang.String str13 = review0.getComment();
    review0.setUserId("9bb4ec51-2299-41a3-b764-2192d7b57501");
    review0.setUserId("64b8ae8b-c092-4f2e-8608-e4d689eb4357");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant4.setName("12/03/2017");
    java.lang.String str7 = restaurant4.getUserId();
    restaurant4.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    java.lang.String str11 = review10.getId();
    boolean b12 = restaurant4.equals((java.lang.Object)review10);
    restaurant4.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant15.getProductList();
    restaurant15.setUserId("hi!");
    restaurant15.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant15.getReviewList();
    restaurant4.setReviewList(list_review24);
    restaurant0.setReviewList(list_review24);
    restaurant0.setId("f0154754-58f7-4596-aff9-406aad29f6ef");
    java.lang.String str29 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1de71235-fde2-424f-82c1-aee9767adb92"+ "'", str11.equals("1de71235-fde2-424f-82c1-aee9767adb92"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "f0154754-58f7-4596-aff9-406aad29f6ef"+ "'", str29.equals("f0154754-58f7-4596-aff9-406aad29f6ef"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("8ad6c68f-c1f5-48da-9394-cc66a42c7c76", "b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4", "27fab29a-8261-4cad-9980-1ab61f13cf41");
    userInfo3.setFirstName("ddc183b1-0bcb-4e49-8eb8-ce29738b2e1c");
    java.lang.String str6 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "27fab29a-8261-4cad-9980-1ab61f13cf41"+ "'", str6.equals("27fab29a-8261-4cad-9980-1ab61f13cf41"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

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
    restaurant3.setRate((java.lang.Float)(-1.0f));
    restaurant3.setLocalization("dbdb3e49-5064-44a4-bcc4-fa29a5b0074b");
    
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

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("8ef2eb1c-6eaa-459e-96ae-f92134f1053c", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "15149c67-efc5-4744-85b0-8dc2ac121df7");
    restaurant3.updateRating();
    java.lang.String str5 = restaurant3.getId();
    restaurant3.setId("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    java.util.List<com.example.unifood.models.Product> list_product8 = null;
    restaurant3.setProductList(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "6e20f13e-3cd2-45ab-b164-b85da8dfca13"+ "'", str5.equals("6e20f13e-3cd2-45ab-b164-b85da8dfca13"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

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
    restaurant0.setUserId("76fe9853-ea57-4556-ac71-95373a19a23f");
    restaurant0.setUserId("b697af8d-55e3-4dc7-a299-28b29d5b5e1a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "cd16fee5-4166-446a-a328-23371997e2bb"+ "'", str10.equals("cd16fee5-4166-446a-a328-23371997e2bb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "cd4f422e-7412-438f-bb96-fb057810c449"+ "'", str23.equals("cd4f422e-7412-438f-bb96-fb057810c449"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("4f48eb7e-911e-42a7-8cdd-d84caf2064b8");

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getFirstName();
    java.lang.String str7 = userInfo0.getType();
    userInfo0.setType("d4347eb6-192e-4976-b563-60f0e7c43424");
    userInfo0.setLastName("com.example.unifood.exceptions.UserException");
    java.lang.String str12 = userInfo0.getType();
    java.lang.String str13 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str5.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str7.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d4347eb6-192e-4976-b563-60f0e7c43424"+ "'", str12.equals("d4347eb6-192e-4976-b563-60f0e7c43424"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d4347eb6-192e-4976-b563-60f0e7c43424"+ "'", str13.equals("d4347eb6-192e-4976-b563-60f0e7c43424"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

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
    restaurant0.setId("4fa865d0-e878-47c0-bd71-135be0fed94a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "51d1875f-768e-4819-b159-6e36cd575d93"+ "'", str10.equals("51d1875f-768e-4819-b159-6e36cd575d93"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setCost((float)(byte)-1);
    product0.setCost((float)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    restaurant3.setLocalization("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str17 = restaurant3.getId();
    java.lang.String str18 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "8ce830fe-1366-4bd5-a822-511d9d102587"+ "'", str17.equals("8ce830fe-1366-4bd5-a822-511d9d102587"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str18.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant4.setName("12/03/2017");
    java.lang.String str7 = restaurant4.getUserId();
    restaurant4.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    java.lang.String str11 = review10.getId();
    boolean b12 = restaurant4.equals((java.lang.Object)review10);
    restaurant4.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant15.getProductList();
    restaurant15.setUserId("hi!");
    restaurant15.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant15.getReviewList();
    restaurant4.setReviewList(list_review24);
    restaurant0.setReviewList(list_review24);
    restaurant0.setCampusId("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    java.lang.String str30 = review29.getDate();
    float f31 = review29.getRate();
    float f32 = review29.getRate();
    java.lang.String str33 = review29.getId();
    boolean b34 = restaurant0.removeReview(review29);
    java.util.List<com.example.unifood.models.Product> list_product35 = restaurant0.getProductList();
    restaurant0.setCampusId("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "16b76955-f538-4476-b72d-1aa59eb2cd32"+ "'", str11.equals("16b76955-f538-4476-b72d-1aa59eb2cd32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f31 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f32 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "cee92af4-6212-4bdc-9870-e8864285bf7f"+ "'", str33.equals("cee92af4-6212-4bdc-9870-e8864285bf7f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product35);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("13f98119-ba54-4465-bf81-4bb02912af47");
    java.util.List<java.lang.String> list_str3 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("5ef1d394-6fb6-4535-9f48-1e057f3e383b", 1.0f, "8e1ddaca-7c39-4d19-96d1-5b8bd7bbd469");

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("ced6e91b-9cd9-49c4-91b3-b718083b5bff", "a0f00e58-59cd-4a75-8a3e-3734d948e034", (float)'#', "13dfee7d-97f1-412c-a7a0-e00e68cf6396", "ee3e7097-4eed-4d70-a084-49efff46f6ac");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("53506ad7-2d37-4e35-afb9-2f81950ae0a5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "62cdf861-9ada-41bc-b5d9-be856dd95e9c"+ "'", str2.equals("62cdf861-9ada-41bc-b5d9-be856dd95e9c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("8a4f7782-7de3-4ba9-b962-3e34df2e8048", "21a5ae7c-2e2c-4f21-ab45-133899277be9", (float)0, "32bef74e-15d2-4f2b-849c-199055557d88", "53385034-c596-4b8b-96bd-a5bd2910707a");
    review5.setRestaurantId("22739d71-d067-4543-8594-4b1f473fe3b0");
    java.lang.String str8 = review5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "81205631-d4f2-46c5-a67a-7f5d9957cff4"+ "'", str8.equals("81205631-d4f2-46c5-a67a-7f5d9957cff4"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

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
    com.example.unifood.models.Product product24 = new com.example.unifood.models.Product("979b1930-46c4-4b6e-b9e8-0d568cf89fb1", 0.0f, "9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    boolean b25 = product24.getAvailability();
    java.lang.String str26 = product24.getName();
    java.lang.String str27 = product24.getName();
    boolean b28 = restaurant3.equals((java.lang.Object)str27);
    
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
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "979b1930-46c4-4b6e-b9e8-0d568cf89fb1"+ "'", str26.equals("979b1930-46c4-4b6e-b9e8-0d568cf89fb1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "979b1930-46c4-4b6e-b9e8-0d568cf89fb1"+ "'", str27.equals("979b1930-46c4-4b6e-b9e8-0d568cf89fb1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("a6a5ead2-c42f-4ba9-ad78-89b336f3897b", "", 0.0f, "5905c9ec-8594-480a-98d9-f263a8aa7afa", "536d30aa-f0d7-4f19-ba3c-e2827fc9db6e");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("6190498b-cbea-4ee1-bf13-9bff10516e6a", "", (float)(short)10, "39cc6fd0-3a01-470e-821f-4ce02cb37c06");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    product3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str7 = product3.getId();
    java.lang.String str8 = product3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str7.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str8.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b7ec182a-87d0-47e4-8b8c-bd76ab004a93");

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    java.lang.String str9 = university1.getId();
    university1.setName("03b11d7c-17ee-42b3-8d2b-a1582b7ae26f");
    java.lang.String str12 = university1.getId();
    java.lang.String str13 = university1.getName();
    boolean b15 = university1.addCampus("a3c31d1d-2dff-4b26-8f79-e35fb7c774a7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3a36917a-543e-467f-815b-5b094fee2ab8"+ "'", str2.equals("3a36917a-543e-467f-815b-5b094fee2ab8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3a36917a-543e-467f-815b-5b094fee2ab8"+ "'", str5.equals("3a36917a-543e-467f-815b-5b094fee2ab8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str9.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str12.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "03b11d7c-17ee-42b3-8d2b-a1582b7ae26f"+ "'", str13.equals("03b11d7c-17ee-42b3-8d2b-a1582b7ae26f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("91e08414-384a-496f-8c94-6a9a342234e3");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

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
    restaurant0.setShortDescription("4dc32edb-837b-4c73-8d72-66df1a3ebd2c");
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant24.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str27 = restaurant24.getShortDescription();
    boolean b29 = restaurant24.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.util.List<com.example.unifood.models.Product> list_product30 = restaurant24.getProductList();
    restaurant0.update(restaurant24);
    com.example.unifood.models.Restaurant restaurant32 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product33 = new com.example.unifood.models.Product();
    boolean b34 = product33.getAvailability();
    restaurant32.addProduct(product33);
    com.example.unifood.models.Review review36 = new com.example.unifood.models.Review();
    review36.setId("");
    java.lang.String str39 = review36.getUserId();
    review36.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review36.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str44 = review36.getRestaurantId();
    boolean b45 = restaurant32.removeReview(review36);
    java.lang.String str46 = review36.getRestaurantId();
    java.lang.String str47 = review36.getId();
    review36.setComment("7bd3d6e1-0d0b-4fa1-810d-a56167a32b50");
    restaurant24.addReview(review36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "d8d8be49-c3ce-45ba-afed-9c0124fde5fd"+ "'", str10.equals("d8d8be49-c3ce-45ba-afed-9c0124fde5fd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    restaurant3.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    boolean b16 = product15.getAvailability();
    restaurant14.addProduct(product15);
    java.util.List<com.example.unifood.models.Product> list_product18 = restaurant14.getProductList();
    restaurant14.setUserId("hi!");
    restaurant14.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant14.getReviewList();
    restaurant3.setReviewList(list_review23);
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product26 = new com.example.unifood.models.Product();
    boolean b27 = product26.getAvailability();
    restaurant25.addProduct(product26);
    java.util.List<com.example.unifood.models.Product> list_product29 = restaurant25.getProductList();
    restaurant25.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review32 = new com.example.unifood.models.Review();
    java.lang.String str33 = review32.getId();
    boolean b34 = restaurant25.removeReview(review32);
    review32.setComment("cee8ca5c-7aba-430f-8c09-de542ba28019");
    restaurant3.addReview(review32);
    java.lang.String str38 = restaurant3.getName();
    com.example.unifood.models.Restaurant restaurant39 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product40 = new com.example.unifood.models.Product();
    boolean b41 = product40.getAvailability();
    restaurant39.addProduct(product40);
    java.util.List<com.example.unifood.models.Product> list_product43 = restaurant39.getProductList();
    restaurant39.setUserId("hi!");
    restaurant39.setName("12/03/2017");
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    java.lang.String str49 = review48.getId();
    boolean b50 = restaurant39.removeReview(review48);
    com.example.unifood.models.Restaurant restaurant51 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product52 = new com.example.unifood.models.Product();
    boolean b53 = product52.getAvailability();
    restaurant51.addProduct(product52);
    product52.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b57 = restaurant39.removeProduct(product52);
    product52.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    boolean b60 = restaurant3.removeProduct(product52);
    product52.setAvailability(false);
    boolean b63 = product52.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "55d392db-0a65-4a48-a8db-6a2d9d75743a"+ "'", str10.equals("55d392db-0a65-4a48-a8db-6a2d9d75743a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "0b2e9360-b9a0-429e-b6f1-e4a57f7a1d70"+ "'", str33.equals("0b2e9360-b9a0-429e-b6f1-e4a57f7a1d70"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "12/03/2017"+ "'", str38.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "09740fed-6d0d-4b82-b9dc-a32c444ef1eb"+ "'", str49.equals("09740fed-6d0d-4b82-b9dc-a32c444ef1eb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("c471951d-ac0a-477e-9b01-f80fd4466017");

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    product3.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    product3.setId("2544ef1a-fdb4-45a9-aedc-1dda50f297da");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }

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
    com.example.unifood.exceptions.OwnerException ownerException14 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException15 = new com.example.unifood.exceptions.OwnerException();
    ownerException14.addSuppressed((java.lang.Throwable)ownerException15);
    invalidProductNameException0.addSuppressed((java.lang.Throwable)ownerException14);
    com.example.unifood.exceptions.OwnerException ownerException18 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException19 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException18.addSuppressed((java.lang.Throwable)invalidCampusIdException19);
    java.lang.Throwable[] throwable_array21 = ownerException18.getSuppressed();
    ownerException14.addSuppressed((java.lang.Throwable)ownerException18);
    
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
    org.junit.Assert.assertNotNull(throwable_array21);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("060bb557-f28d-4aba-8eba-88813a4f68dc");

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    studentInfo0.setCampusId("37e4c997-eeb6-40cd-8ab8-7a9aa90c53d5");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus3 = new com.example.unifood.models.Campus();
    boolean b5 = campus3.removeRestaurant("hi!");
    campus3.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str8 = campus3.getRestaurants();
    studentInfo2.setFavRestaurants(list_str8);
    java.lang.String str10 = studentInfo2.getCampusId();
    boolean b12 = studentInfo2.addProductToFavorites("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    com.example.unifood.models.Campus campus14 = new com.example.unifood.models.Campus("ca4a646d-3cc8-4cc0-9b41-40eb17520a41");
    java.util.List<java.lang.String> list_str15 = campus14.getRestaurants();
    studentInfo2.setFavRestaurants(list_str15);
    boolean b18 = studentInfo2.addRestaurantToFavorites("97dc18f2-af04-41ba-896d-bf92c29d9a8c");
    java.util.List<java.lang.String> list_str19 = studentInfo2.getFavRestaurants();
    university1.setAllCampus(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }

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
    java.lang.Float f22 = restaurant0.getRate();
    restaurant0.setUserId("8de27154-3b14-4424-b26e-8371c0e0e22a");
    java.lang.String str25 = restaurant0.getUserId();
    
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
    org.junit.Assert.assertTrue("'" + f22 + "' != '" + 0.0f+ "'", f22.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "8de27154-3b14-4424-b26e-8371c0e0e22a"+ "'", str25.equals("8de27154-3b14-4424-b26e-8371c0e0e22a"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant0.getName();
    java.lang.String str8 = restaurant0.getName();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2", (float)'#', "6c4c9076-aeac-4c07-b6bc-73b8d8f0a4be");
    boolean b13 = restaurant0.removeProduct(product12);
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    boolean b16 = product15.getAvailability();
    restaurant14.addProduct(product15);
    java.util.List<com.example.unifood.models.Product> list_product18 = restaurant14.getProductList();
    restaurant14.setUserId("hi!");
    restaurant14.setName("12/03/2017");
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    java.lang.String str24 = review23.getId();
    boolean b25 = restaurant14.removeReview(review23);
    com.example.unifood.models.Review review26 = new com.example.unifood.models.Review();
    java.lang.String str27 = review26.getDate();
    review26.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review26.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b32 = restaurant14.removeReview(review26);
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    java.lang.String str37 = restaurant33.getId();
    restaurant33.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant14.update(restaurant33);
    restaurant33.updateRating();
    java.lang.String str42 = restaurant33.getId();
    com.example.unifood.models.Restaurant restaurant43 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product44 = new com.example.unifood.models.Product();
    boolean b45 = product44.getAvailability();
    restaurant43.addProduct(product44);
    java.util.List<com.example.unifood.models.Product> list_product47 = restaurant43.getProductList();
    restaurant43.setUserId("hi!");
    restaurant43.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review52 = restaurant43.getReviewList();
    com.example.unifood.models.Restaurant restaurant56 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant56.setName("12/03/2017");
    java.lang.String str59 = restaurant56.getUserId();
    java.lang.String str60 = restaurant56.getLocalization();
    restaurant43.update(restaurant56);
    restaurant43.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review();
    review64.setId("");
    java.lang.String str67 = review64.getUserId();
    java.lang.String str68 = review64.getRestaurantId();
    restaurant43.addReview(review64);
    java.lang.String str70 = review64.getUserId();
    java.lang.String str71 = review64.getUserId();
    boolean b72 = restaurant33.removeReview(review64);
    java.util.List<com.example.unifood.models.Product> list_product73 = restaurant33.getProductList();
    com.example.unifood.models.Restaurant restaurant77 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b78 = restaurant77.getApproved();
    restaurant77.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Product> list_product81 = restaurant77.getProductList();
    restaurant33.setProductList(list_product81);
    com.example.unifood.models.Restaurant restaurant86 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant86.setCampusId("ced1f535-42a1-41b6-914a-7e282afaf033");
    java.util.List<com.example.unifood.models.Review> list_review89 = restaurant86.getReviewList();
    restaurant33.setReviewList(list_review89);
    restaurant0.setReviewList(list_review89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str7.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str8.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "36a16465-b78b-4e27-a07b-1daf83018bef"+ "'", str24.equals("36a16465-b78b-4e27-a07b-1daf83018bef"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "9f397213-7816-4bf8-b8ca-81506603c0dc"+ "'", str37.equals("9f397213-7816-4bf8-b8ca-81506603c0dc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str42.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str60.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review89);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
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
    restaurant30.updateRating();
    java.lang.String str39 = restaurant30.getId();
    com.example.unifood.models.Restaurant restaurant40 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product41 = new com.example.unifood.models.Product();
    boolean b42 = product41.getAvailability();
    restaurant40.addProduct(product41);
    java.util.List<com.example.unifood.models.Product> list_product44 = restaurant40.getProductList();
    restaurant40.setUserId("hi!");
    restaurant40.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review49 = restaurant40.getReviewList();
    com.example.unifood.models.Restaurant restaurant53 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant53.setName("12/03/2017");
    java.lang.String str56 = restaurant53.getUserId();
    java.lang.String str57 = restaurant53.getLocalization();
    restaurant40.update(restaurant53);
    restaurant40.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Review review61 = new com.example.unifood.models.Review();
    review61.setId("");
    java.lang.String str64 = review61.getUserId();
    java.lang.String str65 = review61.getRestaurantId();
    restaurant40.addReview(review61);
    java.lang.String str67 = review61.getUserId();
    java.lang.String str68 = review61.getUserId();
    boolean b69 = restaurant30.removeReview(review61);
    java.util.List<com.example.unifood.models.Product> list_product70 = restaurant30.getProductList();
    java.lang.String str71 = restaurant30.getName();
    restaurant3.update(restaurant30);
    java.lang.String str73 = restaurant30.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "eb6364e1-8b93-4ffd-8385-8d845497de1b"+ "'", str21.equals("eb6364e1-8b93-4ffd-8385-8d845497de1b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "a23e2e46-9147-4093-b349-09c1ebe277ee"+ "'", str34.equals("a23e2e46-9147-4093-b349-09c1ebe277ee"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str39.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + ""+ "'", str56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str57.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b3 = university1.addCampus("aabd70ed-be9f-4452-9625-3f6b64c27121");
    boolean b5 = university1.addCampus("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    boolean b7 = university1.addCampus("15149c67-efc5-4744-85b0-8dc2ac121df7");
    java.lang.String str8 = university1.getId();
    boolean b10 = university1.addCampus("da9049f0-e590-4d0f-a0d4-925d3285b5a2");
    java.lang.String str11 = university1.getName();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b15 = studentInfo13.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    boolean b17 = studentInfo13.delProductFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    java.util.List<java.lang.String> list_str18 = studentInfo13.getFavProducts();
    university1.setAllCampus(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "c7e8e8a6-fbb4-40a7-a113-884f71503c7c"+ "'", str8.equals("c7e8e8a6-fbb4-40a7-a113-884f71503c7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str11.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }

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
    java.lang.String str20 = studentInfo0.getCampusId();
    boolean b22 = studentInfo0.addProductToFavorites("75ff667f-21df-457d-81ab-c93c2a048281");
    studentInfo0.setCampusId("55763602-a4bd-4dd4-9876-48d4b9c1c63a");
    boolean b26 = studentInfo0.addProductToFavorites("67ebbc86-a52d-41e4-bc99-4fb67ae7aa2d");
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "45ff5ab3-6561-44f6-9c93-3f3be9ded172"+ "'", str20.equals("45ff5ab3-6561-44f6-9c93-3f3be9ded172"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }

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
    java.lang.String str16 = review7.getUserId();
    review7.setComment("e06a1963-33b0-42d7-b9df-f92c9cfb6dc3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }

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
    java.lang.String str32 = restaurant3.getId();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "a2aa7959-38d4-4ca7-aee6-7f74f2797d35"+ "'", str27.equals("a2aa7959-38d4-4ca7-aee6-7f74f2797d35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str30.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "a6c3f8cd-9137-40e5-8bef-3239d4ee118a"+ "'", str32.equals("a6c3f8cd-9137-40e5-8bef-3239d4ee118a"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }

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
    restaurant0.setName("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str15 = restaurant0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str15.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("59239ec8-4bad-432d-a127-577bb3b52c17");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.lang.String[] str_array31 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str32);
    university1.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    com.example.unifood.models.Campus campus37 = new com.example.unifood.models.Campus();
    boolean b39 = campus37.removeRestaurant("hi!");
    campus37.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str42 = campus37.getRestaurants();
    boolean b44 = campus37.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b46 = campus37.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b48 = campus37.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str49 = campus37.getName();
    boolean b51 = campus37.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.Campus campus52 = new com.example.unifood.models.Campus();
    boolean b54 = campus52.removeRestaurant("hi!");
    campus52.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str57 = campus52.getRestaurants();
    boolean b59 = campus52.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b61 = campus52.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b63 = campus52.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str64 = campus52.getName();
    com.example.unifood.models.StudentInfo studentInfo65 = new com.example.unifood.models.StudentInfo();
    studentInfo65.setCampusId("");
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str74 = new java.util.ArrayList<java.lang.String>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str74, str_array73);
    studentInfo65.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str74);
    campus52.setRestaurants((java.util.List<java.lang.String>)arraylist_str74);
    campus37.setRestaurants((java.util.List<java.lang.String>)arraylist_str74);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str74);
    university1.setName("400842b3-2dff-427a-8071-aed5b8bf12d2");
    com.example.unifood.models.University university83 = new com.example.unifood.models.University("hi!");
    boolean b85 = university83.removeCampus("hi!");
    java.lang.String str86 = university83.getId();
    university83.setName("603fd35b-ea62-491b-8376-4e5ebb75b266");
    java.util.List<java.lang.String> list_str89 = university83.getAllCampus();
    university1.setAllCampus(list_str89);
    university1.setName("0443a495-187d-4e8b-baa9-bb7cbdacbe5a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "be2f8b9f-25cf-4f53-a357-b0c6dfbf635e"+ "'", str2.equals("be2f8b9f-25cf-4f53-a357-b0c6dfbf635e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str49.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str64.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "ba10fe03-e26b-4cc7-875f-927926952249"+ "'", str86.equals("ba10fe03-e26b-4cc7-875f-927926952249"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str89);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("a339ea1e-a8f5-4f77-af1e-264cde0ed0dd");
    ownerInfo1.setRestaurantId("ae9d99df-d6ac-4c9c-ad52-41942487b2e1");

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }

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
    java.util.List<com.example.unifood.models.Product> list_product28 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "c8f20154-bc8e-44dd-a787-f0f93cf9ba2f"+ "'", str8.equals("c8f20154-bc8e-44dd-a787-f0f93cf9ba2f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "a8461dfa-66ee-4e53-90e0-69c5fdf70aea"+ "'", str16.equals("a8461dfa-66ee-4e53-90e0-69c5fdf70aea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f25 + "' != '" + 0.0f+ "'", f25.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product28);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    campus0.setName("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7");
    java.util.List<java.lang.String> list_str12 = campus0.getRestaurants();
    boolean b14 = campus0.removeRestaurant("32bef74e-15d2-4f2b-849c-199055557d88");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }

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
    restaurant9.updateRating();
    restaurant9.setName("8ec1486a-251e-4278-91f5-9dd8f1c6437b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    boolean b4 = campus0.addRestaurant("cee8ca5c-7aba-430f-8c09-de542ba28019");
    campus0.setName("7bd3d6e1-0d0b-4fa1-810d-a56167a32b50");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }

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
    com.example.unifood.models.Restaurant restaurant36 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant36.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str39 = restaurant36.getLocalization();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setRate((float)10L);
    review40.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant36.addReview(review40);
    boolean b46 = restaurant0.equals((java.lang.Object)review40);
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review52.setUserId("");
    java.lang.String str55 = review52.getUserId();
    review52.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review52.setRestaurantId("7c70ae26-387a-4111-9abd-ecf97bbc6324");
    java.lang.String str60 = review52.getComment();
    boolean b61 = restaurant0.removeReview(review52);
    java.lang.String str62 = restaurant0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "b3b1efef-328e-446a-9a64-457a57f34624"+ "'", str19.equals("b3b1efef-328e-446a-9a64-457a57f34624"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str39.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str60.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "937e4ecd-31ed-45c0-a9fa-d0a7327aea45"+ "'", str62.equals("937e4ecd-31ed-45c0-a9fa-d0a7327aea45"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delProductFromFavorites("090d4d8e-cace-44ee-8920-101722da86af");
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavRestaurants();
    com.example.unifood.models.Campus campus6 = new com.example.unifood.models.Campus();
    boolean b8 = campus6.removeRestaurant("hi!");
    java.lang.String str9 = campus6.getName();
    java.util.List<java.lang.String> list_str10 = campus6.getRestaurants();
    studentInfo1.setFavProducts(list_str10);
    com.example.unifood.models.University university13 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus14 = new com.example.unifood.models.Campus();
    boolean b16 = campus14.removeRestaurant("hi!");
    campus14.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str19 = campus14.getRestaurants();
    university13.setAllCampus(list_str19);
    java.util.List<java.lang.String> list_str21 = university13.getAllCampus();
    studentInfo1.setFavProducts(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("a9a6d832-db46-43f7-8078-9b0af2950add");
    ownerInfo1.setRestaurantId("e8b22fa1-7881-4182-9d65-16272db11fac");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("ca4b502a-9a21-4df2-bd49-a2c080bdabf3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e8b22fa1-7881-4182-9d65-16272db11fac"+ "'", str4.equals("e8b22fa1-7881-4182-9d65-16272db11fac"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "e8b22fa1-7881-4182-9d65-16272db11fac"+ "'", str5.equals("e8b22fa1-7881-4182-9d65-16272db11fac"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }

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
    product7.setCost((float)(short)10);
    float f15 = product7.getCost();
    boolean b16 = product7.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("119f287e-61c5-497a-b55c-17489bcb03e9");
    boolean b3 = university1.addCampus("com.example.unifood.exceptions.InvalidLastNameException");
    university1.setId("2130df33-a88c-4ccc-a737-697671ae9ccc");
    java.lang.String str6 = university1.getName();
    boolean b8 = university1.addCampus("d308f4d9-d3c5-4e74-aea6-2790f37f5faa");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "119f287e-61c5-497a-b55c-17489bcb03e9"+ "'", str6.equals("119f287e-61c5-497a-b55c-17489bcb03e9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product0.setCost((float)' ');
    float f5 = product0.getCost();
    product0.setId("36bd04c3-f456-4a88-8133-0659d5227a0f");
    product0.setName("bb5a5a09-75b7-41ea-bd0f-a685928b65a7");
    product0.setId("776a8b65-023a-4d25-9c5d-fe4a430062f1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 32.0f);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }

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
    java.util.List<com.example.unifood.models.Product> list_product17 = restaurant0.getProductList();
    java.lang.String str18 = restaurant0.getName();
    
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
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str18.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    university1.setId("f79ee0cc-de3f-4609-8494-f27553a1bb32");
    university1.setName("32c3ace9-70ce-4aa6-a292-45f6760c8cdc");
    university1.setName("b38cc914-cd4c-4f74-ba13-b1e6dd295cbc");

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }

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
    java.util.List<com.example.unifood.models.Review> list_review17 = restaurant3.getReviewList();
    
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
    org.junit.Assert.assertNotNull(list_review17);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }

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
    com.example.unifood.models.Campus campus17 = new com.example.unifood.models.Campus();
    boolean b19 = campus17.removeRestaurant("hi!");
    campus17.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str22 = campus17.getRestaurants();
    java.lang.String str23 = campus17.getId();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus25 = new com.example.unifood.models.Campus();
    boolean b27 = campus25.removeRestaurant("hi!");
    campus25.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str30 = campus25.getRestaurants();
    studentInfo24.setFavRestaurants(list_str30);
    boolean b33 = studentInfo24.addProductToFavorites("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    com.example.unifood.models.Campus campus34 = new com.example.unifood.models.Campus();
    boolean b36 = campus34.removeRestaurant("hi!");
    campus34.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str39 = campus34.getRestaurants();
    java.lang.String str40 = campus34.getId();
    java.lang.String str41 = campus34.getName();
    java.lang.String str42 = campus34.getId();
    java.lang.String str43 = campus34.getId();
    campus34.setId("");
    boolean b47 = campus34.removeRestaurant("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    com.example.unifood.models.StudentInfo studentInfo49 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str50 = studentInfo49.getFavRestaurants();
    campus34.setRestaurants(list_str50);
    studentInfo24.setFavRestaurants(list_str50);
    com.example.unifood.models.StudentInfo studentInfo53 = new com.example.unifood.models.StudentInfo();
    studentInfo53.setCampusId("");
    java.lang.String[] str_array61 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str62 = new java.util.ArrayList<java.lang.String>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str62, str_array61);
    studentInfo53.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str62);
    studentInfo24.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str62);
    campus17.setRestaurants((java.util.List<java.lang.String>)arraylist_str62);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str62);
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "70dcc894-a734-4335-950c-61257c6553b0"+ "'", str14.equals("70dcc894-a734-4335-950c-61257c6553b0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "c0142f56-520c-4f15-aacc-f5d19e1900aa"+ "'", str23.equals("c0142f56-520c-4f15-aacc-f5d19e1900aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "9ea2fe50-92dc-4ea1-91ff-4d2bca239d9f"+ "'", str40.equals("9ea2fe50-92dc-4ea1-91ff-4d2bca239d9f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str41.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "9ea2fe50-92dc-4ea1-91ff-4d2bca239d9f"+ "'", str42.equals("9ea2fe50-92dc-4ea1-91ff-4d2bca239d9f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "9ea2fe50-92dc-4ea1-91ff-4d2bca239d9f"+ "'", str43.equals("9ea2fe50-92dc-4ea1-91ff-4d2bca239d9f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.lang.String[] str_array31 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str32);
    university1.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str37 = university1.getId();
    java.lang.String str38 = university1.getId();
    boolean b40 = university1.addCampus("6528c820-2c6e-4424-adc3-c18b8e14e2b6");
    boolean b42 = university1.removeCampus("db34ddd0-ad9d-429f-aa95-bb67ba5a21f5");
    boolean b44 = university1.removeCampus("4a1faca8-27ea-4dd8-9833-9159f8937bd9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "122dc974-a996-4d86-90f9-d52f8cc8c971"+ "'", str2.equals("122dc974-a996-4d86-90f9-d52f8cc8c971"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str37.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str38.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    review0.setDate("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    java.lang.String str10 = review0.getId();
    java.lang.String str11 = review0.getDate();
    java.lang.String str12 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "7fb4b671-eeeb-4d73-8c40-91baed7167c3"+ "'", str10.equals("7fb4b671-eeeb-4d73-8c40-91baed7167c3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "7f818b3b-685e-4e69-b63b-ce4aa57b16f0"+ "'", str11.equals("7f818b3b-685e-4e69-b63b-ce4aa57b16f0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "7f818b3b-685e-4e69-b63b-ce4aa57b16f0"+ "'", str12.equals("7f818b3b-685e-4e69-b63b-ce4aa57b16f0"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }

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
    com.example.unifood.models.Product product33 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str34 = product33.getDescription();
    float f35 = product33.getCost();
    java.lang.String str36 = product33.getName();
    java.lang.String str37 = product33.getDescription();
    product33.setCost(1.0f);
    product33.setDescription("3d66afd0-187c-4e3d-a8a4-73cae28b645a");
    boolean b42 = restaurant3.equals((java.lang.Object)product33);
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "12/03/2017"+ "'", str34.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "e8588626-52d3-4ed2-8bd5-24c0755bae64"+ "'", str36.equals("e8588626-52d3-4ed2-8bd5-24c0755bae64"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "12/03/2017"+ "'", str37.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    java.lang.String str31 = campus0.getId();
    boolean b33 = campus0.removeRestaurant("10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str34 = campus0.getName();
    java.lang.String str35 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "a9ca524c-b0fd-422f-913c-890054f8331d"+ "'", str31.equals("a9ca524c-b0fd-422f-913c-890054f8331d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    studentInfo2.setCampusId("");
    java.util.List<java.lang.String> list_str5 = studentInfo2.getFavRestaurants();
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavRestaurants();
    java.util.List<java.lang.String> list_str7 = studentInfo2.getFavProducts();
    com.example.unifood.models.University university9 = new com.example.unifood.models.University("hi!");
    java.lang.String str10 = university9.getId();
    java.lang.String[] str_array39 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    university9.setAllCampus((java.util.List<java.lang.String>)arraylist_str40);
    university9.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    com.example.unifood.models.Campus campus45 = new com.example.unifood.models.Campus();
    boolean b47 = campus45.removeRestaurant("hi!");
    campus45.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str50 = campus45.getRestaurants();
    boolean b52 = campus45.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b54 = campus45.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b56 = campus45.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str57 = campus45.getName();
    boolean b59 = campus45.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.Campus campus60 = new com.example.unifood.models.Campus();
    boolean b62 = campus60.removeRestaurant("hi!");
    campus60.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str65 = campus60.getRestaurants();
    boolean b67 = campus60.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b69 = campus60.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b71 = campus60.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str72 = campus60.getName();
    com.example.unifood.models.StudentInfo studentInfo73 = new com.example.unifood.models.StudentInfo();
    studentInfo73.setCampusId("");
    java.lang.String[] str_array81 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str82 = new java.util.ArrayList<java.lang.String>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str82, str_array81);
    studentInfo73.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str82);
    campus60.setRestaurants((java.util.List<java.lang.String>)arraylist_str82);
    campus45.setRestaurants((java.util.List<java.lang.String>)arraylist_str82);
    university9.setAllCampus((java.util.List<java.lang.String>)arraylist_str82);
    studentInfo2.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str82);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str82);
    boolean b91 = studentInfo0.delProductFromFavorites("abd293bf-2239-4c98-b7ba-ff7036c5aa21");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "db8569b8-c048-4c0c-bf6a-8d090f3d19e7"+ "'", str10.equals("db8569b8-c048-4c0c-bf6a-8d090f3d19e7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str57.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str72.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("hi!");
    java.lang.String str6 = university5.getId();
    boolean b8 = university5.addCampus("hi!");
    java.lang.String str9 = university5.getId();
    university5.setName("12/03/2017");
    java.util.List<java.lang.String> list_str12 = university5.getAllCampus();
    university1.setAllCampus(list_str12);
    java.util.List<java.lang.String> list_str14 = university1.getAllCampus();
    university1.setName("4955c2e9-d977-4504-8611-581feb3ea4ca");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavRestaurants();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavRestaurants();
    java.util.List<java.lang.String> list_str20 = studentInfo17.getFavProducts();
    university1.setAllCampus(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1983ff6a-fa30-40b2-aa4d-f38e2a6482af"+ "'", str6.equals("1983ff6a-fa30-40b2-aa4d-f38e2a6482af"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1983ff6a-fa30-40b2-aa4d-f38e2a6482af"+ "'", str9.equals("1983ff6a-fa30-40b2-aa4d-f38e2a6482af"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    product1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product1.setAvailability(true);
    java.lang.String str8 = product1.getId();
    boolean b9 = product1.getAvailability();
    java.lang.String str10 = product1.getId();
    product1.setDescription("55c3dc76-1c53-42c8-8417-e008f8923ff9");
    java.lang.String str13 = product1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str10.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str13.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }

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
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    java.lang.String str19 = review18.getDate();
    float f20 = review18.getRate();
    review18.setComment("edf01dd6-a35a-426f-808e-d6346b5af74f");
    review18.setRate((float)(short)0);
    boolean b25 = restaurant0.removeReview(review18);
    
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
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getUserId();
    java.lang.String str9 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    studentInfo0.setCampusId("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    java.lang.String str11 = studentInfo0.getCampusId();
    boolean b13 = studentInfo0.addProductToFavorites("67a826d0-ad9d-49db-8997-58baff1011a9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "6c2f90b1-d9b0-400d-8b43-0893724d6fd6"+ "'", str11.equals("6c2f90b1-d9b0-400d-8b43-0893724d6fd6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getId();
    review0.setUserId("fde75b42-0c98-4497-90a3-eaf498e34ad2");
    float f10 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }

    com.example.unifood.exceptions.InvalidCampusException invalidCampusException0 = new com.example.unifood.exceptions.InvalidCampusException();
    java.lang.String str1 = invalidCampusException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.InvalidCampusException"+ "'", str1.equals("com.example.unifood.exceptions.InvalidCampusException"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d4347eb6-192e-4976-b563-60f0e7c43424", "14564b45-b104-409a-ae4d-8bf9aa3d8148", "89afd63c-d576-4913-8a77-be38651f287f");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setType("38ecb376-2fb2-4cf7-a955-c6972cf234c2");
    java.lang.String str7 = userInfo3.getType();
    userInfo3.setType("12/03/2017");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "14564b45-b104-409a-ae4d-8bf9aa3d8148"+ "'", str4.equals("14564b45-b104-409a-ae4d-8bf9aa3d8148"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "38ecb376-2fb2-4cf7-a955-c6972cf234c2"+ "'", str7.equals("38ecb376-2fb2-4cf7-a955-c6972cf234c2"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("b8e49135-96cf-4501-bebc-4b42fdc40049");
    java.lang.String str2 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "b8e49135-96cf-4501-bebc-4b42fdc40049"+ "'", str2.equals("b8e49135-96cf-4501-bebc-4b42fdc40049"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getLocalization();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setLocalization("");
    restaurant3.setId("a7dabb6b-5097-4ecc-a832-8624bb019f5f");
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant15.setName("12/03/2017");
    java.lang.String str18 = restaurant15.getUserId();
    restaurant15.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product();
    boolean b23 = product22.getAvailability();
    restaurant21.addProduct(product22);
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant21.getProductList();
    restaurant21.setUserId("hi!");
    restaurant21.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product30 = restaurant21.getProductList();
    restaurant15.setProductList(list_product30);
    com.example.unifood.models.Product product32 = new com.example.unifood.models.Product();
    product32.setDescription("hi!");
    java.lang.String str35 = product32.getDescription();
    product32.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str38 = product32.getDescription();
    product32.setAvailability(false);
    restaurant15.addProduct(product32);
    boolean b42 = restaurant3.removeProduct(product32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str6.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str7.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b3 = studentInfo1.addRestaurantToFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    java.util.List<java.lang.String> list_str4 = studentInfo1.getFavProducts();
    com.example.unifood.models.University university6 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university6.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b10 = university6.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.util.List<java.lang.String> list_str11 = university6.getAllCampus();
    java.util.List<java.lang.String> list_str12 = university6.getAllCampus();
    studentInfo1.setFavRestaurants(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("4d431463-d30c-4853-b489-be677a0772e7");

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str5 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2b01de0e-3ab0-4623-8428-796ac88d3f59"+ "'", str5.equals("2b01de0e-3ab0-4623-8428-796ac88d3f59"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }

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
    float f15 = product8.getCost();
    
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
    org.junit.Assert.assertTrue(f15 == 0.0f);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("f0ed2a63-d4f0-4994-9b63-599b9810abac", (float)'a', "f8687f79-7e47-411f-9d21-f93d7cac84e6");
    product3.setDescription("67ced924-3a38-44dc-bbbf-16528fa7ad7f");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("345574a0-718c-46f3-b7cb-e07b99e285db");
    boolean b3 = campus1.removeRestaurant("c2de9d2a-a172-48fb-8118-02d199633843");
    campus1.setId("9cdd2e52-afda-4b95-b234-1826e5ddfbbf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }

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
    java.lang.String str12 = review9.getId();
    float f13 = review9.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0285c12e-c98c-4611-ae67-b5fe4889e5e7"+ "'", str10.equals("0285c12e-c98c-4611-ae67-b5fe4889e5e7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0285c12e-c98c-4611-ae67-b5fe4889e5e7"+ "'", str12.equals("0285c12e-c98c-4611-ae67-b5fe4889e5e7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.0f);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setCampusId("240f8c33-472b-47f7-9c46-778e3e93a08b");
    java.lang.String str6 = restaurant3.getCampusId();
    restaurant3.setApproved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "240f8c33-472b-47f7-9c46-778e3e93a08b"+ "'", str6.equals("240f8c33-472b-47f7-9c46-778e3e93a08b"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    java.lang.String[] str_array69 = new java.lang.String[] { "cde62678-4a38-48f3-8486-51d54fb5e8c8", "016f7a51-1523-4248-8cce-d7af4447fbc2", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "9cef684b-9583-4350-bc7f-52fdf83f721b", "b9a35319-fcc8-40c8-9a6c-cc193698fa7e", "2016930c-728d-45c5-a236-9c4833a30246", "2b840dda-3718-464e-a39f-2e9719d2b246", "8ce830fe-1366-4bd5-a822-511d9d102587", "8ce830fe-1366-4bd5-a822-511d9d102587", "c1d3b8a3-adce-431f-a302-6cd30c1e553d", "com.example.unifood.exceptions.UserException", "com.example.unifood.exceptions.InvalidRestaurantNameException", "5a768843-8dc8-45b5-baf6-85706b277c5f", "1cc346cd-7e37-4aa5-a18f-4211b5a529c9", "3db35cfa-ac0a-4288-9084-8d042e570026", "322c0567-95f6-47cd-bed2-9cdd49776e37", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "c0679c38-8adf-4203-85c8-515aaf773e20", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "9741db0d-f106-4ae0-9562-dbd17d50d5a3", "811f8a1d-ca60-461d-828c-6680d7547043", "322c0567-95f6-47cd-bed2-9cdd49776e37", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c", "e38e11da-1219-443d-93b7-8c6ea82bea05", "f6ca0495-0d1d-4653-b4e4-20d665aafe5f", "c81d3daf-7c34-4870-802e-061eeb5c81e5", "efbb39b8-b569-44a5-8350-5d34ec9574db", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "15149c67-efc5-4744-85b0-8dc2ac121df7", "49976e80-f69f-4380-aa76-dc904dcb2eca", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "49b07ce6-aac6-463b-a3cc-21e21430bc86", "53d5e04e-abb5-45a7-a278-d742367421a0", "9d54bba1-c011-40fe-a86a-2b02e99ae523", "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8", "09c560d8-ad4a-4efc-a7b7-3894259139d4", "", "d054f793-8da1-4b53-9056-26346d97b155", "49976e80-f69f-4380-aa76-dc904dcb2eca", "f71e4521-c797-403b-bb13-9b84cfa3a1f7", "090d4d8e-cace-44ee-8920-101722da86af", "9e087ae8-80e1-4932-9bf9-0925df2c9f7e", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "a04223f0-b1c0-449c-afab-59a81cef4343", "e2c7a34a-8060-4430-9d69-dd5848b101c6", "7b379d86-fcc6-43c8-a85d-c887cc492e73", "15149c67-efc5-4744-85b0-8dc2ac121df7", "a339ea1e-a8f5-4f77-af1e-264cde0ed0dd", "7fb4b671-eeeb-4d73-8c40-91baed7167c3", "016f7a51-1523-4248-8cce-d7af4447fbc2", "8e6dda6d-66e5-4521-8634-e164e3b1c34c", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "8ce830fe-1366-4bd5-a822-511d9d102587" };
    java.util.ArrayList<java.lang.String> arraylist_str70 = new java.util.ArrayList<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str70, str_array69);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str70);
    boolean b74 = studentInfo0.delProductFromFavorites("4f54b634-288e-42c6-b781-2869535b5bb5");
    java.util.List<java.lang.String> list_str75 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str75);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getRestaurantId();
    float f7 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0ee126de-6bfd-46d3-87b5-6f4b30368f4d"+ "'", str2.equals("0ee126de-6bfd-46d3-87b5-6f4b30368f4d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setType("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b");
    userInfo3.setFirstName("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    userInfo3.setLastName("376f29dd-77f2-4b44-8c95-b9ac348c4e6f");
    java.lang.String str10 = userInfo3.getFirstName();
    userInfo3.setLastName("aec09828-c4ad-4c50-a4e5-5ccef4d0f485");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1fcc4f0c-26bc-4946-bf17-5d8a16792f98"+ "'", str10.equals("1fcc4f0c-26bc-4946-bf17-5d8a16792f98"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b3 = university1.addCampus("aabd70ed-be9f-4452-9625-3f6b64c27121");
    boolean b5 = university1.addCampus("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    boolean b8 = studentInfo6.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b10 = studentInfo6.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo6.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    java.util.List<java.lang.String> list_str13 = studentInfo6.getFavProducts();
    university1.setAllCampus(list_str13);
    university1.setId("e0ed697c-d17d-4982-81ea-097a494113d9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setShortDescription("bdf95a57-5b98-4b3c-a89e-8a8d8377d616");
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant17.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str20 = restaurant17.getShortDescription();
    boolean b22 = restaurant17.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant17.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant28.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str31 = restaurant28.getShortDescription();
    com.example.unifood.models.Review review32 = new com.example.unifood.models.Review();
    java.lang.String str33 = review32.getDate();
    java.lang.String str34 = review32.getComment();
    com.example.unifood.models.Review review35 = new com.example.unifood.models.Review();
    review35.setId("");
    java.lang.String str38 = review35.getUserId();
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    review39.setRate((float)10L);
    com.example.unifood.models.Review review42 = new com.example.unifood.models.Review();
    review42.setId("");
    java.lang.String str45 = review42.getUserId();
    java.lang.String str46 = review42.getRestaurantId();
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review55.setUserId("");
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review();
    java.lang.String str59 = review58.getDate();
    java.lang.String str60 = review58.getComment();
    com.example.unifood.models.Review review61 = new com.example.unifood.models.Review();
    review61.setId("");
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review();
    review64.setId("");
    java.lang.String str67 = review64.getUserId();
    java.lang.String str68 = review64.getRestaurantId();
    java.lang.String str69 = review64.getDate();
    com.example.unifood.models.Review review70 = new com.example.unifood.models.Review();
    java.lang.String str71 = review70.getId();
    com.example.unifood.models.Review review77 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review77.setUserId("");
    com.example.unifood.models.Review review80 = new com.example.unifood.models.Review();
    review80.setId("");
    com.example.unifood.models.Review[] review_array83 = new com.example.unifood.models.Review[] { review32, review35, review39, review42, review47, review55, review58, review61, review64, review70, review77, review80 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review84 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review84, review_array83);
    restaurant28.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review84);
    java.util.List<com.example.unifood.models.Product> list_product87 = restaurant28.getProductList();
    restaurant17.setProductList(list_product87);
    com.example.unifood.models.Restaurant restaurant89 = new com.example.unifood.models.Restaurant();
    java.lang.String str90 = restaurant89.getUserId();
    restaurant89.updateRating();
    restaurant17.update(restaurant89);
    boolean b93 = restaurant3.equals((java.lang.Object)restaurant17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "952d15b9-67fd-43f1-8aaa-16dafd6e08a2"+ "'", str71.equals("952d15b9-67fd-43f1-8aaa-16dafd6e08a2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + ""+ "'", str90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("ba061308-092f-40b1-9a8e-465a56f359d0");
    ownerInfo0.setRestaurantId("46968e03-114d-4a8c-aa28-11a47b6f8199");
    ownerInfo0.setRestaurantId("8e069f68-c995-4d5a-9117-23fad524d3d9");
    ownerInfo0.setRestaurantId("0443a495-187d-4e8b-baa9-bb7cbdacbe5a");

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    boolean b32 = campus0.removeRestaurant("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str33 = campus0.getRestaurants();
    com.example.unifood.models.University university35 = new com.example.unifood.models.University("12/03/2017");
    boolean b37 = university35.addCampus("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str38 = university35.getName();
    java.util.List<java.lang.String> list_str39 = university35.getAllCampus();
    campus0.setRestaurants(list_str39);
    campus0.setName("16c89e8f-dcdc-4632-8a9b-1653843567f5");
    campus0.setId("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    boolean b46 = campus0.removeRestaurant("aeb958ff-1a16-459f-b4e4-488646d17711");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "12/03/2017"+ "'", str38.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("hi!");
    java.lang.String str6 = university5.getId();
    boolean b8 = university5.addCampus("hi!");
    java.lang.String str9 = university5.getId();
    university5.setName("12/03/2017");
    java.util.List<java.lang.String> list_str12 = university5.getAllCampus();
    university1.setAllCampus(list_str12);
    java.util.List<java.lang.String> list_str14 = university1.getAllCampus();
    university1.setName("4955c2e9-d977-4504-8611-581feb3ea4ca");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    studentInfo17.setCampusId("");
    java.util.List<java.lang.String> list_str20 = studentInfo17.getFavRestaurants();
    boolean b22 = studentInfo17.delProductFromFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    com.example.unifood.models.University university24 = new com.example.unifood.models.University("hi!");
    boolean b26 = university24.removeCampus("hi!");
    university24.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str29 = university24.getName();
    boolean b31 = university24.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university33 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus34 = new com.example.unifood.models.Campus();
    boolean b36 = campus34.removeRestaurant("hi!");
    campus34.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str39 = campus34.getRestaurants();
    university33.setAllCampus(list_str39);
    java.util.List<java.lang.String> list_str41 = university33.getAllCampus();
    university24.setAllCampus(list_str41);
    studentInfo17.setFavRestaurants(list_str41);
    java.util.List<java.lang.String> list_str44 = studentInfo17.getFavProducts();
    university1.setAllCampus(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "a2efd129-8298-4b4b-b228-479c01d4375c"+ "'", str6.equals("a2efd129-8298-4b4b-b228-479c01d4375c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a2efd129-8298-4b4b-b228-479c01d4375c"+ "'", str9.equals("a2efd129-8298-4b4b-b228-479c01d4375c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("850c66ab-1149-4a36-b911-3dc319169391");
    restaurant0.setApproved(false);
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    restaurant11.addProduct(product12);
    java.lang.String str15 = restaurant11.getId();
    restaurant11.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant11.setLocalization("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    restaurant11.setLocalization("f666c841-c560-4874-8cbd-008c848d1f42");
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    java.lang.String str25 = review22.getUserId();
    review22.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    review22.setRestaurantId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    boolean b30 = restaurant11.removeReview(review22);
    boolean b31 = restaurant0.equals((java.lang.Object)restaurant11);
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant35.setName("12/03/2017");
    java.lang.String str38 = restaurant35.getUserId();
    restaurant35.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    review41.setId("");
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    java.lang.String str45 = review44.getDate();
    java.lang.String str46 = review44.getComment();
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    java.lang.String str50 = review47.getUserId();
    java.lang.String str51 = review47.getRestaurantId();
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review();
    java.lang.String str53 = review52.getDate();
    java.lang.String str54 = review52.getComment();
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    java.lang.String str56 = review55.getDate();
    com.example.unifood.models.Review review57 = new com.example.unifood.models.Review();
    java.lang.String str58 = review57.getId();
    com.example.unifood.models.Restaurant restaurant59 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product60 = new com.example.unifood.models.Product();
    boolean b61 = product60.getAvailability();
    restaurant59.addProduct(product60);
    java.util.List<com.example.unifood.models.Product> list_product63 = restaurant59.getProductList();
    restaurant59.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    java.lang.String str67 = review66.getId();
    boolean b68 = restaurant59.removeReview(review66);
    com.example.unifood.models.Review review69 = new com.example.unifood.models.Review();
    java.lang.String str70 = review69.getDate();
    java.lang.String str71 = review69.getComment();
    com.example.unifood.models.Review review72 = new com.example.unifood.models.Review();
    review72.setRate((float)10L);
    review72.setDate("hi!");
    com.example.unifood.models.Review review82 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review82.setUserId("");
    com.example.unifood.models.Review[] review_array85 = new com.example.unifood.models.Review[] { review41, review44, review47, review52, review55, review57, review66, review69, review72, review82 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review86 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b87 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review86, review_array85);
    restaurant35.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review86);
    restaurant11.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "df08df98-14ec-42ca-8358-d6c255ab896d"+ "'", str4.equals("df08df98-14ec-42ca-8358-d6c255ab896d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "d4be1bfc-fe40-4511-bb37-58b0a38742e0"+ "'", str15.equals("d4be1bfc-fe40-4511-bb37-58b0a38742e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "1d8af0ed-35c4-41b0-89cd-a515321d69b2"+ "'", str58.equals("1d8af0ed-35c4-41b0-89cd-a515321d69b2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "3ecbe7b5-48b1-4d6d-83f1-38a7caeaf13d"+ "'", str67.equals("3ecbe7b5-48b1-4d6d-83f1-38a7caeaf13d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    restaurant3.setLocalization("9cef684b-9583-4350-bc7f-52fdf83f721b");
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    java.lang.String str21 = restaurant17.getId();
    restaurant17.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant17.setUserId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    restaurant17.setLocalization("6e4d5f35-2bd8-4993-95fe-642f53be3698");
    restaurant3.update(restaurant17);
    restaurant3.setCampusId("9e07b376-c51f-4d86-97b2-e0560ef5c7b1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "5fc4c084-2fbe-4236-be8f-7c371bb8a21d"+ "'", str21.equals("5fc4c084-2fbe-4236-be8f-7c371bb8a21d"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    boolean b32 = campus0.removeRestaurant("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str33 = campus0.getRestaurants();
    boolean b35 = campus0.addRestaurant("d949a2b6-65c6-4e1a-a9c4-f5bf3008a93b");
    java.lang.String str36 = campus0.getId();
    campus0.setId("7bd3d6e1-0d0b-4fa1-810d-a56167a32b50");
    boolean b40 = campus0.addRestaurant("3f1d8f40-44f8-458b-a784-7c1c32ce69d6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "cb01bf71-106f-427e-8fa4-7de48d338f35"+ "'", str36.equals("cb01bf71-106f-427e-8fa4-7de48d338f35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    java.lang.String str9 = university1.getId();
    boolean b11 = university1.removeCampus("db46732b-0a96-4e8f-8925-8a39282eefd1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "66fcaee3-4949-405d-af92-2c6e8e1e4007"+ "'", str2.equals("66fcaee3-4949-405d-af92-2c6e8e1e4007"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "66fcaee3-4949-405d-af92-2c6e8e1e4007"+ "'", str5.equals("66fcaee3-4949-405d-af92-2c6e8e1e4007"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str9.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }

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
    restaurant3.setCampusId("aabd70ed-be9f-4452-9625-3f6b64c27121");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus18 = new com.example.unifood.models.Campus();
    boolean b20 = campus18.removeRestaurant("hi!");
    campus18.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str23 = campus18.getRestaurants();
    studentInfo17.setFavRestaurants(list_str23);
    boolean b26 = studentInfo17.addProductToFavorites("6a0bf029-96df-4667-a4bd-28fd39bbbaa2");
    com.example.unifood.models.Campus campus27 = new com.example.unifood.models.Campus();
    boolean b29 = campus27.removeRestaurant("hi!");
    campus27.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str32 = campus27.getRestaurants();
    java.lang.String str33 = campus27.getId();
    java.lang.String str34 = campus27.getName();
    java.lang.String str35 = campus27.getId();
    java.lang.String str36 = campus27.getId();
    campus27.setId("");
    boolean b40 = campus27.removeRestaurant("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    com.example.unifood.models.StudentInfo studentInfo42 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str43 = studentInfo42.getFavRestaurants();
    campus27.setRestaurants(list_str43);
    studentInfo17.setFavRestaurants(list_str43);
    boolean b46 = restaurant3.equals((java.lang.Object)studentInfo17);
    restaurant3.setApproved(false);
    restaurant3.setName("56a1e8aa-3e9e-4dd9-bb2d-380efc35a0fd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "19bdae72-99d2-4ca4-a194-281325cbc1dd"+ "'", str33.equals("19bdae72-99d2-4ca4-a194-281325cbc1dd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str34.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "19bdae72-99d2-4ca4-a194-281325cbc1dd"+ "'", str35.equals("19bdae72-99d2-4ca4-a194-281325cbc1dd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "19bdae72-99d2-4ca4-a194-281325cbc1dd"+ "'", str36.equals("19bdae72-99d2-4ca4-a194-281325cbc1dd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    product0.setName("43590002-ff0f-4cc9-8729-316ebc4fb5e8");
    product0.setId("8664e462-8683-4210-8fa3-b99e2a278578");
    java.lang.String str10 = product0.getDescription();
    product0.setName("5ded886a-3fa7-4a68-be6f-6c24c22c35f3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }

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
    restaurant0.setName("9e07b376-c51f-4d86-97b2-e0560ef5c7b1");
    com.example.unifood.models.Review review14 = null;
    boolean b15 = restaurant0.removeReview(review14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }

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
    review20.setRestaurantId("d255af9a-b76d-43de-9ac7-c782a9a20824");
    java.lang.String str28 = review20.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "40ca69c9-5c86-4daa-a0e7-a14320e13e90"+ "'", str5.equals("40ca69c9-5c86-4daa-a0e7-a14320e13e90"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "5994525d-2e76-4607-ac21-7088e970a413"+ "'", str21.equals("5994525d-2e76-4607-ac21-7088e970a413"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "5994525d-2e76-4607-ac21-7088e970a413"+ "'", str28.equals("5994525d-2e76-4607-ac21-7088e970a413"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("32bef74e-15d2-4f2b-849c-199055557d88");
    com.example.unifood.models.University university3 = new com.example.unifood.models.University("hi!");
    boolean b5 = university3.removeCampus("hi!");
    university3.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str8 = university3.getName();
    boolean b10 = university3.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university12 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus13 = new com.example.unifood.models.Campus();
    boolean b15 = campus13.removeRestaurant("hi!");
    campus13.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str18 = campus13.getRestaurants();
    university12.setAllCampus(list_str18);
    java.util.List<java.lang.String> list_str20 = university12.getAllCampus();
    university3.setAllCampus(list_str20);
    java.util.List<java.lang.String> list_str22 = university3.getAllCampus();
    java.util.List<java.lang.String> list_str23 = university3.getAllCampus();
    campus1.setRestaurants(list_str23);
    boolean b26 = campus1.addRestaurant("9a81ac96-6f4a-4739-b4e5-6599ede7eb2f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f6 = review0.getRate();
    review0.setDate("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    java.lang.String str9 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("c2649bc6-1c9a-48fb-80e3-b2094d704e09", (float)(short)1, "f7d0a803-e524-44d4-af40-1b3785b0c6a0");
    java.lang.String str4 = product3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "47323ae2-5b0d-4a0f-8cc7-2666da91e414"+ "'", str4.equals("47323ae2-5b0d-4a0f-8cc7-2666da91e414"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    campus0.setName("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }

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
    java.lang.String str16 = restaurant0.getShortDescription();
    java.util.List<com.example.unifood.models.Review> list_review17 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "2b4a092c-7fd6-4da1-aad3-c371931860b6"+ "'", str16.equals("2b4a092c-7fd6-4da1-aad3-c371931860b6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review17);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }

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
    restaurant0.setShortDescription("b236d749-e754-4a17-9ce6-9ddadcddb0d1");
    java.lang.Float f19 = restaurant0.getRate();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f19 + "' != '" + 0.0f+ "'", f19.equals(0.0f));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }

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
    java.util.List<java.lang.String> list_str41 = studentInfo0.getFavProducts();
    
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
    org.junit.Assert.assertNotNull(list_str41);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getComment();
    review0.setRate((float)' ');
    java.lang.String str5 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.lang.String str6 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b11 = restaurant10.getApproved();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b16 = product15.getAvailability();
    product15.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str19 = product15.getId();
    restaurant10.addProduct(product15);
    java.util.List<com.example.unifood.models.Product> list_product21 = restaurant10.getProductList();
    restaurant3.setProductList(list_product21);
    restaurant3.setLocalization("0229ea27-a568-4fbb-b746-44d3922125ef");
    boolean b25 = restaurant3.getApproved();
    java.lang.String str26 = restaurant3.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "fc477c18-8262-487d-9324-164e096dc5e0"+ "'", str5.equals("fc477c18-8262-487d-9324-164e096dc5e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "fc477c18-8262-487d-9324-164e096dc5e0"+ "'", str6.equals("fc477c18-8262-487d-9324-164e096dc5e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str19.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("9befae08-3641-4d76-a03a-fd4046ab0bc7");

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    review0.setDate("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    review0.setComment("9c79c876-a93d-4813-92df-b21535c292d5");
    java.lang.String str12 = review0.getComment();
    review0.setRate(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "9c79c876-a93d-4813-92df-b21535c292d5"+ "'", str12.equals("9c79c876-a93d-4813-92df-b21535c292d5"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    review9.setRate((float)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0fd9fd73-8bfd-4c0b-b415-552e04f71366"+ "'", str10.equals("0fd9fd73-8bfd-4c0b-b415-552e04f71366"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    java.util.List<java.lang.String> list_str12 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b16 = studentInfo14.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b18 = studentInfo14.delProductFromFavorites("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str21 = studentInfo20.getFavProducts();
    studentInfo14.setFavRestaurants(list_str21);
    com.example.unifood.models.Campus campus23 = new com.example.unifood.models.Campus();
    boolean b25 = campus23.removeRestaurant("hi!");
    campus23.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str28 = campus23.getRestaurants();
    boolean b30 = campus23.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b32 = campus23.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b34 = campus23.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str35 = campus23.getName();
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo();
    studentInfo36.setCampusId("");
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<java.lang.String>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str45, str_array44);
    studentInfo36.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str45);
    campus23.setRestaurants((java.util.List<java.lang.String>)arraylist_str45);
    studentInfo14.setFavProducts((java.util.List<java.lang.String>)arraylist_str45);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str45);
    boolean b52 = studentInfo0.delProductFromFavorites("e63d7363-6f36-4d98-95bd-56010e2f6395");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str35.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    java.lang.String str8 = campus2.getId();
    java.lang.String str9 = campus2.getName();
    campus2.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str12 = campus2.getRestaurants();
    java.lang.String str13 = campus2.getId();
    campus2.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    campus2.setId("21f78864-e8dd-4121-b0b0-bfd25d33cefa");
    java.util.List<java.lang.String> list_str18 = campus2.getRestaurants();
    campus1.setRestaurants(list_str18);
    boolean b21 = campus1.removeRestaurant("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "de3c5036-1d45-4980-b460-95ff00e4a5e8"+ "'", str8.equals("de3c5036-1d45-4980-b460-95ff00e4a5e8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str13.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.Float f10 = restaurant0.getRate();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    restaurant11.addProduct(product12);
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant11.getProductList();
    restaurant11.setUserId("hi!");
    restaurant11.setName("12/03/2017");
    java.lang.String str20 = restaurant11.getCampusId();
    java.lang.String str21 = restaurant11.getUserId();
    com.example.unifood.models.Product product25 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f26 = product25.getCost();
    java.lang.String str27 = product25.getDescription();
    restaurant11.addProduct(product25);
    boolean b29 = restaurant0.removeProduct(product25);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    restaurant30.setShortDescription("");
    restaurant30.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant30.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant40 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product41 = new com.example.unifood.models.Product();
    boolean b42 = product41.getAvailability();
    restaurant40.addProduct(product41);
    java.util.List<com.example.unifood.models.Product> list_product44 = restaurant40.getProductList();
    restaurant30.setProductList(list_product44);
    java.util.List<com.example.unifood.models.Review> list_review46 = restaurant30.getReviewList();
    restaurant0.setReviewList(list_review46);
    restaurant0.setId("be1e9425-c054-454e-82a2-1bac873f736d");
    java.lang.String str50 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f10 + "' != '" + 0.0f+ "'", f10.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "12/03/2017"+ "'", str27.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setCampusId("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    java.lang.String str7 = restaurant0.getId();
    restaurant0.setName("8b4d5af0-75fb-4cb7-884a-360dc3c017f3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "684723e7-4299-4585-9d31-63c2ba22c787"+ "'", str4.equals("684723e7-4299-4585-9d31-63c2ba22c787"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "684723e7-4299-4585-9d31-63c2ba22c787"+ "'", str7.equals("684723e7-4299-4585-9d31-63c2ba22c787"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }

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
    restaurant0.setCampusId("4b8774a9-30e8-4a88-9079-cd9994eaa8ec");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "91d4b015-8c6f-4244-859b-41ab33d0fb2c"+ "'", str19.equals("91d4b015-8c6f-4244-859b-41ab33d0fb2c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String str3 = campus0.getName();
    java.util.List<java.lang.String> list_str4 = campus0.getRestaurants();
    boolean b6 = campus0.removeRestaurant("17604120-3f03-41bc-ac7a-f4e923901ad5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }

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
    java.util.List<com.example.unifood.models.Review> list_review15 = restaurant0.getReviewList();
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
    restaurant0.setProductList(list_product92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review15);
    
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
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "6ecee84c-c0fb-4e19-89a5-e7f287658572"+ "'", str76.equals("6ecee84c-c0fb-4e19-89a5-e7f287658572"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product92);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    review5.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    review5.setDate("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.String str12 = review5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "213ac244-cb16-4b5b-ad2b-4f83203a4712"+ "'", str12.equals("213ac244-cb16-4b5b-ad2b-4f83203a4712"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }

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
    java.lang.String str30 = restaurant3.getLocalization();
    restaurant3.setUserId("8c73065c-fec4-4912-8b5c-0dfafc1da79a");
    
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
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str30.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }

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
    product10.setDescription("3eb01d1b-8df4-4077-9221-8c1b6b20a4fb");
    float f18 = product10.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "29fb912e-a1d6-4191-9efc-3fc739122a89"+ "'", str4.equals("29fb912e-a1d6-4191-9efc-3fc739122a89"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "32b7868a-6f83-4db0-b95f-6f1ac8dbf38c"+ "'", str12.equals("32b7868a-6f83-4db0-b95f-6f1ac8dbf38c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "32b7868a-6f83-4db0-b95f-6f1ac8dbf38c"+ "'", str14.equals("32b7868a-6f83-4db0-b95f-6f1ac8dbf38c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 10.0f);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }

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
    restaurant8.setApproved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "99e80b05-13e2-495e-805a-d96c526c8554"+ "'", str10.equals("99e80b05-13e2-495e-805a-d96c526c8554"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str12.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.updateRating();
    java.lang.String str6 = restaurant0.getShortDescription();
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant10.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str13 = restaurant10.getShortDescription();
    boolean b15 = restaurant10.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant10.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    boolean b20 = product19.getAvailability();
    restaurant18.addProduct(product19);
    java.util.List<com.example.unifood.models.Product> list_product22 = restaurant18.getProductList();
    restaurant18.setUserId("hi!");
    restaurant18.setName("12/03/2017");
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    java.lang.String str28 = review27.getId();
    boolean b29 = restaurant18.removeReview(review27);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    product31.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b36 = restaurant18.removeProduct(product31);
    restaurant10.addProduct(product31);
    product31.setName("bf93221f-f963-4560-8f4a-9bd0a88f2bc4");
    restaurant0.addProduct(product31);
    product31.setCost((float)(-1L));
    product31.setId("dcbb3a24-1388-40e5-a54c-457a20e6762e");
    product31.setAvailability(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "b71b78f5-fb18-4265-a64d-8db52ccbeba0"+ "'", str28.equals("b71b78f5-fb18-4265-a64d-8db52ccbeba0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("647f2e8d-d592-405e-bc6b-87a948e62c35", "44197292-96f7-4284-88b9-cc871fc84e27", (float)100, "0079d2e8-d486-4b81-b337-f82cf9cc3a8d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str4 = restaurant3.getCampusId();
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review10.setUserId("");
    java.lang.String str13 = review10.getUserId();
    review10.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review10.setUserId("7112ad78-afe2-4681-bb63-66c58d50e07e");
    review10.setId("");
    java.lang.String str20 = review10.getComment();
    boolean b21 = restaurant3.equals((java.lang.Object)str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "90afc816-9759-4b54-86ff-a1b7beb18772"+ "'", str4.equals("90afc816-9759-4b54-86ff-a1b7beb18772"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str20.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b3 = studentInfo1.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.util.List<java.lang.String> list_str4 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant3.updateRating();
    restaurant3.setCampusId("dfdebf05-f020-47bf-9495-6ba3646f1480");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("a21a50da-ddf5-467a-a265-3149a522a69c", "ba061308-092f-40b1-9a8e-465a56f359d0", "ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a21a50da-ddf5-467a-a265-3149a522a69c"+ "'", str4.equals("a21a50da-ddf5-467a-a265-3149a522a69c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a21a50da-ddf5-467a-a265-3149a522a69c"+ "'", str5.equals("a21a50da-ddf5-467a-a265-3149a522a69c"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", "com.example.unifood.exceptions.OwnerException", "a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant3.setName("d4347eb6-192e-4976-b563-60f0e7c43424");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    product7.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product7.setAvailability(true);
    restaurant3.addProduct(product7);
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    java.lang.String str16 = restaurant15.getUserId();
    java.lang.String str17 = restaurant15.getLocalization();
    restaurant15.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product();
    boolean b22 = product21.getAvailability();
    restaurant20.addProduct(product21);
    java.util.List<com.example.unifood.models.Product> list_product24 = restaurant20.getProductList();
    restaurant20.setUserId("hi!");
    restaurant20.setName("12/03/2017");
    java.lang.String str29 = restaurant20.getCampusId();
    java.lang.String str30 = restaurant20.getUserId();
    restaurant20.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.util.List<com.example.unifood.models.Review> list_review33 = restaurant20.getReviewList();
    restaurant15.setReviewList(list_review33);
    restaurant3.update(restaurant15);
    java.lang.String str36 = restaurant15.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant3.getUserId();
    restaurant3.setId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    restaurant3.setUserId("32fa8b3d-76f0-4412-a123-18d6b013d9e1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    product1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product1.setAvailability(true);
    java.lang.String str8 = product1.getId();
    boolean b9 = product1.getAvailability();
    java.lang.String str10 = product1.getId();
    product1.setDescription("6619b3c3-eed2-43e1-9424-a1cdc5fc8d45");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str10.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    restaurant0.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    restaurant0.setShortDescription("13f98119-ba54-4465-bf81-4bb02912af47");
    java.lang.String str13 = restaurant0.getName();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant17.setId("38e9601d-4195-43c5-8f2c-566c2ef91772");
    restaurant0.update(restaurant17);
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product();
    boolean b23 = product22.getAvailability();
    restaurant21.addProduct(product22);
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant21.getProductList();
    com.example.unifood.models.Product product26 = new com.example.unifood.models.Product();
    product26.setDescription("hi!");
    boolean b29 = restaurant21.removeProduct(product26);
    product26.setDescription("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    product26.setAvailability(false);
    boolean b34 = restaurant17.removeProduct(product26);
    java.lang.Float f35 = restaurant17.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str13.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f35 + "' != '" + 0.0f+ "'", f35.equals(0.0f));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b9 = restaurant8.getApproved();
    java.lang.String str10 = restaurant8.getId();
    restaurant0.update(restaurant8);
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant8.getReviewList();
    java.lang.String str13 = restaurant8.getCampusId();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    product14.setDescription("hi!");
    java.lang.String str17 = product14.getDescription();
    java.lang.String str18 = product14.getDescription();
    boolean b19 = restaurant8.removeProduct(product14);
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product();
    boolean b22 = product21.getAvailability();
    restaurant20.addProduct(product21);
    java.lang.String str24 = restaurant20.getId();
    restaurant20.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant20.setUserId("850c66ab-1149-4a36-b911-3dc319169391");
    restaurant20.setApproved(false);
    restaurant8.update(restaurant20);
    java.lang.String str32 = restaurant8.getShortDescription();
    restaurant8.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "fba14bdf-95d9-4b8f-9e22-340a653976f8"+ "'", str10.equals("fba14bdf-95d9-4b8f-9e22-340a653976f8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str13.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "f926590f-02e9-4e47-a291-32436a06919d"+ "'", str24.equals("f926590f-02e9-4e47-a291-32436a06919d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setName("3255b7a1-8533-43de-820d-ad22e5728de6");
    java.lang.String str4 = product0.getDescription();
    java.lang.String str5 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("33dcd725-81a1-42a6-9a52-c2d63e538b90", "37810574-eac6-4050-984e-bce27a334681", "7abf4d3d-b259-4908-8e6b-f617c87176f2");
    userInfo3.setLastName("3185522d-9935-4672-8c96-24aab5ee6f1f");

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Review review11 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review11.setUserId("");
    java.lang.String str14 = review11.getUserId();
    review11.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b17 = restaurant3.removeReview(review11);
    float f18 = review11.getRate();
    review11.setRestaurantId("47746bc2-b343-4909-bee3-2d83bd9ab276");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "48d7db54-fa20-4468-bb67-9f40adb181cf"+ "'", str5.equals("48d7db54-fa20-4468-bb67-9f40adb181cf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 1.0f);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getUserId();
    java.lang.String str9 = review0.getUserId();
    review0.setComment("7b379d86-fcc6-43c8-a85d-c887cc492e73");
    java.lang.String str12 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    float f6 = product3.getCost();
    float f7 = product3.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 10.0f);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.lang.String str11 = campus0.getName();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("8501fde2-9e27-46c7-a354-74855525e6d3");

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f6 = review0.getRate();
    review0.setDate("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    java.lang.String str9 = review0.getUserId();
    review0.setDate("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    float f12 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }

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
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException14 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str15 = invalidRestaurantNameException14.toString();
    userException5.addSuppressed((java.lang.Throwable)invalidRestaurantNameException14);
    com.example.unifood.exceptions.OwnerException ownerException17 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException18 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException17.addSuppressed((java.lang.Throwable)invalidCampusIdException18);
    com.example.unifood.exceptions.OwnerException ownerException20 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException21 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException20.addSuppressed((java.lang.Throwable)invalidCampusIdException21);
    java.lang.String str23 = ownerException20.toString();
    invalidCampusIdException18.addSuppressed((java.lang.Throwable)ownerException20);
    invalidRestaurantNameException14.addSuppressed((java.lang.Throwable)ownerException20);
    java.lang.Throwable throwable26 = null;
    // The following exception was thrown during execution in test generation
    try {
    ownerException20.addSuppressed(throwable26);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str15.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str23.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    studentInfo8.setCampusId("");
    java.util.List<java.lang.String> list_str11 = studentInfo8.getFavRestaurants();
    campus0.setRestaurants(list_str11);
    boolean b14 = campus0.addRestaurant("f4c5b8c3-3c11-4032-a3a2-60f2be579cd0");
    java.lang.String str15 = campus0.getName();
    boolean b17 = campus0.removeRestaurant("de399d93-2500-4d55-8631-5f5a9f37ba7f");
    boolean b19 = campus0.addRestaurant("112d31c0-92af-4013-9cac-63a482b72165");
    java.util.List<java.lang.String> list_str20 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4c239513-65bf-45ee-be87-0874a6acea5d"+ "'", str6.equals("4c239513-65bf-45ee-be87-0874a6acea5d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("9b94fcda-82aa-4f00-ba68-1539f5477fa0");
    java.lang.String str6 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("028d9e90-8f7a-426f-9bb1-f298fcad31ed");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str3.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9b94fcda-82aa-4f00-ba68-1539f5477fa0"+ "'", str6.equals("9b94fcda-82aa-4f00-ba68-1539f5477fa0"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str6 = university1.getName();
    boolean b8 = university1.addCampus("dc1efe4b-fdd8-4eca-b2af-4cf625d54e03");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }

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
    java.lang.String str22 = product13.getName();
    java.lang.String str23 = product13.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2e8318d8-b624-4773-a847-3d632abb0b55"+ "'", str10.equals("2e8318d8-b624-4773-a847-3d632abb0b55"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str21.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str23.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setRate((java.lang.Float)32.0f);
    restaurant0.setName("de786c40-08a1-4529-9a5c-1d73b08cec1d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }

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
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    product20.setDescription("hi!");
    java.lang.String str23 = product20.getDescription();
    product20.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str26 = product20.getDescription();
    product20.setAvailability(false);
    restaurant3.addProduct(product20);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    java.util.List<com.example.unifood.models.Product> list_product34 = restaurant30.getProductList();
    restaurant30.setUserId("hi!");
    restaurant30.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review39 = restaurant30.getReviewList();
    com.example.unifood.models.Restaurant restaurant40 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product41 = new com.example.unifood.models.Product();
    boolean b42 = product41.getAvailability();
    restaurant40.addProduct(product41);
    java.util.List<com.example.unifood.models.Product> list_product44 = restaurant40.getProductList();
    restaurant40.setUserId("hi!");
    restaurant40.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review49 = restaurant40.getReviewList();
    restaurant30.setReviewList(list_review49);
    restaurant3.setReviewList(list_review49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review49);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getLocalization();
    java.lang.String str7 = restaurant3.getCampusId();
    java.lang.String str8 = restaurant3.getName();
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant3.getProductList();
    restaurant3.setApproved(true);
    java.lang.String str12 = restaurant3.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str6.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str7.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str8.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "239d950c-a53b-45db-9e8f-483a040e426a"+ "'", str12.equals("239d950c-a53b-45db-9e8f-483a040e426a"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setCampusId("240f8c33-472b-47f7-9c46-778e3e93a08b");
    restaurant3.setApproved(false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("274bcd70-acbb-446a-9a36-9b5f767c61dd", "d7765c42-d982-4314-8865-bbdf5d708f74", 1.0f, "488a4dbb-94ab-477f-a161-4ce60c44a097");

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("8b28f34c-44a4-4917-ad40-43c24673186d", "cc451e2f-c3d9-4cee-9d1d-d026aead791a", "8f17fd97-a41c-4913-b986-6bdd0ff380fe");

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    university1.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str6 = university1.getName();
    java.lang.String str7 = university1.getId();
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b11 = studentInfo9.addProductToFavorites("cda102ed-5d20-4a30-b455-702bfe3561b2");
    boolean b13 = studentInfo9.addProductToFavorites("");
    java.util.List<java.lang.String> list_str14 = studentInfo9.getFavProducts();
    university1.setAllCampus(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str7.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("137eddc9-74ea-4676-8ec0-5c55498d6d17", "3f1d8f40-44f8-458b-a784-7c1c32ce69d6", "5905c9ec-8594-480a-98d9-f263a8aa7afa");
    restaurant3.setId("1aa0d499-6b74-40e4-ae8d-5c2cd81523c3");
    com.example.unifood.models.Product product6 = null;
    boolean b7 = restaurant3.removeProduct(product6);
    restaurant3.setCampusId("c1f80b90-93c2-4f83-8a29-74f4f605cc24");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }

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
    com.example.unifood.exceptions.OwnerException ownerException16 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException17 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException16.addSuppressed((java.lang.Throwable)invalidCampusIdException17);
    com.example.unifood.exceptions.OwnerException ownerException19 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException20 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException19.addSuppressed((java.lang.Throwable)invalidCampusIdException20);
    java.lang.String str22 = ownerException19.toString();
    invalidCampusIdException17.addSuppressed((java.lang.Throwable)ownerException19);
    ownerException8.addSuppressed((java.lang.Throwable)ownerException19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str22.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    restaurant3.setCampusId("aec87e91-9578-4a99-b0c2-833caf90c601");
    restaurant3.setUserId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("f4468839-3e48-4910-9392-1f28b04a053b");

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("bf510678-3cda-4054-9e8c-5877ea0219d4");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "bf510678-3cda-4054-9e8c-5877ea0219d4"+ "'", str2.equals("bf510678-3cda-4054-9e8c-5877ea0219d4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "bf510678-3cda-4054-9e8c-5877ea0219d4"+ "'", str3.equals("bf510678-3cda-4054-9e8c-5877ea0219d4"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }

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
    java.lang.String str14 = review4.getRestaurantId();
    review4.setComment("32b7868a-6f83-4db0-b95f-6f1ac8dbf38c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    userInfo3.setLastName("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5");
    userInfo3.setLastName("9befae08-3641-4d76-a03a-fd4046ab0bc7");
    userInfo3.setFirstName("70e8979e-039c-4fa9-93e1-990ad81b4214");
    java.lang.String str10 = userInfo3.getType();
    userInfo3.setFirstName("");
    java.lang.String str13 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    java.lang.String str6 = product0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    float f5 = product0.getCost();
    java.lang.String str6 = product0.getDescription();
    java.lang.String str7 = product0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str6.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a4bb9e08-68af-487e-98e9-19d19352b615"+ "'", str7.equals("a4bb9e08-68af-487e-98e9-19d19352b615"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }

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
    java.lang.String str23 = review16.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str23.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setRate((java.lang.Float)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str8 = review0.getComment();
    review0.setId("ed8899de-d74b-4c5b-bafd-c89f775d295a");
    review0.setRestaurantId("5a768843-8dc8-45b5-baf6-85706b277c5f");
    review0.setDate("c11d9b42-1817-4b6b-96e0-43ad37cbf5d4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"+ "'", str8.equals("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("9626d0ba-fe19-4356-a232-426c972c7dfc", "4f54b634-288e-42c6-b781-2869535b5bb5", 0.0f, "f666c841-c560-4874-8cbd-008c848d1f42");
    java.lang.String str5 = review4.getId();
    java.lang.String str6 = review4.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "dafca8e9-0f41-492b-b42b-55eb26647f1b"+ "'", str5.equals("dafca8e9-0f41-492b-b42b-55eb26647f1b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "f666c841-c560-4874-8cbd-008c848d1f42"+ "'", str6.equals("f666c841-c560-4874-8cbd-008c848d1f42"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str14 = studentInfo0.getCampusId();
    java.lang.String str15 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str16 = studentInfo0.getFavProducts();
    boolean b18 = studentInfo0.addRestaurantToFavorites("dc1efe4b-fdd8-4eca-b2af-4cf625d54e03");
    boolean b20 = studentInfo0.addProductToFavorites("aec87e91-9578-4a99-b0c2-833caf90c601");
    boolean b22 = studentInfo0.addProductToFavorites("49f86ca5-9a90-47a6-9268-c72162277e22");
    boolean b24 = studentInfo0.addProductToFavorites("d7d3f304-0330-48a9-8cdf-a02d94544e13");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str14.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str15.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }

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
    studentInfo0.setCampusId("f75eb34b-e9e3-4db9-aade-0723095a7855");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "3f01aa6a-fa7b-4093-abd2-f5ab525e9739"+ "'", str11.equals("3f01aa6a-fa7b-4093-abd2-f5ab525e9739"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }

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
    restaurant7.setRate((java.lang.Float)(-1.0f));
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4059dae2-63de-4e71-972e-0c098b670aba"+ "'", str28.equals("4059dae2-63de-4e71-972e-0c098b670aba"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("9e07b376-c51f-4d86-97b2-e0560ef5c7b1", "51d1875f-768e-4819-b159-6e36cd575d93", (float)(short)100, "a34474cb-e0be-4ff6-81f0-dd08fbbf6629", "53d740cc-3498-48a3-8d69-2631da037847");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getName();
    java.lang.String str2 = campus0.getId();
    java.util.List<java.lang.String> list_str3 = campus0.getRestaurants();
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b7 = university5.removeCampus("4955c2e9-d977-4504-8611-581feb3ea4ca");
    boolean b9 = university5.removeCampus("0443a495-187d-4e8b-baa9-bb7cbdacbe5a");
    com.example.unifood.models.University university11 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus12 = new com.example.unifood.models.Campus();
    boolean b14 = campus12.removeRestaurant("hi!");
    campus12.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str17 = campus12.getRestaurants();
    university11.setAllCampus(list_str17);
    university11.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university11.setId("27e81862-1940-4e19-a518-e7bda686ecaa");
    java.lang.String str23 = university11.getName();
    java.util.List<java.lang.String> list_str24 = university11.getAllCampus();
    university5.setAllCampus(list_str24);
    campus0.setRestaurants(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "27977056-3754-45e2-9fef-4db5f7080aef"+ "'", str2.equals("27977056-3754-45e2-9fef-4db5f7080aef"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str23.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("d255af9a-b76d-43de-9ac7-c782a9a20824", 32.0f, "22739d71-d067-4543-8594-4b1f473fe3b0");
    product3.setName("ba29e631-dfc1-4473-8769-c1987b4d89cb");

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    campus1.setId("0527f842-98d0-4df0-a208-e760461137eb");
    campus1.setName("42b8c9a6-a014-4a39-b2af-ca3bffb7a25e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8c1388bf-e142-475b-94ae-ba3261298a7b"+ "'", str2.equals("8c1388bf-e142-475b-94ae-ba3261298a7b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }

    com.example.unifood.exceptions.InvalidDateException invalidDateException0 = new com.example.unifood.exceptions.InvalidDateException();
    java.lang.Throwable[] throwable_array1 = invalidDateException0.getSuppressed();
    java.lang.Throwable[] throwable_array2 = invalidDateException0.getSuppressed();
    java.lang.Throwable[] throwable_array3 = invalidDateException0.getSuppressed();
    java.lang.String str4 = invalidDateException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.InvalidDateException"+ "'", str4.equals("com.example.unifood.exceptions.InvalidDateException"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    university1.setName("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    java.util.List<java.lang.String> list_str10 = university1.getAllCampus();
    boolean b12 = university1.removeCampus("4e587bb6-f60b-4e33-82ee-e55b8f2fc4d3");
    boolean b14 = university1.addCampus("02fa70a1-34eb-43fb-9262-b5b5fdd24c9e");
    java.lang.String str15 = university1.getName();
    java.lang.String str16 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "296227b6-d75d-4a4f-bf76-1112f5149054"+ "'", str2.equals("296227b6-d75d-4a4f-bf76-1112f5149054"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "296227b6-d75d-4a4f-bf76-1112f5149054"+ "'", str5.equals("296227b6-d75d-4a4f-bf76-1112f5149054"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "1cc346cd-7e37-4aa5-a18f-4211b5a529c9"+ "'", str15.equals("1cc346cd-7e37-4aa5-a18f-4211b5a529c9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1cc346cd-7e37-4aa5-a18f-4211b5a529c9"+ "'", str16.equals("1cc346cd-7e37-4aa5-a18f-4211b5a529c9"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b10 = studentInfo0.addProductToFavorites("e8e3014e-33aa-43e7-bb64-b61e035fc513");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.lang.String str11 = review0.getRestaurantId();
    java.lang.String str12 = review0.getComment();
    review0.setRate((float)1);
    review0.setRate((float)(byte)0);
    java.lang.String str17 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a7f88f28-d728-4cc0-82b9-46eaad96df5f"+ "'", str12.equals("a7f88f28-d728-4cc0-82b9-46eaad96df5f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("15149c67-efc5-4744-85b0-8dc2ac121df7");
    boolean b17 = studentInfo0.delRestaurantFromFavorites("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    studentInfo18.setCampusId("");
    studentInfo18.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo18.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    studentInfo25.setCampusId("");
    java.util.List<java.lang.String> list_str28 = studentInfo25.getFavRestaurants();
    com.example.unifood.models.University university30 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus31 = new com.example.unifood.models.Campus();
    boolean b33 = campus31.removeRestaurant("hi!");
    campus31.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str36 = campus31.getRestaurants();
    university30.setAllCampus(list_str36);
    java.util.List<java.lang.String> list_str38 = university30.getAllCampus();
    studentInfo25.setFavRestaurants(list_str38);
    studentInfo18.setFavProducts(list_str38);
    java.util.List<java.lang.String> list_str41 = studentInfo18.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str41);
    boolean b44 = studentInfo0.delRestaurantFromFavorites("bb6264ea-8d6c-4bf2-bfbe-7a763522f7c7");
    boolean b46 = studentInfo0.addRestaurantToFavorites("4e560092-46c0-450d-8583-4087abeb8108");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }

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
    restaurant15.setShortDescription("6c7bf211-c6d2-4f9e-9c67-3d386ead4562");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "71e8cbf5-1ad8-42b4-90c6-2a2cb87eda2e"+ "'", str4.equals("71e8cbf5-1ad8-42b4-90c6-2a2cb87eda2e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    review9.setRate((float)'a');
    review9.setId("e0d85312-2930-47e0-bb40-e93f743fb6cb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "92c014cf-679b-44cb-96b0-57ad7400d031"+ "'", str10.equals("92c014cf-679b-44cb-96b0-57ad7400d031"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }

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
    review20.setRestaurantId("d255af9a-b76d-43de-9ac7-c782a9a20824");
    review20.setDate("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8cbfec2f-435c-4a71-aab5-752759d8dbad"+ "'", str5.equals("8cbfec2f-435c-4a71-aab5-752759d8dbad"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ceab2dcd-9e8d-4e22-acf9-e5088207b7f5"+ "'", str21.equals("ceab2dcd-9e8d-4e22-acf9-e5088207b7f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }

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
    com.example.unifood.models.Restaurant restaurant41 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant41.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str44 = restaurant41.getShortDescription();
    boolean b46 = restaurant41.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review47 = new com.example.unifood.models.Review();
    review47.setId("");
    java.lang.String str50 = review47.getUserId();
    review47.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f53 = review47.getRate();
    boolean b54 = restaurant41.removeReview(review47);
    com.example.unifood.models.Restaurant restaurant55 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product56 = new com.example.unifood.models.Product();
    boolean b57 = product56.getAvailability();
    restaurant55.addProduct(product56);
    java.util.List<com.example.unifood.models.Product> list_product59 = restaurant55.getProductList();
    restaurant55.setUserId("hi!");
    restaurant55.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product64 = restaurant55.getProductList();
    restaurant41.setProductList(list_product64);
    restaurant11.setProductList(list_product64);
    restaurant11.setId("9c255955-e7b7-4da7-98da-e42299c759a2");
    
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
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f53 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product64);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }

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
    java.lang.String str51 = review41.getDate();
    review41.setRate(1.0f);
    
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
    org.junit.Assert.assertNull(str51);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("b72c6d4d-8b11-4af0-987d-b2e50e234e0a", "7e01789f-9cc3-43be-9797-436f20d873d9", 0.0f, "b5e92389-aa3f-4dcf-b208-d494266d63ef", "d4d080c9-ca01-49dd-8eb0-a9da64067acc");

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }

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
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant19.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str22 = restaurant19.getShortDescription();
    boolean b24 = restaurant19.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant19.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant19.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    com.example.unifood.models.Product product32 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    restaurant19.addProduct(product32);
    product32.setId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    boolean b36 = restaurant0.removeProduct(product32);
    java.lang.String str37 = product32.getId();
    product32.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str37.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    java.util.List<java.lang.String> list_str9 = campus0.getRestaurants();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo();
    boolean b12 = studentInfo10.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b14 = studentInfo10.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b16 = studentInfo10.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b18 = studentInfo10.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b20 = studentInfo10.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str21 = studentInfo10.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    boolean b24 = studentInfo22.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b26 = studentInfo22.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus27 = new com.example.unifood.models.Campus();
    boolean b29 = campus27.removeRestaurant("hi!");
    campus27.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str32 = campus27.getRestaurants();
    java.lang.String str33 = campus27.getId();
    java.lang.String str34 = campus27.getName();
    campus27.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str37 = campus27.getRestaurants();
    studentInfo22.setFavRestaurants(list_str37);
    boolean b40 = studentInfo22.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.util.List<java.lang.String> list_str41 = studentInfo22.getFavRestaurants();
    studentInfo10.setFavRestaurants(list_str41);
    studentInfo10.setCampusId("");
    java.util.List<java.lang.String> list_str45 = studentInfo10.getFavProducts();
    com.example.unifood.models.University university47 = new com.example.unifood.models.University("hi!");
    boolean b49 = university47.removeCampus("hi!");
    com.example.unifood.models.University university51 = new com.example.unifood.models.University("hi!");
    java.lang.String str52 = university51.getId();
    boolean b54 = university51.addCampus("hi!");
    java.lang.String str55 = university51.getId();
    university51.setName("12/03/2017");
    java.util.List<java.lang.String> list_str58 = university51.getAllCampus();
    university47.setAllCampus(list_str58);
    studentInfo10.setFavProducts(list_str58);
    campus0.setRestaurants(list_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "e2d20052-027c-4620-a714-b3fc758604b6"+ "'", str6.equals("e2d20052-027c-4620-a714-b3fc758604b6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e2d20052-027c-4620-a714-b3fc758604b6"+ "'", str8.equals("e2d20052-027c-4620-a714-b3fc758604b6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "0db29b25-bde1-4e0c-a710-91c911e1709f"+ "'", str33.equals("0db29b25-bde1-4e0c-a710-91c911e1709f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str34.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "fb97fc7c-1394-41b6-a82f-1fff55073489"+ "'", str52.equals("fb97fc7c-1394-41b6-a82f-1fff55073489"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "fb97fc7c-1394-41b6-a82f-1fff55073489"+ "'", str55.equals("fb97fc7c-1394-41b6-a82f-1fff55073489"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    boolean b13 = restaurant9.getApproved();
    java.lang.String str14 = restaurant9.getId();
    java.lang.String str15 = restaurant9.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "16e0ee92-b014-4c3c-97d8-42ccf7759aa1"+ "'", str5.equals("16e0ee92-b014-4c3c-97d8-42ccf7759aa1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "32db80ff-fab9-4c46-9081-c24d8df8e45e"+ "'", str14.equals("32db80ff-fab9-4c46-9081-c24d8df8e45e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setRate((float)10L);
    review12.setDate("hi!");
    review12.setId("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    boolean b19 = restaurant3.removeReview(review12);
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b24 = restaurant23.getApproved();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b29 = product28.getAvailability();
    product28.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str32 = product28.getId();
    restaurant23.addProduct(product28);
    java.lang.String str34 = product28.getDescription();
    restaurant3.addProduct(product28);
    restaurant3.setUserId("34d7c7e2-699e-46fd-8a5d-8beaecdd52ba");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str32.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "12/03/2017"+ "'", str34.equals("12/03/2017"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("ab3ba457-f9a8-416f-872c-51f3f6ab602f", "cd560d8f-28e7-4b43-b906-20258edc001d", "1caf263e-dd60-40ea-83b2-b02f90a4a805");
    restaurant3.setApproved(false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }

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
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b22 = restaurant21.getApproved();
    java.lang.String str23 = restaurant21.getId();
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant21.getReviewList();
    java.lang.String str25 = restaurant21.getCampusId();
    restaurant21.setUserId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    java.util.List<com.example.unifood.models.Product> list_product28 = restaurant21.getProductList();
    restaurant0.setProductList(list_product28);
    java.lang.String str30 = restaurant0.getId();
    
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
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "33f0bb9a-1d25-45c3-8044-bec184c5382f"+ "'", str23.equals("33f0bb9a-1d25-45c3-8044-bec184c5382f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str25.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "f4514086-06de-48ed-aac0-fac5f835746b"+ "'", str30.equals("f4514086-06de-48ed-aac0-fac5f835746b"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", "com.example.unifood.exceptions.OwnerException", "a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review();
    java.lang.String str5 = review4.getDate();
    review4.setRate((float)0);
    review4.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review4.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str12 = review4.getComment();
    boolean b13 = restaurant3.removeReview(review4);
    float f14 = review4.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"+ "'", str12.equals("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.0f);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }

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
    product57.setCost(1.0f);
    product57.setName("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    
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

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = campus0.getName();
    campus0.setId("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    java.lang.String str12 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "42428154-8551-4f70-aa53-9965950a2373"+ "'", str6.equals("42428154-8551-4f70-aa53-9965950a2373"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("9f306987-57df-408e-b35c-ab4ba0096947", "71e8cbf5-1ad8-42b4-90c6-2a2cb87eda2e", "c1839dde-2a89-4fce-a06f-c96ccbb3f563");

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    java.lang.String str4 = university1.getId();
    university1.setId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    university1.setId("f3fc90c1-836b-4f80-a3c2-5cb84a4c68ea");
    boolean b10 = university1.addCampus("6717c8b0-3e9a-4fe5-927b-f3f653f09061");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f2878eaa-661d-4cd5-93a1-12f1855cbfbc"+ "'", str2.equals("f2878eaa-661d-4cd5-93a1-12f1855cbfbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "f2878eaa-661d-4cd5-93a1-12f1855cbfbc"+ "'", str4.equals("f2878eaa-661d-4cd5-93a1-12f1855cbfbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("cde62678-4a38-48f3-8486-51d54fb5e8c8", "53d740cc-3498-48a3-8d69-2631da037847", (float)(short)1, "a3b987c2-9db2-4892-bf67-5beb5e226c6b", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f");
    java.lang.String str6 = review5.getId();
    review5.setComment("9af82747-9c84-450f-ab4f-aec0067c1556");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "89f8b5d3-f6fa-4bb3-a3ed-13c530679768"+ "'", str6.equals("89f8b5d3-f6fa-4bb3-a3ed-13c530679768"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }

    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException0 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException1 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException0.addSuppressed((java.lang.Throwable)invalidCampusNameException1);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException3 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException1.addSuppressed((java.lang.Throwable)invalidDescriptionException3);
    java.lang.Throwable[] throwable_array5 = invalidDescriptionException3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review0.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    review0.setRate((float)(short)0);
    java.lang.String str15 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getFirstName();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setFirstName("850c66ab-1149-4a36-b911-3dc319169391");
    java.lang.String str8 = userInfo0.getLastName();
    java.lang.String str9 = userInfo0.getFirstName();
    java.lang.String str10 = userInfo0.getLastName();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "850c66ab-1149-4a36-b911-3dc319169391"+ "'", str9.equals("850c66ab-1149-4a36-b911-3dc319169391"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("f17a0386-8f66-4474-b30d-57452ed4145e", "cde62678-4a38-48f3-8486-51d54fb5e8c8", "fe3d6940-3d53-4045-ba18-577d39f15953");

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getUserId();
    restaurant3.setLocalization("e3c02b6c-6ad8-4057-8eb3-b966f859b297");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("0d5c1ebe-0616-4333-81c2-15b02bdb0edd");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0d5c1ebe-0616-4333-81c2-15b02bdb0edd"+ "'", str2.equals("0d5c1ebe-0616-4333-81c2-15b02bdb0edd"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    university1.setName("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    java.util.List<java.lang.String> list_str10 = university1.getAllCampus();
    java.lang.String str11 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "fd21b6dc-68c3-4d5e-92f0-60daca18d597"+ "'", str2.equals("fd21b6dc-68c3-4d5e-92f0-60daca18d597"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "fd21b6dc-68c3-4d5e-92f0-60daca18d597"+ "'", str5.equals("fd21b6dc-68c3-4d5e-92f0-60daca18d597"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1cc346cd-7e37-4aa5-a18f-4211b5a529c9"+ "'", str11.equals("1cc346cd-7e37-4aa5-a18f-4211b5a529c9"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    java.lang.String str4 = university1.getId();
    university1.setName("603fd35b-ea62-491b-8376-4e5ebb75b266");
    boolean b8 = university1.removeCampus("42ff3df8-22e9-4277-9924-c3723c127d45");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cc08f8c0-b432-4522-a585-ab967bdbd377"+ "'", str4.equals("cc08f8c0-b432-4522-a585-ab967bdbd377"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    java.lang.String str4 = review0.getRestaurantId();
    java.lang.String str5 = review0.getUserId();
    review0.setRate(32.0f);
    review0.setUserId("abd293bf-2239-4c98-b7ba-ff7036c5aa21");
    java.lang.String str10 = review0.getComment();
    review0.setDate("22c59ac9-457f-4952-b1bd-a87c6a50c37a");
    
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("5f5c4b81-254c-4177-bece-07521f3cb9d5");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    java.lang.String str8 = campus2.getId();
    java.lang.String str9 = campus2.getName();
    campus2.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.University university13 = new com.example.unifood.models.University("hi!");
    java.lang.String str14 = university13.getId();
    java.lang.String[] str_array43 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    university13.setAllCampus((java.util.List<java.lang.String>)arraylist_str44);
    campus2.setRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    java.util.List<java.lang.String> list_str48 = campus2.getRestaurants();
    studentInfo1.setFavRestaurants(list_str48);
    boolean b51 = studentInfo1.delRestaurantFromFavorites("15a6b6a2-cfd9-4c65-8821-2c55c4d44d03");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "51c4af49-bc6f-46ba-8f21-05b7eb1dc61d"+ "'", str8.equals("51c4af49-bc6f-46ba-8f21-05b7eb1dc61d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aa3f9f95-c2e9-4270-a0de-f2a7b9d4a0e2"+ "'", str14.equals("aa3f9f95-c2e9-4270-a0de-f2a7b9d4a0e2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("com.example.unifood.exceptions.InvalidProductCostException");

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    boolean b5 = studentInfo0.delProductFromFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("5e786f23-932e-4123-b51a-15e28b5a30f0");
    java.lang.String str8 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException1 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException2 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException1.addSuppressed((java.lang.Throwable)invalidCampusIdException2);
    java.lang.Throwable[] throwable_array4 = ownerException1.getSuppressed();
    java.lang.String str5 = ownerException1.toString();
    java.lang.String str6 = ownerException1.toString();
    ownerException0.addSuppressed((java.lang.Throwable)ownerException1);
    java.lang.String str8 = ownerException0.toString();
    java.lang.Throwable[] throwable_array9 = ownerException0.getSuppressed();
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException10 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException11 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException10.addSuppressed((java.lang.Throwable)invalidCampusNameException11);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException13 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException11.addSuppressed((java.lang.Throwable)invalidDescriptionException13);
    com.example.unifood.exceptions.UserException userException15 = new com.example.unifood.exceptions.UserException();
    java.lang.String str16 = userException15.toString();
    invalidDescriptionException13.addSuppressed((java.lang.Throwable)userException15);
    com.example.unifood.exceptions.OwnerException ownerException18 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException19 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException18.addSuppressed((java.lang.Throwable)invalidCampusIdException19);
    java.lang.String str21 = ownerException18.toString();
    java.lang.String str22 = ownerException18.toString();
    userException15.addSuppressed((java.lang.Throwable)ownerException18);
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException24 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str25 = invalidRestaurantNameException24.toString();
    userException15.addSuppressed((java.lang.Throwable)invalidRestaurantNameException24);
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException27 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException28 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException27.addSuppressed((java.lang.Throwable)invalidCampusNameException28);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException30 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException28.addSuppressed((java.lang.Throwable)invalidDescriptionException30);
    com.example.unifood.exceptions.UserException userException32 = new com.example.unifood.exceptions.UserException();
    java.lang.String str33 = userException32.toString();
    invalidDescriptionException30.addSuppressed((java.lang.Throwable)userException32);
    com.example.unifood.exceptions.OwnerException ownerException35 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException36 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException35.addSuppressed((java.lang.Throwable)invalidCampusIdException36);
    java.lang.String str38 = ownerException35.toString();
    java.lang.String str39 = ownerException35.toString();
    userException32.addSuppressed((java.lang.Throwable)ownerException35);
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException41 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str42 = invalidRestaurantNameException41.toString();
    userException32.addSuppressed((java.lang.Throwable)invalidRestaurantNameException41);
    java.lang.Throwable[] throwable_array44 = userException32.getSuppressed();
    java.lang.String str45 = userException32.toString();
    invalidRestaurantNameException24.addSuppressed((java.lang.Throwable)userException32);
    ownerException0.addSuppressed((java.lang.Throwable)userException32);
    java.lang.Throwable[] throwable_array48 = userException32.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str8.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str16.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str21.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str22.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str25.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str33.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str38.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str39.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str42.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str45.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array48);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getId();
    float f5 = review0.getRate();
    review0.setRestaurantId("786c4a65-5ed9-4688-8479-0d6e4a8690aa");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1bad3407-14f0-4e93-9dc2-4434d45fb62e"+ "'", str4.equals("1bad3407-14f0-4e93-9dc2-4434d45fb62e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }

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
    product12.setId("71cf3554-3a7b-4ac1-85c8-6901f2458f2d");
    product12.setAvailability(false);
    product12.setCost((float)(short)10);
    boolean b25 = product12.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("850c66ab-1149-4a36-b911-3dc319169391");
    restaurant0.setApproved(false);
    restaurant0.updateRating();
    java.lang.String str12 = restaurant0.getName();
    restaurant0.setUserId("b0f6fbc2-a700-40b9-8275-01f155e602b1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "217e2638-6ef4-4e7d-a2ad-8f999c720f01"+ "'", str4.equals("217e2638-6ef4-4e7d-a2ad-8f999c720f01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    com.example.unifood.models.Product product7 = null;
    boolean b8 = restaurant3.removeProduct(product7);
    restaurant3.setId("4ad6ded4-6046-416e-884e-e4a4469f34f0");
    restaurant3.setShortDescription("3d6129ca-9f03-41cb-8b98-fd6607aa77fb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    studentInfo0.setCampusId("2d88e3e8-25d3-48e6-8156-fc7a40cbf371");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    boolean b14 = studentInfo0.delRestaurantFromFavorites("985bbbf6-84a2-45bf-a251-ec3589650d8b");
    boolean b16 = studentInfo0.addRestaurantToFavorites("b0b0b700-7ebd-489d-85cc-58091d6c4b3e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("8a4f7782-7de3-4ba9-b962-3e34df2e8048", "21a5ae7c-2e2c-4f21-ab45-133899277be9", (float)0, "32bef74e-15d2-4f2b-849c-199055557d88", "53385034-c596-4b8b-96bd-a5bd2910707a");
    review5.setRestaurantId("22739d71-d067-4543-8594-4b1f473fe3b0");
    review5.setRate(0.0f);
    float f10 = review5.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getFirstName();
    userInfo0.setLastName("34883944-2c20-4b7d-a7d4-9195f4f24b79");
    java.lang.String str8 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str8.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }

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
    java.lang.Float f14 = restaurant0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f14 + "' != '" + 0.0f+ "'", f14.equals(0.0f));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    restaurant0.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review("8664e462-8683-4210-8fa3-b99e2a278578", "c2426597-cce5-40f1-893d-8aab21c1b7d0", (float)0L, "c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    review15.setDate("");
    float f18 = review15.getRate();
    review15.setId("79e34305-83ca-43db-9161-e84dc18fc522");
    boolean b21 = restaurant0.equals((java.lang.Object)"79e34305-83ca-43db-9161-e84dc18fc522");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str4 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("e304f8eb-2dd5-4183-bfbc-58b30cd1b029", "b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4", "09c560d8-ad4a-4efc-a7b7-3894259139d4");
    userInfo3.setType("ba061308-092f-40b1-9a8e-465a56f359d0");
    userInfo3.setFirstName("1aa0d499-6b74-40e4-ae8d-5c2cd81523c3");
    java.lang.String str8 = userInfo3.getLastName();
    userInfo3.setLastName("4c2ec3f3-052d-4297-adba-2733164d7737");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4"+ "'", str8.equals("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    java.lang.String str8 = restaurant0.getUserId();
    restaurant0.setName("1983ff6a-fa30-40b2-aa4d-f38e2a6482af");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("1d67570f-1a4b-47a8-b621-6f4de13a3e09", "417f3e0b-e3cc-4dc6-bd5c-2e87683b0394", (float)(-1L), "36e9cd33-a1c0-4732-a96b-fce5ebc8d118", "1a58b1f5-2d31-4fd5-afa5-3fa900adb0a0");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("5f6eccab-44f0-492a-a170-a0088150e2a0", "56a1e8aa-3e9e-4dd9-bb2d-380efc35a0fd", "1c2b7142-bea3-4214-a7ce-8c64681b7e32");

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus0.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.util.List<java.lang.String> list_str16 = campus0.getRestaurants();
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
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "c0cadb00-aa9f-409a-9d1f-9803ce9837a3"+ "'", str17.equals("c0cadb00-aa9f-409a-9d1f-9803ce9837a3"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavProducts(list_str8);
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo();
    studentInfo10.setCampusId("");
    studentInfo10.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo10.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b18 = studentInfo10.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus();
    boolean b21 = campus19.removeRestaurant("hi!");
    java.lang.String[] str_array46 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<java.lang.String>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str47, str_array46);
    campus19.setRestaurants((java.util.List<java.lang.String>)arraylist_str47);
    studentInfo10.setFavProducts((java.util.List<java.lang.String>)arraylist_str47);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str47);
    com.example.unifood.models.University university53 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    university53.setId("");
    java.util.List<java.lang.String> list_str56 = university53.getAllCampus();
    studentInfo0.setFavRestaurants(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.lang.String[] str_array31 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str32);
    university1.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    com.example.unifood.models.Campus campus37 = new com.example.unifood.models.Campus();
    boolean b39 = campus37.removeRestaurant("hi!");
    campus37.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str42 = campus37.getRestaurants();
    boolean b44 = campus37.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b46 = campus37.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b48 = campus37.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str49 = campus37.getName();
    boolean b51 = campus37.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.Campus campus52 = new com.example.unifood.models.Campus();
    boolean b54 = campus52.removeRestaurant("hi!");
    campus52.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str57 = campus52.getRestaurants();
    boolean b59 = campus52.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b61 = campus52.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b63 = campus52.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str64 = campus52.getName();
    com.example.unifood.models.StudentInfo studentInfo65 = new com.example.unifood.models.StudentInfo();
    studentInfo65.setCampusId("");
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str74 = new java.util.ArrayList<java.lang.String>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str74, str_array73);
    studentInfo65.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str74);
    campus52.setRestaurants((java.util.List<java.lang.String>)arraylist_str74);
    campus37.setRestaurants((java.util.List<java.lang.String>)arraylist_str74);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str74);
    java.lang.String str80 = university1.getName();
    java.lang.String str81 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "41322b42-a2de-4c4a-bad7-cdc422d11933"+ "'", str2.equals("41322b42-a2de-4c4a-bad7-cdc422d11933"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str49.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str64.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str81.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    restaurant3.setCampusId("aec87e91-9578-4a99-b0c2-833caf90c601");
    restaurant3.setShortDescription("6292f4c2-dc79-49de-afc3-0117c86a49f3");
    restaurant3.setRate((java.lang.Float)32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c9107d05-b646-4bac-bf92-00cdcc3f6c6a", "", "a8331c8c-27d1-4b1e-9030-a2db2eb4c5c6");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "c9107d05-b646-4bac-bf92-00cdcc3f6c6a"+ "'", str4.equals("c9107d05-b646-4bac-bf92-00cdcc3f6c6a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c9107d05-b646-4bac-bf92-00cdcc3f6c6a"+ "'", str5.equals("c9107d05-b646-4bac-bf92-00cdcc3f6c6a"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("7abf4d3d-b259-4908-8e6b-f617c87176f2");
    university1.setName("429a2818-ec94-4d38-8e60-29ecc71c4aaa");
    university1.setName("e3c02b6c-6ad8-4057-8eb3-b966f859b297");

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("7ef0cf59-e144-416a-a062-c1d947e146d2", (float)' ', "");
    product3.setName("4763e357-528e-4bc8-8acc-36ac0bc21b95");
    product3.setAvailability(true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("a20d2418-6eae-481b-a6e4-586c31d1eb34", "a3b0d385-faef-4e64-be1b-64906c16cdac", (float)(byte)10, "18040e04-0844-4cac-8d6c-c57f545a74d8");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("1d085404-2578-482b-901c-068b998c0e83");
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setLocalization("7c59358e-116e-43c5-8ee4-d0460ea1e2fb");
    restaurant3.setCampusId("3e413f8d-feb6-46fd-9432-2362d7c0b7da");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    restaurant0.setRate((java.lang.Float)0.0f);
    java.lang.String str11 = restaurant0.getLocalization();
    restaurant0.setId("e2c5a479-863d-468d-b3ec-388be48481a6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }

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
    restaurant0.setRate((java.lang.Float)(-1.0f));
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    restaurant22.addProduct(product23);
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant22.getProductList();
    restaurant22.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant22.setApproved(false);
    restaurant22.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    restaurant22.setShortDescription("13f98119-ba54-4465-bf81-4bb02912af47");
    java.lang.String str35 = restaurant22.getName();
    com.example.unifood.models.Restaurant restaurant39 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant39.setId("38e9601d-4195-43c5-8f2c-566c2ef91772");
    restaurant22.update(restaurant39);
    com.example.unifood.models.Restaurant restaurant43 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product44 = new com.example.unifood.models.Product();
    boolean b45 = product44.getAvailability();
    restaurant43.addProduct(product44);
    java.util.List<com.example.unifood.models.Product> list_product47 = restaurant43.getProductList();
    com.example.unifood.models.Product product48 = new com.example.unifood.models.Product();
    product48.setDescription("hi!");
    boolean b51 = restaurant43.removeProduct(product48);
    product48.setDescription("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    product48.setAvailability(false);
    boolean b56 = restaurant39.removeProduct(product48);
    restaurant0.addProduct(product48);
    restaurant0.setRate((java.lang.Float)35.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "c46a07ae-5404-4a91-977c-904dbd777943"+ "'", str10.equals("c46a07ae-5404-4a91-977c-904dbd777943"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str35.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }

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
    boolean b37 = studentInfo0.addRestaurantToFavorites("b38cc914-cd4c-4f74-ba13-b1e6dd295cbc");
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "2c7fabaa-f34b-47d6-ae8c-8ef5bbf0f1da"+ "'", str12.equals("2c7fabaa-f34b-47d6-ae8c-8ef5bbf0f1da"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    restaurant3.setLocalization("3255b7a1-8533-43de-820d-ad22e5728de6");
    java.lang.String str8 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "524c38d0-62b9-4046-8002-74a01839609e"+ "'", str5.equals("524c38d0-62b9-4046-8002-74a01839609e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    review0.setId("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    java.lang.String str8 = review0.getDate();
    review0.setDate("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    review0.setComment("ced6e91b-9cd9-49c4-91b3-b718083b5bff");
    review0.setId("c237191f-b7dd-488f-9e1a-42f91c8fb508");
    review0.setComment("5022f377-43a1-412d-8db5-e9b48e3d046e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "506e700a-1af7-4479-9098-629c98852aea"+ "'", str2.equals("506e700a-1af7-4479-9098-629c98852aea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f6 = review0.getRate();
    java.lang.String str7 = review0.getId();
    java.lang.String str8 = review0.getUserId();
    java.lang.String str9 = review0.getComment();
    java.lang.String str10 = review0.getId();
    review0.setUserId("db50d780-493d-4af3-914d-6b04b7e8622f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str9.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("7b3e863f-e108-4a03-b358-467ff79fd91e");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7b3e863f-e108-4a03-b358-467ff79fd91e"+ "'", str2.equals("7b3e863f-e108-4a03-b358-467ff79fd91e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "7b3e863f-e108-4a03-b358-467ff79fd91e"+ "'", str3.equals("7b3e863f-e108-4a03-b358-467ff79fd91e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "7b3e863f-e108-4a03-b358-467ff79fd91e"+ "'", str4.equals("7b3e863f-e108-4a03-b358-467ff79fd91e"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    product3.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    product3.setCost((float)0);
    float f10 = product3.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 10.0f);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getLastName();
    userInfo3.setType("45d009d6-e408-4af2-be1f-8551106fa615");
    userInfo3.setFirstName("13c75407-e7ad-4d88-bfeb-3bc68ba70151");
    java.lang.String str11 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str6.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str11.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }

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
    boolean b20 = restaurant13.getApproved();
    
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
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("0562f72a-6387-47e3-9fa8-448bfc938e13");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0562f72a-6387-47e3-9fa8-448bfc938e13"+ "'", str8.equals("0562f72a-6387-47e3-9fa8-448bfc938e13"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }

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
    java.lang.String str17 = campus11.getId();
    java.lang.String str18 = campus11.getName();
    java.lang.String str19 = campus11.getId();
    java.lang.String str20 = campus11.getId();
    java.util.List<java.lang.String> list_str21 = campus11.getRestaurants();
    campus0.setRestaurants(list_str21);
    boolean b24 = campus0.removeRestaurant("1aa0d499-6b74-40e4-ae8d-5c2cd81523c3");
    campus0.setId("5511aa54-bd55-4aa6-8409-4efbacf8ff9d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c5a1deec-57ca-4891-8218-1470688ffb73"+ "'", str6.equals("c5a1deec-57ca-4891-8218-1470688ffb73"));
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cc28730e-6973-4294-b4dc-90edf4f859c5"+ "'", str17.equals("cc28730e-6973-4294-b4dc-90edf4f859c5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str18.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "cc28730e-6973-4294-b4dc-90edf4f859c5"+ "'", str19.equals("cc28730e-6973-4294-b4dc-90edf4f859c5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "cc28730e-6973-4294-b4dc-90edf4f859c5"+ "'", str20.equals("cc28730e-6973-4294-b4dc-90edf4f859c5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("5858b29d-7c96-4fd6-b3ba-19d99a868cca");

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("aa3f9f95-c2e9-4270-a0de-f2a7b9d4a0e2", "dbdb3e49-5064-44a4-bcc4-fa29a5b0074b", "622fdecc-6222-40bf-8c2f-a40e48186095");

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setRate((java.lang.Float)32.0f);
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str14 = product13.getName();
    product13.setCost((float)100L);
    restaurant0.addProduct(product13);
    restaurant0.setLocalization("4b68e313-427e-4922-8f0f-541e14bfcfcd");
    boolean b20 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str14.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("de90dd21-7ff7-4772-b73b-2f989c4f9192");

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }

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
    java.lang.String str39 = restaurant0.getLocalization();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "54a9d73b-555d-44f7-8934-0e64d6ba5ea5"+ "'", str21.equals("54a9d73b-555d-44f7-8934-0e64d6ba5ea5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "e25bd3c2-01b1-4e6e-8792-cebe573a7a1a"+ "'", str34.equals("e25bd3c2-01b1-4e6e-8792-cebe573a7a1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    restaurant3.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant12.setName("12/03/2017");
    java.lang.String str15 = restaurant12.getUserId();
    java.lang.String str16 = restaurant12.getLocalization();
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
    restaurant12.setProductList(list_product93);
    restaurant3.setProductList(list_product93);
    java.lang.Float f98 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str16.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
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
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "b22a3df7-7baf-4e1c-988c-78fc2dbabbe1"+ "'", str77.equals("b22a3df7-7baf-4e1c-988c-78fc2dbabbe1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f98 + "' != '" + 10.0f+ "'", f98.equals(10.0f));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("48af3aad-919d-4ef4-8028-3a57694cd73d", (float)' ', "274be07e-a3ac-4731-bba5-47ea41b3cd02");
    product3.setCost((float)(short)0);
    java.lang.String str6 = product3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "274be07e-a3ac-4731-bba5-47ea41b3cd02"+ "'", str6.equals("274be07e-a3ac-4731-bba5-47ea41b3cd02"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("de3c5036-1d45-4980-b460-95ff00e4a5e8", "", (float)(short)100, "3e401a04-139d-43f2-aae5-9098b75f844d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("1df23d09-2bfa-44ca-aaf1-2508f61a5cfe");

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setUserId("");
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant3.getProductList();
    restaurant3.setShortDescription("5bdaaeee-4aca-4864-bccd-eb791b33f0ab");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus6 = new com.example.unifood.models.Campus();
    boolean b8 = campus6.removeRestaurant("hi!");
    campus6.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str11 = campus6.getRestaurants();
    university5.setAllCampus(list_str11);
    java.util.List<java.lang.String> list_str13 = university5.getAllCampus();
    studentInfo0.setFavRestaurants(list_str13);
    studentInfo0.setCampusId("fd6c7c60-1643-4f79-aaf6-7d9533a7d89f");
    boolean b18 = studentInfo0.delRestaurantFromFavorites("16ee73f8-da86-4221-b4d2-c80bab28f4d9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product0.setCost((float)' ');
    product0.setName("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }

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
    boolean b87 = studentInfo1.delRestaurantFromFavorites("f33b93fe-73d2-4d5b-9fd4-5e887cbd3c76");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "009055ab-626d-4ab7-950e-48461ca3bc65"+ "'", str5.equals("009055ab-626d-4ab7-950e-48461ca3bc65"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "009055ab-626d-4ab7-950e-48461ca3bc65"+ "'", str8.equals("009055ab-626d-4ab7-950e-48461ca3bc65"));
    
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
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }

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
    restaurant3.setRate((java.lang.Float)1.0f);
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    boolean b20 = product19.getAvailability();
    restaurant18.addProduct(product19);
    java.util.List<com.example.unifood.models.Product> list_product22 = restaurant18.getProductList();
    restaurant18.setUserId("hi!");
    restaurant18.setName("12/03/2017");
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    java.lang.String str28 = review27.getId();
    boolean b29 = restaurant18.removeReview(review27);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    product31.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b36 = restaurant18.removeProduct(product31);
    boolean b37 = product31.getAvailability();
    product31.setDescription("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.lang.String str40 = product31.getDescription();
    product31.setCost(0.0f);
    product31.setCost((float)(short)1);
    restaurant3.addProduct(product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "5ee0923c-70eb-46ca-a0e9-718fcaa0c8d3"+ "'", str28.equals("5ee0923c-70eb-46ca-a0e9-718fcaa0c8d3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "53d5e04e-abb5-45a7-a278-d742367421a0"+ "'", str40.equals("53d5e04e-abb5-45a7-a278-d742367421a0"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str5 = review0.getDate();
    review0.setRestaurantId("5a768843-8dc8-45b5-baf6-85706b277c5f");
    review0.setUserId("8ef2eb1c-6eaa-459e-96ae-f92134f1053c");
    review0.setDate("811f8a1d-ca60-461d-828c-6680d7547043");
    java.lang.String str12 = review0.getRestaurantId();
    java.lang.String str13 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "5a768843-8dc8-45b5-baf6-85706b277c5f"+ "'", str12.equals("5a768843-8dc8-45b5-baf6-85706b277c5f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ac941c83-8955-4b2b-8665-9a1c85674caf"+ "'", str13.equals("ac941c83-8955-4b2b-8665-9a1c85674caf"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str14 = studentInfo0.getCampusId();
    java.lang.String str15 = studentInfo0.getCampusId();
    boolean b17 = studentInfo0.delRestaurantFromFavorites("com.example.unifood.exceptions.StudentException");
    boolean b19 = studentInfo0.delProductFromFavorites("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6");
    com.example.unifood.models.Campus campus20 = new com.example.unifood.models.Campus();
    boolean b22 = campus20.removeRestaurant("hi!");
    java.lang.String[] str_array47 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str48, str_array47);
    campus20.setRestaurants((java.util.List<java.lang.String>)arraylist_str48);
    campus20.setId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b56 = studentInfo54.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    boolean b58 = studentInfo54.delProductFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    boolean b60 = studentInfo54.delProductFromFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    com.example.unifood.models.StudentInfo studentInfo61 = new com.example.unifood.models.StudentInfo();
    studentInfo61.setCampusId("");
    studentInfo61.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo61.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b69 = studentInfo61.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.StudentInfo studentInfo70 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus71 = new com.example.unifood.models.Campus();
    boolean b73 = campus71.removeRestaurant("hi!");
    campus71.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str76 = campus71.getRestaurants();
    studentInfo70.setFavRestaurants(list_str76);
    studentInfo61.setFavProducts(list_str76);
    java.util.List<java.lang.String> list_str79 = studentInfo61.getFavRestaurants();
    studentInfo54.setFavRestaurants(list_str79);
    campus20.setRestaurants(list_str79);
    studentInfo0.setFavProducts(list_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str14.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str15.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str79);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setType("b878dc6e-48f9-441a-929c-5b631521b5e8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str5.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str6.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    com.example.unifood.models.University university8 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str9 = university8.getName();
    boolean b10 = restaurant3.equals((java.lang.Object)str9);
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    restaurant11.addProduct(product12);
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant11.getProductList();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    product16.setDescription("hi!");
    boolean b19 = restaurant11.removeProduct(product16);
    restaurant11.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str22 = restaurant11.getUserId();
    restaurant11.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str29 = restaurant28.getName();
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    java.util.List<com.example.unifood.models.Product> list_product34 = restaurant30.getProductList();
    restaurant30.updateRating();
    java.lang.String str36 = restaurant30.getShortDescription();
    java.lang.String str37 = restaurant30.getName();
    java.util.List<com.example.unifood.models.Product> list_product38 = restaurant30.getProductList();
    restaurant28.setProductList(list_product38);
    restaurant11.setProductList(list_product38);
    restaurant3.setProductList(list_product38);
    com.example.unifood.models.Restaurant restaurant45 = new com.example.unifood.models.Restaurant("a0b68400-74b5-49a7-99f0-a97f05e45521", "a6a15e37-de72-4c55-91a1-ffacd16484c8", "2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.Restaurant restaurant49 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str50 = restaurant49.getShortDescription();
    java.lang.Float f51 = restaurant49.getRate();
    restaurant49.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f54 = restaurant49.getRate();
    restaurant49.setRate((java.lang.Float)(-1.0f));
    java.util.List<com.example.unifood.models.Product> list_product57 = restaurant49.getProductList();
    restaurant45.setProductList(list_product57);
    restaurant3.setProductList(list_product57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str29.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f51 + "' != '" + 0.0f+ "'", f51.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f54 + "' != '" + 0.0f+ "'", f54.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product57);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("7c382e92-acef-4318-a40d-158e77003992");
    studentInfo1.setCampusId("9bd89d28-19bb-4c2d-a129-4f98542c55ca");
    java.util.List<java.lang.String> list_str4 = null;
    studentInfo1.setFavProducts(list_str4);
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    com.example.unifood.models.University university9 = new com.example.unifood.models.University("hi!");
    boolean b11 = university9.removeCampus("hi!");
    university9.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str14 = university9.getName();
    boolean b16 = university9.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university18 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus();
    boolean b21 = campus19.removeRestaurant("hi!");
    campus19.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str24 = campus19.getRestaurants();
    university18.setAllCampus(list_str24);
    java.util.List<java.lang.String> list_str26 = university18.getAllCampus();
    university9.setAllCampus(list_str26);
    studentInfo7.setFavProducts(list_str26);
    boolean b30 = studentInfo7.delRestaurantFromFavorites("274be07e-a3ac-4731-bba5-47ea41b3cd02");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo();
    studentInfo31.setCampusId("");
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    studentInfo31.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    studentInfo31.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str45 = studentInfo31.getCampusId();
    java.lang.String str46 = studentInfo31.getCampusId();
    com.example.unifood.models.Campus campus47 = new com.example.unifood.models.Campus();
    boolean b49 = campus47.removeRestaurant("hi!");
    java.lang.String[] str_array74 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str75 = new java.util.ArrayList<java.lang.String>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str75, str_array74);
    campus47.setRestaurants((java.util.List<java.lang.String>)arraylist_str75);
    studentInfo31.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str75);
    studentInfo7.setFavProducts((java.util.List<java.lang.String>)arraylist_str75);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str45.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str46.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }

    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException0 = new com.example.unifood.exceptions.InvalidCampusNameException();
    com.example.unifood.exceptions.OwnerException ownerException1 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException2 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException3 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException2.addSuppressed((java.lang.Throwable)invalidCampusIdException3);
    java.lang.Throwable[] throwable_array5 = ownerException2.getSuppressed();
    java.lang.String str6 = ownerException2.toString();
    java.lang.String str7 = ownerException2.toString();
    ownerException1.addSuppressed((java.lang.Throwable)ownerException2);
    invalidCampusNameException0.addSuppressed((java.lang.Throwable)ownerException1);
    com.example.unifood.exceptions.OwnerException ownerException10 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException11 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException10.addSuppressed((java.lang.Throwable)invalidCampusIdException11);
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException13 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException14 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException13.addSuppressed((java.lang.Throwable)invalidCampusNameException14);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException16 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException14.addSuppressed((java.lang.Throwable)invalidDescriptionException16);
    invalidCampusIdException11.addSuppressed((java.lang.Throwable)invalidDescriptionException16);
    java.lang.Throwable[] throwable_array19 = invalidCampusIdException11.getSuppressed();
    ownerException1.addSuppressed((java.lang.Throwable)invalidCampusIdException11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str7.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array19);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    java.lang.String str10 = restaurant0.getUserId();
    java.lang.String str11 = restaurant0.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "3f1f2c41-cbe8-4647-a5f0-123f0f1af573"+ "'", str11.equals("3f1f2c41-cbe8-4647-a5f0-123f0f1af573"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }

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
    restaurant3.setLocalization("8e069f68-c995-4d5a-9117-23fad524d3d9");
    com.example.unifood.models.Review review67 = null;
    restaurant3.addReview(review67);
    restaurant3.updateRating();
    
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "10895d32-3a72-41e6-9ab8-abe6f758d094"+ "'", str46.equals("10895d32-3a72-41e6-9ab8-abe6f758d094"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("b15b577c-7d9d-4b79-84fe-1ba3b657c3bc");

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setType("734b5dbf-0d92-4292-8c7e-b3d9ab95dd58");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str5.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str6.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.Throwable[] throwable_array3 = ownerException0.getSuppressed();
    java.lang.String str4 = ownerException0.toString();
    java.lang.String str5 = ownerException0.toString();
    java.lang.String str6 = ownerException0.toString();
    com.example.unifood.exceptions.ReviewException reviewException7 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException8 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str9 = invalidRestaurantIdException8.toString();
    reviewException7.addSuppressed((java.lang.Throwable)invalidRestaurantIdException8);
    java.lang.Throwable[] throwable_array11 = reviewException7.getSuppressed();
    java.lang.Throwable[] throwable_array12 = reviewException7.getSuppressed();
    ownerException0.addSuppressed((java.lang.Throwable)reviewException7);
    com.example.unifood.exceptions.InvalidProductCostException invalidProductCostException14 = new com.example.unifood.exceptions.InvalidProductCostException();
    java.lang.Throwable[] throwable_array15 = invalidProductCostException14.getSuppressed();
    ownerException0.addSuppressed((java.lang.Throwable)invalidProductCostException14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str4.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str9.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array15);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    university1.setId("c0fe21ef-f189-46a8-a70f-f3ef267fcccb");
    java.util.List<java.lang.String> list_str10 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "87d1bfbf-0bbd-4805-9ddc-728fc0661b60"+ "'", str2.equals("87d1bfbf-0bbd-4805-9ddc-728fc0661b60"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "87d1bfbf-0bbd-4805-9ddc-728fc0661b60"+ "'", str5.equals("87d1bfbf-0bbd-4805-9ddc-728fc0661b60"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("5f5c4b81-254c-4177-bece-07521f3cb9d5", (float)(byte)0, "9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.String str4 = product3.getName();
    product3.setId("9728848b-4ae9-472f-9679-04acb178c69c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5f5c4b81-254c-4177-bece-07521f3cb9d5"+ "'", str4.equals("5f5c4b81-254c-4177-bece-07521f3cb9d5"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    review0.setUserId("6f50f37a-6c53-4a1c-aa71-362094a47134");
    review0.setId("42760a12-bbeb-4085-9c62-6d487a4eb9d4");
    review0.setId("dbae6fea-b374-45ff-aeee-aeb383ca33f8");

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    java.lang.String str31 = campus0.getId();
    boolean b33 = campus0.removeRestaurant("10649ddd-831c-4a5d-b54e-db55a76d1419");
    boolean b35 = campus0.removeRestaurant("c31f3d5f-78cf-4dfa-8587-cc944b8072df");
    campus0.setId("61147561-d24f-4a49-b295-70696006c96d");
    java.util.List<java.lang.String> list_str38 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "3c4933cd-5941-4d98-8313-da6d893649f9"+ "'", str31.equals("3c4933cd-5941-4d98-8313-da6d893649f9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }

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
    product12.setDescription("2dec27be-ce11-4aab-86be-6920ed7be5f6");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "3a53e662-7872-4db2-bde4-153711fdd17a"+ "'", str22.equals("3a53e662-7872-4db2-bde4-153711fdd17a"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("53d740cc-3498-48a3-8d69-2631da037847", (float)100L, "c81d3daf-7c34-4870-802e-061eeb5c81e5");

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("c11d9b42-1817-4b6b-96e0-43ad37cbf5d4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "631ef8e1-304d-49b8-82b3-d4ff5ea894b7"+ "'", str2.equals("631ef8e1-304d-49b8-82b3-d4ff5ea894b7"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    review0.setUserId("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.lang.String str8 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str8.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }

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
    com.example.unifood.models.Review review54 = new com.example.unifood.models.Review();
    java.lang.String str55 = review54.getId();
    java.lang.String str56 = review54.getUserId();
    review54.setRestaurantId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.lang.String str59 = review54.getId();
    java.lang.String str60 = review54.getDate();
    restaurant3.addReview(review54);
    review54.setUserId("60577e7c-fb44-4666-a879-a76c717707a2");
    review54.setRate((float)(byte)0);
    
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
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "3061e90e-4357-4ae1-9fdb-d35a7c9565f1"+ "'", str55.equals("3061e90e-4357-4ae1-9fdb-d35a7c9565f1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "3061e90e-4357-4ae1-9fdb-d35a7c9565f1"+ "'", str59.equals("3061e90e-4357-4ae1-9fdb-d35a7c9565f1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("c1ae1892-b492-41e0-9d4c-c9cd686e8a51", "799cc969-9628-4190-a2e0-6388f630d6e5", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidLocalizationException");
    } catch (com.example.unifood.exceptions.InvalidLocalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }

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
    java.lang.String str89 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "57606306-80c5-48cc-8531-b0d3aa94493f"+ "'", str8.equals("57606306-80c5-48cc-8531-b0d3aa94493f"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + ""+ "'", str89.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("");
    ownerInfo0.setRestaurantId("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    ownerInfo0.setRestaurantId("b38cc914-cd4c-4f74-ba13-b1e6dd295cbc");

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    java.util.List<com.example.unifood.models.Review> list_review7 = null;
    restaurant0.setReviewList(list_review7);
    restaurant0.setRate((java.lang.Float)(-1.0f));
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6", "fde75b42-0c98-4497-90a3-eaf498e34ad2", "b6792249-a15c-420b-9817-44c9aa457e85");
    java.lang.String str15 = restaurant14.getName();
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant14.getProductList();
    restaurant0.setProductList(list_product16);
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant21.setName("12/03/2017");
    java.lang.String str24 = restaurant21.getUserId();
    boolean b25 = restaurant21.getApproved();
    restaurant21.setLocalization("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    java.lang.String str29 = review28.getDate();
    review28.setRate((float)0);
    review28.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review28.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str36 = review28.getComment();
    boolean b37 = restaurant21.removeReview(review28);
    java.lang.String str38 = review28.getRestaurantId();
    review28.setComment("ca4a646d-3cc8-4cc0-9b41-40eb17520a41");
    boolean b41 = restaurant0.removeReview(review28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"+ "'", str15.equals("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"+ "'", str36.equals("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("f66e2559-c7f0-4b76-b5e5-3ba85f13bec8", "3b086d4f-8bdf-4b78-9c8d-29e7f4e3821b", (float)(short)-1, "76691b3d-de37-4ae5-aed2-fa67a67e52b3");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }

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
    java.util.List<com.example.unifood.models.Product> list_product88 = restaurant3.getProductList();
    restaurant3.setRate((java.lang.Float)(-1.0f));
    
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
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "ca3cddb3-8327-4152-99b8-726c53d67698"+ "'", str57.equals("ca3cddb3-8327-4152-99b8-726c53d67698"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "c8c4c89d-94aa-4c70-b6ca-bf0f5256bfd4"+ "'", str84.equals("c8c4c89d-94aa-4c70-b6ca-bf0f5256bfd4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f86 + "' != '" + 0.0f+ "'", f86.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product88);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setName("");
    product0.setCost((float)(byte)10);
    product0.setAvailability(true);
    java.lang.String str9 = product0.getDescription();
    java.lang.String str10 = product0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "582af8ce-e96c-4d08-81a0-aa50ef3dc366"+ "'", str10.equals("582af8ce-e96c-4d08-81a0-aa50ef3dc366"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    java.lang.String str10 = restaurant0.getName();
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setName("b676177c-e64a-41a0-8888-7f2dd89e8060");
    boolean b14 = university1.removeCampus("62987e65-841a-4428-9a65-871cfb981131");
    boolean b16 = university1.addCampus("");
    java.util.List<java.lang.String> list_str17 = null;
    university1.setAllCampus(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }

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
    java.lang.String str27 = review21.getUserId();
    java.lang.String str28 = review21.getUserId();
    review21.setDate("d35b5e0e-0f2f-49bf-a4af-7d8ba44b0b14");
    java.lang.String str31 = review21.getRestaurantId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("e4d01025-945d-482e-b8db-4905c06a3464");
    university1.setId("1f75d645-93ac-43f9-8043-b31f312517aa");
    boolean b5 = university1.removeCampus("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b7 = university1.removeCampus("b72c6d4d-8b11-4af0-987d-b2e50e234e0a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("com.example.unifood.exceptions.OwnerException");
    ownerInfo0.setRestaurantId("d198c136-7f06-4fac-8327-5bfd4cfb76bd");

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("72338ee2-a356-46bb-99fb-43138ddce450");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }

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
    java.lang.String str38 = product29.getDescription();
    product29.setCost((float)1L);
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str38.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    java.lang.String str12 = campus0.getName();
    campus0.setId("7f0c5da1-751c-44ab-9017-0534ac704383");
    java.lang.String str15 = campus0.getName();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("4b609f41-02d4-4c64-860a-cf7e03878d55");

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("2d88e3e8-25d3-48e6-8156-fc7a40cbf371");

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("2688a34f-d13c-4dac-8b6f-83522c9be91d");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2688a34f-d13c-4dac-8b6f-83522c9be91d"+ "'", str2.equals("2688a34f-d13c-4dac-8b6f-83522c9be91d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2688a34f-d13c-4dac-8b6f-83522c9be91d"+ "'", str3.equals("2688a34f-d13c-4dac-8b6f-83522c9be91d"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.Throwable[] throwable_array3 = ownerException0.getSuppressed();
    java.lang.String str4 = ownerException0.toString();
    java.lang.String str5 = ownerException0.toString();
    java.lang.String str6 = ownerException0.toString();
    java.lang.Throwable[] throwable_array7 = ownerException0.getSuppressed();
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException8 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException9 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException8.addSuppressed((java.lang.Throwable)invalidCampusNameException9);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException11 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException9.addSuppressed((java.lang.Throwable)invalidDescriptionException11);
    com.example.unifood.exceptions.UserException userException13 = new com.example.unifood.exceptions.UserException();
    java.lang.String str14 = userException13.toString();
    invalidDescriptionException11.addSuppressed((java.lang.Throwable)userException13);
    com.example.unifood.exceptions.OwnerException ownerException16 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException17 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException16.addSuppressed((java.lang.Throwable)invalidCampusIdException17);
    java.lang.String str19 = ownerException16.toString();
    java.lang.String str20 = ownerException16.toString();
    userException13.addSuppressed((java.lang.Throwable)ownerException16);
    com.example.unifood.exceptions.InvalidDateException invalidDateException22 = new com.example.unifood.exceptions.InvalidDateException();
    java.lang.Throwable[] throwable_array23 = invalidDateException22.getSuppressed();
    java.lang.Throwable[] throwable_array24 = invalidDateException22.getSuppressed();
    java.lang.Throwable[] throwable_array25 = invalidDateException22.getSuppressed();
    userException13.addSuppressed((java.lang.Throwable)invalidDateException22);
    ownerException0.addSuppressed((java.lang.Throwable)invalidDateException22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str4.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str14.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str19.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str20.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array25);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }

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
    float f27 = review21.getRate();
    java.lang.String str28 = review21.getComment();
    float f29 = review21.getRate();
    java.lang.String str30 = review21.getUserId();
    java.lang.String str31 = review21.getUserId();
    
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
    org.junit.Assert.assertTrue(f27 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f29 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setId("a04223f0-b1c0-449c-afab-59a81cef4343");
    review0.setRate(1.0f);
    review0.setId("");

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    userInfo0.setLastName("d79eb575-1516-48cb-995e-b14777ef3e1b");
    java.lang.String str4 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d79eb575-1516-48cb-995e-b14777ef3e1b"+ "'", str4.equals("d79eb575-1516-48cb-995e-b14777ef3e1b"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.setRate((java.lang.Float)100.0f);
    restaurant0.setRate((java.lang.Float)0.0f);
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.lang.String str11 = restaurant7.getId();
    restaurant7.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f18 = product17.getCost();
    java.lang.String str19 = product17.getId();
    restaurant7.addProduct(product17);
    restaurant7.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    boolean b24 = restaurant7.equals((java.lang.Object)"63d9aec0-76a5-435f-9c93-e0aac2c8b34e");
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant7.getProductList();
    restaurant0.setProductList(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "38627d89-89db-4e63-9ec9-260e108a2f30"+ "'", str11.equals("38627d89-89db-4e63-9ec9-260e108a2f30"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "cb4c141a-82fd-49f7-87b7-4a065d88f27f"+ "'", str19.equals("cb4c141a-82fd-49f7-87b7-4a065d88f27f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getDate();
    java.lang.String str8 = review0.getRestaurantId();
    review0.setRestaurantId("b1e0ce4f-fe08-425e-8497-24824ac3c0d9");
    java.lang.String str11 = review0.getRestaurantId();
    java.lang.String str12 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "b1e0ce4f-fe08-425e-8497-24824ac3c0d9"+ "'", str11.equals("b1e0ce4f-fe08-425e-8497-24824ac3c0d9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    studentInfo3.setCampusId("");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    studentInfo3.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    studentInfo15.setCampusId("");
    studentInfo15.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo15.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str22 = studentInfo15.getFavProducts();
    studentInfo3.setFavProducts(list_str22);
    campus0.setRestaurants(list_str22);
    java.lang.String str25 = campus0.getId();
    java.lang.String str26 = campus0.getId();
    boolean b28 = campus0.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str29 = campus0.getId();
    java.util.List<java.lang.String> list_str30 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "2ce4c4f5-b760-4065-a51e-0ca026b05a5a"+ "'", str25.equals("2ce4c4f5-b760-4065-a51e-0ca026b05a5a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "2ce4c4f5-b760-4065-a51e-0ca026b05a5a"+ "'", str26.equals("2ce4c4f5-b760-4065-a51e-0ca026b05a5a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "2ce4c4f5-b760-4065-a51e-0ca026b05a5a"+ "'", str29.equals("2ce4c4f5-b760-4065-a51e-0ca026b05a5a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }

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
    restaurant3.setId("");
    
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

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }

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
    com.example.unifood.models.Restaurant restaurant36 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant36.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str39 = restaurant36.getLocalization();
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setRate((float)10L);
    review40.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant36.addReview(review40);
    boolean b46 = restaurant0.equals((java.lang.Object)review40);
    review40.setId("b9db2f71-df23-4bc1-b08f-e67901349f99");
    review40.setDate("330b6f77-fa09-49d4-826e-df60f56949a4");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0ce453ee-a190-45cd-afa7-f947165dd83d"+ "'", str19.equals("0ce453ee-a190-45cd-afa7-f947165dd83d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str39.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("8664e462-8683-4210-8fa3-b99e2a278578", "c2426597-cce5-40f1-893d-8aab21c1b7d0", (float)0L, "c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    review4.setId("863519d7-3889-41ea-bba9-11c654399b39");
    review4.setDate("444573ad-16f9-41c3-80ad-9cf7f58e963d");

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.String str10 = restaurant0.getUserId();
    java.lang.Float f11 = restaurant0.getRate();
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setId("");
    java.lang.String str15 = review12.getUserId();
    review12.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str18 = review12.getDate();
    review12.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    restaurant0.addReview(review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("3db35cfa-ac0a-4288-9084-8d042e570026", "977989ef-9153-4dd8-9b05-51e84928fea7", "ec6fc735-94da-495f-a50c-3f7dca3542ef");

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    product1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product1.setAvailability(true);
    java.lang.String str8 = product1.getId();
    java.lang.String str9 = product1.getDescription();
    java.lang.String str10 = product1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("ab3ba457-f9a8-416f-872c-51f3f6ab602f", "cd560d8f-28e7-4b43-b906-20258edc001d", "1caf263e-dd60-40ea-83b2-b02f90a4a805");
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    restaurant4.addProduct(product5);
    product5.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product5.setAvailability(true);
    java.lang.String str12 = product5.getId();
    java.lang.String str13 = product5.getDescription();
    restaurant3.addProduct(product5);
    boolean b15 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str12.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }

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
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    java.lang.String str25 = review24.getDate();
    float f26 = review24.getRate();
    float f27 = review24.getRate();
    boolean b28 = restaurant0.removeReview(review24);
    review24.setId("fcf4a53c-cc22-423a-bfaf-dea98ceedcea");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ee58a7f2-6271-4a70-bfc2-bb8c912456a9"+ "'", str22.equals("ee58a7f2-6271-4a70-bfc2-bb8c912456a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f27 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("de3b2f33-2f3d-4a73-b152-30d69d7dd3d4", (float)10L, "89afd63c-d576-4913-8a77-be38651f287f");

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    review5.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    review5.setDate("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.String str12 = review5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "5f549e06-72c7-4c21-9698-5857aa4f3922"+ "'", str12.equals("5f549e06-72c7-4c21-9698-5857aa4f3922"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str4 = restaurant3.getName();
    java.lang.String str5 = restaurant3.getId();
    restaurant3.setCampusId("16bc091e-53dc-406d-8c7e-15d5c23036ca");
    java.lang.String str8 = restaurant3.getShortDescription();
    boolean b10 = restaurant3.equals((java.lang.Object)"b5e92389-aa3f-4dcf-b208-d494266d63ef");
    java.lang.Float f11 = restaurant3.getRate();
    java.lang.String str12 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str4.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4b1a8022-6ec3-4efa-a8a7-f116758c9672"+ "'", str5.equals("4b1a8022-6ec3-4efa-a8a7-f116758c9672"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4b1a8022-6ec3-4efa-a8a7-f116758c9672"+ "'", str12.equals("4b1a8022-6ec3-4efa-a8a7-f116758c9672"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant7.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str10 = restaurant7.getShortDescription();
    boolean b12 = restaurant7.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant7.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
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
    restaurant7.setProductList(list_product77);
    restaurant7.setApproved(true);
    java.util.List<com.example.unifood.models.Review> list_review81 = restaurant7.getReviewList();
    restaurant3.setReviewList(list_review81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
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
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aab1f61d-d822-4782-9a93-4ec54b2a1044"+ "'", str61.equals("aab1f61d-d822-4782-9a93-4ec54b2a1044"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review81);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    university1.setId("");
    java.lang.String str6 = university1.getName();
    university1.setName("3008ed32-d91b-4093-917e-4f9e9f1ed332");
    java.lang.String str9 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str6.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "3008ed32-d91b-4093-917e-4f9e9f1ed332"+ "'", str9.equals("3008ed32-d91b-4093-917e-4f9e9f1ed332"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }

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
    review10.setDate("85ed6fab-d3ad-41a7-a821-1fbba23035bb");
    
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

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getName();
    restaurant3.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setUserId("hi!");
    restaurant7.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant7.getProductList();
    restaurant3.setProductList(list_product16);
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    boolean b20 = product19.getAvailability();
    restaurant18.addProduct(product19);
    java.util.List<com.example.unifood.models.Product> list_product22 = restaurant18.getProductList();
    restaurant18.setUserId("hi!");
    restaurant18.setName("12/03/2017");
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    java.lang.String str28 = review27.getId();
    boolean b29 = restaurant18.removeReview(review27);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    product31.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b36 = restaurant18.removeProduct(product31);
    restaurant18.setShortDescription("4dc32edb-837b-4c73-8d72-66df1a3ebd2c");
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant42.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str45 = restaurant42.getShortDescription();
    boolean b47 = restaurant42.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.util.List<com.example.unifood.models.Product> list_product48 = restaurant42.getProductList();
    restaurant18.update(restaurant42);
    java.lang.String str50 = restaurant18.getId();
    restaurant3.update(restaurant18);
    com.example.unifood.models.Review review52 = new com.example.unifood.models.Review();
    review52.setId("");
    java.lang.String str55 = review52.getUserId();
    review52.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str58 = review52.getRestaurantId();
    review52.setRate((float)(byte)0);
    java.lang.String str61 = review52.getUserId();
    review52.setRate(0.0f);
    restaurant3.addReview(review52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "cb2fee8b-156b-4509-8c36-39e3678bc33e"+ "'", str28.equals("cb2fee8b-156b-4509-8c36-39e3678bc33e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "9146967a-f261-451a-a90a-991234ebb64f"+ "'", str50.equals("9146967a-f261-451a-a90a-991234ebb64f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("c1bdd704-2a5f-4697-90c2-5510b6924b98", "2130df33-a88c-4ccc-a737-697671ae9ccc", "ed1fea83-0b78-45a8-a668-9b9922d4ac3f");

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6", "fde75b42-0c98-4497-90a3-eaf498e34ad2", "b6792249-a15c-420b-9817-44c9aa457e85");
    java.lang.String str4 = restaurant3.getName();
    java.lang.String str5 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"+ "'", str4.equals("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "fde75b42-0c98-4497-90a3-eaf498e34ad2"+ "'", str5.equals("fde75b42-0c98-4497-90a3-eaf498e34ad2"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getLocalization();
    java.lang.String str7 = restaurant3.getCampusId();
    java.lang.String str8 = restaurant3.getName();
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant3.getProductList();
    restaurant3.setApproved(true);
    restaurant3.setCampusId("6eacc6b0-0a26-41d3-b8fc-45bb4eba4a5f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str6.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str7.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str8.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2adc96c3-f320-42fb-97f3-c22c606913fb");
    studentInfo1.setCampusId("50930ca7-ab17-4356-8cfe-059790147518");
    studentInfo1.setCampusId("7cb9ce7e-e31c-4e7c-b7c4-5312e11f368c");

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("43d12eaf-b246-442e-a3ee-880b98158136");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    com.example.unifood.models.Review review8 = new com.example.unifood.models.Review("84c380a1-fee2-4bfe-82b9-7668a6f07e00", "1fcc4f0c-26bc-4946-bf17-5d8a16792f98", 0.0f, "10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str9 = review8.getDate();
    restaurant3.addReview(review8);
    java.lang.String str11 = review8.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str9.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "c2e8bd0b-983b-4874-bf6c-587c8c85e50e"+ "'", str11.equals("c2e8bd0b-983b-4874-bf6c-587c8c85e50e"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("779f9700-4252-4ad1-a10a-afa731d9e966", "ccd59dcf-7a32-4aa9-b3c0-6caab218d93f", (float)100L, "5d7cdaf1-c43a-487a-b595-7f124d74f79e", "400842b3-2dff-427a-8071-aed5b8bf12d2");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.updateRating();

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }

    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException0 = new com.example.unifood.exceptions.InvalidCampusNameException();
    com.example.unifood.exceptions.OwnerException ownerException1 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException2 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException3 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException2.addSuppressed((java.lang.Throwable)invalidCampusIdException3);
    java.lang.Throwable[] throwable_array5 = ownerException2.getSuppressed();
    java.lang.String str6 = ownerException2.toString();
    java.lang.String str7 = ownerException2.toString();
    ownerException1.addSuppressed((java.lang.Throwable)ownerException2);
    invalidCampusNameException0.addSuppressed((java.lang.Throwable)ownerException1);
    com.example.unifood.exceptions.OwnerException ownerException10 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException11 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException10.addSuppressed((java.lang.Throwable)invalidCampusIdException11);
    java.lang.Throwable[] throwable_array13 = ownerException10.getSuppressed();
    java.lang.String str14 = ownerException10.toString();
    java.lang.String str15 = ownerException10.toString();
    java.lang.String str16 = ownerException10.toString();
    java.lang.Throwable[] throwable_array17 = ownerException10.getSuppressed();
    com.example.unifood.exceptions.InvalidRestaurantId invalidRestaurantId18 = new com.example.unifood.exceptions.InvalidRestaurantId();
    ownerException10.addSuppressed((java.lang.Throwable)invalidRestaurantId18);
    ownerException1.addSuppressed((java.lang.Throwable)ownerException10);
    java.lang.String str21 = ownerException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str7.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str14.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str15.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str16.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str21.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setId("27e81862-1940-4e19-a518-e7bda686ecaa");
    java.lang.String str13 = university1.getName();
    boolean b15 = university1.removeCampus("f0d566cb-cf48-40dc-b17a-8082bca32a82");
    boolean b17 = university1.removeCampus("05157eab-9608-4ec2-b90e-ab6b8fcb8e1f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str13.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }

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
    campus0.setId("21f78864-e8dd-4121-b0b0-bfd25d33cefa");
    java.util.List<java.lang.String> list_str16 = campus0.getRestaurants();
    java.lang.String str17 = campus0.getName();
    java.util.List<java.lang.String> list_str18 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0fcc8873-9e44-40f6-9794-864f3e514927"+ "'", str6.equals("0fcc8873-9e44-40f6-9794-864f3e514927"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "84c380a1-fee2-4bfe-82b9-7668a6f07e00"+ "'", str17.equals("84c380a1-fee2-4bfe-82b9-7668a6f07e00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str5 = review0.getDate();
    review0.setRestaurantId("5a768843-8dc8-45b5-baf6-85706b277c5f");
    review0.setUserId("8ef2eb1c-6eaa-459e-96ae-f92134f1053c");
    review0.setDate("811f8a1d-ca60-461d-828c-6680d7547043");
    review0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }

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
    restaurant0.setUserId("76fe9853-ea57-4556-ac71-95373a19a23f");
    com.example.unifood.models.Restaurant restaurant31 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product32 = new com.example.unifood.models.Product();
    boolean b33 = product32.getAvailability();
    restaurant31.addProduct(product32);
    java.util.List<com.example.unifood.models.Product> list_product35 = restaurant31.getProductList();
    com.example.unifood.models.Product product36 = new com.example.unifood.models.Product();
    product36.setDescription("hi!");
    boolean b39 = restaurant31.removeProduct(product36);
    java.lang.String str40 = product36.getName();
    boolean b41 = restaurant0.removeProduct(product36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "54585d3f-9c7c-460c-bbc5-626f48080616"+ "'", str10.equals("54585d3f-9c7c-460c-bbc5-626f48080616"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "32e58b9b-82f2-4ff8-862f-daad43d528f1"+ "'", str23.equals("32e58b9b-82f2-4ff8-862f-daad43d528f1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    java.util.List<java.lang.String> list_str4 = university1.getAllCampus();
    university1.setId("195fa07f-c70f-4ebf-a58e-fa03f417b14b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }

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
    restaurant0.setCampusId("774bbc3b-8131-4fe6-9b66-5bfd40d76cf8");
    java.lang.String str29 = restaurant0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "3b8c292b-70f5-4542-9de7-1db76bd44ebc"+ "'", str14.equals("3b8c292b-70f5-4542-9de7-1db76bd44ebc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    com.example.unifood.models.Review review12 = new com.example.unifood.models.Review();
    review12.setRate((float)10L);
    review12.setDate("hi!");
    review12.setId("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    boolean b19 = restaurant3.removeReview(review12);
    java.lang.String str20 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str20.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("811f8a1d-ca60-461d-828c-6680d7547043", "a6bf0ef2-fb6e-4cb6-8394-1d24ac774bd0", "5cad58f0-a042-4e13-90be-466b381fa540");
    userInfo3.setFirstName("911084da-c86d-49e6-8f26-2d8886db9319");

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant3.getReviewList();
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review();
    java.lang.String str14 = review13.getDate();
    float f15 = review13.getRate();
    float f16 = review13.getRate();
    java.lang.String str17 = review13.getId();
    float f18 = review13.getRate();
    review13.setComment("1aa0d499-6b74-40e4-ae8d-5c2cd81523c3");
    restaurant3.addReview(review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f16 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "7477c9b9-2b8d-4d8e-8ddc-ccfa31e414ab"+ "'", str17.equals("7477c9b9-2b8d-4d8e-8ddc-ccfa31e414ab"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 0.0f);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("9a21bad7-b577-4aa6-b5f2-af6ad3409249", 0.0f, "631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9a21bad7-b577-4aa6-b5f2-af6ad3409249"+ "'", str5.equals("9a21bad7-b577-4aa6-b5f2-af6ad3409249"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    boolean b4 = product3.getAvailability();
    product3.setCost((float)0L);
    java.lang.String str7 = product3.getId();
    product3.setCost((float)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "88872c0a-3f56-498b-9d98-d2368e8fd1a3"+ "'", str7.equals("88872c0a-3f56-498b-9d98-d2368e8fd1a3"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }

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
    review4.setId("a8331c8c-27d1-4b1e-9030-a2db2eb4c5c6");
    java.lang.String str18 = review4.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("edf01dd6-a35a-426f-808e-d6346b5af74f");
    university1.setId("3f1d8f40-44f8-458b-a784-7c1c32ce69d6");
    university1.setId("33dcd725-81a1-42a6-9a52-c2d63e538b90");
    boolean b7 = university1.removeCampus("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }

    com.example.unifood.models.University university0 = new com.example.unifood.models.University();
    university0.setName("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str3 = university0.getName();
    java.lang.String str4 = university0.getId();
    university0.setId("e9990043-a6ec-4857-b63d-fb3f60effac6");
    boolean b8 = university0.addCampus("9d907261-c1a7-4d7b-9f0c-b16217d30a72");
    boolean b10 = university0.removeCampus("3f3352db-2779-402c-9147-35691fcc5886");
    boolean b12 = university0.addCampus("4a1faca8-27ea-4dd8-9833-9159f8937bd9");
    com.example.unifood.models.Campus campus13 = new com.example.unifood.models.Campus();
    boolean b15 = campus13.removeRestaurant("hi!");
    campus13.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str18 = campus13.getRestaurants();
    java.lang.String str19 = campus13.getId();
    java.lang.String str20 = campus13.getName();
    campus13.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str23 = campus13.getRestaurants();
    java.lang.String str24 = campus13.getId();
    campus13.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    java.lang.String str27 = campus13.getId();
    boolean b29 = campus13.addRestaurant("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    java.lang.String str30 = campus13.getId();
    java.util.List<java.lang.String> list_str31 = campus13.getRestaurants();
    university0.setAllCampus(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str3.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12fdeac5-c216-4d38-90f0-17c9cca01c07"+ "'", str4.equals("12fdeac5-c216-4d38-90f0-17c9cca01c07"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "bd0b01af-df51-4847-90fd-5ba400614d5a"+ "'", str19.equals("bd0b01af-df51-4847-90fd-5ba400614d5a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str20.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str24.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str27.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str30.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("84e3215a-cb95-4021-8594-50fe3409fae3");
    boolean b3 = campus1.removeRestaurant("a6fbd761-6313-4b06-80fc-219e36d412cf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    restaurant3.setShortDescription("c0679c38-8adf-4203-85c8-515aaf773e20");
    restaurant3.setApproved(true);
    java.lang.Float f18 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f18 + "' != '" + 0.0f+ "'", f18.equals(0.0f));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("b7f3f51e-9bc9-4d46-b195-ea14c7c131bc");
    campus1.setName("f0abce46-2656-46af-99c4-cc4f3ce992d7");
    boolean b5 = campus1.removeRestaurant("c498b465-8861-4a4a-b6a7-a981c926b2c4");
    boolean b7 = campus1.removeRestaurant("9a973de1-f19e-44e6-977b-20785a08441c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getId();
    review0.setUserId("fde75b42-0c98-4497-90a3-eaf498e34ad2");
    review0.setDate("");
    java.lang.String str12 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str12.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo0.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("eabff7af-f000-4be0-b538-a62ae8385509");
    studentInfo0.setCampusId("db2f620b-8c95-4919-bb14-a92c528fd57b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    java.lang.String str7 = university1.getId();
    boolean b9 = university1.removeCampus("53506ad7-2d37-4e35-afb9-2f81950ae0a5");
    university1.setId("20ef1780-f60f-4692-b05d-48e3142e76c4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "93242a07-9407-4449-9e88-eff4b29b10c8"+ "'", str2.equals("93242a07-9407-4449-9e88-eff4b29b10c8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "93242a07-9407-4449-9e88-eff4b29b10c8"+ "'", str7.equals("93242a07-9407-4449-9e88-eff4b29b10c8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b9 = product8.getAvailability();
    product8.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str12 = product8.getId();
    restaurant3.addProduct(product8);
    restaurant3.updateRating();
    restaurant3.setRate((java.lang.Float)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str12.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", "com.example.unifood.exceptions.OwnerException", "a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant3.setName("d4347eb6-192e-4976-b563-60f0e7c43424");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    product7.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product7.setAvailability(true);
    restaurant3.addProduct(product7);
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    java.lang.String str16 = restaurant15.getUserId();
    java.lang.String str17 = restaurant15.getLocalization();
    restaurant15.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product21 = new com.example.unifood.models.Product();
    boolean b22 = product21.getAvailability();
    restaurant20.addProduct(product21);
    java.util.List<com.example.unifood.models.Product> list_product24 = restaurant20.getProductList();
    restaurant20.setUserId("hi!");
    restaurant20.setName("12/03/2017");
    java.lang.String str29 = restaurant20.getCampusId();
    java.lang.String str30 = restaurant20.getUserId();
    restaurant20.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.util.List<com.example.unifood.models.Review> list_review33 = restaurant20.getReviewList();
    restaurant15.setReviewList(list_review33);
    restaurant3.update(restaurant15);
    restaurant3.updateRating();
    boolean b37 = restaurant3.getApproved();
    com.example.unifood.models.Review review43 = new com.example.unifood.models.Review("add01af6-9901-43d3-950c-81f3702a5d12", "61147561-d24f-4a49-b295-70696006c96d", (float)(byte)1, "1a1f4baa-144f-4a2a-8f04-65ea83560f2d", "84fe6ce9-ea28-4361-b232-f1d6cd071155");
    boolean b44 = restaurant3.removeReview(review43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("72338ee2-a356-46bb-99fb-43138ddce450");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    boolean b8 = studentInfo6.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b10 = studentInfo6.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b12 = studentInfo6.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b14 = studentInfo6.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b16 = studentInfo6.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str17 = studentInfo6.getFavProducts();
    com.example.unifood.models.Campus campus18 = new com.example.unifood.models.Campus();
    boolean b20 = campus18.removeRestaurant("hi!");
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    studentInfo21.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    studentInfo33.setCampusId("");
    studentInfo33.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo33.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str40 = studentInfo33.getFavProducts();
    studentInfo21.setFavProducts(list_str40);
    campus18.setRestaurants(list_str40);
    java.lang.String str43 = campus18.getId();
    com.example.unifood.models.Campus campus44 = new com.example.unifood.models.Campus();
    boolean b46 = campus44.removeRestaurant("hi!");
    campus44.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str49 = campus44.getRestaurants();
    boolean b51 = campus44.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b53 = campus44.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b55 = campus44.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str56 = campus44.getName();
    com.example.unifood.models.StudentInfo studentInfo57 = new com.example.unifood.models.StudentInfo();
    studentInfo57.setCampusId("");
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str66 = new java.util.ArrayList<java.lang.String>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str66, str_array65);
    studentInfo57.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    campus44.setRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    campus18.setRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    studentInfo6.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    java.lang.String str73 = studentInfo0.getCampusId();
    boolean b75 = studentInfo0.addRestaurantToFavorites("632ff5eb-8620-437c-a9fb-33d6a7c9439f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "2815c783-bea1-497b-8a13-e59e2cef477c"+ "'", str43.equals("2815c783-bea1-497b-8a13-e59e2cef477c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str56.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "72338ee2-a356-46bb-99fb-43138ddce450"+ "'", str73.equals("72338ee2-a356-46bb-99fb-43138ddce450"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.util.List<java.lang.String> list_str3 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    studentInfo11.setCampusId("");
    studentInfo11.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo11.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavProducts();
    campus0.setRestaurants(list_str18);
    boolean b21 = campus0.removeRestaurant("983a5c4e-aa49-46e5-83ef-45159624651e");
    campus0.setId("603fd35b-ea62-491b-8376-4e5ebb75b266");
    java.lang.String str24 = campus0.getId();
    java.util.List<java.lang.String> list_str25 = campus0.getRestaurants();
    java.lang.String str26 = campus0.getName();
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo();
    studentInfo27.setCampusId("");
    java.util.List<java.lang.String> list_str30 = studentInfo27.getFavProducts();
    java.util.List<java.lang.String> list_str31 = studentInfo27.getFavProducts();
    campus0.setRestaurants(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3c75f9ee-a811-4a8a-9124-4780d1a7bf17"+ "'", str6.equals("3c75f9ee-a811-4a8a-9124-4780d1a7bf17"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "603fd35b-ea62-491b-8376-4e5ebb75b266"+ "'", str24.equals("603fd35b-ea62-491b-8376-4e5ebb75b266"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str26.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("7abf4d3d-b259-4908-8e6b-f617c87176f2");
    campus1.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    campus1.setId("0020b92d-4ba4-4529-99d7-446927e74864");
    boolean b7 = campus1.addRestaurant("a376faec-3be2-4815-b7e4-69d17b21ca91");
    boolean b9 = campus1.removeRestaurant("f8c20ede-2bde-4e30-8dfb-1a90e6639fd5");
    boolean b11 = campus1.addRestaurant("b0b0b700-7ebd-489d-85cc-58091d6c4b3e");
    boolean b13 = campus1.addRestaurant("efbb39b8-b569-44a5-8350-5d34ec9574db");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }

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
    restaurant0.setName("dcba02d6-e7c7-4e4a-bc68-a7887ae1d60f");
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review("8664e462-8683-4210-8fa3-b99e2a278578", "c2426597-cce5-40f1-893d-8aab21c1b7d0", (float)0L, "c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    review22.setDate("");
    float f25 = review22.getRate();
    restaurant0.addReview(review22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f25 == 0.0f);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b5 = studentInfo3.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.util.List<java.lang.String> list_str6 = studentInfo3.getFavProducts();
    studentInfo1.setFavRestaurants(list_str6);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    restaurant0.setRate((java.lang.Float)32.0f);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.lang.String str5 = campus1.getId();
    campus1.setName("61147561-d24f-4a49-b295-70696006c96d");
    java.lang.String str8 = campus1.getId();
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus10 = new com.example.unifood.models.Campus();
    boolean b12 = campus10.removeRestaurant("hi!");
    campus10.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str15 = campus10.getRestaurants();
    studentInfo9.setFavRestaurants(list_str15);
    studentInfo9.setCampusId("f19552d6-0add-41dc-b938-cadf800424cf");
    studentInfo9.setCampusId("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    boolean b25 = studentInfo22.delProductFromFavorites("090d4d8e-cace-44ee-8920-101722da86af");
    java.util.List<java.lang.String> list_str26 = studentInfo22.getFavRestaurants();
    com.example.unifood.models.Campus campus27 = new com.example.unifood.models.Campus();
    boolean b29 = campus27.removeRestaurant("hi!");
    java.lang.String str30 = campus27.getName();
    java.util.List<java.lang.String> list_str31 = campus27.getRestaurants();
    studentInfo22.setFavProducts(list_str31);
    studentInfo9.setFavProducts(list_str31);
    campus1.setRestaurants(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "38a318bf-afff-4c21-a18f-0b8d2ed91b6e"+ "'", str2.equals("38a318bf-afff-4c21-a18f-0b8d2ed91b6e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "38a318bf-afff-4c21-a18f-0b8d2ed91b6e"+ "'", str5.equals("38a318bf-afff-4c21-a18f-0b8d2ed91b6e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "38a318bf-afff-4c21-a18f-0b8d2ed91b6e"+ "'", str8.equals("38a318bf-afff-4c21-a18f-0b8d2ed91b6e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str4 = userInfo0.getFirstName();
    java.lang.String str5 = userInfo0.getLastName();
    userInfo0.setType("1c0d3e77-f04d-4564-ab6c-fe55e6329bc3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str4.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("00e21a5a-5aa7-4054-9709-3bcb570ee9a4");

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.lang.String str5 = campus1.getId();
    boolean b7 = campus1.removeRestaurant("e2c5a479-863d-468d-b3ec-388be48481a6");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus9 = new com.example.unifood.models.Campus();
    boolean b11 = campus9.removeRestaurant("hi!");
    campus9.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str14 = campus9.getRestaurants();
    studentInfo8.setFavRestaurants(list_str14);
    java.lang.String str16 = studentInfo8.getCampusId();
    java.lang.String str17 = studentInfo8.getCampusId();
    boolean b19 = studentInfo8.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    java.lang.String[] str_array77 = new java.lang.String[] { "cde62678-4a38-48f3-8486-51d54fb5e8c8", "016f7a51-1523-4248-8cce-d7af4447fbc2", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "9cef684b-9583-4350-bc7f-52fdf83f721b", "b9a35319-fcc8-40c8-9a6c-cc193698fa7e", "2016930c-728d-45c5-a236-9c4833a30246", "2b840dda-3718-464e-a39f-2e9719d2b246", "8ce830fe-1366-4bd5-a822-511d9d102587", "8ce830fe-1366-4bd5-a822-511d9d102587", "c1d3b8a3-adce-431f-a302-6cd30c1e553d", "com.example.unifood.exceptions.UserException", "com.example.unifood.exceptions.InvalidRestaurantNameException", "5a768843-8dc8-45b5-baf6-85706b277c5f", "1cc346cd-7e37-4aa5-a18f-4211b5a529c9", "3db35cfa-ac0a-4288-9084-8d042e570026", "322c0567-95f6-47cd-bed2-9cdd49776e37", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "c0679c38-8adf-4203-85c8-515aaf773e20", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "f79ee0cc-de3f-4609-8494-f27553a1bb32", "9741db0d-f106-4ae0-9562-dbd17d50d5a3", "811f8a1d-ca60-461d-828c-6680d7547043", "322c0567-95f6-47cd-bed2-9cdd49776e37", "4dc32edb-837b-4c73-8d72-66df1a3ebd2c", "e38e11da-1219-443d-93b7-8c6ea82bea05", "f6ca0495-0d1d-4653-b4e4-20d665aafe5f", "c81d3daf-7c34-4870-802e-061eeb5c81e5", "efbb39b8-b569-44a5-8350-5d34ec9574db", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "15149c67-efc5-4744-85b0-8dc2ac121df7", "49976e80-f69f-4380-aa76-dc904dcb2eca", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "49b07ce6-aac6-463b-a3cc-21e21430bc86", "53d5e04e-abb5-45a7-a278-d742367421a0", "9d54bba1-c011-40fe-a86a-2b02e99ae523", "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8", "09c560d8-ad4a-4efc-a7b7-3894259139d4", "", "d054f793-8da1-4b53-9056-26346d97b155", "49976e80-f69f-4380-aa76-dc904dcb2eca", "f71e4521-c797-403b-bb13-9b84cfa3a1f7", "090d4d8e-cace-44ee-8920-101722da86af", "9e087ae8-80e1-4932-9bf9-0925df2c9f7e", "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b", "a04223f0-b1c0-449c-afab-59a81cef4343", "e2c7a34a-8060-4430-9d69-dd5848b101c6", "7b379d86-fcc6-43c8-a85d-c887cc492e73", "15149c67-efc5-4744-85b0-8dc2ac121df7", "a339ea1e-a8f5-4f77-af1e-264cde0ed0dd", "7fb4b671-eeeb-4d73-8c40-91baed7167c3", "016f7a51-1523-4248-8cce-d7af4447fbc2", "8e6dda6d-66e5-4521-8634-e164e3b1c34c", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9", "8ce830fe-1366-4bd5-a822-511d9d102587" };
    java.util.ArrayList<java.lang.String> arraylist_str78 = new java.util.ArrayList<java.lang.String>();
    boolean b79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str78, str_array77);
    studentInfo8.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str78);
    campus1.setRestaurants((java.util.List<java.lang.String>)arraylist_str78);
    java.lang.String str82 = campus1.getId();
    java.lang.String str83 = campus1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "c2d8fffe-ee77-4227-8383-13da530e93ea"+ "'", str2.equals("c2d8fffe-ee77-4227-8383-13da530e93ea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c2d8fffe-ee77-4227-8383-13da530e93ea"+ "'", str5.equals("c2d8fffe-ee77-4227-8383-13da530e93ea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "c2d8fffe-ee77-4227-8383-13da530e93ea"+ "'", str82.equals("c2d8fffe-ee77-4227-8383-13da530e93ea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "c2d8fffe-ee77-4227-8383-13da530e93ea"+ "'", str83.equals("c2d8fffe-ee77-4227-8383-13da530e93ea"));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setApproved(true);
    java.lang.String str14 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setLastName("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    userInfo0.setLastName("382cd5b8-933c-4db4-a442-b8b579ccd349");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }

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
    review16.setRestaurantId("119a3a4e-78a9-4084-a205-4bc1e89469d8");
    review16.setId("4d2bca4d-884c-437d-bd71-d78cf7039f36");
    java.lang.String str27 = review16.getDate();
    java.lang.String str28 = review16.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "64a174b7-c8e6-48f7-bd49-217619611384"+ "'", str27.equals("64a174b7-c8e6-48f7-bd49-217619611384"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4d2bca4d-884c-437d-bd71-d78cf7039f36"+ "'", str28.equals("4d2bca4d-884c-437d-bd71-d78cf7039f36"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    java.lang.String str14 = restaurant9.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "547a1466-2eaa-4755-92d8-1303c29c5307"+ "'", str5.equals("547a1466-2eaa-4755-92d8-1303c29c5307"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str14.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("55828b2f-d311-46b6-8244-bd26feb289f6", "3b08a5fd-f20f-4686-98ee-474644e88c24", "d0efb8a3-3c54-4621-acb0-0ceb72881372");

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }

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
    java.util.List<java.lang.String> list_str17 = campus1.getRestaurants();
    boolean b19 = campus1.addRestaurant("4bccc731-d990-49ff-a4db-d204d91edd1a");
    boolean b21 = campus1.addRestaurant("55763602-a4bd-4dd4-9876-48d4b9c1c63a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0300f5b2-4230-4e90-9aba-0818b4be87d8"+ "'", str2.equals("0300f5b2-4230-4e90-9aba-0818b4be87d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0300f5b2-4230-4e90-9aba-0818b4be87d8"+ "'", str16.equals("0300f5b2-4230-4e90-9aba-0818b4be87d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setLastName("e2c7a34a-8060-4430-9d69-dd5848b101c6");
    userInfo0.setFirstName("ab3ba457-f9a8-416f-872c-51f3f6ab602f");
    java.lang.String str9 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ab3ba457-f9a8-416f-872c-51f3f6ab602f"+ "'", str9.equals("ab3ba457-f9a8-416f-872c-51f3f6ab602f"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e", 10.0f, "9cef684b-9583-4350-bc7f-52fdf83f721b");
    product3.setCost((float)(short)1);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Restaurant restaurant4 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant4.setName("12/03/2017");
    java.lang.String str7 = restaurant4.getUserId();
    restaurant4.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review10 = new com.example.unifood.models.Review();
    java.lang.String str11 = review10.getId();
    boolean b12 = restaurant4.equals((java.lang.Object)review10);
    restaurant4.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant15.getProductList();
    restaurant15.setUserId("hi!");
    restaurant15.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant15.getReviewList();
    restaurant4.setReviewList(list_review24);
    restaurant0.setReviewList(list_review24);
    restaurant0.setCampusId("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    review29.setRate((float)10L);
    review29.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    review29.setComment("1ac6ab5e-a672-4895-adf4-57ec7d2244b0");
    boolean b36 = restaurant0.equals((java.lang.Object)review29);
    com.example.unifood.models.Product product37 = new com.example.unifood.models.Product();
    product37.setDescription("hi!");
    java.lang.String str40 = product37.getDescription();
    product37.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str43 = product37.getDescription();
    java.lang.String str44 = product37.getId();
    boolean b45 = restaurant0.removeProduct(product37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "29a6205f-b4ba-48ca-a2e6-56e93a15bf17"+ "'", str11.equals("29a6205f-b4ba-48ca-a2e6-56e93a15bf17"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str44.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    product5.setDescription("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    java.lang.String str11 = product5.getDescription();
    product5.setDescription("240f8c33-472b-47f7-9c46-778e3e93a08b");
    java.lang.String str14 = product5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a9752be3-f00e-485e-ba2f-6e7d226fd1e4"+ "'", str11.equals("a9752be3-f00e-485e-ba2f-6e7d226fd1e4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("9286ccae-0e02-46c6-8838-d583aa896251", "", (-1.0f), "e0c0f536-be16-493b-bbad-a9881c65a452");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("70b5ca2b-e711-47c9-9b12-1ac5733682bc");
    java.lang.String str2 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "deaed963-7c50-4aae-9ec7-6ea6d81b00b2"+ "'", str2.equals("deaed963-7c50-4aae-9ec7-6ea6d81b00b2"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    com.example.unifood.models.Review review8 = new com.example.unifood.models.Review();
    java.lang.String str9 = review8.getDate();
    java.lang.String str10 = review8.getId();
    java.lang.String str11 = review8.getComment();
    review8.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str14 = review8.getRestaurantId();
    java.lang.String str15 = review8.getUserId();
    boolean b16 = restaurant0.removeReview(review8);
    review8.setDate("cd560d8f-28e7-4b43-b906-20258edc001d");
    review8.setRate((float)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "a3063fa2-ac09-49df-9bcb-58540be683d4"+ "'", str10.equals("a3063fa2-ac09-49df-9bcb-58540be683d4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setCampusId("ced1f535-42a1-41b6-914a-7e282afaf033");
    restaurant3.setRate((java.lang.Float)100.0f);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getName();
    java.lang.String str2 = campus0.getId();
    boolean b4 = campus0.addRestaurant("d2c2fbe4-11c9-4b40-8f93-21119a352764");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d0c27dee-2e5d-4326-bdbb-a8b576db40a6"+ "'", str2.equals("d0c27dee-2e5d-4326-bdbb-a8b576db40a6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }

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
    java.lang.String str25 = restaurant9.getShortDescription();
    java.lang.Object obj26 = null;
    boolean b27 = restaurant9.equals(obj26);
    restaurant9.updateRating();
    java.lang.String str29 = restaurant9.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "e9fd89ef-bab1-4e29-b1b3-f7154d9c2b63"+ "'", str5.equals("e9fd89ef-bab1-4e29-b1b3-f7154d9c2b63"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "57325cf4-2a46-4562-9085-f4cafcac5d05"+ "'", str17.equals("57325cf4-2a46-4562-9085-f4cafcac5d05"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getUserId();
    java.lang.String str6 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    java.lang.String str15 = review14.getId();
    boolean b16 = restaurant7.removeReview(review14);
    review14.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review14.setDate("92bd5a25-a00e-49b4-a7a1-66e0e6465991");
    boolean b21 = restaurant3.removeReview(review14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "eac286c1-5439-4a3c-b8d3-906512643b3d"+ "'", str6.equals("eac286c1-5439-4a3c-b8d3-906512643b3d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0e38c516-f2bd-4a59-b2e9-ca0cd5b3655a"+ "'", str15.equals("0e38c516-f2bd-4a59-b2e9-ca0cd5b3655a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    float f5 = product3.getCost();
    java.lang.String str6 = product3.getName();
    java.lang.String str7 = product3.getDescription();
    java.lang.String str8 = product3.getDescription();
    boolean b9 = product3.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "e8588626-52d3-4ed2-8bd5-24c0755bae64"+ "'", str6.equals("e8588626-52d3-4ed2-8bd5-24c0755bae64"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/03/2017"+ "'", str7.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/03/2017"+ "'", str8.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getFirstName();
    userInfo3.setLastName("e0ed8f18-1a95-4336-80ad-e0e638d2b763");
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "d2c231e2-7a36-4c3e-85a5-77d4735a3460"+ "'", str5.equals("d2c231e2-7a36-4c3e-85a5-77d4735a3460"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "d2c231e2-7a36-4c3e-85a5-77d4735a3460"+ "'", str6.equals("d2c231e2-7a36-4c3e-85a5-77d4735a3460"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    restaurant3.updateRating();
    java.util.List<com.example.unifood.models.Review> list_review9 = restaurant3.getReviewList();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    product10.setDescription("hi!");
    java.lang.String str13 = product10.getDescription();
    product10.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str16 = product10.getDescription();
    product10.setAvailability(false);
    restaurant3.addProduct(product10);
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    review20.setId("");
    java.lang.String str23 = review20.getUserId();
    review20.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review20.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review20.setRate((float)(-1L));
    java.lang.String str30 = review20.getRestaurantId();
    restaurant3.addReview(review20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "59b9b6b7-5013-485e-b2cb-0081fb851fe7"+ "'", str5.equals("59b9b6b7-5013-485e-b2cb-0081fb851fe7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("fdd6fe26-c06a-4669-980f-9d4510d42ff7");

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    campus0.setName("356355fb-92eb-464e-ae48-bb58ea231323");
    campus0.setName("d5361f91-34f2-40b8-8873-232fde8af91a");
    java.lang.String str16 = campus0.getId();
    campus0.setId("");
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ec0982d0-d24f-49c0-872c-4e7d42be626b"+ "'", str16.equals("ec0982d0-d24f-49c0-872c-4e7d42be626b"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(false);
    restaurant0.setName("0f5cd045-5aec-4f06-873a-ae9424257334");
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b15 = restaurant14.getApproved();
    java.lang.String str16 = restaurant14.getId();
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str21 = restaurant20.getShortDescription();
    java.lang.Float f22 = restaurant20.getRate();
    restaurant14.update(restaurant20);
    java.util.List<com.example.unifood.models.Product> list_product24 = restaurant20.getProductList();
    restaurant0.setProductList(list_product24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "202727e0-c3ad-41f2-a3d4-540fcdfb0e47"+ "'", str16.equals("202727e0-c3ad-41f2-a3d4-540fcdfb0e47"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f22 + "' != '" + 0.0f+ "'", f22.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product24);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.Throwable[] throwable_array3 = ownerException0.getSuppressed();
    java.lang.String str4 = ownerException0.toString();
    java.lang.String str5 = ownerException0.toString();
    java.lang.String str6 = ownerException0.toString();
    com.example.unifood.exceptions.InvalidLastNameException invalidLastNameException7 = new com.example.unifood.exceptions.InvalidLastNameException();
    java.lang.String str8 = invalidLastNameException7.toString();
    ownerException0.addSuppressed((java.lang.Throwable)invalidLastNameException7);
    java.lang.String str10 = invalidLastNameException7.toString();
    java.lang.String str11 = invalidLastNameException7.toString();
    java.lang.Throwable[] throwable_array12 = invalidLastNameException7.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str4.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.example.unifood.exceptions.InvalidLastNameException"+ "'", str8.equals("com.example.unifood.exceptions.InvalidLastNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "com.example.unifood.exceptions.InvalidLastNameException"+ "'", str10.equals("com.example.unifood.exceptions.InvalidLastNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.InvalidLastNameException"+ "'", str11.equals("com.example.unifood.exceptions.InvalidLastNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array12);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setLastName("5a768843-8dc8-45b5-baf6-85706b277c5f");
    userInfo0.setFirstName("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    userInfo0.setFirstName("hi!");
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setLastName("9a973de1-f19e-44e6-977b-20785a08441c");
    userInfo0.setFirstName("6992eb4f-3c6c-4d4a-8498-026ac24e5e58");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus0.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.lang.String str16 = campus0.getName();
    campus0.setId("d4347eb6-192e-4976-b563-60f0e7c43424");
    java.lang.String str19 = campus0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "55dabc7b-3fe7-4421-a040-d45c92cd70da"+ "'", str16.equals("55dabc7b-3fe7-4421-a040-d45c92cd70da"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "d4347eb6-192e-4976-b563-60f0e7c43424"+ "'", str19.equals("d4347eb6-192e-4976-b563-60f0e7c43424"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    university1.setName("444573ad-16f9-41c3-80ad-9cf7f58e963d");

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getId();
    float f5 = review0.getRate();
    review0.setDate("c1d3b8a3-adce-431f-a302-6cd30c1e553d");
    java.lang.String str8 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "8b4616ca-8cd9-4826-b162-bba793ab55cd"+ "'", str4.equals("8b4616ca-8cd9-4826-b162-bba793ab55cd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    review0.setId("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    java.lang.String str8 = review0.getDate();
    review0.setDate("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    review0.setComment("2d9e2d9d-ea4e-4dcd-b114-7ed35b6d6624");
    java.lang.String str13 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4e740018-e511-4721-9cc2-01626f320c53"+ "'", str2.equals("4e740018-e511-4721-9cc2-01626f320c53"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "7ff1c0bd-5a10-4372-9b80-46c986b3ecc2"+ "'", str13.equals("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("d308f4d9-d3c5-4e74-aea6-2790f37f5faa", "d198c136-7f06-4fac-8327-5bfd4cfb76bd", (float)(short)100, "9b87490e-9ffd-4b58-ba02-a22a8fb1d138");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }

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
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant3.getReviewList();
    java.lang.String str17 = restaurant3.getUserId();
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    boolean b20 = product19.getAvailability();
    restaurant18.addProduct(product19);
    java.util.List<com.example.unifood.models.Product> list_product22 = restaurant18.getProductList();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    product23.setDescription("hi!");
    boolean b26 = restaurant18.removeProduct(product23);
    restaurant18.setCampusId("com.example.unifood.exceptions.OwnerException");
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review34.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    restaurant18.addReview(review34);
    float f38 = review34.getRate();
    restaurant3.addReview(review34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f38 == 1.0f);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str14 = campus0.getId();
    java.util.List<java.lang.String> list_str15 = campus0.getRestaurants();
    boolean b17 = campus0.removeRestaurant("");
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "33564e7d-82c8-427f-8fbc-be1165435367"+ "'", str14.equals("33564e7d-82c8-427f-8fbc-be1165435367"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getLastName();
    userInfo3.setLastName("5b6ebc9c-43c6-47d0-8d4b-30245bf2474b");
    userInfo3.setLastName("cb0a971d-eb4a-4b00-b439-c854b01d6836");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str6.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("hi!");
    java.lang.String str6 = university5.getId();
    boolean b8 = university5.addCampus("hi!");
    java.lang.String str9 = university5.getId();
    university5.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    com.example.unifood.models.University university13 = new com.example.unifood.models.University("hi!");
    boolean b15 = university13.removeCampus("hi!");
    com.example.unifood.models.University university17 = new com.example.unifood.models.University("hi!");
    java.lang.String str18 = university17.getId();
    boolean b20 = university17.addCampus("hi!");
    java.lang.String str21 = university17.getId();
    university17.setName("12/03/2017");
    java.util.List<java.lang.String> list_str24 = university17.getAllCampus();
    university13.setAllCampus(list_str24);
    java.util.List<java.lang.String> list_str26 = university13.getAllCampus();
    university5.setAllCampus(list_str26);
    studentInfo1.setFavRestaurants(list_str26);
    com.example.unifood.models.University university30 = new com.example.unifood.models.University("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b32 = university30.addCampus("aabd70ed-be9f-4452-9625-3f6b64c27121");
    boolean b34 = university30.addCampus("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    boolean b36 = university30.addCampus("15149c67-efc5-4744-85b0-8dc2ac121df7");
    com.example.unifood.models.Campus campus37 = new com.example.unifood.models.Campus();
    boolean b39 = campus37.removeRestaurant("hi!");
    campus37.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str42 = campus37.getRestaurants();
    boolean b44 = campus37.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    com.example.unifood.models.University university46 = new com.example.unifood.models.University("hi!");
    java.lang.String str47 = university46.getId();
    boolean b49 = university46.addCampus("hi!");
    java.lang.String str50 = university46.getId();
    university46.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str53 = university46.getId();
    java.util.List<java.lang.String> list_str54 = university46.getAllCampus();
    campus37.setRestaurants(list_str54);
    university30.setAllCampus(list_str54);
    studentInfo1.setFavRestaurants(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2a880965-c352-4ff5-aa63-595aed03a5ad"+ "'", str6.equals("2a880965-c352-4ff5-aa63-595aed03a5ad"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2a880965-c352-4ff5-aa63-595aed03a5ad"+ "'", str9.equals("2a880965-c352-4ff5-aa63-595aed03a5ad"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "a5e22079-bdfa-4643-aa2b-c14ac6387a2e"+ "'", str18.equals("a5e22079-bdfa-4643-aa2b-c14ac6387a2e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "a5e22079-bdfa-4643-aa2b-c14ac6387a2e"+ "'", str21.equals("a5e22079-bdfa-4643-aa2b-c14ac6387a2e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "e3dcc376-460b-481a-aa0d-88d23bf8c9bf"+ "'", str47.equals("e3dcc376-460b-481a-aa0d-88d23bf8c9bf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "e3dcc376-460b-481a-aa0d-88d23bf8c9bf"+ "'", str50.equals("e3dcc376-460b-481a-aa0d-88d23bf8c9bf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str53.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b11 = campus0.addRestaurant("7c382e92-acef-4318-a40d-158e77003992");
    java.util.List<java.lang.String> list_str12 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0746d349-2bb2-4ebc-b038-ab21ed54e0e0"+ "'", str6.equals("0746d349-2bb2-4ebc-b038-ab21ed54e0e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }

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
    review16.setRestaurantId("119a3a4e-78a9-4084-a205-4bc1e89469d8");
    review16.setId("4d2bca4d-884c-437d-bd71-d78cf7039f36");
    review16.setComment("2de766c1-a7f4-4760-87fe-299b3c07a0fb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 1.0f);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f8 = restaurant3.getRate();
    java.lang.String str9 = restaurant3.getId();
    java.lang.String str10 = restaurant3.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ecda1e05-db77-4174-bdec-7396b3c70db6"+ "'", str9.equals("ecda1e05-db77-4174-bdec-7396b3c70db6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setName("12/03/2017");
    java.lang.String str9 = restaurant0.getCampusId();
    java.lang.Float f10 = restaurant0.getRate();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product12 = new com.example.unifood.models.Product();
    boolean b13 = product12.getAvailability();
    restaurant11.addProduct(product12);
    java.util.List<com.example.unifood.models.Product> list_product15 = restaurant11.getProductList();
    restaurant11.setUserId("hi!");
    restaurant11.setName("12/03/2017");
    java.lang.String str20 = restaurant11.getCampusId();
    java.lang.String str21 = restaurant11.getUserId();
    com.example.unifood.models.Product product25 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f26 = product25.getCost();
    java.lang.String str27 = product25.getDescription();
    restaurant11.addProduct(product25);
    boolean b29 = restaurant0.removeProduct(product25);
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    restaurant30.setShortDescription("");
    restaurant30.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant30.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant40 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product41 = new com.example.unifood.models.Product();
    boolean b42 = product41.getAvailability();
    restaurant40.addProduct(product41);
    java.util.List<com.example.unifood.models.Product> list_product44 = restaurant40.getProductList();
    restaurant30.setProductList(list_product44);
    java.util.List<com.example.unifood.models.Review> list_review46 = restaurant30.getReviewList();
    restaurant0.setReviewList(list_review46);
    java.lang.Float f48 = restaurant0.getRate();
    com.example.unifood.models.Review review49 = new com.example.unifood.models.Review();
    java.lang.String str50 = review49.getDate();
    java.lang.String str51 = review49.getId();
    java.lang.String str52 = review49.getComment();
    review49.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    review49.setId("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    java.lang.String str57 = review49.getDate();
    java.lang.String str58 = review49.getId();
    restaurant0.addReview(review49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f10 + "' != '" + 0.0f+ "'", f10.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "12/03/2017"+ "'", str27.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f48 + "' != '" + 0.0f+ "'", f48.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "d6527bfb-028e-4732-b0f5-e1833c8b6d1d"+ "'", str51.equals("d6527bfb-028e-4732-b0f5-e1833c8b6d1d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "b9a35319-fcc8-40c8-9a6c-cc193698fa7e"+ "'", str58.equals("b9a35319-fcc8-40c8-9a6c-cc193698fa7e"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("80a67ed0-77e0-4b7e-814b-c4f357e8cfef");

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }

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
    float f17 = review10.getRate();
    
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
    org.junit.Assert.assertTrue(f17 == 0.0f);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    review7.setUserId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str12 = review7.getDate();
    review7.setDate("7de577c2-7483-4581-8047-651e6a4ea04b");
    java.lang.String str15 = review7.getId();
    java.lang.String str16 = review7.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "bb7d9354-2cc4-4ef0-82ad-495df382216d"+ "'", str8.equals("bb7d9354-2cc4-4ef0-82ad-495df382216d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "bb7d9354-2cc4-4ef0-82ad-495df382216d"+ "'", str15.equals("bb7d9354-2cc4-4ef0-82ad-495df382216d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c43f6057-5d34-4ff6-9fae-884aaebeecbe", "4e8e906a-f459-4f56-91b8-d508a5663d98", "9177b50b-86bb-45a0-bcfc-679787c40e0f");

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setAvailability(true);
    java.lang.String str4 = product0.getDescription();
    product0.setName("f9942595-d2c2-4ff7-84c8-6f054ba5004a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b3 = university1.removeCampus("4955c2e9-d977-4504-8611-581feb3ea4ca");
    boolean b5 = university1.removeCampus("0443a495-187d-4e8b-baa9-bb7cbdacbe5a");
    boolean b7 = university1.addCampus("e50dfecf-123c-4fe9-949a-d7001bd6908c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }

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
    restaurant3.setId("06cccbeb-fd5c-4531-b0fc-216ad9f70ccb");
    java.util.List<com.example.unifood.models.Review> list_review27 = restaurant3.getReviewList();
    java.lang.String str28 = restaurant3.getLocalization();
    restaurant3.setId("f97e93fe-097e-4638-ad2f-364fb8cd78f6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str28.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("60577e7c-fb44-4666-a879-a76c717707a2");

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    com.example.unifood.models.University university9 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus10 = new com.example.unifood.models.Campus();
    boolean b12 = campus10.removeRestaurant("hi!");
    campus10.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str15 = campus10.getRestaurants();
    university9.setAllCampus(list_str15);
    studentInfo0.setFavRestaurants(list_str15);
    studentInfo0.setCampusId("3fcb0ac4-7d96-4071-a6d0-8f688fbf3bd8");
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str22 = studentInfo21.getFavRestaurants();
    studentInfo21.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    studentInfo21.setFavRestaurants(list_str27);
    java.lang.String str29 = studentInfo21.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus31 = new com.example.unifood.models.Campus();
    boolean b33 = campus31.removeRestaurant("hi!");
    campus31.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str36 = campus31.getRestaurants();
    studentInfo30.setFavRestaurants(list_str36);
    java.lang.String str38 = studentInfo30.getCampusId();
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
    com.example.unifood.models.Campus campus60 = new com.example.unifood.models.Campus();
    boolean b62 = campus60.removeRestaurant("hi!");
    campus60.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str65 = campus60.getRestaurants();
    studentInfo39.setFavRestaurants(list_str65);
    studentInfo30.setFavRestaurants(list_str65);
    java.util.List<java.lang.String> list_str68 = studentInfo30.getFavRestaurants();
    studentInfo21.setFavProducts(list_str68);
    studentInfo0.setFavRestaurants(list_str68);
    studentInfo0.setCampusId("16407705-dcde-470b-bc94-7740c47edfdf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "b3660a10-0a45-4a63-a48b-cafcf60da884"+ "'", str29.equals("b3660a10-0a45-4a63-a48b-cafcf60da884"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str68);

  }

}
