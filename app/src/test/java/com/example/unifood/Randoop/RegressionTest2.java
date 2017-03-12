package com.example.unifood.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("d742adcd-b8ee-4eef-bdae-73dda46717fe", "55dabc7b-3fe7-4421-a040-d45c92cd70da", 0.0f, "a9a6d832-db46-43f7-8078-9b0af2950add", "3db35cfa-ac0a-4288-9084-8d042e570026");
    review5.setComment("ec1c7744-8529-4314-837e-cb723075bf0b");
    java.lang.String str8 = review5.getComment();
    review5.setId("b0f6fbc2-a700-40b9-8275-01f155e602b1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ec1c7744-8529-4314-837e-cb723075bf0b"+ "'", str8.equals("ec1c7744-8529-4314-837e-cb723075bf0b"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

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
    review21.setId("376f29dd-77f2-4b44-8c95-b9ac348c4e6f");
    java.lang.String str29 = review21.getComment();
    
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
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("75e0de5b-af05-410e-9afa-c211b35b0e94");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("969c7128-9bf6-4bb9-8529-a35ebdfa9500");
    ownerInfo1.setRestaurantId("16c89e8f-dcdc-4632-8a9b-1653843567f5");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "16c89e8f-dcdc-4632-8a9b-1653843567f5"+ "'", str4.equals("16c89e8f-dcdc-4632-8a9b-1653843567f5"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

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
    java.lang.Throwable[] throwable_array29 = ownerException20.getSuppressed();
    
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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setFirstName("b6fd1026-57eb-4577-a667-6dac64083d57");
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    userInfo0.setType("0d694b92-c1be-456e-a996-05046038d3a2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    float f6 = product0.getCost();
    product0.setCost((float)1);
    product0.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("b2d2a2e5-86f2-4b88-9de2-25cffd9ced7a", "9aafa301-aca0-4967-a7cd-3dee3c496935", (float)' ', "e2144475-af4e-4137-826c-e2b1a9f36f62", "28afdeee-0ae9-42a3-af3a-d4963b34322d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getFirstName();
    userInfo3.setType("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str7.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b9a35319-fcc8-40c8-9a6c-cc193698fa7e");
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b5 = studentInfo3.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    java.util.List<java.lang.String> list_str6 = studentInfo3.getFavProducts();
    studentInfo1.setFavRestaurants(list_str6);
    boolean b9 = studentInfo1.addRestaurantToFavorites("53d5e04e-abb5-45a7-a278-d742367421a0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

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
    boolean b19 = studentInfo0.delRestaurantFromFavorites("41ea4db7-ac47-405c-811c-b9fcd44eec4b");
    
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
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

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
    product10.setName("0f8c70c1-6d87-430c-855a-bb8906ff9fbb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "fe20db5c-9087-47a5-ad0f-16571ce73f8d"+ "'", str4.equals("fe20db5c-9087-47a5-ad0f-16571ce73f8d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "b25fa0c3-7a3e-4a58-b968-34cf1ec9e8b9"+ "'", str12.equals("b25fa0c3-7a3e-4a58-b968-34cf1ec9e8b9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "b25fa0c3-7a3e-4a58-b968-34cf1ec9e8b9"+ "'", str14.equals("b25fa0c3-7a3e-4a58-b968-34cf1ec9e8b9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    float f8 = product0.getCost();
    product0.setId("6a77e6c8-7c77-428f-a170-f6a4255c74e1");
    
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
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

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
    boolean b16 = campus0.removeRestaurant("611f2265-72c8-419d-bef6-d3f5796ef2b9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "52c64369-4d84-47fa-96be-f5fffd166c52"+ "'", str6.equals("52c64369-4d84-47fa-96be-f5fffd166c52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("e9235121-99bf-400f-b59d-c6c80d92e3b8", "4e0a495b-2b81-4de4-bf8f-8d54bba5e4e3", 35.0f, "151c0401-428b-48ad-9658-eb971aec0fe6", "91460465-feb4-493d-940f-a9490127c7de");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str4 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.University university8 = new com.example.unifood.models.University("hi!");
    java.lang.String str9 = university8.getId();
    boolean b11 = university8.addCampus("hi!");
    java.lang.String str12 = university8.getId();
    university8.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str15 = university8.getId();
    java.lang.String str16 = university8.getId();
    university8.setId("195fa07f-c70f-4ebf-a58e-fa03f417b14b");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavRestaurants();
    boolean b22 = studentInfo19.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str23 = studentInfo19.getCampusId();
    studentInfo19.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    studentInfo26.setCampusId("");
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    studentInfo26.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str35);
    com.example.unifood.models.StudentInfo studentInfo38 = new com.example.unifood.models.StudentInfo();
    studentInfo38.setCampusId("");
    studentInfo38.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo38.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str45 = studentInfo38.getFavProducts();
    studentInfo26.setFavProducts(list_str45);
    studentInfo19.setFavRestaurants(list_str45);
    boolean b49 = studentInfo19.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    com.example.unifood.models.StudentInfo studentInfo50 = new com.example.unifood.models.StudentInfo();
    studentInfo50.setCampusId("");
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str59 = new java.util.ArrayList<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str59, str_array58);
    studentInfo50.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str59);
    studentInfo50.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b65 = studentInfo50.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b67 = studentInfo50.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus69 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str70 = campus69.getId();
    com.example.unifood.models.StudentInfo studentInfo71 = new com.example.unifood.models.StudentInfo();
    studentInfo71.setCampusId("");
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str80 = new java.util.ArrayList<java.lang.String>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str80, str_array79);
    studentInfo71.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    campus69.setRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    studentInfo50.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    studentInfo19.setFavProducts((java.util.List<java.lang.String>)arraylist_str80);
    university8.setAllCampus((java.util.List<java.lang.String>)arraylist_str80);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "38c87e1d-9993-4fdf-9f29-65c0c1076fc0"+ "'", str9.equals("38c87e1d-9993-4fdf-9f29-65c0c1076fc0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "38c87e1d-9993-4fdf-9f29-65c0c1076fc0"+ "'", str12.equals("38c87e1d-9993-4fdf-9f29-65c0c1076fc0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str15.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str16.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "89fd6991-d00d-43e5-b783-cd8fcaa4a987"+ "'", str70.equals("89fd6991-d00d-43e5-b783-cd8fcaa4a987"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

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
    product5.setId("4f353471-6fbc-492d-bb1b-faa973da93c3");
    java.lang.String str17 = product5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str14.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str17.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    restaurant3.setRate((java.lang.Float)10.0f);
    java.lang.String str14 = restaurant3.getCampusId();
    java.lang.String str15 = restaurant3.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "746197f9-8eb5-4b70-a566-60d414944ebb"+ "'", str10.equals("746197f9-8eb5-4b70-a566-60d414944ebb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str14.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

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
    java.lang.String str16 = review0.getComment();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "a7f88f28-d728-4cc0-82b9-46eaad96df5f"+ "'", str16.equals("a7f88f28-d728-4cc0-82b9-46eaad96df5f"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("5da24ab6-8bfc-4f94-acd4-b942fc8737d3");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

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
    com.example.unifood.models.University university74 = new com.example.unifood.models.University("119f287e-61c5-497a-b55c-17489bcb03e9");
    java.util.List<java.lang.String> list_str75 = university74.getAllCampus();
    studentInfo0.setFavRestaurants(list_str75);
    
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
    org.junit.Assert.assertNotNull(list_str75);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str12 = campus0.getName();
    boolean b14 = campus0.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    campus0.setName("971840e2-7f03-4c42-86c0-e2896f455dc8");
    
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
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("d40e1b03-f6f6-4e93-9b9a-8ed1eaf9f938");
    java.lang.String str2 = campus1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0b75f179-ce4b-4fc0-b77c-127ae67faf37"+ "'", str2.equals("0b75f179-ce4b-4fc0-b77c-127ae67faf37"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product0.setAvailability(true);
    product0.setCost((float)(byte)10);
    java.lang.String str8 = product0.getDescription();
    product0.setDescription("719dd8bf-eadc-4a32-9e5c-744bb8444993");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str8.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    java.lang.String str4 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavRestaurants();
    studentInfo0.setCampusId("396a4937-9452-484e-b1eb-dbb739fc5680");
    boolean b9 = studentInfo0.delProductFromFavorites("f008a827-f469-4b24-8a20-023d30564542");
    boolean b11 = studentInfo0.addProductToFavorites("d6f3b56e-06b1-4ffe-af0b-6861611c3b37");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("edf01dd6-a35a-426f-808e-d6346b5af74f");
    university1.setId("3f1d8f40-44f8-458b-a784-7c1c32ce69d6");
    university1.setId("33dcd725-81a1-42a6-9a52-c2d63e538b90");
    university1.setName("dfe7cecd-40c2-4da4-a592-171cc2a8de9c");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("a1c6cab2-02e3-48dc-8d5c-893212f3e1a9", "6c2f90b1-d9b0-400d-8b43-0893724d6fd6", "19c7d5e9-6bde-438f-aa67-83a5a8eeebdc");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    java.lang.String str6 = university1.getName();
    boolean b8 = university1.addCampus("5aa3e6c8-b159-46f6-b439-3a1dcaed2d47");
    university1.setId("7112ad78-afe2-4681-bb63-66c58d50e07e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "afe6df90-3410-4057-8ebb-ab0cb114fdce"+ "'", str2.equals("afe6df90-3410-4057-8ebb-ab0cb114fdce"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "afe6df90-3410-4057-8ebb-ab0cb114fdce"+ "'", str5.equals("afe6df90-3410-4057-8ebb-ab0cb114fdce"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    university1.setId("0baecc35-df86-4223-8916-df65673623be");
    university1.setId("5c5523ab-f9ed-4910-b20a-4a39b5181dcc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

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
    boolean b50 = campus0.removeRestaurant("56382eec-96a7-4d66-a972-b7b05061231d");
    boolean b52 = campus0.removeRestaurant("5aa3e6c8-b159-46f6-b439-3a1dcaed2d47");
    java.lang.String str53 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2d5bd45f-78a5-41ce-8a06-2058b41535ef"+ "'", str6.equals("2d5bd45f-78a5-41ce-8a06-2058b41535ef"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ba84864f-fc90-4bd9-8113-c2e9a14545bf"+ "'", str12.equals("ba84864f-fc90-4bd9-8113-c2e9a14545bf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str48.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str53.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("d9c718a1-767f-44a8-b38d-da4c38ed7fce", "a636ee8b-7efe-4c5b-bcff-8b9a8d561002", "55f8f50b-07e8-4627-badc-22f6eecd1a18");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

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
    restaurant30.setRate((java.lang.Float)(-1.0f));
    com.example.unifood.models.Restaurant restaurant51 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant51.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    restaurant51.updateRating();
    boolean b55 = restaurant30.equals((java.lang.Object)restaurant51);
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "89dce4df-4897-4a26-b1e4-37cadc19fe5d"+ "'", str21.equals("89dce4df-4897-4a26-b1e4-37cadc19fe5d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "df5273de-bd27-4a50-8918-303ed42b3e94"+ "'", str34.equals("df5273de-bd27-4a50-8918-303ed42b3e94"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("7abf4d3d-b259-4908-8e6b-f617c87176f2");
    boolean b3 = university1.addCampus("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

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
    restaurant3.setUserId("d7ba3886-bee0-4a55-903b-b69a88e66598");
    
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "835e40e1-8950-4912-8afd-a5fe40d76b79"+ "'", str46.equals("835e40e1-8950-4912-8afd-a5fe40d76b79"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    com.example.unifood.models.University university8 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str9 = university8.getName();
    boolean b10 = restaurant3.equals((java.lang.Object)str9);
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product("e38e11da-1219-443d-93b7-8c6ea82bea05", (float)(short)10, "63d9aec0-76a5-435f-9c93-e0aac2c8b34e");
    restaurant3.addProduct(product14);
    restaurant3.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

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
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant();
    java.lang.String str24 = restaurant23.getUserId();
    java.lang.String str25 = restaurant23.getLocalization();
    restaurant23.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    product28.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product28.setAvailability(true);
    product28.setCost((float)(byte)10);
    restaurant23.addProduct(product28);
    java.lang.String str37 = product28.getDescription();
    product28.setDescription("");
    boolean b40 = restaurant12.removeProduct(product28);
    float f41 = product28.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "b2683e82-f0d4-4578-a679-90f934eb23b6"+ "'", str19.equals("b2683e82-f0d4-4578-a679-90f934eb23b6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str22.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str37.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f41 == 10.0f);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.addProductToFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review0.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str13 = review0.getDate();
    review0.setDate("3f10b08a-3442-4a59-ba22-42b65923bace");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str13.equals("2016930c-728d-45c5-a236-9c4833a30246"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant3.getUserId();
    java.lang.Float f8 = restaurant3.getRate();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    product14.setDescription("hi!");
    boolean b17 = restaurant9.removeProduct(product14);
    restaurant9.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str20 = restaurant9.getUserId();
    restaurant9.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant9.getReviewList();
    restaurant3.setReviewList(list_review23);
    boolean b25 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

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
    restaurant0.setId("54953943-7fd3-44f0-927c-a4d494402514");
    restaurant0.setUserId("3b086d4f-8bdf-4b78-9c8d-29e7f4e3821b");
    
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

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

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
    boolean b18 = studentInfo0.delProductFromFavorites("f4980b3d-2cea-4904-a0d3-8acb9add6246");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

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
    boolean b17 = campus0.addRestaurant("b7f3f51e-9bc9-4d46-b195-ea14c7c131bc");
    boolean b19 = campus0.removeRestaurant("32bef74e-15d2-4f2b-849c-199055557d88");
    boolean b21 = campus0.addRestaurant("83f77d8b-83f9-4ae9-b04a-013bab7aff32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "f0b49d1a-9dbd-4de8-9a09-40f559f19b5d"+ "'", str6.equals("f0b49d1a-9dbd-4de8-9a09-40f559f19b5d"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str9 = review0.getUserId();
    java.lang.String str10 = review0.getUserId();
    
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("be1e9425-c054-454e-82a2-1bac873f736d", "ca4a646d-3cc8-4cc0-9b41-40eb17520a41", (float)0, "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidDateException");
    } catch (com.example.unifood.exceptions.InvalidDateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("15149c67-efc5-4744-85b0-8dc2ac121df7");
    ownerInfo1.setRestaurantId("82f43158-8ddb-481e-bbfb-9a0fa3789735");
    ownerInfo1.setRestaurantId("7116edc4-a219-4890-8bab-c81e493912e6");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

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
    java.lang.String str37 = review29.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ccb7eb90-739c-4a21-b45f-fefa258ab9ae"+ "'", str11.equals("ccb7eb90-739c-4a21-b45f-fefa258ab9ae"));
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str37.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f9918df4-0669-412b-a8fd-a60a0023c498"+ "'", str2.equals("f9918df4-0669-412b-a8fd-a60a0023c498"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.String str8 = restaurant3.getUserId();
    restaurant3.setLocalization("08ef2ed8-271a-4aad-9415-47b0dba1b9a7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "5f549e06-72c7-4c21-9698-5857aa4f3922"+ "'", str8.equals("5f549e06-72c7-4c21-9698-5857aa4f3922"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

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
    java.lang.String str31 = restaurant3.getShortDescription();
    java.lang.String str32 = restaurant3.getName();
    restaurant3.setCampusId("33801220-dd7f-4fbe-812d-93e98eacb02a");
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str32.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("01364079-9ffa-4e47-a759-693424995a83");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

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
    com.example.unifood.models.Restaurant restaurant29 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    restaurant29.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    java.util.List<com.example.unifood.models.Review> list_review32 = restaurant29.getReviewList();
    restaurant0.setReviewList(list_review32);
    java.lang.String str34 = restaurant0.getCampusId();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "154fffbb-c920-465f-ab05-2f25ee336187"+ "'", str22.equals("154fffbb-c920-465f-ab05-2f25ee336187"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

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
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    boolean b19 = studentInfo17.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b21 = studentInfo17.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b23 = studentInfo17.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b25 = studentInfo17.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    studentInfo17.setCampusId("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    boolean b29 = studentInfo17.delProductFromFavorites("e8e3014e-33aa-43e7-bb64-b61e035fc513");
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    boolean b32 = studentInfo30.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b34 = studentInfo30.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo30.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    java.util.List<java.lang.String> list_str37 = studentInfo30.getFavProducts();
    studentInfo17.setFavProducts(list_str37);
    campus0.setRestaurants(list_str37);
    campus0.setId("2db8940e-5623-4aaa-a1c0-b3fc73af20d6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5aa3dec9-6bc3-4502-b450-ec6d27c78db6"+ "'", str6.equals("5aa3dec9-6bc3-4502-b450-ec6d27c78db6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo0.setType("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setFirstName("67f43e77-131c-48f4-9bf7-76320844084d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str6.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("25febfd4-1ff3-4def-b38b-977a76b141bd");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("43590002-ff0f-4cc9-8729-316ebc4fb5e8");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setCost((float)'#');
    product3.setId("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    product3.setAvailability(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str2.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str3.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    campus1.setId("0527f842-98d0-4df0-a208-e760461137eb");
    boolean b10 = campus1.removeRestaurant("6eadf2cc-8094-4c03-a424-275c022b9ded");
    java.lang.String str11 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e1c93cd9-8008-4566-b4ae-73113896d6e0"+ "'", str2.equals("e1c93cd9-8008-4566-b4ae-73113896d6e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a04223f0-b1c0-449c-afab-59a81cef4343"+ "'", str11.equals("a04223f0-b1c0-449c-afab-59a81cef4343"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setLastName("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    userInfo0.setType("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    userInfo0.setFirstName("5905c9ec-8594-480a-98d9-f263a8aa7afa");
    java.lang.String str10 = userInfo0.getLastName();
    java.lang.String str11 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "9d54bba1-c011-40fe-a86a-2b02e99ae523"+ "'", str10.equals("9d54bba1-c011-40fe-a86a-2b02e99ae523"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str11.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

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
    java.lang.String str21 = product16.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str21.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    float f6 = product3.getCost();
    product3.setId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    java.util.List<java.lang.String> list_str12 = null;
    studentInfo0.setFavRestaurants(list_str12);
    boolean b15 = studentInfo0.delProductFromFavorites("7fa706a7-c746-465b-9111-8c30b7c3f74c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product0.setAvailability(false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a636ee8b-7efe-4c5b-bcff-8b9a8d561002");
    campus1.setName("5ded886a-3fa7-4a68-be6f-6c24c22c35f3");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    com.example.unifood.models.Product product2 = new com.example.unifood.models.Product();
    boolean b3 = product2.getAvailability();
    product2.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b6 = product2.getAvailability();
    product2.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.addProduct(product2);
    java.lang.String str10 = restaurant0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "9595176f-d582-4354-bfd7-fa0565e2e372"+ "'", str10.equals("9595176f-d582-4354-bfd7-fa0565e2e372"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("fa1f0814-a024-44a2-8808-25533b1ac0a6", "5b2a313f-7eb9-45b7-b106-2c0b47a26d47", 10.0f, "4be77dc5-e135-453c-ac2c-a81651a55188", "fc4d85dd-ddbd-46a0-a2eb-4260e0806179");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant0.setProductList(list_product14);
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant0.getReviewList();
    restaurant0.setId("45ff5ab3-6561-44f6-9c93-3f3be9ded172");
    java.lang.Float f19 = restaurant0.getRate();
    java.lang.String str20 = restaurant0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f19 + "' != '" + 0.0f+ "'", f19.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    university1.setName("983a5c4e-aa49-46e5-83ef-45159624651e");
    java.lang.String str7 = university1.getId();
    university1.setName("75815751-57df-40f2-ae37-e25f8a94325e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "abde0585-3de8-4475-9b02-2ee82e3748fc"+ "'", str2.equals("abde0585-3de8-4475-9b02-2ee82e3748fc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "abde0585-3de8-4475-9b02-2ee82e3748fc"+ "'", str7.equals("abde0585-3de8-4475-9b02-2ee82e3748fc"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("6c131d36-5c7b-4dd7-8d26-6356ffc532b8", "5ff1636c-4f0a-4681-99dc-971dedd0060d", (float)(byte)-1, "51998cce-1219-4bac-b3bf-a4db195dc527", "119f287e-61c5-497a-b55c-17489bcb03e9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5f50618a-2579-44d1-b865-1d73003607d1", "16407705-dcde-470b-bc94-7740c47edfdf", "c33c0f92-49b7-445b-8855-7b2be7ea60bf");
    restaurant3.setRate((java.lang.Float)0.0f);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

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
    java.util.List<java.lang.String> list_str20 = studentInfo0.getFavProducts();
    
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
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

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
    review21.setUserId("3c180ad7-267c-47e3-bdaa-08230d053f5a");
    
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

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

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
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    restaurant9.setUserId("hi!");
    restaurant9.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review18 = restaurant9.getReviewList();
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.util.List<com.example.unifood.models.Product> list_product23 = restaurant19.getProductList();
    restaurant19.setUserId("hi!");
    restaurant19.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review28 = restaurant19.getReviewList();
    restaurant9.setReviewList(list_review28);
    restaurant0.setReviewList(list_review28);
    java.lang.Float f31 = restaurant0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f31 + "' != '" + 0.0f+ "'", f31.equals(0.0f));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("d255af9a-b76d-43de-9ac7-c782a9a20824", 32.0f, "22739d71-d067-4543-8594-4b1f473fe3b0");
    product3.setId("dd36ca84-dc45-4440-afc5-16bf9a419da7");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus10 = new com.example.unifood.models.Campus();
    boolean b12 = campus10.removeRestaurant("hi!");
    campus10.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str15 = campus10.getRestaurants();
    studentInfo9.setFavRestaurants(list_str15);
    studentInfo0.setFavProducts(list_str15);
    java.util.List<java.lang.String> list_str18 = studentInfo0.getFavRestaurants();
    java.lang.String str19 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str19.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product9 = new com.example.unifood.models.Product();
    boolean b10 = product9.getAvailability();
    restaurant8.addProduct(product9);
    java.util.List<com.example.unifood.models.Product> list_product12 = restaurant8.getProductList();
    restaurant8.setUserId("hi!");
    restaurant8.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str17 = restaurant8.getCampusId();
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant21.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str24 = restaurant21.getShortDescription();
    boolean b26 = restaurant21.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review27 = new com.example.unifood.models.Review();
    review27.setId("");
    java.lang.String str30 = review27.getUserId();
    review27.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f33 = review27.getRate();
    boolean b34 = restaurant21.removeReview(review27);
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product36 = new com.example.unifood.models.Product();
    boolean b37 = product36.getAvailability();
    restaurant35.addProduct(product36);
    java.util.List<com.example.unifood.models.Product> list_product39 = restaurant35.getProductList();
    restaurant35.setUserId("hi!");
    restaurant35.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product44 = restaurant35.getProductList();
    restaurant21.setProductList(list_product44);
    restaurant8.setProductList(list_product44);
    restaurant3.setProductList(list_product44);
    com.example.unifood.models.Product product48 = new com.example.unifood.models.Product();
    product48.setDescription("hi!");
    java.lang.String str51 = product48.getDescription();
    product48.setCost((float)(byte)0);
    boolean b54 = restaurant3.equals((java.lang.Object)(byte)0);
    java.lang.String str55 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f33 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "70e8979e-039c-4fa9-93e1-990ad81b4214"+ "'", str55.equals("70e8979e-039c-4fa9-93e1-990ad81b4214"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("ab79e951-8fc0-4083-9c98-e2c24bf95840", "7f7ffca0-512d-4b10-b7ec-7a3b14a9fd09", (float)(byte)0, "7fb29310-ac88-4372-a1c5-0ecca40390e7");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b5 = university1.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    java.lang.String str7 = university1.getId();
    boolean b9 = university1.addCampus("6aa125f5-6e7b-470c-a975-ec804170b5da");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "6d3048fd-be9f-46dc-8d3b-af0f3e74336b"+ "'", str7.equals("6d3048fd-be9f-46dc-8d3b-af0f3e74336b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("6def54f2-7835-4f8e-8a12-544711769448", (float)1L, "2870cdeb-97e8-403a-8003-505bb6853132");
    product3.setName("add0628d-25ba-4258-9e48-ec828b994e95");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setId("27e81862-1940-4e19-a518-e7bda686ecaa");
    boolean b14 = university1.addCampus("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b16 = university1.addCampus("6c7bf211-c6d2-4f9e-9c67-3d386ead4562");
    university1.setName("5b385af4-7221-4afb-9f0a-e0329108a903");
    university1.setId("d2c04c57-dc37-400b-8ed6-9a9093b15b9f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3fe4283a-c84f-45d2-921f-c9ef78d55909");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

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
    com.example.unifood.models.University university19 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus20 = new com.example.unifood.models.Campus();
    boolean b22 = campus20.removeRestaurant("hi!");
    campus20.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str25 = campus20.getRestaurants();
    university19.setAllCampus(list_str25);
    campus0.setRestaurants(list_str25);
    java.lang.String str28 = campus0.getId();
    
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
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "53d5e04e-abb5-45a7-a278-d742367421a0"+ "'", str28.equals("53d5e04e-abb5-45a7-a278-d742367421a0"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    java.lang.String str1 = campus0.getId();
    campus0.setId("com.example.unifood.exceptions.InvalidProductNameException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6a687ec0-a1b0-4a64-b4ef-996a146342b0"+ "'", str1.equals("6a687ec0-a1b0-4a64-b4ef-996a146342b0"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    com.example.unifood.exceptions.ProductException productException0 = new com.example.unifood.exceptions.ProductException();
    java.lang.Throwable[] throwable_array1 = productException0.getSuppressed();
    java.lang.String str2 = productException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.ProductException"+ "'", str2.equals("com.example.unifood.exceptions.ProductException"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getLastName();
    userInfo0.setFirstName("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str4 = userInfo0.getFirstName();
    java.lang.String str5 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str4.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str5.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("hi!", (float)(byte)0, "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    java.lang.String str4 = product3.getName();
    product3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    float f2 = review0.getRate();
    float f3 = review0.getRate();
    java.lang.String str4 = review0.getId();
    java.lang.String str5 = review0.getUserId();
    review0.setId("ee556ec3-97c4-48a0-af28-fe599538871a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5e81d645-5c62-4a3b-8ef3-cb00d755954d"+ "'", str4.equals("5e81d645-5c62-4a3b-8ef3-cb00d755954d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getDescription();
    product3.setName("c0679c38-8adf-4203-85c8-515aaf773e20");
    product3.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/03/2017"+ "'", str5.equals("12/03/2017"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

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
    product7.setCost((float)1L);
    
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

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("", "603fd35b-ea62-491b-8376-4e5ebb75b266", (float)' ', "4bccc731-d990-49ff-a4db-d204d91edd1a", "a2da3977-173b-4cfe-ad89-c8189cd31a1a");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    review5.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    review5.setRestaurantId("7c70ae26-387a-4111-9abd-ecf97bbc6324");
    java.lang.String str13 = review5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str13.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setLastName("2af0b02e-4c9a-4970-a399-ff63e0300464");
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setFirstName("0229ea27-a568-4fbb-b746-44d3922125ef");
    userInfo0.setFirstName("12/03/2017");
    userInfo0.setType("89737ece-a611-458a-a9a7-25e6f3ceca08");
    
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.lang.String str6 = restaurant3.getUserId();
    restaurant3.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review9 = new com.example.unifood.models.Review();
    java.lang.String str10 = review9.getId();
    boolean b11 = restaurant3.equals((java.lang.Object)review9);
    boolean b13 = restaurant3.equals((java.lang.Object)(byte)-1);
    java.util.List<com.example.unifood.models.Review> list_review14 = restaurant3.getReviewList();
    restaurant3.setUserId("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4f32dca1-1481-4055-93a1-89976e03c58a"+ "'", str10.equals("4f32dca1-1481-4055-93a1-89976e03c58a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review14);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("a9752be3-f00e-485e-ba2f-6e7d226fd1e4");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a9752be3-f00e-485e-ba2f-6e7d226fd1e4"+ "'", str2.equals("a9752be3-f00e-485e-ba2f-6e7d226fd1e4"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university1.setName("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    boolean b14 = university1.removeCampus("33dcd725-81a1-42a6-9a52-c2d63e538b90");
    java.lang.String str15 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str15.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3c180ad7-267c-47e3-bdaa-08230d053f5a");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.addRestaurant("909998ce-8d41-44b5-b1e3-cba08439db3b");
    boolean b6 = campus1.addRestaurant("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2c5a0076-5315-49cf-a177-b21969519cfb"+ "'", str2.equals("2c5a0076-5315-49cf-a177-b21969519cfb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    java.lang.String str4 = university1.getId();
    java.lang.String str5 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "c6b1ae16-9afa-44e0-9d1a-27a33fdd15c8"+ "'", str4.equals("c6b1ae16-9afa-44e0-9d1a-27a33fdd15c8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c6b1ae16-9afa-44e0-9d1a-27a33fdd15c8"+ "'", str5.equals("c6b1ae16-9afa-44e0-9d1a-27a33fdd15c8"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("592c3290-31e3-44ab-910a-c469b99e1a19");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str2.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

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
    product21.setName("4ea87418-095b-4020-852c-3320b78183b2");
    product21.setName("4dfddf67-9043-41c8-b2de-485dcab25961");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    restaurant3.updateRating();
    com.example.unifood.models.Review review8 = null;
    boolean b9 = restaurant3.removeReview(review8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("7f818b3b-685e-4e69-b63b-ce4aa57b16f0", 0.0f, "fe3d6940-3d53-4045-ba18-577d39f15953");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

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
    java.util.List<com.example.unifood.models.Review> list_review35 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "bd521bec-1bf7-4666-b8e3-1eff23b56d54"+ "'", str11.equals("bd521bec-1bf7-4666-b8e3-1eff23b56d54"));
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "59239ec8-4bad-432d-a127-577bb3b52c17"+ "'", str33.equals("59239ec8-4bad-432d-a127-577bb3b52c17"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review35);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("ca4a646d-3cc8-4cc0-9b41-40eb17520a41");
    java.util.List<java.lang.String> list_str2 = campus1.getRestaurants();
    java.util.List<java.lang.String> list_str3 = campus1.getRestaurants();
    boolean b5 = campus1.addRestaurant("5f5c4b81-254c-4177-bece-07521f3cb9d5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    java.lang.String str14 = restaurant3.getId();
    boolean b15 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"+ "'", str14.equals("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("4a6765dc-3fa3-4cc6-951b-6da12f6d451f", "bc082aef-750b-47ce-89c9-d3693f8875e6", 1.0f, "07c397d1-b73c-4a2d-b4a8-61eb47814971", "0b75f179-ce4b-4fc0-b77c-127ae67faf37");

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

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
    studentInfo0.setCampusId("56a1e8aa-3e9e-4dd9-bb2d-380efc35a0fd");
    
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

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("f8155a8d-c6d9-44b4-9787-22acbb6a4495", (float)(byte)-1, "67ebbc86-a52d-41e4-bc99-4fb67ae7aa2d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductCostException");
    } catch (com.example.unifood.exceptions.InvalidProductCostException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    boolean b5 = studentInfo1.delProductFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    boolean b7 = studentInfo1.delProductFromFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    boolean b9 = studentInfo1.addRestaurantToFavorites("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6");
    studentInfo1.setCampusId("2d88e3e8-25d3-48e6-8156-fc7a40cbf371");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

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
    java.lang.String str26 = restaurant0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2629ba4e-f159-4d9f-9585-e7ce35d0a6cf"+ "'", str8.equals("2629ba4e-f159-4d9f-9585-e7ce35d0a6cf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "2ed95a2c-e730-4639-af52-19553dde141a"+ "'", str16.equals("2ed95a2c-e730-4639-af52-19553dde141a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f25 + "' != '" + 0.0f+ "'", f25.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "84c380a1-fee2-4bfe-82b9-7668a6f07e00"+ "'", str26.equals("84c380a1-fee2-4bfe-82b9-7668a6f07e00"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

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
    java.lang.String str19 = review8.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "d21234fc-bc8a-44a6-b1e1-6a1ae6666386"+ "'", str10.equals("d21234fc-bc8a-44a6-b1e1-6a1ae6666386"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "cd560d8f-28e7-4b43-b906-20258edc001d"+ "'", str19.equals("cd560d8f-28e7-4b43-b906-20258edc001d"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("6570c66e-106a-45b5-b21b-6957af6be4db");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    studentInfo2.setCampusId("");
    studentInfo2.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo2.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b10 = studentInfo2.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    boolean b12 = studentInfo2.addProductToFavorites("e8e3014e-33aa-43e7-bb64-b61e035fc513");
    com.example.unifood.models.University university14 = new com.example.unifood.models.University("hi!");
    boolean b16 = university14.removeCampus("hi!");
    university14.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str19 = university14.getName();
    boolean b21 = university14.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university23 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus24 = new com.example.unifood.models.Campus();
    boolean b26 = campus24.removeRestaurant("hi!");
    campus24.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str29 = campus24.getRestaurants();
    university23.setAllCampus(list_str29);
    java.util.List<java.lang.String> list_str31 = university23.getAllCampus();
    university14.setAllCampus(list_str31);
    java.util.List<java.lang.String> list_str33 = university14.getAllCampus();
    studentInfo2.setFavProducts(list_str33);
    university1.setAllCampus(list_str33);
    java.lang.String str36 = university1.getId();
    boolean b38 = university1.addCampus("7543f80f-98d6-4f4a-87b2-6948c124f6e1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "cf53a282-9287-48a0-abfb-9d7fb0cb6f87"+ "'", str36.equals("cf53a282-9287-48a0-abfb-9d7fb0cb6f87"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setRestaurantId("ec1c7744-8529-4314-837e-cb723075bf0b");
    java.lang.String str8 = review0.getRestaurantId();
    review0.setComment("");
    java.lang.String str11 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ec1c7744-8529-4314-837e-cb723075bf0b"+ "'", str8.equals("ec1c7744-8529-4314-837e-cb723075bf0b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("b3660a10-0a45-4a63-a48b-cafcf60da884");
    boolean b3 = studentInfo1.delProductFromFavorites("");
    boolean b5 = studentInfo1.delProductFromFavorites("39fc5d27-25f5-40c5-bc25-5abf21e05070");
    studentInfo1.setCampusId("7672e12e-d876-4ebb-acb5-ae587ee60ebd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("", 1.0f, "2af0b02e-4c9a-4970-a399-ff63e0300464");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidProductNameException");
    } catch (com.example.unifood.exceptions.InvalidProductNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }

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
    product13.setId("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7");
    java.lang.String str27 = product13.getId();
    product13.setId("e5f6e62f-dc9b-4c80-b492-014f3ac9eb44");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "632ff5eb-8620-437c-a9fb-33d6a7c9439f"+ "'", str10.equals("632ff5eb-8620-437c-a9fb-33d6a7c9439f"));
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7"+ "'", str27.equals("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    float f5 = product3.getCost();
    java.lang.String str6 = product3.getName();
    java.lang.String str7 = product3.getDescription();
    product3.setName("7e0a3d2e-8ef5-435b-90cc-cc37c7e26fd2");
    
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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

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
    restaurant7.setCampusId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    
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

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("f65fd1ab-e41f-47d2-a90c-f40397952597", "6a3aa572-d341-43d8-b640-dc5a7a6df4d1", 35.0f, "179c6055-8216-414f-903a-deae164fe3ab", "0bd81591-b267-4768-a522-a230bd539804");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

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
    java.lang.String str22 = review12.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ee09e987-1d8b-4896-9609-1ce250a959d3"+ "'", str10.equals("ee09e987-1d8b-4896-9609-1ce250a959d3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

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
    boolean b29 = restaurant3.equals((java.lang.Object)' ');
    java.util.List<com.example.unifood.models.Review> list_review30 = restaurant3.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"+ "'", str15.equals("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review30);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }

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
    java.util.List<com.example.unifood.models.Product> list_product97 = null;
    restaurant3.setProductList(list_product97);
    java.lang.String str99 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "f5ac1eb1-e3fe-476a-b567-57059e8e233f"+ "'", str14.equals("f5ac1eb1-e3fe-476a-b567-57059e8e233f"));
    
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
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "a2a04320-cdd6-46df-885c-18fb5d1816b0"+ "'", str76.equals("a2a04320-cdd6-46df-885c-18fb5d1816b0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str99 + "' != '" + "cfc9f04b-9220-4db1-937a-a5d2e3e0967d"+ "'", str99.equals("cfc9f04b-9220-4db1-937a-a5d2e3e0967d"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("6d8d2a3d-73a5-473d-bfd5-6b0a3f863ee2", "5068850f-e463-4916-8e77-7031698bb32f", (float)'4', "com.example.unifood.exceptions.InvalidLastNameException", "67f72f5f-2a8d-4b37-a944-5d9a18018c8d");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    java.lang.String str2 = review0.getId();
    java.lang.String str3 = review0.getComment();
    review0.setId("49976e80-f69f-4380-aa76-dc904dcb2eca");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setId("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    java.lang.String str9 = review0.getComment();
    java.lang.String str10 = review0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a092d63-9a00-4ab9-a744-0c378b3c464f"+ "'", str2.equals("1a092d63-9a00-4ab9-a744-0c378b3c464f"));
    
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    java.util.List<com.example.unifood.models.Review> list_review7 = null;
    restaurant0.setReviewList(list_review7);
    restaurant0.setRate((java.lang.Float)(-1.0f));
    java.lang.String str11 = restaurant0.getUserId();
    restaurant0.setName("49f86ca5-9a90-47a6-9268-c72162277e22");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("791f8349-92dc-4d5c-9e5b-4f0889f1e9b0", "6db24d8b-795e-4f18-90c1-0829082a61ed", "165a27ec-ff2d-40f6-a903-6eb54fd9241d");

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b5 = university1.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    java.lang.String str7 = university1.getId();
    boolean b9 = university1.addCampus("9cdd2e52-afda-4b95-b234-1826e5ddfbbf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "6d3048fd-be9f-46dc-8d3b-af0f3e74336b"+ "'", str7.equals("6d3048fd-be9f-46dc-8d3b-af0f3e74336b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    com.example.unifood.exceptions.UserException userException0 = new com.example.unifood.exceptions.UserException();
    java.lang.String str1 = userException0.toString();
    java.lang.String str2 = userException0.toString();
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException3 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException4 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException3.addSuppressed((java.lang.Throwable)invalidCampusNameException4);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException6 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException4.addSuppressed((java.lang.Throwable)invalidDescriptionException6);
    com.example.unifood.exceptions.UserException userException8 = new com.example.unifood.exceptions.UserException();
    java.lang.String str9 = userException8.toString();
    invalidDescriptionException6.addSuppressed((java.lang.Throwable)userException8);
    com.example.unifood.exceptions.OwnerException ownerException11 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException12 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException11.addSuppressed((java.lang.Throwable)invalidCampusIdException12);
    java.lang.String str14 = ownerException11.toString();
    java.lang.String str15 = ownerException11.toString();
    userException8.addSuppressed((java.lang.Throwable)ownerException11);
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException17 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str18 = invalidRestaurantNameException17.toString();
    userException8.addSuppressed((java.lang.Throwable)invalidRestaurantNameException17);
    com.example.unifood.exceptions.OwnerException ownerException20 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException21 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException20.addSuppressed((java.lang.Throwable)invalidCampusIdException21);
    com.example.unifood.exceptions.OwnerException ownerException23 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException24 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException23.addSuppressed((java.lang.Throwable)invalidCampusIdException24);
    java.lang.String str26 = ownerException23.toString();
    invalidCampusIdException21.addSuppressed((java.lang.Throwable)ownerException23);
    invalidRestaurantNameException17.addSuppressed((java.lang.Throwable)ownerException23);
    com.example.unifood.exceptions.OwnerException ownerException29 = new com.example.unifood.exceptions.OwnerException();
    java.lang.Throwable[] throwable_array30 = ownerException29.getSuppressed();
    java.lang.Throwable[] throwable_array31 = ownerException29.getSuppressed();
    ownerException23.addSuppressed((java.lang.Throwable)ownerException29);
    userException0.addSuppressed((java.lang.Throwable)ownerException23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str1.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str2.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str9.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str14.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str15.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str18.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str26.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array31);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.setUserId("cdbb11ff-0ded-41d4-9a99-4197a5c14e79");
    java.lang.String str6 = restaurant0.getName();
    restaurant0.setRate((java.lang.Float)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

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
    java.lang.String str13 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }

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
    product57.setCost(0.0f);
    product57.setCost(0.0f);
    
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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b5 = university1.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    java.lang.String str7 = university1.getId();
    java.lang.String str8 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "6d3048fd-be9f-46dc-8d3b-af0f3e74336b"+ "'", str7.equals("6d3048fd-be9f-46dc-8d3b-af0f3e74336b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str8.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b3 = campus1.removeRestaurant("542190ad-4ed0-4058-a65b-44f5596ff8ba");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

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
    campus0.setName("016f7a51-1523-4248-8cce-d7af4447fbc2");
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo();
    boolean b50 = studentInfo48.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str51 = studentInfo48.getFavRestaurants();
    java.lang.String str52 = studentInfo48.getCampusId();
    java.util.List<java.lang.String> list_str53 = studentInfo48.getFavRestaurants();
    campus0.setRestaurants(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c2de9d2a-a172-48fb-8118-02d199633843"+ "'", str6.equals("c2de9d2a-a172-48fb-8118-02d199633843"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "749e9239-9124-4d50-863e-55020d54dd8e"+ "'", str12.equals("749e9239-9124-4d50-863e-55020d54dd8e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("cee8ca5c-7aba-430f-8c09-de542ba28019", "7422fa33-a454-4f90-a539-efbcea305eeb", "f4d0068a-694a-4e45-8639-6874fcceda97");

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant3.getReviewList();
    java.lang.String str13 = restaurant3.getId();
    java.lang.String str14 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"+ "'", str13.equals("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"+ "'", str14.equals("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0", (float)'4', "1d94a4ce-cef9-49e0-802d-05ee4d25de76");
    product3.setName("cfc9f04b-9220-4db1-937a-a5d2e3e0967d");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("6c7bf211-c6d2-4f9e-9c67-3d386ead4562");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("134505a3-cb47-4072-8eb3-2b598da20b15");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("b2a1c763-333a-4b58-b38b-ff37f8c40e9f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    java.lang.String str9 = review0.getComment();
    review0.setUserId("2ca23794-72a3-4cca-8687-a1b0e6c8a5c2");
    review0.setId("6af9cce1-e394-4f10-9510-635f008d9600");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

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
    campus0.setName("588c9a8c-f6c8-4053-9db2-c232a7cbfa67");
    boolean b17 = campus0.removeRestaurant("a2a04320-cdd6-46df-885c-18fb5d1816b0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "b9208b4a-69f3-47a2-b751-b1d28eeaef6c"+ "'", str6.equals("b9208b4a-69f3-47a2-b751-b1d28eeaef6c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "b9208b4a-69f3-47a2-b751-b1d28eeaef6c"+ "'", str8.equals("b9208b4a-69f3-47a2-b751-b1d28eeaef6c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "b9208b4a-69f3-47a2-b751-b1d28eeaef6c"+ "'", str9.equals("b9208b4a-69f3-47a2-b751-b1d28eeaef6c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("efbb39b8-b569-44a5-8350-5d34ec9574db", "edf01dd6-a35a-426f-808e-d6346b5af74f", "f695ed82-229b-4109-958e-25c92fc7e7c5");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setType("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    userInfo3.setLastName("eb9e38d5-22ef-44e6-b2fb-9219ef897212");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "edf01dd6-a35a-426f-808e-d6346b5af74f"+ "'", str4.equals("edf01dd6-a35a-426f-808e-d6346b5af74f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "efbb39b8-b569-44a5-8350-5d34ec9574db"+ "'", str5.equals("efbb39b8-b569-44a5-8350-5d34ec9574db"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant0.setId("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    restaurant9.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str16 = restaurant9.getName();
    restaurant9.setId("3db35cfa-ac0a-4288-9084-8d042e570026");
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant22.setName("12/03/2017");
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product26 = new com.example.unifood.models.Product();
    boolean b27 = product26.getAvailability();
    restaurant25.addProduct(product26);
    java.util.List<com.example.unifood.models.Product> list_product29 = restaurant25.getProductList();
    restaurant25.setUserId("hi!");
    java.util.List<com.example.unifood.models.Review> list_review32 = restaurant25.getReviewList();
    restaurant22.setReviewList(list_review32);
    java.util.List<com.example.unifood.models.Review> list_review34 = restaurant22.getReviewList();
    restaurant9.setReviewList(list_review34);
    com.example.unifood.models.Restaurant restaurant39 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b40 = restaurant39.getApproved();
    java.lang.String str41 = restaurant39.getId();
    java.lang.String str42 = restaurant39.getId();
    com.example.unifood.models.Restaurant restaurant46 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b47 = restaurant46.getApproved();
    com.example.unifood.models.Product product51 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b52 = product51.getAvailability();
    product51.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str55 = product51.getId();
    restaurant46.addProduct(product51);
    java.util.List<com.example.unifood.models.Product> list_product57 = restaurant46.getProductList();
    restaurant39.setProductList(list_product57);
    restaurant9.setProductList(list_product57);
    java.lang.String str60 = restaurant9.getName();
    com.example.unifood.models.Product product61 = new com.example.unifood.models.Product();
    product61.setDescription("hi!");
    java.lang.String str64 = product61.getDescription();
    float f65 = product61.getCost();
    java.lang.String str66 = product61.getName();
    boolean b67 = product61.getAvailability();
    restaurant9.addProduct(product61);
    com.example.unifood.models.Restaurant restaurant72 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b73 = restaurant72.getApproved();
    java.lang.String str74 = restaurant72.getId();
    java.util.List<com.example.unifood.models.Review> list_review75 = restaurant72.getReviewList();
    restaurant9.setReviewList(list_review75);
    restaurant0.setReviewList(list_review75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str16.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "7a4b31ad-30ee-4de9-874e-75bc023f8aa5"+ "'", str41.equals("7a4b31ad-30ee-4de9-874e-75bc023f8aa5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "7a4b31ad-30ee-4de9-874e-75bc023f8aa5"+ "'", str42.equals("7a4b31ad-30ee-4de9-874e-75bc023f8aa5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str55.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str60.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f65 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "7ec918a2-0bc7-4382-a609-38237ea94e09"+ "'", str74.equals("7ec918a2-0bc7-4382-a609-38237ea94e09"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review75);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

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
    review43.setRestaurantId("7b379d86-fcc6-43c8-a85d-c887cc492e73");
    java.lang.String str56 = review43.getUserId();
    java.lang.String str57 = review43.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "dfa7cca9-e59a-4542-8a06-e718f98c7e4e"+ "'", str10.equals("dfa7cca9-e59a-4542-8a06-e718f98c7e4e"));
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "cab3a8f4-49ff-4d14-8c1f-3e6562459879"+ "'", str31.equals("cab3a8f4-49ff-4d14-8c1f-3e6562459879"));
    
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
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "a7ebaf4b-ff03-4b84-bd80-94754b28f994"+ "'", str57.equals("a7ebaf4b-ff03-4b84-bd80-94754b28f994"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("93bc61df-a615-4c00-b515-f37b697242ee", "983a5c4e-aa49-46e5-83ef-45159624651e", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidLocalizationException");
    } catch (com.example.unifood.exceptions.InvalidLocalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setType("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("e41a6d9c-54ce-40ae-9b87-9dd82f9a7da4");
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b5 = studentInfo3.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    com.example.unifood.models.University university7 = new com.example.unifood.models.University("hi!");
    java.lang.String str8 = university7.getId();
    boolean b10 = university7.addCampus("hi!");
    java.lang.String str11 = university7.getId();
    university7.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    com.example.unifood.models.University university15 = new com.example.unifood.models.University("hi!");
    boolean b17 = university15.removeCampus("hi!");
    com.example.unifood.models.University university19 = new com.example.unifood.models.University("hi!");
    java.lang.String str20 = university19.getId();
    boolean b22 = university19.addCampus("hi!");
    java.lang.String str23 = university19.getId();
    university19.setName("12/03/2017");
    java.util.List<java.lang.String> list_str26 = university19.getAllCampus();
    university15.setAllCampus(list_str26);
    java.util.List<java.lang.String> list_str28 = university15.getAllCampus();
    university7.setAllCampus(list_str28);
    studentInfo3.setFavRestaurants(list_str28);
    university1.setAllCampus(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "7e68ddd8-cda0-4f31-821c-994562359ca3"+ "'", str8.equals("7e68ddd8-cda0-4f31-821c-994562359ca3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "7e68ddd8-cda0-4f31-821c-994562359ca3"+ "'", str11.equals("7e68ddd8-cda0-4f31-821c-994562359ca3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4080022c-d080-4fcf-9ec7-e1d5109119aa"+ "'", str20.equals("4080022c-d080-4fcf-9ec7-e1d5109119aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4080022c-d080-4fcf-9ec7-e1d5109119aa"+ "'", str23.equals("4080022c-d080-4fcf-9ec7-e1d5109119aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    java.lang.String str1 = ownerException0.toString();
    java.lang.Throwable throwable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    ownerException0.addSuppressed(throwable2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str1.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

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
    review16.setUserId("edc47eff-c991-488a-9ea7-ea42ad9aad63");
    
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
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("c7492f51-751c-49fa-9823-c9ff6db2c39f", "", "5ed892b7-8b07-4339-8318-fe7c666739ed");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getFirstName();
    java.lang.String str7 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str5.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c7492f51-751c-49fa-9823-c9ff6db2c39f"+ "'", str6.equals("c7492f51-751c-49fa-9823-c9ff6db2c39f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setComment("39d04fd2-31c3-494e-a3e2-1d40dc64104d");

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    userInfo0.setLastName("9d54bba1-c011-40fe-a86a-2b02e99ae523");
    userInfo0.setType("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str8 = userInfo0.getFirstName();
    java.lang.String str9 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9d54bba1-c011-40fe-a86a-2b02e99ae523"+ "'", str9.equals("9d54bba1-c011-40fe-a86a-2b02e99ae523"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

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
    java.lang.String str26 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9b0981ef-84ea-49bf-a297-c7316e1aa4c9"+ "'", str6.equals("9b0981ef-84ea-49bf-a297-c7316e1aa4c9"));
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "603fd35b-ea62-491b-8376-4e5ebb75b266"+ "'", str26.equals("603fd35b-ea62-491b-8376-4e5ebb75b266"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    com.example.unifood.models.University university0 = new com.example.unifood.models.University();
    university0.setName("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str3 = university0.getName();
    university0.setName("b1e0ce4f-fe08-425e-8497-24824ac3c0d9");
    java.lang.String str6 = university0.getId();
    java.lang.String str7 = university0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str3.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ef85d2d6-7b31-4a8f-913e-c37f06b96fea"+ "'", str6.equals("ef85d2d6-7b31-4a8f-913e-c37f06b96fea"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ef85d2d6-7b31-4a8f-913e-c37f06b96fea"+ "'", str7.equals("ef85d2d6-7b31-4a8f-913e-c37f06b96fea"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    boolean b9 = studentInfo0.delRestaurantFromFavorites("81319dc6-e5e3-472a-a00d-3a357443441e");
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo();
    studentInfo10.setCampusId("");
    studentInfo10.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo10.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b18 = studentInfo10.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str19 = studentInfo10.getCampusId();
    boolean b21 = studentInfo10.delRestaurantFromFavorites("e0ed697c-d17d-4982-81ea-097a494113d9");
    boolean b23 = studentInfo10.delProductFromFavorites("9626d0ba-fe19-4356-a232-426c972c7dfc");
    java.util.List<java.lang.String> list_str24 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str19.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setAvailability(false);
    product3.setName("ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    java.lang.String str9 = product3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "92244037-38ac-401a-9322-5149c826d9af"+ "'", str9.equals("92244037-38ac-401a-9322-5149c826d9af"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    java.lang.String str8 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str8.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2adc96c3-f320-42fb-97f3-c22c606913fb");
    boolean b3 = studentInfo1.addProductToFavorites("cda102ed-5d20-4a30-b455-702bfe3561b2");
    boolean b5 = studentInfo1.addProductToFavorites("");
    boolean b7 = studentInfo1.addRestaurantToFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

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
    review20.setComment("");
    
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

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

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
    boolean b72 = studentInfo0.addProductToFavorites("cf53a282-9287-48a0-abfb-9d7fb0cb6f87");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str9);
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b15 = studentInfo0.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b17 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("");
    com.example.unifood.models.Campus campus21 = new com.example.unifood.models.Campus();
    boolean b23 = campus21.removeRestaurant("hi!");
    campus21.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str26 = campus21.getRestaurants();
    boolean b28 = campus21.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b30 = campus21.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    campus21.setName("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7");
    java.util.List<java.lang.String> list_str33 = campus21.getRestaurants();
    studentInfo0.setFavRestaurants(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

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
    boolean b16 = campus0.addRestaurant("9cef684b-9583-4350-bc7f-52fdf83f721b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "440febb8-253f-4197-b7df-2131d5034338"+ "'", str6.equals("440febb8-253f-4197-b7df-2131d5034338"));
    
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

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    review0.setDate("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    review0.setComment("9c79c876-a93d-4813-92df-b21535c292d5");
    review0.setRate((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    boolean b6 = university1.addCampus("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b8 = university1.removeCampus("bb0b0e5c-f5b5-4364-8dd6-487af25ff1cc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d80acfe3-41dd-43ad-85a7-b8ad78db06ef"+ "'", str2.equals("d80acfe3-41dd-43ad-85a7-b8ad78db06ef"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("84c380a1-fee2-4bfe-82b9-7668a6f07e00", "1fcc4f0c-26bc-4946-bf17-5d8a16792f98", 0.0f, "10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str5 = review4.getDate();
    review4.setUserId("00487f43-dd32-4fba-9d5b-dfb8513cc52a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str5.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("119f287e-61c5-497a-b55c-17489bcb03e9");
    boolean b3 = university1.addCampus("com.example.unifood.exceptions.InvalidLastNameException");
    university1.setId("2130df33-a88c-4ccc-a737-697671ae9ccc");
    university1.setId("3255b7a1-8533-43de-820d-ad22e5728de6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

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
    com.example.unifood.models.Restaurant restaurant26 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product27 = new com.example.unifood.models.Product();
    boolean b28 = product27.getAvailability();
    restaurant26.addProduct(product27);
    java.util.List<com.example.unifood.models.Product> list_product30 = restaurant26.getProductList();
    com.example.unifood.models.Product product31 = new com.example.unifood.models.Product();
    product31.setDescription("hi!");
    boolean b34 = restaurant26.removeProduct(product31);
    restaurant26.setCampusId("com.example.unifood.exceptions.OwnerException");
    com.example.unifood.models.Restaurant restaurant37 = new com.example.unifood.models.Restaurant();
    restaurant37.updateRating();
    com.example.unifood.models.Product product39 = new com.example.unifood.models.Product();
    boolean b40 = product39.getAvailability();
    product39.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b43 = product39.getAvailability();
    product39.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant37.addProduct(product39);
    restaurant26.update(restaurant37);
    restaurant37.setUserId("74237342-5cf5-495c-86de-c1bc12d8c326");
    com.example.unifood.models.Review review50 = new com.example.unifood.models.Review();
    review50.setId("");
    java.lang.String str53 = review50.getUserId();
    review50.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str56 = review50.getDate();
    review50.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review50.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review50.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    boolean b63 = restaurant37.removeReview(review50);
    com.example.unifood.models.Restaurant restaurant67 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant67.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str70 = restaurant67.getShortDescription();
    boolean b72 = restaurant67.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review73 = new com.example.unifood.models.Review();
    review73.setId("");
    java.lang.String str76 = review73.getUserId();
    review73.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f79 = review73.getRate();
    boolean b80 = restaurant67.removeReview(review73);
    com.example.unifood.models.Restaurant restaurant81 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product82 = new com.example.unifood.models.Product();
    boolean b83 = product82.getAvailability();
    restaurant81.addProduct(product82);
    java.util.List<com.example.unifood.models.Product> list_product85 = restaurant81.getProductList();
    restaurant81.setUserId("hi!");
    restaurant81.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product90 = restaurant81.getProductList();
    restaurant67.setProductList(list_product90);
    restaurant37.setProductList(list_product90);
    restaurant0.setProductList(list_product90);
    
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
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + ""+ "'", str70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f79 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product90);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

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
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b31 = restaurant30.getApproved();
    java.lang.String str32 = restaurant30.getId();
    java.lang.String str33 = restaurant30.getId();
    com.example.unifood.models.Restaurant restaurant37 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b38 = restaurant37.getApproved();
    com.example.unifood.models.Product product42 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b43 = product42.getAvailability();
    product42.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str46 = product42.getId();
    restaurant37.addProduct(product42);
    java.util.List<com.example.unifood.models.Product> list_product48 = restaurant37.getProductList();
    restaurant30.setProductList(list_product48);
    restaurant0.setProductList(list_product48);
    java.lang.String str51 = restaurant0.getName();
    com.example.unifood.models.Product product52 = new com.example.unifood.models.Product();
    product52.setDescription("hi!");
    java.lang.String str55 = product52.getDescription();
    float f56 = product52.getCost();
    java.lang.String str57 = product52.getName();
    boolean b58 = product52.getAvailability();
    restaurant0.addProduct(product52);
    product52.setCost((float)1L);
    
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
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "67f6c38f-f400-46b4-ac43-3304533cd948"+ "'", str32.equals("67f6c38f-f400-46b4-ac43-3304533cd948"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "67f6c38f-f400-46b4-ac43-3304533cd948"+ "'", str33.equals("67f6c38f-f400-46b4-ac43-3304533cd948"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str46.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str51.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f56 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

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
    java.util.List<java.lang.String> list_str21 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "db1b82fb-02c0-44ed-aaf3-73b67b16751d"+ "'", str10.equals("db1b82fb-02c0-44ed-aaf3-73b67b16751d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "db1b82fb-02c0-44ed-aaf3-73b67b16751d"+ "'", str13.equals("db1b82fb-02c0-44ed-aaf3-73b67b16751d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str16.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

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
    com.example.unifood.models.Review review38 = new com.example.unifood.models.Review();
    java.lang.String str39 = review38.getId();
    java.lang.String str40 = review38.getUserId();
    java.lang.String str41 = review38.getRestaurantId();
    boolean b42 = restaurant3.removeReview(review38);
    com.example.unifood.models.Restaurant restaurant46 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant46.setName("12/03/2017");
    java.lang.String str49 = restaurant46.getUserId();
    boolean b50 = restaurant46.getApproved();
    com.example.unifood.models.Product product51 = new com.example.unifood.models.Product();
    boolean b52 = product51.getAvailability();
    product51.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b55 = product51.getAvailability();
    java.lang.String str56 = product51.getDescription();
    boolean b57 = restaurant46.removeProduct(product51);
    product51.setAvailability(false);
    boolean b60 = restaurant3.removeProduct(product51);
    
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
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "998a280c-8858-4a11-bf7a-e2e0f52cbeae"+ "'", str39.equals("998a280c-8858-4a11-bf7a-e2e0f52cbeae"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str56.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setLastName("2af0b02e-4c9a-4970-a399-ff63e0300464");
    java.lang.String str7 = userInfo0.getType();
    userInfo0.setLastName("240f8c33-472b-47f7-9c46-778e3e93a08b");
    
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
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("33d4dd53-9159-47e5-bf8e-95972b316e25");

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("028d9e90-8f7a-426f-9bb1-f298fcad31ed");
    campus1.setName("8d18bd34-cd6c-4a60-92d2-32b0cd777fa7");

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setType("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str6 = userInfo3.getType();
    userInfo3.setFirstName("8922762e-c394-4758-8e43-89d8388d9c11");
    java.lang.String str9 = userInfo3.getType();
    java.lang.String str10 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str6.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str9.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str10.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

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
    java.lang.String str27 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "cb8e6f67-2c06-4dda-931c-41f6376cf5f5"+ "'", str25.equals("cb8e6f67-2c06-4dda-931c-41f6376cf5f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "cb8e6f67-2c06-4dda-931c-41f6376cf5f5"+ "'", str26.equals("cb8e6f67-2c06-4dda-931c-41f6376cf5f5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    review7.setId("ae115cae-3f27-4f5a-99c4-df1876401604");
    review7.setId("7b3e863f-e108-4a03-b358-467ff79fd91e");
    review7.setComment("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "57280c57-a831-404d-9f61-4ddde151bb25"+ "'", str8.equals("57280c57-a831-404d-9f61-4ddde151bb25"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

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
    float f42 = product35.getCost();
    java.lang.String str43 = product35.getId();
    product35.setCost((float)(byte)100);
    
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
    org.junit.Assert.assertTrue(f42 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "42ff3df8-22e9-4277-9924-c3723c127d45"+ "'", str43.equals("42ff3df8-22e9-4277-9924-c3723c127d45"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

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
    review21.setUserId("");
    
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
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

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
    restaurant0.setLocalization("a53b1dd3-6bfc-42d0-9d58-929bb2e777d1");
    com.example.unifood.models.Review review30 = new com.example.unifood.models.Review();
    review30.setId("");
    review30.setId("add01af6-9901-43d3-950c-81f3702a5d12");
    boolean b35 = restaurant0.removeReview(review30);
    
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
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

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
    product13.setCost((float)(byte)10);
    product13.setId("a714e2e4-9a9f-4636-a3e8-c11ded26eceb");
    java.lang.String str25 = product13.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "67b66343-e0f4-4441-8227-810567484c1e"+ "'", str10.equals("67b66343-e0f4-4441-8227-810567484c1e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "a714e2e4-9a9f-4636-a3e8-c11ded26eceb"+ "'", str25.equals("a714e2e4-9a9f-4636-a3e8-c11ded26eceb"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }

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
    review20.setDate("5a768843-8dc8-45b5-baf6-85706b277c5f");
    review20.setDate("fa7f5017-0a89-49e2-941c-43a83b1800b0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3cbc180c-7127-458d-be47-6858d091db31"+ "'", str5.equals("3cbc180c-7127-458d-be47-6858d091db31"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "cfcb8a99-bd0d-4e2d-9420-1b0455035e2c"+ "'", str21.equals("cfcb8a99-bd0d-4e2d-9420-1b0455035e2c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    restaurant3.addProduct(product16);
    product16.setId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str20 = product16.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10649ddd-831c-4a5d-b54e-db55a76d1419"+ "'", str20.equals("10649ddd-831c-4a5d-b54e-db55a76d1419"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("8e069f68-c995-4d5a-9117-23fad524d3d9", "55dabc7b-3fe7-4421-a040-d45c92cd70da", (float)0L, "9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    java.lang.String str5 = review4.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8e069f68-c995-4d5a-9117-23fad524d3d9"+ "'", str5.equals("8e069f68-c995-4d5a-9117-23fad524d3d9"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    boolean b4 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b6 = studentInfo0.addProductToFavorites("6c4c9076-aeac-4c07-b6bc-73b8d8f0a4be");
    boolean b8 = studentInfo0.addProductToFavorites("0dd3bcdd-17dd-4a34-b5cb-fda55cb778ad");
    java.lang.String str9 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    boolean b5 = studentInfo1.delProductFromFavorites("8a4f7782-7de3-4ba9-b962-3e34df2e8048");
    boolean b7 = studentInfo1.delProductFromFavorites("8fdb7eec-0016-4fb6-9050-da5eefe986f6");
    java.util.List<java.lang.String> list_str8 = null;
    studentInfo1.setFavProducts(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }

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
    java.lang.String str32 = restaurant3.getUserId();
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }

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
    com.example.unifood.models.Restaurant restaurant26 = new com.example.unifood.models.Restaurant();
    java.lang.String str27 = restaurant26.getUserId();
    restaurant26.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant26.updateRating();
    restaurant26.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product33 = new com.example.unifood.models.Product();
    boolean b34 = product33.getAvailability();
    product33.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b37 = product33.getAvailability();
    boolean b38 = restaurant26.removeProduct(product33);
    restaurant0.update(restaurant26);
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review("23f3c66c-8c00-4d96-bbed-d2cba049ea2f", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", 0.0f, "1c6da8a9-8b9b-4db7-89db-45956ef9db40");
    boolean b45 = restaurant26.removeReview(review44);
    review44.setRate((float)10L);
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }

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
    java.lang.Float f77 = restaurant3.getRate();
    
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
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "ec6fc735-94da-495f-a50c-3f7dca3542ef"+ "'", str57.equals("ec6fc735-94da-495f-a50c-3f7dca3542ef"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f77 + "' != '" + 0.0f+ "'", f77.equals(0.0f));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }

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
    restaurant0.setShortDescription("f0abce46-2656-46af-99c4-cc4f3ce992d7");
    restaurant0.setId("");
    com.example.unifood.models.Product product50 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f51 = product50.getCost();
    java.lang.String str52 = product50.getId();
    float f53 = product50.getCost();
    boolean b54 = restaurant0.removeProduct(product50);
    product50.setName("7fd0ed15-c95a-4a70-8ba8-3bab28b55449");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "30cad912-00d7-4255-a221-52615fc1492d"+ "'", str10.equals("30cad912-00d7-4255-a221-52615fc1492d"));
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "f75eb34b-e9e3-4db9-aade-0723095a7855"+ "'", str31.equals("f75eb34b-e9e3-4db9-aade-0723095a7855"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f51 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "0ec3cd6d-747a-45a3-8bee-5ffdac26a400"+ "'", str52.equals("0ec3cd6d-747a-45a3-8bee-5ffdac26a400"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f53 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    java.lang.String str10 = restaurant0.getCampusId();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b15 = product14.getAvailability();
    boolean b16 = restaurant0.removeProduct(product14);
    boolean b17 = product14.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a46483da-5f29-48d5-aab9-63f5b5b69181"+ "'", str8.equals("a46483da-5f29-48d5-aab9-63f5b5b69181"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }

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
    java.util.List<java.lang.String> list_str18 = campus0.getRestaurants();
    boolean b20 = campus0.removeRestaurant("");
    java.lang.String str21 = campus0.getId();
    
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
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "b64767a6-3c97-48a0-aa02-3ed7bda43a73"+ "'", str21.equals("b64767a6-3c97-48a0-aa02-3ed7bda43a73"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    campus0.setName("356355fb-92eb-464e-ae48-bb58ea231323");
    boolean b15 = campus0.addRestaurant("3a720006-7b86-4e09-929d-021722db755e");
    
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
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    boolean b10 = campus0.addRestaurant("119f287e-61c5-497a-b55c-17489bcb03e9");
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    campus0.setId("605e0046-9222-4d39-9091-c20d52f69d2b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "bc32d004-bdcf-4bc3-af0a-a91d35fdef23"+ "'", str6.equals("bc32d004-bdcf-4bc3-af0a-a91d35fdef23"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "bc32d004-bdcf-4bc3-af0a-a91d35fdef23"+ "'", str8.equals("bc32d004-bdcf-4bc3-af0a-a91d35fdef23"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }

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
    review40.setDate("5ed892b7-8b07-4339-8318-fe7c666739ed");
    
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

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("2adc96c3-f320-42fb-97f3-c22c606913fb", "67a826d0-ad9d-49db-8997-58baff1011a9", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setLastName("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    userInfo3.setLastName("b98e5f61-14f3-4753-960a-2daadec0cb90");

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }

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
    java.lang.String str20 = review13.getDate();
    java.lang.String str21 = review13.getId();
    java.lang.String str22 = review13.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "22021eff-7fed-4315-8b3e-45ee28261dab"+ "'", str14.equals("22021eff-7fed-4315-8b3e-45ee28261dab"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "22021eff-7fed-4315-8b3e-45ee28261dab"+ "'", str16.equals("22021eff-7fed-4315-8b3e-45ee28261dab"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "22021eff-7fed-4315-8b3e-45ee28261dab"+ "'", str21.equals("22021eff-7fed-4315-8b3e-45ee28261dab"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("7672e12e-d876-4ebb-acb5-ae587ee60ebd", "a7ecf34a-73c4-47dd-94d1-402bee5cd2ff", "96e536d1-d4be-47d3-9ff0-ba6495705da0");

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    product0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    float f6 = product0.getCost();
    product0.setCost((float)1);
    boolean b9 = product0.getAvailability();
    float f10 = product0.getCost();
    product0.setName("12c88725-bcdb-492e-b140-8d348158e6af");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 1.0f);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }

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
    campus0.setId("dac02838-9dbb-48f8-840f-5c2575bfecbd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1ccf9c25-7747-4d21-8324-d16115be5d8e"+ "'", str6.equals("1ccf9c25-7747-4d21-8324-d16115be5d8e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1ccf9c25-7747-4d21-8324-d16115be5d8e"+ "'", str8.equals("1ccf9c25-7747-4d21-8324-d16115be5d8e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1ccf9c25-7747-4d21-8324-d16115be5d8e"+ "'", str9.equals("1ccf9c25-7747-4d21-8324-d16115be5d8e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }

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
    com.example.unifood.models.Restaurant restaurant73 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product74 = new com.example.unifood.models.Product();
    boolean b75 = product74.getAvailability();
    restaurant73.addProduct(product74);
    java.util.List<com.example.unifood.models.Product> list_product77 = restaurant73.getProductList();
    restaurant73.setUserId("hi!");
    restaurant73.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review82 = restaurant73.getReviewList();
    com.example.unifood.models.Restaurant restaurant86 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant86.setName("12/03/2017");
    java.lang.String str89 = restaurant86.getUserId();
    java.lang.String str90 = restaurant86.getLocalization();
    restaurant73.update(restaurant86);
    restaurant73.setCampusId("53d5e04e-abb5-45a7-a278-d742367421a0");
    com.example.unifood.models.Product product94 = new com.example.unifood.models.Product();
    boolean b95 = product94.getAvailability();
    product94.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b98 = restaurant73.removeProduct(product94);
    boolean b99 = restaurant3.removeProduct(product94);
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "c06829fa-6535-4eea-9695-2db929c780d0"+ "'", str37.equals("c06829fa-6535-4eea-9695-2db929c780d0"));
    
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
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "c2d6c188-82f7-46f7-8ba3-8b9dfaaa7e3f"+ "'", str60.equals("c2d6c188-82f7-46f7-8ba3-8b9dfaaa7e3f"));
    
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
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + ""+ "'", str89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str90.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("82c6ce4c-1ae9-44e3-b51a-eb720b3cd059", "afe6df90-3410-4057-8ebb-ab0cb114fdce", (float)100, "2130df33-a88c-4ccc-a737-697671ae9ccc", "0ec3cd6d-747a-45a3-8bee-5ffdac26a400");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2adc96c3-f320-42fb-97f3-c22c606913fb");
    studentInfo1.setCampusId("50930ca7-ab17-4356-8cfe-059790147518");
    boolean b5 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.lang.String str11 = campus0.getId();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "370ea4c4-7307-4b6f-b139-0d1e61d638d8"+ "'", str11.equals("370ea4c4-7307-4b6f-b139-0d1e61d638d8"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setShortDescription("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");
    restaurant0.setLocalization("65efe1a9-f2a7-4e15-bec1-3957bcfef68f");
    com.example.unifood.models.Restaurant restaurant13 = new com.example.unifood.models.Restaurant();
    java.lang.String str14 = restaurant13.getUserId();
    restaurant13.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant13.updateRating();
    restaurant13.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    product20.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b24 = product20.getAvailability();
    boolean b25 = restaurant13.removeProduct(product20);
    product20.setCost((float)(short)10);
    float f28 = product20.getCost();
    restaurant0.addProduct(product20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f28 == 10.0f);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setName("12/03/2017");
    java.util.List<java.lang.String> list_str8 = university1.getAllCampus();
    boolean b10 = university1.removeCampus("f9aed092-86fa-4154-b725-059acdbc7d63");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b14 = studentInfo12.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b16 = studentInfo12.delProductFromFavorites("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    studentInfo12.setFavRestaurants(list_str19);
    university1.setAllCampus(list_str19);
    university1.setName("016f7a51-1523-4248-8cce-d7af4447fbc2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5282bd88-b17c-421f-8b83-e42c83dab888"+ "'", str2.equals("5282bd88-b17c-421f-8b83-e42c83dab888"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5282bd88-b17c-421f-8b83-e42c83dab888"+ "'", str5.equals("5282bd88-b17c-421f-8b83-e42c83dab888"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setName("");
    float f5 = product0.getCost();
    product0.setName("ed1fea83-0b78-45a8-a668-9b9922d4ac3f");
    java.lang.String str8 = product0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "f9f685ca-5764-4887-a9b7-8d83c81461e1"+ "'", str8.equals("f9f685ca-5764-4887-a9b7-8d83c81461e1"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }

    com.example.unifood.exceptions.ReviewException reviewException0 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException1 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str2 = invalidRestaurantIdException1.toString();
    reviewException0.addSuppressed((java.lang.Throwable)invalidRestaurantIdException1);
    com.example.unifood.exceptions.InvalidTypeException invalidTypeException4 = new com.example.unifood.exceptions.InvalidTypeException();
    invalidRestaurantIdException1.addSuppressed((java.lang.Throwable)invalidTypeException4);
    java.lang.String str6 = invalidTypeException4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str2.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.InvalidTypeException"+ "'", str6.equals("com.example.unifood.exceptions.InvalidTypeException"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    java.lang.String str5 = product3.getId();
    float f6 = product3.getCost();
    product3.setDescription("d9c718a1-767f-44a8-b38d-da4c38ed7fce");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "e1b7f46b-f47f-4bf1-96bf-c72a7a72e69b"+ "'", str5.equals("e1b7f46b-f47f-4bf1-96bf-c72a7a72e69b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }

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
    com.example.unifood.models.University university19 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus20 = new com.example.unifood.models.Campus();
    boolean b22 = campus20.removeRestaurant("hi!");
    campus20.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str25 = campus20.getRestaurants();
    university19.setAllCampus(list_str25);
    campus0.setRestaurants(list_str25);
    boolean b29 = campus0.removeRestaurant("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str30 = campus0.getRestaurants();
    
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
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }

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
    java.util.List<java.lang.String> list_str17 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2615ec00-f90f-418d-a6e6-c467343daec8"+ "'", str6.equals("2615ec00-f90f-418d-a6e6-c467343daec8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("f159180e-b003-42a2-a92b-b5ca9102f827");
    java.lang.String str2 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f159180e-b003-42a2-a92b-b5ca9102f827"+ "'", str2.equals("f159180e-b003-42a2-a92b-b5ca9102f827"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }

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
    product24.setDescription("f1a38d36-527d-45f5-82f7-a9fc8da0f531");
    
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("4dc32edb-837b-4c73-8d72-66df1a3ebd2c");
    java.util.List<java.lang.String> list_str2 = university1.getAllCampus();
    boolean b4 = university1.removeCampus("e92f35ee-2576-44bd-97a8-ac34c1eaf19c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }

    com.example.unifood.exceptions.ReviewException reviewException0 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException1 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str2 = invalidRestaurantIdException1.toString();
    reviewException0.addSuppressed((java.lang.Throwable)invalidRestaurantIdException1);
    java.lang.Throwable[] throwable_array4 = invalidRestaurantIdException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str2.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str5 = review0.getDate();
    review0.setRestaurantId("5a768843-8dc8-45b5-baf6-85706b277c5f");
    review0.setUserId("8ef2eb1c-6eaa-459e-96ae-f92134f1053c");
    review0.setDate("811f8a1d-ca60-461d-828c-6680d7547043");
    review0.setComment("28e5f954-8356-4228-9524-30113024356e");
    review0.setUserId("9efdf4e3-9f76-42e1-99ca-b299ef37f5e0");
    java.lang.String str16 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "811f8a1d-ca60-461d-828c-6680d7547043"+ "'", str16.equals("811f8a1d-ca60-461d-828c-6680d7547043"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }

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
    review64.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    review64.setDate("d0efb8a3-3c54-4621-acb0-0ceb72881372");
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "ab57331f-5246-4f48-9633-c113ff38e7e0"+ "'", str26.equals("ab57331f-5246-4f48-9633-c113ff38e7e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "cee60967-22b7-4278-8423-33f191b3da64"+ "'", str35.equals("cee60967-22b7-4278-8423-33f191b3da64"));
    
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

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }

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
    java.util.List<java.lang.String> list_str13 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "635d28d3-19fc-4fb0-a0f8-d633ab5d80b9"+ "'", str6.equals("635d28d3-19fc-4fb0-a0f8-d633ab5d80b9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "635d28d3-19fc-4fb0-a0f8-d633ab5d80b9"+ "'", str8.equals("635d28d3-19fc-4fb0-a0f8-d633ab5d80b9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "635d28d3-19fc-4fb0-a0f8-d633ab5d80b9"+ "'", str9.equals("635d28d3-19fc-4fb0-a0f8-d633ab5d80b9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setId("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    java.lang.String str7 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = campus0.getId();
    boolean b11 = campus0.addRestaurant("b6792249-a15c-420b-9817-44c9aa457e85");
    java.lang.String str12 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "dd7e0765-28dc-4e73-be8a-380d07088c0c"+ "'", str6.equals("dd7e0765-28dc-4e73-be8a-380d07088c0c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "dd7e0765-28dc-4e73-be8a-380d07088c0c"+ "'", str9.equals("dd7e0765-28dc-4e73-be8a-380d07088c0c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "dd7e0765-28dc-4e73-be8a-380d07088c0c"+ "'", str12.equals("dd7e0765-28dc-4e73-be8a-380d07088c0c"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    boolean b8 = campus0.addRestaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = campus0.getName();
    java.lang.String str10 = campus0.getName();
    java.lang.String str11 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0f7ddd26-9e1d-4221-b2b1-d580d27eb41a"+ "'", str6.equals("0f7ddd26-9e1d-4221-b2b1-d580d27eb41a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str10.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0f7ddd26-9e1d-4221-b2b1-d580d27eb41a"+ "'", str11.equals("0f7ddd26-9e1d-4221-b2b1-d580d27eb41a"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    java.lang.String str1 = restaurant0.getUserId();
    restaurant0.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant0.updateRating();
    restaurant0.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }

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
    java.lang.String str22 = review10.getUserId();
    review10.setComment("bcb5231e-854a-42c7-81cf-bcde53ee699a");
    
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
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("8fb81efd-e454-4b41-837c-440f27d5e941");
    java.lang.String str7 = review0.getComment();
    review0.setComment("edf01dd6-a35a-426f-808e-d6346b5af74f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("2016930c-728d-45c5-a236-9c4833a30246");
    float f7 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 10.0f);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    java.lang.String str3 = product0.getDescription();
    float f4 = product0.getCost();
    java.lang.String str5 = product0.getDescription();
    product0.setCost(35.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("4ad6ded4-6046-416e-884e-e4a4469f34f0", "b2683e82-f0d4-4578-a679-90f934eb23b6", "27965536-28f2-491c-96a4-5ad3aecce1b3");

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }

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
    java.util.List<java.lang.String> list_str19 = campus0.getRestaurants();
    
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
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("73c0dd45-897d-4eb2-8356-deb3b8e00fa5", "783036da-6ec8-474d-81c4-a8c5cc7a1154", (float)100, "48af3aad-919d-4ef4-8028-3a57694cd73d", "906c835e-8a36-4952-88c8-39dfc6b9636b");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }

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
    product7.setId("e8e3014e-33aa-43e7-bb64-b61e035fc513");
    product7.setName("");
    java.lang.String str17 = product7.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "e8e3014e-33aa-43e7-bb64-b61e035fc513"+ "'", str17.equals("e8e3014e-33aa-43e7-bb64-b61e035fc513"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("15a6b6a2-cfd9-4c65-8821-2c55c4d44d03");

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("9284ccc7-4eeb-48bd-bde6-966fcdadbb43");

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("83dcfd58-baea-490b-9ce7-451b2979689f", "44341332-36c2-4454-b7f8-fc0b9a7b0e1a", 32.0f, "50b809e1-30e1-43a2-9130-3596ec543aca", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }

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
    com.example.unifood.models.Restaurant restaurant23 = new com.example.unifood.models.Restaurant();
    java.lang.String str24 = restaurant23.getUserId();
    java.lang.String str25 = restaurant23.getLocalization();
    restaurant23.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product28 = new com.example.unifood.models.Product();
    boolean b29 = product28.getAvailability();
    product28.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product28.setAvailability(true);
    product28.setCost((float)(byte)10);
    restaurant23.addProduct(product28);
    java.lang.String str37 = product28.getDescription();
    product28.setDescription("");
    boolean b40 = restaurant12.removeProduct(product28);
    restaurant12.setShortDescription("9a557890-b5c1-4460-a030-67989b53a000");
    restaurant12.setLocalization("e2144475-af4e-4137-826c-e2b1a9f36f62");
    restaurant12.setUserId("a78204f1-ede6-4e45-8113-466448888b40");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "675c0dc2-a9c5-4219-829b-6f0f40d11734"+ "'", str19.equals("675c0dc2-a9c5-4219-829b-6f0f40d11734"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str22.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str37.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }

    com.example.unifood.exceptions.InvalidDateException invalidDateException0 = new com.example.unifood.exceptions.InvalidDateException();
    java.lang.Throwable[] throwable_array1 = invalidDateException0.getSuppressed();
    java.lang.Throwable[] throwable_array2 = invalidDateException0.getSuppressed();
    java.lang.String str3 = invalidDateException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.example.unifood.exceptions.InvalidDateException"+ "'", str3.equals("com.example.unifood.exceptions.InvalidDateException"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    java.lang.String str5 = restaurant0.getUserId();
    boolean b7 = restaurant0.equals((java.lang.Object)"19161666-e6aa-484c-a34c-9d051c4b3766");
    java.util.List<com.example.unifood.models.Review> list_review8 = restaurant0.getReviewList();
    restaurant0.setLocalization("417f3e0b-e3cc-4dc6-bd5c-2e87683b0394");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1a58b1f5-2d31-4fd5-afa5-3fa900adb0a0"+ "'", str4.equals("1a58b1f5-2d31-4fd5-afa5-3fa900adb0a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }

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
    java.util.List<com.example.unifood.models.Product> list_product34 = restaurant0.getProductList();
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "28512eb9-1c97-44a0-be2b-7617481221d5"+ "'", str8.equals("28512eb9-1c97-44a0-be2b-7617481221d5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "be4a4b9d-75e5-4c80-95f7-a21bedcc3aca"+ "'", str20.equals("be4a4b9d-75e5-4c80-95f7-a21bedcc3aca"));
    
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
    org.junit.Assert.assertNotNull(list_product34);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    studentInfo0.setCampusId("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavProducts();
    boolean b11 = studentInfo0.delRestaurantFromFavorites("f725d497-61a6-42a0-b3a8-ad09aa4e8765");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b15 = studentInfo13.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b17 = studentInfo13.delProductFromFavorites("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    studentInfo13.setFavRestaurants(list_str20);
    com.example.unifood.models.Campus campus22 = new com.example.unifood.models.Campus();
    boolean b24 = campus22.removeRestaurant("hi!");
    campus22.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str27 = campus22.getRestaurants();
    boolean b29 = campus22.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b31 = campus22.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b33 = campus22.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str34 = campus22.getName();
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo();
    studentInfo35.setCampusId("");
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    studentInfo35.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    campus22.setRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    studentInfo13.setFavProducts((java.util.List<java.lang.String>)arraylist_str44);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    com.example.unifood.models.StudentInfo studentInfo50 = new com.example.unifood.models.StudentInfo();
    boolean b52 = studentInfo50.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b54 = studentInfo50.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus55 = new com.example.unifood.models.Campus();
    boolean b57 = campus55.removeRestaurant("hi!");
    campus55.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str60 = campus55.getRestaurants();
    java.lang.String str61 = campus55.getId();
    java.lang.String str62 = campus55.getName();
    campus55.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str65 = campus55.getRestaurants();
    studentInfo50.setFavRestaurants(list_str65);
    boolean b68 = studentInfo50.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.Campus campus69 = new com.example.unifood.models.Campus();
    boolean b71 = campus69.removeRestaurant("hi!");
    campus69.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str74 = campus69.getRestaurants();
    boolean b76 = campus69.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b78 = campus69.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b80 = campus69.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b82 = campus69.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus69.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.util.List<java.lang.String> list_str85 = campus69.getRestaurants();
    studentInfo50.setFavRestaurants(list_str85);
    studentInfo0.setFavProducts(list_str85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str34.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "a55abf36-50b3-4da5-a8b6-0e7de2e4d16f"+ "'", str61.equals("a55abf36-50b3-4da5-a8b6-0e7de2e4d16f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str62.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str85);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    university1.setId("32d2e43e-3da9-4657-ad10-25e7a486a77e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0919e4ec-974a-4ca0-b1e4-1f5adf6e6a19"+ "'", str2.equals("0919e4ec-974a-4ca0-b1e4-1f5adf6e6a19"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0919e4ec-974a-4ca0-b1e4-1f5adf6e6a19"+ "'", str5.equals("0919e4ec-974a-4ca0-b1e4-1f5adf6e6a19"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("028d9e90-8f7a-426f-9bb1-f298fcad31ed");
    boolean b3 = campus1.removeRestaurant("966eb1c9-3eb2-4ca2-91cb-de5257760e00");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    campus0.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    java.lang.String str12 = campus0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "e5022934-2179-40a2-a275-effb96793c90"+ "'", str6.equals("e5022934-2179-40a2-a275-effb96793c90"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str12.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }

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
    java.lang.String str13 = university0.getName();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str13.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }

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
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b34 = restaurant33.getApproved();
    java.lang.String str35 = restaurant33.getId();
    java.util.List<com.example.unifood.models.Review> list_review36 = restaurant33.getReviewList();
    restaurant33.updateRating();
    restaurant33.updateRating();
    java.util.List<com.example.unifood.models.Review> list_review39 = restaurant33.getReviewList();
    restaurant0.setReviewList(list_review39);
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "5b2fb9f8-bd0a-4f49-ac83-3cfbb3238cf6"+ "'", str23.equals("5b2fb9f8-bd0a-4f49-ac83-3cfbb3238cf6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str25.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "709f9128-c3bf-4235-b7ba-b85716ef6f9e"+ "'", str35.equals("709f9128-c3bf-4235-b7ba-b85716ef6f9e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review39);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b13 = campus0.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus0.setId("19c7d5e9-6bde-438f-aa67-83a5a8eeebdc");
    campus0.setName("7071a3a8-0659-48de-9594-da8247027c10");
    boolean b19 = campus0.addRestaurant("1cc346cd-7e37-4aa5-a18f-4211b5a529c9");
    com.example.unifood.models.Campus campus21 = new com.example.unifood.models.Campus("32bef74e-15d2-4f2b-849c-199055557d88");
    com.example.unifood.models.University university23 = new com.example.unifood.models.University("hi!");
    boolean b25 = university23.removeCampus("hi!");
    university23.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str28 = university23.getName();
    boolean b30 = university23.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university32 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus33 = new com.example.unifood.models.Campus();
    boolean b35 = campus33.removeRestaurant("hi!");
    campus33.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str38 = campus33.getRestaurants();
    university32.setAllCampus(list_str38);
    java.util.List<java.lang.String> list_str40 = university32.getAllCampus();
    university23.setAllCampus(list_str40);
    java.util.List<java.lang.String> list_str42 = university23.getAllCampus();
    java.util.List<java.lang.String> list_str43 = university23.getAllCampus();
    campus21.setRestaurants(list_str43);
    campus0.setRestaurants(list_str43);
    
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
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.Throwable[] throwable_array3 = ownerException0.getSuppressed();
    java.lang.String str4 = ownerException0.toString();
    java.lang.String str5 = ownerException0.toString();
    java.lang.String str6 = ownerException0.toString();
    java.lang.String str7 = ownerException0.toString();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException8 = new com.example.unifood.exceptions.InvalidCampusNameException();
    com.example.unifood.exceptions.OwnerException ownerException9 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.OwnerException ownerException10 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException11 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException10.addSuppressed((java.lang.Throwable)invalidCampusIdException11);
    java.lang.Throwable[] throwable_array13 = ownerException10.getSuppressed();
    java.lang.String str14 = ownerException10.toString();
    java.lang.String str15 = ownerException10.toString();
    ownerException9.addSuppressed((java.lang.Throwable)ownerException10);
    invalidCampusNameException8.addSuppressed((java.lang.Throwable)ownerException9);
    java.lang.String str18 = ownerException9.toString();
    ownerException0.addSuppressed((java.lang.Throwable)ownerException9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str4.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str5.equals("com.example.unifood.exceptions.OwnerException"));
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str18.equals("com.example.unifood.exceptions.OwnerException"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }

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
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    review20.setId("");
    java.lang.String str23 = review20.getUserId();
    review20.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f26 = review20.getRate();
    restaurant3.addReview(review20);
    restaurant3.setRate((java.lang.Float)35.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getFirstName();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setFirstName("310432b2-bbdc-4327-8dd8-4eee1a883b11");
    userInfo0.setLastName("9671196b-1200-4802-9c89-84b10db05cfa");
    
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
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }

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
    java.lang.Float f30 = restaurant0.getRate();
    
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
    org.junit.Assert.assertTrue("'" + f30 + "' != '" + 0.0f+ "'", f30.equals(0.0f));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }

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
    product10.setAvailability(false);
    product10.setId("f896595d-285f-448c-9d6c-2c86b7422847");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "71524c3e-b99d-424a-8ff8-e4dbf097f168"+ "'", str4.equals("71524c3e-b99d-424a-8ff8-e4dbf097f168"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "11f38bff-defa-48ac-8e03-a079ae9b1b39"+ "'", str12.equals("11f38bff-defa-48ac-8e03-a079ae9b1b39"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "11f38bff-defa-48ac-8e03-a079ae9b1b39"+ "'", str14.equals("11f38bff-defa-48ac-8e03-a079ae9b1b39"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setDate("67a826d0-ad9d-49db-8997-58baff1011a9");
    review0.setDate("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7");
    review0.setRate((float)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("17604120-3f03-41bc-ac7a-f4e923901ad5");

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }

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
    com.example.unifood.models.Product product88 = new com.example.unifood.models.Product();
    boolean b89 = product88.getAvailability();
    product88.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b92 = product88.getAvailability();
    java.lang.String str93 = product88.getDescription();
    product88.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    float f96 = product88.getCost();
    product88.setAvailability(false);
    boolean b99 = restaurant3.removeProduct(product88);
    
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
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "a8ae89ff-3481-4cd6-b41e-ee31dcc6829e"+ "'", str57.equals("a8ae89ff-3481-4cd6-b41e-ee31dcc6829e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "d07e6395-453b-4503-85be-5bb3392a624d"+ "'", str84.equals("d07e6395-453b-4503-85be-5bb3392a624d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f86 + "' != '" + 0.0f+ "'", f86.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str93.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f96 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    java.lang.String str31 = campus0.getId();
    boolean b33 = campus0.removeRestaurant("10649ddd-831c-4a5d-b54e-db55a76d1419");
    boolean b35 = campus0.addRestaurant("7c59358e-116e-43c5-8ee4-d0460ea1e2fb");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "9f306987-57df-408e-b35c-ab4ba0096947"+ "'", str31.equals("9f306987-57df-408e-b35c-ab4ba0096947"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }

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
    restaurant0.updateRating();
    
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

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    java.util.List<com.example.unifood.models.Review> list_review12 = restaurant3.getReviewList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review12);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("b2060833-bcdb-4312-8023-357a976f6ec2");

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }

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
    java.lang.String str18 = product7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "1311aec3-7fbf-4312-aebf-fd43e255845f"+ "'", str18.equals("1311aec3-7fbf-4312-aebf-fd43e255845f"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    review5.setComment("");
    review5.setComment("ba69067d-e3bd-4093-876a-8471267d6846");
    java.lang.String str13 = review5.getComment();
    review5.setRate((float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ba69067d-e3bd-4093-876a-8471267d6846"+ "'", str13.equals("ba69067d-e3bd-4093-876a-8471267d6846"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("9bb4ec51-2299-41a3-b764-2192d7b57501", "com.example.unifood.exceptions.OwnerException", (float)100, "", "f9918df4-0669-412b-a8fd-a60a0023c498");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("d198c136-7f06-4fac-8327-5bfd4cfb76bd", "1d2417d5-5118-4cf4-b0d6-d0be3e827f3e", (float)10L, "25c48a06-8783-404c-a7fa-ec52d0c74a11", "eab73ce2-8cc4-499c-bb4d-49248c911a38");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo0.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    studentInfo0.setCampusId("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    java.lang.String str11 = studentInfo0.getCampusId();
    com.example.unifood.models.Campus campus12 = new com.example.unifood.models.Campus();
    boolean b14 = campus12.removeRestaurant("hi!");
    campus12.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str17 = campus12.getRestaurants();
    java.lang.String str18 = campus12.getId();
    java.lang.String str19 = campus12.getName();
    java.lang.String str20 = campus12.getId();
    campus12.setId("");
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavRestaurants();
    boolean b26 = studentInfo23.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str27 = studentInfo23.getCampusId();
    studentInfo23.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    studentInfo30.setCampusId("");
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<java.lang.String>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str39, str_array38);
    studentInfo30.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str39);
    com.example.unifood.models.StudentInfo studentInfo42 = new com.example.unifood.models.StudentInfo();
    studentInfo42.setCampusId("");
    studentInfo42.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo42.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str49 = studentInfo42.getFavProducts();
    studentInfo30.setFavProducts(list_str49);
    studentInfo23.setFavRestaurants(list_str49);
    boolean b53 = studentInfo23.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo();
    studentInfo54.setCampusId("");
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str63 = new java.util.ArrayList<java.lang.String>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str63, str_array62);
    studentInfo54.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str63);
    studentInfo54.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b69 = studentInfo54.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b71 = studentInfo54.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus73 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str74 = campus73.getId();
    com.example.unifood.models.StudentInfo studentInfo75 = new com.example.unifood.models.StudentInfo();
    studentInfo75.setCampusId("");
    java.lang.String[] str_array83 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str84 = new java.util.ArrayList<java.lang.String>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str84, str_array83);
    studentInfo75.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str84);
    campus73.setRestaurants((java.util.List<java.lang.String>)arraylist_str84);
    studentInfo54.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str84);
    studentInfo23.setFavProducts((java.util.List<java.lang.String>)arraylist_str84);
    campus12.setRestaurants((java.util.List<java.lang.String>)arraylist_str84);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str84);
    boolean b93 = studentInfo0.delRestaurantFromFavorites("56a1e8aa-3e9e-4dd9-bb2d-380efc35a0fd");
    java.util.List<java.lang.String> list_str94 = studentInfo0.getFavProducts();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ff3b5ba4-62b9-472c-947d-eea60a7b2d88"+ "'", str18.equals("ff3b5ba4-62b9-472c-947d-eea60a7b2d88"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str19.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ff3b5ba4-62b9-472c-947d-eea60a7b2d88"+ "'", str20.equals("ff3b5ba4-62b9-472c-947d-eea60a7b2d88"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "8bce8d99-a332-49cb-bc16-12efa4a65d57"+ "'", str74.equals("8bce8d99-a332-49cb-bc16-12efa4a65d57"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str94);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }

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
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException17 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException18 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException17.addSuppressed((java.lang.Throwable)invalidCampusNameException18);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException20 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException18.addSuppressed((java.lang.Throwable)invalidDescriptionException20);
    com.example.unifood.exceptions.UserException userException22 = new com.example.unifood.exceptions.UserException();
    java.lang.String str23 = userException22.toString();
    invalidDescriptionException20.addSuppressed((java.lang.Throwable)userException22);
    com.example.unifood.exceptions.OwnerException ownerException25 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException26 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException25.addSuppressed((java.lang.Throwable)invalidCampusIdException26);
    java.lang.String str28 = ownerException25.toString();
    java.lang.String str29 = ownerException25.toString();
    userException22.addSuppressed((java.lang.Throwable)ownerException25);
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException31 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str32 = invalidRestaurantNameException31.toString();
    userException22.addSuppressed((java.lang.Throwable)invalidRestaurantNameException31);
    java.lang.Throwable[] throwable_array34 = userException22.getSuppressed();
    java.lang.String str35 = userException22.toString();
    invalidRestaurantNameException14.addSuppressed((java.lang.Throwable)userException22);
    java.lang.Throwable[] throwable_array37 = invalidRestaurantNameException14.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str15.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str23.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str28.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str29.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str32.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str35.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array37);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    userInfo3.setLastName("9946470d-d39c-4a9b-a598-9cb41808251a");

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getUserId();
    restaurant3.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str7 = restaurant3.getUserId();
    java.lang.Float f8 = restaurant3.getRate();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    java.util.List<com.example.unifood.models.Product> list_product13 = restaurant9.getProductList();
    com.example.unifood.models.Product product14 = new com.example.unifood.models.Product();
    product14.setDescription("hi!");
    boolean b17 = restaurant9.removeProduct(product14);
    restaurant9.setShortDescription("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    java.lang.String str20 = restaurant9.getUserId();
    restaurant9.setCampusId("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    java.util.List<com.example.unifood.models.Review> list_review23 = restaurant9.getReviewList();
    restaurant3.setReviewList(list_review23);
    com.example.unifood.models.Restaurant restaurant25 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product26 = new com.example.unifood.models.Product();
    boolean b27 = product26.getAvailability();
    restaurant25.addProduct(product26);
    java.util.List<com.example.unifood.models.Product> list_product29 = restaurant25.getProductList();
    restaurant25.setUserId("hi!");
    restaurant25.setName("12/03/2017");
    com.example.unifood.models.Review review34 = new com.example.unifood.models.Review();
    java.lang.String str35 = review34.getId();
    boolean b36 = restaurant25.removeReview(review34);
    com.example.unifood.models.Review review37 = new com.example.unifood.models.Review();
    review37.setId("");
    java.lang.String str40 = review37.getUserId();
    review37.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str43 = review37.getRestaurantId();
    boolean b44 = restaurant25.removeReview(review37);
    review37.setRate((float)'#');
    restaurant3.addReview(review37);
    boolean b48 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "7506f817-0333-4096-b7df-e365bf67e184"+ "'", str35.equals("7506f817-0333-4096-b7df-e365bf67e184"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    restaurant0.setShortDescription("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    com.example.unifood.models.Restaurant restaurant12 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    restaurant12.addProduct(product13);
    java.util.List<com.example.unifood.models.Product> list_product16 = restaurant12.getProductList();
    restaurant12.setUserId("hi!");
    restaurant12.setName("12/03/2017");
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    java.lang.String str22 = review21.getId();
    boolean b23 = restaurant12.removeReview(review21);
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product25 = new com.example.unifood.models.Product();
    boolean b26 = product25.getAvailability();
    restaurant24.addProduct(product25);
    product25.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b30 = restaurant12.removeProduct(product25);
    boolean b31 = product25.getAvailability();
    product25.setId("8e069f68-c995-4d5a-9117-23fad524d3d9");
    java.lang.String str34 = product25.getDescription();
    java.lang.String str35 = product25.getDescription();
    java.lang.String str36 = product25.getName();
    restaurant0.addProduct(product25);
    restaurant0.setId("42065d2c-2510-414f-b1ed-b86067b8f731");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "f5f414d1-82f4-450f-8664-886d62ebb9c4"+ "'", str22.equals("f5f414d1-82f4-450f-8664-886d62ebb9c4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    restaurant0.setLocalization("6e4d5f35-2bd8-4993-95fe-642f53be3698");
    restaurant0.setShortDescription("f30d8e07-3aaa-4fd2-8d2f-508e4a8333a4");
    java.lang.String str13 = restaurant0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e0fedb76-7a47-4973-8ecb-dd69fcf78cf0"+ "'", str4.equals("e0fedb76-7a47-4973-8ecb-dd69fcf78cf0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "e6acb160-dff8-4e78-9a49-6e86cc2a4663"+ "'", str13.equals("e6acb160-dff8-4e78-9a49-6e86cc2a4663"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }

    com.example.unifood.exceptions.InvalidDateException invalidDateException0 = new com.example.unifood.exceptions.InvalidDateException();
    java.lang.Throwable[] throwable_array1 = invalidDateException0.getSuppressed();
    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException2 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException3 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException2.addSuppressed((java.lang.Throwable)invalidCampusNameException3);
    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException5 = new com.example.unifood.exceptions.InvalidDescriptionException();
    invalidCampusNameException3.addSuppressed((java.lang.Throwable)invalidDescriptionException5);
    com.example.unifood.exceptions.UserException userException7 = new com.example.unifood.exceptions.UserException();
    java.lang.String str8 = userException7.toString();
    invalidDescriptionException5.addSuppressed((java.lang.Throwable)userException7);
    com.example.unifood.exceptions.OwnerException ownerException10 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException11 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException10.addSuppressed((java.lang.Throwable)invalidCampusIdException11);
    java.lang.String str13 = ownerException10.toString();
    java.lang.String str14 = ownerException10.toString();
    userException7.addSuppressed((java.lang.Throwable)ownerException10);
    com.example.unifood.exceptions.InvalidRestaurantNameException invalidRestaurantNameException16 = new com.example.unifood.exceptions.InvalidRestaurantNameException();
    java.lang.String str17 = invalidRestaurantNameException16.toString();
    userException7.addSuppressed((java.lang.Throwable)invalidRestaurantNameException16);
    com.example.unifood.exceptions.OwnerException ownerException19 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException20 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException19.addSuppressed((java.lang.Throwable)invalidCampusIdException20);
    com.example.unifood.exceptions.OwnerException ownerException22 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException23 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException22.addSuppressed((java.lang.Throwable)invalidCampusIdException23);
    java.lang.String str25 = ownerException22.toString();
    invalidCampusIdException20.addSuppressed((java.lang.Throwable)ownerException22);
    invalidRestaurantNameException16.addSuppressed((java.lang.Throwable)ownerException22);
    com.example.unifood.exceptions.OwnerException ownerException28 = new com.example.unifood.exceptions.OwnerException();
    java.lang.Throwable[] throwable_array29 = ownerException28.getSuppressed();
    java.lang.Throwable[] throwable_array30 = ownerException28.getSuppressed();
    ownerException22.addSuppressed((java.lang.Throwable)ownerException28);
    invalidDateException0.addSuppressed((java.lang.Throwable)ownerException22);
    java.lang.Throwable[] throwable_array33 = ownerException22.getSuppressed();
    java.lang.Throwable[] throwable_array34 = ownerException22.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str8.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str13.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str14.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str17.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str25.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array34);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("7c382e92-acef-4318-a40d-158e77003992");
    studentInfo1.setCampusId("9bd89d28-19bb-4c2d-a129-4f98542c55ca");
    java.util.List<java.lang.String> list_str4 = null;
    studentInfo1.setFavProducts(list_str4);
    java.lang.String str6 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9bd89d28-19bb-4c2d-a129-4f98542c55ca"+ "'", str6.equals("9bd89d28-19bb-4c2d-a129-4f98542c55ca"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9befae08-3641-4d76-a03a-fd4046ab0bc7");

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("com.example.unifood.exceptions.OwnerException");
    ownerInfo0.setRestaurantId("a8331c8c-27d1-4b1e-9030-a2db2eb4c5c6");

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }

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
    java.lang.Throwable[] throwable_array17 = invalidRestaurantNameException14.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str6.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str11.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str12.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantNameException"+ "'", str15.equals("com.example.unifood.exceptions.InvalidRestaurantNameException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array17);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }

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
    java.lang.String str21 = review10.getUserId();
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
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("5a273cf9-8754-4ef8-928f-ae9ed4612f91", "7dea6dd3-d01e-4d44-8c35-3d24cbec7350", (float)(byte)100, "com.example.unifood.exceptions.InvalidDateException", "19c7d5e9-6bde-438f-aa67-83a5a8eeebdc");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("3ecfff92-55f1-4b87-a1df-47ab7830ef0f");

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }

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
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus16 = new com.example.unifood.models.Campus();
    boolean b18 = campus16.removeRestaurant("hi!");
    campus16.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str21 = campus16.getRestaurants();
    studentInfo15.setFavRestaurants(list_str21);
    java.lang.String str23 = studentInfo15.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    studentInfo24.setCampusId("");
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<java.lang.String>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str33, str_array32);
    studentInfo24.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str33);
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo();
    studentInfo36.setCampusId("");
    studentInfo36.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo36.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str43 = studentInfo36.getFavProducts();
    studentInfo24.setFavProducts(list_str43);
    com.example.unifood.models.Campus campus45 = new com.example.unifood.models.Campus();
    boolean b47 = campus45.removeRestaurant("hi!");
    campus45.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str50 = campus45.getRestaurants();
    studentInfo24.setFavRestaurants(list_str50);
    studentInfo15.setFavRestaurants(list_str50);
    com.example.unifood.models.University university54 = new com.example.unifood.models.University("hi!");
    java.lang.String str55 = university54.getId();
    java.util.List<java.lang.String> list_str56 = university54.getAllCampus();
    boolean b58 = university54.addCampus("87229e63-e927-4901-97ef-90801d78d9d4");
    java.util.List<java.lang.String> list_str59 = university54.getAllCampus();
    studentInfo15.setFavRestaurants(list_str59);
    campus0.setRestaurants(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "195c1836-6706-4286-9fa6-f7282b2ef202"+ "'", str6.equals("195c1836-6706-4286-9fa6-f7282b2ef202"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str11.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str14.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "40202d8d-7461-4f96-92cc-2f44a0da08e8"+ "'", str55.equals("40202d8d-7461-4f96-92cc-2f44a0da08e8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getRestaurantId();
    review0.setUserId("");
    review0.setUserId("48236bdd-bcf7-4ae1-a63d-ce85112a9e4b");
    review0.setRestaurantId("2ba1fe5a-3c17-4cf6-9902-7c71bd268402");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b6 = studentInfo0.delRestaurantFromFavorites("239d950c-a53b-45db-9e8f-483a040e426a");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavRestaurants();
    boolean b9 = studentInfo0.delProductFromFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
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
    studentInfo0.setFavProducts(list_str24);
    java.util.List<java.lang.String> list_str26 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("96e536d1-d4be-47d3-9ff0-ba6495705da0", "4ad6ded4-6046-416e-884e-e4a4469f34f0", "67ec4d38-1aef-46b2-a7ba-8c63cab7c73b");

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("239d950c-a53b-45db-9e8f-483a040e426a", "adb74c6f-c839-47cc-b096-1c12240d6afd", 1.0f, "49976e80-f69f-4380-aa76-dc904dcb2eca", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    review5.setRate((float)100L);
    float f8 = review5.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 100.0f);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("2bde6188-a1f5-42df-8521-755899074104");
    boolean b3 = campus1.addRestaurant("22021eff-7fed-4315-8b3e-45ee28261dab");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b3 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant11.setName("12/03/2017");
    java.lang.String str14 = restaurant11.getUserId();
    restaurant11.setCampusId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    com.example.unifood.models.Review review17 = new com.example.unifood.models.Review();
    review17.setId("");
    com.example.unifood.models.Review review20 = new com.example.unifood.models.Review();
    java.lang.String str21 = review20.getDate();
    java.lang.String str22 = review20.getComment();
    com.example.unifood.models.Review review23 = new com.example.unifood.models.Review();
    review23.setId("");
    java.lang.String str26 = review23.getUserId();
    java.lang.String str27 = review23.getRestaurantId();
    com.example.unifood.models.Review review28 = new com.example.unifood.models.Review();
    java.lang.String str29 = review28.getDate();
    java.lang.String str30 = review28.getComment();
    com.example.unifood.models.Review review31 = new com.example.unifood.models.Review();
    java.lang.String str32 = review31.getDate();
    com.example.unifood.models.Review review33 = new com.example.unifood.models.Review();
    java.lang.String str34 = review33.getId();
    com.example.unifood.models.Restaurant restaurant35 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product36 = new com.example.unifood.models.Product();
    boolean b37 = product36.getAvailability();
    restaurant35.addProduct(product36);
    java.util.List<com.example.unifood.models.Product> list_product39 = restaurant35.getProductList();
    restaurant35.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review42 = new com.example.unifood.models.Review();
    java.lang.String str43 = review42.getId();
    boolean b44 = restaurant35.removeReview(review42);
    com.example.unifood.models.Review review45 = new com.example.unifood.models.Review();
    java.lang.String str46 = review45.getDate();
    java.lang.String str47 = review45.getComment();
    com.example.unifood.models.Review review48 = new com.example.unifood.models.Review();
    review48.setRate((float)10L);
    review48.setDate("hi!");
    com.example.unifood.models.Review review58 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review58.setUserId("");
    com.example.unifood.models.Review[] review_array61 = new com.example.unifood.models.Review[] { review17, review20, review23, review28, review31, review33, review42, review45, review48, review58 };
    java.util.ArrayList<com.example.unifood.models.Review> arraylist_review62 = new java.util.ArrayList<com.example.unifood.models.Review>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<com.example.unifood.models.Review>)arraylist_review62, review_array61);
    restaurant11.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review62);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review62);
    restaurant3.setUserId("8fb81efd-e454-4b41-837c-440f27d5e941");
    com.example.unifood.models.Restaurant restaurant68 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product69 = new com.example.unifood.models.Product();
    boolean b70 = product69.getAvailability();
    restaurant68.addProduct(product69);
    java.util.List<com.example.unifood.models.Product> list_product72 = restaurant68.getProductList();
    restaurant68.setUserId("hi!");
    java.util.List<com.example.unifood.models.Product> list_product75 = restaurant68.getProductList();
    restaurant3.setProductList(list_product75);
    restaurant3.updateRating();
    restaurant3.setUserId("00387c66-74c4-4462-8a1c-60f83181234e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "82c1d71c-7d9a-4fe3-90d2-3ae03afa19a4"+ "'", str5.equals("82c1d71c-7d9a-4fe3-90d2-3ae03afa19a4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "c1d1eb75-e099-4e6d-b6ef-f4846651b933"+ "'", str34.equals("c1d1eb75-e099-4e6d-b6ef-f4846651b933"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "54ef05f8-25d9-44aa-ab35-d74d72f83d8b"+ "'", str43.equals("54ef05f8-25d9-44aa-ab35-d74d72f83d8b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product75);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa", "aabd70ed-be9f-4452-9625-3f6b64c27121", "4f54b634-288e-42c6-b781-2869535b5bb5");
    java.lang.String str4 = restaurant3.getName();
    java.lang.String str5 = restaurant3.getId();
    restaurant3.setCampusId("16bc091e-53dc-406d-8c7e-15d5c23036ca");
    java.lang.String str8 = restaurant3.getShortDescription();
    com.example.unifood.models.Restaurant restaurant9 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product10 = new com.example.unifood.models.Product();
    boolean b11 = product10.getAvailability();
    restaurant9.addProduct(product10);
    restaurant9.setShortDescription("");
    restaurant9.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant9.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product20 = new com.example.unifood.models.Product();
    boolean b21 = product20.getAvailability();
    restaurant19.addProduct(product20);
    java.util.List<com.example.unifood.models.Product> list_product23 = restaurant19.getProductList();
    restaurant9.setProductList(list_product23);
    java.util.List<com.example.unifood.models.Review> list_review25 = restaurant9.getReviewList();
    restaurant9.setId("45ff5ab3-6561-44f6-9c93-3f3be9ded172");
    java.lang.Float f28 = restaurant9.getRate();
    java.util.List<com.example.unifood.models.Product> list_product29 = restaurant9.getProductList();
    restaurant3.setProductList(list_product29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"+ "'", str4.equals("5911ecd2-b2b8-4f4b-8e87-ca79bebe47aa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2483ca93-36c3-4932-bdbe-8ac94731d971"+ "'", str5.equals("2483ca93-36c3-4932-bdbe-8ac94731d971"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f28 + "' != '" + 0.0f+ "'", f28.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product29);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("0b709982-69f3-49a0-9c5c-e9e7adb6e122", (float)'#', "");

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }

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
    java.lang.String str37 = restaurant0.getShortDescription();
    java.lang.String str38 = restaurant0.getUserId();
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    restaurant0.updateRating();
    restaurant0.setUserId("5aa3e6c8-b159-46f6-b439-3a1dcaed2d47");
    restaurant0.setLocalization("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    java.lang.String str6 = restaurant0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }

    com.example.unifood.exceptions.InvalidDescriptionException invalidDescriptionException0 = new com.example.unifood.exceptions.InvalidDescriptionException();
    java.lang.String str1 = invalidDescriptionException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "com.example.unifood.exceptions.InvalidDescriptionException"+ "'", str1.equals("com.example.unifood.exceptions.InvalidDescriptionException"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str3 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str3.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    review0.setUserId("6f50f37a-6c53-4a1c-aa71-362094a47134");
    java.lang.String str7 = review0.getRestaurantId();
    java.lang.String str8 = review0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1d2417d5-5118-4cf4-b0d6-d0be3e827f3e"+ "'", str7.equals("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "92ac7ffa-bd86-4d43-869b-991bdd7d16f3"+ "'", str8.equals("92ac7ffa-bd86-4d43-869b-991bdd7d16f3"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    boolean b4 = studentInfo1.delProductFromFavorites("84132e2b-1d5a-4886-9edd-b08db65d8de5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("b3660a10-0a45-4a63-a48b-cafcf60da884");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo1.setFavRestaurants(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus11 = new com.example.unifood.models.Campus();
    boolean b13 = campus11.removeRestaurant("hi!");
    campus11.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str16 = campus11.getRestaurants();
    studentInfo10.setFavRestaurants(list_str16);
    java.lang.String str18 = studentInfo10.getCampusId();
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
    com.example.unifood.models.Campus campus40 = new com.example.unifood.models.Campus();
    boolean b42 = campus40.removeRestaurant("hi!");
    campus40.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str45 = campus40.getRestaurants();
    studentInfo19.setFavRestaurants(list_str45);
    studentInfo10.setFavRestaurants(list_str45);
    java.util.List<java.lang.String> list_str48 = studentInfo10.getFavRestaurants();
    studentInfo1.setFavProducts(list_str48);
    com.example.unifood.models.StudentInfo studentInfo50 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str51 = studentInfo50.getFavRestaurants();
    studentInfo1.setFavProducts(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "b3660a10-0a45-4a63-a48b-cafcf60da884"+ "'", str9.equals("b3660a10-0a45-4a63-a48b-cafcf60da884"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product0.setDescription("4f0c7ed5-02a6-47cd-9cdc-eb3f10473475");
    product0.setAvailability(true);
    product0.setId("de2ace5c-0aa8-4d05-a5e8-49634c6c28f6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3dffcd5f-4263-4ee0-911a-aa770d7709fb");
    campus1.setId("e58ca70f-164c-43f0-8f34-ca5b7a641ffb");

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    campus0.setName("dc08b25a-d1cc-4b53-a84a-b377a8c4f0a7");
    com.example.unifood.models.University university13 = new com.example.unifood.models.University("hi!");
    boolean b15 = university13.removeCampus("hi!");
    university13.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university13.setName("6d3b7d9e-a652-451f-86e1-e840caf8da77");
    boolean b21 = university13.addCampus("82f9966f-8a91-47b9-8ec4-ec9d2b0423c6");
    university13.setId("ab097a3e-9c08-45c3-a159-30c420c80a02");
    com.example.unifood.models.Campus campus24 = new com.example.unifood.models.Campus();
    boolean b26 = campus24.removeRestaurant("hi!");
    campus24.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str29 = campus24.getRestaurants();
    java.lang.String str30 = campus24.getId();
    java.lang.String str31 = campus24.getName();
    campus24.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.lang.String str34 = campus24.getId();
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    com.example.unifood.models.Campus campus37 = new com.example.unifood.models.Campus();
    boolean b39 = campus37.removeRestaurant("hi!");
    campus37.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str42 = campus37.getRestaurants();
    java.lang.String str43 = campus37.getId();
    java.lang.String str44 = campus37.getName();
    campus37.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    com.example.unifood.models.University university48 = new com.example.unifood.models.University("hi!");
    java.lang.String str49 = university48.getId();
    java.lang.String[] str_array78 = new java.lang.String[] { "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "5f549e06-72c7-4c21-9698-5857aa4f3922", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "ba061308-092f-40b1-9a8e-465a56f359d0", "8fb81efd-e454-4b41-837c-440f27d5e941", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "9bb4ec51-2299-41a3-b764-2192d7b57501", "2016930c-728d-45c5-a236-9c4833a30246", "3db35cfa-ac0a-4288-9084-8d042e570026", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "2b4a092c-7fd6-4da1-aad3-c371931860b6", "9cef684b-9583-4350-bc7f-52fdf83f721b", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "5ed892b7-8b07-4339-8318-fe7c666739ed", "ba061308-092f-40b1-9a8e-465a56f359d0", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "d054f793-8da1-4b53-9056-26346d97b155", "3f1f2c41-cbe8-4647-a5f0-123f0f1af573", "bf93221f-f963-4560-8f4a-9bd0a88f2bc4", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7", "adb74c6f-c839-47cc-b096-1c12240d6afd", "e8588626-52d3-4ed2-8bd5-24c0755bae64", "10649ddd-831c-4a5d-b54e-db55a76d1419", "3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb" };
    java.util.ArrayList<java.lang.String> arraylist_str79 = new java.util.ArrayList<java.lang.String>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str79, str_array78);
    university48.setAllCampus((java.util.List<java.lang.String>)arraylist_str79);
    campus37.setRestaurants((java.util.List<java.lang.String>)arraylist_str79);
    studentInfo36.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str79);
    campus24.setRestaurants((java.util.List<java.lang.String>)arraylist_str79);
    university13.setAllCampus((java.util.List<java.lang.String>)arraylist_str79);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str79);
    java.lang.String str87 = campus0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "5858b29d-7c96-4fd6-b3ba-19d99a868cca"+ "'", str30.equals("5858b29d-7c96-4fd6-b3ba-19d99a868cca"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str31.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "2adc96c3-f320-42fb-97f3-c22c606913fb"+ "'", str34.equals("2adc96c3-f320-42fb-97f3-c22c606913fb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "91e08414-384a-496f-8c94-6a9a342234e3"+ "'", str43.equals("91e08414-384a-496f-8c94-6a9a342234e3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str44.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "905679a9-d832-4fd3-8aa5-2a152c9d4e56"+ "'", str49.equals("905679a9-d832-4fd3-8aa5-2a152c9d4e56"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "ded3f6ac-079a-4079-beed-43911eaf44cf"+ "'", str87.equals("ded3f6ac-079a-4079-beed-43911eaf44cf"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.lang.String str4 = restaurant0.getId();
    restaurant0.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    restaurant0.setUserId("e6acb160-dff8-4e78-9a49-6e86cc2a4663");
    restaurant0.setLocalization("6e4d5f35-2bd8-4993-95fe-642f53be3698");
    restaurant0.setShortDescription("f30d8e07-3aaa-4fd2-8d2f-508e4a8333a4");
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "3912abe5-0120-4004-bc0c-71ac8d18ff15"+ "'", str4.equals("3912abe5-0120-4004-bc0c-71ac8d18ff15"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setLastName("27fab29a-8261-4cad-9980-1ab61f13cf41");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str4.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str8.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }

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
    review22.setDate("5c445e7d-c444-431c-b6b1-40f64c816aa0");
    java.lang.String str37 = review22.getRestaurantId();
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "53d740cc-3498-48a3-8d69-2631da037847"+ "'", str37.equals("53d740cc-3498-48a3-8d69-2631da037847"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidCampusIdException invalidCampusIdException1 = new com.example.unifood.exceptions.InvalidCampusIdException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidCampusIdException1);
    java.lang.Throwable[] throwable_array3 = invalidCampusIdException1.getSuppressed();
    java.lang.Throwable[] throwable_array4 = invalidCampusIdException1.getSuppressed();
    java.lang.String str5 = invalidCampusIdException1.toString();
    com.example.unifood.exceptions.CampusException campusException6 = new com.example.unifood.exceptions.CampusException();
    invalidCampusIdException1.addSuppressed((java.lang.Throwable)campusException6);
    java.lang.Throwable[] throwable_array8 = invalidCampusIdException1.getSuppressed();
    java.lang.Throwable[] throwable_array9 = invalidCampusIdException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.example.unifood.exceptions.InvalidCampusIdException"+ "'", str5.equals("com.example.unifood.exceptions.InvalidCampusIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array9);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("");
    product0.setCost(32.0f);
    product0.setDescription("47945630-e567-4cf1-bb33-35df2661de35");

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }

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
    studentInfo0.setCampusId("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    boolean b34 = studentInfo0.delRestaurantFromFavorites("e304f8eb-2dd5-4183-bfbc-58b30cd1b029");
    boolean b36 = studentInfo0.addRestaurantToFavorites("com.example.unifood.exceptions.InvalidRestaurantNameException");
    
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
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setId("8ce830fe-1366-4bd5-a822-511d9d102587");
    restaurant3.setCampusId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    restaurant3.setLocalization("9cef684b-9583-4350-bc7f-52fdf83f721b");
    restaurant3.setUserId("ae9d99df-d6ac-4c9c-ad52-41942487b2e1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }

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
    boolean b32 = studentInfo0.delProductFromFavorites("3717b6c7-b0b0-4897-b818-92659d332e3a");
    
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
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("3c3509d2-3279-48ca-b29b-572376fb6a35");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3c3509d2-3279-48ca-b29b-572376fb6a35"+ "'", str2.equals("3c3509d2-3279-48ca-b29b-572376fb6a35"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("a6fbd761-6313-4b06-80fc-219e36d412cf", "94b6648e-ea0c-4c4f-940e-4bb86a28eea1", (float)(short)10, "445ebc6e-2a4a-43ab-9349-eb9017465c35", "19161666-e6aa-484c-a34c-9d051c4b3766");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("488a4dbb-94ab-477f-a161-4ce60c44a097");

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("2adc96c3-f320-42fb-97f3-c22c606913fb");
    studentInfo1.setCampusId("50930ca7-ab17-4356-8cfe-059790147518");
    boolean b5 = studentInfo1.addProductToFavorites("2af84512-d659-4192-9aff-cdf41250e89d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    com.example.unifood.models.Product product6 = new com.example.unifood.models.Product();
    product6.setDescription("hi!");
    java.lang.String str9 = product6.getDescription();
    product6.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    product6.setAvailability(false);
    product6.setDescription("27fab29a-8261-4cad-9980-1ab61f13cf41");
    restaurant3.addProduct(product6);
    boolean b17 = restaurant3.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo();
    studentInfo9.setCampusId("");
    java.util.List<java.lang.String> list_str12 = studentInfo9.getFavProducts();
    campus0.setRestaurants(list_str12);
    boolean b15 = campus0.removeRestaurant("2c5a6737-6225-4f56-b35e-12df6d2ab66e");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "324cdae0-9c71-43f7-853a-3c91c29e26c2"+ "'", str6.equals("324cdae0-9c71-43f7-853a-3c91c29e26c2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "324cdae0-9c71-43f7-853a-3c91c29e26c2"+ "'", str8.equals("324cdae0-9c71-43f7-853a-3c91c29e26c2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }

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
    boolean b20 = campus0.removeRestaurant("577e50c9-285e-42bf-b384-a472a5576c81");
    java.util.List<java.lang.String> list_str21 = campus0.getRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "bbc2cbb6-c394-463b-aa9f-c34d39d7aa8f"+ "'", str10.equals("bbc2cbb6-c394-463b-aa9f-c34d39d7aa8f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "bbc2cbb6-c394-463b-aa9f-c34d39d7aa8f"+ "'", str13.equals("bbc2cbb6-c394-463b-aa9f-c34d39d7aa8f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str16.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5", "a168391a-9f26-4a84-960a-4f621dfd173e", "");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("b96fad62-576f-43d3-b616-2ee6d93e78e1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a168391a-9f26-4a84-960a-4f621dfd173e"+ "'", str4.equals("a168391a-9f26-4a84-960a-4f621dfd173e"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }

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
    com.example.unifood.models.Restaurant restaurant30 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b31 = restaurant30.getApproved();
    java.lang.String str32 = restaurant30.getId();
    java.lang.String str33 = restaurant30.getId();
    com.example.unifood.models.Restaurant restaurant37 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b38 = restaurant37.getApproved();
    com.example.unifood.models.Product product42 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    boolean b43 = product42.getAvailability();
    product42.setId("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str46 = product42.getId();
    restaurant37.addProduct(product42);
    java.util.List<com.example.unifood.models.Product> list_product48 = restaurant37.getProductList();
    restaurant30.setProductList(list_product48);
    restaurant0.setProductList(list_product48);
    java.lang.String str51 = restaurant0.getName();
    java.lang.String str52 = restaurant0.getLocalization();
    
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
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "8a55208d-8e3f-40fa-82e0-2df4c031488d"+ "'", str32.equals("8a55208d-8e3f-40fa-82e0-2df4c031488d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "8a55208d-8e3f-40fa-82e0-2df4c031488d"+ "'", str33.equals("8a55208d-8e3f-40fa-82e0-2df4c031488d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "a9a6d832-db46-43f7-8078-9b0af2950add"+ "'", str46.equals("a9a6d832-db46-43f7-8078-9b0af2950add"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str51.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str4 = restaurant3.getShortDescription();
    java.lang.Float f5 = restaurant3.getRate();
    restaurant3.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    restaurant3.setUserId("com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str10 = restaurant3.getName();
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str10.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }

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
    java.lang.Float f19 = restaurant0.getRate();
    restaurant0.setCampusId("6a77e6c8-7c77-428f-a170-f6a4255c74e1");
    java.lang.String str22 = restaurant0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "5a081e7f-69c4-4156-bf5b-2e39538fa649"+ "'", str10.equals("5a081e7f-69c4-4156-bf5b-2e39538fa649"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f19 + "' != '" + 0.0f+ "'", f19.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "6a77e6c8-7c77-428f-a170-f6a4255c74e1"+ "'", str22.equals("6a77e6c8-7c77-428f-a170-f6a4255c74e1"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("dcba02d6-e7c7-4e4a-bc68-a7887ae1d60f", "d9c718a1-767f-44a8-b38d-da4c38ed7fce", (float)1, "8b28f34c-44a4-4917-ad40-43c24673186d", "f0ed2a63-d4f0-4994-9b63-599b9810abac");

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str12 = campus0.getName();
    java.lang.String str13 = campus0.getName();
    boolean b15 = campus0.addRestaurant("d0efb8a3-3c54-4621-acb0-0ceb72881372");
    java.lang.String str16 = campus0.getId();
    java.lang.String str17 = campus0.getName();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str13.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "7241fc08-f727-43b6-a704-8a3bdf8ab6f6"+ "'", str16.equals("7241fc08-f727-43b6-a704-8a3bdf8ab6f6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str17.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }

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
    review10.setComment("a6a15e37-de72-4c55-91a1-ffacd16484c8");
    
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

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    java.lang.String str4 = ownerInfo0.getRestaurantId();
    java.lang.String str5 = ownerInfo0.getRestaurantId();
    java.lang.String str6 = ownerInfo0.getRestaurantId();
    java.lang.String str7 = ownerInfo0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str3.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str4.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str5.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str6.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str7.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("1cc346cd-7e37-4aa5-a18f-4211b5a529c9", (float)10L, "15149c67-efc5-4744-85b0-8dc2ac121df7");
    product3.setAvailability(true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getLastName();
    userInfo3.setType("5c445e7d-c444-431c-b6b1-40f64c816aa0");
    userInfo3.setType("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "53d5e04e-abb5-45a7-a278-d742367421a0"+ "'", str5.equals("53d5e04e-abb5-45a7-a278-d742367421a0"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str2 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavProducts();
    boolean b5 = studentInfo0.delProductFromFavorites("0300e50e-16b5-4344-a429-0cfab7d7e949");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    userInfo3.setType("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str10 = userInfo3.getLastName();
    java.lang.String str11 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str10.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str11.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("b1e0ce4f-fe08-425e-8497-24824ac3c0d9", "2b1eef77-3c68-46f5-961a-cdf9144f7a4a", (float)(byte)10, "8e6dda6d-66e5-4521-8634-e164e3b1c34c");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("", "5d054af0-c80d-4035-bb25-9ed4d59f9c35", (float)0L, "2aa7af71-b324-48a1-91b9-2182207d32b5", "786b0712-5207-4d24-8978-707d14035b88");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidUserIdException");
    } catch (com.example.unifood.exceptions.InvalidUserIdException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }

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
    java.lang.String str18 = restaurant0.getCampusId();
    boolean b19 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "35ae357f-b75a-4ba1-928a-89297de6ed97"+ "'", str4.equals("35ae357f-b75a-4ba1-928a-89297de6ed97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "9741db0d-f106-4ae0-9562-dbd17d50d5a3"+ "'", str18.equals("9741db0d-f106-4ae0-9562-dbd17d50d5a3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }

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
    java.lang.Throwable[] throwable_array10 = userException0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str7.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array10);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("2adc96c3-f320-42fb-97f3-c22c606913fb", "67a826d0-ad9d-49db-8997-58baff1011a9", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    userInfo3.setFirstName("3297f83b-f2d9-4302-9bae-feb087a818b8");

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("12/03/2017");
    boolean b14 = product7.getAvailability();
    java.lang.String str15 = product7.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    review0.setComment("");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    review0.setRate((float)(byte)-1);
    java.lang.String str15 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "a7f88f28-d728-4cc0-82b9-46eaad96df5f"+ "'", str15.equals("a7f88f28-d728-4cc0-82b9-46eaad96df5f"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }

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
    restaurant0.updateRating();
    restaurant0.setUserId("bfdf79ec-4de1-4046-a349-5b7be8537764");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "63b8a1d0-ba37-4644-bc96-1920a5036da9"+ "'", str4.equals("63b8a1d0-ba37-4644-bc96-1920a5036da9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d1f1266e-4d4a-468d-ba32-20480b1efe66"+ "'", str12.equals("d1f1266e-4d4a-468d-ba32-20480b1efe66"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    product1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product1.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    boolean b4 = campus1.removeRestaurant("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b6 = campus1.addRestaurant("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    campus1.setId("0527f842-98d0-4df0-a208-e760461137eb");
    boolean b10 = campus1.removeRestaurant("6eadf2cc-8094-4c03-a424-275c022b9ded");
    campus1.setId("b4a7c4bb-fb01-4b40-b048-22c9ffa9235c");
    campus1.setId("35ec99ce-9633-4047-9051-277ff4281ea7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "37f1fde2-56a9-4d5d-9d86-8bfbd6e4ee3e"+ "'", str2.equals("37f1fde2-56a9-4d5d-9d86-8bfbd6e4ee3e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }

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
    java.lang.String str12 = product5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a9752be3-f00e-485e-ba2f-6e7d226fd1e4"+ "'", str11.equals("a9752be3-f00e-485e-ba2f-6e7d226fd1e4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "b31f9bd4-03d4-41b5-895b-3516e314f7a6"+ "'", str12.equals("b31f9bd4-03d4-41b5-895b-3516e314f7a6"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setName("12/03/2017");
    java.util.List<java.lang.String> list_str8 = university1.getAllCampus();
    boolean b10 = university1.removeCampus("f9aed092-86fa-4154-b725-059acdbc7d63");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("2ed02359-67e9-40f6-9d2c-a27d2134914c");
    boolean b14 = studentInfo12.addProductToFavorites("2b4a092c-7fd6-4da1-aad3-c371931860b6");
    boolean b16 = studentInfo12.delProductFromFavorites("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo("a6714532-6f5b-4cf5-822b-96d09fb5ee50");
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    studentInfo12.setFavRestaurants(list_str19);
    university1.setAllCampus(list_str19);
    university1.setId("bcee5d51-04e6-485f-8dc5-c0658b2b5ed2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3b08a5fd-f20f-4686-98ee-474644e88c24"+ "'", str2.equals("3b08a5fd-f20f-4686-98ee-474644e88c24"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3b08a5fd-f20f-4686-98ee-474644e88c24"+ "'", str5.equals("3b08a5fd-f20f-4686-98ee-474644e88c24"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }

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
    java.util.List<java.lang.String> list_str21 = university1.getAllCampus();
    boolean b23 = university1.removeCampus("75ad0d70-7c4a-49fd-801c-d1e75bfd802b");
    boolean b25 = university1.addCampus("6619b3c3-eed2-43e1-9424-a1cdc5fc8d45");
    
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
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    float f5 = product0.getCost();
    java.lang.String str6 = product0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "918afa63-c02a-4b3a-ba5f-012a22fca2ad"+ "'", str6.equals("918afa63-c02a-4b3a-ba5f-012a22fca2ad"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }

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
    java.lang.Float f38 = restaurant3.getRate();
    com.example.unifood.models.Review review44 = new com.example.unifood.models.Review("cde62678-4a38-48f3-8486-51d54fb5e8c8", "53d740cc-3498-48a3-8d69-2631da037847", (float)(short)1, "a3b987c2-9db2-4892-bf67-5beb5e226c6b", "376f29dd-77f2-4b44-8c95-b9ac348c4e6f");
    restaurant3.addReview(review44);
    
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
    org.junit.Assert.assertTrue("'" + f38 + "' != '" + 0.0f+ "'", f38.equals(0.0f));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    userInfo0.setType("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setLastName("510cd119-6c98-4c5e-9e1d-1de9dc7c6078");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }

    com.example.unifood.exceptions.InvalidProductNameException invalidProductNameException0 = new com.example.unifood.exceptions.InvalidProductNameException();
    com.example.unifood.exceptions.InvalidCampusNameException invalidCampusNameException1 = new com.example.unifood.exceptions.InvalidCampusNameException();
    invalidProductNameException0.addSuppressed((java.lang.Throwable)invalidCampusNameException1);
    java.lang.Throwable[] throwable_array3 = invalidProductNameException0.getSuppressed();
    java.lang.String str4 = invalidProductNameException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.example.unifood.exceptions.InvalidProductNameException"+ "'", str4.equals("com.example.unifood.exceptions.InvalidProductNameException"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("93c7f398-2c1a-4d22-be63-bb66ddfccb15", "54656a11-c51d-47a5-843e-2d6615aeb094", 10.0f, "e2c7a34a-8060-4430-9d69-dd5848b101c6");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }

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
    com.example.unifood.models.University university21 = new com.example.unifood.models.University("hi!");
    boolean b23 = university21.removeCampus("hi!");
    java.util.List<java.lang.String> list_str24 = university21.getAllCampus();
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavRestaurants();
    java.util.List<java.lang.String> list_str28 = studentInfo26.getFavRestaurants();
    java.util.List<java.lang.String> list_str29 = studentInfo26.getFavProducts();
    university21.setAllCampus(list_str29);
    studentInfo0.setFavRestaurants(list_str29);
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setName("12/03/2017");
    java.util.List<com.example.unifood.models.Review> list_review6 = null;
    restaurant3.setReviewList(list_review6);
    restaurant3.setName("ea8fa535-2455-44ae-aa0d-929648c3fc46");

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    review0.setComment("");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    review0.setRate((float)(byte)-1);
    review0.setComment("a638a696-e4e7-4e31-8e1c-b540d7c5c80a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    java.lang.String str4 = product3.getDescription();
    java.lang.String str5 = product3.getId();
    product3.setName("7d89a38f-b112-48d5-8b49-584f0021e6a4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str4.equals("2016930c-728d-45c5-a236-9c4833a30246"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4c7bbe5d-d763-428a-b161-9058ec6f42d0"+ "'", str5.equals("4c7bbe5d-d763-428a-b161-9058ec6f42d0"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a636ee8b-7efe-4c5b-bcff-8b9a8d561002");
    campus1.setId("9626d0ba-fe19-4356-a232-426c972c7dfc");

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("3e05f84f-fae9-4094-b787-f1eb3d49517a", (float)'#', "c2778b5e-76ce-4180-a7b4-e001ada65d46");

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }

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
    com.example.unifood.models.Restaurant restaurant15 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product();
    boolean b17 = product16.getAvailability();
    restaurant15.addProduct(product16);
    restaurant15.setShortDescription("");
    java.util.List<com.example.unifood.models.Review> list_review21 = restaurant15.getReviewList();
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
    restaurant15.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review81);
    restaurant3.setReviewList((java.util.List<com.example.unifood.models.Review>)arraylist_review81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "9e68656c-51e3-43df-9adb-3e6e63344350"+ "'", str10.equals("9e68656c-51e3-43df-9adb-3e6e63344350"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f12 + "' != '" + 0.0f+ "'", f12.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "f9c390ae-209d-4da2-96d8-83f59421540b"+ "'", str13.equals("f9c390ae-209d-4da2-96d8-83f59421540b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review21);
    
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
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "8edc8c5e-47dd-40e4-916f-0abe42840567"+ "'", str68.equals("8edc8c5e-47dd-40e4-916f-0abe42840567"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str2 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    boolean b5 = studentInfo3.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b7 = studentInfo3.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus8 = new com.example.unifood.models.Campus();
    boolean b10 = campus8.removeRestaurant("hi!");
    campus8.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str13 = campus8.getRestaurants();
    java.lang.String str14 = campus8.getId();
    java.lang.String str15 = campus8.getName();
    campus8.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str18 = campus8.getRestaurants();
    studentInfo3.setFavRestaurants(list_str18);
    boolean b21 = studentInfo3.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.Campus campus22 = new com.example.unifood.models.Campus();
    boolean b24 = campus22.removeRestaurant("hi!");
    campus22.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str27 = campus22.getRestaurants();
    boolean b29 = campus22.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b31 = campus22.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b33 = campus22.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b35 = campus22.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    campus22.setName("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    java.util.List<java.lang.String> list_str38 = campus22.getRestaurants();
    studentInfo3.setFavRestaurants(list_str38);
    studentInfo0.setFavRestaurants(list_str38);
    boolean b42 = studentInfo0.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "3e401a04-139d-43f2-aae5-9098b75f844d"+ "'", str14.equals("3e401a04-139d-43f2-aae5-9098b75f844d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str15.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }

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
    restaurant0.setShortDescription("f0abce46-2656-46af-99c4-cc4f3ce992d7");
    restaurant0.setId("");
    com.example.unifood.models.Product product50 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f51 = product50.getCost();
    java.lang.String str52 = product50.getId();
    float f53 = product50.getCost();
    boolean b54 = restaurant0.removeProduct(product50);
    restaurant0.updateRating();
    restaurant0.setLocalization("44964587-33aa-49f1-bf28-12b41805b683");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "05329123-3875-45e2-9836-67ba3d620dd4"+ "'", str10.equals("05329123-3875-45e2-9836-67ba3d620dd4"));
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "ce5614f2-8d0b-4472-88a0-c81c93a27f6e"+ "'", str31.equals("ce5614f2-8d0b-4472-88a0-c81c93a27f6e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f51 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "62b46093-9d39-4fcb-b9ac-ce4509b4f4c2"+ "'", str52.equals("62b46093-9d39-4fcb-b9ac-ce4509b4f4c2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f53 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }

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
    review4.setComment("0bd81591-b267-4768-a522-a230bd539804");
    
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
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    boolean b3 = university1.removeCampus("hi!");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("hi!");
    java.lang.String str6 = university5.getId();
    boolean b8 = university5.addCampus("hi!");
    java.lang.String str9 = university5.getId();
    university5.setName("12/03/2017");
    java.util.List<java.lang.String> list_str12 = university5.getAllCampus();
    university1.setAllCampus(list_str12);
    boolean b15 = university1.addCampus("82c6ce4c-1ae9-44e3-b51a-eb720b3cd059");
    boolean b17 = university1.addCampus("37f2649c-53a4-441b-9402-2eaa34724773");
    com.example.unifood.models.University university19 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus20 = new com.example.unifood.models.Campus();
    boolean b22 = campus20.removeRestaurant("hi!");
    campus20.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str25 = campus20.getRestaurants();
    university19.setAllCampus(list_str25);
    university19.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    university19.setName("b676177c-e64a-41a0-8888-7f2dd89e8060");
    boolean b32 = university19.addCampus("d2c231e2-7a36-4c3e-85a5-77d4735a3460");
    java.util.List<java.lang.String> list_str33 = university19.getAllCampus();
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    studentInfo34.setCampusId("");
    studentInfo34.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo34.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b42 = studentInfo34.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    com.example.unifood.models.Campus campus43 = new com.example.unifood.models.Campus();
    boolean b45 = campus43.removeRestaurant("hi!");
    java.lang.String[] str_array70 = new java.lang.String[] { "2adc96c3-f320-42fb-97f3-c22c606913fb", "hi!", "811f8a1d-ca60-461d-828c-6680d7547043", "2016930c-728d-45c5-a236-9c4833a30246", "ec1c7744-8529-4314-837e-cb723075bf0b", "3c11ad74-3d0c-460b-a7f3-db24d1b7225f", "1cb9f2a2-c73f-4ca9-8246-d2f6813971eb", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "3db35cfa-ac0a-4288-9084-8d042e570026", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "ec1c7744-8529-4314-837e-cb723075bf0b", "edf01dd6-a35a-426f-808e-d6346b5af74f", "com.example.unifood.exceptions.InvalidRestaurantIdException", "", "239d950c-a53b-45db-9e8f-483a040e426a", "a7f88f28-d728-4cc0-82b9-46eaad96df5f", "811f8a1d-ca60-461d-828c-6680d7547043", "a9a6d832-db46-43f7-8078-9b0af2950add", "811f8a1d-ca60-461d-828c-6680d7547043", "3cf41e8a-0978-423d-8b1d-d36337a6148a", "hi!", "67a826d0-ad9d-49db-8997-58baff1011a9" };
    java.util.ArrayList<java.lang.String> arraylist_str71 = new java.util.ArrayList<java.lang.String>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str71, str_array70);
    campus43.setRestaurants((java.util.List<java.lang.String>)arraylist_str71);
    studentInfo34.setFavProducts((java.util.List<java.lang.String>)arraylist_str71);
    java.util.List<java.lang.String> list_str75 = studentInfo34.getFavRestaurants();
    university19.setAllCampus(list_str75);
    university1.setAllCampus(list_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "89dd4082-0f36-4c45-a353-582876436084"+ "'", str6.equals("89dd4082-0f36-4c45-a353-582876436084"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "89dd4082-0f36-4c45-a353-582876436084"+ "'", str9.equals("89dd4082-0f36-4c45-a353-582876436084"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str75);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("67a826d0-ad9d-49db-8997-58baff1011a9");
    product7.setAvailability(false);
    product7.setName("6570c66e-106a-45b5-b21b-6957af6be4db");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setUserId("hi!");
    restaurant0.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product9 = restaurant0.getProductList();
    java.lang.String str10 = restaurant0.getUserId();
    restaurant0.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3f1f2c41-cbe8-4647-a5f0-123f0f1af573"+ "'", str8.equals("3f1f2c41-cbe8-4647-a5f0-123f0f1af573"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("adb74c6f-c839-47cc-b096-1c12240d6afd");
    com.example.unifood.models.Review review7 = new com.example.unifood.models.Review();
    java.lang.String str8 = review7.getId();
    boolean b9 = restaurant0.removeReview(review7);
    review7.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review7.setComment("091cf376-935e-49c0-af6a-d46db170a341");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1e2fb4d7-1ac5-4e80-9786-c97993c1ea3f"+ "'", str8.equals("1e2fb4d7-1ac5-4e80-9786-c97993c1ea3f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("c1d3b8a3-adce-431f-a302-6cd30c1e553d");
    ownerInfo1.setRestaurantId("70ae50b9-4b12-46fb-a47f-f2d811ef8a9f");
    ownerInfo1.setRestaurantId("341d3ffd-3e04-42a0-b813-1a54ca379c9b");

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    product0.setDescription("78df657c-5d1a-4a93-909c-f2adb2f9dacd");
    product0.setId("9e07b376-c51f-4d86-97b2-e0560ef5c7b1");
    product0.setName("3d6129ca-9f03-41cb-8b98-fd6607aa77fb");

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    java.util.List<java.lang.String> list_str3 = university1.getAllCampus();
    boolean b5 = university1.addCampus("53d5e04e-abb5-45a7-a278-d742367421a0");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    boolean b8 = university1.addCampus("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    boolean b10 = university1.removeCampus("1d71bbd8-2b37-44e4-9aa1-ec2bd659c7ec");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9fd2d21c-ece0-4d11-94fe-87666cb7471d"+ "'", str2.equals("9fd2d21c-ece0-4d11-94fe-87666cb7471d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b11 = campus0.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.lang.String str12 = campus0.getName();
    boolean b14 = campus0.addRestaurant("2016930c-728d-45c5-a236-9c4833a30246");
    boolean b16 = campus0.removeRestaurant("ef48fd18-53cd-4aba-8c06-b55c4a203e2b");
    boolean b18 = campus0.addRestaurant("959115ea-d0ba-4dd1-b689-49af96cc1da9");
    
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
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("a119a696-228e-421c-8a30-41c04e6e52ea", "239d950c-a53b-45db-9e8f-483a040e426a", (float)(byte)-1, "5cad58f0-a042-4e13-90be-466b381fa540");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }

    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5", "16c89e8f-dcdc-4632-8a9b-1653843567f5", (float)(short)1, "76fe9853-ea57-4556-ac71-95373a19a23f");
    review4.setRestaurantId("");
    java.lang.String str7 = review4.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5"+ "'", str7.equals("cf7b6202-aa0c-420a-9a1e-b52ba0bb03d5"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }

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
    java.lang.String str20 = university1.getId();
    java.lang.String str21 = university1.getName();
    university1.setName("42ff3df8-22e9-4277-9924-c3723c127d45");
    java.lang.String str24 = university1.getId();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str20.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "9cef684b-9583-4350-bc7f-52fdf83f721b"+ "'", str24.equals("9cef684b-9583-4350-bc7f-52fdf83f721b"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }

    com.example.unifood.exceptions.OwnerException ownerException0 = new com.example.unifood.exceptions.OwnerException();
    com.example.unifood.exceptions.InvalidRateException invalidRateException1 = new com.example.unifood.exceptions.InvalidRateException();
    ownerException0.addSuppressed((java.lang.Throwable)invalidRateException1);
    java.lang.Throwable[] throwable_array3 = invalidRateException1.getSuppressed();
    java.lang.Throwable[] throwable_array4 = invalidRateException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("b428c35b-75d1-4f5e-9ca0-14efacffcbbe");

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    review0.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review0.setRestaurantId("f695ed82-229b-4109-958e-25c92fc7e7c5");
    review0.setUserId("3cf41e8a-0978-423d-8b1d-d36337a6148a");
    review0.setUserId("dd7e0765-28dc-4e73-be8a-380d07088c0c");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("a119a696-228e-421c-8a30-41c04e6e52ea");
    university1.setName("16a2514e-5bf2-47bb-8361-bc2ac43faa96");
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("979b1930-46c4-4b6e-b9e8-0d568cf89fb1");
    java.util.List<java.lang.String> list_str6 = studentInfo5.getFavProducts();
    university1.setAllCampus(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }

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
    java.lang.Throwable[] throwable_array10 = invalidCampusNameException0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str6.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.example.unifood.exceptions.OwnerException"+ "'", str7.equals("com.example.unifood.exceptions.OwnerException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    restaurant3.setId("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    com.example.unifood.models.University university8 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.lang.String str9 = university8.getName();
    boolean b10 = restaurant3.equals((java.lang.Object)str9);
    restaurant3.setUserId("");
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review();
    review13.setId("");
    java.lang.String str16 = review13.getUserId();
    review13.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review13.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str21 = review13.getUserId();
    java.lang.String str22 = review13.getUserId();
    review13.setComment("7b379d86-fcc6-43c8-a85d-c887cc492e73");
    restaurant3.addReview(review13);
    java.lang.String str26 = review13.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str9.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("com.example.unifood.exceptions.InvalidProductCostException", "7b6e8a55-90b1-46ae-96b4-ba3adce3ad0f", "89dce4df-4897-4a26-b1e4-37cadc19fe5d");

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("c9d6a762-f278-4cb8-8e56-074a75ae617f");

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("26b95b52-df3b-4a04-beff-6a8c4f2e7ee4");
    boolean b3 = university1.addCampus("f896595d-285f-448c-9d6c-2c86b7422847");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Product product5 = new com.example.unifood.models.Product();
    product5.setDescription("hi!");
    boolean b8 = restaurant0.removeProduct(product5);
    restaurant0.setShortDescription("b72529dd-7daf-4e1d-a72b-c97d5d8a6ac4");
    restaurant0.setLocalization("65efe1a9-f2a7-4e15-bec1-3957bcfef68f");
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    boolean b14 = product13.getAvailability();
    product13.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product13.setCost((float)(byte)1);
    boolean b19 = restaurant0.removeProduct(product13);
    boolean b20 = restaurant0.getApproved();
    restaurant0.setUserId("74237342-5cf5-495c-86de-c1bc12d8c326");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }

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
    java.lang.String str20 = campus1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "fac38639-0887-4f75-9179-fdad7fe2aec7"+ "'", str2.equals("fac38639-0887-4f75-9179-fdad7fe2aec7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "fac38639-0887-4f75-9179-fdad7fe2aec7"+ "'", str16.equals("fac38639-0887-4f75-9179-fdad7fe2aec7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "a04223f0-b1c0-449c-afab-59a81cef4343"+ "'", str20.equals("a04223f0-b1c0-449c-afab-59a81cef4343"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    java.lang.String str7 = restaurant3.getCampusId();
    restaurant3.setUserId("8e6dda6d-66e5-4521-8634-e164e3b1c34c");
    java.lang.String str10 = restaurant3.getId();
    restaurant3.setApproved(true);
    com.example.unifood.models.Product product13 = new com.example.unifood.models.Product();
    product13.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    product13.setId("19c7d5e9-6bde-438f-aa67-83a5a8eeebdc");
    restaurant3.addProduct(product13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "44197292-96f7-4284-88b9-cc871fc84e27"+ "'", str5.equals("44197292-96f7-4284-88b9-cc871fc84e27"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ea40948a-8b8d-46fe-a89c-414de9b8c3e0"+ "'", str7.equals("ea40948a-8b8d-46fe-a89c-414de9b8c3e0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "44197292-96f7-4284-88b9-cc871fc84e27"+ "'", str10.equals("44197292-96f7-4284-88b9-cc871fc84e27"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    studentInfo0.setCampusId("7ef0cf59-e144-416a-a062-c1d947e146d2");
    java.lang.String str6 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "7ef0cf59-e144-416a-a062-c1d947e146d2"+ "'", str6.equals("7ef0cf59-e144-416a-a062-c1d947e146d2"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Review review4 = new com.example.unifood.models.Review("e2c5ed7e-a496-403a-97bc-9f24b0b99400", "0d5c1ebe-0616-4333-81c2-15b02bdb0edd", (float)100, "e9a233a8-3d31-4601-a1f9-5c2c941c9dc5");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRateException");
    } catch (com.example.unifood.exceptions.InvalidRateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    java.lang.String str1 = review0.getDate();
    review0.setRate((float)0);
    review0.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review0.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    review0.setDate("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    java.lang.String str10 = review0.getId();
    java.lang.String str11 = review0.getDate();
    review0.setDate("13f98119-ba54-4465-bf81-4bb02912af47");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "7fb4b671-eeeb-4d73-8c40-91baed7167c3"+ "'", str10.equals("7fb4b671-eeeb-4d73-8c40-91baed7167c3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "7f818b3b-685e-4e69-b63b-ce4aa57b16f0"+ "'", str11.equals("7f818b3b-685e-4e69-b63b-ce4aa57b16f0"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant0.setProductList(list_product14);
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    restaurant17.setShortDescription("");
    java.lang.String str23 = restaurant17.getLocalization();
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant();
    java.lang.String str25 = restaurant24.getUserId();
    java.lang.String str26 = restaurant24.getLocalization();
    restaurant24.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product29 = new com.example.unifood.models.Product();
    boolean b30 = product29.getAvailability();
    product29.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product29.setAvailability(true);
    product29.setCost((float)(byte)10);
    restaurant24.addProduct(product29);
    java.lang.String str38 = product29.getDescription();
    java.lang.String str39 = product29.getId();
    restaurant17.addProduct(product29);
    restaurant0.addProduct(product29);
    com.example.unifood.models.Restaurant restaurant42 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product43 = new com.example.unifood.models.Product();
    boolean b44 = product43.getAvailability();
    restaurant42.addProduct(product43);
    java.util.List<com.example.unifood.models.Product> list_product46 = restaurant42.getProductList();
    restaurant42.setUserId("hi!");
    restaurant42.setName("12/03/2017");
    java.lang.String str51 = restaurant42.getCampusId();
    java.lang.Float f52 = restaurant42.getRate();
    com.example.unifood.models.Restaurant restaurant53 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product54 = new com.example.unifood.models.Product();
    boolean b55 = product54.getAvailability();
    restaurant53.addProduct(product54);
    java.util.List<com.example.unifood.models.Product> list_product57 = restaurant53.getProductList();
    restaurant53.setUserId("hi!");
    restaurant53.setName("12/03/2017");
    java.lang.String str62 = restaurant53.getCampusId();
    java.lang.String str63 = restaurant53.getUserId();
    com.example.unifood.models.Product product67 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f68 = product67.getCost();
    java.lang.String str69 = product67.getDescription();
    restaurant53.addProduct(product67);
    boolean b71 = restaurant42.removeProduct(product67);
    restaurant0.addProduct(product67);
    product67.setName("0b671c11-3de0-49a2-9ab6-83c364a53d1a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str38.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "2202e4e9-cb02-42ef-8e2d-caed9f645256"+ "'", str39.equals("2202e4e9-cb02-42ef-8e2d-caed9f645256"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f52 + "' != '" + 0.0f+ "'", f52.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!"+ "'", str63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f68 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "12/03/2017"+ "'", str69.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }

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
    restaurant3.setCampusId("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    restaurant3.setName("e543d0dd-7b59-46bf-a7c0-c7ef44c0b746");
    java.lang.String str71 = restaurant3.getId();
    com.example.unifood.models.Review review72 = new com.example.unifood.models.Review();
    review72.setId("");
    java.lang.String str75 = review72.getUserId();
    review72.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f78 = review72.getRate();
    java.lang.String str79 = review72.getComment();
    java.lang.String str80 = review72.getDate();
    boolean b81 = restaurant3.removeReview(review72);
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "b44c282b-4a40-48f7-8d0d-51e099a8e2cf"+ "'", str46.equals("b44c282b-4a40-48f7-8d0d-51e099a8e2cf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "f66e2559-c7f0-4b76-b5e5-3ba85f13bec8"+ "'", str71.equals("f66e2559-c7f0-4b76-b5e5-3ba85f13bec8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f78 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str79.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }

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
    java.util.List<java.lang.String> list_str33 = studentInfo0.getFavProducts();
    
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
    org.junit.Assert.assertNotNull(list_str33);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    restaurant3.setShortDescription("e0ed697c-d17d-4982-81ea-097a494113d9");
    com.example.unifood.models.Product product16 = new com.example.unifood.models.Product("10649ddd-831c-4a5d-b54e-db55a76d1419", (float)(byte)10, "2016930c-728d-45c5-a236-9c4833a30246");
    restaurant3.addProduct(product16);
    restaurant3.setShortDescription("5b2281a2-71ff-46d0-b204-2c60fc6aea17");
    boolean b20 = restaurant3.getApproved();
    com.example.unifood.models.Review review21 = new com.example.unifood.models.Review();
    review21.setId("");
    java.lang.String str24 = review21.getUserId();
    review21.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str27 = review21.getDate();
    review21.setDate("2016930c-728d-45c5-a236-9c4833a30246");
    review21.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.lang.String str32 = review21.getRestaurantId();
    java.lang.String str33 = review21.getComment();
    java.lang.String str34 = review21.getDate();
    review21.setRestaurantId("");
    boolean b37 = restaurant3.removeReview(review21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "a7f88f28-d728-4cc0-82b9-46eaad96df5f"+ "'", str33.equals("a7f88f28-d728-4cc0-82b9-46eaad96df5f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str34.equals("2016930c-728d-45c5-a236-9c4833a30246"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    com.example.unifood.models.Restaurant restaurant8 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str9 = restaurant8.getShortDescription();
    java.lang.Float f10 = restaurant8.getRate();
    restaurant8.setUserId("5f549e06-72c7-4c21-9698-5857aa4f3922");
    java.lang.Float f13 = restaurant8.getRate();
    restaurant8.setRate((java.lang.Float)(-1.0f));
    restaurant0.update(restaurant8);
    boolean b17 = restaurant0.getApproved();
    com.example.unifood.models.Restaurant restaurant21 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant21.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str24 = restaurant21.getShortDescription();
    boolean b26 = restaurant21.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    java.util.List<com.example.unifood.models.Product> list_product27 = restaurant21.getProductList();
    restaurant0.setProductList(list_product27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f10 + "' != '" + 0.0f+ "'", f10.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f13 + "' != '" + 0.0f+ "'", f13.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product27);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str2 = campus1.getId();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    studentInfo3.setCampusId("");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    studentInfo3.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    campus1.setRestaurants((java.util.List<java.lang.String>)arraylist_str12);
    java.util.List<java.lang.String> list_str16 = campus1.getRestaurants();
    boolean b18 = campus1.removeRestaurant("7b6e8a55-90b1-46ae-96b4-ba3adce3ad0f");
    campus1.setId("27ac6ae0-25d7-427d-9bff-93fd18b81339");
    campus1.setId("eca1f4fe-b307-4be9-8cf3-180c48bcbfd0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "43898f61-590a-4561-b910-527e6e776e58"+ "'", str2.equals("43898f61-590a-4561-b910-527e6e776e58"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setName("12/03/2017");
    java.util.List<java.lang.String> list_str8 = university1.getAllCampus();
    university1.setName("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    boolean b12 = university1.removeCampus("e19a86e7-efdf-499f-a579-c809abeb50ba");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "58e89585-c2a1-4907-9719-c2061e46309a"+ "'", str2.equals("58e89585-c2a1-4907-9719-c2061e46309a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "58e89585-c2a1-4907-9719-c2061e46309a"+ "'", str5.equals("58e89585-c2a1-4907-9719-c2061e46309a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }

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
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    studentInfo26.setCampusId("");
    studentInfo26.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo26.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b34 = studentInfo26.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str35 = studentInfo26.getCampusId();
    boolean b37 = studentInfo26.delRestaurantFromFavorites("e0ed697c-d17d-4982-81ea-097a494113d9");
    boolean b39 = studentInfo26.delProductFromFavorites("9626d0ba-fe19-4356-a232-426c972c7dfc");
    java.util.List<java.lang.String> list_str40 = studentInfo26.getFavRestaurants();
    com.example.unifood.models.Campus campus42 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str43 = campus42.getId();
    com.example.unifood.models.StudentInfo studentInfo44 = new com.example.unifood.models.StudentInfo();
    studentInfo44.setCampusId("");
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<java.lang.String>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str53, str_array52);
    studentInfo44.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str53);
    campus42.setRestaurants((java.util.List<java.lang.String>)arraylist_str53);
    java.util.List<java.lang.String> list_str57 = campus42.getRestaurants();
    studentInfo26.setFavProducts(list_str57);
    campus0.setRestaurants(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "40f4b7d6-2a9e-4fe5-89af-3d290ae6723e"+ "'", str25.equals("40f4b7d6-2a9e-4fe5-89af-3d290ae6723e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str35.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "7861cbcb-937c-441a-998e-21a5c599831f"+ "'", str43.equals("7861cbcb-937c-441a-998e-21a5c599831f"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    java.lang.String str6 = restaurant0.getId();
    restaurant0.setId("0301c89e-b197-4a39-87f4-98b79ff78d62");
    com.example.unifood.models.Product product9 = new com.example.unifood.models.Product();
    product9.setDescription("hi!");
    java.lang.String str12 = product9.getDescription();
    product9.setId("322c0567-95f6-47cd-bed2-9cdd49776e37");
    float f15 = product9.getCost();
    product9.setCost((float)1);
    boolean b18 = product9.getAvailability();
    boolean b19 = restaurant0.removeProduct(product9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5889b72c-3506-4726-98d2-5ba1442c8fd5"+ "'", str6.equals("5889b72c-3506-4726-98d2-5ba1442c8fd5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("9741db0d-f106-4ae0-9562-dbd17d50d5a3");
    com.example.unifood.models.University university3 = new com.example.unifood.models.University("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    com.example.unifood.models.University university5 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    university5.setName("a18aa9c7-97b2-4788-a07b-c1019504e336");
    com.example.unifood.models.Campus campus8 = new com.example.unifood.models.Campus();
    boolean b10 = campus8.removeRestaurant("hi!");
    campus8.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str13 = campus8.getRestaurants();
    boolean b15 = campus8.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b17 = campus8.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b19 = campus8.removeRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b21 = campus8.removeRestaurant("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str22 = campus8.getId();
    campus8.setName("c540a787-8e6d-4ecb-95ca-f1d4551fcd80");
    java.util.List<java.lang.String> list_str25 = campus8.getRestaurants();
    university5.setAllCampus(list_str25);
    university3.setAllCampus(list_str25);
    studentInfo1.setFavProducts(list_str25);
    
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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "af84f1db-8959-4f84-ab90-d71caae8899d"+ "'", str22.equals("af84f1db-8959-4f84-ab90-d71caae8899d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }

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
    restaurant0.setName("ec1c7744-8529-4314-837e-cb723075bf0b");
    restaurant0.setLocalization("c8d2cbb3-feff-49f3-a966-a85c3fcdcf7b");
    com.example.unifood.models.Restaurant restaurant22 = new com.example.unifood.models.Restaurant();
    java.lang.String str23 = restaurant22.getUserId();
    restaurant22.setCampusId("a9a6d832-db46-43f7-8078-9b0af2950add");
    restaurant22.updateRating();
    restaurant22.setShortDescription("53d740cc-3498-48a3-8d69-2631da037847");
    java.util.List<com.example.unifood.models.Review> list_review29 = null;
    restaurant22.setReviewList(list_review29);
    restaurant22.setRate((java.lang.Float)(-1.0f));
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    java.lang.String str37 = restaurant33.getId();
    restaurant33.setLocalization("a3b987c2-9db2-4892-bf67-5beb5e226c6b");
    restaurant33.setApproved(true);
    restaurant33.setUserId("f6d9bc14-7c02-48e0-a8ce-40d38a0b62d8");
    java.util.List<com.example.unifood.models.Review> list_review44 = restaurant33.getReviewList();
    restaurant22.setReviewList(list_review44);
    restaurant0.setReviewList(list_review44);
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4307455b-74ea-49bc-83ad-9a81f2e1daba"+ "'", str16.equals("4307455b-74ea-49bc-83ad-9a81f2e1daba"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "750a9e07-d685-4b46-afe5-d9ba7e934bb8"+ "'", str37.equals("750a9e07-d685-4b46-afe5-d9ba7e934bb8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review44);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    review0.setComment("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.lang.String str8 = review0.getRestaurantId();
    review0.setComment("add01af6-9901-43d3-950c-81f3702a5d12");
    java.lang.String str11 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }

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
    product12.setName("dfc0fb6f-d89d-4d55-b92b-27293bd4ed8c");
    
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

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getType();
    userInfo0.setFirstName("ced6e91b-9cd9-49c4-91b3-b718083b5bff");
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setLastName("719dd8bf-eadc-4a32-9e5c-744bb8444993");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ced6e91b-9cd9-49c4-91b3-b718083b5bff"+ "'", str5.equals("ced6e91b-9cd9-49c4-91b3-b718083b5bff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setAvailability(false);
    product3.setId("42ff3df8-22e9-4277-9924-c3723c127d45");
    product3.setId("429114d9-61a0-4f78-988a-207ce1bf7c5d");
    java.lang.String str11 = product3.getDescription();
    float f12 = product3.getCost();
    product3.setAvailability(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "12/03/2017"+ "'", str11.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 10.0f);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("979b1930-46c4-4b6e-b9e8-0d568cf89fb1", 0.0f, "9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    boolean b4 = product3.getAvailability();
    java.lang.String str5 = product3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "adaab8d3-ccb7-4567-8799-a66ceb5151d5"+ "'", str5.equals("adaab8d3-ccb7-4567-8799-a66ceb5151d5"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str4 = restaurant3.getCampusId();
    java.lang.String str5 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "90afc816-9759-4b54-86ff-a1b7beb18772"+ "'", str4.equals("90afc816-9759-4b54-86ff-a1b7beb18772"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32bef74e-15d2-4f2b-849c-199055557d88"+ "'", str5.equals("32bef74e-15d2-4f2b-849c-199055557d88"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }

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
    java.lang.String str21 = campus0.getName();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0cc6eb81-fac9-4491-85d6-6c2646e9e31b"+ "'", str20.equals("0cc6eb81-fac9-4491-85d6-6c2646e9e31b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "c9107d05-b646-4bac-bf92-00cdcc3f6c6a"+ "'", str21.equals("c9107d05-b646-4bac-bf92-00cdcc3f6c6a"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }

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
    java.lang.String str14 = product10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "88f9fbb2-e6ce-4f27-8f3a-5e0b12dd6edf"+ "'", str4.equals("88f9fbb2-e6ce-4f27-8f3a-5e0b12dd6edf"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "59d1562c-07fa-46e4-8663-2d30a3385104"+ "'", str12.equals("59d1562c-07fa-46e4-8663-2d30a3385104"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str14.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }

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
    float f16 = review7.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "83804b38-123f-46eb-a0de-7d25264a4b2c"+ "'", str8.equals("83804b38-123f-46eb-a0de-7d25264a4b2c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83804b38-123f-46eb-a0de-7d25264a4b2c"+ "'", str15.equals("83804b38-123f-46eb-a0de-7d25264a4b2c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f16 == 0.0f);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    java.lang.String str5 = restaurant0.getId();
    java.lang.String str6 = restaurant0.getName();
    boolean b7 = restaurant0.getApproved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "e30dc486-3099-4505-b3b4-6f04f91c5294"+ "'", str5.equals("e30dc486-3099-4505-b3b4-6f04f91c5294"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "bfdf79ec-4de1-4046-a349-5b7be8537764", "55c3dc76-1c53-42c8-8417-e008f8923ff9");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidFirstNameException");
    } catch (com.example.unifood.exceptions.InvalidFirstNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    java.lang.String str3 = review0.getId();
    float f4 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ba29e631-dfc1-4473-8769-c1987b4d89cb"+ "'", str3.equals("ba29e631-dfc1-4473-8769-c1987b4d89cb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }

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
    com.example.unifood.models.Review review62 = new com.example.unifood.models.Review();
    java.lang.String str63 = review62.getDate();
    review62.setRate((float)0);
    review62.setId("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    review62.setComment("e0f8a500-e09c-4384-9aa4-ffe5dbcc066f");
    review62.setDate("7f818b3b-685e-4e69-b63b-ce4aa57b16f0");
    boolean b72 = restaurant3.removeReview(review62);
    
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "a1e6a8f1-e07e-4297-aded-3647d613f7f2"+ "'", str46.equals("a1e6a8f1-e07e-4297-aded-3647d613f7f2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("435ac483-0bc9-41d2-b04d-3c696a180a7c", "53d5e04e-abb5-45a7-a278-d742367421a0", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getFirstName();
    userInfo3.setFirstName("3c85f1c8-a827-42e7-b07b-cfc0ca4d2dd9");
    userInfo3.setLastName("239d950c-a53b-45db-9e8f-483a040e426a");
    java.lang.String str9 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str4.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str9.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("");
    boolean b3 = university1.addCampus("2ca23794-72a3-4cca-8687-a1b0e6c8a5c2");
    university1.setId("58f62521-916b-4794-9575-f2e814108adf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    studentInfo0.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo0.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b8 = studentInfo0.addProductToFavorites("a9a6d832-db46-43f7-8078-9b0af2950add");
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.delRestaurantFromFavorites("e0ed697c-d17d-4982-81ea-097a494113d9");
    boolean b13 = studentInfo0.delProductFromFavorites("9626d0ba-fe19-4356-a232-426c972c7dfc");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    studentInfo14.setCampusId("");
    java.util.List<java.lang.String> list_str17 = studentInfo14.getFavRestaurants();
    java.util.List<java.lang.String> list_str18 = studentInfo14.getFavProducts();
    com.example.unifood.models.University university20 = new com.example.unifood.models.University("hi!");
    boolean b22 = university20.removeCampus("hi!");
    university20.setId("9cef684b-9583-4350-bc7f-52fdf83f721b");
    java.lang.String str25 = university20.getName();
    boolean b27 = university20.removeCampus("cde62678-4a38-48f3-8486-51d54fb5e8c8");
    com.example.unifood.models.University university29 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus30 = new com.example.unifood.models.Campus();
    boolean b32 = campus30.removeRestaurant("hi!");
    campus30.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str35 = campus30.getRestaurants();
    university29.setAllCampus(list_str35);
    java.util.List<java.lang.String> list_str37 = university29.getAllCampus();
    university20.setAllCampus(list_str37);
    studentInfo14.setFavProducts(list_str37);
    studentInfo0.setFavProducts(list_str37);
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo();
    studentInfo41.setCampusId("");
    java.util.List<java.lang.String> list_str44 = studentInfo41.getFavRestaurants();
    java.util.List<java.lang.String> list_str45 = studentInfo41.getFavProducts();
    com.example.unifood.models.University university47 = new com.example.unifood.models.University("hi!");
    boolean b49 = university47.removeCampus("hi!");
    java.lang.String str50 = university47.getId();
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b54 = studentInfo52.delRestaurantFromFavorites("00c21b13-bd60-4d6c-95c6-aa73a51a7075");
    java.util.List<java.lang.String> list_str55 = studentInfo52.getFavRestaurants();
    university47.setAllCampus(list_str55);
    studentInfo41.setFavProducts(list_str55);
    studentInfo0.setFavProducts(list_str55);
    com.example.unifood.models.Campus campus59 = new com.example.unifood.models.Campus();
    boolean b61 = campus59.removeRestaurant("hi!");
    campus59.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str64 = campus59.getRestaurants();
    java.lang.String str65 = campus59.getId();
    java.lang.String str66 = campus59.getName();
    com.example.unifood.models.StudentInfo studentInfo67 = new com.example.unifood.models.StudentInfo();
    studentInfo67.setCampusId("");
    java.util.List<java.lang.String> list_str70 = studentInfo67.getFavRestaurants();
    campus59.setRestaurants(list_str70);
    boolean b73 = campus59.addRestaurant("f4c5b8c3-3c11-4032-a3a2-60f2be579cd0");
    boolean b75 = campus59.addRestaurant("7a653f47-c1df-45ff-ae1f-b877ee03e2fc");
    com.example.unifood.models.StudentInfo studentInfo76 = new com.example.unifood.models.StudentInfo();
    boolean b78 = studentInfo76.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b80 = studentInfo76.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b82 = studentInfo76.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b84 = studentInfo76.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    studentInfo76.setCampusId("6c2f90b1-d9b0-400d-8b43-0893724d6fd6");
    boolean b88 = studentInfo76.delProductFromFavorites("e8e3014e-33aa-43e7-bb64-b61e035fc513");
    com.example.unifood.models.StudentInfo studentInfo89 = new com.example.unifood.models.StudentInfo();
    boolean b91 = studentInfo89.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b93 = studentInfo89.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    studentInfo89.setCampusId("2016930c-728d-45c5-a236-9c4833a30246");
    java.util.List<java.lang.String> list_str96 = studentInfo89.getFavProducts();
    studentInfo76.setFavProducts(list_str96);
    campus59.setRestaurants(list_str96);
    studentInfo0.setFavProducts(list_str96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str9.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "d308f4d9-d3c5-4e74-aea6-2790f37f5faa"+ "'", str50.equals("d308f4d9-d3c5-4e74-aea6-2790f37f5faa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "f3e6db98-a3c3-4528-b660-d8b0adca1461"+ "'", str65.equals("f3e6db98-a3c3-4528-b660-d8b0adca1461"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str66.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str96);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    boolean b7 = university1.addCampus("10649ddd-831c-4a5d-b54e-db55a76d1419");
    java.lang.String str8 = university1.getId();
    com.example.unifood.models.Campus campus9 = new com.example.unifood.models.Campus();
    boolean b11 = campus9.removeRestaurant("hi!");
    campus9.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str14 = campus9.getRestaurants();
    java.lang.String str15 = campus9.getId();
    java.lang.String str16 = campus9.getName();
    java.lang.String str17 = campus9.getId();
    java.lang.String str18 = campus9.getId();
    campus9.setId("");
    boolean b22 = campus9.addRestaurant("fcf4a53c-cc22-423a-bfaf-dea98ceedcea");
    com.example.unifood.models.University university24 = new com.example.unifood.models.University("119f287e-61c5-497a-b55c-17489bcb03e9");
    java.util.List<java.lang.String> list_str25 = university24.getAllCampus();
    campus9.setRestaurants(list_str25);
    university1.setAllCampus(list_str25);
    university1.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8c3f5396-2de7-42e9-8851-3e70cf17f1a0"+ "'", str2.equals("8c3f5396-2de7-42e9-8851-3e70cf17f1a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8c3f5396-2de7-42e9-8851-3e70cf17f1a0"+ "'", str5.equals("8c3f5396-2de7-42e9-8851-3e70cf17f1a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "8c3f5396-2de7-42e9-8851-3e70cf17f1a0"+ "'", str8.equals("8c3f5396-2de7-42e9-8851-3e70cf17f1a0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "b9ceecb9-3fa2-4f66-901b-93e5b1a080dc"+ "'", str15.equals("b9ceecb9-3fa2-4f66-901b-93e5b1a080dc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str16.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "b9ceecb9-3fa2-4f66-901b-93e5b1a080dc"+ "'", str17.equals("b9ceecb9-3fa2-4f66-901b-93e5b1a080dc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "b9ceecb9-3fa2-4f66-901b-93e5b1a080dc"+ "'", str18.equals("b9ceecb9-3fa2-4f66-901b-93e5b1a080dc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant3.setName("efbb39b8-b569-44a5-8350-5d34ec9574db");
    java.lang.String str6 = restaurant3.getUserId();
    java.util.List<com.example.unifood.models.Product> list_product7 = restaurant3.getProductList();
    restaurant3.updateRating();
    restaurant3.setRate((java.lang.Float)0.0f);
    restaurant3.setId("facd64d2-4410-40b8-818b-75353262244b");
    restaurant3.setId("52d95481-1e46-40d0-acca-334901b04410");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product7);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }

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
    java.lang.String str29 = review17.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ee140fd0-acb6-432e-9438-c82ab47282cf"+ "'", str10.equals("ee140fd0-acb6-432e-9438-c82ab47282cf"));
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "adb74c6f-c839-47cc-b096-1c12240d6afd"+ "'", str29.equals("adb74c6f-c839-47cc-b096-1c12240d6afd"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setRestaurantId("1d2417d5-5118-4cf4-b0d6-d0be3e827f3e");
    review0.setUserId("6f50f37a-6c53-4a1c-aa71-362094a47134");
    java.lang.String str7 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "6f50f37a-6c53-4a1c-aa71-362094a47134"+ "'", str7.equals("6f50f37a-6c53-4a1c-aa71-362094a47134"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }

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
    restaurant0.setId("54953943-7fd3-44f0-927c-a4d494402514");
    restaurant0.updateRating();
    
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

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product0.setCost((float)(byte)1);
    java.lang.String str6 = product0.getDescription();
    product0.setDescription("b80d0c79-546e-4f90-8fb2-cf05b7896bcc");
    float f9 = product0.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str6.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 1.0f);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }

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
    review8.setComment("52d95481-1e46-40d0-acca-334901b04410");
    java.lang.String str16 = review8.getRestaurantId();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "20f6f3cb-cf9e-4bd1-a460-28afd87361d9"+ "'", str12.equals("20f6f3cb-cf9e-4bd1-a460-28afd87361d9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("8ef2eb1c-6eaa-459e-96ae-f92134f1053c", "6c691cd5-5652-40d6-b412-9f07ad54ccc2", "15149c67-efc5-4744-85b0-8dc2ac121df7");
    restaurant3.updateRating();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Restaurant restaurant6 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    boolean b8 = product7.getAvailability();
    restaurant6.addProduct(product7);
    java.util.List<com.example.unifood.models.Product> list_product10 = restaurant6.getProductList();
    restaurant6.setUserId("hi!");
    restaurant6.setName("12/03/2017");
    com.example.unifood.models.Review review15 = new com.example.unifood.models.Review();
    java.lang.String str16 = review15.getId();
    boolean b17 = restaurant6.removeReview(review15);
    com.example.unifood.models.Restaurant restaurant18 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product19 = new com.example.unifood.models.Product();
    boolean b20 = product19.getAvailability();
    restaurant18.addProduct(product19);
    product19.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b24 = restaurant6.removeProduct(product19);
    product19.setDescription("ba061308-092f-40b1-9a8e-465a56f359d0");
    java.lang.String str27 = product19.getDescription();
    product19.setCost(10.0f);
    product19.setCost((float)100L);
    boolean b32 = restaurant3.removeProduct(product19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5b9386b9-6886-474d-9079-0b5d9b0abf52"+ "'", str5.equals("5b9386b9-6886-474d-9079-0b5d9b0abf52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1e5e6b77-92a7-48af-87a4-66fc3d97f03d"+ "'", str16.equals("1e5e6b77-92a7-48af-87a4-66fc3d97f03d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ba061308-092f-40b1-9a8e-465a56f359d0"+ "'", str27.equals("ba061308-092f-40b1-9a8e-465a56f359d0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("91a043f5-f6c3-499c-abfa-94ed8cbcfada");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    boolean b4 = studentInfo2.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b6 = studentInfo2.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b8 = studentInfo2.addRestaurantToFavorites("8fb81efd-e454-4b41-837c-440f27d5e941");
    boolean b10 = studentInfo2.delRestaurantFromFavorites("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    boolean b12 = studentInfo2.addProductToFavorites("811f8a1d-ca60-461d-828c-6680d7547043");
    java.util.List<java.lang.String> list_str13 = studentInfo2.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    boolean b16 = studentInfo14.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b18 = studentInfo14.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus19 = new com.example.unifood.models.Campus();
    boolean b21 = campus19.removeRestaurant("hi!");
    campus19.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str24 = campus19.getRestaurants();
    java.lang.String str25 = campus19.getId();
    java.lang.String str26 = campus19.getName();
    campus19.setId("2adc96c3-f320-42fb-97f3-c22c606913fb");
    java.util.List<java.lang.String> list_str29 = campus19.getRestaurants();
    studentInfo14.setFavRestaurants(list_str29);
    boolean b32 = studentInfo14.addProductToFavorites("00a80698-5dcc-4f53-8de2-eaec89537d25");
    java.util.List<java.lang.String> list_str33 = studentInfo14.getFavRestaurants();
    studentInfo2.setFavRestaurants(list_str33);
    studentInfo1.setFavProducts(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "99d7af45-4cfc-4494-aa0f-1b12b44ea682"+ "'", str25.equals("99d7af45-4cfc-4494-aa0f-1b12b44ea682"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str26.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("4dc32edb-837b-4c73-8d72-66df1a3ebd2c");
    boolean b3 = studentInfo1.delProductFromFavorites("7fb4b671-eeeb-4d73-8c40-91baed7167c3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }

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
    boolean b22 = restaurant11.getApproved();
    restaurant11.setApproved(false);
    java.lang.Float f25 = restaurant11.getRate();
    
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
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f25 + "' != '" + 0.0f+ "'", f25.equals(0.0f));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    product0.setDescription("hi!");
    float f3 = product0.getCost();
    java.lang.String str4 = product0.getDescription();
    product0.setAvailability(true);
    product0.setCost((float)1);
    product0.setCost((float)' ');
    product0.setDescription("c267d974-e267-4fa4-a7fb-b66e526c2b06");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getId();
    review0.setUserId("fde75b42-0c98-4497-90a3-eaf498e34ad2");
    java.lang.String str10 = review0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "fde75b42-0c98-4497-90a3-eaf498e34ad2"+ "'", str10.equals("fde75b42-0c98-4497-90a3-eaf498e34ad2"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    boolean b7 = campus0.removeRestaurant("edf01dd6-a35a-426f-808e-d6346b5af74f");
    boolean b9 = campus0.addRestaurant("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    java.util.List<java.lang.String> list_str10 = campus0.getRestaurants();
    java.util.List<java.lang.String> list_str11 = campus0.getRestaurants();
    campus0.setName("356355fb-92eb-464e-ae48-bb58ea231323");
    campus0.setId("2230fc1f-a8ce-41f5-a9ff-b153e8683ea3");
    
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

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("64f7d46a-4de3-4e77-aaa9-bdf80652fee5", (float)10, "9c79c876-a93d-4813-92df-b21535c292d5");

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    java.lang.String str6 = campus0.getId();
    java.lang.String str7 = campus0.getName();
    java.lang.String str8 = campus0.getId();
    campus0.setId("");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavRestaurants();
    boolean b14 = studentInfo11.addRestaurantToFavorites("e8588626-52d3-4ed2-8bd5-24c0755bae64");
    java.lang.String str15 = studentInfo11.getCampusId();
    studentInfo11.setCampusId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    studentInfo18.setCampusId("");
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    studentInfo18.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str27);
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    studentInfo30.setCampusId("");
    studentInfo30.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    studentInfo30.setCampusId("adb74c6f-c839-47cc-b096-1c12240d6afd");
    java.util.List<java.lang.String> list_str37 = studentInfo30.getFavProducts();
    studentInfo18.setFavProducts(list_str37);
    studentInfo11.setFavRestaurants(list_str37);
    boolean b41 = studentInfo11.delProductFromFavorites("d742adcd-b8ee-4eef-bdae-73dda46717fe");
    com.example.unifood.models.StudentInfo studentInfo42 = new com.example.unifood.models.StudentInfo();
    studentInfo42.setCampusId("");
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<java.lang.String>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str51, str_array50);
    studentInfo42.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str51);
    studentInfo42.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    boolean b57 = studentInfo42.addProductToFavorites("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b59 = studentInfo42.addRestaurantToFavorites("9bb4ec51-2299-41a3-b764-2192d7b57501");
    com.example.unifood.models.Campus campus61 = new com.example.unifood.models.Campus("a04223f0-b1c0-449c-afab-59a81cef4343");
    java.lang.String str62 = campus61.getId();
    com.example.unifood.models.StudentInfo studentInfo63 = new com.example.unifood.models.StudentInfo();
    studentInfo63.setCampusId("");
    java.lang.String[] str_array71 = new java.lang.String[] { "hi!", "a04223f0-b1c0-449c-afab-59a81cef4343", "hi!", "435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0" };
    java.util.ArrayList<java.lang.String> arraylist_str72 = new java.util.ArrayList<java.lang.String>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str72, str_array71);
    studentInfo63.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str72);
    campus61.setRestaurants((java.util.List<java.lang.String>)arraylist_str72);
    studentInfo42.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str72);
    studentInfo11.setFavProducts((java.util.List<java.lang.String>)arraylist_str72);
    campus0.setRestaurants((java.util.List<java.lang.String>)arraylist_str72);
    campus0.setId("8bb40a0f-46e7-4501-9f3a-d959fee945f7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "8e9a6742-88e0-4293-84d4-a899a68285fa"+ "'", str6.equals("8e9a6742-88e0-4293-84d4-a899a68285fa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "8e9a6742-88e0-4293-84d4-a899a68285fa"+ "'", str8.equals("8e9a6742-88e0-4293-84d4-a899a68285fa"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "14db0172-7660-453b-a78d-23bc5b1132e8"+ "'", str62.equals("14db0172-7660-453b-a78d-23bc5b1132e8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("12/03/2017");
    boolean b3 = university1.addCampus("adb74c6f-c839-47cc-b096-1c12240d6afd");
    boolean b5 = university1.addCampus("1cb9f2a2-c73f-4ca9-8246-d2f6813971eb");
    boolean b7 = university1.addCampus("154fffbb-c920-465f-ab05-2f25ee336187");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }

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
    restaurant12.setShortDescription("07451412-c083-4cf5-a659-35bf5bd11957");
    restaurant12.setLocalization("a8820379-27ca-4c06-9549-9431da8fae97");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f5 + "' != '" + 0.0f+ "'", f5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f8 + "' != '" + 0.0f+ "'", f8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "d59b65fa-d47a-4a49-87e3-ec55579a65ad"+ "'", str19.equals("d59b65fa-d47a-4a49-87e3-ec55579a65ad"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f32 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }

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
    com.example.unifood.models.Review review24 = new com.example.unifood.models.Review("9626d0ba-fe19-4356-a232-426c972c7dfc", "4f54b634-288e-42c6-b781-2869535b5bb5", 0.0f, "f666c841-c560-4874-8cbd-008c848d1f42");
    restaurant13.addReview(review24);
    review24.setRestaurantId("e595705d-f29f-4a94-8ef8-471e0b71e437");
    
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

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }

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
    product12.setCost((float)(byte)0);
    product12.setCost((float)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }

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
    boolean b30 = studentInfo0.delRestaurantFromFavorites("911084da-c86d-49e6-8f26-2d8886db9319");
    boolean b32 = studentInfo0.addProductToFavorites("54846492-7147-4a09-94c8-6f6039c3cd4b");
    
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
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("f66e2559-c7f0-4b76-b5e5-3ba85f13bec8");

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("48af3aad-919d-4ef4-8028-3a57694cd73d", (float)' ', "274be07e-a3ac-4731-bba5-47ea41b3cd02");
    java.lang.String str4 = product3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "274be07e-a3ac-4731-bba5-47ea41b3cd02"+ "'", str4.equals("274be07e-a3ac-4731-bba5-47ea41b3cd02"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    boolean b10 = studentInfo0.addProductToFavorites("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    com.example.unifood.models.Campus campus12 = new com.example.unifood.models.Campus("ca4a646d-3cc8-4cc0-9b41-40eb17520a41");
    java.util.List<java.lang.String> list_str13 = campus12.getRestaurants();
    studentInfo0.setFavRestaurants(list_str13);
    com.example.unifood.models.University university16 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus17 = new com.example.unifood.models.Campus();
    boolean b19 = campus17.removeRestaurant("hi!");
    campus17.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str22 = campus17.getRestaurants();
    university16.setAllCampus(list_str22);
    university16.setId("");
    com.example.unifood.models.University university27 = new com.example.unifood.models.University("hi!");
    java.lang.String str28 = university27.getId();
    boolean b30 = university27.addCampus("hi!");
    java.lang.String str31 = university27.getId();
    university27.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    com.example.unifood.models.University university35 = new com.example.unifood.models.University("hi!");
    boolean b37 = university35.removeCampus("hi!");
    com.example.unifood.models.University university39 = new com.example.unifood.models.University("hi!");
    java.lang.String str40 = university39.getId();
    boolean b42 = university39.addCampus("hi!");
    java.lang.String str43 = university39.getId();
    university39.setName("12/03/2017");
    java.util.List<java.lang.String> list_str46 = university39.getAllCampus();
    university35.setAllCampus(list_str46);
    java.util.List<java.lang.String> list_str48 = university35.getAllCampus();
    university27.setAllCampus(list_str48);
    java.util.List<java.lang.String> list_str50 = university27.getAllCampus();
    university16.setAllCampus(list_str50);
    studentInfo0.setFavRestaurants(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "8d502fcb-cd7c-4b92-92a0-398f03a0e459"+ "'", str28.equals("8d502fcb-cd7c-4b92-92a0-398f03a0e459"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "8d502fcb-cd7c-4b92-92a0-398f03a0e459"+ "'", str31.equals("8d502fcb-cd7c-4b92-92a0-398f03a0e459"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "95f98a5b-0cc3-444a-92a0-b9d8800c10c0"+ "'", str40.equals("95f98a5b-0cc3-444a-92a0-b9d8800c10c0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "95f98a5b-0cc3-444a-92a0-b9d8800c10c0"+ "'", str43.equals("95f98a5b-0cc3-444a-92a0-b9d8800c10c0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b3 = university1.removeCampus("689fdbdb-d08c-4525-92ba-9d3f280495d5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("15149c67-efc5-4744-85b0-8dc2ac121df7");
    ownerInfo1.setRestaurantId("82f43158-8ddb-481e-bbfb-9a0fa3789735");
    ownerInfo1.setRestaurantId("com.example.unifood.exceptions.InvalidTypeException");
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.example.unifood.exceptions.InvalidTypeException"+ "'", str6.equals("com.example.unifood.exceptions.InvalidTypeException"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("966115cd-c9b1-4604-af74-29a2f9f68d81", "7116edc4-a219-4890-8bab-c81e493912e6", "719dd8bf-eadc-4a32-9e5c-744bb8444993");
    java.lang.String str4 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "7116edc4-a219-4890-8bab-c81e493912e6"+ "'", str4.equals("7116edc4-a219-4890-8bab-c81e493912e6"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    campus1.setId("7e9cb1e8-4c8d-4c1c-b183-7eeb1f0f60e3");
    boolean b5 = campus1.removeRestaurant("16c89e8f-dcdc-4632-8a9b-1653843567f5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant3.updateRating();
    restaurant3.setShortDescription("cc66dadd-fcba-49ac-836f-c77a82d11050");
    java.lang.String str14 = restaurant3.getLocalization();
    java.lang.String str15 = restaurant3.getUserId();
    java.lang.String str16 = restaurant3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str14.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str16.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("6cdbf9de-ccbb-4e55-b121-4d3b0ef54646", "e9990043-a6ec-4857-b63d-fb3f60effac6", "631ef8e1-304d-49b8-82b3-d4ff5ea894b7");
    java.lang.String str4 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "631ef8e1-304d-49b8-82b3-d4ff5ea894b7"+ "'", str4.equals("631ef8e1-304d-49b8-82b3-d4ff5ea894b7"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }

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
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant("53d5e04e-abb5-45a7-a278-d742367421a0", "75e0de5b-af05-410e-9afa-c211b35b0e94", "8fb81efd-e454-4b41-837c-440f27d5e941");
    restaurant33.setCampusId("ced1f535-42a1-41b6-914a-7e282afaf033");
    java.util.List<com.example.unifood.models.Review> list_review36 = restaurant33.getReviewList();
    restaurant0.setReviewList(list_review36);
    
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
    org.junit.Assert.assertNotNull(list_review36);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }

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
    java.lang.String str14 = restaurant0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "9e07b376-c51f-4d86-97b2-e0560ef5c7b1"+ "'", str14.equals("9e07b376-c51f-4d86-97b2-e0560ef5c7b1"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }

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
    restaurant0.setShortDescription("6def54f2-7835-4f8e-8a12-544711769448");
    com.example.unifood.models.Restaurant restaurant45 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str46 = restaurant45.getShortDescription();
    restaurant45.setId("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    boolean b49 = restaurant45.getApproved();
    java.util.List<com.example.unifood.models.Product> list_product50 = restaurant45.getProductList();
    restaurant0.setProductList(list_product50);
    
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
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product50);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("5ed892b7-8b07-4339-8318-fe7c666739ed", (float)'#', "7ff1c0bd-5a10-4372-9b80-46c986b3ecc2");
    product3.setName("4a1faca8-27ea-4dd8-9833-9159f8937bd9");

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("d3621539-7d39-481b-9fc2-42fd593a7135");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d3621539-7d39-481b-9fc2-42fd593a7135"+ "'", str2.equals("d3621539-7d39-481b-9fc2-42fd593a7135"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "d3621539-7d39-481b-9fc2-42fd593a7135"+ "'", str3.equals("d3621539-7d39-481b-9fc2-42fd593a7135"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "d3621539-7d39-481b-9fc2-42fd593a7135"+ "'", str4.equals("d3621539-7d39-481b-9fc2-42fd593a7135"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("e8588626-52d3-4ed2-8bd5-24c0755bae64", 100.0f, "12/03/2017");
    java.lang.String str4 = product3.getDescription();
    float f5 = product3.getCost();
    java.lang.String str6 = product3.getName();
    product3.setId("f6ca0495-0d1d-4653-b4e4-20d665aafe5f");
    float f9 = product3.getCost();
    product3.setName("0f5cd045-5aec-4f06-873a-ae9424257334");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/03/2017"+ "'", str4.equals("12/03/2017"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "e8588626-52d3-4ed2-8bd5-24c0755bae64"+ "'", str6.equals("e8588626-52d3-4ed2-8bd5-24c0755bae64"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 100.0f);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("345574a0-718c-46f3-b7cb-e07b99e285db");

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }

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
    java.util.List<com.example.unifood.models.Review> list_review37 = restaurant0.getReviewList();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review37);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("d3621539-7d39-481b-9fc2-42fd593a7135");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("84690df0-fc3f-4f78-927d-400cb75e661d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "d3621539-7d39-481b-9fc2-42fd593a7135"+ "'", str2.equals("d3621539-7d39-481b-9fc2-42fd593a7135"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "d3621539-7d39-481b-9fc2-42fd593a7135"+ "'", str3.equals("d3621539-7d39-481b-9fc2-42fd593a7135"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    com.example.unifood.models.Review review11 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review11.setUserId("");
    java.lang.String str14 = review11.getUserId();
    review11.setUserId("c1839dde-2a89-4fce-a06f-c96ccbb3f563");
    boolean b17 = restaurant3.removeReview(review11);
    float f18 = review11.getRate();
    java.lang.String str19 = review11.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "147dc93a-6108-4bc3-953c-78869a66a0fc"+ "'", str5.equals("147dc93a-6108-4bc3-953c-78869a66a0fc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str19.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    university1.setId("6d3048fd-be9f-46dc-8d3b-af0f3e74336b");
    boolean b5 = university1.removeCampus("c43f6057-5d34-4ff6-9fae-884aaebeecbe");
    java.util.List<java.lang.String> list_str6 = university1.getAllCampus();
    boolean b8 = university1.removeCampus("fe3d6940-3d53-4045-ba18-577d39f15953");
    university1.setName("48c25d85-b054-43a6-8e9a-9f2337c85215");
    java.util.List<java.lang.String> list_str11 = university1.getAllCampus();
    java.lang.String str12 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "6d3048fd-be9f-46dc-8d3b-af0f3e74336b"+ "'", str12.equals("6d3048fd-be9f-46dc-8d3b-af0f3e74336b"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("3c11ad74-3d0c-460b-a7f3-db24d1b7225f");
    java.lang.String str3 = userInfo0.getFirstName();
    java.lang.String str4 = userInfo0.getFirstName();
    userInfo0.setLastName("3bf8bb0e-8cb6-4d60-9876-2560b641d5dd");
    java.lang.String str7 = userInfo0.getLastName();
    java.lang.String str8 = userInfo0.getLastName();
    userInfo0.setFirstName("783036da-6ec8-474d-81c4-a8c5cc7a1154");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "3bf8bb0e-8cb6-4d60-9876-2560b641d5dd"+ "'", str7.equals("3bf8bb0e-8cb6-4d60-9876-2560b641d5dd"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3bf8bb0e-8cb6-4d60-9876-2560b641d5dd"+ "'", str8.equals("3bf8bb0e-8cb6-4d60-9876-2560b641d5dd"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("322c0567-95f6-47cd-bed2-9cdd49776e37");
    com.example.unifood.models.Campus campus2 = new com.example.unifood.models.Campus();
    boolean b4 = campus2.removeRestaurant("hi!");
    campus2.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str7 = campus2.getRestaurants();
    university1.setAllCampus(list_str7);
    university1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str11 = university1.getName();
    java.lang.String str12 = university1.getId();
    java.lang.String str13 = university1.getName();
    boolean b15 = university1.removeCampus("b5e92389-aa3f-4dcf-b208-d494266d63ef");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str11.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str12.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str13.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }

    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus("3de44b1a-76fa-43b5-aedb-0dce3a424fc1");

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }

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
    restaurant0.setRate((java.lang.Float)1.0f);
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant17.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str20 = restaurant17.getShortDescription();
    boolean b22 = restaurant17.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant17.setId("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619");
    restaurant17.updateRating();
    java.util.List<com.example.unifood.models.Review> list_review26 = restaurant17.getReviewList();
    java.lang.String str27 = restaurant17.getId();
    restaurant17.updateRating();
    restaurant17.setShortDescription("53d5e04e-abb5-45a7-a278-d742367421a0");
    restaurant0.update(restaurant17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "964dfeaa-0946-4970-81ef-c212e6ad1a2e"+ "'", str10.equals("964dfeaa-0946-4970-81ef-c212e6ad1a2e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"+ "'", str27.equals("2fbfb9dd-3fcc-473a-b0e4-96fee93aa619"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("32d2e43e-3da9-4657-ad10-25e7a486a77e");
    java.lang.String str2 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32d2e43e-3da9-4657-ad10-25e7a486a77e"+ "'", str2.equals("32d2e43e-3da9-4657-ad10-25e7a486a77e"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("", "e869f834-69b9-424e-b9d0-dc55781d31a1", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidRestaurantNameException");
    } catch (com.example.unifood.exceptions.InvalidRestaurantNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }

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
    restaurant3.setName("964dfeaa-0946-4970-81ef-c212e6ad1a2e");
    
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

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f6 = review0.getRate();
    java.lang.String str7 = review0.getComment();
    java.lang.String str8 = review0.getId();
    review0.setDate("ee90b770-de3f-4c45-ab0c-a7fa43ab062d");
    float f11 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "3db35cfa-ac0a-4288-9084-8d042e570026"+ "'", str7.equals("3db35cfa-ac0a-4288-9084-8d042e570026"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("9cef684b-9583-4350-bc7f-52fdf83f721b");
    boolean b3 = university1.removeCampus("55dabc7b-3fe7-4421-a040-d45c92cd70da");
    boolean b5 = university1.addCampus("f42b6f81-3e10-41d9-b634-0bd2da5b6245");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("2891a841-1e45-480f-8dbd-9c150442eb18", "46befd1b-8b45-47ff-9ce8-24209f693c28", "c913e6f0-7ea7-451b-9606-79de79148a0b");

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    java.lang.String str2 = userInfo0.getLastName();
    java.lang.String str3 = userInfo0.getType();
    java.lang.String str4 = userInfo0.getLastName();
    userInfo0.setLastName("e2c7a34a-8060-4430-9d69-dd5848b101c6");
    userInfo0.setFirstName("ab3ba457-f9a8-416f-872c-51f3f6ab602f");
    userInfo0.setLastName("efa3807e-af8d-4f2c-83ce-9465d1d11d0d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }

    com.example.unifood.models.Product product0 = new com.example.unifood.models.Product();
    boolean b1 = product0.getAvailability();
    product0.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = product0.getAvailability();
    java.lang.String str5 = product0.getDescription();
    product0.setDescription("ec1c7744-8529-4314-837e-cb723075bf0b");
    float f8 = product0.getCost();
    product0.setCost((float)(short)-1);
    
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
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }

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
    boolean b20 = product13.getAvailability();
    product13.setId("2d5bd45f-78a5-41ce-8a06-2058b41535ef");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "370bea8e-0595-4f3d-ad8f-bc910a6fa6c4"+ "'", str10.equals("370bea8e-0595-4f3d-ad8f-bc910a6fa6c4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    university1.setId("392d78ad-3469-4abe-83e2-8fc3d2096494");
    java.lang.String str8 = university1.getId();
    java.lang.String str9 = university1.getId();
    university1.setName("03b11d7c-17ee-42b3-8d2b-a1582b7ae26f");
    boolean b13 = university1.removeCampus("5502d758-a604-4bc3-9ae6-04afda29f2e9");
    java.lang.String str14 = university1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3415dca2-9a64-422b-96cd-b67d055e8efb"+ "'", str2.equals("3415dca2-9a64-422b-96cd-b67d055e8efb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3415dca2-9a64-422b-96cd-b67d055e8efb"+ "'", str5.equals("3415dca2-9a64-422b-96cd-b67d055e8efb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str8.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "392d78ad-3469-4abe-83e2-8fc3d2096494"+ "'", str9.equals("392d78ad-3469-4abe-83e2-8fc3d2096494"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "03b11d7c-17ee-42b3-8d2b-a1582b7ae26f"+ "'", str14.equals("03b11d7c-17ee-42b3-8d2b-a1582b7ae26f"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    java.lang.String str5 = university1.getId();
    java.lang.String str6 = university1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ad0aab76-3f5a-4a38-a391-84430cefa5bb"+ "'", str2.equals("ad0aab76-3f5a-4a38-a391-84430cefa5bb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ad0aab76-3f5a-4a38-a391-84430cefa5bb"+ "'", str5.equals("ad0aab76-3f5a-4a38-a391-84430cefa5bb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ad0aab76-3f5a-4a38-a391-84430cefa5bb"+ "'", str6.equals("ad0aab76-3f5a-4a38-a391-84430cefa5bb"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    restaurant0.setApproved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("8fb81efd-e454-4b41-837c-440f27d5e941");
    review0.setRate((float)(short)1);
    review0.setId("e543d0dd-7b59-46bf-a7c0-c7ef44c0b746");
    float f11 = review0.getRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 1.0f);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("ccf553f7-d9de-49ff-80df-05ba74bcec16");
    boolean b3 = university1.addCampus("e3c02b6c-6ad8-4057-8eb3-b966f859b297");
    java.lang.String str4 = university1.getId();
    university1.setName("99526f74-1887-4853-8a5d-e2406c66914a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "b38cc914-cd4c-4f74-ba13-b1e6dd295cbc"+ "'", str4.equals("b38cc914-cd4c-4f74-ba13-b1e6dd295cbc"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("322c0567-95f6-47cd-bed2-9cdd49776e37");
    boolean b4 = studentInfo0.delProductFromFavorites("49b07ce6-aac6-463b-a3cc-21e21430bc86");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("d4347eb6-192e-4976-b563-60f0e7c43424");
    boolean b9 = studentInfo0.addRestaurantToFavorites("bcee5d51-04e6-485f-8dc5-c0658b2b5ed2");
    boolean b11 = studentInfo0.addProductToFavorites("65efe1a9-f2a7-4e15-bec1-3957bcfef68f");
    boolean b13 = studentInfo0.addProductToFavorites("d6f3b56e-06b1-4ffe-af0b-6861611c3b37");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }

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
    restaurant3.updateRating();
    
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
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "f76595bf-fd32-4779-b278-0f4919bbd501"+ "'", str77.equals("f76595bf-fd32-4779-b278-0f4919bbd501"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(review_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product93);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b3 = university1.addCampus("aabd70ed-be9f-4452-9625-3f6b64c27121");
    boolean b5 = university1.addCampus("1a1f4baa-144f-4a2a-8f04-65ea83560f2d");
    java.lang.String str6 = university1.getId();
    university1.setName("f19552d6-0add-41dc-b938-cadf800424cf");
    university1.setId("cad4f3c0-5141-4965-83be-32ac83aac762");
    boolean b12 = university1.addCampus("8cf5c261-be84-4009-88b0-b69c25feea98");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "76691b3d-de37-4ae5-aed2-fa67a67e52b3"+ "'", str6.equals("76691b3d-de37-4ae5-aed2-fa67a67e52b3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    boolean b4 = restaurant3.getApproved();
    java.lang.String str5 = restaurant3.getId();
    java.util.List<com.example.unifood.models.Review> list_review6 = restaurant3.getReviewList();
    restaurant3.updateRating();
    com.example.unifood.models.Review review13 = new com.example.unifood.models.Review("239d950c-a53b-45db-9e8f-483a040e426a", "adb74c6f-c839-47cc-b096-1c12240d6afd", 1.0f, "49976e80-f69f-4380-aa76-dc904dcb2eca", "5b598b36-27ec-4ee0-9f83-e90e5a84d6b9");
    java.lang.String str14 = review13.getId();
    restaurant3.addReview(review13);
    java.lang.String str16 = restaurant3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5d125a9a-b247-4a75-aa15-57b90ba5e0f8"+ "'", str5.equals("5d125a9a-b247-4a75-aa15-57b90ba5e0f8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "a6ee54eb-ae72-4635-98d2-7e38c68daec2"+ "'", str14.equals("a6ee54eb-ae72-4635-98d2-7e38c68daec2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "5d125a9a-b247-4a75-aa15-57b90ba5e0f8"+ "'", str16.equals("5d125a9a-b247-4a75-aa15-57b90ba5e0f8"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }

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
    java.lang.String str18 = restaurant0.getCampusId();
    java.lang.String str19 = restaurant0.getShortDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "6f2a573b-af4d-435a-bcb8-3bfee489ebc7"+ "'", str4.equals("6f2a573b-af4d-435a-bcb8-3bfee489ebc7"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "9741db0d-f106-4ae0-9562-dbd17d50d5a3"+ "'", str18.equals("9741db0d-f106-4ae0-9562-dbd17d50d5a3"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }

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
    review73.setId("92bd5a25-a00e-49b4-a7a1-66e0e6465991");
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "4f750875-4369-4c20-ae96-5e7d707bb8b5"+ "'", str37.equals("4f750875-4369-4c20-ae96-5e7d707bb8b5"));
    
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
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "cd79c50d-6e9e-46a9-9b73-a06487b306f2"+ "'", str60.equals("cd79c50d-6e9e-46a9-9b73-a06487b306f2"));
    
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
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "1f475d6f-e2dc-42d1-82d9-5c927ab8d92e"+ "'", str74.equals("1f475d6f-e2dc-42d1-82d9-5c927ab8d92e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }

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
    com.example.unifood.models.Product product32 = new com.example.unifood.models.Product();
    product32.setDescription("hi!");
    float f35 = product32.getCost();
    java.lang.String str36 = product32.getDescription();
    product32.setAvailability(true);
    product32.setId("2891a841-1e45-480f-8dbd-9c150442eb18");
    restaurant3.addProduct(product32);
    java.lang.Float f42 = restaurant3.getRate();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f42 + "' != '" + 0.0f+ "'", f42.equals(0.0f));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("hi!");
    java.lang.String str2 = university1.getId();
    boolean b4 = university1.addCampus("hi!");
    university1.setName("983a5c4e-aa49-46e5-83ef-45159624651e");
    java.lang.String str7 = university1.getName();
    university1.setId("f8155a8d-c6d9-44b4-9787-22acbb6a4495");
    boolean b11 = university1.removeCampus("830cd32b-e9a3-4af9-9962-ad5b4690f6c6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "03e355bc-102b-459e-9d62-0a36b2f2d55b"+ "'", str2.equals("03e355bc-102b-459e-9d62-0a36b2f2d55b"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "983a5c4e-aa49-46e5-83ef-45159624651e"+ "'", str7.equals("983a5c4e-aa49-46e5-83ef-45159624651e"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("322c0567-95f6-47cd-bed2-9cdd49776e37", 10.0f, "12/03/2017");
    float f4 = product3.getCost();
    product3.setCost(100.0f);
    product3.setCost((float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }

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
    product29.setCost((float)(short)10);
    
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
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }

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
    java.lang.Float f28 = restaurant0.getRate();
    
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
    org.junit.Assert.assertTrue("'" + f28 + "' != '" + 0.0f+ "'", f28.equals(0.0f));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    java.lang.String str8 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "9bd89d28-19bb-4c2d-a129-4f98542c55ca", "f76595bf-fd32-4779-b278-0f4919bbd501");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidFirstNameException");
    } catch (com.example.unifood.exceptions.InvalidFirstNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }

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
    campus0.setName("016f7a51-1523-4248-8cce-d7af4447fbc2");
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str49 = studentInfo48.getFavRestaurants();
    java.util.List<java.lang.String> list_str50 = studentInfo48.getFavRestaurants();
    campus0.setRestaurants(list_str50);
    boolean b53 = campus0.removeRestaurant("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "fd2aa24c-edd1-42e4-b93f-979c010ebb85"+ "'", str6.equals("fd2aa24c-edd1-42e4-b93f-979c010ebb85"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "322c0567-95f6-47cd-bed2-9cdd49776e37"+ "'", str7.equals("322c0567-95f6-47cd-bed2-9cdd49776e37"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "79df6086-a4e6-4b10-ac8d-ea6bfa6b79cc"+ "'", str12.equals("79df6086-a4e6-4b10-ac8d-ea6bfa6b79cc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }

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
    java.lang.String str21 = product16.getDescription();
    float f22 = product16.getCost();
    java.lang.String str23 = product16.getId();
    product16.setCost((float)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "2016930c-728d-45c5-a236-9c4833a30246"+ "'", str21.equals("2016930c-728d-45c5-a236-9c4833a30246"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f22 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "3cf41e8a-0978-423d-8b1d-d36337a6148a"+ "'", str23.equals("3cf41e8a-0978-423d-8b1d-d36337a6148a"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("94cff566-8f46-4475-8c23-466342c42efb");

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    boolean b8 = restaurant3.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    restaurant3.setName("9bb4ec51-2299-41a3-b764-2192d7b57501");
    java.lang.Float f11 = restaurant3.getRate();
    restaurant3.setUserId("00a80698-5dcc-4f53-8de2-eaec89537d25");
    restaurant3.setShortDescription("c0679c38-8adf-4203-85c8-515aaf773e20");
    java.lang.String str16 = restaurant3.getUserId();
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f11 + "' != '" + 0.0f+ "'", f11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00a80698-5dcc-4f53-8de2-eaec89537d25"+ "'", str16.equals("00a80698-5dcc-4f53-8de2-eaec89537d25"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }

    com.example.unifood.models.University university1 = new com.example.unifood.models.University("cdbb11ff-0ded-41d4-9a99-4197a5c14e79");

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    restaurant0.setShortDescription("");
    restaurant0.setLocalization("2adc96c3-f320-42fb-97f3-c22c606913fb");
    restaurant0.setShortDescription("239d950c-a53b-45db-9e8f-483a040e426a");
    com.example.unifood.models.Restaurant restaurant10 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product();
    boolean b12 = product11.getAvailability();
    restaurant10.addProduct(product11);
    java.util.List<com.example.unifood.models.Product> list_product14 = restaurant10.getProductList();
    restaurant0.setProductList(list_product14);
    java.util.List<com.example.unifood.models.Review> list_review16 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant17 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product18 = new com.example.unifood.models.Product();
    boolean b19 = product18.getAvailability();
    restaurant17.addProduct(product18);
    restaurant17.setShortDescription("");
    java.lang.String str23 = restaurant17.getLocalization();
    com.example.unifood.models.Restaurant restaurant24 = new com.example.unifood.models.Restaurant();
    java.lang.String str25 = restaurant24.getUserId();
    java.lang.String str26 = restaurant24.getLocalization();
    restaurant24.setUserId("f7fc87b6-8294-4834-b4c3-3bc5592fdd49");
    com.example.unifood.models.Product product29 = new com.example.unifood.models.Product();
    boolean b30 = product29.getAvailability();
    product29.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product29.setAvailability(true);
    product29.setCost((float)(byte)10);
    restaurant24.addProduct(product29);
    java.lang.String str38 = product29.getDescription();
    java.lang.String str39 = product29.getId();
    restaurant17.addProduct(product29);
    restaurant0.addProduct(product29);
    product29.setId("b5e92389-aa3f-4dcf-b208-d494266d63ef");
    boolean b44 = product29.getAvailability();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str38.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "df454b78-3fb3-40f6-8f97-7c80192f0bbb"+ "'", str39.equals("df454b78-3fb3-40f6-8f97-7c80192f0bbb"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setDate("ea40948a-8b8d-46fe-a89c-414de9b8c3e0");
    java.lang.String str6 = review0.getRestaurantId();
    review0.setRate((float)(byte)0);
    review0.setComment("");
    review0.setComment("a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    review0.setDate("d0efb8a3-3c54-4621-acb0-0ceb72881372");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setRate((float)10L);
    review0.setDate("hi!");
    review0.setRestaurantId("8fb81efd-e454-4b41-837c-440f27d5e941");
    java.lang.String str7 = review0.getComment();
    java.lang.String str8 = review0.getId();
    java.lang.String str9 = review0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23bfcb7a-631c-4af3-9567-8e60df809171"+ "'", str8.equals("23bfcb7a-631c-4af3-9567-8e60df809171"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("d9b45932-ac56-4af2-b658-7d2d73619019", "25f8792f-ca88-45b9-90bc-33076d9463c1", "d9346d74-28e8-4a9e-b63d-03e32a2a903e");

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("32bef74e-15d2-4f2b-849c-199055557d88", "90afc816-9759-4b54-86ff-a1b7beb18772", "b6fd1026-57eb-4577-a667-6dac64083d57");
    java.lang.String str4 = restaurant3.getCampusId();
    restaurant3.setCampusId("08ef2ed8-271a-4aad-9415-47b0dba1b9a7");
    restaurant3.updateRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "90afc816-9759-4b54-86ff-a1b7beb18772"+ "'", str4.equals("90afc816-9759-4b54-86ff-a1b7beb18772"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.util.List<com.example.unifood.models.Review> list_review7 = restaurant0.getReviewList();
    com.example.unifood.models.Restaurant restaurant11 = new com.example.unifood.models.Restaurant("f896595d-285f-448c-9d6c-2c86b7422847", "a04223f0-b1c0-449c-afab-59a81cef4343", "ed8899de-d74b-4c5b-bafd-c89f775d295a");
    boolean b12 = restaurant0.equals((java.lang.Object)"a04223f0-b1c0-449c-afab-59a81cef4343");
    restaurant0.setCampusId("b52745b2-b1bc-4221-add7-00d27c5e6064");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_review7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("de8ad0e6-fade-4d89-8497-8fdd6bd98db8");

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }

    com.example.unifood.models.Product product3 = new com.example.unifood.models.Product("979b1930-46c4-4b6e-b9e8-0d568cf89fb1", 0.0f, "9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    boolean b4 = product3.getAvailability();
    java.lang.String str5 = product3.getName();
    product3.setDescription("f6d94102-8e0d-4313-bc11-7fa097bb5b67");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "979b1930-46c4-4b6e-b9e8-0d568cf89fb1"+ "'", str5.equals("979b1930-46c4-4b6e-b9e8-0d568cf89fb1"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }

    com.example.unifood.exceptions.ReviewException reviewException0 = new com.example.unifood.exceptions.ReviewException();
    com.example.unifood.exceptions.InvalidRestaurantIdException invalidRestaurantIdException1 = new com.example.unifood.exceptions.InvalidRestaurantIdException();
    java.lang.String str2 = invalidRestaurantIdException1.toString();
    reviewException0.addSuppressed((java.lang.Throwable)invalidRestaurantIdException1);
    com.example.unifood.exceptions.InvalidTypeException invalidTypeException4 = new com.example.unifood.exceptions.InvalidTypeException();
    invalidRestaurantIdException1.addSuppressed((java.lang.Throwable)invalidTypeException4);
    java.lang.Throwable[] throwable_array6 = invalidRestaurantIdException1.getSuppressed();
    java.lang.String str7 = invalidRestaurantIdException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str2.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.example.unifood.exceptions.InvalidRestaurantIdException"+ "'", str7.equals("com.example.unifood.exceptions.InvalidRestaurantIdException"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    product1.setId("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str6 = product1.getName();
    product1.setCost(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }

    com.example.unifood.models.Campus campus0 = new com.example.unifood.models.Campus();
    boolean b2 = campus0.removeRestaurant("hi!");
    campus0.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str5 = campus0.getRestaurants();
    campus0.setId("b20fdb04-eb44-4feb-86d8-727927a5303b");
    boolean b9 = campus0.addRestaurant("54656a11-c51d-47a5-843e-2d6615aeb094");
    campus0.setId("4095eb38-f7d8-4310-9a1e-68274ed1223b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.Campus campus1 = new com.example.unifood.models.Campus();
    boolean b3 = campus1.removeRestaurant("hi!");
    campus1.setName("322c0567-95f6-47cd-bed2-9cdd49776e37");
    java.util.List<java.lang.String> list_str6 = campus1.getRestaurants();
    studentInfo0.setFavRestaurants(list_str6);
    studentInfo0.setCampusId("f19552d6-0add-41dc-b938-cadf800424cf");
    studentInfo0.setCampusId("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9");
    java.lang.String str12 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9"+ "'", str12.equals("a9c5ec22-e5b1-45cf-8dba-c6b6b3ad46c9"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }

    com.example.unifood.models.Review review0 = new com.example.unifood.models.Review();
    review0.setId("");
    java.lang.String str3 = review0.getUserId();
    review0.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    java.lang.String str6 = review0.getDate();
    java.lang.String str7 = review0.getDate();
    java.lang.String str8 = review0.getRestaurantId();
    review0.setRestaurantId("b1e0ce4f-fe08-425e-8497-24824ac3c0d9");
    review0.setComment("7c382e92-acef-4318-a40d-158e77003992");
    review0.setUserId("7b36089c-53b6-4386-ac3a-5824b12beae8");
    java.lang.String str15 = review0.getComment();
    java.lang.String str16 = review0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "7c382e92-acef-4318-a40d-158e77003992"+ "'", str15.equals("7c382e92-acef-4318-a40d-158e77003992"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "7c382e92-acef-4318-a40d-158e77003992"+ "'", str16.equals("7c382e92-acef-4318-a40d-158e77003992"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }

    com.example.unifood.models.Restaurant restaurant3 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant3.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str6 = restaurant3.getShortDescription();
    com.example.unifood.models.Product product7 = new com.example.unifood.models.Product();
    product7.setDescription("hi!");
    java.lang.String str10 = product7.getDescription();
    boolean b11 = restaurant3.removeProduct(product7);
    product7.setName("12/03/2017");
    boolean b14 = product7.getAvailability();
    java.lang.String str15 = product7.getName();
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "12/03/2017"+ "'", str15.equals("12/03/2017"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("998a891c-76e5-4840-b1a5-a94b23f06450");

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("783036da-6ec8-474d-81c4-a8c5cc7a1154");

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }

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
    restaurant14.setShortDescription("7393fe25-660b-4d55-a755-22ca7c412925");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "7646f4cf-532b-457b-9432-25738a5fa3ca"+ "'", str22.equals("7646f4cf-532b-457b-9432-25738a5fa3ca"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }

    com.example.unifood.models.Restaurant restaurant0 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product1 = new com.example.unifood.models.Product();
    boolean b2 = product1.getAvailability();
    restaurant0.addProduct(product1);
    java.util.List<com.example.unifood.models.Product> list_product4 = restaurant0.getProductList();
    restaurant0.setName("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.Float f7 = restaurant0.getRate();
    com.example.unifood.models.Product product11 = new com.example.unifood.models.Product("7ff1c0bd-5a10-4372-9b80-46c986b3ecc2", (float)'#', "6c4c9076-aeac-4c07-b6bc-73b8d8f0a4be");
    product11.setAvailability(false);
    boolean b14 = restaurant0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f7 + "' != '" + 0.0f+ "'", f7.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }

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
    com.example.unifood.models.Restaurant restaurant19 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    restaurant19.setCampusId("67a826d0-ad9d-49db-8997-58baff1011a9");
    java.lang.String str22 = restaurant19.getShortDescription();
    boolean b24 = restaurant19.equals((java.lang.Object)"a7f88f28-d728-4cc0-82b9-46eaad96df5f");
    com.example.unifood.models.Review review25 = new com.example.unifood.models.Review();
    review25.setId("");
    java.lang.String str28 = review25.getUserId();
    review25.setComment("3db35cfa-ac0a-4288-9084-8d042e570026");
    float f31 = review25.getRate();
    boolean b32 = restaurant19.removeReview(review25);
    com.example.unifood.models.Restaurant restaurant33 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product34 = new com.example.unifood.models.Product();
    boolean b35 = product34.getAvailability();
    restaurant33.addProduct(product34);
    java.util.List<com.example.unifood.models.Product> list_product37 = restaurant33.getProductList();
    restaurant33.setUserId("hi!");
    restaurant33.setLocalization("3f1f2c41-cbe8-4647-a5f0-123f0f1af573");
    java.util.List<com.example.unifood.models.Product> list_product42 = restaurant33.getProductList();
    restaurant19.setProductList(list_product42);
    java.lang.String str44 = restaurant19.getUserId();
    com.example.unifood.models.Product product45 = new com.example.unifood.models.Product();
    boolean b46 = product45.getAvailability();
    product45.setDescription("435ac483-0bc9-41d2-b04d-3c696a180a7c");
    product45.setAvailability(true);
    product45.setCost((float)(byte)10);
    boolean b53 = restaurant19.removeProduct(product45);
    com.example.unifood.models.Restaurant restaurant57 = new com.example.unifood.models.Restaurant("435ac483-0bc9-41d2-b04d-3c696a180a7c", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "435ac483-0bc9-41d2-b04d-3c696a180a7c");
    java.lang.String str58 = restaurant57.getName();
    com.example.unifood.models.Restaurant restaurant59 = new com.example.unifood.models.Restaurant();
    com.example.unifood.models.Product product60 = new com.example.unifood.models.Product();
    boolean b61 = product60.getAvailability();
    restaurant59.addProduct(product60);
    java.util.List<com.example.unifood.models.Product> list_product63 = restaurant59.getProductList();
    restaurant59.updateRating();
    java.lang.String str65 = restaurant59.getShortDescription();
    java.lang.String str66 = restaurant59.getName();
    java.util.List<com.example.unifood.models.Product> list_product67 = restaurant59.getProductList();
    restaurant57.setProductList(list_product67);
    restaurant19.setProductList(list_product67);
    java.util.List<com.example.unifood.models.Product> list_product70 = restaurant19.getProductList();
    restaurant0.setProductList(list_product70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f31 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "435ac483-0bc9-41d2-b04d-3c696a180a7c"+ "'", str58.equals("435ac483-0bc9-41d2-b04d-3c696a180a7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_product70);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("2adc96c3-f320-42fb-97f3-c22c606913fb", "67a826d0-ad9d-49db-8997-58baff1011a9", "com.example.unifood.exceptions.InvalidRestaurantIdException");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("e0ff690d-cc70-4ca7-8c59-adec9fbb61de");
    userInfo3.setLastName("91cf45dc-31ac-4729-8532-f8c8348b9e32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str4.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "ea40948a-8b8d-46fe-a89c-414de9b8c3e0", "a04223f0-b1c0-449c-afab-59a81cef4343");
    userInfo3.setFirstName("1d8645fe-e3d3-41a0-b416-919377cfaad9");
    userInfo3.setFirstName("9e087ae8-80e1-4932-9bf9-0925df2c9f7e");
    userInfo3.setType("67a826d0-ad9d-49db-8997-58baff1011a9");
    userInfo3.setLastName("f19552d6-0add-41dc-b938-cadf800424cf");
    userInfo3.setType("d2c04c57-dc37-400b-8ed6-9a9093b15b9f");

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }

    com.example.unifood.models.Review review5 = new com.example.unifood.models.Review("67a826d0-ad9d-49db-8997-58baff1011a9", "322c0567-95f6-47cd-bed2-9cdd49776e37", (float)1, "67a826d0-ad9d-49db-8997-58baff1011a9", "67a826d0-ad9d-49db-8997-58baff1011a9");
    review5.setUserId("");
    java.lang.String str8 = review5.getUserId();
    float f9 = review5.getRate();
    review5.setRestaurantId("c7492f51-751c-49fa-9823-c9ff6db2c39f");
    java.lang.String str12 = review5.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "67a826d0-ad9d-49db-8997-58baff1011a9"+ "'", str12.equals("67a826d0-ad9d-49db-8997-58baff1011a9"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }

    com.example.unifood.exceptions.UserException userException0 = new com.example.unifood.exceptions.UserException();
    java.lang.Throwable[] throwable_array1 = userException0.getSuppressed();
    java.lang.String str2 = userException0.toString();
    java.lang.String str3 = userException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str2.equals("com.example.unifood.exceptions.UserException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.example.unifood.exceptions.UserException"+ "'", str3.equals("com.example.unifood.exceptions.UserException"));

  }

}
