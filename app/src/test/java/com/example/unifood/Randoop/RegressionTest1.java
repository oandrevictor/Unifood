package com.example.unifood.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

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
    java.lang.Float f29 = restaurant19.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "c14951d4-999d-4718-b6f4-717d4d036a27"+ "'", str10.equals("c14951d4-999d-4718-b6f4-717d4d036a27"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "7acd9cc1-ce34-4b1b-aaea-10dc65149ae1"+ "'", str23.equals("7acd9cc1-ce34-4b1b-aaea-10dc65149ae1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str28.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f29 + "' != '" + 0.0f+ "'", f29.equals(0.0f));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("com.example.unifood.exceptions.OwnerException");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("e38e11da-1219-443d-93b7-8c6ea82bea05");
    ownerInfo0.setRestaurantId("9f875c13-8f07-4b49-af32-762823628ddc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str3.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("com.example.unifood.exceptions.InvalidTypeException");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

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
    studentInfo0.setCampusId("542190ad-4ed0-4058-a65b-44f5596ff8ba");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

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
    java.lang.String str41 = campus0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "05157eab-9608-4ec2-b90e-ab6b8fcb8e1f"+ "'", str41.equals("05157eab-9608-4ec2-b90e-ab6b8fcb8e1f"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delProductFromFavorites("090d4d8e-cace-44ee-8920-101722da86af");
    boolean b6 = studentInfo1.delRestaurantFromFavorites("c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    java.util.List<java.lang.String> list_str7 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

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
    restaurant3.setLocalization("0375996c-5fbe-4716-818a-5c42766daf2e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "db34ddd0-ad9d-429f-aa95-bb67ba5a21f5"+ "'", str10.equals("db34ddd0-ad9d-429f-aa95-bb67ba5a21f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("449c88c7-dd88-473f-ad8c-9c5baa213afd");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setRestaurantId("ec1c7744-8529-4314-837e-cb723075bf0b");
    java.lang.String str8 = review0.getRestaurantId();
    float f9 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ec1c7744-8529-4314-837e-cb723075bf0b"+ "'", str8.equals("ec1c7744-8529-4314-837e-cb723075bf0b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("bfdf79ec-4de1-4046-a349-5b7be8537764", "d40e1b03-f6f6-4e93-9b9a-8ed1eaf9f938", "ced63d89-3a61-486c-a2c4-2f9e06734388");
    java.lang.String str4 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ced63d89-3a61-486c-a2c4-2f9e06734388"+ "'", str4.equals("ced63d89-3a61-486c-a2c4-2f9e06734388"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2", (float)'#', "6c4c9076-aeac-4c07-b6bc-73b8d8f0a4be");
    product3.setAvailability(false);
    boolean b6 = product3.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review0.setUserId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

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
    restaurant3.setCampusId("da9049f0-e590-4d0f-a0d4-925d3285b5a2");
    restaurant3.setShortDescription("603fd35b-ea62-491b-8376-4e5ebb75b266");
    restaurant3.setLocalization("64a174b7-c8e6-48f7-bd49-217619611384");
    
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("2b840dda-3718-464e-a39f-2e9719d2b246");
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2b840dda-3718-464e-a39f-2e9719d2b246"+ "'", str7.equals("2b840dda-3718-464e-a39f-2e9719d2b246"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5b650c6a-7478-4b82-83ec-712c725c56dd", "6d874e94-287d-4dd4-b345-3dda47e1c3e2", "ef48fd18-53cd-4aba-8c06-b55c4a203e2b");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    product3.setName("");
    product3.setAvailability(false);
    product3.setCost((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review0.setRate((float)(-1L));
    review0.setRate((-1.0f));
    float f12 = review0.getRate();
    review0.setRestaurantId("com.example.unifood.exceptions.InvalidRestaurantIdException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    boolean b7 = university1.addCampus("efbb39b8-b569-44a5-8350-5d34ec9574db");
    com.example.unifood.models.Campus campus8 = new com.example.unifood.models.Campus();
    boolean b10 = campus8.removeRestaurant("hi!");
    campus8.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str13 = campus8.getRestaurants();
    boolean b15 = campus8.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b17 = campus8.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b19 = campus8.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str20 = campus8.getName();
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    studentInfo21.setCampusId("");
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    studentInfo21.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    campus8.setRestaurants((java.util.List<java.lang.String>)arraylist_str30);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str30);
    university1.setName("03d6f458-9b02-4a10-bdd2-2aab61b1d4de");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "07c397d1-b73c-4a2d-b4a8-61eb47814971"+ "'", str2.equals("07c397d1-b73c-4a2d-b4a8-61eb47814971"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str20.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

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
    review10.setRestaurantId("b2a1c763-333a-4b58-b38b-ff37f8c40e9f");
    java.lang.String str24 = review10.getUserId();
    java.lang.String str25 = review10.getUserId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5da43343-cf4e-4c7d-ac37-3c06354ba0d2", "b3c9cac2-1d31-47d7-9241-925d88e64b83", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidLocalizationException");
    } catch (com.example.unifood.exceptions.InvalidLocalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    java.lang.Float f12 = restaurant3.getRate();
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    boolean b15 = product14.getAvailability();
    restaurant13.addProduct(product14);
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    java.lang.String str20 = review17.getUserId();
    review17.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review17.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str25 = review17.getRestaurantId();
    boolean b26 = restaurant13.removeReview(review17);
    java.lang.String str27 = review17.getId();
    boolean b28 = restaurant3.removeReview(review17);
    java.lang.String str29 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "02fa70a1-34eb-43fb-9262-b5b5fdd24c9e"+ "'", str10.equals("02fa70a1-34eb-43fb-9262-b5b5fdd24c9e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f12 + "' != '" + 0.0f+ "'", f12.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str29.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

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
    com.example.unifood.models.OwnerInfo ownerInfo59 = new com.example.unifood.models.OwnerInfo();
    ownerInfo59.setRestaurantId("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str62 = ownerInfo59.getRestaurantId();
    ownerInfo59.setRestaurantId("9b94fcda-82aa-4f00-ba68-1539f5477fa0");
    java.lang.String str65 = ownerInfo59.getRestaurantId();
    java.lang.String str66 = ownerInfo59.getRestaurantId();
    boolean b67 = restaurant0.equals((java.lang.Object)ownerInfo59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2a640a55-d291-4d78-b499-cbe180a8c701"+ "'", str4.equals("2a640a55-d291-4d78-b499-cbe180a8c701"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "e7c0cebe-7647-41d1-800b-22adeb742a67"+ "'", str12.equals("e7c0cebe-7647-41d1-800b-22adeb742a67"));
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "74118629-5eda-4cac-befa-6e8d8cc96453"+ "'", str32.equals("74118629-5eda-4cac-befa-6e8d8cc96453"));
    
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
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "187a7bf3-6b4e-4001-a4eb-a3f097af48d7"+ "'", str55.equals("187a7bf3-6b4e-4001-a4eb-a3f097af48d7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str62.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "9b94fcda-82aa-4f00-ba68-1539f5477fa0"+ "'", str65.equals("9b94fcda-82aa-4f00-ba68-1539f5477fa0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "9b94fcda-82aa-4f00-ba68-1539f5477fa0"+ "'", str66.equals("9b94fcda-82aa-4f00-ba68-1539f5477fa0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

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
    review70.setId("d6f3b56e-06b1-4ffe-af0b-6861611c3b37");
    
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "83dd31e3-5ce9-4031-bbee-d53600952246"+ "'", str46.equals("83dd31e3-5ce9-4031-bbee-d53600952246"));
    
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

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

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
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product();
    boolean b23 = product22.getAvailability();
    restaurant21.addProduct(product22);
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant21.getProductList();
    restaurant21.setUserId("hi!");
    restaurant21.setName("12/03/2017");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    java.lang.String str31 = review30.getId();
    boolean b32 = restaurant21.removeReview(review30);
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    product34.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b39 = restaurant21.removeProduct(product34);
    product34.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    boolean b42 = restaurant0.removeProduct(product34);
    com.example.unifood.models.Review review43 = new com.example.unifood.models.Review();
    java.lang.String str44 = review43.getDate();
    float f45 = review43.getRate();
    float f46 = review43.getRate();
    java.lang.String str47 = review43.getUserId();
    review43.setDate("1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    review43.setId("a7ebaf4b-ff03-4b84-bd80-94754b28f994");
    boolean b52 = restaurant0.removeReview(review43);
    java.lang.String str53 = review43.getUserId();
    java.lang.String str54 = review43.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff91e1a-fc9e-4c46-a8a6-588b2e5c3792"+ "'", str10.equals("aff91e1a-fc9e-4c46-a8a6-588b2e5c3792"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "2e547ee9-f65e-4172-977f-d61698b72f82"+ "'", str31.equals("2e547ee9-f65e-4172-977f-d61698b72f82"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f45 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f46 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("8fdc456d-ad0f-4b72-a63b-f8f06d46c428", "c7f3c2dc-9d52-491f-9ed9-0736f8b15439", "4d431463-d30c-4853-b489-be677a0772e7");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo1.setFavRestaurants(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    studentInfo11.setCampusId("");
    java.util.List<java.lang.String> list_str14 = studentInfo11.getFavRestaurants();
    com.example.unifood.models.University university16 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus17 = new com.example.unifood.models.Campus();
    boolean b19 = campus17.removeRestaurant("hi!");
    campus17.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str22 = campus17.getRestaurants();
    university16.setAllCampus(list_str22);
    java.util.List<java.lang.String> list_str24 = university16.getAllCampus();
    studentInfo11.setFavRestaurants(list_str24);
    studentInfo1.setFavProducts(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "b3660a10-0a45-4a63-a48b-cafcf60da884"+ "'", str9.equals("b3660a10-0a45-4a63-a48b-cafcf60da884"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("d40e1b03-f6f6-4e93-9b9a-8ed1eaf9f938");
    java.lang.String str2 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d40e1b03-f6f6-4e93-9b9a-8ed1eaf9f938"+ "'", str2.equals("d40e1b03-f6f6-4e93-9b9a-8ed1eaf9f938"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

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
    java.lang.String str24 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "39eb97d1-5c5b-4543-8274-e5cfd95b7fc9"+ "'", str6.equals("39eb97d1-5c5b-4543-8274-e5cfd95b7fc9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str24.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    product3.setCost((float)100L);
    java.lang.String str6 = product3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/03/2017"+ "'", str6.equals("12/03/2017"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    studentInfo0.setCampusId("f19552d6-0add-41dc-b938-cadf800424cf");
    boolean b11 = studentInfo0.addProductToFavorites("d163bdfa-80ef-44e2-918e-7897348e2871");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9d907261-c1a7-4d7b-9f0c-b16217d30a72");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    boolean b3 = university1.addCampus("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str4 = university1.getName();
    com.example.unifood.models.University university6 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university6.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b10 = university6.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.util.List<java.lang.String> list_str11 = university6.getAllCampus();
    university1.setAllCampus(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

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
    boolean b15 = campus0.addRestaurant("240f8c33-472b-47f7-9c46-778e3e93a08b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9829ab86-8b35-4e41-a132-a9922f026684"+ "'", str6.equals("9829ab86-8b35-4e41-a132-a9922f026684"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9829ab86-8b35-4e41-a132-a9922f026684"+ "'", str8.equals("9829ab86-8b35-4e41-a132-a9922f026684"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9829ab86-8b35-4e41-a132-a9922f026684"+ "'", str9.equals("9829ab86-8b35-4e41-a132-a9922f026684"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b9 = restaurant8.getApproved();
    java.lang.String str10 = restaurant8.getId();
    restaurant0.update(restaurant8);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant12.getProductList();
    restaurant12.setUserId("hi!");
    restaurant12.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review21 = restaurant12.getReviewList();
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant25.setName("12/03/2017");
    java.lang.String str28 = restaurant25.getUserId();
    java.lang.String str29 = restaurant25.getLocalization();
    restaurant12.update(restaurant25);
    restaurant12.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    review33.setId("");
    java.lang.String str36 = review33.getUserId();
    java.lang.String str37 = review33.getRestaurantId();
    restaurant12.addReview(review33);
    float f39 = review33.getRate();
    boolean b40 = restaurant0.removeReview(review33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "d36682ce-28b5-4030-906b-a890e29adef8"+ "'", str10.equals("d36682ce-28b5-4030-906b-a890e29adef8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str29.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f39 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

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
    java.lang.String str21 = restaurant0.getName();
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "a5529c91-9a84-465d-a325-c3d57695c3b1"+ "'", str10.equals("a5529c91-9a84-465d-a325-c3d57695c3b1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "12/03/2017"+ "'", str21.equals("12/03/2017"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review0.setId("4b819b99-f8d3-449c-9233-2f18b7401b47");
    review0.setDate("dd2ed4d9-5bd1-4b95-b4ea-b91e2afbc01d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getRestaurantId();
    java.lang.String str7 = review0.getUserId();
    float f8 = review0.getRate();
    review0.setComment("ba061308-092f-40b1-9a8e-465a56f359d0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e463b957-416c-4a7a-9123-f0b9c9dd85b2"+ "'", str2.equals("e463b957-416c-4a7a-9123-f0b9c9dd85b2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    java.lang.String str14 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant18.setName("12/03/2017");
    java.lang.String str21 = restaurant18.getUserId();
    boolean b22 = restaurant18.getApproved();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    product23.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b27 = product23.getAvailability();
    java.lang.String str28 = product23.getDescription();
    boolean b29 = restaurant18.removeProduct(product23);
    product23.setDescription("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6");
    restaurant3.addProduct(product23);
    product23.setCost((float)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"+ "'", str14.equals("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str28.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setName("efbb39b8-b569-44a5-8350-5d34ec9574db");
    java.lang.String str6 = restaurant3.getUserId();
    java.util.List<com.example.unifood.models.Product> list_product7 = restaurant3.getProductList();
    restaurant3.updateRating();
    restaurant3.setRate((java.lang.Float)0.0f);
    java.lang.String str11 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "75e0de5b-af05-410e-9afa-c211b35b0e94"+ "'", str11.equals("75e0de5b-af05-410e-9afa-c211b35b0e94"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("64ae221d-667d-437f-870b-fef02d80a5de", "", "42ff3df8-22e9-4277-9924-c3723c127d45");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusIdException");
    } catch (com.example.unifood.exceptions.InvalidCampusIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

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
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant19.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str22 = restaurant19.getShortDescription();
    boolean b24 = restaurant19.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant19.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant30.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str33 = restaurant30.getShortDescription();
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getDate();
    java.lang.String str36 = review34.getComment();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    review37.setId("");
    java.lang.String str40 = review37.getUserId();
    com.example.unifood.models.Review review41 = new com.example.unifood.models.Review();
    review41.setRate((float)10L);
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review();
    review44.setId("");
    java.lang.String str47 = review44.getUserId();
    java.lang.String str48 = review44.getRestaurantId();
    com.example.unifood.models.Review review49 = new com.example.unifood.models.Review();
    review49.setId("");
    com.example.unifood.models.Review review57 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review57.setUserId("");
    com.example.unifood.models.Review review60 = new com.example.unifood.models.Review();
    java.lang.String str61 = review60.getDate();
    java.lang.String str62 = review60.getComment();
    com.example.unifood.models.Review review63 = new com.example.unifood.models.Review();
    review63.setId("");
    com.example.unifood.models.Review review66 = new com.example.unifood.models.Review();
    review66.setId("");
    java.lang.String str69 = review66.getUserId();
    java.lang.String str70 = review66.getRestaurantId();
    java.lang.String str71 = review66.getDate();
    com.example.unifood.models.Review review72 = new com.example.unifood.models.Review();
    java.lang.String str73 = review72.getId();
    com.example.unifood.models.Review review79 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review79.setUserId("");
    com.example.unifood.models.Review review82 = new com.example.unifood.models.Review();
    review82.setId("");
    com.example.unifood.models.Review[] review_array85 = new com.example.unifood.models.Review[] { review34, review37, review41, review44, review49, review57, review60, review63, review66, review72, review79, review82 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review86 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b87 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review86, review_array85);
    restaurant30.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review86);
    java.util.List<com.example.unifood.models.Product> list_product89 = restaurant30.getProductList();
    restaurant19.setProductList(list_product89);
    restaurant0.setProductList(list_product89);
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "94ae4bbe-8d48-4da3-92c4-a4d3126844b0"+ "'", str73.equals("94ae4bbe-8d48-4da3-92c4-a4d3126844b0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product89);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("2c5a1bd4-737c-4a04-a84c-474f6e7069c4", "f83df125-b34e-4760-b04e-1d4cac0869bc", (float)'4', "a1c6cab2-02e3-48dc-8d5c-893212f3e1a9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getUserId();
    review0.setRate((float)1L);
    review0.setComment("5dcc50c3-4d4e-4f09-bf4f-e4946aa25c60");
    
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("84c380a1-fee2-4bfe-82b9-7668a6f07e00", "1fcc4f0c-26bc-4946-bf17-5d8a16792f98", 0.0f, "10649ddd-831c-4a5d-b54e-db55a76d1419");
    review4.setRestaurantId("2b4a092c-7fd6-4da1-aad3-c371931860b6");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

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
    float f14 = product12.getCost();
    product12.setCost((float)'#');
    
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
    org.junit.Assert.assertTrue(f14 == 35.0f);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    boolean b3 = studentInfo1.addProductToFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("7672e12e-d876-4ebb-acb5-ae587ee60ebd");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

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
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    studentInfo17.setCampusId("");
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    studentInfo17.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b32 = studentInfo17.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b34 = studentInfo17.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo17.getFavProducts();
    campus0.setRestaurants(list_str35);
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "8979f753-c5fd-4154-8113-1f38ec0191a4"+ "'", str14.equals("8979f753-c5fd-4154-8113-1f38ec0191a4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

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
    restaurant9.setId("2865634a-bba2-4826-82de-8b6ff1c73c1c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    review7.setUserId("6ba303b9-b299-4dec-828e-412faaedce26");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "899c550f-0e3e-410c-b76e-810b1269a0a5"+ "'", str8.equals("899c550f-0e3e-410c-b76e-810b1269a0a5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setCost(10.0f);
    boolean b4 = product0.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    com.example.unifood.models.University university9 = new com.example.unifood.models.University("hi!");
    java.lang.String str10 = university9.getId();
    boolean b12 = university9.addCampus("hi!");
    java.lang.String str13 = university9.getId();
    university9.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str16 = university9.getId();
    java.util.List<java.lang.String> list_str17 = university9.getAllCampus();
    campus0.setRestaurants(list_str17);
    boolean b20 = campus0.addRestaurant("a7dabb6b-5097-4ecc-a832-8624bb019f5f");
    campus0.setId("feead3ac-95d2-40b0-975f-07d3dc66037a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "747740b2-7173-4be5-aefa-7bdbae0baa10"+ "'", str10.equals("747740b2-7173-4be5-aefa-7bdbae0baa10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "747740b2-7173-4be5-aefa-7bdbae0baa10"+ "'", str13.equals("747740b2-7173-4be5-aefa-7bdbae0baa10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str16.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.updateRating();
    java.lang.String str6 = restaurant0.getShortDescription();
    java.lang.String str7 = restaurant0.getName();
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delProductFromFavorites("090d4d8e-cace-44ee-8920-101722da86af");
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("19c7d5e9-6bde-438f-aa67-83a5a8eeebdc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("67a826d0-ad9d-49db-8997-58baff1011a9");
    product7.setAvailability(false);
    product7.setCost((float)100);
    boolean b18 = product7.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

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
    restaurant0.setId("27e81862-1940-4e19-a518-e7bda686ecaa");
    restaurant0.setRate((java.lang.Float)35.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "09a32faf-1595-49fc-8656-dc5c5351b506"+ "'", str10.equals("09a32faf-1595-49fc-8656-dc5c5351b506"));
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

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
    boolean b16 = studentInfo0.addProductToFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    com.example.unifood.models.Campus campus17 = new com.example.unifood.models.Campus();
    boolean b19 = campus17.removeRestaurant("hi!");
    campus17.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str22 = campus17.getRestaurants();
    boolean b24 = campus17.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b26 = campus17.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str27 = campus17.getRestaurants();
    java.util.List<java.lang.String> list_str28 = campus17.getRestaurants();
    studentInfo0.setFavProducts(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    product1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    float f6 = product1.getCost();
    product1.setDescription("1a917fbe-c442-4520-80c0-95064ff21d4a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.lang.Float f9 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f9 + "' != '" + 0.0f+ "'", f9.equals(0.0f));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("f8c20ede-2bde-4e30-8dfb-1a90e6639fd5", (-1.0f), "5cc13964-43ac-4253-b71c-ea9fd24a692f");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductCostException");
    } catch (com.example.unifood.exceptions.InvalidProductCostException e) {
      // Expected exception.
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("03d6f458-9b02-4a10-bdd2-2aab61b1d4de");
    java.util.List<java.lang.String> list_str2 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

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
    java.lang.String str13 = restaurant0.getCampusId();
    restaurant0.setRate((java.lang.Float)100.0f);
    java.lang.String str16 = restaurant0.getUserId();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    com.example.unifood.exceptions.ReviewException reviewException0 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException1 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str2 = invalidRestaurantIdException1.toString();
    reviewException0.addSuppressed((java.lang.Throwable)invalidRestaurantIdException1);
    java.lang.Throwable[] throwable_array4 = reviewException0.getSuppressed();
    java.lang.Throwable[] throwable_array5 = reviewException0.getSuppressed();
    java.lang.String str6 = reviewException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str2.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.ReviewException"+ "'", str6.equals("com.example.unifood.exceptions.ReviewException"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    product2.setCost(0.0f);
    float f12 = product2.getCost();
    product2.setName("4c9327c3-ac82-4a5a-9401-9139fea602da");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setCost((float)'#');
    product3.setId("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa");
    boolean b9 = product3.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("add01af6-9901-43d3-950c-81f3702a5d12", "61147561-d24f-4a49-b295-70696006c96d", (float)(byte)1, "1a1f4baa-144f-4a2a-8f04-65ea83560f2d", "84fe6ce9-ea28-4361-b232-f1d6cd071155");
    java.lang.String str6 = review5.getRestaurantId();
    java.lang.String str7 = review5.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61147561-d24f-4a49-b295-70696006c96d"+ "'", str6.equals("61147561-d24f-4a49-b295-70696006c96d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1a1f4baa-144f-4a2a-8f04-65ea83560f2d"+ "'", str7.equals("1a1f4baa-144f-4a2a-8f04-65ea83560f2d"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.String str11 = restaurant3.getUserId();
    java.lang.String str12 = restaurant3.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str12.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    product5.setAvailability(true);
    java.lang.String str11 = product5.getName();
    product5.setId("42edb8de-0a64-4a5c-ac90-19090b7a51b2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    boolean b4 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b6 = studentInfo0.addProductToFavorites("6c4c9076-aeac-4c07-b6bc-73b8d8f0a4be");
    boolean b8 = studentInfo0.addProductToFavorites("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad");
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    com.example.unifood.exceptions.ReviewException reviewException0 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException1 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str2 = invalidRestaurantIdException1.toString();
    reviewException0.addSuppressed((java.lang.Throwable)invalidRestaurantIdException1);
    java.lang.String str4 = invalidRestaurantIdException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str2.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str4.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.addRestaurant("31a672f1-8d67-41fd-af08-42b81295d7f4");
    boolean b9 = campus0.removeRestaurant("5142e6c4-60e6-4c9b-846f-944459501cf1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

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
    java.util.List<com.example.unifood.models.Product> list_product18 = restaurant0.getProductList();
    java.lang.String str19 = restaurant0.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "75ff667f-21df-457d-81ab-c93c2a048281"+ "'", str4.equals("75ff667f-21df-457d-81ab-c93c2a048281"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "5cd59f15-42c3-4ec7-8e57-64020cbc210d"+ "'", str12.equals("5cd59f15-42c3-4ec7-8e57-64020cbc210d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.String str3 = ownerException0.toString();
    java.lang.String str4 = ownerException0.toString();
    java.lang.Throwable[] throwable_array5 = ownerException0.getSuppressed();
    com.example.unifood.exceptions.OwnerException ownerException6 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException7 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException8 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException7.addSuppressed((java.lang.Throwable)invalidCampusIdException8);
    java.lang.Throwable[] throwable_array10 = ownerException7.getSuppressed();
    java.lang.String str11 = ownerException7.toString();
    java.lang.String str12 = ownerException7.toString();
    ownerException6.addSuppressed((java.lang.Throwable)ownerException7);
    ownerException0.addSuppressed((java.lang.Throwable)ownerException6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str3.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str4.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("b82299be-5fed-4ea3-b437-3446ff3f6b7e", "1ebe41a4-2b15-4b10-9b22-c96869eec3ee", 100.0f, "381e5ee5-c1b9-4c19-bf06-429227ececf5", "64ae221d-667d-437f-870b-fef02d80a5de");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b3 = university1.removeCampus("4955c2e9-d977-4504-8611-581feb3ea4ca");
    university1.setName("611f2265-72c8-419d-bef6-d3f5796ef2b9");
    java.lang.String str6 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "611f2265-72c8-419d-bef6-d3f5796ef2b9"+ "'", str6.equals("611f2265-72c8-419d-bef6-d3f5796ef2b9"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    com.example.unifood.models.Campus campus9 = new com.example.unifood.models.Campus();
    boolean b11 = campus9.removeRestaurant("hi!");
    campus9.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str14 = campus9.getRestaurants();
    java.lang.String str15 = campus9.getId();
    java.lang.String str16 = campus9.getName();
    campus9.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str19 = campus9.getRestaurants();
    university1.setAllCampus(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "52042c7b-b5f0-4e1d-bd92-505b6a0ad098"+ "'", str2.equals("52042c7b-b5f0-4e1d-bd92-505b6a0ad098"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "52042c7b-b5f0-4e1d-bd92-505b6a0ad098"+ "'", str5.equals("52042c7b-b5f0-4e1d-bd92-505b6a0ad098"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "786c4a65-5ed9-4688-8479-0d6e4a8690aa"+ "'", str15.equals("786c4a65-5ed9-4688-8479-0d6e4a8690aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str16.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b3 = studentInfo1.addRestaurantToFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("22739d71-d067-4543-8594-4b1f473fe3b0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str6 = product0.getDescription();
    product0.setName("811f8a1d-ca60-461d-828c-6680d7547043");
    java.lang.String str9 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("00a80698-5dcc-4f53-8de2-eaec89537d25", "6eadf2cc-8094-4c03-a424-275c022b9ded", (-1.0f), "47faf2e0-af9a-4f10-b291-1286388a6b65");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

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
    restaurant3.setUserId("47faf2e0-af9a-4f10-b291-1286388a6b65");
    
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

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

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
    restaurant0.setShortDescription("0079d2e8-d486-4b81-b337-f82cf9cc3a8d");
    restaurant0.setCampusId("e464ba41-1f49-4343-ab5b-171c9adf8446");
    
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

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("cdbb11ff-0ded-41d4-9a99-4197a5c14e79", "03d6f458-9b02-4a10-bdd2-2aab61b1d4de", "fc6ee1bb-d4fa-4f42-9def-1a6d0f58d137");
    java.lang.String str4 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "fc6ee1bb-d4fa-4f42-9def-1a6d0f58d137"+ "'", str4.equals("fc6ee1bb-d4fa-4f42-9def-1a6d0f58d137"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    java.util.List<java.lang.String> list_str9 = university1.getAllCampus();
    university1.setName("1a277d77-2b50-4f35-ae96-722655f36319");
    boolean b13 = university1.addCampus("e3c02b6c-6ad8-4057-8eb3-b966f859b297");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

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
    product64.setCost((float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "9c839295-1a16-4aaf-a532-a9a529fdde1c"+ "'", str14.equals("9c839295-1a16-4aaf-a532-a9a529fdde1c"));
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "89737ece-a611-458a-a9a7-25e6f3ceca08"+ "'", str37.equals("89737ece-a611-458a-a9a7-25e6f3ceca08"));
    
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
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "233ce0b7-5f9a-4da8-a362-7f2ec50d1eac"+ "'", str59.equals("233ce0b7-5f9a-4da8-a362-7f2ec50d1eac"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("12/03/2017");
    boolean b14 = product7.getAvailability();
    product7.setName("119f287e-61c5-497a-b55c-17489bcb03e9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getName();
    com.example.unifood.models.Restaurant restaurant5 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product6 = new com.example.unifood.models.Product();
    boolean b7 = product6.getAvailability();
    restaurant5.addProduct(product6);
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant5.getProductList();
    restaurant5.updateRating();
    java.lang.String str11 = restaurant5.getShortDescription();
    java.lang.String str12 = restaurant5.getName();
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant5.getProductList();
    restaurant3.setProductList(list_product13);
    boolean b15 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("76fe9853-ea57-4556-ac71-95373a19a23f", (float)(short)10, "cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5");
    product3.setDescription("d9200fb5-f81f-4788-8586-336a23f81552");
    product3.setId("com.example.unifood.exceptions.InvalidLastNameException");
    product3.setId("e4f7334f-6568-4d08-9f18-f1931bdcd53a");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    boolean b12 = product7.getAvailability();
    product7.setId("");
    float f15 = product7.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

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
    restaurant3.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setShortDescription("d696b0ec-a37a-4c5e-bdf1-d957e2f2abf5");
    restaurant3.setCampusId("f159180e-b003-42a2-a92b-b5ca9102f827");
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "e9a233a8-3d31-4601-a1f9-5c2c941c9dc5"+ "'", str26.equals("e9a233a8-3d31-4601-a1f9-5c2c941c9dc5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "7fd0ed15-c95a-4a70-8ba8-3bab28b55449"+ "'", str35.equals("7fd0ed15-c95a-4a70-8ba8-3bab28b55449"));
    
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

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("6af9cce1-e394-4f10-9510-635f008d9600", "", "");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    java.lang.String str4 = review0.getId();
    review0.setComment("4a1faca8-27ea-4dd8-9833-9159f8937bd9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    restaurant0.setApproved(false);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "f2844dc8-fbce-4873-a6af-e379d43a9647"+ "'", str4.equals("f2844dc8-fbce-4873-a6af-e379d43a9647"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

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
    com.example.unifood.models.Product product30 = null;
    boolean b31 = restaurant3.removeProduct(product30);
    restaurant3.setName("2adc96c3-f320-42fb-97f3-c22c606913fb");
    
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
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("291773e4-9d5d-46d2-8f2f-f794d51a97ec", "224e0f6e-d1ef-42f5-abf9-d41b5d9448d0", (float)(short)0, "cc66dadd-fcba-49ac-836f-c77a82d11050", "39fc5d27-25f5-40c5-bc25-5abf21e05070");
    review5.setDate("55763602-a4bd-4dd4-9876-48d4b9c1c63a");
    review5.setId("ad9e1a89-ce46-4d03-9bbc-c729c44aba5c");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.lang.String[] str_array31 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str32);
    university1.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str37 = university1.getId();
    java.lang.String str38 = university1.getId();
    university1.setId("37f2649c-53a4-441b-9402-2eaa34724773");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1f19abb0-cf58-4006-86a0-164299543982"+ "'", str2.equals("1f19abb0-cf58-4006-86a0-164299543982"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str37.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str38.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    userInfo0.setType("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    userInfo0.setLastName("ced6e91b-9cd9-49c4-91b3-b718083b5bff");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

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
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    product18.setName("87229e63-e927-4901-97ef-90801d78d9d4");
    boolean b21 = restaurant0.removeProduct(product18);
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    restaurant22.addProduct(product23);
    java.util.List<com.example.unifood.models.Product> list_product26 = restaurant22.getProductList();
    restaurant22.setUserId("hi!");
    restaurant22.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review31 = restaurant22.getReviewList();
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant35.setName("12/03/2017");
    java.lang.String str38 = restaurant35.getUserId();
    java.lang.String str39 = restaurant35.getLocalization();
    restaurant22.update(restaurant35);
    java.lang.String str41 = restaurant22.getUserId();
    java.lang.String str42 = restaurant22.getName();
    restaurant22.setName("f4c5b8c3-3c11-4032-a3a2-60f2be579cd0");
    restaurant0.update(restaurant22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str39.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "12/03/2017"+ "'", str42.equals("12/03/2017"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.lang.Float f14 = restaurant3.getRate();
    restaurant3.setUserId("5241efee-0a4d-4812-ae33-3bb501603f1c");
    java.lang.String str17 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f14 + "' != '" + 0.0f+ "'", f14.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "35304b0a-a637-4bd6-9085-4c1585489381"+ "'", str17.equals("35304b0a-a637-4bd6-9085-4c1585489381"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("48af3aad-919d-4ef4-8028-3a57694cd73d", (float)' ', "274be07e-a3ac-4731-bba5-47ea41b3cd02");
    product3.setCost((float)1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    university1.setName("a18aa9c7-97b2-4788-a07b-c1019504e336");
    java.util.List<java.lang.String> list_str4 = university1.getAllCampus();
    java.lang.String str5 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8f0a2a33-af99-4c56-a3b0-b705670120cc"+ "'", str5.equals("8f0a2a33-af99-4c56-a3b0-b705670120cc"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getName();
    university1.setName("f33b93fe-73d2-4d5b-9fd4-5e887cbd3c76");
    boolean b12 = university1.addCampus("7aa88324-6690-4df9-ba88-efe1eb9f0662");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d2c2fbe4-11c9-4b40-8f93-21119a352764"+ "'", str2.equals("d2c2fbe4-11c9-4b40-8f93-21119a352764"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "d2c2fbe4-11c9-4b40-8f93-21119a352764"+ "'", str5.equals("d2c2fbe4-11c9-4b40-8f93-21119a352764"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("d72fdc7f-328b-4dad-99a9-121fd56e5530", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", 0.0f, "5f549e06-72c7-4c21-9698-5857aa4f3922", "e54b551a-08dc-452f-92ac-1b57a42fe3fc");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

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
    product8.setAvailability(false);
    product8.setAvailability(true);
    
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

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getId();
    product3.setAvailability(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "db2f620b-8c95-4919-bb14-a92c528fd57b"+ "'", str5.equals("db2f620b-8c95-4919-bb14-a92c528fd57b"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("87229e63-e927-4901-97ef-90801d78d9d4");
    java.lang.String str6 = university1.getName();
    com.example.unifood.models.Campus campus7 = new com.example.unifood.models.Campus();
    boolean b9 = campus7.removeRestaurant("hi!");
    campus7.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str12 = campus7.getRestaurants();
    java.lang.String str13 = campus7.getId();
    java.lang.String str14 = campus7.getName();
    campus7.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str17 = campus7.getRestaurants();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    studentInfo18.setCampusId("");
    studentInfo18.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo18.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str25 = studentInfo18.getFavProducts();
    campus7.setRestaurants(list_str25);
    university1.setAllCampus(list_str25);
    boolean b29 = university1.addCampus("d1079d53-bb4b-4c07-b6e3-436320bf614d");
    boolean b31 = university1.addCampus("5241efee-0a4d-4812-ae33-3bb501603f1c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e92f35ee-2576-44bd-97a8-ac34c1eaf19c"+ "'", str2.equals("e92f35ee-2576-44bd-97a8-ac34c1eaf19c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "23f3c66c-8c00-4d96-bbed-d2cba049ea2f"+ "'", str13.equals("23f3c66c-8c00-4d96-bbed-d2cba049ea2f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str14.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

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
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product();
    boolean b23 = product22.getAvailability();
    restaurant21.addProduct(product22);
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant21.getProductList();
    restaurant21.setUserId("hi!");
    restaurant21.setName("12/03/2017");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    java.lang.String str31 = review30.getId();
    boolean b32 = restaurant21.removeReview(review30);
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    product34.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b39 = restaurant21.removeProduct(product34);
    product34.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    boolean b42 = restaurant0.removeProduct(product34);
    product34.setAvailability(false);
    java.lang.String str45 = product34.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "16cb478c-8a6e-49fc-af83-c6fe026d107d"+ "'", str10.equals("16cb478c-8a6e-49fc-af83-c6fe026d107d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "b6e63ba4-85c2-4474-89b5-087658136108"+ "'", str31.equals("b6e63ba4-85c2-4474-89b5-087658136108"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str45.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    com.example.unifood.models.University university9 = new com.example.unifood.models.University("hi!");
    java.lang.String str10 = university9.getId();
    boolean b12 = university9.addCampus("hi!");
    java.lang.String str13 = university9.getId();
    university9.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str16 = university9.getId();
    java.util.List<java.lang.String> list_str17 = university9.getAllCampus();
    campus0.setRestaurants(list_str17);
    boolean b20 = campus0.addRestaurant("a7dabb6b-5097-4ecc-a832-8624bb019f5f");
    boolean b22 = campus0.addRestaurant("24b23374-033d-472e-a823-e435a6d3cdd3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1fec210c-9f82-4e63-bc0d-b0547ecaa55a"+ "'", str10.equals("1fec210c-9f82-4e63-bc0d-b0547ecaa55a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1fec210c-9f82-4e63-bc0d-b0547ecaa55a"+ "'", str13.equals("1fec210c-9f82-4e63-bc0d-b0547ecaa55a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str16.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("7071a3a8-0659-48de-9594-da8247027c10", 0.0f, "18040e04-0844-4cac-8d6c-c57f545a74d8");
    float f4 = product3.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("1caf263e-dd60-40ea-83b2-b02f90a4a805");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    java.lang.String str31 = campus0.getId();
    boolean b33 = campus0.removeRestaurant("10649ddd-831c-4a5d-b54e-db55a76d1419");
    boolean b35 = campus0.removeRestaurant("0ca9664d-8c78-494a-b042-96c74ecb2137");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "e7f649ee-807f-421d-9056-030fa92408e8"+ "'", str31.equals("e7f649ee-807f-421d-9056-030fa92408e8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    java.lang.String str6 = university1.getName();
    boolean b8 = university1.addCampus("5aa3e6c8-b159-46f6-b439-3a1dcaed2d47");
    university1.setName("b3660a10-0a45-4a63-a48b-cafcf60da884");
    java.util.List<java.lang.String> list_str11 = null;
    university1.setAllCampus(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0f1aedc0-4423-4231-8cbf-0f88389f050c"+ "'", str2.equals("0f1aedc0-4423-4231-8cbf-0f88389f050c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0f1aedc0-4423-4231-8cbf-0f88389f050c"+ "'", str5.equals("0f1aedc0-4423-4231-8cbf-0f88389f050c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    boolean b6 = university1.addCampus("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b8 = university1.addCampus("6af9cce1-e394-4f10-9510-635f008d9600");
    java.lang.String str9 = university1.getName();
    java.lang.String str10 = university1.getName();
    university1.setName("850c66ab-1149-4a36-b911-3dc319169391");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "94b6648e-ea0c-4c4f-940e-4bb86a28eea1"+ "'", str2.equals("94b6648e-ea0c-4c4f-940e-4bb86a28eea1"));
    
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

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

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
    restaurant3.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setShortDescription("d696b0ec-a37a-4c5e-bdf1-d957e2f2abf5");
    com.example.unifood.models.Restaurant restaurant61 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product62 = new com.example.unifood.models.Product();
    boolean b63 = product62.getAvailability();
    restaurant61.addProduct(product62);
    java.util.List<com.example.unifood.models.Product> list_product65 = restaurant61.getProductList();
    com.example.unifood.models.Product product66 = new com.example.unifood.models.Product();
    product66.setDescription("hi!");
    boolean b69 = restaurant61.removeProduct(product66);
    restaurant61.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str72 = restaurant61.getUserId();
    restaurant61.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    com.example.unifood.models.Restaurant restaurant78 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str79 = restaurant78.getName();
    com.example.unifood.models.Restaurant restaurant80 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product81 = new com.example.unifood.models.Product();
    boolean b82 = product81.getAvailability();
    restaurant80.addProduct(product81);
    java.util.List<com.example.unifood.models.Product> list_product84 = restaurant80.getProductList();
    restaurant80.updateRating();
    java.lang.String str86 = restaurant80.getShortDescription();
    java.lang.String str87 = restaurant80.getName();
    java.util.List<com.example.unifood.models.Product> list_product88 = restaurant80.getProductList();
    restaurant78.setProductList(list_product88);
    restaurant61.setProductList(list_product88);
    restaurant3.setProductList(list_product88);
    restaurant3.setLocalization("51998cce-1219-4bac-b3bf-a4db195dc527");
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "70ae50b9-4b12-46fb-a47f-f2d811ef8a9f"+ "'", str26.equals("70ae50b9-4b12-46fb-a47f-f2d811ef8a9f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "c1fa1817-d5d9-459f-9d8b-5393772bb568"+ "'", str35.equals("c1fa1817-d5d9-459f-9d8b-5393772bb568"));
    
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
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + ""+ "'", str72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str79.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + ""+ "'", str86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product88);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    restaurant0.setId("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str10 = restaurant0.getCampusId();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    product11.setDescription("hi!");
    java.lang.String str14 = product11.getDescription();
    product11.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    float f17 = product11.getCost();
    product11.setCost((float)1);
    boolean b20 = restaurant0.removeProduct(product11);
    product11.setAvailability(false);
    float f23 = product11.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f23 == 1.0f);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

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
    restaurant0.updateRating();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "783036da-6ec8-474d-81c4-a8c5cc7a1154"+ "'", str22.equals("783036da-6ec8-474d-81c4-a8c5cc7a1154"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

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
    restaurant9.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a5240f77-9378-4809-b52b-8b1ade08d4fc"+ "'", str5.equals("a5240f77-9378-4809-b52b-8b1ade08d4fc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0527f842-98d0-4df0-a208-e760461137eb"+ "'", str17.equals("0527f842-98d0-4df0-a208-e760461137eb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    restaurant0.setLocalization("f695ed82-229b-4109-958e-25c92fc7e7c5");
    restaurant0.updateRating();
    restaurant0.setName("b9f0aa13-89e0-43e3-8cfd-757491affeff");
    restaurant0.setRate((java.lang.Float)35.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    product5.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product5.setAvailability(true);
    product5.setCost((float)(byte)10);
    restaurant0.addProduct(product5);
    java.lang.String str14 = product5.getDescription();
    product5.setName("514f2fa5-4b3b-437b-96d0-750abdcdf8dc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str14.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("bd968869-3539-4f4d-9e5e-4f2940eddfdb");

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setDescription("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    product0.setId("6c07bb61-3238-4cd2-8b15-803092b90294");

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

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
    review32.setId("42b8c9a6-a014-4a39-b2af-ca3bffb7a25e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "3b82cff9-a309-428b-9917-11e098eb1d05"+ "'", str10.equals("3b82cff9-a309-428b-9917-11e098eb1d05"));
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ae6fedd9-398e-4946-9beb-0c54a8995818"+ "'", str33.equals("ae6fedd9-398e-4946-9beb-0c54a8995818"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    product3.setName("db46732b-0a96-4e8f-8925-8a39282eefd1");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9d54bba1-c011-40fe-a86a-2b02e99ae523"+ "'", str2.equals("9d54bba1-c011-40fe-a86a-2b02e99ae523"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "9d54bba1-c011-40fe-a86a-2b02e99ae523"+ "'", str3.equals("9d54bba1-c011-40fe-a86a-2b02e99ae523"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

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
    boolean b18 = campus1.addRestaurant("979b1930-46c4-4b6e-b9e8-0d568cf89fb1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4adb3dec-db08-466f-9756-413552325c8a"+ "'", str2.equals("4adb3dec-db08-466f-9756-413552325c8a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4adb3dec-db08-466f-9756-413552325c8a"+ "'", str16.equals("4adb3dec-db08-466f-9756-413552325c8a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

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
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant0.getReviewList();
    restaurant0.setId("5905c9ec-8594-480a-98d9-f263a8aa7afa");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getFirstName();
    userInfo0.setLastName("34883944-2c20-4b7d-a7d4-9195f4f24b79");
    java.lang.String str8 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("6c2f90b1-d9b0-400d-8b43-0893724d6fd6", (float)10L, "84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    product3.setAvailability(false);
    product3.setName("544335c6-2fef-496b-a965-9a6f6604b809");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

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
    restaurant3.setApproved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "881418a0-2be9-4035-9b9e-02b34a0e2101"+ "'", str14.equals("881418a0-2be9-4035-9b9e-02b34a0e2101"));
    
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
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "bd4b31bc-9996-4b1c-89df-ec3b299e67b1"+ "'", str76.equals("bd4b31bc-9996-4b1c-89df-ec3b299e67b1"));
    
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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    restaurant3.setLocalization("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b14 = restaurant13.getApproved();
    java.lang.String str15 = restaurant13.getId();
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant13.getReviewList();
    restaurant13.updateRating();
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review("239d950c-a53b-45db-9e8f-483a040e426a", "adb74c6f-c839-47cc-b096-1c12240d6afd", 1.0f, "49976e80-f69f-4380-aa76-dc904dcb2eca", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str24 = review23.getId();
    restaurant13.addReview(review23);
    restaurant13.setRate((java.lang.Float)(-1.0f));
    restaurant3.update(restaurant13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "1e8e1046-6beb-4da6-a69a-99d706bc5388"+ "'", str15.equals("1e8e1046-6beb-4da6-a69a-99d706bc5388"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "54656a11-c51d-47a5-843e-2d6615aeb094"+ "'", str24.equals("54656a11-c51d-47a5-843e-2d6615aeb094"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f8 = restaurant3.getRate();
    restaurant3.setUserId("8922762e-c394-4758-8e43-89d8388d9c11");
    restaurant3.updateRating();
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant15.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str18 = restaurant15.getShortDescription();
    boolean b20 = restaurant15.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant15.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    com.example.unifood.models.Restaurant restaurant26 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant26.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str29 = restaurant26.getShortDescription();
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    java.lang.String str31 = review30.getDate();
    java.lang.String str32 = review30.getComment();
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    review33.setId("");
    java.lang.String str36 = review33.getUserId();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    review37.setRate((float)10L);
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    review40.setId("");
    java.lang.String str43 = review40.getUserId();
    java.lang.String str44 = review40.getRestaurantId();
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    review45.setId("");
    com.example.unifood.models.Review review53 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review53.setUserId("");
    com.example.unifood.models.Review review56 = new com.example.unifood.models.Review();
    java.lang.String str57 = review56.getDate();
    java.lang.String str58 = review56.getComment();
    com.example.unifood.models.Review review59 = new com.example.unifood.models.Review();
    review59.setId("");
    com.example.unifood.models.Review review62 = new com.example.unifood.models.Review();
    review62.setId("");
    java.lang.String str65 = review62.getUserId();
    java.lang.String str66 = review62.getRestaurantId();
    java.lang.String str67 = review62.getDate();
    com.example.unifood.models.Review review68 = new com.example.unifood.models.Review();
    java.lang.String str69 = review68.getId();
    com.example.unifood.models.Review review75 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review75.setUserId("");
    com.example.unifood.models.Review review78 = new com.example.unifood.models.Review();
    review78.setId("");
    com.example.unifood.models.Review[] review_array81 = new com.example.unifood.models.Review[] { review30, review33, review37, review40, review45, review53, review56, review59, review62, review68, review75, review78 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review82 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review82, review_array81);
    restaurant26.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review82);
    java.util.List<com.example.unifood.models.Product> list_product85 = restaurant26.getProductList();
    restaurant15.setProductList(list_product85);
    restaurant3.setProductList(list_product85);
    java.lang.String str88 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "20ef1780-f60f-4692-b05d-48e3142e76c4"+ "'", str69.equals("20ef1780-f60f-4692-b05d-48e3142e76c4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str88.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("e7ca4383-a240-4754-a9e5-d25741e65435", "7071a3a8-0659-48de-9594-da8247027c10", (float)100L, "5f549e06-72c7-4c21-9698-5857aa4f3922");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    restaurant3.setId("e38e11da-1219-443d-93b7-8c6ea82bea05");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant13.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str16 = restaurant13.getLocalization();
    java.lang.String str17 = restaurant13.getCampusId();
    java.lang.String str18 = restaurant13.getName();
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant13.getProductList();
    restaurant3.setProductList(list_product19);
    boolean b21 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "99ad1c4c-1ae6-4a1c-858e-a3daa0b9ec2f"+ "'", str5.equals("99ad1c4c-1ae6-4a1c-858e-a3daa0b9ec2f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str16.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str17.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str18.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    campus0.setName("");
    java.util.List<java.lang.String> list_str8 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    university1.setId("");
    java.util.List<java.lang.String> list_str4 = university1.getAllCampus();
    java.util.List<java.lang.String> list_str5 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("87229e63-e927-4901-97ef-90801d78d9d4");
    university1.setName("70b3fcb0-bca5-4a4d-b6a3-362191149f60");
    boolean b9 = university1.addCampus("3eb01d1b-8df4-4077-9221-8c1b6b20a4fb");
    java.lang.String str10 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5e0fdb52-daa1-472b-93c9-4ee9dfb72b94"+ "'", str2.equals("5e0fdb52-daa1-472b-93c9-4ee9dfb72b94"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "70b3fcb0-bca5-4a4d-b6a3-362191149f60"+ "'", str10.equals("70b3fcb0-bca5-4a4d-b6a3-362191149f60"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

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
    restaurant0.setCampusId("0b671c11-3de0-49a2-9ab6-83c364a53d1a");
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    boolean b32 = product31.getAvailability();
    restaurant30.addProduct(product31);
    java.util.List<com.example.unifood.models.Product> list_product34 = restaurant30.getProductList();
    restaurant30.setUserId("hi!");
    restaurant30.setName("12/03/2017");
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    java.lang.String str40 = review39.getId();
    boolean b41 = restaurant30.removeReview(review39);
    com.example.unifood.models.Review review42 = new com.example.unifood.models.Review();
    java.lang.String str43 = review42.getDate();
    review42.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review42.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b48 = restaurant30.removeReview(review42);
    float f49 = review42.getRate();
    java.lang.String str50 = review42.getUserId();
    boolean b51 = restaurant0.equals((java.lang.Object)str50);
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "039f8b11-7339-400e-9658-acf778bd64ae"+ "'", str22.equals("039f8b11-7339-400e-9658-acf778bd64ae"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "f7a238bb-4a16-4758-ab71-4bde1695fdca"+ "'", str40.equals("f7a238bb-4a16-4758-ab71-4bde1695fdca"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f49 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("cda102ed-5d20-4a30-b455-702bfe3561b2");
    ownerInfo1.setRestaurantId("");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

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
    boolean b38 = product29.getAvailability();
    product29.setCost((float)(byte)0);
    boolean b41 = product29.getAvailability();
    product29.setId("963a63a2-b81d-4268-a20f-dbd808873522");
    
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
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", "com.example.unifood.exceptions.OwnerException", "a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant3.setRate((java.lang.Float)0.0f);
    restaurant3.setUserId("3717b6c7-b0b0-4897-b818-92659d332e3a");

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

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
    campus0.setId("5cd59f15-42c3-4ec7-8e57-64020cbc210d");
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "3319aaf7-2799-42ff-b58c-c7054289e6c5"+ "'", str14.equals("3319aaf7-2799-42ff-b58c-c7054289e6c5"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

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
    java.lang.String str28 = restaurant19.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "6544e58b-0482-4a32-a6ed-64ee90e1d84a"+ "'", str10.equals("6544e58b-0482-4a32-a6ed-64ee90e1d84a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "0d02eae8-71c2-4edb-9287-ddd87000a6ba"+ "'", str23.equals("0d02eae8-71c2-4edb-9287-ddd87000a6ba"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("7ef0cf59-e144-416a-a062-c1d947e146d2", "84e3215a-cb95-4021-8594-50fe3409fae3", "a71e608a-71d0-4577-96d5-8e389cac3108");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    university1.setId("0baecc35-df86-4223-8916-df65673623be");
    java.lang.String str14 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str14.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3c180ad7-267c-47e3-bdaa-08230d053f5a");
    boolean b3 = campus1.removeRestaurant("e2011be9-b7c6-466a-8a3f-c48db2b88c6e");
    boolean b5 = campus1.removeRestaurant("f01dbd23-efa7-49fb-8603-33a9d3dcb96c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("a714e2e4-9a9f-4636-a3e8-c11ded26eceb", "", "42065d2c-2510-414f-b1ed-b86067b8f731");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidCampusIdException");
    } catch (com.example.unifood.exceptions.InvalidCampusIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setLocalization("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    restaurant0.setLocalization("f666c841-c560-4874-8cbd-008c848d1f42");
    restaurant0.setLocalization("7d4eb0b6-8933-4fc9-b247-cd09c304b6ed");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e54aac1d-a2f7-44d3-b93d-d7262425dca1"+ "'", str4.equals("e54aac1d-a2f7-44d3-b93d-d7262425dca1"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

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
    restaurant0.setLocalization("e2c7a34a-8060-4430-9d69-dd5848b101c6");
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f8 = restaurant3.getRate();
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
    restaurant3.update(restaurant12);
    restaurant3.setId("5dcc50c3-4d4e-4f09-bf4f-e4946aa25c60");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
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
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "66662d53-cdfc-4b60-bb1a-d4535919f4f2"+ "'", str77.equals("66662d53-cdfc-4b60-bb1a-d4535919f4f2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product93);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str10 = restaurant3.getName();
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9d976ed0-f0b0-4f15-8f87-1443d2b42bf9"+ "'", str5.equals("9d976ed0-f0b0-4f15-8f87-1443d2b42bf9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str10.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("32bef74e-15d2-4f2b-849c-199055557d88", "", (float)(byte)10, "e2c5a479-863d-468d-b3ec-388be48481a6");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    restaurant0.updateRating();
    restaurant0.setName("addba82a-78b9-4322-a99a-7ed6a35c8105");
    restaurant0.setRate((java.lang.Float)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "7e0fd85d-bd52-45e8-9cc6-2ebdf8e736ea"+ "'", str4.equals("7e0fd85d-bd52-45e8-9cc6-2ebdf8e736ea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = campus0.getId();
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "097ff2ed-7514-47e2-b735-41c735a98399"+ "'", str6.equals("097ff2ed-7514-47e2-b735-41c735a98399"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "097ff2ed-7514-47e2-b735-41c735a98399"+ "'", str9.equals("097ff2ed-7514-47e2-b735-41c735a98399"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getLastName();
    userInfo3.setLastName("94b81efc-debb-4018-aa53-f3f45c40a55b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d2c231e2-7a36-4c3e-85a5-77d4735a3460"+ "'", str4.equals("d2c231e2-7a36-4c3e-85a5-77d4735a3460"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "376f29dd-77f2-4b44-8c95-b9ac348c4e6f"+ "'", str5.equals("376f29dd-77f2-4b44-8c95-b9ac348c4e6f"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("com.example.unifood.exceptions.StudentException", "18040e04-0844-4cac-8d6c-c57f545a74d8", (float)(-1L), "196f0ccf-3520-4047-a4a5-6dbd7d850da4", "46f9268d-e951-4e27-bd0d-641c5497edc9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5", "17c4b8fd-9fac-4dfb-8bb6-1e8eb7e099a5", (float)(byte)10, "f725d497-61a6-42a0-b3a8-ad09aa4e8765", "d054f793-8da1-4b53-9056-26346d97b155");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

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
    java.lang.String str29 = restaurant0.getUserId();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "e5351f35-bddb-4253-8da0-2e8f820667b4"+ "'", str22.equals("e5351f35-bddb-4253-8da0-2e8f820667b4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f27 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

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
    java.lang.String str21 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "482d9e99-1a88-4a3e-8050-55faade7b3ae"+ "'", str4.equals("482d9e99-1a88-4a3e-8050-55faade7b3ae"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "482d9e99-1a88-4a3e-8050-55faade7b3ae"+ "'", str20.equals("482d9e99-1a88-4a3e-8050-55faade7b3ae"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "482d9e99-1a88-4a3e-8050-55faade7b3ae"+ "'", str21.equals("482d9e99-1a88-4a3e-8050-55faade7b3ae"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("b5c52ac3-c5ca-4926-90ee-17f1cb9ab4d6", "fd6c7c60-1643-4f79-aaf6-7d9533a7d89f", (float)(byte)0, "ae91f11d-dca1-4f18-869c-4190e5461bde", "e1c9a537-9947-424b-9bcc-d347af2548de");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    boolean b5 = studentInfo1.delProductFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    boolean b7 = studentInfo1.addRestaurantToFavorites("23206ba0-71a7-4570-a3e8-0e288c2551d4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    restaurant3.setLocalization("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str17 = restaurant3.getId();
    java.lang.String str18 = restaurant3.getLocalization();
    java.lang.String str19 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "8ce830fe-1366-4bd5-a822-511d9d102587"+ "'", str17.equals("8ce830fe-1366-4bd5-a822-511d9d102587"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str18.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "8ce830fe-1366-4bd5-a822-511d9d102587"+ "'", str19.equals("8ce830fe-1366-4bd5-a822-511d9d102587"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setFirstName("b6fd1026-57eb-4577-a667-6dac64083d57");
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    java.lang.String str10 = userInfo0.getLastName();
    userInfo0.setType("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("979b1930-46c4-4b6e-b9e8-0d568cf89fb1");
    com.example.unifood.models.University university3 = new com.example.unifood.models.University("hi!");
    java.lang.String str4 = university3.getId();
    java.lang.String[] str_array33 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<java.lang.String>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str34, str_array33);
    university3.setAllCampus((java.util.List<java.lang.String>)arraylist_str34);
    studentInfo1.setFavProducts((java.util.List<java.lang.String>)arraylist_str34);
    boolean b39 = studentInfo1.delProductFromFavorites("db34ddd0-ad9d-429f-aa95-bb67ba5a21f5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4d2bca4d-884c-437d-bd71-d78cf7039f36"+ "'", str4.equals("4d2bca4d-884c-437d-bd71-d78cf7039f36"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    java.util.List<java.lang.String> list_str2 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setLocalization("7c59358e-116e-43c5-8ee4-d0460ea1e2fb");
    com.example.unifood.models.Review review14 = new com.example.unifood.models.Review();
    boolean b15 = restaurant3.removeReview(review14);
    restaurant3.setName("1507d7b1-8bb2-4047-96fe-82811c41439e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    java.lang.String str4 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8e1ddaca-7c39-4d19-96d1-5b8bd7bbd469"+ "'", str2.equals("8e1ddaca-7c39-4d19-96d1-5b8bd7bbd469"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

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
    restaurant3.setName("3d3ec578-45a4-47b2-8334-c039df5a98a8");
    com.example.unifood.models.Restaurant restaurant77 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str78 = restaurant77.getName();
    restaurant77.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant81 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product82 = new com.example.unifood.models.Product();
    boolean b83 = product82.getAvailability();
    restaurant81.addProduct(product82);
    java.util.List<com.example.unifood.models.Product> list_product85 = restaurant81.getProductList();
    restaurant81.setUserId("hi!");
    restaurant81.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product90 = restaurant81.getProductList();
    restaurant77.setProductList(list_product90);
    boolean b92 = restaurant3.equals((java.lang.Object)list_product90);
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "357330fe-4da8-4729-a090-64114ae4ba42"+ "'", str26.equals("357330fe-4da8-4729-a090-64114ae4ba42"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "82237d95-d71c-4ca8-992a-0b4e161dd2f6"+ "'", str35.equals("82237d95-d71c-4ca8-992a-0b4e161dd2f6"));
    
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
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str78.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    com.example.unifood.exceptions.UserException userException0 = new com.example.unifood.exceptions.UserException();
    java.lang.Throwable[] throwable_array1 = userException0.getSuppressed();
    java.lang.Throwable[] throwable_array2 = userException0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

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
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product("hi!", (float)(byte)0, "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    float f20 = product19.getCost();
    restaurant0.addProduct(product19);
    restaurant0.setCampusId("66bec123-5439-4b8b-9bcd-b4d7aa7fa48f");
    
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
    org.junit.Assert.assertTrue(f20 == 0.0f);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("e0ed697c-d17d-4982-81ea-097a494113d9");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavRestaurants();
    boolean b9 = studentInfo0.delProductFromFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b11 = studentInfo0.delRestaurantFromFavorites("db09eef4-f2d1-41a8-a652-e68e7b889580");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str15 = restaurant3.getCampusId();
    restaurant3.setCampusId("82a3735c-51a5-4196-b1e2-ba5966598a25");
    java.lang.String str18 = restaurant3.getUserId();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str23 = product22.getDescription();
    restaurant3.addProduct(product22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "12/03/2017"+ "'", str23.equals("12/03/2017"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    restaurant9.setUserId("hi!");
    restaurant9.setName("12/03/2017");
    com.example.unifood.models.Review review18 = new com.example.unifood.models.Review();
    java.lang.String str19 = review18.getId();
    boolean b20 = restaurant9.removeReview(review18);
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    review21.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str27 = review21.getRestaurantId();
    boolean b28 = restaurant9.removeReview(review21);
    review21.setRestaurantId("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    review21.setComment("59b6ade5-3811-4088-b13a-ef845448e8af");
    java.lang.String str33 = review21.getId();
    boolean b34 = restaurant0.removeReview(review21);
    restaurant0.setName("ae416535-e54f-4dba-be86-778020d318f7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "56a1e8aa-3e9e-4dd9-bb2d-380efc35a0fd"+ "'", str4.equals("56a1e8aa-3e9e-4dd9-bb2d-380efc35a0fd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a2da3977-173b-4cfe-ad89-c8189cd31a1a"+ "'", str19.equals("a2da3977-173b-4cfe-ad89-c8189cd31a1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo0.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    studentInfo0.setCampusId("02fa70a1-34eb-43fb-9262-b5b5fdd24c9e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b3660a10-0a45-4a63-a48b-cafcf60da884");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("55763602-a4bd-4dd4-9876-48d4b9c1c63a");
    java.util.List<java.lang.String> list_str4 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

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
    java.util.List<java.lang.String> list_str37 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str38 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    studentInfo39.setCampusId("");
    studentInfo39.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo39.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b47 = studentInfo39.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str48 = studentInfo39.getCampusId();
    boolean b50 = studentInfo39.delRestaurantFromFavorites("e0ed697c-d17d-4982-81ea-097a494113d9");
    boolean b52 = studentInfo39.delProductFromFavorites("9626d0ba-fe19-4356-a232-426c972c7dfc");
    com.example.unifood.models.StudentInfo studentInfo53 = new com.example.unifood.models.StudentInfo();
    studentInfo53.setCampusId("");
    java.util.List<java.lang.String> list_str56 = studentInfo53.getFavRestaurants();
    java.util.List<java.lang.String> list_str57 = studentInfo53.getFavProducts();
    com.example.unifood.models.University university59 = new com.example.unifood.models.University("hi!");
    boolean b61 = university59.removeCampus("hi!");
    university59.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str64 = university59.getName();
    boolean b66 = university59.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university68 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus69 = new com.example.unifood.models.Campus();
    boolean b71 = campus69.removeRestaurant("hi!");
    campus69.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str74 = campus69.getRestaurants();
    university68.setAllCampus(list_str74);
    java.util.List<java.lang.String> list_str76 = university68.getAllCampus();
    university59.setAllCampus(list_str76);
    studentInfo53.setFavProducts(list_str76);
    studentInfo39.setFavProducts(list_str76);
    studentInfo0.setFavRestaurants(list_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "f4865550-0e0a-40c7-bf6c-4e44928d28db"+ "'", str20.equals("f4865550-0e0a-40c7-bf6c-4e44928d28db"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str48.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str76);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getFirstName();
    userInfo3.setType("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str8.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    java.lang.String str13 = restaurant3.getLocalization();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant17.setName("12/03/2017");
    java.lang.String str20 = restaurant17.getUserId();
    restaurant17.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    review23.setId("");
    com.example.unifood.models.Review review26 = new com.example.unifood.models.Review();
    java.lang.String str27 = review26.getDate();
    java.lang.String str28 = review26.getComment();
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    review29.setId("");
    java.lang.String str32 = review29.getUserId();
    java.lang.String str33 = review29.getRestaurantId();
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getDate();
    java.lang.String str36 = review34.getComment();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getDate();
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    java.lang.String str40 = review39.getId();
    com.example.unifood.models.Restaurant restaurant41 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product42 = new com.example.unifood.models.Product();
    boolean b43 = product42.getAvailability();
    restaurant41.addProduct(product42);
    java.util.List<com.example.unifood.models.Product> list_product45 = restaurant41.getProductList();
    restaurant41.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    java.lang.String str49 = review48.getId();
    boolean b50 = restaurant41.removeReview(review48);
    com.example.unifood.models.Review review51 = new com.example.unifood.models.Review();
    java.lang.String str52 = review51.getDate();
    java.lang.String str53 = review51.getComment();
    com.example.unifood.models.Review review54 = new com.example.unifood.models.Review();
    review54.setRate((float)10L);
    review54.setDate("hi!");
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review64.setUserId("");
    com.example.unifood.models.Review[] review_array67 = new com.example.unifood.models.Review[] { review23, review26, review29, review34, review37, review39, review48, review51, review54, review64 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review68 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review68, review_array67);
    restaurant17.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review68);
    restaurant17.setName("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");
    com.example.unifood.models.Review review78 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review78.setUserId("");
    java.lang.String str81 = review78.getUserId();
    float f82 = review78.getRate();
    review78.setRestaurantId("c7492f51-751c-49fa-9823-c9ff6db2c39f");
    boolean b85 = restaurant17.removeReview(review78);
    boolean b86 = restaurant3.removeReview(review78);
    restaurant3.setUserId("a78204f1-ede6-4e45-8113-466448888b40");
    java.lang.String str89 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3a720006-7b86-4e09-929d-021722db755e"+ "'", str5.equals("3a720006-7b86-4e09-929d-021722db755e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str13.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "47066f82-472e-47ee-acbe-75f60e9cdb4d"+ "'", str40.equals("47066f82-472e-47ee-acbe-75f60e9cdb4d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "e0b660af-3c12-44f2-af1f-978ef0e4ec2b"+ "'", str49.equals("e0b660af-3c12-44f2-af1f-978ef0e4ec2b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + ""+ "'", str81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f82 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str89.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("84e3215a-cb95-4021-8594-50fe3409fae3");
    java.lang.String str2 = campus1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "90860f58-b96a-40c7-b3fc-c08885b6e378"+ "'", str2.equals("90860f58-b96a-40c7-b3fc-c08885b6e378"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

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
    java.util.List<java.lang.String> list_str19 = studentInfo14.getFavRestaurants();
    boolean b21 = studentInfo14.delProductFromFavorites("a53b1dd3-6bfc-42d0-9d58-929bb2e777d1");
    
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
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

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
    restaurant0.updateRating();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "40968d6a-7f34-49eb-af39-d21a5a7d1d62"+ "'", str19.equals("40968d6a-7f34-49eb-af39-d21a5a7d1d62"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

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
    restaurant3.setRate((java.lang.Float)0.0f);
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "b572feb3-e4bb-475d-b3eb-602673f4dd91"+ "'", str27.equals("b572feb3-e4bb-475d-b3eb-602673f4dd91"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str30.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

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
    restaurant12.setApproved(true);
    java.lang.String str24 = restaurant12.getUserId();
    java.lang.String str25 = restaurant12.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "592c3290-31e3-44ab-910a-c469b99e1a19"+ "'", str19.equals("592c3290-31e3-44ab-910a-c469b99e1a19"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

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
    boolean b18 = restaurant0.getApproved();
    restaurant0.setId("33fedaa3-0106-4e19-89be-26999882b8e1");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

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
    boolean b16 = campus0.addRestaurant("7a653f47-c1df-45ff-ae1f-b877ee03e2fc");
    boolean b18 = campus0.removeRestaurant("com.example.unifood.exceptions.UserException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4e560092-46c0-450d-8583-4087abeb8108"+ "'", str6.equals("4e560092-46c0-450d-8583-4087abeb8108"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    boolean b5 = studentInfo0.delProductFromFavorites("5ed892b7-8b07-4339-8318-fe7c666739ed");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    boolean b10 = campus0.addRestaurant("119f287e-61c5-497a-b55c-17489bcb03e9");
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str12 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "d3b03bbf-2998-4dbf-9129-794175bb0169"+ "'", str6.equals("d3b03bbf-2998-4dbf-9129-794175bb0169"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d3b03bbf-2998-4dbf-9129-794175bb0169"+ "'", str8.equals("d3b03bbf-2998-4dbf-9129-794175bb0169"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("a9a6d832-db46-43f7-8078-9b0af2950add", "", "0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad");
    userInfo3.setType("a6bf0ef2-fb6e-4cb6-8394-1d24ac774bd0");

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getName();
    com.example.unifood.models.Restaurant restaurant5 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product6 = new com.example.unifood.models.Product();
    boolean b7 = product6.getAvailability();
    restaurant5.addProduct(product6);
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant5.getProductList();
    restaurant5.updateRating();
    java.lang.String str11 = restaurant5.getShortDescription();
    java.lang.String str12 = restaurant5.getName();
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant5.getProductList();
    restaurant3.setProductList(list_product13);
    java.lang.String str15 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str15.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

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
    product12.setDescription("bd6ba047-d3b3-4365-b3c1-e5c4068052c1");
    product12.setCost((float)(-1));
    
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("9bd89d28-19bb-4c2d-a129-4f98542c55ca", (float)(-1), "55828b2f-d311-46b6-8244-bd26feb289f6");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductCostException");
    } catch (com.example.unifood.exceptions.InvalidProductCostException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("6528c820-2c6e-4424-adc3-c18b8e14e2b6", "3d044d98-af07-4542-aca4-4271f61edf74", (float)(short)-1, "f42b6f81-3e10-41d9-b634-0bd2da5b6245", "d710df2d-976a-46d0-a963-3905a87b1799");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setName("2b840dda-3718-464e-a39f-2e9719d2b246");
    java.lang.String str8 = product0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setCampusId("811f8a1d-ca60-461d-828c-6680d7547043");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "27965536-28f2-491c-96a4-5ad3aecce1b3"+ "'", str5.equals("27965536-28f2-491c-96a4-5ad3aecce1b3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

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
    java.lang.String str27 = restaurant0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ae9d99df-d6ac-4c9c-ad52-41942487b2e1"+ "'", str27.equals("ae9d99df-d6ac-4c9c-ad52-41942487b2e1"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    boolean b32 = campus0.removeRestaurant("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str33 = campus0.getRestaurants();
    boolean b35 = campus0.removeRestaurant("09c560d8-ad4a-4efc-a7b7-3894259139d4");
    
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
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b5 = university1.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.lang.String str6 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str6.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setShortDescription("f71e4521-c797-403b-bb13-9b84cfa3a1f7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("67a826d0-ad9d-49db-8997-58baff1011a9");
    product7.setDescription("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    product7.setName("1311aec3-7fbf-4312-aebf-fd43e255845f");
    java.lang.String str18 = product7.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9"+ "'", str18.equals("5b598b36-27ec-4ee0-9f83-e90e5a84d6b9"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    restaurant3.setLocalization("b1cf5ba1-84a7-456f-9b13-3dd128e0ec1e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    java.lang.String str2 = studentInfo1.getCampusId();
    boolean b4 = studentInfo1.delRestaurantFromFavorites("50dddc45-0f79-46bb-ac93-9f188aafc8e0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "b9a35319-fcc8-40c8-9a6c-cc193698fa7e"+ "'", str2.equals("b9a35319-fcc8-40c8-9a6c-cc193698fa7e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getId();
    review0.setRestaurantId("f0d566cb-cf48-40dc-b17a-8082bca32a82");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

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
    product41.setId("c2c7d3cb-15be-4d8f-adfb-ca5603ec3348");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a1f2fe6c-8443-49a7-a54f-126a82678717"+ "'", str5.equals("a1f2fe6c-8443-49a7-a54f-126a82678717"));
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "9f481d81-6338-48a5-ae2a-c59310374b31"+ "'", str38.equals("9f481d81-6338-48a5-ae2a-c59310374b31"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    java.lang.String str3 = userInfo0.getFirstName();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setType("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    java.lang.String str7 = userInfo0.getFirstName();
    
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

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

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
    java.lang.String str20 = restaurant0.getLocalization();
    restaurant0.setCampusId("be931b69-ae47-471c-951b-b1e69427a445");
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str20.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("7d4eb0b6-8933-4fc9-b247-cd09c304b6ed", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", (float)10, "dd590bab-571b-46aa-a609-24c8d661905c");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("e0ff690d-cc70-4ca7-8c59-adec9fbb61de", "a838cd01-d14c-4a55-bb8a-f2dbe9d18ed2", "a34474cb-e0be-4ff6-81f0-dd08fbbf6629");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("8e069f68-c995-4d5a-9117-23fad524d3d9");
    university1.setId("b0b0b700-7ebd-489d-85cc-58091d6c4b3e");

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    java.lang.String str9 = review0.getUserId();
    java.lang.String str10 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setId("27e81862-1940-4e19-a518-e7bda686ecaa");
    java.lang.String str13 = university1.getName();
    university1.setId("74118629-5eda-4cac-befa-6e8d8cc96453");
    university1.setId("52042c7b-b5f0-4e1d-bd92-505b6a0ad098");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str13.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c7492f51-751c-49fa-9823-c9ff6db2c39f", "", "5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getLastName();
    userInfo3.setFirstName("49d73418-a9cf-45c6-b785-3137e0dc0840");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str5.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

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
    java.lang.String str16 = product14.getId();
    boolean b17 = restaurant0.removeProduct(product14);
    product14.setId("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    java.lang.String str20 = product14.getName();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d07e476e-cb4d-45e9-8155-58166cdd0c15"+ "'", str16.equals("d07e476e-cb4d-45e9-8155-58166cdd0c15"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str20.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Product> list_product7 = restaurant3.getProductList();
    java.util.List<com.example.unifood.models.Product> list_product8 = null;
    restaurant3.setProductList(list_product8);
    java.lang.String str10 = restaurant3.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

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
    university1.setId("13f98119-ba54-4465-bf81-4bb02912af47");
    
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

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    product3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str7 = product3.getId();
    float f8 = product3.getCost();
    java.lang.String str9 = product3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str7.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant3.getUserId();
    java.lang.Float f8 = restaurant3.getRate();
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant3.getProductList();
    java.lang.Float f10 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f10 + "' != '" + 0.0f+ "'", f10.equals(0.0f));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    product3.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str7 = product3.getId();
    float f8 = product3.getCost();
    product3.setName("e0d85312-2930-47e0-bb40-e93f743fb6cb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str7.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 10.0f);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.addRestaurant("3b82cff9-a309-428b-9917-11e098eb1d05");
    
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
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    product3.setName("bfd7dfc1-c6e9-4ad1-9666-5b0d50bead65");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("");
    boolean b3 = university1.addCampus("2ca23794-72a3-4cca-8687-a1b0e6c8a5c2");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    studentInfo4.setCampusId("");
    boolean b8 = studentInfo4.addRestaurantToFavorites("d054f793-8da1-4b53-9056-26346d97b155");
    java.util.List<java.lang.String> list_str9 = studentInfo4.getFavRestaurants();
    university1.setAllCampus(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    restaurant3.setApproved(false);
    java.lang.String str10 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str10.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    restaurant3.updateRating();
    java.lang.String str9 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "39cc6fd0-3a01-470e-821f-4ce02cb37c06"+ "'", str5.equals("39cc6fd0-3a01-470e-821f-4ce02cb37c06"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "39cc6fd0-3a01-470e-821f-4ce02cb37c06"+ "'", str9.equals("39cc6fd0-3a01-470e-821f-4ce02cb37c06"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    java.lang.String str12 = restaurant0.getName();
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant16.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str19 = restaurant16.getShortDescription();
    boolean b21 = restaurant16.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    java.lang.String str25 = review22.getUserId();
    review22.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f28 = review22.getRate();
    boolean b29 = restaurant16.removeReview(review22);
    review22.setRestaurantId("f4c5b8c3-3c11-4032-a3a2-60f2be579cd0");
    boolean b32 = restaurant0.removeReview(review22);
    java.lang.String str33 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0da99290-441d-4c53-abff-e4fc9c8ee647"+ "'", str4.equals("0da99290-441d-4c53-abff-e4fc9c8ee647"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f28 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str9 = review0.getUserId();
    java.lang.String str10 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    boolean b5 = studentInfo1.delProductFromFavorites("f33b93fe-73d2-4d5b-9fd4-5e887cbd3c76");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("dfe7cecd-40c2-4da4-a592-171cc2a8de9c");

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product9 = new com.example.unifood.models.Product();
    boolean b10 = product9.getAvailability();
    restaurant8.addProduct(product9);
    restaurant8.setShortDescription("");
    restaurant8.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str16 = restaurant8.getCampusId();
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant20.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str23 = restaurant20.getShortDescription();
    boolean b25 = restaurant20.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant20.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
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
    java.util.List<com.example.unifood.models.Product> list_product90 = restaurant31.getProductList();
    restaurant20.setProductList(list_product90);
    restaurant8.setProductList(list_product90);
    restaurant3.setProductList(list_product90);
    java.lang.String str94 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
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
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "9e5823e0-47b1-4e97-8d9c-2c7b51046cc8"+ "'", str74.equals("9e5823e0-47b1-4e97-8d9c-2c7b51046cc8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str94 + "' != '" + "12/03/2017"+ "'", str94.equals("12/03/2017"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    com.example.unifood.models.Restaurant restaurant5 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product6 = new com.example.unifood.models.Product();
    boolean b7 = product6.getAvailability();
    restaurant5.addProduct(product6);
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant5.getProductList();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    product10.setDescription("hi!");
    boolean b13 = restaurant5.removeProduct(product10);
    restaurant5.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str16 = restaurant5.getUserId();
    restaurant5.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    java.util.List<com.example.unifood.models.Review> list_review19 = restaurant5.getReviewList();
    restaurant0.setReviewList(list_review19);
    restaurant0.setApproved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review19);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

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
    java.lang.String str29 = review21.getRestaurantId();
    
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
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

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
    com.example.unifood.models.Restaurant restaurant32 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant32.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str35 = restaurant32.getShortDescription();
    boolean b37 = restaurant32.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review();
    review38.setId("");
    java.lang.String str41 = review38.getUserId();
    review38.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f44 = review38.getRate();
    boolean b45 = restaurant32.removeReview(review38);
    com.example.unifood.models.Restaurant restaurant46 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product47 = new com.example.unifood.models.Product();
    boolean b48 = product47.getAvailability();
    restaurant46.addProduct(product47);
    java.util.List<com.example.unifood.models.Product> list_product50 = restaurant46.getProductList();
    restaurant46.setUserId("hi!");
    restaurant46.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product55 = restaurant46.getProductList();
    restaurant32.setProductList(list_product55);
    java.lang.String str57 = restaurant32.getUserId();
    com.example.unifood.models.Product product58 = new com.example.unifood.models.Product();
    boolean b59 = product58.getAvailability();
    product58.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product58.setAvailability(true);
    product58.setCost((float)(byte)10);
    boolean b66 = restaurant32.removeProduct(product58);
    boolean b67 = product58.getAvailability();
    product58.setCost((float)(byte)0);
    restaurant0.addProduct(product58);
    java.lang.String str71 = restaurant0.getLocalization();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ea319962-5e02-4677-be9a-194dd72d3f77"+ "'", str22.equals("ea319962-5e02-4677-be9a-194dd72d3f77"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f27 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f44 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + ""+ "'", str57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + ""+ "'", str71.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getRestaurantId();
    java.lang.String str7 = review0.getUserId();
    float f8 = review0.getRate();
    review0.setUserId("ff6f885c-a1f4-4408-8e72-bfd7677e67c8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f3b35595-7540-4adc-99d8-67b004cbadf9"+ "'", str2.equals("f3b35595-7540-4adc-99d8-67b004cbadf9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("f249f1bd-8a39-4257-80ee-d365fbe86958");

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

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
    com.example.unifood.exceptions.CampusException campusException26 = new com.example.unifood.exceptions.CampusException();
    java.lang.Throwable[] throwable_array27 = campusException26.getSuppressed();
    ownerException20.addSuppressed((java.lang.Throwable)campusException26);
    java.lang.Throwable[] throwable_array29 = campusException26.getSuppressed();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array29);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("8e6dda6d-66e5-4521-8634-e164e3b1c34c", "89f58dbc-2af7-4a83-80de-f53f2422b7a0", "63d9aec0-76a5-435f-9c93-e0aac2c8b34e");
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f8 = product7.getCost();
    product7.setAvailability(false);
    restaurant3.addProduct(product7);
    restaurant3.setRate((java.lang.Float)32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 10.0f);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    java.lang.String str13 = restaurant3.getLocalization();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant17.setName("12/03/2017");
    java.lang.String str20 = restaurant17.getUserId();
    restaurant17.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    review23.setId("");
    com.example.unifood.models.Review review26 = new com.example.unifood.models.Review();
    java.lang.String str27 = review26.getDate();
    java.lang.String str28 = review26.getComment();
    com.example.unifood.models.Review review29 = new com.example.unifood.models.Review();
    review29.setId("");
    java.lang.String str32 = review29.getUserId();
    java.lang.String str33 = review29.getRestaurantId();
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getDate();
    java.lang.String str36 = review34.getComment();
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    java.lang.String str38 = review37.getDate();
    com.example.unifood.models.Review review39 = new com.example.unifood.models.Review();
    java.lang.String str40 = review39.getId();
    com.example.unifood.models.Restaurant restaurant41 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product42 = new com.example.unifood.models.Product();
    boolean b43 = product42.getAvailability();
    restaurant41.addProduct(product42);
    java.util.List<com.example.unifood.models.Product> list_product45 = restaurant41.getProductList();
    restaurant41.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    java.lang.String str49 = review48.getId();
    boolean b50 = restaurant41.removeReview(review48);
    com.example.unifood.models.Review review51 = new com.example.unifood.models.Review();
    java.lang.String str52 = review51.getDate();
    java.lang.String str53 = review51.getComment();
    com.example.unifood.models.Review review54 = new com.example.unifood.models.Review();
    review54.setRate((float)10L);
    review54.setDate("hi!");
    com.example.unifood.models.Review review64 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review64.setUserId("");
    com.example.unifood.models.Review[] review_array67 = new com.example.unifood.models.Review[] { review23, review26, review29, review34, review37, review39, review48, review51, review54, review64 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review68 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review68, review_array67);
    restaurant17.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review68);
    restaurant17.setName("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");
    com.example.unifood.models.Review review78 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review78.setUserId("");
    java.lang.String str81 = review78.getUserId();
    float f82 = review78.getRate();
    review78.setRestaurantId("c7492f51-751c-49fa-9823-c9ff6db2c39f");
    boolean b85 = restaurant17.removeReview(review78);
    boolean b86 = restaurant3.removeReview(review78);
    restaurant3.setUserId("a78204f1-ede6-4e45-8113-466448888b40");
    restaurant3.setUserId("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "436d4a16-d291-45b5-8ad2-c1f59b94f8a9"+ "'", str5.equals("436d4a16-d291-45b5-8ad2-c1f59b94f8a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str13.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "765af240-d45a-40ad-b7c1-a289dd80d4ce"+ "'", str40.equals("765af240-d45a-40ad-b7c1-a289dd80d4ce"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "8cdea5da-6f62-425d-8199-8b3f5491b8a5"+ "'", str49.equals("8cdea5da-6f62-425d-8199-8b3f5491b8a5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + ""+ "'", str81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f82 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getType();
    java.lang.String str7 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str6.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("ca4a646d-3cc8-4cc0-9b41-40eb17520a41");
    java.util.List<java.lang.String> list_str2 = campus1.getRestaurants();
    java.lang.String str3 = campus1.getId();
    java.util.List<java.lang.String> list_str4 = campus1.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "3bf8bb0e-8cb6-4d60-9876-2560b641d5dd"+ "'", str3.equals("3bf8bb0e-8cb6-4d60-9876-2560b641d5dd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

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
    restaurant0.setCampusId("d710df2d-976a-46d0-a963-3905a87b1799");
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "c1450b39-edf7-45ee-b326-11df284defcf"+ "'", str4.equals("c1450b39-edf7-45ee-b326-11df284defcf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "719dd8bf-eadc-4a32-9e5c-744bb8444993"+ "'", str12.equals("719dd8bf-eadc-4a32-9e5c-744bb8444993"));
    
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
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "08522b04-8587-48bf-8708-06a9af25620a"+ "'", str67.equals("08522b04-8587-48bf-8708-06a9af25620a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product83);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f8 = restaurant3.getRate();
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
    restaurant3.update(restaurant12);
    restaurant12.setId("0da99290-441d-4c53-abff-e4fc9c8ee647");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
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
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "731a2a8e-680d-4b89-b700-afa4914ec9cb"+ "'", str77.equals("731a2a8e-680d-4b89-b700-afa4914ec9cb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product93);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException0 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException1 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException0.addSuppressed((java.lang.Throwable)invalidCampusNameException1);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException3 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException1.addSuppressed((java.lang.Throwable)invalidDescriptionException3);
    java.lang.Throwable throwable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    invalidCampusNameException1.addSuppressed(throwable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

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
    boolean b16 = campus0.addRestaurant("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    java.lang.String str17 = campus0.getId();
    boolean b19 = campus0.addRestaurant("a1c6cab2-02e3-48dc-8d5c-893212f3e1a9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5a8bb929-4ad7-4459-869e-fee5c0e525f2"+ "'", str6.equals("5a8bb929-4ad7-4459-869e-fee5c0e525f2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str14.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str17.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setLastName("2af0b02e-4c9a-4970-a399-ff63e0300464");
    java.lang.String str7 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2af0b02e-4c9a-4970-a399-ff63e0300464"+ "'", str7.equals("2af0b02e-4c9a-4970-a399-ff63e0300464"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("3a2e8d4f-66ad-4759-8493-26ff68884940", "49b07ce6-aac6-463b-a3cc-21e21430bc86", "3c180ad7-267c-47e3-bdaa-08230d053f5a");

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant3.getProductList();
    java.lang.String str11 = restaurant3.getId();
    java.lang.String str12 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "47b62fd8-1b04-4a1e-b438-7403b4011c5a"+ "'", str5.equals("47b62fd8-1b04-4a1e-b438-7403b4011c5a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "47b62fd8-1b04-4a1e-b438-7403b4011c5a"+ "'", str11.equals("47b62fd8-1b04-4a1e-b438-7403b4011c5a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "8e6dda6d-66e5-4521-8634-e164e3b1c34c"+ "'", str12.equals("8e6dda6d-66e5-4521-8634-e164e3b1c34c"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("6aa125f5-6e7b-470c-a975-ec804170b5da", "14fc2b01-aad9-4137-bef8-b90db410a732", (float)10L, "f19552d6-0add-41dc-b938-cadf800424cf", "43b3d27e-22fb-475a-ada6-c1d7bac18f8a");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.lang.String str9 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str5.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1d8645fe-e3d3-41a0-b416-919377cfaad9"+ "'", str9.equals("1d8645fe-e3d3-41a0-b416-919377cfaad9"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getUserId();
    java.lang.String str9 = review0.getUserId();
    review0.setRestaurantId("c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    review0.setRestaurantId("b0b0b700-7ebd-489d-85cc-58091d6c4b3e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("89f58dbc-2af7-4a83-80de-f53f2422b7a0");

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad", "com.example.unifood.exceptions.OwnerException", "a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant3.setName("d4347eb6-192e-4976-b563-60f0e7c43424");
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    product7.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product7.setAvailability(true);
    restaurant3.addProduct(product7);
    float f15 = product7.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("7abf4d3d-b259-4908-8e6b-f617c87176f2");
    boolean b3 = university1.removeCampus("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    boolean b5 = restaurant0.equals((java.lang.Object)"ab073906-47d6-4e8a-ab62-84ac268393a6");
    restaurant0.setId("d1718b79-7f3b-4bf5-b0b8-d5c876510835");
    java.util.List<com.example.unifood.models.Review> list_review8 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review8);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    product3.setCost((float)100L);
    product3.setId("9f875c13-8f07-4b49-af32-762823628ddc");
    product3.setName("80edcdaa-061a-4071-84f5-b4958cb78c91");

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setCampusId("ced1f535-42a1-41b6-914a-7e282afaf033");
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getLocalization();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant11.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str14 = restaurant11.getShortDescription();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    product15.setDescription("hi!");
    java.lang.String str18 = product15.getDescription();
    boolean b19 = restaurant11.removeProduct(product15);
    product15.setName("12/03/2017");
    java.lang.String str22 = product15.getDescription();
    boolean b23 = restaurant3.removeProduct(product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "8fb81efd-e454-4b41-837c-440f27d5e941"+ "'", str7.equals("8fb81efd-e454-4b41-837c-440f27d5e941"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("2adc96c3-f320-42fb-97f3-c22c606913fb", "76fe9853-ea57-4556-ac71-95373a19a23f", (float)(byte)-1, "3bf5e8ba-15a6-4ce9-b3c8-1988ea56cfb5");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setRate((java.lang.Float)32.0f);
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    product10.setDescription("hi!");
    java.lang.String str13 = product10.getDescription();
    java.lang.String str14 = product10.getId();
    boolean b15 = restaurant0.removeProduct(product10);
    restaurant0.setShortDescription("cd560d8f-28e7-4b43-b906-20258edc001d");
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant21.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str24 = restaurant21.getShortDescription();
    boolean b26 = restaurant21.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant21.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f29 = restaurant21.getRate();
    restaurant21.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.lang.Float f32 = restaurant21.getRate();
    restaurant0.update(restaurant21);
    restaurant21.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "e3c6d4bd-1a7c-45b9-b5f9-615abacff986"+ "'", str14.equals("e3c6d4bd-1a7c-45b9-b5f9-615abacff986"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f29 + "' != '" + 0.0f+ "'", f29.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f32 + "' != '" + 0.0f+ "'", f32.equals(0.0f));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

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
    com.example.unifood.models.Review review26 = new com.example.unifood.models.Review();
    review26.setId("");
    java.lang.String str29 = review26.getUserId();
    review26.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str32 = review26.getId();
    restaurant3.addReview(review26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "26ff7184-77d4-4b7f-9319-2b10b5969293"+ "'", str5.equals("26ff7184-77d4-4b7f-9319-2b10b5969293"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "26ff7184-77d4-4b7f-9319-2b10b5969293"+ "'", str6.equals("26ff7184-77d4-4b7f-9319-2b10b5969293"));
    
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
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6", "fde75b42-0c98-4497-90a3-eaf498e34ad2", "b6792249-a15c-420b-9817-44c9aa457e85");
    java.lang.String str4 = restaurant3.getName();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant8.setName("12/03/2017");
    java.lang.String str11 = restaurant8.getUserId();
    boolean b12 = restaurant8.getApproved();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    product13.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b17 = product13.getAvailability();
    java.lang.String str18 = product13.getDescription();
    boolean b19 = restaurant8.removeProduct(product13);
    product13.setAvailability(false);
    boolean b22 = restaurant3.removeProduct(product13);
    boolean b23 = product13.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"+ "'", str4.equals("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str18.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product("5f5c4b81-254c-4177-bece-07521f3cb9d5", (float)(byte)0, "9bb4ec51-2299-41a3-b764-2192d7b57501");
    boolean b11 = restaurant0.removeProduct(product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("6c7bf211-c6d2-4f9e-9c67-3d386ead4562");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("134505a3-cb47-4072-8eb3-2b598da20b15");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("32e39fc4-17d1-4b3f-9745-1ed43ef183fc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("add01af6-9901-43d3-950c-81f3702a5d12", "61147561-d24f-4a49-b295-70696006c96d", (float)(byte)1, "1a1f4baa-144f-4a2a-8f04-65ea83560f2d", "84fe6ce9-ea28-4361-b232-f1d6cd071155");
    java.lang.String str6 = review5.getRestaurantId();
    review5.setDate("abd293bf-2239-4c98-b7ba-ff7036c5aa21");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61147561-d24f-4a49-b295-70696006c96d"+ "'", str6.equals("61147561-d24f-4a49-b295-70696006c96d"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    java.lang.String str7 = restaurant3.getLocalization();
    restaurant3.setLocalization("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.lang.String str14 = restaurant10.getId();
    restaurant10.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f21 = product20.getCost();
    java.lang.String str22 = product20.getId();
    restaurant10.addProduct(product20);
    restaurant10.setName("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
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
    restaurant10.setProductList(list_product93);
    restaurant3.setProductList(list_product93);
    java.lang.Float f97 = restaurant3.getRate();
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "da6b443c-016f-4d27-9318-134c52619051"+ "'", str14.equals("da6b443c-016f-4d27-9318-134c52619051"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f21 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "151c0401-428b-48ad-9658-eb971aec0fe6"+ "'", str22.equals("151c0401-428b-48ad-9658-eb971aec0fe6"));
    
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
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "482e9b01-2bb1-4e84-b92c-f927aa5165b7"+ "'", str77.equals("482e9b01-2bb1-4e84-b92c-f927aa5165b7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f97 + "' != '" + 0.0f+ "'", f97.equals(0.0f));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.lang.String str11 = campus0.getId();
    campus0.setId("3b82cff9-a309-428b-9917-11e098eb1d05");
    java.util.List<java.lang.String> list_str14 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c4891d7c-1af6-4517-9955-203bb6f99e01"+ "'", str6.equals("c4891d7c-1af6-4517-9955-203bb6f99e01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.addCampus("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    boolean b5 = university1.removeCampus("f2844dc8-fbce-4873-a6af-e379d43a9647");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

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
    restaurant19.setApproved(true);
    java.lang.String str31 = restaurant19.getLocalization();
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str36 = restaurant35.getCampusId();
    restaurant35.setCampusId("08ef2ed8-271a-4aad-9415-47b0dba1b9a7");
    restaurant19.update(restaurant35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ea666a71-262a-403c-9f06-096df549cfbe"+ "'", str10.equals("ea666a71-262a-403c-9f06-096df549cfbe"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "55554711-0955-480b-8a48-0a9ecd54b401"+ "'", str23.equals("55554711-0955-480b-8a48-0a9ecd54b401"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str28.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "90afc816-9759-4b54-86ff-a1b7beb18772"+ "'", str36.equals("90afc816-9759-4b54-86ff-a1b7beb18772"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    java.lang.String str7 = restaurant3.getLocalization();
    java.lang.String str8 = restaurant3.getId();
    restaurant3.setApproved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3d66afd0-187c-4e3d-a8a4-73cae28b645a"+ "'", str8.equals("3d66afd0-187c-4e3d-a8a4-73cae28b645a"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant10.setUserId("hi!");
    restaurant10.setName("12/03/2017");
    com.example.unifood.models.Review review19 = new com.example.unifood.models.Review();
    java.lang.String str20 = review19.getId();
    boolean b21 = restaurant10.removeReview(review19);
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    boolean b24 = product23.getAvailability();
    restaurant22.addProduct(product23);
    product23.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b28 = restaurant10.removeProduct(product23);
    boolean b29 = product23.getAvailability();
    product23.setDescription("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.lang.String str32 = product23.getDescription();
    restaurant0.addProduct(product23);
    java.lang.String str34 = product23.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "facd64d2-4410-40b8-818b-75353262244b"+ "'", str8.equals("facd64d2-4410-40b8-818b-75353262244b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "5b2980f3-9697-4a8d-9468-eee366ceb3d5"+ "'", str20.equals("5b2980f3-9697-4a8d-9468-eee366ceb3d5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "53d5e04e-abb5-45a7-a278-d742367421a0"+ "'", str32.equals("53d5e04e-abb5-45a7-a278-d742367421a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str34.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

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
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review();
    java.lang.String str41 = review40.getDate();
    review40.setRate((float)0);
    review40.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    boolean b46 = restaurant0.removeReview(review40);
    review40.setRestaurantId("81cfe6c0-708c-45e9-9ea7-39ce7d24f5f8");
    java.lang.String str49 = review40.getDate();
    
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
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("5ded886a-3fa7-4a68-be6f-6c24c22c35f3");

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str10 = campus0.getId();
    java.lang.String str11 = campus0.getName();
    boolean b13 = campus0.addRestaurant("985bbbf6-84a2-45bf-a251-ec3589650d8b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1f75d645-93ac-43f9-8043-b31f312517aa"+ "'", str6.equals("1f75d645-93ac-43f9-8043-b31f312517aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str10.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    boolean b4 = studentInfo0.addRestaurantToFavorites("d054f793-8da1-4b53-9056-26346d97b155");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavRestaurants();
    boolean b7 = studentInfo0.delProductFromFavorites("e58ca70f-164c-43f0-8f34-ca5b7a641ffb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

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
    restaurant3.setApproved(false);
    
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
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e7f649ee-807f-421d-9056-030fa92408e8", 0.0f, "");

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str6 = product0.getDescription();
    product0.setAvailability(false);
    product0.setAvailability(true);
    float f11 = product0.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    university1.setName("983a5c4e-aa49-46e5-83ef-45159624651e");
    university1.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d2596afa-c8be-46af-8488-d1e9412b0601"+ "'", str2.equals("d2596afa-c8be-46af-8488-d1e9412b0601"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getId();
    review0.setRestaurantId("baa5f137-1e93-4481-98da-208734d7103f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str2 = campus1.getName();
    boolean b4 = campus1.removeRestaurant("a339ea1e-a8f5-4f77-af1e-264cde0ed0dd");
    java.lang.String str5 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str2.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.delRestaurantFromFavorites("e0ed697c-d17d-4982-81ea-097a494113d9");
    boolean b13 = studentInfo0.delProductFromFavorites("9626d0ba-fe19-4356-a232-426c972c7dfc");
    java.util.List<java.lang.String> list_str14 = studentInfo0.getFavProducts();
    boolean b16 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

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
    java.lang.String str20 = restaurant0.getUserId();
    restaurant0.updateRating();
    java.lang.String str22 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "63cbfaa7-e9cf-481c-a61d-c6490dcfc82e"+ "'", str10.equals("63cbfaa7-e9cf-481c-a61d-c6490dcfc82e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

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
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    boolean b28 = studentInfo26.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b30 = studentInfo26.delProductFromFavorites("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    java.util.List<java.lang.String> list_str31 = studentInfo26.getFavProducts();
    boolean b32 = restaurant14.equals((java.lang.Object)studentInfo26);
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "41ea4db7-ac47-405c-811c-b9fcd44eec4b"+ "'", str22.equals("41ea4db7-ac47-405c-811c-b9fcd44eec4b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

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
    java.lang.String str85 = restaurant18.getShortDescription();
    java.lang.String str86 = restaurant18.getId();
    
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
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "fe678fc5-4e06-4391-806e-5465dcb0a725"+ "'", str61.equals("fe678fc5-4e06-4391-806e-5465dcb0a725"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "f3e1e49b-9bf3-492e-ba2b-855ce685f535"+ "'", str86.equals("f3e1e49b-9bf3-492e-ba2b-855ce685f535"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("03825168-f8c0-4a5e-bee1-6a9503b76215", "49f86ca5-9a90-47a6-9268-c72162277e22", (float)(-1), "edc43374-1bb5-47a3-893f-7363f36242e4");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

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
    university1.setId("544335c6-2fef-496b-a965-9a6f6604b809");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "03aa6fc5-eb53-48d3-b7db-2b92228c2b78"+ "'", str2.equals("03aa6fc5-eb53-48d3-b7db-2b92228c2b78"));
    
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
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "f1d11139-4ded-4cce-ad08-c0ef7485cc8b"+ "'", str86.equals("f1d11139-4ded-4cce-ad08-c0ef7485cc8b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str89);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    review0.setUserId("53d5e04e-abb5-45a7-a278-d742367421a0");
    review0.setUserId("d6df1b87-a5b7-4af3-ab66-be45705259d4");
    float f10 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.setApproved(false);
    boolean b9 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getId();
    boolean b3 = campus0.addRestaurant("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.lang.String str4 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "165a27ec-ff2d-40f6-a903-6eb54fd9241d"+ "'", str1.equals("165a27ec-ff2d-40f6-a903-6eb54fd9241d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "165a27ec-ff2d-40f6-a903-6eb54fd9241d"+ "'", str4.equals("165a27ec-ff2d-40f6-a903-6eb54fd9241d"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    boolean b13 = university1.removeCampus("81590a16-8f83-4cfa-b624-11d3353e52f8");
    java.util.List<java.lang.String> list_str14 = university1.getAllCampus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

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
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    review28.setId("");
    java.lang.String str31 = review28.getUserId();
    review28.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review28.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    review28.setRate((float)(-1L));
    restaurant3.addReview(review28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getComment();
    review0.setComment("3eb01d1b-8df4-4077-9221-8c1b6b20a4fb");
    review0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5d054af0-c80d-4035-bb25-9ed4d59f9c35"+ "'", str2.equals("5d054af0-c80d-4035-bb25-9ed4d59f9c35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setName("efbb39b8-b569-44a5-8350-5d34ec9574db");
    java.lang.String str6 = restaurant3.getUserId();
    java.util.List<com.example.unifood.models.Product> list_product7 = restaurant3.getProductList();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant11.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    restaurant3.update(restaurant11);
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    product15.setDescription("hi!");
    product15.setName("");
    float f20 = product15.getCost();
    product15.setName("ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    boolean b23 = restaurant3.removeProduct(product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    userInfo0.setFirstName("6d874e94-287d-4dd4-b345-3dda47e1c3e2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    java.lang.String str9 = review0.getComment();
    review0.setUserId("2ca23794-72a3-4cca-8687-a1b0e6c8a5c2");
    review0.setComment("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    review0.setDate("a889cdd9-5758-40f3-8616-4909048ca3f7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c7492f51-751c-49fa-9823-c9ff6db2c39f", "", "5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("cda102ed-5d20-4a30-b455-702bfe3561b2");
    java.lang.String str7 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "cda102ed-5d20-4a30-b455-702bfe3561b2"+ "'", str7.equals("cda102ed-5d20-4a30-b455-702bfe3561b2"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

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
    product52.setCost((float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "a0595f5b-9e71-49af-b313-8af4de39dbc4"+ "'", str10.equals("a0595f5b-9e71-49af-b313-8af4de39dbc4"));
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "83f77d8b-83f9-4ae9-b04a-013bab7aff32"+ "'", str33.equals("83f77d8b-83f9-4ae9-b04a-013bab7aff32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "12/03/2017"+ "'", str38.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "59051436-d48a-48c9-a912-32cff5958d2c"+ "'", str49.equals("59051436-d48a-48c9-a912-32cff5958d2c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo0.setCampusId("5142e6c4-60e6-4c9b-846f-944459501cf1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("9946470d-d39c-4a9b-a598-9cb41808251a", "9f875c13-8f07-4b49-af32-762823628ddc", "42760a12-bbeb-4085-9c62-6d487a4eb9d4");

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

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
    boolean b18 = campus0.removeRestaurant("ee3e7097-4eed-4d70-a084-49efff46f6ac");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "f2ca2fd9-2be0-4b97-8876-e070c031cd77"+ "'", str6.equals("f2ca2fd9-2be0-4b97-8876-e070c031cd77"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("9177b50b-86bb-45a0-bcfc-679787c40e0f", "e92b4a2a-f3bc-4b00-8732-e346ae29b2c4", 10.0f, "38ecb376-2fb2-4cf7-a955-c6972cf234c2", "119a3a4e-78a9-4084-a205-4bc1e89469d8");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

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
    java.lang.String str20 = product13.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "3f3352db-2779-402c-9147-35691fcc5886"+ "'", str10.equals("3f3352db-2779-402c-9147-35691fcc5886"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str20.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str8 = review0.getComment();
    review0.setId("ed8899de-d74b-4c5b-bafd-c89f775d295a");
    java.lang.String str11 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"+ "'", str8.equals("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("f83265ce-fd72-40dc-a341-0a77f34086e0");

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    restaurant0.setUserId("5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str12 = restaurant0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    product5.setDescription("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    product5.setAvailability(false);
    boolean b13 = product5.getAvailability();
    float f14 = product5.getCost();
    product5.setName("0d02eae8-71c2-4edb-9287-ddd87000a6ba");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.0f);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    product0.setDescription("9f481d81-6338-48a5-ae2a-c59310374b31");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
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
    com.example.unifood.models.StudentInfo studentInfo38 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str39 = studentInfo38.getFavRestaurants();
    boolean b41 = studentInfo38.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str42 = studentInfo38.getCampusId();
    com.example.unifood.models.University university44 = new com.example.unifood.models.University("hi!");
    java.lang.String str45 = university44.getId();
    boolean b47 = university44.addCampus("hi!");
    java.lang.String str48 = university44.getId();
    university44.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str51 = university44.getName();
    com.example.unifood.models.Campus campus53 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str54 = campus53.getId();
    com.example.unifood.models.StudentInfo studentInfo55 = new com.example.unifood.models.StudentInfo();
    studentInfo55.setCampusId("");
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str64, str_array63);
    studentInfo55.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str64);
    campus53.setRestaurants((java.util.List<java.lang.String>)arraylist_str64);
    university44.setAllCampus((java.util.List<java.lang.String>)arraylist_str64);
    studentInfo38.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str64);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "4059b903-9f70-4cc2-983a-d32fc0a20533"+ "'", str45.equals("4059b903-9f70-4cc2-983a-d32fc0a20533"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "4059b903-9f70-4cc2-983a-d32fc0a20533"+ "'", str48.equals("4059b903-9f70-4cc2-983a-d32fc0a20533"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "97c6065a-5ace-4e48-924e-726a0720cea6"+ "'", str54.equals("97c6065a-5ace-4e48-924e-726a0720cea6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c7492f51-751c-49fa-9823-c9ff6db2c39f", "", "5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getFirstName();
    userInfo3.setType("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str5.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str6.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

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
    campus0.setName("6c131d36-5c7b-4dd7-8d26-6356ffc532b8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec"+ "'", str6.equals("1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec"+ "'", str8.equals("1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec"+ "'", str9.equals("1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

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
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str30 = restaurant29.getCampusId();
    restaurant0.update(restaurant29);
    restaurant0.setLocalization("899c550f-0e3e-410c-b76e-810b1269a0a5");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "c6dd2a59-9be9-433e-83e2-d34e7569c3b0"+ "'", str22.equals("c6dd2a59-9be9-433e-83e2-d34e7569c3b0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "90afc816-9759-4b54-86ff-a1b7beb18772"+ "'", str30.equals("90afc816-9759-4b54-86ff-a1b7beb18772"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("38e9601d-4195-43c5-8f2c-566c2ef91772");

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    review5.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review5.setId("37810574-eac6-4050-984e-bce27a334681");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("7d40e1e0-0e93-44f9-b76d-6ad8bc0170eb");

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("0b709982-69f3-49a0-9c5c-e9e7adb6e122");

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

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
    boolean b39 = restaurant0.removeReview(review36);
    java.lang.String str40 = restaurant0.getShortDescription();
    java.lang.Float f41 = restaurant0.getRate();
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product43 = new com.example.unifood.models.Product();
    boolean b44 = product43.getAvailability();
    restaurant42.addProduct(product43);
    restaurant42.setShortDescription("");
    restaurant42.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant42.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant52 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product53 = new com.example.unifood.models.Product();
    boolean b54 = product53.getAvailability();
    restaurant52.addProduct(product53);
    java.util.List<com.example.unifood.models.Product> list_product56 = restaurant52.getProductList();
    restaurant42.setProductList(list_product56);
    java.util.List<com.example.unifood.models.Review> list_review58 = restaurant42.getReviewList();
    restaurant0.setReviewList(list_review58);
    java.util.List<com.example.unifood.models.Product> list_product60 = restaurant0.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "764596ca-5ec5-491b-a935-3ed239b35aba"+ "'", str14.equals("764596ca-5ec5-491b-a935-3ed239b35aba"));
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "28afdeee-0ae9-42a3-af3a-d4963b34322d"+ "'", str37.equals("28afdeee-0ae9-42a3-af3a-d4963b34322d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f41 + "' != '" + 0.0f+ "'", f41.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product60);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("8664e462-8683-4210-8fa3-b99e2a278578", "c2426597-cce5-40f1-893d-8aab21c1b7d0", (float)0L, "c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    review4.setId("863519d7-3889-41ea-bba9-11c654399b39");
    java.lang.String str7 = review4.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "c2426597-cce5-40f1-893d-8aab21c1b7d0"+ "'", str7.equals("c2426597-cce5-40f1-893d-8aab21c1b7d0"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    float f4 = product0.getCost();
    product0.setName("2adc96c3-f320-42fb-97f3-c22c606913fb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("9626d0ba-fe19-4356-a232-426c972c7dfc", "4f54b634-288e-42c6-b781-2869535b5bb5", 0.0f, "f666c841-c560-4874-8cbd-008c848d1f42");
    java.lang.String str5 = review4.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f666c841-c560-4874-8cbd-008c848d1f42"+ "'", str5.equals("f666c841-c560-4874-8cbd-008c848d1f42"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

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
    boolean b18 = restaurant0.getApproved();
    restaurant0.setId("d07e476e-cb4d-45e9-8155-58166cdd0c15");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("0df03599-db7c-4d07-8c1e-da7057b52067");

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    float f5 = product0.getCost();
    java.lang.String str6 = product0.getDescription();
    boolean b7 = product0.getAvailability();
    boolean b8 = product0.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str6.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setRate(10.0f);
    review0.setRestaurantId("53d740cc-3498-48a3-8d69-2631da037847");
    java.lang.String str11 = review0.getDate();
    java.lang.String str12 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

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
    java.lang.String str16 = product14.getId();
    boolean b17 = restaurant0.removeProduct(product14);
    java.lang.String str18 = product14.getId();
    product14.setCost((float)100L);
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "e2c5ed7e-a496-403a-97bc-9f24b0b99400"+ "'", str16.equals("e2c5ed7e-a496-403a-97bc-9f24b0b99400"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "e2c5ed7e-a496-403a-97bc-9f24b0b99400"+ "'", str18.equals("e2c5ed7e-a496-403a-97bc-9f24b0b99400"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getComment();
    review0.setRestaurantId("18ef715a-6ab1-4c67-9e31-4bc2f2e5dc5e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a638a696-e4e7-4e31-8e1c-b540d7c5c80a"+ "'", str2.equals("a638a696-e4e7-4e31-8e1c-b540d7c5c80a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e3c6d4bd-1a7c-45b9-b5f9-615abacff986", (float)'4', "32f01847-2cae-4789-9e81-1bfd0d3a0b3a");

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

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
    com.example.unifood.models.Restaurant restaurant60 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant60.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str63 = restaurant60.getShortDescription();
    boolean b65 = restaurant60.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant60.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant60.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant60.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.lang.String str72 = restaurant60.getCampusId();
    restaurant60.setCampusId("82a3735c-51a5-4196-b1e2-ba5966598a25");
    com.example.unifood.models.Product product78 = new com.example.unifood.models.Product("1cc346cd-7e37-4aa5-a18f-4211b5a529c9", (float)10L, "15149c67-efc5-4744-85b0-8dc2ac121df7");
    product78.setCost((float)(short)10);
    restaurant60.addProduct(product78);
    restaurant60.setId("06cccbeb-fd5c-4531-b0fc-216ad9f70ccb");
    restaurant3.update(restaurant60);
    java.lang.String str85 = restaurant3.getUserId();
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "d57cc407-df89-4b4f-8307-89642851286d"+ "'", str26.equals("d57cc407-df89-4b4f-8307-89642851286d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "091cf376-935e-49c0-af6a-d46db170a341"+ "'", str35.equals("091cf376-935e-49c0-af6a-d46db170a341"));
    
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
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + ""+ "'", str63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str72.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    com.example.unifood.models.Review review6 = null;
    restaurant0.addReview(review6);
    restaurant0.setShortDescription("75e0de5b-af05-410e-9afa-c211b35b0e94");
    restaurant0.setRate((java.lang.Float)1.0f);
    java.lang.Float f12 = restaurant0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f12 + "' != '" + 1.0f+ "'", f12.equals(1.0f));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setCost(10.0f);
    java.lang.String str4 = product0.getName();
    product0.setCost((float)(-1));
    boolean b7 = product0.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

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
    java.lang.Float f32 = restaurant11.getRate();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "549a83ce-8703-4676-b315-34ee93ee2aad"+ "'", str27.equals("549a83ce-8703-4676-b315-34ee93ee2aad"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str30.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f32 + "' != '" + 0.0f+ "'", f32.equals(0.0f));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("904de44c-2fcc-4342-bf78-0e04d027811d");

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    product0.setId("7ef0cf59-e144-416a-a062-c1d947e146d2");
    product0.setAvailability(true);
    product0.setId("35ec99ce-9633-4047-9051-277ff4281ea7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    com.example.unifood.exceptions.UserException userException0 = new com.example.unifood.exceptions.UserException();
    java.lang.Throwable[] throwable_array1 = userException0.getSuppressed();
    java.lang.String str2 = userException0.toString();
    java.lang.Throwable[] throwable_array3 = userException0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str2.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("15149c67-efc5-4744-85b0-8dc2ac121df7");
    boolean b17 = studentInfo0.addProductToFavorites("c1d3b8a3-adce-431f-a302-6cd30c1e553d");
    java.lang.String str18 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "15149c67-efc5-4744-85b0-8dc2ac121df7"+ "'", str18.equals("15149c67-efc5-4744-85b0-8dc2ac121df7"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setFirstName("b6fd1026-57eb-4577-a667-6dac64083d57");
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    userInfo0.setType("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo0.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    studentInfo7.setCampusId("");
    studentInfo7.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b13 = studentInfo7.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavRestaurants();
    studentInfo7.setFavProducts(list_str15);
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    studentInfo17.setCampusId("");
    studentInfo17.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo17.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b25 = studentInfo17.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.Campus campus26 = new com.example.unifood.models.Campus();
    boolean b28 = campus26.removeRestaurant("hi!");
    java.lang.String[] str_array53 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<java.lang.String>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str54, str_array53);
    campus26.setRestaurants((java.util.List<java.lang.String>)arraylist_str54);
    studentInfo17.setFavProducts((java.util.List<java.lang.String>)arraylist_str54);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str54);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str54);
    boolean b61 = studentInfo0.addRestaurantToFavorites("94b6648e-ea0c-4c4f-940e-4bb86a28eea1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

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
    product12.setCost((float)(short)10);
    boolean b20 = product12.getAvailability();
    boolean b21 = product12.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("15149c67-efc5-4744-85b0-8dc2ac121df7");
    boolean b17 = studentInfo0.addProductToFavorites("c1d3b8a3-adce-431f-a302-6cd30c1e553d");
    studentInfo0.setCampusId("84c380a1-fee2-4bfe-82b9-7668a6f07e00");
    java.util.List<java.lang.String> list_str20 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setName("");
    float f5 = product0.getCost();
    product0.setName("ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    product0.setDescription("");
    java.lang.String str10 = product0.getId();
    product0.setDescription("79eb0264-79c6-4568-ab49-5544db6f8762");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ee6b4882-825a-4b49-9acb-1919375c71ce"+ "'", str10.equals("ee6b4882-825a-4b49-9acb-1919375c71ce"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str5 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str5.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getType();
    userInfo3.setFirstName("8922762e-c394-4758-8e43-89d8388d9c11");
    userInfo3.setLastName("22ad7b07-f59a-4272-bf9c-378211cbc4dc");
    java.lang.String str11 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str6.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

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
    campus1.setName("c11d9b42-1817-4b6b-96e0-43ad37cbf5d4");
    com.example.unifood.models.University university22 = new com.example.unifood.models.University();
    university22.setName("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str25 = university22.getName();
    java.lang.String str26 = university22.getName();
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo();
    studentInfo27.setCampusId("");
    java.util.List<java.lang.String> list_str30 = studentInfo27.getFavRestaurants();
    boolean b32 = studentInfo27.delProductFromFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    java.util.List<java.lang.String> list_str33 = studentInfo27.getFavRestaurants();
    university22.setAllCampus(list_str33);
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo();
    studentInfo35.setCampusId("");
    java.util.List<java.lang.String> list_str38 = studentInfo35.getFavRestaurants();
    java.util.List<java.lang.String> list_str39 = studentInfo35.getFavProducts();
    university22.setAllCampus(list_str39);
    campus1.setRestaurants(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "604b3f90-e482-41e6-afea-a70c02c8a38f"+ "'", str2.equals("604b3f90-e482-41e6-afea-a70c02c8a38f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str25.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str26.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

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
    boolean b30 = studentInfo0.addRestaurantToFavorites("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    com.example.unifood.models.Campus campus31 = new com.example.unifood.models.Campus();
    boolean b33 = campus31.removeRestaurant("hi!");
    campus31.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str36 = campus31.getRestaurants();
    java.lang.String str37 = campus31.getId();
    java.lang.String str38 = campus31.getName();
    java.lang.String str39 = campus31.getId();
    java.lang.String str40 = campus31.getId();
    campus31.setId("");
    boolean b44 = campus31.removeRestaurant("ef77ffb2-b6a9-4a22-9ad1-419ca73d588e");
    com.example.unifood.models.StudentInfo studentInfo46 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str47 = studentInfo46.getFavRestaurants();
    campus31.setRestaurants(list_str47);
    studentInfo0.setFavProducts(list_str47);
    
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
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "c8ce7b6d-93e8-4c93-8948-9e8f9ad66736"+ "'", str37.equals("c8ce7b6d-93e8-4c93-8948-9e8f9ad66736"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str38.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "c8ce7b6d-93e8-4c93-8948-9e8f9ad66736"+ "'", str39.equals("c8ce7b6d-93e8-4c93-8948-9e8f9ad66736"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "c8ce7b6d-93e8-4c93-8948-9e8f9ad66736"+ "'", str40.equals("c8ce7b6d-93e8-4c93-8948-9e8f9ad66736"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant3.getProductList();
    java.lang.String str11 = restaurant3.getId();
    restaurant3.setId("e0c88d18-487c-4276-a6a1-47d641ac56c8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c96c8877-6adb-4b55-b201-bd511cf22c69"+ "'", str5.equals("c96c8877-6adb-4b55-b201-bd511cf22c69"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "c96c8877-6adb-4b55-b201-bd511cf22c69"+ "'", str11.equals("c96c8877-6adb-4b55-b201-bd511cf22c69"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("7071a3a8-0659-48de-9594-da8247027c10", "0f339f5e-0e32-46d7-8fdb-0b682e6f30fe", (float)' ', "d949a2b6-65c6-4e1a-a9c4-f5bf3008a93b");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getUserId();
    java.lang.String str7 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

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
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product30 = new com.example.unifood.models.Product();
    boolean b31 = product30.getAvailability();
    restaurant29.addProduct(product30);
    restaurant29.setShortDescription("");
    restaurant29.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str37 = restaurant29.getCampusId();
    restaurant3.update(restaurant29);
    
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
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

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
    campus0.setName("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "94eb593e-2890-4636-805d-cd8da013897c"+ "'", str14.equals("94eb593e-2890-4636-805d-cd8da013897c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

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
    com.example.unifood.models.Restaurant restaurant34 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant34.setName("12/03/2017");
    java.lang.String str37 = restaurant34.getUserId();
    com.example.unifood.models.Restaurant restaurant38 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product39 = new com.example.unifood.models.Product();
    boolean b40 = product39.getAvailability();
    restaurant38.addProduct(product39);
    java.util.List<com.example.unifood.models.Product> list_product42 = restaurant38.getProductList();
    restaurant38.setUserId("hi!");
    restaurant38.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review47 = restaurant38.getReviewList();
    com.example.unifood.models.Restaurant restaurant48 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product49 = new com.example.unifood.models.Product();
    boolean b50 = product49.getAvailability();
    restaurant48.addProduct(product49);
    java.util.List<com.example.unifood.models.Product> list_product52 = restaurant48.getProductList();
    restaurant48.setUserId("hi!");
    restaurant48.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    boolean b57 = restaurant38.equals((java.lang.Object)"3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review();
    java.lang.String str59 = review58.getId();
    java.lang.String str60 = review58.getUserId();
    restaurant38.addReview(review58);
    restaurant34.update(restaurant38);
    java.lang.String str63 = restaurant34.getUserId();
    boolean b64 = restaurant3.equals((java.lang.Object)restaurant34);
    boolean b66 = restaurant34.equals((java.lang.Object)"482d9e99-1a88-4a3e-8050-55faade7b3ae");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "b98b280e-e96d-4697-962c-e539c48aecb3"+ "'", str21.equals("b98b280e-e96d-4697-962c-e539c48aecb3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "44341332-36c2-4454-b7f8-fc0b9a7b0e1a"+ "'", str59.equals("44341332-36c2-4454-b7f8-fc0b9a7b0e1a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + ""+ "'", str63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

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
    java.lang.String str59 = restaurant0.getLocalization();
    restaurant0.setName("6519f68d-97d1-458f-9990-c9b506118c8b");
    boolean b62 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0f7cede4-df8c-44f0-8bb4-771376402f95"+ "'", str4.equals("0f7cede4-df8c-44f0-8bb4-771376402f95"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1dc7662f-858c-446e-b460-112b4c568ecd"+ "'", str12.equals("1dc7662f-858c-446e-b460-112b4c568ecd"));
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "50e2197b-20e0-4a53-90b1-3533f42f7aa6"+ "'", str32.equals("50e2197b-20e0-4a53-90b1-3533f42f7aa6"));
    
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
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "d3c9dcf7-13c6-414b-a518-6d01d194d970"+ "'", str55.equals("d3c9dcf7-13c6-414b-a518-6d01d194d970"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    product0.setId("7ef0cf59-e144-416a-a062-c1d947e146d2");
    java.lang.String str10 = product0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str5.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getType();
    java.lang.String str6 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d2c231e2-7a36-4c3e-85a5-77d4735a3460"+ "'", str4.equals("d2c231e2-7a36-4c3e-85a5-77d4735a3460"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "376f29dd-77f2-4b44-8c95-b9ac348c4e6f"+ "'", str6.equals("376f29dd-77f2-4b44-8c95-b9ac348c4e6f"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    boolean b3 = university1.addCampus("e3c02b6c-6ad8-4057-8eb3-b966f859b297");
    university1.setId("1fec210c-9f82-4e63-bc0d-b0547ecaa55a");
    java.lang.String str6 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ccf553f7-d9de-49ff-80df-05ba74bcec16"+ "'", str6.equals("ccf553f7-d9de-49ff-80df-05ba74bcec16"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("45ea153f-0dad-4b31-add4-89c6146a37e0", "a6714532-6f5b-4cf5-822b-96d09fb5ee50", "3d3ec578-45a4-47b2-8334-c039df5a98a8");

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

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
    java.util.List<com.example.unifood.models.Review> list_review28 = restaurant0.getReviewList();
    restaurant0.setApproved(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review28);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    boolean b7 = restaurant3.getApproved();
    restaurant3.setLocalization("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant13.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str16 = restaurant13.getShortDescription();
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    java.lang.String str18 = review17.getDate();
    java.lang.String str19 = review17.getComment();
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    review20.setId("");
    java.lang.String str23 = review20.getUserId();
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    review24.setRate((float)10L);
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    review27.setId("");
    java.lang.String str30 = review27.getUserId();
    java.lang.String str31 = review27.getRestaurantId();
    com.example.unifood.models.Review review32 = new com.example.unifood.models.Review();
    review32.setId("");
    com.example.unifood.models.Review review40 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review40.setUserId("");
    com.example.unifood.models.Review review43 = new com.example.unifood.models.Review();
    java.lang.String str44 = review43.getDate();
    java.lang.String str45 = review43.getComment();
    com.example.unifood.models.Review review46 = new com.example.unifood.models.Review();
    review46.setId("");
    com.example.unifood.models.Review review49 = new com.example.unifood.models.Review();
    review49.setId("");
    java.lang.String str52 = review49.getUserId();
    java.lang.String str53 = review49.getRestaurantId();
    java.lang.String str54 = review49.getDate();
    com.example.unifood.models.Review review55 = new com.example.unifood.models.Review();
    java.lang.String str56 = review55.getId();
    com.example.unifood.models.Review review62 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review62.setUserId("");
    com.example.unifood.models.Review review65 = new com.example.unifood.models.Review();
    review65.setId("");
    com.example.unifood.models.Review[] review_array68 = new com.example.unifood.models.Review[] { review17, review20, review24, review27, review32, review40, review43, review46, review49, review55, review62, review65 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review69 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review69, review_array68);
    restaurant13.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review69);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review69);
    java.lang.Float f73 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "c8676a0b-3bbf-4be6-8098-aba3faa21308"+ "'", str56.equals("c8676a0b-3bbf-4be6-8098-aba3faa21308"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f73 + "' != '" + 0.0f+ "'", f73.equals(0.0f));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("cdbb11ff-0ded-41d4-9a99-4197a5c14e79");

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    review5.setRestaurantId("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    review5.setId("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    java.lang.String str12 = review5.getComment();
    java.lang.String str13 = review5.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str12.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str13.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.lang.String str2 = university1.getId();
    com.example.unifood.models.University university4 = new com.example.unifood.models.University("hi!");
    boolean b6 = university4.removeCampus("hi!");
    university4.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str9 = university4.getName();
    boolean b11 = university4.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    java.lang.String str12 = university4.getName();
    java.util.List<java.lang.String> list_str13 = university4.getAllCampus();
    university1.setAllCampus(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "04cc136d-899e-47d6-912e-56b8622e3783"+ "'", str2.equals("04cc136d-899e-47d6-912e-56b8622e3783"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setName("");
    java.lang.String str5 = product0.getName();
    java.lang.String str6 = product0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "97dc18f2-af04-41ba-896d-bf92c29d9a8c"+ "'", str6.equals("97dc18f2-af04-41ba-896d-bf92c29d9a8c"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("7df88144-033b-4859-9ab5-ada8e7b5b055");
    studentInfo1.setCampusId("73c0dd45-897d-4eb2-8356-deb3b8e00fa5");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("db34ddd0-ad9d-429f-aa95-bb67ba5a21f5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setId("a04223f0-b1c0-449c-afab-59a81cef4343");
    review0.setRate(1.0f);
    java.lang.String str7 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

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
    boolean b27 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1d67570f-1a4b-47a8-b621-6f4de13a3e09"+ "'", str14.equals("1d67570f-1a4b-47a8-b621-6f4de13a3e09"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    studentInfo0.setCampusId("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavProducts();
    boolean b11 = studentInfo0.delRestaurantFromFavorites("c40b8037-4592-4468-9c01-18f7c949b348");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

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
    product13.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0d7ad53a-754e-4abd-a854-431426ce9506"+ "'", str10.equals("0d7ad53a-754e-4abd-a854-431426ce9506"));
    
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

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setName("efbb39b8-b569-44a5-8350-5d34ec9574db");
    java.lang.String str6 = restaurant3.getUserId();
    java.util.List<com.example.unifood.models.Product> list_product7 = restaurant3.getProductList();
    restaurant3.updateRating();
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    review9.setId("");
    java.lang.String str12 = review9.getUserId();
    review9.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str15 = review9.getRestaurantId();
    boolean b16 = restaurant3.removeReview(review9);
    java.lang.String str17 = review9.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str17.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3bf5e8ba-15a6-4ce9-b3c8-1988ea56cfb5");
    boolean b3 = campus1.removeRestaurant("959115ea-d0ba-4dd1-b689-49af96cc1da9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    java.lang.String str9 = campus0.getId();
    campus0.setId("");
    java.lang.String str12 = campus0.getName();
    boolean b14 = campus0.removeRestaurant("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "73a571bf-c195-4ffe-92c0-4ba0f80ec94c"+ "'", str6.equals("73a571bf-c195-4ffe-92c0-4ba0f80ec94c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "73a571bf-c195-4ffe-92c0-4ba0f80ec94c"+ "'", str8.equals("73a571bf-c195-4ffe-92c0-4ba0f80ec94c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "73a571bf-c195-4ffe-92c0-4ba0f80ec94c"+ "'", str9.equals("73a571bf-c195-4ffe-92c0-4ba0f80ec94c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("81c77406-02a7-40b2-9136-f952f2242165");

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

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
    review58.setUserId("090d4d8e-cace-44ee-8920-101722da86af");
    
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

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("8486b532-ad8c-4ee4-95f6-cc223414be34");

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    product5.setDescription("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    product5.setAvailability(false);
    boolean b13 = product5.getAvailability();
    java.lang.String str14 = product5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b4 = product3.getAvailability();
    java.lang.String str5 = product3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

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
    product10.setDescription("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    java.lang.String str16 = product10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "76415ea9-c1f3-4173-b4e3-a24ccb6c9edc"+ "'", str4.equals("76415ea9-c1f3-4173-b4e3-a24ccb6c9edc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "b38845a4-bd11-4e13-8692-6c7b8fa925af"+ "'", str12.equals("b38845a4-bd11-4e13-8692-6c7b8fa925af"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str16.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review0.setId("4b819b99-f8d3-449c-9233-2f18b7401b47");
    review0.setDate("1ce7c130-af3e-4d2a-a894-c2fa7d02bfb6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.lang.String str6 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant3.getReviewList();
    java.lang.String str8 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "78105597-ff15-4752-baa5-2bde8d6f7d94"+ "'", str5.equals("78105597-ff15-4752-baa5-2bde8d6f7d94"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "78105597-ff15-4752-baa5-2bde8d6f7d94"+ "'", str6.equals("78105597-ff15-4752-baa5-2bde8d6f7d94"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("1dbd805e-56e3-4ae1-ba27-156ae053a84c", "b9a35319-fcc8-40c8-9a6c-cc193698fa7e", "224e0f6e-d1ef-42f5-abf9-d41b5d9448d0");
    userInfo3.setLastName("e900e0fa-c3fb-41cd-bddb-b367147daa42");

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

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
    java.lang.String str16 = review4.getRestaurantId();
    review4.setUserId("46968e03-114d-4a8c-aa28-11a47b6f8199");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    boolean b4 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    boolean b7 = studentInfo0.delProductFromFavorites("b82299be-5fed-4ea3-b437-3446ff3f6b7e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("8922762e-c394-4758-8e43-89d8388d9c11");
    java.lang.String str2 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8922762e-c394-4758-8e43-89d8388d9c11"+ "'", str2.equals("8922762e-c394-4758-8e43-89d8388d9c11"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str10 = restaurant9.getShortDescription();
    java.lang.Float f11 = restaurant9.getRate();
    restaurant3.update(restaurant9);
    boolean b13 = restaurant9.getApproved();
    java.lang.String str14 = restaurant9.getId();
    restaurant9.setName("e9235121-99bf-400f-b59d-c6c80d92e3b8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0ad37039-d16c-4e2b-8b50-0d39758bbf09"+ "'", str5.equals("0ad37039-d16c-4e2b-8b50-0d39758bbf09"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "44e01134-a14e-400a-9c74-c1d4832b4034"+ "'", str14.equals("44e01134-a14e-400a-9c74-c1d4832b4034"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str2 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

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
    restaurant3.setCampusId("239d950c-a53b-45db-9e8f-483a040e426a");
    restaurant3.setApproved(false);
    com.example.unifood.models.Restaurant restaurant34 = new com.example.unifood.models.Restaurant();
    java.lang.String str35 = restaurant34.getUserId();
    restaurant34.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant34.updateRating();
    com.example.unifood.models.Restaurant restaurant39 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product40 = new com.example.unifood.models.Product();
    boolean b41 = product40.getAvailability();
    restaurant39.addProduct(product40);
    java.util.List<com.example.unifood.models.Product> list_product43 = restaurant39.getProductList();
    com.example.unifood.models.Product product44 = new com.example.unifood.models.Product();
    product44.setDescription("hi!");
    boolean b47 = restaurant39.removeProduct(product44);
    restaurant39.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str50 = restaurant39.getUserId();
    restaurant39.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    java.util.List<com.example.unifood.models.Review> list_review53 = restaurant39.getReviewList();
    restaurant34.setReviewList(list_review53);
    com.example.unifood.models.Restaurant restaurant58 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str59 = restaurant58.getName();
    restaurant58.setRate((java.lang.Float)10.0f);
    com.example.unifood.models.Restaurant restaurant62 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product63 = new com.example.unifood.models.Product();
    boolean b64 = product63.getAvailability();
    restaurant62.addProduct(product63);
    java.util.List<com.example.unifood.models.Product> list_product66 = restaurant62.getProductList();
    restaurant62.setUserId("hi!");
    restaurant62.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product71 = restaurant62.getProductList();
    restaurant58.setProductList(list_product71);
    restaurant34.setProductList(list_product71);
    restaurant3.setProductList(list_product71);
    
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
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str59.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product71);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("49976e80-f69f-4380-aa76-dc904dcb2eca");
    studentInfo1.setCampusId("7de577c2-7483-4581-8047-651e6a4ea04b");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("bf719fa2-623c-40d9-abb9-6f9bf7f630cc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getName();
    restaurant3.setRate((java.lang.Float)10.0f);
    restaurant3.setRate((java.lang.Float)32.0f);
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant12.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    java.util.List<com.example.unifood.models.Product> list_product19 = restaurant15.getProductList();
    restaurant15.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review22 = restaurant15.getReviewList();
    restaurant12.setReviewList(list_review22);
    java.util.List<com.example.unifood.models.Review> list_review24 = restaurant12.getReviewList();
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product26 = new com.example.unifood.models.Product();
    boolean b27 = product26.getAvailability();
    restaurant25.addProduct(product26);
    java.util.List<com.example.unifood.models.Product> list_product29 = restaurant25.getProductList();
    restaurant25.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant25.setApproved(false);
    restaurant25.setLocalization("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    restaurant12.update(restaurant25);
    restaurant12.setLocalization("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b39 = restaurant3.equals((java.lang.Object)"add01af6-9901-43d3-950c-81f3702a5d12");
    java.lang.String str40 = restaurant3.getLocalization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str40.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

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
    boolean b53 = studentInfo0.addRestaurantToFavorites("03d6f458-9b02-4a10-bdd2-2aab61b1d4de");
    boolean b55 = studentInfo0.addRestaurantToFavorites("30b8f772-650c-47f7-8b30-c1be04518acd");
    boolean b57 = studentInfo0.delRestaurantFromFavorites("4d2bca4d-884c-437d-bd71-d78cf7039f36");
    java.util.List<java.lang.String> list_str58 = studentInfo0.getFavRestaurants();
    
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
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("0f8c70c1-6d87-430c-855a-bb8906ff9fbb", "de90dd21-7ff7-4772-b73b-2f989c4f9192", (float)10, "hi!", "36e9cd33-a1c0-4732-a96b-fce5ebc8d118");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException1 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException2 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException1.addSuppressed((java.lang.Throwable)invalidCampusIdException2);
    java.lang.Throwable[] throwable_array4 = ownerException1.getSuppressed();
    java.lang.String str5 = ownerException1.toString();
    java.lang.String str6 = ownerException1.toString();
    ownerException0.addSuppressed((java.lang.Throwable)ownerException1);
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException8 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException9 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException8.addSuppressed((java.lang.Throwable)invalidCampusNameException9);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException11 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException9.addSuppressed((java.lang.Throwable)invalidDescriptionException11);
    com.example.unifood.exceptions.UserException userException13 = new com.example.unifood.exceptions.UserException();
    java.lang.String str14 = userException13.toString();
    invalidDescriptionException11.addSuppressed((java.lang.Throwable)userException13);
    java.lang.Throwable[] throwable_array16 = userException13.getSuppressed();
    ownerException1.addSuppressed((java.lang.Throwable)userException13);
    java.lang.Throwable[] throwable_array18 = userException13.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str14.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array18);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("b9e667e0-fd20-499f-8dee-17f8fff1afd9");
    java.util.List<java.lang.String> list_str2 = campus1.getRestaurants();
    campus1.setId("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

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
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str25 = restaurant24.getShortDescription();
    java.lang.Float f26 = restaurant24.getRate();
    com.example.unifood.models.Restaurant restaurant27 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    restaurant27.addProduct(product28);
    java.util.List<com.example.unifood.models.Product> list_product31 = restaurant27.getProductList();
    restaurant27.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Restaurant restaurant34 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product35 = new com.example.unifood.models.Product();
    boolean b36 = product35.getAvailability();
    restaurant34.addProduct(product35);
    java.util.List<com.example.unifood.models.Product> list_product38 = restaurant34.getProductList();
    restaurant34.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant34.setApproved(false);
    com.example.unifood.models.Restaurant restaurant43 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product44 = new com.example.unifood.models.Product();
    boolean b45 = product44.getAvailability();
    restaurant43.addProduct(product44);
    restaurant43.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant34.update(restaurant43);
    java.util.List<com.example.unifood.models.Review> list_review50 = restaurant34.getReviewList();
    restaurant27.setReviewList(list_review50);
    restaurant24.setReviewList(list_review50);
    boolean b53 = restaurant0.equals((java.lang.Object)list_review50);
    restaurant0.setLocalization("9befae08-3641-4d76-a03a-fd4046ab0bc7");
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f26 + "' != '" + 0.0f+ "'", f26.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review0.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str13 = review0.getDate();
    float f14 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str13.equals("2016930c-728d-45c5-a236-9c4833a30246"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.0f);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    review0.setDate("49d73418-a9cf-45c6-b785-3137e0dc0840");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

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
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product();
    boolean b23 = product22.getAvailability();
    restaurant21.addProduct(product22);
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant21.getProductList();
    restaurant21.setUserId("hi!");
    restaurant21.setName("12/03/2017");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    java.lang.String str31 = review30.getId();
    boolean b32 = restaurant21.removeReview(review30);
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    product34.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b39 = restaurant21.removeProduct(product34);
    product34.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    boolean b42 = restaurant0.removeProduct(product34);
    boolean b43 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "67ec4d38-1aef-46b2-a7ba-8c63cab7c73b"+ "'", str10.equals("67ec4d38-1aef-46b2-a7ba-8c63cab7c73b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "977989ef-9153-4dd8-9b05-51e84928fea7"+ "'", str31.equals("977989ef-9153-4dd8-9b05-51e84928fea7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    java.lang.String str8 = review0.getUserId();
    review0.setComment("8c040642-dc94-4cfb-9806-6d3178994ef9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

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
    java.lang.String str85 = restaurant18.getShortDescription();
    boolean b86 = restaurant18.getApproved();
    
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
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "40696869-ae94-4e36-820e-8cbb4ae747a4"+ "'", str61.equals("40696869-ae94-4e36-820e-8cbb4ae747a4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

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
    java.lang.String str23 = restaurant3.getShortDescription();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getName();
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setUserId("hi!");
    restaurant7.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant7.getProductList();
    restaurant7.setShortDescription("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Review> list_review19 = restaurant7.getReviewList();
    restaurant3.setReviewList(list_review19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str6.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review19);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setName("");
    float f5 = product0.getCost();
    product0.setId("28e5f954-8356-4228-9524-30113024356e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "e543d0dd-7b59-46bf-a7c0-c7ef44c0b746", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    review5.setRestaurantId("75e0de5b-af05-410e-9afa-c211b35b0e94");
    java.lang.String str10 = review5.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

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
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b21 = restaurant20.getApproved();
    java.lang.String str22 = restaurant20.getId();
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review28.setUserId("");
    java.lang.String str31 = review28.getUserId();
    review28.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b34 = restaurant20.removeReview(review28);
    java.lang.String str35 = review28.getUserId();
    boolean b36 = restaurant9.removeReview(review28);
    java.util.List<com.example.unifood.models.Product> list_product37 = restaurant9.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "f6f6fd4f-6320-451e-b699-9fac884a8e3b"+ "'", str22.equals("f6f6fd4f-6320-451e-b699-9fac884a8e3b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "c1839dde-2a89-4fce-a06f-c96ccbb3f563"+ "'", str35.equals("c1839dde-2a89-4fce-a06f-c96ccbb3f563"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product37);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b3 = university1.addCampus("aabd70ed-be9f-4452-9625-3f6b64c27121");
    boolean b5 = university1.addCampus("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    boolean b7 = university1.addCampus("15149c67-efc5-4744-85b0-8dc2ac121df7");
    java.lang.String str8 = university1.getId();
    boolean b10 = university1.addCampus("dfc0fb6f-d89d-4d55-b92b-27293bd4ed8c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32a700ff-bbac-4a68-9d73-f4a7bd0101cd"+ "'", str8.equals("32a700ff-bbac-4a68-9d73-f4a7bd0101cd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    java.lang.String str9 = product5.getName();
    java.lang.String str10 = product5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

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
    restaurant0.setRate((java.lang.Float)1.0f);
    java.lang.String str28 = restaurant0.getLocalization();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "a3a13e9a-0f78-4d6a-930b-0c1ee87b4393"+ "'", str22.equals("a3a13e9a-0f78-4d6a-930b-0c1ee87b4393"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("119f287e-61c5-497a-b55c-17489bcb03e9");
    boolean b3 = university1.addCampus("com.example.unifood.exceptions.InvalidLastNameException");
    university1.setName("3fb35e92-c88c-40d5-9ad4-6d4ea5046954");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    java.lang.Float f7 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f7 + "' != '" + 0.0f+ "'", f7.equals(0.0f));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("c3a59f45-c206-4230-af61-96410b506943");

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

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
    java.util.List<com.example.unifood.models.Review> list_review13 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "bf268db5-cde1-404b-bf2f-ebea21ccc863"+ "'", str4.equals("bf268db5-cde1-404b-bf2f-ebea21ccc863"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    java.lang.String str9 = campus0.getId();
    campus0.setId("");
    boolean b13 = campus0.addRestaurant("fcf4a53c-cc22-423a-bfaf-dea98ceedcea");
    campus0.setName("3e05f84f-fae9-4094-b787-f1eb3d49517a");
    java.lang.String str16 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64f7d46a-4de3-4e77-aaa9-bdf80652fee5"+ "'", str6.equals("64f7d46a-4de3-4e77-aaa9-bdf80652fee5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64f7d46a-4de3-4e77-aaa9-bdf80652fee5"+ "'", str8.equals("64f7d46a-4de3-4e77-aaa9-bdf80652fee5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64f7d46a-4de3-4e77-aaa9-bdf80652fee5"+ "'", str9.equals("64f7d46a-4de3-4e77-aaa9-bdf80652fee5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "3e05f84f-fae9-4094-b787-f1eb3d49517a"+ "'", str16.equals("3e05f84f-fae9-4094-b787-f1eb3d49517a"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException1 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException2 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException1.addSuppressed((java.lang.Throwable)invalidCampusIdException2);
    java.lang.Throwable[] throwable_array4 = ownerException1.getSuppressed();
    java.lang.String str5 = ownerException1.toString();
    java.lang.String str6 = ownerException1.toString();
    ownerException0.addSuppressed((java.lang.Throwable)ownerException1);
    java.lang.Throwable[] throwable_array8 = ownerException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setLastName("b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str4 = userInfo0.getFirstName();
    userInfo0.setFirstName("23206ba0-71a7-4570-a3e8-0e288c2551d4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    java.lang.String str6 = university1.getName();
    boolean b8 = university1.addCampus("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    university1.setId("0787174c-4cad-4937-8581-9e2857bc0965");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4e0a495b-2b81-4de4-bf8f-8d54bba5e4e3"+ "'", str2.equals("4e0a495b-2b81-4de4-bf8f-8d54bba5e4e3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4e0a495b-2b81-4de4-bf8f-8d54bba5e4e3"+ "'", str5.equals("4e0a495b-2b81-4de4-bf8f-8d54bba5e4e3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5", "16c89e8f-dcdc-4632-8a9b-1653843567f5", (float)(short)1, "76fe9853-ea57-4556-ac71-95373a19a23f");
    review4.setRestaurantId("");
    review4.setRate(32.0f);
    java.lang.String str9 = review4.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5"+ "'", str9.equals("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

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
    restaurant9.updateRating();
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    boolean b20 = product19.getAvailability();
    restaurant18.addProduct(product19);
    java.util.List<com.example.unifood.models.Product> list_product22 = restaurant18.getProductList();
    com.example.unifood.models.Product product23 = new com.example.unifood.models.Product();
    product23.setDescription("hi!");
    boolean b26 = restaurant18.removeProduct(product23);
    com.example.unifood.models.Product product27 = new com.example.unifood.models.Product();
    product27.setDescription("hi!");
    java.lang.String str30 = product27.getDescription();
    product27.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b33 = restaurant18.removeProduct(product27);
    float f34 = product27.getCost();
    boolean b35 = restaurant9.removeProduct(product27);
    restaurant9.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f34 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str14 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str15 = studentInfo0.getFavProducts();
    java.lang.String str16 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str17 = studentInfo0.getFavRestaurants();
    boolean b19 = studentInfo0.delProductFromFavorites("7c70ae26-387a-4111-9abd-ecf97bbc6324");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str14.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str16.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getId();
    product3.setDescription("5ed892b7-8b07-4339-8318-fe7c666739ed");
    float f8 = product3.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "dcba02d6-e7c7-4e4a-bc68-a7887ae1d60f"+ "'", str5.equals("dcba02d6-e7c7-4e4a-bc68-a7887ae1d60f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 10.0f);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    float f5 = product0.getCost();
    product0.setId("0daa91b1-d5d0-4037-891c-58f0636ac1bc");
    boolean b8 = product0.getAvailability();
    java.lang.String str9 = product0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

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
    java.util.List<java.lang.String> list_str17 = studentInfo0.getFavProducts();
    
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
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    restaurant0.setLocalization("f695ed82-229b-4109-958e-25c92fc7e7c5");
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant12.getProductList();
    restaurant12.setUserId("hi!");
    restaurant12.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review21 = restaurant12.getReviewList();
    restaurant12.setRate((java.lang.Float)0.0f);
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review();
    review24.setId("");
    java.lang.String str27 = review24.getUserId();
    java.lang.String str28 = review24.getRestaurantId();
    boolean b29 = restaurant12.removeReview(review24);
    restaurant0.update(restaurant12);
    com.example.unifood.models.Restaurant restaurant34 = new com.example.unifood.models.Restaurant("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6", "fde75b42-0c98-4497-90a3-eaf498e34ad2", "b6792249-a15c-420b-9817-44c9aa457e85");
    java.lang.String str35 = restaurant34.getName();
    java.util.List<com.example.unifood.models.Product> list_product36 = restaurant34.getProductList();
    restaurant0.setProductList(list_product36);
    java.lang.Float f38 = restaurant0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"+ "'", str35.equals("f058f8fc-1db8-4d99-84cd-c7b9413cd8e6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f38 + "' != '" + 0.0f+ "'", f38.equals(0.0f));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("8ad6c68f-c1f5-48da-9394-cc66a42c7c76", "b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4", "27fab29a-8261-4cad-9980-1ab61f13cf41");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("30e8b99e-061c-4276-854b-e7060014a7cf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "27fab29a-8261-4cad-9980-1ab61f13cf41"+ "'", str4.equals("27fab29a-8261-4cad-9980-1ab61f13cf41"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getRestaurantId();
    review0.setUserId("");
    review0.setUserId("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

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
    com.example.unifood.models.Campus campus26 = new com.example.unifood.models.Campus();
    boolean b28 = campus26.removeRestaurant("hi!");
    campus26.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str31 = campus26.getRestaurants();
    boolean b33 = campus26.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b35 = campus26.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b37 = campus26.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str38 = campus26.getName();
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    studentInfo39.setCampusId("");
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str48, str_array47);
    studentInfo39.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str48);
    campus26.setRestaurants((java.util.List<java.lang.String>)arraylist_str48);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str48);
    java.lang.String str53 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "9284ccc7-4eeb-48bd-bde6-966fcdadbb43"+ "'", str25.equals("9284ccc7-4eeb-48bd-bde6-966fcdadbb43"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str38.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

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
    review7.setRestaurantId("08c8736e-0adb-493b-9e80-2375e8320caf");
    java.lang.String str15 = review7.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e595705d-f29f-4a94-8ef8-471e0b71e437"+ "'", str8.equals("e595705d-f29f-4a94-8ef8-471e0b71e437"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

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
    java.util.List<com.example.unifood.models.Review> list_review20 = restaurant3.getReviewList();
    
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
    org.junit.Assert.assertNotNull(list_review20);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

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
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product22 = new com.example.unifood.models.Product();
    boolean b23 = product22.getAvailability();
    restaurant21.addProduct(product22);
    java.util.List<com.example.unifood.models.Product> list_product25 = restaurant21.getProductList();
    restaurant21.setUserId("hi!");
    restaurant21.setName("12/03/2017");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    java.lang.String str31 = review30.getId();
    boolean b32 = restaurant21.removeReview(review30);
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    product34.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b39 = restaurant21.removeProduct(product34);
    product34.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    boolean b42 = restaurant0.removeProduct(product34);
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "a8820379-27ca-4c06-9549-9431da8fae97"+ "'", str10.equals("a8820379-27ca-4c06-9549-9431da8fae97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "48c25d85-b054-43a6-8e9a-9f2337c85215"+ "'", str31.equals("48c25d85-b054-43a6-8e9a-9f2337c85215"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("449c88c7-dd88-473f-ad8c-9c5baa213afd", "1d2417d5-5118-4cf4-b0d6-d0be3e827f3e", "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    java.lang.String str4 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1d94a4ce-cef9-49e0-802d-05ee4d25de76"+ "'", str4.equals("1d94a4ce-cef9-49e0-802d-05ee4d25de76"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    university1.setId("f79ee0cc-de3f-4609-8494-f27553a1bb32");
    boolean b5 = university1.addCampus("747740b2-7173-4be5-aefa-7bdbae0baa10");
    boolean b7 = university1.removeCampus("75815751-57df-40f2-ae37-e25f8a94325e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("95c4bab9-4e02-4466-ad95-44e492c4edce");

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("76fe9853-ea57-4556-ac71-95373a19a23f", (float)(short)10, "cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5");
    product3.setDescription("d9200fb5-f81f-4788-8586-336a23f81552");
    product3.setId("com.example.unifood.exceptions.InvalidLastNameException");
    product3.setDescription("c45472c3-5119-4802-883a-fe2edf577f45");

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getId();
    java.lang.String str2 = campus0.getId();
    java.util.List<java.lang.String> list_str3 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0800501f-2d0b-48bb-9730-e682cb4ad4e7"+ "'", str1.equals("0800501f-2d0b-48bb-9730-e682cb4ad4e7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0800501f-2d0b-48bb-9730-e682cb4ad4e7"+ "'", str2.equals("0800501f-2d0b-48bb-9730-e682cb4ad4e7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

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
    com.example.unifood.models.Restaurant restaurant14 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product15 = new com.example.unifood.models.Product();
    boolean b16 = product15.getAvailability();
    restaurant14.addProduct(product15);
    java.lang.String str18 = restaurant14.getId();
    restaurant14.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.update(restaurant14);
    java.lang.Float f22 = restaurant14.getRate();
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "4186fa03-dffa-470d-9d7a-6de64c544dca"+ "'", str18.equals("4186fa03-dffa-470d-9d7a-6de64c544dca"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f22 + "' != '" + 0.0f+ "'", f22.equals(0.0f));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("b9ed878b-faac-4ecd-951a-118f4e46c579", "67992fd9-b6c2-4001-a312-19deacdfe699", (-1.0f), "a3a13e9a-0f78-4d6a-930b-0c1ee87b4393", "cc451e2f-c3d9-4cee-9d1d-d026aead791a");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    java.lang.String str12 = restaurant0.getName();
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant16.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str19 = restaurant16.getShortDescription();
    boolean b21 = restaurant16.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review22 = new com.example.unifood.models.Review();
    review22.setId("");
    java.lang.String str25 = review22.getUserId();
    review22.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f28 = review22.getRate();
    boolean b29 = restaurant16.removeReview(review22);
    review22.setRestaurantId("f4c5b8c3-3c11-4032-a3a2-60f2be579cd0");
    boolean b32 = restaurant0.removeReview(review22);
    java.lang.String str33 = review22.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "7bd3d6e1-0d0b-4fa1-810d-a56167a32b50"+ "'", str4.equals("7bd3d6e1-0d0b-4fa1-810d-a56167a32b50"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f28 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("21a5ae7c-2e2c-4f21-ab45-133899277be9");

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0", (float)'4', "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    product3.setDescription("00a80698-5dcc-4f53-8de2-eaec89537d25");
    product3.setId("a468052e-db90-4779-a9b3-fff5b5d622ba");

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("acfd04e7-5be8-456c-aeb7-9f0741c42afc");

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "544335c6-2fef-496b-a965-9a6f6604b809", "c95b46b8-0cb7-4e6d-a3bc-071651550325");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

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
    java.lang.String str52 = product41.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "09ebdce8-dd6d-495a-87b1-5c181c56cf93"+ "'", str5.equals("09ebdce8-dd6d-495a-87b1-5c181c56cf93"));
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "33c06197-e14c-4640-8cca-2ee7fea0b8f4"+ "'", str38.equals("33c06197-e14c-4640-8cca-2ee7fea0b8f4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("efa3807e-af8d-4f2c-83ce-9465d1d11d0d", "bd4b31bc-9996-4b1c-89df-ec3b299e67b1", (-1.0f), "774bbc3b-8131-4fe6-9b66-5bfd40d76cf8");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo1.setFavRestaurants(list_str7);
    studentInfo1.setCampusId("");
    boolean b12 = studentInfo1.addRestaurantToFavorites("28e5f954-8356-4228-9524-30113024356e");
    java.util.List<java.lang.String> list_str13 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    restaurant3.addProduct(product16);
    restaurant3.setShortDescription("5b2281a2-71ff-46d0-b204-2c60fc6aea17");
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b24 = restaurant23.getApproved();
    restaurant23.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Product> list_product27 = restaurant23.getProductList();
    restaurant23.setShortDescription("d3621539-7d39-481b-9fc2-42fd593a7135");
    java.util.List<com.example.unifood.models.Review> list_review30 = restaurant23.getReviewList();
    restaurant3.setReviewList(list_review30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review30);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

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
    java.util.List<com.example.unifood.models.Product> list_product17 = restaurant3.getProductList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("d2c231e2-7a36-4c3e-85a5-77d4735a3460", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f", "");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "376f29dd-77f2-4b44-8c95-b9ac348c4e6f"+ "'", str5.equals("376f29dd-77f2-4b44-8c95-b9ac348c4e6f"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("f71e4521-c797-403b-bb13-9b84cfa3a1f7");
    boolean b3 = campus1.removeRestaurant("cf499805-54d6-4e7b-bf12-6f077f4d32ed");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str5 = review0.getDate();
    java.lang.String str6 = review0.getUserId();
    float f7 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 10.0f);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("25febfd4-1ff3-4def-b38b-977a76b141bd", "0229ea27-a568-4fbb-b746-44d3922125ef", "9af82747-9c84-450f-ab4f-aec0067c1556");

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

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
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review25.setId("10649ddd-831c-4a5d-b54e-db55a76d1419");
    review25.setRestaurantId("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    review25.setId("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    float f32 = review25.getRate();
    boolean b33 = restaurant0.equals((java.lang.Object)f32);
    
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
    org.junit.Assert.assertTrue(f32 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("1dafae0b-4420-469e-990d-f5f644379466", "b428c35b-75d1-4f5e-9ca0-14efacffcbbe", (float)(byte)100, "ba591579-4913-4212-a159-885fcd72f8f0", "efa3807e-af8d-4f2c-83ce-9465d1d11d0d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("ea666a71-262a-403c-9f06-096df549cfbe", "66662d53-cdfc-4b60-bb1a-d4535919f4f2", (float)(byte)-1, "966eb1c9-3eb2-4ca2-91cb-de5257760e00", "f42b6f81-3e10-41d9-b634-0bd2da5b6245");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("23f3c66c-8c00-4d96-bbed-d2cba049ea2f", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", 0.0f, "1c6da8a9-8b9b-4db7-89db-45956ef9db40");
    review4.setRestaurantId("7e7fdf59-f99e-4219-8e1b-e5c368338b21");
    review4.setRestaurantId("4b8774a9-30e8-4a88-9079-cd9994eaa8ec");

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setType("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b");
    userInfo3.setFirstName("1fcc4f0c-26bc-4946-bf17-5d8a16792f98");
    java.lang.String str8 = userInfo3.getType();
    userInfo3.setFirstName("588c9a8c-f6c8-4053-9db2-c232a7cbfa67");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1f7ccc5e-6a65-4a11-8cfa-5b701aade46b"+ "'", str8.equals("1f7ccc5e-6a65-4a11-8cfa-5b701aade46b"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    java.lang.String str2 = university1.getName();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str6 = studentInfo5.getFavRestaurants();
    university1.setAllCampus(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "12/03/2017"+ "'", str2.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    campus1.setId("0527f842-98d0-4df0-a208-e760461137eb");
    boolean b10 = campus1.removeRestaurant("6eadf2cc-8094-4c03-a424-275c022b9ded");
    campus1.setId("b4a7c4bb-fb01-4b40-b048-22c9ffa9235c");
    com.example.unifood.models.University university14 = new com.example.unifood.models.University("hi!");
    java.lang.String str15 = university14.getId();
    java.lang.String[] str_array44 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<java.lang.String>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str45, str_array44);
    university14.setAllCampus((java.util.List<java.lang.String>)arraylist_str45);
    university14.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    com.example.unifood.models.Campus campus50 = new com.example.unifood.models.Campus();
    boolean b52 = campus50.removeRestaurant("hi!");
    campus50.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str55 = campus50.getRestaurants();
    boolean b57 = campus50.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b59 = campus50.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b61 = campus50.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str62 = campus50.getName();
    boolean b64 = campus50.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.Campus campus65 = new com.example.unifood.models.Campus();
    boolean b67 = campus65.removeRestaurant("hi!");
    campus65.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str70 = campus65.getRestaurants();
    boolean b72 = campus65.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b74 = campus65.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b76 = campus65.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str77 = campus65.getName();
    com.example.unifood.models.StudentInfo studentInfo78 = new com.example.unifood.models.StudentInfo();
    studentInfo78.setCampusId("");
    java.lang.String[] str_array86 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str87 = new java.util.ArrayList<java.lang.String>();
    boolean b88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str87, str_array86);
    studentInfo78.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str87);
    campus65.setRestaurants((java.util.List<java.lang.String>)arraylist_str87);
    campus50.setRestaurants((java.util.List<java.lang.String>)arraylist_str87);
    university14.setAllCampus((java.util.List<java.lang.String>)arraylist_str87);
    campus1.setRestaurants((java.util.List<java.lang.String>)arraylist_str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "c7699494-0fb4-4804-83a2-f2a8a7361ecb"+ "'", str2.equals("c7699494-0fb4-4804-83a2-f2a8a7361ecb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "7fa706a7-c746-465b-9111-8c30b7c3f74c"+ "'", str15.equals("7fa706a7-c746-465b-9111-8c30b7c3f74c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str62.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str77.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("32c3ace9-70ce-4aa6-a292-45f6760c8cdc");
    java.lang.String str2 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32c3ace9-70ce-4aa6-a292-45f6760c8cdc"+ "'", str2.equals("32c3ace9-70ce-4aa6-a292-45f6760c8cdc"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("7abf4d3d-b259-4908-8e6b-f617c87176f2");
    campus1.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    campus1.setId("0020b92d-4ba4-4529-99d7-446927e74864");
    java.lang.String str6 = campus1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0020b92d-4ba4-4529-99d7-446927e74864"+ "'", str6.equals("0020b92d-4ba4-4529-99d7-446927e74864"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getComment();
    review0.setComment("3eb01d1b-8df4-4077-9221-8c1b6b20a4fb");
    java.lang.String str9 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f9d2dc7d-d8b9-4713-9ce8-2905c25009e4"+ "'", str2.equals("f9d2dc7d-d8b9-4713-9ce8-2905c25009e4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "49976e80-f69f-4380-aa76-dc904dcb2eca"+ "'", str9.equals("49976e80-f69f-4380-aa76-dc904dcb2eca"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    boolean b8 = studentInfo0.delProductFromFavorites("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    java.lang.String str9 = studentInfo0.getCampusId();
    com.example.unifood.models.Campus campus10 = new com.example.unifood.models.Campus();
    boolean b12 = campus10.removeRestaurant("hi!");
    campus10.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str15 = campus10.getRestaurants();
    boolean b17 = campus10.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b19 = campus10.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    campus10.setName("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7");
    java.util.List<java.lang.String> list_str22 = campus10.getRestaurants();
    studentInfo0.setFavRestaurants(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str9.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    java.lang.String str9 = campus0.getId();
    campus0.setId("ad9e1a89-ce46-4d03-9bbc-c729c44aba5c");
    java.lang.String str12 = campus0.getName();
    campus0.setId("1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    campus0.setId("5bbf7e02-312c-42d2-949a-a084dfb90c2e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "94cff566-8f46-4475-8c23-466342c42efb"+ "'", str6.equals("94cff566-8f46-4475-8c23-466342c42efb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "94cff566-8f46-4475-8c23-466342c42efb"+ "'", str8.equals("94cff566-8f46-4475-8c23-466342c42efb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "94cff566-8f46-4475-8c23-466342c42efb"+ "'", str9.equals("94cff566-8f46-4475-8c23-466342c42efb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("2b1eef77-3c68-46f5-961a-cdf9144f7a4a", "3d3ec578-45a4-47b2-8334-c039df5a98a8", "ec090dde-3ceb-476b-a011-689921e90eac");
    userInfo3.setType("28e5f954-8356-4228-9524-30113024356e");
    java.lang.String str6 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "28e5f954-8356-4228-9524-30113024356e"+ "'", str6.equals("28e5f954-8356-4228-9524-30113024356e"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

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
    boolean b18 = campus0.removeRestaurant("1e6a2d9d-9f40-49e0-8bc1-b9b85020de59");
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "2787d99f-fe0f-4821-bfc2-6b7c20207568"+ "'", str19.equals("2787d99f-fe0f-4821-bfc2-6b7c20207568"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b3 = studentInfo1.addRestaurantToFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    boolean b5 = studentInfo1.addProductToFavorites("2870cdeb-97e8-403a-8003-505bb6853132");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

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
    university1.setName("747740b2-7173-4be5-aefa-7bdbae0baa10");
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "a9e8fa92-d02d-4cbd-9542-635af80dbb50"+ "'", str27.equals("a9e8fa92-d02d-4cbd-9542-635af80dbb50"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str28.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("", "7e7fdf59-f99e-4219-8e1b-e5c368338b21", 10.0f, "400842b3-2dff-427a-8071-aed5b8bf12d2");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b3 = studentInfo1.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.util.List<java.lang.String> list_str4 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    com.example.unifood.exceptions.UserException userException0 = new com.example.unifood.exceptions.UserException();
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException1 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException2 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException1.addSuppressed((java.lang.Throwable)invalidCampusNameException2);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException4 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException2.addSuppressed((java.lang.Throwable)invalidDescriptionException4);
    com.example.unifood.exceptions.UserException userException6 = new com.example.unifood.exceptions.UserException();
    java.lang.String str7 = userException6.toString();
    invalidDescriptionException4.addSuppressed((java.lang.Throwable)userException6);
    userException0.addSuppressed((java.lang.Throwable)userException6);
    java.lang.String str10 = userException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str7.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str10.equals("com.example.unifood.exceptions.UserException"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    review5.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review5.setUserId("06cccbeb-fd5c-4531-b0fc-216ad9f70ccb");
    float f13 = review5.getRate();
    java.lang.String str14 = review5.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str14.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

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
    com.example.unifood.models.Restaurant restaurant20 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b21 = restaurant20.getApproved();
    java.lang.String str22 = restaurant20.getId();
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review28.setUserId("");
    java.lang.String str31 = review28.getUserId();
    review28.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b34 = restaurant20.removeReview(review28);
    java.lang.String str35 = review28.getUserId();
    boolean b36 = restaurant9.removeReview(review28);
    com.example.unifood.models.Review review42 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review42.setUserId("");
    java.lang.String str45 = review42.getUserId();
    review42.setComment("");
    java.lang.String str48 = review42.getDate();
    java.lang.String str49 = review42.getRestaurantId();
    boolean b50 = restaurant9.removeReview(review42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "e88d13ce-652c-45f2-a1c2-aa7265b64a49"+ "'", str22.equals("e88d13ce-652c-45f2-a1c2-aa7265b64a49"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "c1839dde-2a89-4fce-a06f-c96ccbb3f563"+ "'", str35.equals("c1839dde-2a89-4fce-a06f-c96ccbb3f563"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str48.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str49.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant3.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str6 = restaurant3.getLocalization();
    java.lang.String str7 = restaurant3.getCampusId();
    java.lang.String str8 = restaurant3.getName();
    restaurant3.updateRating();
    java.lang.String str10 = restaurant3.getShortDescription();
    java.lang.String str11 = restaurant3.getUserId();
    restaurant3.setLocalization("f21a5cd9-fa7e-4e41-821f-c32c6188dd21");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4f54b634-288e-42c6-b781-2869535b5bb5"+ "'", str6.equals("4f54b634-288e-42c6-b781-2869535b5bb5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aabd70ed-be9f-4452-9625-3f6b64c27121"+ "'", str7.equals("aabd70ed-be9f-4452-9625-3f6b64c27121"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str8.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "239d950c-a53b-45db-9e8f-483a040e426a"+ "'", str10.equals("239d950c-a53b-45db-9e8f-483a040e426a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("9946470d-d39c-4a9b-a598-9cb41808251a", "e2144475-af4e-4137-826c-e2b1a9f36f62", "f0abce46-2656-46af-99c4-cc4f3ce992d7");
    userInfo3.setFirstName("1d4c33db-a409-4716-bace-aecdf5121e1e");
    userInfo3.setLastName("cbeef4e8-dc5c-4e35-be95-0212ca61484c");

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

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
    review12.setRestaurantId("a119a696-228e-421c-8a30-41c04e6e52ea");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "bb3547fb-e993-411a-852e-65801e3c4e2b"+ "'", str10.equals("bb3547fb-e993-411a-852e-65801e3c4e2b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo0.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    studentInfo7.setCampusId("");
    studentInfo7.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b13 = studentInfo7.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavRestaurants();
    studentInfo7.setFavProducts(list_str15);
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    studentInfo17.setCampusId("");
    studentInfo17.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo17.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b25 = studentInfo17.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.Campus campus26 = new com.example.unifood.models.Campus();
    boolean b28 = campus26.removeRestaurant("hi!");
    java.lang.String[] str_array53 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<java.lang.String>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str54, str_array53);
    campus26.setRestaurants((java.util.List<java.lang.String>)arraylist_str54);
    studentInfo17.setFavProducts((java.util.List<java.lang.String>)arraylist_str54);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str54);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str54);
    com.example.unifood.models.University university61 = new com.example.unifood.models.University("hi!");
    java.lang.String str62 = university61.getId();
    java.util.List<java.lang.String> list_str63 = university61.getAllCampus();
    boolean b65 = university61.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    boolean b67 = university61.addCampus("efbb39b8-b569-44a5-8350-5d34ec9574db");
    com.example.unifood.models.Campus campus68 = new com.example.unifood.models.Campus();
    boolean b70 = campus68.removeRestaurant("hi!");
    campus68.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str73 = campus68.getRestaurants();
    boolean b75 = campus68.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b77 = campus68.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b79 = campus68.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str80 = campus68.getName();
    com.example.unifood.models.StudentInfo studentInfo81 = new com.example.unifood.models.StudentInfo();
    studentInfo81.setCampusId("");
    java.lang.String[] str_array89 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str90 = new java.util.ArrayList<java.lang.String>();
    boolean b91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str90, str_array89);
    studentInfo81.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str90);
    campus68.setRestaurants((java.util.List<java.lang.String>)arraylist_str90);
    university61.setAllCampus((java.util.List<java.lang.String>)arraylist_str90);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "b329741d-a7f1-4f08-aff0-29820bb5759f"+ "'", str62.equals("b329741d-a7f1-4f08-aff0-29820bb5759f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str80.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant0.setApproved(true);
    restaurant0.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review11 = restaurant0.getReviewList();
    java.lang.String str12 = restaurant0.getName();
    restaurant0.setRate((java.lang.Float)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "f8687f79-7e47-411f-9d21-f93d7cac84e6"+ "'", str4.equals("f8687f79-7e47-411f-9d21-f93d7cac84e6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

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
    com.example.unifood.exceptions.CampusException campusException26 = new com.example.unifood.exceptions.CampusException();
    java.lang.Throwable[] throwable_array27 = campusException26.getSuppressed();
    ownerException20.addSuppressed((java.lang.Throwable)campusException26);
    com.example.unifood.exceptions.OwnerException ownerException29 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException30 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException29.addSuppressed((java.lang.Throwable)invalidCampusIdException30);
    java.lang.Throwable[] throwable_array32 = ownerException29.getSuppressed();
    java.lang.String str33 = ownerException29.toString();
    java.lang.String str34 = ownerException29.toString();
    java.lang.String str35 = ownerException29.toString();
    com.example.unifood.exceptions.InvalidLastNameException invalidLastNameException36 = new com.example.unifood.exceptions.InvalidLastNameException();
    java.lang.String str37 = invalidLastNameException36.toString();
    ownerException29.addSuppressed((java.lang.Throwable)invalidLastNameException36);
    campusException26.addSuppressed((java.lang.Throwable)invalidLastNameException36);
    java.lang.String str40 = invalidLastNameException36.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str33.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str34.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str35.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "com.example.unifood.exceptions.InvalidLastNameException"+ "'", str37.equals("com.example.unifood.exceptions.InvalidLastNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "com.example.unifood.exceptions.InvalidLastNameException"+ "'", str40.equals("com.example.unifood.exceptions.InvalidLastNameException"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

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
    restaurant0.setUserId("45d009d6-e408-4af2-be1f-8551106fa615");
    
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

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

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
    java.lang.String str20 = review12.getUserId();
    review12.setId("cf2b85ae-8843-49d3-b89e-661c79410f48");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavProducts(list_str8);
    studentInfo0.setCampusId("81044927-9a8d-4832-b445-01ac529dcb62");
    com.example.unifood.models.University university13 = new com.example.unifood.models.University("hi!");
    boolean b15 = university13.removeCampus("hi!");
    java.util.List<java.lang.String> list_str16 = university13.getAllCampus();
    studentInfo0.setFavProducts(list_str16);
    studentInfo0.setCampusId("66662d53-cdfc-4b60-bb1a-d4535919f4f2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

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
    java.lang.String str24 = review12.getId();
    review12.setRestaurantId("de058033-7bb5-407d-9ad0-164e5bfa7cc7");
    review12.setComment("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0301c89e-b197-4a39-87f4-98b79ff78d62"+ "'", str10.equals("0301c89e-b197-4a39-87f4-98b79ff78d62"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

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
    restaurant3.setShortDescription("69bf96c3-9515-4dee-8245-6e9e2b0b88d2");
    java.lang.Float f40 = restaurant3.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "19fc71bc-c801-4d53-9724-19eb999c6427"+ "'", str10.equals("19fc71bc-c801-4d53-9724-19eb999c6427"));
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "622fdecc-6222-40bf-8c2f-a40e48186095"+ "'", str33.equals("622fdecc-6222-40bf-8c2f-a40e48186095"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f40 + "' != '" + 10.0f+ "'", f40.equals(10.0f));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    java.util.List<com.example.unifood.models.Product> list_product7 = restaurant3.getProductList();
    restaurant3.setLocalization("8c6a248c-b6a6-4203-85bb-f9fcf6c4e147");
    restaurant3.setId("9b94fcda-82aa-4f00-ba68-1539f5477fa0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product7);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

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
    java.lang.String str14 = userException5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str14.equals("com.example.unifood.exceptions.UserException"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

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
    java.lang.String str75 = review64.getDate();
    review64.setUserId("e22eb35b-9e49-4f7d-9534-154369f72e0a");
    review64.setUserId("33c07307-a302-47c9-8892-f61c844db64f");
    review64.setRate((float)1L);
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "dd4c7a96-e0ab-4b51-8529-cc8b5c93f5f5"+ "'", str26.equals("dd4c7a96-e0ab-4b51-8529-cc8b5c93f5f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "8f7cf598-b606-4cde-b0d4-122f89be3ade"+ "'", str35.equals("8f7cf598-b606-4cde-b0d4-122f89be3ade"));
    
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
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str75.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Restaurant restaurant7 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product8 = new com.example.unifood.models.Product();
    boolean b9 = product8.getAvailability();
    restaurant7.addProduct(product8);
    java.util.List<com.example.unifood.models.Product> list_product11 = restaurant7.getProductList();
    restaurant7.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant7.setApproved(false);
    com.example.unifood.models.Restaurant restaurant16 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product17 = new com.example.unifood.models.Product();
    boolean b18 = product17.getAvailability();
    restaurant16.addProduct(product17);
    restaurant16.setCampusId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant7.update(restaurant16);
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant7.getReviewList();
    restaurant0.setReviewList(list_review23);
    com.example.unifood.models.Restaurant restaurant28 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant28.setName("12/03/2017");
    java.lang.String str31 = restaurant28.getUserId();
    boolean b32 = restaurant28.getApproved();
    java.lang.Float f33 = restaurant28.getRate();
    restaurant28.setName("041f0a74-169e-4210-9a45-d7590efa37d2");
    restaurant0.update(restaurant28);
    restaurant0.setId("4e560092-46c0-450d-8583-4087abeb8108");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f33 + "' != '" + 0.0f+ "'", f33.equals(0.0f));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    java.lang.String str2 = restaurant0.getLocalization();
    restaurant0.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    boolean b6 = product5.getAvailability();
    product5.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product5.setAvailability(true);
    product5.setCost((float)(byte)10);
    restaurant0.addProduct(product5);
    java.lang.String str14 = product5.getId();
    boolean b15 = product5.getAvailability();
    boolean b16 = product5.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "91821eb7-e1c5-4a1c-8b1b-1210ff1cf4b6"+ "'", str14.equals("91821eb7-e1c5-4a1c-8b1b-1210ff1cf4b6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("81c77406-02a7-40b2-9136-f952f2242165", "5ef2a8d7-ee9f-4378-ac7b-cb8c4df4ff8e", "8dd5a5b7-e3c1-410e-8e44-760f7a67248a");

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    java.lang.String str9 = university1.getId();
    university1.setId("195fa07f-c70f-4ebf-a58e-fa03f417b14b");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavRestaurants();
    boolean b15 = studentInfo12.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str16 = studentInfo12.getCampusId();
    studentInfo12.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    studentInfo19.setCampusId("");
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    studentInfo19.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo();
    studentInfo31.setCampusId("");
    studentInfo31.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo31.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str38 = studentInfo31.getFavProducts();
    studentInfo19.setFavProducts(list_str38);
    studentInfo12.setFavRestaurants(list_str38);
    boolean b42 = studentInfo12.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo();
    studentInfo43.setCampusId("");
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str52, str_array51);
    studentInfo43.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str52);
    studentInfo43.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b58 = studentInfo43.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b60 = studentInfo43.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus62 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str63 = campus62.getId();
    com.example.unifood.models.StudentInfo studentInfo64 = new com.example.unifood.models.StudentInfo();
    studentInfo64.setCampusId("");
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str73 = new java.util.ArrayList<java.lang.String>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str73, str_array72);
    studentInfo64.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str73);
    campus62.setRestaurants((java.util.List<java.lang.String>)arraylist_str73);
    studentInfo43.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str73);
    studentInfo12.setFavProducts((java.util.List<java.lang.String>)arraylist_str73);
    university1.setAllCampus((java.util.List<java.lang.String>)arraylist_str73);
    boolean b81 = university1.removeCampus("33c07307-a302-47c9-8892-f61c844db64f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31872526-003b-4ed9-8e6d-824a0aa77172"+ "'", str2.equals("31872526-003b-4ed9-8e6d-824a0aa77172"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "31872526-003b-4ed9-8e6d-824a0aa77172"+ "'", str5.equals("31872526-003b-4ed9-8e6d-824a0aa77172"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str9.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "40487edd-b3ff-48f1-a75b-d1eaf0f7f814"+ "'", str63.equals("40487edd-b3ff-48f1-a75b-d1eaf0f7f814"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review("239d950c-a53b-45db-9e8f-483a040e426a", "adb74c6f-c839-47cc-b096-1c12240d6afd", 1.0f, "49976e80-f69f-4380-aa76-dc904dcb2eca", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str14 = review13.getId();
    restaurant3.addReview(review13);
    review13.setUserId("f56bbf3f-962d-4671-b882-309eb275af06");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "658fbfbd-5ce8-48f7-ab81-6e2dd5b2371e"+ "'", str5.equals("658fbfbd-5ce8-48f7-ab81-6e2dd5b2371e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d3296322-a596-4f06-a711-8af664438d24"+ "'", str14.equals("d3296322-a596-4f06-a711-8af664438d24"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.addRestaurantToFavorites("7ef5914d-382e-4d9b-889e-27967c20beaf");
    boolean b10 = studentInfo0.addProductToFavorites("0f5cd045-5aec-4f06-873a-ae9424257334");
    boolean b12 = studentInfo0.addRestaurantToFavorites("5b385af4-7221-4afb-9f0a-e0329108a903");
    java.util.List<java.lang.String> list_str13 = null;
    studentInfo0.setFavProducts(list_str13);
    boolean b16 = studentInfo0.delRestaurantFromFavorites("e7580797-b6dd-4993-bf93-ce15feaacf76");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

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
    restaurant0.setLocalization("e2c7a34a-8060-4430-9d69-dd5848b101c6");
    restaurant0.setId("69b4abe2-84d0-4a81-9486-febafc8b2ff6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getComment();
    review0.setComment("3eb01d1b-8df4-4077-9221-8c1b6b20a4fb");
    java.lang.String str9 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a66153b2-84ac-47d5-9478-b8c9b961f286"+ "'", str2.equals("a66153b2-84ac-47d5-9478-b8c9b961f286"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

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
    boolean b38 = product29.getAvailability();
    product29.setCost((float)(byte)0);
    java.lang.String str41 = product29.getName();
    
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
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    com.example.unifood.exceptions.CampusException campusException0 = new com.example.unifood.exceptions.CampusException();
    java.lang.Throwable[] throwable_array1 = campusException0.getSuppressed();
    java.lang.String str2 = campusException0.toString();
    java.lang.Throwable[] throwable_array3 = campusException0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.CampusException"+ "'", str2.equals("com.example.unifood.exceptions.CampusException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("70ae50b9-4b12-46fb-a47f-f2d811ef8a9f");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "70ae50b9-4b12-46fb-a47f-f2d811ef8a9f"+ "'", str2.equals("70ae50b9-4b12-46fb-a47f-f2d811ef8a9f"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    review0.setComment("edf01dd6-a35a-426f-808e-d6346b5af74f");
    review0.setComment("7adfa593-52c0-4918-9dcf-d96fae8b24a9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("959115ea-d0ba-4dd1-b689-49af96cc1da9");

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

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
    float f18 = product13.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str14.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 100.0f);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("31769c54-249b-4b7e-a756-27ab586c85aa", "", 100.0f, "4ea87418-095b-4020-852c-3320b78183b2", "2b1eef77-3c68-46f5-961a-cdf9144f7a4a");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantId");
    } catch (com.example.unifood.exceptions.InvalidRestaurantId e) {
      // Expected exception.
    }

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("91a043f5-f6c3-499c-abfa-94ed8cbcfada");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.addProductToFavorites("b0b0b700-7ebd-489d-85cc-58091d6c4b3e");
    boolean b6 = studentInfo1.addProductToFavorites("bb6264ea-8d6c-4bf2-bfbe-7a763522f7c7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("0daa91b1-d5d0-4037-891c-58f0636ac1bc");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("a75cdd96-7223-4124-bd88-fb42ddf64233");
    university1.setId("48c25d85-b054-43a6-8e9a-9f2337c85215");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2a4004cb-c037-4812-8ea5-2142ee14286e"+ "'", str2.equals("2a4004cb-c037-4812-8ea5-2142ee14286e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

}
