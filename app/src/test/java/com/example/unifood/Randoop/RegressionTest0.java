
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidFirstNameException");
    } catch (com.example.unifood.exceptions.InvalidFirstNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "", "");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidFirstNameException");
    } catch (com.example.unifood.exceptions.InvalidFirstNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    // The following exception was thrown during execution in test generation
    try {
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "hi!", "");
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
    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type com.example.unifood.exceptions.InvalidFirstNameException");
    } catch (com.example.unifood.exceptions.InvalidFirstNameException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b5 = studentInfo1.delProductFromFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b9 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    java.lang.String str3 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    boolean b9 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    boolean b4 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    java.lang.String str8 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getFirstName();
    java.lang.String str7 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.addProductToFavorites("hi!");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("");
    boolean b34 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b6 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    boolean b23 = studentInfo21.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo25.getFavProducts();
    studentInfo21.setFavRestaurants(list_str27);
    studentInfo1.setFavProducts(list_str27);
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    studentInfo1.setCampusId("");
    java.lang.String str10 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.addProductToFavorites("");
    boolean b6 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    userInfo3.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    java.lang.String str11 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getFirstName();
    java.lang.String str7 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    boolean b4 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    java.lang.String str7 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo32 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b34 = studentInfo32.addRestaurantToFavorites("hi!");
    studentInfo32.setCampusId("hi!");
    boolean b38 = studentInfo32.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str39 = studentInfo32.getFavProducts();
    studentInfo0.setFavProducts(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b17 = studentInfo15.addRestaurantToFavorites("hi!");
    studentInfo15.setCampusId("hi!");
    boolean b21 = studentInfo15.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str22 = studentInfo15.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    java.lang.String str1 = ownerInfo0.getRestaurantId();
    java.lang.String str2 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("");
    ownerInfo0.setRestaurantId("hi!");
    ownerInfo0.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b9 = studentInfo7.addRestaurantToFavorites("hi!");
    studentInfo7.setCampusId("hi!");
    boolean b13 = studentInfo7.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str14);
    java.util.List<java.lang.String> list_str16 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    java.lang.String str11 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    userInfo3.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getType();
    java.lang.String str6 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    java.lang.String str14 = studentInfo1.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str16 = studentInfo15.getFavProducts();
    boolean b18 = studentInfo15.delRestaurantFromFavorites("");
    boolean b20 = studentInfo15.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b24 = studentInfo22.addRestaurantToFavorites("hi!");
    studentInfo22.setCampusId("hi!");
    boolean b28 = studentInfo22.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str29 = studentInfo22.getFavRestaurants();
    studentInfo15.setFavRestaurants(list_str29);
    studentInfo1.setFavProducts(list_str29);
    java.lang.String str32 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b11 = studentInfo9.addProductToFavorites("");
    boolean b13 = studentInfo9.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo15.getFavProducts();
    java.util.List<java.lang.String> list_str17 = studentInfo15.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b21 = studentInfo19.addRestaurantToFavorites("hi!");
    studentInfo19.setCampusId("hi!");
    boolean b25 = studentInfo19.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo19.getFavRestaurants();
    studentInfo15.setFavProducts(list_str26);
    studentInfo9.setFavProducts(list_str26);
    studentInfo0.setFavRestaurants(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    userInfo3.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.addProductToFavorites("");
    studentInfo7.setCampusId("");
    java.util.List<java.lang.String> list_str13 = studentInfo7.getFavProducts();
    studentInfo1.setFavProducts(list_str13);
    boolean b16 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    boolean b4 = studentInfo2.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo2.setFavRestaurants(list_str7);
    studentInfo0.setFavProducts(list_str7);
    boolean b11 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    java.lang.String str11 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    studentInfo11.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str15);
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    studentInfo11.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str22 = studentInfo21.getFavProducts();
    boolean b24 = studentInfo21.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str25 = studentInfo21.getFavProducts();
    java.util.List<java.lang.String> list_str26 = studentInfo21.getFavProducts();
    studentInfo11.setFavProducts(list_str26);
    boolean b29 = studentInfo11.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str30 = studentInfo11.getFavProducts();
    studentInfo1.setFavRestaurants(list_str30);
    boolean b33 = studentInfo1.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    boolean b37 = studentInfo34.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str38 = studentInfo34.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    boolean b41 = studentInfo39.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str44 = studentInfo43.getFavProducts();
    java.util.List<java.lang.String> list_str45 = studentInfo43.getFavProducts();
    studentInfo39.setFavRestaurants(list_str45);
    studentInfo34.setFavProducts(list_str45);
    studentInfo1.setFavProducts(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str32 = studentInfo31.getFavProducts();
    boolean b34 = studentInfo31.delProductFromFavorites("");
    boolean b36 = studentInfo31.delProductFromFavorites("");
    boolean b38 = studentInfo31.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str39 = studentInfo31.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str42 = studentInfo41.getFavProducts();
    studentInfo31.setFavProducts(list_str42);
    studentInfo0.setFavRestaurants(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("");
    java.lang.String str4 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("hi!");
    java.lang.String str3 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    java.lang.String str9 = userInfo0.getFirstName();
    java.lang.String str10 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    java.lang.String str12 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str21 = studentInfo0.getCampusId();
    boolean b23 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");
    java.lang.String str12 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo();
    boolean b7 = studentInfo5.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo9.getFavProducts();
    studentInfo5.setFavRestaurants(list_str11);
    studentInfo0.setFavProducts(list_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "hi!", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    boolean b17 = studentInfo1.delRestaurantFromFavorites("hi!");
    studentInfo1.setCampusId("");
    java.lang.String str20 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    java.lang.String str7 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    studentInfo1.setFavProducts((java.util.List<java.lang.String>)arraylist_str19);
    java.lang.String str22 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b21 = studentInfo1.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    java.util.List<java.lang.String> list_str10 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b14 = studentInfo12.addRestaurantToFavorites("hi!");
    studentInfo12.setCampusId("hi!");
    boolean b18 = studentInfo12.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str19);
    boolean b22 = studentInfo8.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str23 = studentInfo8.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str23);
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str28 = studentInfo27.getFavProducts();
    boolean b30 = studentInfo27.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo27.getFavProducts();
    studentInfo26.setFavProducts(list_str31);
    studentInfo26.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    studentInfo36.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    java.util.List<java.lang.String> list_str43 = studentInfo36.getFavRestaurants();
    studentInfo36.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo46 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str47 = studentInfo46.getFavProducts();
    boolean b49 = studentInfo46.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str50 = studentInfo46.getFavProducts();
    java.util.List<java.lang.String> list_str51 = studentInfo46.getFavProducts();
    studentInfo36.setFavProducts(list_str51);
    boolean b54 = studentInfo36.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str55 = studentInfo36.getFavProducts();
    studentInfo26.setFavRestaurants(list_str55);
    studentInfo1.setFavProducts(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    java.lang.String str8 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b9 = studentInfo7.addProductToFavorites("");
    boolean b11 = studentInfo7.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.util.List<java.lang.String> list_str15 = studentInfo13.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b19 = studentInfo17.addRestaurantToFavorites("hi!");
    studentInfo17.setCampusId("hi!");
    boolean b23 = studentInfo17.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo13.setFavProducts(list_str24);
    studentInfo7.setFavProducts(list_str24);
    studentInfo1.setFavProducts(list_str24);
    boolean b29 = studentInfo1.delProductFromFavorites("hi!");
    java.lang.String str30 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    java.lang.String str7 = studentInfo0.getCampusId();
    boolean b9 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b11 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    studentInfo1.setCampusId("");
    boolean b24 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    java.lang.String str3 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("hi!");
    java.lang.String str3 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b10 = studentInfo8.addProductToFavorites("");
    boolean b12 = studentInfo8.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b16 = studentInfo14.addProductToFavorites("");
    boolean b18 = studentInfo14.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str21 = studentInfo20.getFavProducts();
    java.util.List<java.lang.String> list_str22 = studentInfo20.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b26 = studentInfo24.addRestaurantToFavorites("hi!");
    studentInfo24.setCampusId("hi!");
    boolean b30 = studentInfo24.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo24.getFavRestaurants();
    studentInfo20.setFavProducts(list_str31);
    studentInfo14.setFavProducts(list_str31);
    studentInfo8.setFavProducts(list_str31);
    studentInfo0.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b43 = studentInfo41.addRestaurantToFavorites("hi!");
    studentInfo41.setCampusId("hi!");
    boolean b47 = studentInfo41.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str48 = studentInfo41.getFavRestaurants();
    studentInfo37.setFavProducts(list_str48);
    boolean b51 = studentInfo37.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str55 = studentInfo54.getFavProducts();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<java.lang.String>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str58, str_array57);
    studentInfo54.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str58);
    java.util.List<java.lang.String> list_str61 = studentInfo54.getFavRestaurants();
    studentInfo52.setFavRestaurants(list_str61);
    studentInfo37.setFavProducts(list_str61);
    studentInfo0.setFavProducts(list_str61);
    java.util.List<java.lang.String> list_str65 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b13 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    boolean b4 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str11 = studentInfo7.getFavProducts();
    studentInfo6.setFavProducts(list_str11);
    studentInfo6.setCampusId("hi!");
    java.lang.String str15 = studentInfo6.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str17 = studentInfo16.getFavProducts();
    boolean b19 = studentInfo16.addProductToFavorites("");
    studentInfo16.setCampusId("");
    boolean b23 = studentInfo16.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str24 = studentInfo16.getFavRestaurants();
    studentInfo6.setFavRestaurants(list_str24);
    studentInfo0.setFavProducts(list_str24);
    java.util.List<java.lang.String> list_str27 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");
    java.lang.String str9 = userInfo3.getType();
    userInfo3.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavRestaurants();
    studentInfo0.setFavProducts(list_str9);
    boolean b12 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b14 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    java.lang.String str9 = userInfo0.getLastName();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    boolean b24 = studentInfo1.addProductToFavorites("");
    boolean b26 = studentInfo1.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("hi!");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    java.lang.String str4 = ownerInfo0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str13, str_array12);
    studentInfo9.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str13);
    java.util.List<java.lang.String> list_str16 = studentInfo9.getFavRestaurants();
    java.lang.String str17 = studentInfo9.getCampusId();
    java.util.List<java.lang.String> list_str18 = studentInfo9.getFavRestaurants();
    studentInfo1.setFavProducts(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str13 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str13 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.delProductFromFavorites("");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavProducts();
    boolean b7 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str6);
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    boolean b15 = studentInfo13.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavProducts();
    studentInfo13.setFavRestaurants(list_str19);
    studentInfo8.setFavProducts(list_str19);
    studentInfo0.setFavRestaurants(list_str19);
    java.util.List<java.lang.String> list_str23 = studentInfo0.getFavProducts();
    boolean b25 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b27 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo28 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str29 = studentInfo28.getFavProducts();
    boolean b31 = studentInfo28.delProductFromFavorites("");
    java.lang.String str32 = studentInfo28.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    studentInfo34.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str38);
    java.util.List<java.lang.String> list_str41 = studentInfo34.getFavRestaurants();
    boolean b43 = studentInfo34.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo45 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str46 = studentInfo45.getFavProducts();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<java.lang.String>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str49, str_array48);
    studentInfo45.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str49);
    java.util.List<java.lang.String> list_str52 = studentInfo45.getFavRestaurants();
    studentInfo45.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo55 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str56 = studentInfo55.getFavProducts();
    boolean b58 = studentInfo55.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str59 = studentInfo55.getFavProducts();
    java.util.List<java.lang.String> list_str60 = studentInfo55.getFavProducts();
    studentInfo45.setFavProducts(list_str60);
    boolean b63 = studentInfo45.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str64 = studentInfo45.getFavProducts();
    studentInfo34.setFavRestaurants(list_str64);
    studentInfo28.setFavProducts(list_str64);
    studentInfo0.setFavProducts(list_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str64);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str6);
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    boolean b15 = studentInfo13.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavProducts();
    studentInfo13.setFavRestaurants(list_str19);
    studentInfo8.setFavProducts(list_str19);
    studentInfo0.setFavRestaurants(list_str19);
    java.util.List<java.lang.String> list_str23 = studentInfo0.getFavProducts();
    boolean b25 = studentInfo0.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.delProductFromFavorites("");
    boolean b31 = studentInfo26.delProductFromFavorites("");
    java.lang.String str32 = studentInfo26.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str34 = studentInfo33.getFavProducts();
    boolean b36 = studentInfo33.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str37 = studentInfo33.getFavProducts();
    java.util.List<java.lang.String> list_str38 = studentInfo33.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    studentInfo40.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    java.util.List<java.lang.String> list_str47 = studentInfo40.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo49 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str50 = studentInfo49.getFavProducts();
    java.util.List<java.lang.String> list_str51 = studentInfo49.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo53 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b55 = studentInfo53.addRestaurantToFavorites("hi!");
    studentInfo53.setCampusId("hi!");
    boolean b59 = studentInfo53.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str60 = studentInfo53.getFavRestaurants();
    studentInfo49.setFavProducts(list_str60);
    boolean b63 = studentInfo49.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str64 = studentInfo49.getFavRestaurants();
    java.util.List<java.lang.String> list_str65 = studentInfo49.getFavProducts();
    studentInfo40.setFavRestaurants(list_str65);
    studentInfo33.setFavProducts(list_str65);
    studentInfo26.setFavRestaurants(list_str65);
    studentInfo0.setFavProducts(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    java.lang.String str9 = userInfo0.getLastName();
    java.lang.String str10 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("hi!");
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    java.lang.String str7 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("");
    java.lang.String str12 = studentInfo0.getCampusId();
    boolean b14 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    boolean b17 = studentInfo15.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    java.util.List<java.lang.String> list_str21 = studentInfo19.getFavProducts();
    studentInfo15.setFavRestaurants(list_str21);
    java.util.List<java.lang.String> list_str23 = studentInfo15.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setType("");
    java.lang.String str12 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavProducts();
    boolean b13 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    studentInfo0.setCampusId("");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("");
    boolean b10 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    userInfo3.setFirstName("");
    userInfo3.setType("");
    java.lang.String str8 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    boolean b7 = studentInfo1.delProductFromFavorites("");
    boolean b9 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    boolean b7 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setType("");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    studentInfo0.setCampusId("");
    java.lang.String str19 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    studentInfo8.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str20 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str20);
    studentInfo0.setFavRestaurants(list_str20);
    java.lang.String str23 = studentInfo0.getCampusId();
    java.lang.String str24 = studentInfo0.getCampusId();
    boolean b26 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "hi!", "hi!");
    java.lang.String str4 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("hi!");
    java.lang.String str8 = userInfo0.getLastName();
    java.lang.String str9 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.lang.String str6 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str11 = studentInfo7.getFavProducts();
    java.util.List<java.lang.String> list_str12 = studentInfo7.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    studentInfo14.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str18);
    java.util.List<java.lang.String> list_str21 = studentInfo14.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    java.util.List<java.lang.String> list_str25 = studentInfo23.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b29 = studentInfo27.addRestaurantToFavorites("hi!");
    studentInfo27.setCampusId("hi!");
    boolean b33 = studentInfo27.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str34 = studentInfo27.getFavRestaurants();
    studentInfo23.setFavProducts(list_str34);
    boolean b37 = studentInfo23.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo23.getFavRestaurants();
    java.util.List<java.lang.String> list_str39 = studentInfo23.getFavProducts();
    studentInfo14.setFavRestaurants(list_str39);
    studentInfo7.setFavProducts(list_str39);
    studentInfo0.setFavRestaurants(list_str39);
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str44 = studentInfo43.getFavProducts();
    boolean b46 = studentInfo43.delProductFromFavorites("");
    boolean b48 = studentInfo43.delProductFromFavorites("");
    boolean b50 = studentInfo43.addProductToFavorites("");
    java.lang.String str51 = studentInfo43.getCampusId();
    studentInfo43.setCampusId("hi!");
    java.util.List<java.lang.String> list_str54 = studentInfo43.getFavProducts();
    studentInfo0.setFavProducts(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    java.lang.String str3 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    userInfo3.setType("hi!");

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    boolean b10 = studentInfo1.delRestaurantFromFavorites("");
    boolean b12 = studentInfo1.addProductToFavorites("");
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getType();
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("");
    userInfo0.setLastName("hi!");
    userInfo0.setType("");

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    boolean b12 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b14 = studentInfo1.addProductToFavorites("");
    boolean b16 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    java.lang.String str3 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    boolean b6 = studentInfo0.addProductToFavorites("hi!");
    boolean b8 = studentInfo0.addProductToFavorites("");
    boolean b10 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    java.lang.String str8 = userInfo3.getLastName();
    java.lang.String str9 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("hi!");
    java.lang.String str13 = userInfo0.getType();
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    boolean b9 = studentInfo7.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str13 = studentInfo11.getFavProducts();
    studentInfo7.setFavRestaurants(list_str13);
    studentInfo0.setFavRestaurants(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavRestaurants();
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str17 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavRestaurants();
    studentInfo1.setFavProducts(list_str19);
    boolean b22 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b24 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    java.lang.String str9 = userInfo0.getType();
    userInfo0.setFirstName("hi!");
    java.lang.String str12 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getType();
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    java.lang.String str7 = studentInfo0.getCampusId();
    boolean b9 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("hi!");
    java.lang.String str13 = userInfo0.getType();
    java.lang.String str14 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.lang.String str7 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str13 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str17 = studentInfo16.getFavProducts();
    java.util.List<java.lang.String> list_str18 = studentInfo16.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b22 = studentInfo20.addRestaurantToFavorites("hi!");
    studentInfo20.setCampusId("hi!");
    boolean b26 = studentInfo20.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str27 = studentInfo20.getFavRestaurants();
    studentInfo16.setFavProducts(list_str27);
    boolean b30 = studentInfo16.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo16.getFavRestaurants();
    java.util.List<java.lang.String> list_str32 = studentInfo16.getFavProducts();
    studentInfo7.setFavRestaurants(list_str32);
    studentInfo0.setFavProducts(list_str32);
    boolean b36 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b38 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    userInfo3.setLastName("");
    userInfo3.setFirstName("hi!");
    java.lang.String str12 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    boolean b11 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    boolean b17 = studentInfo14.addProductToFavorites("");
    studentInfo14.setCampusId("");
    boolean b21 = studentInfo14.delRestaurantFromFavorites("");
    boolean b23 = studentInfo14.delProductFromFavorites("");
    studentInfo14.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.addProductToFavorites("");
    studentInfo26.setCampusId("");
    boolean b33 = studentInfo26.delRestaurantFromFavorites("");
    boolean b35 = studentInfo26.delProductFromFavorites("");
    studentInfo26.setCampusId("hi!");
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    studentInfo26.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    studentInfo14.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    studentInfo13.setFavProducts((java.util.List<java.lang.String>)arraylist_str40);
    com.example.unifood.models.StudentInfo studentInfo45 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str46 = studentInfo45.getFavProducts();
    boolean b48 = studentInfo45.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str49 = studentInfo45.getFavProducts();
    studentInfo13.setFavRestaurants(list_str49);
    studentInfo0.setFavProducts(list_str49);
    studentInfo0.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("hi!");
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("");
    java.lang.String str12 = studentInfo0.getCampusId();
    boolean b14 = studentInfo0.addProductToFavorites("");
    boolean b16 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.lang.String str6 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.addProductToFavorites("");
    studentInfo8.setCampusId("");
    boolean b15 = studentInfo8.delRestaurantFromFavorites("");
    boolean b17 = studentInfo8.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array22);
    studentInfo19.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str23);
    java.util.List<java.lang.String> list_str26 = studentInfo19.getFavRestaurants();
    studentInfo19.setCampusId("hi!");
    boolean b30 = studentInfo19.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str32 = studentInfo31.getFavProducts();
    boolean b34 = studentInfo31.addProductToFavorites("");
    studentInfo31.setCampusId("");
    java.util.List<java.lang.String> list_str37 = studentInfo31.getFavProducts();
    studentInfo19.setFavRestaurants(list_str37);
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    boolean b41 = studentInfo39.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str44 = studentInfo43.getFavProducts();
    java.util.List<java.lang.String> list_str45 = studentInfo43.getFavProducts();
    studentInfo39.setFavRestaurants(list_str45);
    studentInfo19.setFavProducts(list_str45);
    studentInfo8.setFavProducts(list_str45);
    studentInfo0.setFavProducts(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("hi!");
    java.lang.String str8 = userInfo0.getLastName();
    java.lang.String str9 = userInfo0.getType();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b21 = studentInfo1.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    boolean b26 = studentInfo23.delProductFromFavorites("");
    boolean b28 = studentInfo23.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str29 = studentInfo23.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    boolean b33 = studentInfo30.delProductFromFavorites("");
    boolean b35 = studentInfo30.delProductFromFavorites("");
    boolean b37 = studentInfo30.addRestaurantToFavorites("");
    java.lang.String str38 = studentInfo30.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    studentInfo40.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    java.util.List<java.lang.String> list_str47 = studentInfo40.getFavRestaurants();
    studentInfo30.setFavRestaurants(list_str47);
    boolean b50 = studentInfo30.addRestaurantToFavorites("");
    java.lang.String str51 = studentInfo30.getCampusId();
    boolean b53 = studentInfo30.addProductToFavorites("");
    java.util.List<java.lang.String> list_str54 = studentInfo30.getFavRestaurants();
    studentInfo23.setFavRestaurants(list_str54);
    studentInfo1.setFavRestaurants(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addProductToFavorites("hi!");
    boolean b22 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    boolean b12 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("hi!");
    java.lang.String str3 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str15 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    studentInfo2.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str6);
    java.util.List<java.lang.String> list_str9 = studentInfo2.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str9);
    boolean b12 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delProductFromFavorites("hi!");
    boolean b6 = studentInfo1.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    boolean b12 = studentInfo1.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    studentInfo14.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str18);
    java.util.List<java.lang.String> list_str21 = studentInfo14.getFavRestaurants();
    studentInfo14.setCampusId("hi!");
    boolean b25 = studentInfo14.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.addProductToFavorites("");
    studentInfo26.setCampusId("");
    java.util.List<java.lang.String> list_str32 = studentInfo26.getFavProducts();
    studentInfo14.setFavRestaurants(list_str32);
    java.lang.String str34 = studentInfo14.getCampusId();
    java.util.List<java.lang.String> list_str35 = studentInfo14.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str35);
    java.lang.String str37 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b21 = studentInfo1.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    boolean b26 = studentInfo23.addProductToFavorites("");
    studentInfo23.setCampusId("");
    boolean b30 = studentInfo23.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo23.getFavRestaurants();
    boolean b33 = studentInfo23.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str34 = studentInfo23.getFavProducts();
    studentInfo1.setFavProducts(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    userInfo3.setType("hi!");
    userInfo3.setLastName("hi!");
    java.lang.String str8 = userInfo3.getFirstName();
    java.lang.String str9 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("");
    java.lang.String str12 = studentInfo0.getCampusId();
    java.lang.String str13 = studentInfo0.getCampusId();
    boolean b15 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    userInfo3.setFirstName("");
    userInfo3.setType("");
    userInfo3.setLastName("");

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str11 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getFirstName();
    java.lang.String str12 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    boolean b24 = studentInfo1.addProductToFavorites("");
    java.lang.String str25 = studentInfo1.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.addProductToFavorites("");
    studentInfo26.setCampusId("");
    boolean b33 = studentInfo26.delRestaurantFromFavorites("");
    boolean b35 = studentInfo26.delProductFromFavorites("");
    boolean b37 = studentInfo26.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    boolean b43 = studentInfo40.addProductToFavorites("");
    studentInfo40.setCampusId("");
    boolean b47 = studentInfo40.delRestaurantFromFavorites("");
    boolean b49 = studentInfo40.delProductFromFavorites("");
    studentInfo40.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str53 = studentInfo52.getFavProducts();
    boolean b55 = studentInfo52.addProductToFavorites("");
    studentInfo52.setCampusId("");
    boolean b59 = studentInfo52.delRestaurantFromFavorites("");
    boolean b61 = studentInfo52.delProductFromFavorites("");
    studentInfo52.setCampusId("hi!");
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str66 = new java.util.ArrayList<java.lang.String>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str66, str_array65);
    studentInfo52.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    studentInfo40.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str66);
    studentInfo39.setFavProducts((java.util.List<java.lang.String>)arraylist_str66);
    com.example.unifood.models.StudentInfo studentInfo71 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str72 = studentInfo71.getFavProducts();
    boolean b74 = studentInfo71.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str75 = studentInfo71.getFavProducts();
    studentInfo39.setFavRestaurants(list_str75);
    studentInfo26.setFavProducts(list_str75);
    studentInfo1.setFavProducts(list_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str75);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    boolean b9 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b11 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b13 = studentInfo0.delProductFromFavorites("");
    boolean b15 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b17 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    boolean b17 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b19 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getFirstName();
    java.lang.String str7 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str10 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    boolean b24 = studentInfo1.addProductToFavorites("");
    java.util.List<java.lang.String> list_str25 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b9 = studentInfo7.addProductToFavorites("");
    boolean b11 = studentInfo7.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.util.List<java.lang.String> list_str15 = studentInfo13.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b19 = studentInfo17.addRestaurantToFavorites("hi!");
    studentInfo17.setCampusId("hi!");
    boolean b23 = studentInfo17.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo13.setFavProducts(list_str24);
    studentInfo7.setFavProducts(list_str24);
    studentInfo1.setFavProducts(list_str24);
    boolean b29 = studentInfo1.delProductFromFavorites("hi!");
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str13 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    boolean b7 = studentInfo1.addProductToFavorites("");
    boolean b9 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.lang.String str10 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    boolean b21 = studentInfo12.delProductFromFavorites("");
    studentInfo12.setCampusId("hi!");
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    boolean b33 = studentInfo30.delProductFromFavorites("");
    boolean b35 = studentInfo30.delProductFromFavorites("");
    boolean b37 = studentInfo30.addRestaurantToFavorites("");
    java.lang.String str38 = studentInfo30.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    studentInfo40.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    java.util.List<java.lang.String> list_str47 = studentInfo40.getFavRestaurants();
    studentInfo30.setFavRestaurants(list_str47);
    boolean b50 = studentInfo30.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str51 = studentInfo30.getFavRestaurants();
    studentInfo0.setFavProducts(list_str51);
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str55 = studentInfo54.getFavProducts();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<java.lang.String>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str58, str_array57);
    studentInfo54.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str58);
    java.util.List<java.lang.String> list_str61 = studentInfo54.getFavRestaurants();
    java.lang.String str62 = studentInfo54.getCampusId();
    java.util.List<java.lang.String> list_str63 = studentInfo54.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str63);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    boolean b11 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");
    java.lang.String str9 = userInfo3.getLastName();
    java.lang.String str10 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    studentInfo8.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str20 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str20);
    studentInfo0.setFavRestaurants(list_str20);
    studentInfo0.setCampusId("");
    boolean b26 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    java.lang.String str7 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    boolean b9 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b11 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b13 = studentInfo0.delProductFromFavorites("");
    boolean b15 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setLastName("");
    java.lang.String str7 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str11 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setLastName("hi!");
    java.lang.String str13 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    studentInfo1.setCampusId("hi!");
    java.lang.String str10 = studentInfo1.getCampusId();
    boolean b12 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    boolean b9 = studentInfo1.delProductFromFavorites("");
    boolean b11 = studentInfo1.delProductFromFavorites("");
    studentInfo1.setCampusId("");
    boolean b15 = studentInfo1.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str10 = studentInfo6.getFavProducts();
    studentInfo1.setFavProducts(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str21 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    studentInfo23.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str27);
    java.util.List<java.lang.String> list_str30 = studentInfo23.getFavRestaurants();
    boolean b32 = studentInfo23.delRestaurantFromFavorites("hi!");
    boolean b34 = studentInfo23.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str36 = studentInfo35.getFavProducts();
    boolean b38 = studentInfo35.delProductFromFavorites("");
    boolean b40 = studentInfo35.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str41 = studentInfo35.getFavProducts();
    studentInfo23.setFavProducts(list_str41);
    studentInfo0.setFavProducts(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array21);
    studentInfo18.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str22);
    java.util.List<java.lang.String> list_str25 = studentInfo18.getFavRestaurants();
    studentInfo16.setFavRestaurants(list_str25);
    studentInfo1.setFavProducts(list_str25);
    boolean b29 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str17 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavRestaurants();
    studentInfo1.setFavProducts(list_str19);
    java.util.List<java.lang.String> list_str21 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    userInfo3.setLastName("");
    userInfo3.setLastName("");
    java.lang.String str12 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    boolean b21 = studentInfo12.delProductFromFavorites("");
    studentInfo12.setCampusId("hi!");
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    boolean b33 = studentInfo30.delProductFromFavorites("");
    boolean b35 = studentInfo30.delProductFromFavorites("");
    boolean b37 = studentInfo30.addRestaurantToFavorites("");
    java.lang.String str38 = studentInfo30.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    studentInfo40.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    java.util.List<java.lang.String> list_str47 = studentInfo40.getFavRestaurants();
    studentInfo30.setFavRestaurants(list_str47);
    boolean b50 = studentInfo30.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str51 = studentInfo30.getFavRestaurants();
    studentInfo0.setFavProducts(list_str51);
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str55 = studentInfo54.getFavProducts();
    java.util.List<java.lang.String> list_str56 = studentInfo54.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo58 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b60 = studentInfo58.addRestaurantToFavorites("hi!");
    studentInfo58.setCampusId("hi!");
    boolean b64 = studentInfo58.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str65 = studentInfo58.getFavRestaurants();
    studentInfo54.setFavProducts(list_str65);
    boolean b68 = studentInfo54.addProductToFavorites("hi!");
    boolean b70 = studentInfo54.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str71 = studentInfo54.getFavRestaurants();
    studentInfo0.setFavProducts(list_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str71);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("");
    java.lang.String str12 = studentInfo0.getCampusId();
    boolean b14 = studentInfo0.addProductToFavorites("hi!");
    java.lang.String str15 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b5 = studentInfo1.delProductFromFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    java.util.List<java.lang.String> list_str14 = studentInfo1.getFavProducts();
    boolean b16 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getLastName();
    java.lang.String str10 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getLastName();
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    boolean b12 = studentInfo7.delProductFromFavorites("");
    boolean b14 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str15 = studentInfo7.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo7.setFavRestaurants(list_str24);
    boolean b27 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo7.getCampusId();
    boolean b30 = studentInfo7.addProductToFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    boolean b34 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setFirstName("");
    userInfo0.setLastName("");
    java.lang.String str11 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo();
    boolean b7 = studentInfo5.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo9.getFavProducts();
    studentInfo5.setFavRestaurants(list_str11);
    studentInfo0.setFavProducts(list_str11);
    java.lang.String str14 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    boolean b20 = studentInfo17.delProductFromFavorites("");
    boolean b22 = studentInfo17.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str23 = studentInfo17.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    boolean b27 = studentInfo24.delProductFromFavorites("");
    boolean b29 = studentInfo24.delProductFromFavorites("");
    boolean b31 = studentInfo24.addRestaurantToFavorites("");
    java.lang.String str32 = studentInfo24.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    studentInfo34.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str38);
    java.util.List<java.lang.String> list_str41 = studentInfo34.getFavRestaurants();
    studentInfo24.setFavRestaurants(list_str41);
    boolean b44 = studentInfo24.addRestaurantToFavorites("");
    java.lang.String str45 = studentInfo24.getCampusId();
    boolean b47 = studentInfo24.addProductToFavorites("");
    java.util.List<java.lang.String> list_str48 = studentInfo24.getFavRestaurants();
    studentInfo17.setFavRestaurants(list_str48);
    java.util.List<java.lang.String> list_str50 = studentInfo17.getFavRestaurants();
    java.lang.String str51 = studentInfo17.getCampusId();
    boolean b53 = studentInfo17.addProductToFavorites("");
    java.util.List<java.lang.String> list_str54 = studentInfo17.getFavProducts();
    studentInfo0.setFavProducts(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    java.util.List<java.lang.String> list_str14 = studentInfo1.getFavProducts();
    java.lang.String str15 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    boolean b23 = studentInfo21.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo25.getFavProducts();
    studentInfo21.setFavRestaurants(list_str27);
    studentInfo1.setFavProducts(list_str27);
    boolean b31 = studentInfo1.addProductToFavorites("hi!");
    java.lang.String str32 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.delProductFromFavorites("");
    boolean b32 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    boolean b10 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setLastName("");
    userInfo3.setLastName("");
    java.lang.String str9 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavRestaurants();
    boolean b13 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setFirstName("");
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    java.lang.String str12 = userInfo0.getLastName();
    java.lang.String str13 = userInfo0.getType();
    java.lang.String str14 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str14 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b32 = studentInfo0.delProductFromFavorites("hi!");
    studentInfo0.setCampusId("hi!");
    boolean b36 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.addProductToFavorites("hi!");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("");
    java.lang.String str33 = studentInfo0.getCampusId();
    java.lang.String str34 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    java.lang.String str7 = studentInfo0.getCampusId();
    boolean b9 = studentInfo0.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavRestaurants();
    boolean b12 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getLastName();
    java.lang.String str7 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    boolean b23 = studentInfo1.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo25.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo29 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b31 = studentInfo29.addRestaurantToFavorites("hi!");
    studentInfo29.setCampusId("hi!");
    boolean b35 = studentInfo29.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo29.getFavRestaurants();
    studentInfo25.setFavProducts(list_str36);
    java.lang.String str38 = studentInfo25.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str40 = studentInfo39.getFavProducts();
    boolean b42 = studentInfo39.delRestaurantFromFavorites("");
    boolean b44 = studentInfo39.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo46 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b48 = studentInfo46.addRestaurantToFavorites("hi!");
    studentInfo46.setCampusId("hi!");
    boolean b52 = studentInfo46.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str53 = studentInfo46.getFavRestaurants();
    studentInfo39.setFavRestaurants(list_str53);
    studentInfo25.setFavProducts(list_str53);
    studentInfo1.setFavProducts(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getFirstName();
    java.lang.String str9 = userInfo3.getFirstName();
    java.lang.String str10 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    java.lang.String str10 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str16 = studentInfo12.getFavProducts();
    studentInfo10.setFavProducts(list_str16);
    studentInfo1.setFavProducts(list_str16);
    boolean b20 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    userInfo3.setType("hi!");
    userInfo3.setFirstName("");
    userInfo3.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    java.lang.String str12 = userInfo0.getLastName();
    java.lang.String str13 = userInfo0.getType();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    userInfo3.setType("hi!");
    userInfo3.setType("hi!");

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b8 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b10 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.addProductToFavorites("hi!");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("");
    boolean b34 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    boolean b4 = studentInfo2.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo2.setFavRestaurants(list_str7);
    studentInfo0.setFavProducts(list_str7);
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.addProductToFavorites("");
    studentInfo11.setCampusId("");
    boolean b18 = studentInfo11.delRestaurantFromFavorites("");
    boolean b20 = studentInfo11.delProductFromFavorites("");
    studentInfo11.setCampusId("");
    java.lang.String str23 = studentInfo11.getCampusId();
    java.lang.String str24 = studentInfo11.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.delProductFromFavorites("");
    boolean b30 = studentInfo25.delProductFromFavorites("");
    boolean b32 = studentInfo25.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str33 = studentInfo25.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo35.getFavProducts();
    studentInfo25.setFavProducts(list_str36);
    studentInfo11.setFavRestaurants(list_str36);
    studentInfo0.setFavProducts(list_str36);
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str42 = studentInfo41.getFavProducts();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<java.lang.String>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str45, str_array44);
    studentInfo41.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str45);
    java.util.List<java.lang.String> list_str48 = studentInfo41.getFavRestaurants();
    java.lang.String str49 = studentInfo41.getCampusId();
    java.util.List<java.lang.String> list_str50 = studentInfo41.getFavRestaurants();
    studentInfo0.setFavProducts(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    boolean b12 = studentInfo7.delProductFromFavorites("");
    boolean b14 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str15 = studentInfo7.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo7.setFavRestaurants(list_str24);
    boolean b27 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo7.getCampusId();
    boolean b30 = studentInfo7.addProductToFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    studentInfo0.setCampusId("");
    java.lang.String str35 = studentInfo0.getCampusId();
    boolean b37 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    studentInfo1.setCampusId("");

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str10 = studentInfo6.getFavProducts();
    studentInfo5.setFavProducts(list_str10);
    studentInfo1.setFavRestaurants(list_str10);
    java.lang.String str13 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    boolean b6 = studentInfo0.addProductToFavorites("hi!");
    boolean b8 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b19 = studentInfo1.delProductFromFavorites("hi!");
    boolean b21 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    boolean b23 = studentInfo21.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo25.getFavProducts();
    studentInfo21.setFavRestaurants(list_str27);
    studentInfo1.setFavProducts(list_str27);
    boolean b31 = studentInfo1.delProductFromFavorites("");
    java.lang.String str32 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    studentInfo1.setCampusId("");
    java.util.List<java.lang.String> list_str23 = studentInfo1.getFavProducts();
    java.lang.String str24 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "hi!", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    boolean b17 = studentInfo1.delRestaurantFromFavorites("hi!");
    studentInfo1.setCampusId("");
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str21 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    boolean b10 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    boolean b14 = studentInfo1.addProductToFavorites("hi!");
    boolean b16 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    boolean b8 = studentInfo0.addProductToFavorites("hi!");
    boolean b10 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setLastName("hi!");
    java.lang.String str13 = userInfo3.getFirstName();
    java.lang.String str14 = userInfo3.getFirstName();
    java.lang.String str15 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    boolean b12 = studentInfo7.delProductFromFavorites("");
    boolean b14 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str15 = studentInfo7.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo7.setFavRestaurants(list_str24);
    boolean b27 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo7.getCampusId();
    boolean b30 = studentInfo7.addProductToFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    studentInfo0.setCampusId("");
    java.lang.String str35 = studentInfo0.getCampusId();
    boolean b37 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b13 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str14 = studentInfo0.getFavProducts();
    boolean b16 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    java.lang.String str29 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setType("hi!");
    userInfo0.setLastName("hi!");
    java.lang.String str13 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("");
    userInfo0.setLastName("hi!");
    userInfo0.setLastName("hi!");
    java.lang.String str7 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setType("");
    userInfo0.setType("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    studentInfo0.setCampusId("");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    boolean b12 = studentInfo9.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    boolean b15 = studentInfo13.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavProducts();
    studentInfo13.setFavRestaurants(list_str19);
    studentInfo9.setFavRestaurants(list_str19);
    studentInfo0.setFavRestaurants(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo1.getFavProducts();
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str10, str_array9);
    studentInfo6.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str10);
    java.util.List<java.lang.String> list_str13 = studentInfo6.getFavRestaurants();
    studentInfo6.setCampusId("hi!");
    boolean b17 = studentInfo6.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    boolean b21 = studentInfo18.addProductToFavorites("");
    studentInfo18.setCampusId("");
    java.util.List<java.lang.String> list_str24 = studentInfo18.getFavProducts();
    studentInfo6.setFavRestaurants(list_str24);
    studentInfo6.setCampusId("");
    java.util.List<java.lang.String> list_str28 = studentInfo6.getFavProducts();
    studentInfo0.setFavRestaurants(list_str28);
    studentInfo0.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    studentInfo22.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    java.util.List<java.lang.String> list_str29 = studentInfo22.getFavRestaurants();
    studentInfo22.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo32 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str33 = studentInfo32.getFavProducts();
    boolean b35 = studentInfo32.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str36 = studentInfo32.getFavProducts();
    java.util.List<java.lang.String> list_str37 = studentInfo32.getFavProducts();
    studentInfo22.setFavProducts(list_str37);
    boolean b40 = studentInfo22.delRestaurantFromFavorites("hi!");
    boolean b42 = studentInfo22.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str43 = studentInfo22.getFavRestaurants();
    studentInfo0.setFavProducts(list_str43);
    studentInfo0.setCampusId("");
    java.lang.String str47 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    java.lang.String str10 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavProducts();
    boolean b22 = studentInfo1.addRestaurantToFavorites("");
    java.lang.String str23 = studentInfo1.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    boolean b27 = studentInfo24.delRestaurantFromFavorites("");
    boolean b29 = studentInfo24.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b33 = studentInfo31.addRestaurantToFavorites("hi!");
    studentInfo31.setCampusId("hi!");
    boolean b37 = studentInfo31.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo31.getFavRestaurants();
    studentInfo24.setFavRestaurants(list_str38);
    studentInfo1.setFavProducts(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    java.util.List<java.lang.String> list_str10 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b14 = studentInfo12.addRestaurantToFavorites("hi!");
    studentInfo12.setCampusId("hi!");
    boolean b18 = studentInfo12.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str19);
    boolean b22 = studentInfo8.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str23 = studentInfo8.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str23);
    java.util.List<java.lang.String> list_str25 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getFirstName();
    userInfo0.setType("");
    java.lang.String str8 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("");
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b5 = studentInfo1.delProductFromFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.delRestaurantFromFavorites("");
    boolean b24 = studentInfo19.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b28 = studentInfo26.addRestaurantToFavorites("hi!");
    studentInfo26.setCampusId("hi!");
    boolean b32 = studentInfo26.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo26.getFavRestaurants();
    studentInfo19.setFavRestaurants(list_str33);
    studentInfo0.setFavProducts(list_str33);
    boolean b37 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b39 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getLastName();
    userInfo0.setLastName("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b5 = studentInfo1.delProductFromFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b9 = studentInfo1.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b15 = studentInfo13.addProductToFavorites("");
    boolean b17 = studentInfo13.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    java.util.List<java.lang.String> list_str21 = studentInfo19.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b25 = studentInfo23.addRestaurantToFavorites("hi!");
    studentInfo23.setCampusId("hi!");
    boolean b29 = studentInfo23.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str30 = studentInfo23.getFavRestaurants();
    studentInfo19.setFavProducts(list_str30);
    studentInfo13.setFavProducts(list_str30);
    studentInfo0.setFavProducts(list_str30);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    boolean b39 = studentInfo36.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    studentInfo36.setFavRestaurants(list_str41);
    studentInfo0.setFavProducts(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b13 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b17 = studentInfo15.addRestaurantToFavorites("hi!");
    studentInfo15.setCampusId("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo15.getFavProducts();
    studentInfo0.setFavProducts(list_str20);
    java.lang.String str22 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavProducts();
    java.util.List<java.lang.String> list_str28 = studentInfo7.getFavProducts();
    studentInfo0.setFavProducts(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array21);
    studentInfo18.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str22);
    java.util.List<java.lang.String> list_str25 = studentInfo18.getFavRestaurants();
    studentInfo16.setFavRestaurants(list_str25);
    studentInfo1.setFavProducts(list_str25);
    boolean b29 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    boolean b33 = studentInfo30.addProductToFavorites("");
    studentInfo30.setCampusId("");
    boolean b37 = studentInfo30.delRestaurantFromFavorites("");
    boolean b39 = studentInfo30.delProductFromFavorites("");
    studentInfo30.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b45 = studentInfo43.addProductToFavorites("");
    boolean b47 = studentInfo43.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo49 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str50 = studentInfo49.getFavProducts();
    java.util.List<java.lang.String> list_str51 = studentInfo49.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo53 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b55 = studentInfo53.addRestaurantToFavorites("hi!");
    studentInfo53.setCampusId("hi!");
    boolean b59 = studentInfo53.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str60 = studentInfo53.getFavRestaurants();
    studentInfo49.setFavProducts(list_str60);
    studentInfo43.setFavProducts(list_str60);
    studentInfo30.setFavProducts(list_str60);
    studentInfo1.setFavProducts(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b7 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.util.List<java.lang.String> list_str9 = studentInfo7.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b13 = studentInfo11.addRestaurantToFavorites("hi!");
    studentInfo11.setCampusId("hi!");
    boolean b17 = studentInfo11.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    studentInfo7.setFavProducts(list_str18);
    studentInfo1.setFavProducts(list_str18);
    java.util.List<java.lang.String> list_str21 = studentInfo1.getFavProducts();
    java.lang.String str22 = studentInfo1.getCampusId();
    boolean b24 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str6 = studentInfo5.getFavProducts();
    java.util.List<java.lang.String> list_str7 = studentInfo5.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    java.util.List<java.lang.String> list_str9 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    studentInfo0.setFavProducts(list_str11);
    boolean b14 = studentInfo0.delProductFromFavorites("hi!");
    java.lang.String str15 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str17 = studentInfo1.getFavProducts();
    boolean b19 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    boolean b12 = studentInfo7.delProductFromFavorites("");
    boolean b14 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str15 = studentInfo7.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo7.setFavRestaurants(list_str24);
    boolean b27 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo7.getCampusId();
    boolean b30 = studentInfo7.addProductToFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    boolean b34 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.addProductToFavorites("");
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.addProductToFavorites("");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("");
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    boolean b12 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delProductFromFavorites("");
    boolean b18 = studentInfo13.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str21 = studentInfo20.getFavProducts();
    boolean b23 = studentInfo20.delProductFromFavorites("");
    boolean b25 = studentInfo20.delProductFromFavorites("");
    boolean b27 = studentInfo20.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo20.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<java.lang.String>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str34, str_array33);
    studentInfo30.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str34);
    java.util.List<java.lang.String> list_str37 = studentInfo30.getFavRestaurants();
    studentInfo20.setFavRestaurants(list_str37);
    boolean b40 = studentInfo20.addRestaurantToFavorites("");
    java.lang.String str41 = studentInfo20.getCampusId();
    boolean b43 = studentInfo20.addProductToFavorites("");
    java.util.List<java.lang.String> list_str44 = studentInfo20.getFavRestaurants();
    studentInfo13.setFavRestaurants(list_str44);
    java.util.List<java.lang.String> list_str46 = studentInfo13.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    java.lang.String str7 = studentInfo0.getCampusId();
    boolean b9 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b11 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str16 = studentInfo12.getFavProducts();
    java.util.List<java.lang.String> list_str17 = studentInfo12.getFavProducts();
    java.util.List<java.lang.String> list_str18 = studentInfo12.getFavProducts();
    studentInfo0.setFavProducts(list_str18);
    java.util.List<java.lang.String> list_str20 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    java.lang.String str8 = userInfo3.getFirstName();
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.addProductToFavorites("hi!");
    boolean b9 = studentInfo1.delRestaurantFromFavorites("");
    boolean b11 = studentInfo1.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delProductFromFavorites("");
    boolean b18 = studentInfo13.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavProducts(list_str19);
    java.util.List<java.lang.String> list_str21 = studentInfo1.getFavRestaurants();
    boolean b23 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    boolean b4 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo8.getFavProducts();
    studentInfo6.setFavProducts(list_str12);
    java.lang.String str14 = studentInfo6.getCampusId();
    java.util.List<java.lang.String> list_str15 = studentInfo6.getFavRestaurants();
    studentInfo0.setFavProducts(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getFirstName();
    java.lang.String str11 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavRestaurants();
    java.lang.String str12 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    boolean b8 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    java.lang.String str11 = userInfo0.getLastName();
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str13 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavRestaurants();
    java.lang.String str17 = studentInfo1.getCampusId();
    boolean b19 = studentInfo1.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str21 = studentInfo20.getFavProducts();
    boolean b23 = studentInfo20.delProductFromFavorites("");
    boolean b25 = studentInfo20.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str26 = studentInfo20.getFavRestaurants();
    studentInfo1.setFavProducts(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    studentInfo11.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str15);
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    studentInfo11.setCampusId("hi!");
    boolean b22 = studentInfo11.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    boolean b26 = studentInfo23.addProductToFavorites("");
    studentInfo23.setCampusId("");
    java.util.List<java.lang.String> list_str29 = studentInfo23.getFavProducts();
    studentInfo11.setFavRestaurants(list_str29);
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo();
    boolean b33 = studentInfo31.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo35.getFavProducts();
    java.util.List<java.lang.String> list_str37 = studentInfo35.getFavProducts();
    studentInfo31.setFavRestaurants(list_str37);
    studentInfo11.setFavProducts(list_str37);
    studentInfo0.setFavProducts(list_str37);
    java.util.List<java.lang.String> list_str41 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    boolean b4 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str5 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavRestaurants();
    boolean b10 = studentInfo0.addProductToFavorites("hi!");
    boolean b12 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b16 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    java.lang.String str4 = studentInfo1.getCampusId();
    java.lang.String str5 = studentInfo1.getCampusId();
    boolean b7 = studentInfo1.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    studentInfo8.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str20 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str20);
    studentInfo0.setFavRestaurants(list_str20);
    studentInfo0.setCampusId("");
    boolean b26 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    boolean b17 = studentInfo1.delRestaurantFromFavorites("hi!");
    studentInfo1.setCampusId("");
    boolean b21 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    boolean b7 = studentInfo1.addProductToFavorites("");
    boolean b9 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getLastName();
    userInfo3.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str21 = studentInfo0.getCampusId();
    boolean b23 = studentInfo0.addProductToFavorites("");
    boolean b25 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("");
    boolean b13 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b13 = studentInfo0.delRestaurantFromFavorites("");
    boolean b15 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    studentInfo1.setCampusId("hi!");
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setFirstName("");
    userInfo3.setFirstName("");
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("hi!");
    boolean b9 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    java.lang.String str4 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str13 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setLastName("");
    userInfo3.setLastName("");
    userInfo3.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    boolean b17 = studentInfo1.delRestaurantFromFavorites("hi!");
    studentInfo1.setCampusId("");
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    java.lang.String str7 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    studentInfo0.setFavProducts(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    studentInfo0.setCampusId("");
    boolean b8 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    boolean b18 = studentInfo10.delProductFromFavorites("");
    boolean b20 = studentInfo10.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    java.util.List<java.lang.String> list_str24 = studentInfo22.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b28 = studentInfo26.addRestaurantToFavorites("hi!");
    studentInfo26.setCampusId("hi!");
    boolean b32 = studentInfo26.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo26.getFavRestaurants();
    studentInfo22.setFavProducts(list_str33);
    boolean b36 = studentInfo22.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str40 = studentInfo39.getFavProducts();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str43, str_array42);
    studentInfo39.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str43);
    java.util.List<java.lang.String> list_str46 = studentInfo39.getFavRestaurants();
    studentInfo37.setFavRestaurants(list_str46);
    studentInfo22.setFavProducts(list_str46);
    boolean b50 = studentInfo22.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str53 = studentInfo52.getFavProducts();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str56, str_array55);
    studentInfo52.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str56);
    java.util.List<java.lang.String> list_str59 = studentInfo52.getFavRestaurants();
    java.lang.String str60 = studentInfo52.getCampusId();
    java.util.List<java.lang.String> list_str61 = studentInfo52.getFavRestaurants();
    studentInfo22.setFavRestaurants(list_str61);
    studentInfo10.setFavRestaurants(list_str61);
    com.example.unifood.models.StudentInfo studentInfo65 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo66 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str67 = studentInfo66.getFavProducts();
    boolean b69 = studentInfo66.addProductToFavorites("");
    studentInfo66.setCampusId("");
    boolean b73 = studentInfo66.delRestaurantFromFavorites("");
    boolean b75 = studentInfo66.delProductFromFavorites("");
    studentInfo66.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo78 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str79 = studentInfo78.getFavProducts();
    boolean b81 = studentInfo78.addProductToFavorites("");
    studentInfo78.setCampusId("");
    boolean b85 = studentInfo78.delRestaurantFromFavorites("");
    boolean b87 = studentInfo78.delProductFromFavorites("");
    studentInfo78.setCampusId("hi!");
    java.lang.String[] str_array91 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str92 = new java.util.ArrayList<java.lang.String>();
    boolean b93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str92, str_array91);
    studentInfo78.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str92);
    studentInfo66.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str92);
    studentInfo65.setFavProducts((java.util.List<java.lang.String>)arraylist_str92);
    studentInfo10.setFavProducts((java.util.List<java.lang.String>)arraylist_str92);
    studentInfo0.setFavProducts((java.util.List<java.lang.String>)arraylist_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    boolean b7 = studentInfo1.delProductFromFavorites("");
    java.lang.String str8 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str9 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    boolean b8 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str10 = null;
    studentInfo0.setFavRestaurants(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.delRestaurantFromFavorites("");
    boolean b24 = studentInfo19.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b28 = studentInfo26.addRestaurantToFavorites("hi!");
    studentInfo26.setCampusId("hi!");
    boolean b32 = studentInfo26.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo26.getFavRestaurants();
    studentInfo19.setFavRestaurants(list_str33);
    studentInfo0.setFavProducts(list_str33);
    boolean b37 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    java.lang.String str10 = userInfo0.getType();
    java.lang.String str11 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getLastName();
    java.lang.String str6 = userInfo3.getLastName();
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    studentInfo1.setCampusId("");
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b9 = studentInfo7.addRestaurantToFavorites("hi!");
    studentInfo7.setCampusId("hi!");
    boolean b13 = studentInfo7.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str14);
    boolean b17 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.lang.String str18 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str19 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    java.lang.String str14 = studentInfo1.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str16 = studentInfo15.getFavProducts();
    boolean b18 = studentInfo15.delRestaurantFromFavorites("");
    boolean b20 = studentInfo15.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b24 = studentInfo22.addRestaurantToFavorites("hi!");
    studentInfo22.setCampusId("hi!");
    boolean b28 = studentInfo22.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str29 = studentInfo22.getFavRestaurants();
    studentInfo15.setFavRestaurants(list_str29);
    studentInfo1.setFavProducts(list_str29);
    com.example.unifood.models.StudentInfo studentInfo32 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str33 = studentInfo32.getFavProducts();
    boolean b35 = studentInfo32.delProductFromFavorites("");
    boolean b37 = studentInfo32.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str38 = studentInfo32.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str40 = studentInfo39.getFavProducts();
    boolean b42 = studentInfo39.delProductFromFavorites("");
    boolean b44 = studentInfo39.delProductFromFavorites("");
    boolean b46 = studentInfo39.addRestaurantToFavorites("");
    java.lang.String str47 = studentInfo39.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo49 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str50 = studentInfo49.getFavProducts();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<java.lang.String>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str53, str_array52);
    studentInfo49.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str53);
    java.util.List<java.lang.String> list_str56 = studentInfo49.getFavRestaurants();
    studentInfo39.setFavRestaurants(list_str56);
    boolean b59 = studentInfo39.addRestaurantToFavorites("");
    java.lang.String str60 = studentInfo39.getCampusId();
    boolean b62 = studentInfo39.addProductToFavorites("");
    java.util.List<java.lang.String> list_str63 = studentInfo39.getFavRestaurants();
    studentInfo32.setFavRestaurants(list_str63);
    studentInfo32.setCampusId("");
    java.lang.String str67 = studentInfo32.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo69 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo70 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str71 = studentInfo70.getFavProducts();
    boolean b73 = studentInfo70.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str74 = studentInfo70.getFavProducts();
    studentInfo69.setFavProducts(list_str74);
    studentInfo32.setFavRestaurants(list_str74);
    studentInfo1.setFavRestaurants(list_str74);
    boolean b79 = studentInfo1.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + ""+ "'", str67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    boolean b9 = studentInfo0.delProductFromFavorites("hi!");
    boolean b11 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setLastName("hi!");
    java.lang.String str13 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setFirstName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavProducts();
    boolean b22 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    boolean b26 = studentInfo23.delProductFromFavorites("");
    boolean b28 = studentInfo23.delProductFromFavorites("");
    boolean b30 = studentInfo23.addProductToFavorites("");
    java.lang.String str31 = studentInfo23.getCampusId();
    studentInfo23.setCampusId("hi!");
    java.util.List<java.lang.String> list_str34 = studentInfo23.getFavProducts();
    studentInfo1.setFavProducts(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str21 = studentInfo0.getCampusId();
    boolean b23 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    boolean b27 = studentInfo24.delProductFromFavorites("");
    boolean b29 = studentInfo24.delProductFromFavorites("");
    boolean b31 = studentInfo24.addProductToFavorites("");
    java.lang.String str32 = studentInfo24.getCampusId();
    studentInfo24.setCampusId("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo24.getFavProducts();
    studentInfo0.setFavRestaurants(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    userInfo0.setFirstName("");
    userInfo0.setFirstName("hi!");
    userInfo0.setType("hi!");
    java.lang.String str16 = userInfo0.getLastName();
    java.lang.String str17 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    studentInfo8.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str20 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str20);
    studentInfo0.setFavRestaurants(list_str20);
    studentInfo0.setCampusId("hi!");
    java.lang.String str25 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo();
    boolean b7 = studentInfo5.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo9.getFavProducts();
    studentInfo5.setFavRestaurants(list_str11);
    studentInfo0.setFavProducts(list_str11);
    boolean b15 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str16 = studentInfo0.getFavRestaurants();
    boolean b18 = studentInfo0.addProductToFavorites("hi!");
    boolean b20 = studentInfo0.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str22 = studentInfo21.getFavProducts();
    boolean b24 = studentInfo21.addProductToFavorites("");
    studentInfo21.setCampusId("");
    boolean b28 = studentInfo21.delRestaurantFromFavorites("");
    boolean b30 = studentInfo21.delProductFromFavorites("");
    studentInfo21.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    studentInfo34.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str38);
    java.util.List<java.lang.String> list_str41 = studentInfo34.getFavRestaurants();
    studentInfo34.setCampusId("hi!");
    boolean b45 = studentInfo34.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo46 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str47 = studentInfo46.getFavProducts();
    boolean b49 = studentInfo46.addProductToFavorites("");
    studentInfo46.setCampusId("");
    java.util.List<java.lang.String> list_str52 = studentInfo46.getFavProducts();
    studentInfo34.setFavRestaurants(list_str52);
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo();
    boolean b56 = studentInfo54.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo58 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str59 = studentInfo58.getFavProducts();
    java.util.List<java.lang.String> list_str60 = studentInfo58.getFavProducts();
    studentInfo54.setFavRestaurants(list_str60);
    studentInfo34.setFavProducts(list_str60);
    studentInfo21.setFavProducts(list_str60);
    com.example.unifood.models.StudentInfo studentInfo65 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b67 = studentInfo65.addRestaurantToFavorites("hi!");
    java.lang.String str68 = studentInfo65.getCampusId();
    boolean b70 = studentInfo65.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo72 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str73 = studentInfo72.getFavProducts();
    java.util.List<java.lang.String> list_str74 = studentInfo72.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo76 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b78 = studentInfo76.addRestaurantToFavorites("hi!");
    studentInfo76.setCampusId("hi!");
    boolean b82 = studentInfo76.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str83 = studentInfo76.getFavRestaurants();
    studentInfo72.setFavProducts(list_str83);
    boolean b86 = studentInfo72.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str87 = studentInfo72.getFavRestaurants();
    studentInfo65.setFavRestaurants(list_str87);
    studentInfo21.setFavRestaurants(list_str87);
    boolean b91 = studentInfo21.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str92 = studentInfo21.getFavRestaurants();
    studentInfo0.setFavProducts(list_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!"+ "'", str68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str92);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.addProductToFavorites("");
    boolean b32 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b34 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.addProductToFavorites("");
    studentInfo7.setCampusId("");
    boolean b14 = studentInfo7.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getFirstName();
    java.lang.String str7 = userInfo0.getType();
    java.lang.String str8 = userInfo0.getLastName();
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str9 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getFirstName();
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.addProductToFavorites("");
    studentInfo2.setCampusId("");
    boolean b9 = studentInfo2.delRestaurantFromFavorites("");
    boolean b11 = studentInfo2.delProductFromFavorites("");
    studentInfo2.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    boolean b17 = studentInfo14.addProductToFavorites("");
    studentInfo14.setCampusId("");
    boolean b21 = studentInfo14.delRestaurantFromFavorites("");
    boolean b23 = studentInfo14.delProductFromFavorites("");
    studentInfo14.setCampusId("hi!");
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    studentInfo14.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    studentInfo2.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    studentInfo1.setFavProducts((java.util.List<java.lang.String>)arraylist_str28);
    boolean b34 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    java.lang.String str10 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("");
    boolean b25 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setLastName("");
    userInfo3.setLastName("");
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    boolean b7 = studentInfo1.delProductFromFavorites("");
    java.lang.String str8 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavProducts();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str13 = studentInfo1.getFavProducts();
    boolean b15 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str6 = studentInfo1.getFavRestaurants();
    boolean b8 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavRestaurants();
    studentInfo0.setFavProducts(list_str9);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    studentInfo14.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str18);
    java.util.List<java.lang.String> list_str21 = studentInfo14.getFavRestaurants();
    studentInfo14.setCampusId("hi!");
    boolean b25 = studentInfo14.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.addProductToFavorites("");
    studentInfo26.setCampusId("");
    java.util.List<java.lang.String> list_str32 = studentInfo26.getFavProducts();
    studentInfo14.setFavRestaurants(list_str32);
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    boolean b36 = studentInfo34.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo38 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str39 = studentInfo38.getFavProducts();
    java.util.List<java.lang.String> list_str40 = studentInfo38.getFavProducts();
    studentInfo34.setFavRestaurants(list_str40);
    studentInfo14.setFavProducts(list_str40);
    studentInfo0.setFavProducts(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    userInfo3.setType("hi!");
    java.lang.String str6 = userInfo3.getFirstName();
    java.lang.String str7 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    java.lang.String str9 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    java.lang.String str12 = userInfo0.getFirstName();
    java.lang.String str13 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("");
    java.lang.String str10 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    userInfo0.setFirstName("");
    userInfo0.setFirstName("hi!");
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    boolean b9 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    studentInfo11.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str15);
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    boolean b20 = studentInfo11.delRestaurantFromFavorites("hi!");
    boolean b22 = studentInfo11.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    boolean b26 = studentInfo23.delProductFromFavorites("");
    boolean b28 = studentInfo23.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str29 = studentInfo23.getFavProducts();
    studentInfo11.setFavProducts(list_str29);
    java.util.List<java.lang.String> list_str31 = studentInfo11.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.delProductFromFavorites("");
    boolean b17 = studentInfo12.delProductFromFavorites("");
    boolean b19 = studentInfo12.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str21 = studentInfo20.getFavRestaurants();
    studentInfo12.setFavProducts(list_str21);
    studentInfo0.setFavRestaurants(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str16);
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str21 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    boolean b25 = studentInfo22.delProductFromFavorites("");
    boolean b27 = studentInfo22.delProductFromFavorites("");
    boolean b29 = studentInfo22.addRestaurantToFavorites("");
    java.lang.String str30 = studentInfo22.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo32 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo32.getFavProducts();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    studentInfo32.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str36);
    java.util.List<java.lang.String> list_str39 = studentInfo32.getFavRestaurants();
    studentInfo22.setFavRestaurants(list_str39);
    boolean b42 = studentInfo22.addRestaurantToFavorites("");
    java.lang.String str43 = studentInfo22.getCampusId();
    boolean b45 = studentInfo22.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str46 = studentInfo22.getFavProducts();
    studentInfo22.setCampusId("hi!");
    java.util.List<java.lang.String> list_str49 = studentInfo22.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str6);
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    boolean b15 = studentInfo13.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavProducts();
    studentInfo13.setFavRestaurants(list_str19);
    studentInfo8.setFavProducts(list_str19);
    studentInfo0.setFavRestaurants(list_str19);
    java.util.List<java.lang.String> list_str23 = studentInfo0.getFavProducts();
    boolean b25 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b27 = studentInfo0.addRestaurantToFavorites("");
    boolean b29 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "hi!", "");
    userInfo3.setFirstName("");
    java.lang.String str6 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setType("");
    userInfo0.setLastName("hi!");
    userInfo0.setLastName("hi!");
    java.lang.String str7 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    java.lang.String str7 = userInfo0.getLastName();
    userInfo0.setFirstName("");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    boolean b8 = studentInfo0.delProductFromFavorites("");
    boolean b10 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    studentInfo1.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    studentInfo11.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str15);
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    studentInfo1.setFavProducts(list_str18);
    java.lang.String str20 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    userInfo0.setLastName("hi!");
    java.lang.String str8 = userInfo0.getLastName();
    java.lang.String str9 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    boolean b4 = studentInfo2.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo2.setFavRestaurants(list_str7);
    studentInfo0.setFavProducts(list_str7);
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b14 = studentInfo12.addRestaurantToFavorites("hi!");
    java.lang.String str15 = studentInfo12.getCampusId();
    boolean b17 = studentInfo12.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    java.util.List<java.lang.String> list_str21 = studentInfo19.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b25 = studentInfo23.addRestaurantToFavorites("hi!");
    studentInfo23.setCampusId("hi!");
    boolean b29 = studentInfo23.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str30 = studentInfo23.getFavRestaurants();
    studentInfo19.setFavProducts(list_str30);
    boolean b33 = studentInfo19.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str34 = studentInfo19.getFavRestaurants();
    studentInfo12.setFavRestaurants(list_str34);
    studentInfo0.setFavRestaurants(list_str34);
    boolean b38 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    boolean b4 = studentInfo1.delProductFromFavorites("hi!");
    java.lang.String str5 = studentInfo1.getCampusId();
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    boolean b8 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    java.lang.String str7 = userInfo3.getType();
    java.lang.String str8 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    java.lang.String str9 = userInfo0.getLastName();
    java.lang.String str10 = userInfo0.getFirstName();
    java.lang.String str11 = userInfo0.getType();
    java.lang.String str12 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b19 = studentInfo1.delProductFromFavorites("hi!");
    boolean b21 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getLastName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array21);
    studentInfo18.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str22);
    java.util.List<java.lang.String> list_str25 = studentInfo18.getFavRestaurants();
    studentInfo16.setFavRestaurants(list_str25);
    studentInfo1.setFavProducts(list_str25);
    boolean b29 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str32 = studentInfo31.getFavProducts();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    studentInfo31.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str35);
    java.util.List<java.lang.String> list_str38 = studentInfo31.getFavRestaurants();
    java.lang.String str39 = studentInfo31.getCampusId();
    java.util.List<java.lang.String> list_str40 = studentInfo31.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str40);
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str44 = studentInfo43.getFavProducts();
    java.util.List<java.lang.String> list_str45 = studentInfo43.getFavProducts();
    java.lang.String str46 = studentInfo43.getCampusId();
    boolean b48 = studentInfo43.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo49 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str50 = studentInfo49.getFavProducts();
    boolean b52 = studentInfo49.delProductFromFavorites("");
    boolean b54 = studentInfo49.delProductFromFavorites("");
    boolean b56 = studentInfo49.addRestaurantToFavorites("");
    java.lang.String str57 = studentInfo49.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo59 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str60 = studentInfo59.getFavProducts();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str63 = new java.util.ArrayList<java.lang.String>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str63, str_array62);
    studentInfo59.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str63);
    java.util.List<java.lang.String> list_str66 = studentInfo59.getFavRestaurants();
    studentInfo49.setFavRestaurants(list_str66);
    boolean b69 = studentInfo49.addRestaurantToFavorites("");
    java.lang.String str70 = studentInfo49.getCampusId();
    boolean b72 = studentInfo49.addProductToFavorites("");
    java.util.List<java.lang.String> list_str73 = studentInfo49.getFavRestaurants();
    studentInfo43.setFavProducts(list_str73);
    studentInfo1.setFavRestaurants(list_str73);
    java.lang.String str76 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!"+ "'", str76.equals("hi!"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b10 = studentInfo8.addProductToFavorites("");
    boolean b12 = studentInfo8.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b16 = studentInfo14.addProductToFavorites("");
    boolean b18 = studentInfo14.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo20 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str21 = studentInfo20.getFavProducts();
    java.util.List<java.lang.String> list_str22 = studentInfo20.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b26 = studentInfo24.addRestaurantToFavorites("hi!");
    studentInfo24.setCampusId("hi!");
    boolean b30 = studentInfo24.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo24.getFavRestaurants();
    studentInfo20.setFavProducts(list_str31);
    studentInfo14.setFavProducts(list_str31);
    studentInfo8.setFavProducts(list_str31);
    studentInfo0.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b43 = studentInfo41.addRestaurantToFavorites("hi!");
    studentInfo41.setCampusId("hi!");
    boolean b47 = studentInfo41.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str48 = studentInfo41.getFavRestaurants();
    studentInfo37.setFavProducts(list_str48);
    boolean b51 = studentInfo37.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str55 = studentInfo54.getFavProducts();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<java.lang.String>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str58, str_array57);
    studentInfo54.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str58);
    java.util.List<java.lang.String> list_str61 = studentInfo54.getFavRestaurants();
    studentInfo52.setFavRestaurants(list_str61);
    studentInfo37.setFavProducts(list_str61);
    studentInfo0.setFavProducts(list_str61);
    com.example.unifood.models.StudentInfo studentInfo65 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str66 = studentInfo65.getFavProducts();
    boolean b68 = studentInfo65.addProductToFavorites("");
    studentInfo65.setCampusId("");
    boolean b72 = studentInfo65.delRestaurantFromFavorites("");
    boolean b74 = studentInfo65.delProductFromFavorites("");
    studentInfo65.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo77 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str78 = studentInfo77.getFavProducts();
    boolean b80 = studentInfo77.addProductToFavorites("");
    studentInfo77.setCampusId("");
    boolean b84 = studentInfo77.delRestaurantFromFavorites("");
    boolean b86 = studentInfo77.delProductFromFavorites("");
    studentInfo77.setCampusId("hi!");
    java.lang.String[] str_array90 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str91 = new java.util.ArrayList<java.lang.String>();
    boolean b92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str91, str_array90);
    studentInfo77.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str91);
    studentInfo65.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str91);
    java.util.List<java.lang.String> list_str95 = studentInfo65.getFavRestaurants();
    studentInfo0.setFavProducts(list_str95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str95);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    java.lang.String str9 = userInfo0.getLastName();
    userInfo0.setType("");
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    java.util.List<java.lang.String> list_str10 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b14 = studentInfo12.addRestaurantToFavorites("hi!");
    studentInfo12.setCampusId("hi!");
    boolean b18 = studentInfo12.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo8.setFavProducts(list_str19);
    boolean b22 = studentInfo8.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str23 = studentInfo8.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str23);
    java.lang.String str25 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("");
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str9 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    java.lang.String str10 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b8 = studentInfo1.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str9 = studentInfo1.getFavProducts();
    boolean b11 = studentInfo1.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("");
    boolean b13 = studentInfo0.addRestaurantToFavorites("");
    boolean b15 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    java.lang.String str9 = userInfo0.getLastName();
    java.lang.String str10 = userInfo0.getLastName();
    java.lang.String str11 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    java.lang.String str21 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    boolean b24 = studentInfo1.addProductToFavorites("");
    java.lang.String str25 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.addProductToFavorites("");
    studentInfo7.setCampusId("");
    java.util.List<java.lang.String> list_str13 = studentInfo7.getFavProducts();
    studentInfo1.setFavProducts(list_str13);
    boolean b16 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    java.util.List<java.lang.String> list_str20 = studentInfo18.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b24 = studentInfo22.addRestaurantToFavorites("hi!");
    studentInfo22.setCampusId("hi!");
    boolean b28 = studentInfo22.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str29 = studentInfo22.getFavRestaurants();
    studentInfo18.setFavProducts(list_str29);
    boolean b32 = studentInfo18.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo35.getFavProducts();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<java.lang.String>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str39, str_array38);
    studentInfo35.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str39);
    java.util.List<java.lang.String> list_str42 = studentInfo35.getFavRestaurants();
    studentInfo33.setFavRestaurants(list_str42);
    studentInfo18.setFavProducts(list_str42);
    boolean b46 = studentInfo18.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str49 = studentInfo48.getFavProducts();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str52, str_array51);
    studentInfo48.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str52);
    java.util.List<java.lang.String> list_str55 = studentInfo48.getFavRestaurants();
    java.lang.String str56 = studentInfo48.getCampusId();
    java.util.List<java.lang.String> list_str57 = studentInfo48.getFavRestaurants();
    studentInfo18.setFavRestaurants(list_str57);
    com.example.unifood.models.StudentInfo studentInfo60 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str61 = studentInfo60.getFavProducts();
    java.util.List<java.lang.String> list_str62 = studentInfo60.getFavProducts();
    java.lang.String str63 = studentInfo60.getCampusId();
    boolean b65 = studentInfo60.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo66 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str67 = studentInfo66.getFavProducts();
    boolean b69 = studentInfo66.delProductFromFavorites("");
    boolean b71 = studentInfo66.delProductFromFavorites("");
    boolean b73 = studentInfo66.addRestaurantToFavorites("");
    java.lang.String str74 = studentInfo66.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo76 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str77 = studentInfo76.getFavProducts();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str80 = new java.util.ArrayList<java.lang.String>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str80, str_array79);
    studentInfo76.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str80);
    java.util.List<java.lang.String> list_str83 = studentInfo76.getFavRestaurants();
    studentInfo66.setFavRestaurants(list_str83);
    boolean b86 = studentInfo66.addRestaurantToFavorites("");
    java.lang.String str87 = studentInfo66.getCampusId();
    boolean b89 = studentInfo66.addProductToFavorites("");
    java.util.List<java.lang.String> list_str90 = studentInfo66.getFavRestaurants();
    studentInfo60.setFavProducts(list_str90);
    studentInfo18.setFavRestaurants(list_str90);
    studentInfo1.setFavProducts(list_str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!"+ "'", str63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str90);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.addProductToFavorites("");
    studentInfo6.setCampusId("");
    boolean b13 = studentInfo6.delRestaurantFromFavorites("");
    boolean b15 = studentInfo6.delProductFromFavorites("");
    studentInfo6.setCampusId("hi!");
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    studentInfo6.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str20);
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b26 = studentInfo24.addRestaurantToFavorites("hi!");
    studentInfo24.setCampusId("hi!");
    boolean b30 = studentInfo24.delRestaurantFromFavorites("");
    studentInfo24.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    studentInfo34.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str38);
    java.util.List<java.lang.String> list_str41 = studentInfo34.getFavRestaurants();
    studentInfo24.setFavProducts(list_str41);
    java.util.List<java.lang.String> list_str43 = studentInfo24.getFavProducts();
    studentInfo6.setFavRestaurants(list_str43);
    studentInfo0.setFavProducts(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    java.lang.String str1 = ownerInfo0.getRestaurantId();
    java.lang.String str2 = ownerInfo0.getRestaurantId();
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("");
    java.lang.String str6 = ownerInfo0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("hi!");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getLastName();
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    boolean b12 = studentInfo7.delProductFromFavorites("");
    boolean b14 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str15 = studentInfo7.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo7.setFavRestaurants(list_str24);
    boolean b27 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo7.getCampusId();
    boolean b30 = studentInfo7.addProductToFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    java.util.List<java.lang.String> list_str33 = studentInfo0.getFavRestaurants();
    java.lang.String str34 = studentInfo0.getCampusId();
    boolean b36 = studentInfo0.addProductToFavorites("");
    boolean b38 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    boolean b8 = studentInfo0.delProductFromFavorites("hi!");
    boolean b10 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getLastName();
    java.lang.String str10 = userInfo0.getType();
    java.lang.String str11 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    boolean b10 = studentInfo7.delProductFromFavorites("");
    boolean b12 = studentInfo7.delProductFromFavorites("");
    boolean b14 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str15 = studentInfo7.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo7.setFavRestaurants(list_str24);
    boolean b27 = studentInfo7.addRestaurantToFavorites("");
    java.lang.String str28 = studentInfo7.getCampusId();
    boolean b30 = studentInfo7.addProductToFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str31);
    java.util.List<java.lang.String> list_str33 = studentInfo0.getFavRestaurants();
    java.lang.String str34 = studentInfo0.getCampusId();
    boolean b36 = studentInfo0.addProductToFavorites("");
    java.util.List<java.lang.String> list_str37 = studentInfo0.getFavProducts();
    boolean b39 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavProducts();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str6 = studentInfo5.getFavProducts();
    java.util.List<java.lang.String> list_str7 = studentInfo5.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    boolean b10 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delProductFromFavorites("");
    boolean b18 = studentInfo13.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavProducts(list_str19);
    java.util.List<java.lang.String> list_str21 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str23 = studentInfo1.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str12 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str6);
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    boolean b15 = studentInfo13.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavProducts();
    studentInfo13.setFavRestaurants(list_str19);
    studentInfo8.setFavProducts(list_str19);
    studentInfo0.setFavRestaurants(list_str19);
    boolean b24 = studentInfo0.delProductFromFavorites("");
    boolean b26 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    java.lang.String str7 = userInfo0.getLastName();
    userInfo0.setFirstName("");
    userInfo0.setType("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str10 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo1.getFavProducts();
    java.lang.String str12 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.delRestaurantFromFavorites("");
    boolean b24 = studentInfo19.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b28 = studentInfo26.addRestaurantToFavorites("hi!");
    studentInfo26.setCampusId("hi!");
    boolean b32 = studentInfo26.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo26.getFavRestaurants();
    studentInfo19.setFavRestaurants(list_str33);
    studentInfo0.setFavProducts(list_str33);
    boolean b37 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo39 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str40 = studentInfo39.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str42 = studentInfo41.getFavProducts();
    boolean b44 = studentInfo41.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str45 = studentInfo41.getFavProducts();
    studentInfo39.setFavProducts(list_str45);
    studentInfo0.setFavRestaurants(list_str45);
    studentInfo0.setCampusId("");
    boolean b51 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");
    java.lang.String str9 = userInfo3.getLastName();
    java.lang.String str10 = userInfo3.getFirstName();
    userInfo3.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    java.lang.String str7 = userInfo3.getType();
    userInfo3.setLastName("");
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");
    userInfo3.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.addProductToFavorites("hi!");
    boolean b9 = studentInfo1.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    userInfo0.setType("");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    java.lang.String str12 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("hi!");
    java.lang.String str13 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b23 = studentInfo21.addRestaurantToFavorites("hi!");
    boolean b25 = studentInfo21.delProductFromFavorites("hi!");
    studentInfo21.setCampusId("hi!");
    studentInfo21.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    studentInfo30.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    boolean b37 = studentInfo34.addProductToFavorites("");
    studentInfo34.setCampusId("");
    boolean b41 = studentInfo34.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str42 = studentInfo34.getFavRestaurants();
    studentInfo30.setFavProducts(list_str42);
    studentInfo21.setFavProducts(list_str42);
    studentInfo1.setFavRestaurants(list_str42);
    boolean b47 = studentInfo1.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    boolean b10 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    boolean b9 = studentInfo0.addProductToFavorites("");
    boolean b11 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    java.lang.String str11 = userInfo0.getLastName();
    java.lang.String str12 = userInfo0.getFirstName();
    java.lang.String str13 = userInfo0.getType();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    java.lang.String str5 = studentInfo1.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.util.List<java.lang.String> list_str9 = studentInfo7.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b13 = studentInfo11.addRestaurantToFavorites("hi!");
    studentInfo11.setCampusId("hi!");
    boolean b17 = studentInfo11.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    studentInfo7.setFavProducts(list_str18);
    boolean b21 = studentInfo7.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str22 = studentInfo7.getFavRestaurants();
    java.util.List<java.lang.String> list_str23 = studentInfo7.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    boolean b27 = studentInfo24.delProductFromFavorites("");
    boolean b29 = studentInfo24.delProductFromFavorites("");
    boolean b31 = studentInfo24.addRestaurantToFavorites("");
    java.lang.String str32 = studentInfo24.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    studentInfo34.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str38);
    java.util.List<java.lang.String> list_str41 = studentInfo34.getFavRestaurants();
    studentInfo24.setFavRestaurants(list_str41);
    boolean b44 = studentInfo24.addRestaurantToFavorites("");
    java.lang.String str45 = studentInfo24.getCampusId();
    boolean b47 = studentInfo24.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str48 = studentInfo24.getFavProducts();
    java.util.List<java.lang.String> list_str49 = studentInfo24.getFavProducts();
    studentInfo7.setFavRestaurants(list_str49);
    studentInfo1.setFavRestaurants(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    java.lang.String str11 = userInfo0.getLastName();
    userInfo0.setLastName("hi!");
    java.lang.String str14 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str10 = studentInfo6.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo6.getFavProducts();
    studentInfo1.setFavProducts(list_str11);
    java.lang.String str13 = studentInfo1.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo9.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b15 = studentInfo13.addRestaurantToFavorites("hi!");
    studentInfo13.setCampusId("hi!");
    boolean b19 = studentInfo13.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo13.getFavRestaurants();
    studentInfo9.setFavProducts(list_str20);
    boolean b23 = studentInfo9.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo9.getFavRestaurants();
    java.util.List<java.lang.String> list_str25 = studentInfo9.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.delProductFromFavorites("");
    boolean b31 = studentInfo26.delProductFromFavorites("");
    boolean b33 = studentInfo26.addRestaurantToFavorites("");
    java.lang.String str34 = studentInfo26.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    studentInfo36.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    java.util.List<java.lang.String> list_str43 = studentInfo36.getFavRestaurants();
    studentInfo26.setFavRestaurants(list_str43);
    boolean b46 = studentInfo26.addRestaurantToFavorites("");
    java.lang.String str47 = studentInfo26.getCampusId();
    boolean b49 = studentInfo26.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str50 = studentInfo26.getFavProducts();
    java.util.List<java.lang.String> list_str51 = studentInfo26.getFavProducts();
    studentInfo9.setFavRestaurants(list_str51);
    studentInfo1.setFavRestaurants(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str6);
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo8.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    boolean b15 = studentInfo13.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.util.List<java.lang.String> list_str19 = studentInfo17.getFavProducts();
    studentInfo13.setFavRestaurants(list_str19);
    studentInfo8.setFavProducts(list_str19);
    studentInfo0.setFavRestaurants(list_str19);
    java.util.List<java.lang.String> list_str23 = studentInfo0.getFavProducts();
    boolean b25 = studentInfo0.delRestaurantFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavRestaurants();
    boolean b10 = studentInfo0.addProductToFavorites("hi!");
    boolean b12 = studentInfo0.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delProductFromFavorites("");
    boolean b18 = studentInfo13.delProductFromFavorites("");
    boolean b20 = studentInfo13.addRestaurantToFavorites("");
    java.lang.String str21 = studentInfo13.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo23.getFavProducts();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    studentInfo23.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str27);
    java.util.List<java.lang.String> list_str30 = studentInfo23.getFavRestaurants();
    studentInfo13.setFavRestaurants(list_str30);
    boolean b33 = studentInfo13.addRestaurantToFavorites("");
    java.lang.String str34 = studentInfo13.getCampusId();
    boolean b36 = studentInfo13.addProductToFavorites("");
    java.util.List<java.lang.String> list_str37 = studentInfo13.getFavRestaurants();
    studentInfo0.setFavProducts(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getFirstName();
    java.lang.String str6 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavProducts();
    boolean b11 = studentInfo8.addProductToFavorites("");
    studentInfo8.setCampusId("");
    boolean b15 = studentInfo8.delRestaurantFromFavorites("");
    boolean b17 = studentInfo8.delProductFromFavorites("");
    studentInfo8.setCampusId("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo8.getFavProducts();
    studentInfo1.setFavProducts(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    boolean b21 = studentInfo12.delProductFromFavorites("");
    studentInfo12.setCampusId("hi!");
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    boolean b33 = studentInfo30.delProductFromFavorites("");
    boolean b35 = studentInfo30.delProductFromFavorites("");
    boolean b37 = studentInfo30.addRestaurantToFavorites("");
    java.lang.String str38 = studentInfo30.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    studentInfo40.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str44);
    java.util.List<java.lang.String> list_str47 = studentInfo40.getFavRestaurants();
    studentInfo30.setFavRestaurants(list_str47);
    boolean b50 = studentInfo30.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str51 = studentInfo30.getFavRestaurants();
    studentInfo0.setFavProducts(list_str51);
    com.example.unifood.models.StudentInfo studentInfo54 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str55 = studentInfo54.getFavProducts();
    java.util.List<java.lang.String> list_str56 = studentInfo54.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo58 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b60 = studentInfo58.addRestaurantToFavorites("hi!");
    studentInfo58.setCampusId("hi!");
    boolean b64 = studentInfo58.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str65 = studentInfo58.getFavRestaurants();
    studentInfo54.setFavProducts(list_str65);
    java.util.List<java.lang.String> list_str67 = studentInfo54.getFavProducts();
    studentInfo0.setFavProducts(list_str67);
    com.example.unifood.models.StudentInfo studentInfo69 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str70 = studentInfo69.getFavProducts();
    boolean b72 = studentInfo69.delProductFromFavorites("");
    boolean b74 = studentInfo69.delProductFromFavorites("");
    boolean b76 = studentInfo69.addRestaurantToFavorites("");
    java.lang.String str77 = studentInfo69.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo79 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str80 = studentInfo79.getFavProducts();
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str83 = new java.util.ArrayList<java.lang.String>();
    boolean b84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str83, str_array82);
    studentInfo79.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str83);
    java.util.List<java.lang.String> list_str86 = studentInfo79.getFavRestaurants();
    studentInfo69.setFavRestaurants(list_str86);
    boolean b89 = studentInfo69.addRestaurantToFavorites("");
    java.lang.String str90 = studentInfo69.getCampusId();
    boolean b92 = studentInfo69.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str93 = studentInfo69.getFavProducts();
    boolean b95 = studentInfo69.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str96 = studentInfo69.getFavRestaurants();
    studentInfo0.setFavProducts(list_str96);
    boolean b99 = studentInfo0.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str5 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setFirstName("hi!");
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavProducts();
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    boolean b9 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b11 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str12 = studentInfo0.getFavRestaurants();
    java.lang.String str13 = studentInfo0.getCampusId();
    java.util.List<java.lang.String> list_str14 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    studentInfo1.setCampusId("hi!");
    boolean b13 = studentInfo1.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo15.getFavProducts();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    studentInfo15.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str19);
    java.util.List<java.lang.String> list_str22 = studentInfo15.getFavRestaurants();
    studentInfo15.setCampusId("hi!");
    boolean b26 = studentInfo15.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str28 = studentInfo27.getFavProducts();
    boolean b30 = studentInfo27.addProductToFavorites("");
    studentInfo27.setCampusId("");
    java.util.List<java.lang.String> list_str33 = studentInfo27.getFavProducts();
    studentInfo15.setFavRestaurants(list_str33);
    studentInfo1.setFavRestaurants(list_str33);
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo();
    boolean b38 = studentInfo36.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo40 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str41 = studentInfo40.getFavProducts();
    studentInfo36.setFavRestaurants(list_str41);
    java.lang.String str43 = studentInfo36.getCampusId();
    boolean b45 = studentInfo36.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str46 = studentInfo36.getFavRestaurants();
    studentInfo1.setFavRestaurants(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    boolean b10 = studentInfo1.delRestaurantFromFavorites("");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("hi!");
    ownerInfo0.setRestaurantId("");
    ownerInfo0.setRestaurantId("");
    ownerInfo0.setRestaurantId("hi!");

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("hi!");
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    boolean b12 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    boolean b14 = studentInfo1.addProductToFavorites("hi!");
    boolean b16 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str16 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str17 = studentInfo1.getFavProducts();
    boolean b19 = studentInfo1.delProductFromFavorites("");
    boolean b21 = studentInfo1.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array16);
    studentInfo13.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str17);
    java.util.List<java.lang.String> list_str20 = studentInfo13.getFavRestaurants();
    studentInfo13.setCampusId("hi!");
    boolean b24 = studentInfo13.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.addProductToFavorites("");
    studentInfo25.setCampusId("");
    java.util.List<java.lang.String> list_str31 = studentInfo25.getFavProducts();
    studentInfo13.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    boolean b35 = studentInfo33.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    studentInfo33.setFavRestaurants(list_str39);
    studentInfo13.setFavProducts(list_str39);
    studentInfo0.setFavProducts(list_str39);
    com.example.unifood.models.StudentInfo studentInfo44 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b46 = studentInfo44.addRestaurantToFavorites("hi!");
    java.lang.String str47 = studentInfo44.getCampusId();
    boolean b49 = studentInfo44.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo51 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str52 = studentInfo51.getFavProducts();
    java.util.List<java.lang.String> list_str53 = studentInfo51.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo55 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b57 = studentInfo55.addRestaurantToFavorites("hi!");
    studentInfo55.setCampusId("hi!");
    boolean b61 = studentInfo55.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str62 = studentInfo55.getFavRestaurants();
    studentInfo51.setFavProducts(list_str62);
    boolean b65 = studentInfo51.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str66 = studentInfo51.getFavRestaurants();
    studentInfo44.setFavRestaurants(list_str66);
    studentInfo0.setFavRestaurants(list_str66);
    boolean b70 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str71 = studentInfo0.getFavRestaurants();
    java.util.List<java.lang.String> list_str72 = studentInfo0.getFavProducts();
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str72);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("hi!");
    java.lang.String str13 = userInfo0.getLastName();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array16);
    studentInfo13.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str17);
    java.util.List<java.lang.String> list_str20 = studentInfo13.getFavRestaurants();
    studentInfo13.setCampusId("hi!");
    boolean b24 = studentInfo13.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.addProductToFavorites("");
    studentInfo25.setCampusId("");
    java.util.List<java.lang.String> list_str31 = studentInfo25.getFavProducts();
    studentInfo13.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    boolean b35 = studentInfo33.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    studentInfo33.setFavRestaurants(list_str39);
    studentInfo13.setFavProducts(list_str39);
    studentInfo0.setFavProducts(list_str39);
    com.example.unifood.models.StudentInfo studentInfo44 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b46 = studentInfo44.addRestaurantToFavorites("hi!");
    java.lang.String str47 = studentInfo44.getCampusId();
    boolean b49 = studentInfo44.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo51 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str52 = studentInfo51.getFavProducts();
    java.util.List<java.lang.String> list_str53 = studentInfo51.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo55 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b57 = studentInfo55.addRestaurantToFavorites("hi!");
    studentInfo55.setCampusId("hi!");
    boolean b61 = studentInfo55.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str62 = studentInfo55.getFavRestaurants();
    studentInfo51.setFavProducts(list_str62);
    boolean b65 = studentInfo51.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str66 = studentInfo51.getFavRestaurants();
    studentInfo44.setFavRestaurants(list_str66);
    studentInfo0.setFavRestaurants(list_str66);
    boolean b70 = studentInfo0.delProductFromFavorites("");
    boolean b72 = studentInfo0.delProductFromFavorites("hi!");
    boolean b74 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    ownerInfo1.setRestaurantId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setFirstName("hi!");
    java.lang.String str11 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str6 = studentInfo5.getFavProducts();
    java.util.List<java.lang.String> list_str7 = studentInfo5.getFavProducts();
    studentInfo0.setFavRestaurants(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getFirstName();
    java.lang.String str10 = userInfo0.getFirstName();
    java.lang.String str11 = userInfo0.getFirstName();
    java.lang.String str12 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array16);
    studentInfo13.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str17);
    java.util.List<java.lang.String> list_str20 = studentInfo13.getFavRestaurants();
    studentInfo13.setCampusId("hi!");
    boolean b24 = studentInfo13.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.addProductToFavorites("");
    studentInfo25.setCampusId("");
    java.util.List<java.lang.String> list_str31 = studentInfo25.getFavProducts();
    studentInfo13.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    boolean b35 = studentInfo33.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    studentInfo33.setFavRestaurants(list_str39);
    studentInfo13.setFavProducts(list_str39);
    studentInfo0.setFavProducts(list_str39);
    boolean b44 = studentInfo0.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str45 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo47 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str48 = studentInfo47.getFavProducts();
    java.util.List<java.lang.String> list_str49 = studentInfo47.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo51 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b53 = studentInfo51.addRestaurantToFavorites("hi!");
    studentInfo51.setCampusId("hi!");
    boolean b57 = studentInfo51.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str58 = studentInfo51.getFavRestaurants();
    studentInfo47.setFavProducts(list_str58);
    boolean b61 = studentInfo47.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo62 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo64 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str65 = studentInfo64.getFavProducts();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str68 = new java.util.ArrayList<java.lang.String>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str68, str_array67);
    studentInfo64.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str68);
    java.util.List<java.lang.String> list_str71 = studentInfo64.getFavRestaurants();
    studentInfo62.setFavRestaurants(list_str71);
    studentInfo47.setFavProducts(list_str71);
    studentInfo0.setFavRestaurants(list_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str71);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    studentInfo7.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str11);
    java.util.List<java.lang.String> list_str14 = studentInfo7.getFavRestaurants();
    studentInfo7.setCampusId("hi!");
    boolean b18 = studentInfo7.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.addProductToFavorites("");
    studentInfo19.setCampusId("");
    java.util.List<java.lang.String> list_str25 = studentInfo19.getFavProducts();
    studentInfo7.setFavRestaurants(list_str25);
    java.util.List<java.lang.String> list_str27 = studentInfo7.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str27);
    boolean b30 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b32 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("");
    userInfo0.setLastName("");
    java.lang.String str8 = userInfo0.getLastName();
    userInfo0.setType("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    boolean b20 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str21 = studentInfo0.getFavProducts();
    boolean b23 = studentInfo0.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b5 = studentInfo1.delProductFromFavorites("hi!");
    boolean b7 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    java.lang.String str5 = userInfo3.getType();
    userInfo3.setLastName("");
    userInfo3.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo10.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    java.util.List<java.lang.String> list_str17 = studentInfo10.getFavRestaurants();
    studentInfo0.setFavRestaurants(list_str17);
    java.lang.String str19 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    java.lang.String str9 = studentInfo0.getCampusId();
    boolean b11 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getFirstName();
    java.lang.String str12 = userInfo0.getType();
    userInfo0.setFirstName("hi!");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    java.lang.String str8 = userInfo3.getLastName();
    userInfo3.setFirstName("hi!");
    userInfo3.setType("");
    java.lang.String str13 = userInfo3.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getLastName();
    java.lang.String str7 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getLastName();
    java.lang.String str12 = userInfo0.getLastName();
    java.lang.String str13 = userInfo0.getLastName();
    userInfo0.setFirstName("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    studentInfo0.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str14);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.delRestaurantFromFavorites("");
    boolean b24 = studentInfo19.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b28 = studentInfo26.addRestaurantToFavorites("hi!");
    studentInfo26.setCampusId("hi!");
    boolean b32 = studentInfo26.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo26.getFavRestaurants();
    studentInfo19.setFavRestaurants(list_str33);
    studentInfo0.setFavProducts(list_str33);
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.addProductToFavorites("");
    studentInfo13.setCampusId("");
    java.util.List<java.lang.String> list_str19 = studentInfo13.getFavProducts();
    studentInfo1.setFavRestaurants(list_str19);
    studentInfo1.setCampusId("");
    java.util.List<java.lang.String> list_str23 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    boolean b27 = studentInfo24.addProductToFavorites("");
    studentInfo24.setCampusId("");
    boolean b31 = studentInfo24.delRestaurantFromFavorites("");
    boolean b33 = studentInfo24.delProductFromFavorites("");
    boolean b35 = studentInfo24.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    studentInfo37.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str41);
    java.util.List<java.lang.String> list_str44 = studentInfo37.getFavRestaurants();
    studentInfo37.setCampusId("hi!");
    boolean b48 = studentInfo37.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo49 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str50 = studentInfo49.getFavProducts();
    boolean b52 = studentInfo49.addProductToFavorites("");
    studentInfo49.setCampusId("");
    java.util.List<java.lang.String> list_str55 = studentInfo49.getFavProducts();
    studentInfo37.setFavRestaurants(list_str55);
    java.util.List<java.lang.String> list_str57 = studentInfo37.getFavRestaurants();
    studentInfo24.setFavRestaurants(list_str57);
    studentInfo1.setFavProducts(list_str57);
    com.example.unifood.models.StudentInfo studentInfo61 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str62 = studentInfo61.getFavProducts();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str65 = new java.util.ArrayList<java.lang.String>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str65, str_array64);
    studentInfo61.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str65);
    java.util.List<java.lang.String> list_str68 = studentInfo61.getFavRestaurants();
    studentInfo61.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo71 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str72 = studentInfo71.getFavProducts();
    boolean b74 = studentInfo71.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str75 = studentInfo71.getFavProducts();
    java.util.List<java.lang.String> list_str76 = studentInfo71.getFavProducts();
    studentInfo61.setFavProducts(list_str76);
    java.util.List<java.lang.String> list_str78 = studentInfo61.getFavRestaurants();
    studentInfo1.setFavProducts(list_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str78);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo7 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo7.getFavProducts();
    java.util.List<java.lang.String> list_str9 = studentInfo7.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b13 = studentInfo11.addRestaurantToFavorites("hi!");
    studentInfo11.setCampusId("hi!");
    boolean b17 = studentInfo11.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo11.getFavRestaurants();
    studentInfo7.setFavProducts(list_str18);
    studentInfo1.setFavProducts(list_str18);
    boolean b22 = studentInfo1.addProductToFavorites("");
    boolean b24 = studentInfo1.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array16);
    studentInfo13.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str17);
    java.util.List<java.lang.String> list_str20 = studentInfo13.getFavRestaurants();
    studentInfo13.setCampusId("hi!");
    boolean b24 = studentInfo13.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.addProductToFavorites("");
    studentInfo25.setCampusId("");
    java.util.List<java.lang.String> list_str31 = studentInfo25.getFavProducts();
    studentInfo13.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    boolean b35 = studentInfo33.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    studentInfo33.setFavRestaurants(list_str39);
    studentInfo13.setFavProducts(list_str39);
    studentInfo0.setFavProducts(list_str39);
    boolean b44 = studentInfo0.addProductToFavorites("hi!");
    boolean b46 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavRestaurants();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.delRestaurantFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    studentInfo1.setFavProducts((java.util.List<java.lang.String>)arraylist_str19);
    com.example.unifood.models.StudentInfo studentInfo23 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    boolean b27 = studentInfo24.addProductToFavorites("");
    boolean b29 = studentInfo24.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str32 = studentInfo31.getFavProducts();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    studentInfo31.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str35);
    java.util.List<java.lang.String> list_str38 = studentInfo31.getFavRestaurants();
    studentInfo31.setCampusId("hi!");
    boolean b42 = studentInfo31.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str44 = studentInfo43.getFavProducts();
    boolean b46 = studentInfo43.addProductToFavorites("");
    studentInfo43.setCampusId("");
    java.util.List<java.lang.String> list_str49 = studentInfo43.getFavProducts();
    studentInfo31.setFavRestaurants(list_str49);
    java.util.List<java.lang.String> list_str51 = studentInfo31.getFavRestaurants();
    studentInfo24.setFavRestaurants(list_str51);
    studentInfo23.setFavRestaurants(list_str51);
    studentInfo1.setFavProducts(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo3 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str4 = studentInfo3.getFavProducts();
    boolean b6 = studentInfo3.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str7 = studentInfo3.getFavProducts();
    studentInfo1.setFavProducts(list_str7);
    boolean b10 = studentInfo1.delRestaurantFromFavorites("");
    boolean b12 = studentInfo1.addProductToFavorites("");
    java.util.List<java.lang.String> list_str13 = studentInfo1.getFavProducts();
    boolean b15 = studentInfo1.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    boolean b14 = studentInfo11.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo11.getFavProducts();
    java.util.List<java.lang.String> list_str16 = studentInfo11.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    boolean b19 = studentInfo1.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavProducts();
    boolean b22 = studentInfo1.addRestaurantToFavorites("");
    boolean b24 = studentInfo1.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    userInfo3.setLastName("");
    userInfo3.setFirstName("hi!");
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array16);
    studentInfo13.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str17);
    java.util.List<java.lang.String> list_str20 = studentInfo13.getFavRestaurants();
    studentInfo13.setCampusId("hi!");
    boolean b24 = studentInfo13.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.addProductToFavorites("");
    studentInfo25.setCampusId("");
    java.util.List<java.lang.String> list_str31 = studentInfo25.getFavProducts();
    studentInfo13.setFavRestaurants(list_str31);
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    boolean b35 = studentInfo33.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo37.getFavProducts();
    studentInfo33.setFavRestaurants(list_str39);
    studentInfo13.setFavProducts(list_str39);
    studentInfo0.setFavProducts(list_str39);
    boolean b44 = studentInfo0.addProductToFavorites("hi!");
    boolean b46 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getFirstName();
    java.lang.String str7 = userInfo0.getType();
    java.lang.String str8 = userInfo0.getLastName();
    userInfo0.setType("");
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addProductToFavorites("");
    boolean b4 = studentInfo0.addRestaurantToFavorites("");
    boolean b6 = studentInfo0.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavProducts();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addRestaurantToFavorites("");
    boolean b14 = studentInfo1.addRestaurantToFavorites("");
    boolean b16 = studentInfo1.addProductToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.delProductFromFavorites("");
    boolean b11 = studentInfo6.delProductFromFavorites("");
    boolean b13 = studentInfo6.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str14 = studentInfo6.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str17 = studentInfo16.getFavProducts();
    studentInfo6.setFavProducts(list_str17);
    studentInfo1.setFavRestaurants(list_str17);
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    studentInfo22.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str26);
    java.util.List<java.lang.String> list_str29 = studentInfo22.getFavRestaurants();
    studentInfo22.setCampusId("hi!");
    boolean b33 = studentInfo22.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    boolean b37 = studentInfo34.addProductToFavorites("");
    studentInfo34.setCampusId("");
    java.util.List<java.lang.String> list_str40 = studentInfo34.getFavProducts();
    studentInfo22.setFavRestaurants(list_str40);
    studentInfo22.setCampusId("");
    java.util.List<java.lang.String> list_str44 = studentInfo22.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo45 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str46 = studentInfo45.getFavProducts();
    boolean b48 = studentInfo45.addProductToFavorites("");
    studentInfo45.setCampusId("");
    boolean b52 = studentInfo45.delRestaurantFromFavorites("");
    boolean b54 = studentInfo45.delProductFromFavorites("");
    boolean b56 = studentInfo45.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo58 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str59 = studentInfo58.getFavProducts();
    java.lang.String[] str_array61 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str62 = new java.util.ArrayList<java.lang.String>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str62, str_array61);
    studentInfo58.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str62);
    java.util.List<java.lang.String> list_str65 = studentInfo58.getFavRestaurants();
    studentInfo58.setCampusId("hi!");
    boolean b69 = studentInfo58.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo70 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str71 = studentInfo70.getFavProducts();
    boolean b73 = studentInfo70.addProductToFavorites("");
    studentInfo70.setCampusId("");
    java.util.List<java.lang.String> list_str76 = studentInfo70.getFavProducts();
    studentInfo58.setFavRestaurants(list_str76);
    java.util.List<java.lang.String> list_str78 = studentInfo58.getFavRestaurants();
    studentInfo45.setFavRestaurants(list_str78);
    studentInfo22.setFavProducts(list_str78);
    studentInfo1.setFavProducts(list_str78);
    boolean b83 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

}
