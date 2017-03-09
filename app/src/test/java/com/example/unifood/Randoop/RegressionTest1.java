
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    
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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavProducts();
    boolean b11 = studentInfo0.addProductToFavorites("");
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    java.lang.String str1 = ownerInfo0.getRestaurantId();
    java.lang.String str2 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("");
    java.lang.String str5 = ownerInfo0.getRestaurantId();
    java.lang.String str6 = ownerInfo0.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addProductToFavorites("");
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
    studentInfo1.setFavProducts(list_str31);
    java.util.List<java.lang.String> list_str33 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
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

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

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
    boolean b24 = studentInfo1.delRestaurantFromFavorites("hi!");
    
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
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("hi!");
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getType();
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    boolean b8 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str10 = studentInfo9.getFavProducts();
    boolean b12 = studentInfo9.addProductToFavorites("");
    studentInfo9.setCampusId("");
    boolean b16 = studentInfo9.delRestaurantFromFavorites("");
    boolean b18 = studentInfo9.delProductFromFavorites("");
    studentInfo9.setCampusId("hi!");
    java.util.List<java.lang.String> list_str21 = studentInfo9.getFavProducts();
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
    studentInfo9.setFavProducts(list_str46);
    studentInfo0.setFavProducts(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
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

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setType("hi!");
    userInfo0.setLastName("hi!");
    userInfo0.setLastName("hi!");
    java.lang.String str15 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    java.lang.String str10 = studentInfo1.getCampusId();
    boolean b12 = studentInfo1.delRestaurantFromFavorites("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

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
    boolean b38 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str39 = studentInfo1.getFavProducts();
    
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
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addProductToFavorites("");
    java.lang.String str8 = studentInfo0.getCampusId();
    studentInfo0.setCampusId("hi!");
    boolean b12 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b14 = studentInfo0.delRestaurantFromFavorites("");
    
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
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    userInfo0.setFirstName("hi!");
    java.lang.String str11 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

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
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b29 = studentInfo27.addRestaurantToFavorites("hi!");
    java.lang.String str30 = studentInfo27.getCampusId();
    boolean b32 = studentInfo27.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    java.util.List<java.lang.String> list_str36 = studentInfo34.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo38 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b40 = studentInfo38.addRestaurantToFavorites("hi!");
    studentInfo38.setCampusId("hi!");
    boolean b44 = studentInfo38.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str45 = studentInfo38.getFavRestaurants();
    studentInfo34.setFavProducts(list_str45);
    boolean b48 = studentInfo34.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str49 = studentInfo34.getFavRestaurants();
    studentInfo27.setFavRestaurants(list_str49);
    java.util.List<java.lang.String> list_str51 = studentInfo27.getFavRestaurants();
    studentInfo0.setFavProducts(list_str51);
    
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    java.lang.String str1 = ownerInfo0.getRestaurantId();
    java.lang.String str2 = ownerInfo0.getRestaurantId();
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    java.lang.String str4 = ownerInfo0.getRestaurantId();
    
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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

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
    boolean b18 = studentInfo0.addProductToFavorites("hi!");
    boolean b20 = studentInfo0.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str21 = studentInfo0.getFavRestaurants();
    boolean b23 = studentInfo0.addProductToFavorites("hi!");
    
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
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo2.getFavProducts();
    studentInfo1.setFavProducts(list_str6);
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo11 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo11.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str17 = studentInfo13.getFavProducts();
    studentInfo11.setFavProducts(list_str17);
    java.lang.String str19 = studentInfo11.getCampusId();
    java.util.List<java.lang.String> list_str20 = studentInfo11.getFavRestaurants();
    boolean b22 = studentInfo11.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    studentInfo24.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    java.util.List<java.lang.String> list_str31 = studentInfo24.getFavRestaurants();
    studentInfo24.setCampusId("hi!");
    boolean b35 = studentInfo24.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    boolean b39 = studentInfo36.addProductToFavorites("");
    studentInfo36.setCampusId("");
    java.util.List<java.lang.String> list_str42 = studentInfo36.getFavProducts();
    studentInfo24.setFavRestaurants(list_str42);
    java.lang.String str44 = studentInfo24.getCampusId();
    java.util.List<java.lang.String> list_str45 = studentInfo24.getFavRestaurants();
    studentInfo11.setFavRestaurants(list_str45);
    studentInfo1.setFavRestaurants(list_str45);
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str49 = studentInfo48.getFavProducts();
    boolean b51 = studentInfo48.delProductFromFavorites("");
    boolean b53 = studentInfo48.delProductFromFavorites("");
    boolean b55 = studentInfo48.addProductToFavorites("");
    java.lang.String str56 = studentInfo48.getCampusId();
    studentInfo48.setCampusId("hi!");
    java.util.List<java.lang.String> list_str59 = studentInfo48.getFavProducts();
    studentInfo1.setFavProducts(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

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
    boolean b36 = studentInfo0.delProductFromFavorites("");
    boolean b38 = studentInfo0.addProductToFavorites("hi!");
    
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
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

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
    java.util.List<java.lang.String> list_str20 = studentInfo1.getFavRestaurants();
    
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
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    boolean b9 = studentInfo1.delProductFromFavorites("");
    boolean b11 = studentInfo1.addProductToFavorites("hi!");
    boolean b13 = studentInfo1.addRestaurantToFavorites("hi!");
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
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setFirstName("hi!");
    userInfo3.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str15 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

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
    boolean b44 = studentInfo0.delRestaurantFromFavorites("hi!");
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
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b13 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    boolean b17 = studentInfo14.addProductToFavorites("");
    boolean b19 = studentInfo14.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo21 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str22 = studentInfo21.getFavProducts();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array24);
    studentInfo21.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str25);
    java.util.List<java.lang.String> list_str28 = studentInfo21.getFavRestaurants();
    studentInfo21.setCampusId("hi!");
    boolean b32 = studentInfo21.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str34 = studentInfo33.getFavProducts();
    boolean b36 = studentInfo33.addProductToFavorites("");
    studentInfo33.setCampusId("");
    java.util.List<java.lang.String> list_str39 = studentInfo33.getFavProducts();
    studentInfo21.setFavRestaurants(list_str39);
    java.util.List<java.lang.String> list_str41 = studentInfo21.getFavRestaurants();
    studentInfo14.setFavRestaurants(list_str41);
    boolean b44 = studentInfo14.delProductFromFavorites("");
    java.lang.String str45 = studentInfo14.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo46 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str47 = studentInfo46.getFavProducts();
    boolean b49 = studentInfo46.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str50 = studentInfo46.getFavProducts();
    studentInfo14.setFavProducts(list_str50);
    studentInfo0.setFavRestaurants(list_str50);
    
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
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");
    userInfo3.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("");
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str10 = ownerInfo1.getRestaurantId();
    java.lang.String str11 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    java.lang.String str1 = ownerInfo0.getRestaurantId();
    java.lang.String str2 = ownerInfo0.getRestaurantId();
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b5 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b9 = studentInfo1.delRestaurantFromFavorites("");
    boolean b11 = studentInfo1.addRestaurantToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

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
    studentInfo1.setCampusId("hi!");
    boolean b25 = studentInfo1.addRestaurantToFavorites("");
    
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
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    java.lang.String str7 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    java.util.List<java.lang.String> list_str11 = null;
    studentInfo1.setFavRestaurants(list_str11);
    
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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

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
    boolean b36 = studentInfo0.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str37 = studentInfo0.getFavProducts();
    
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

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

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
    java.util.List<java.lang.String> list_str23 = studentInfo1.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b27 = studentInfo25.addProductToFavorites("");
    boolean b29 = studentInfo25.delRestaurantFromFavorites("");
    java.lang.String str30 = studentInfo25.getCampusId();
    boolean b32 = studentInfo25.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo25.getFavRestaurants();
    boolean b35 = studentInfo25.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    boolean b39 = studentInfo36.addProductToFavorites("");
    studentInfo36.setCampusId("");
    boolean b43 = studentInfo36.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str44 = studentInfo36.getFavRestaurants();
    studentInfo25.setFavProducts(list_str44);
    studentInfo1.setFavProducts(list_str44);
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
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setLastName("hi!");
    userInfo3.setType("hi!");
    userInfo3.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

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
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    studentInfo36.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    boolean b44 = studentInfo36.delProductFromFavorites("");
    boolean b46 = studentInfo36.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str49 = studentInfo48.getFavProducts();
    java.util.List<java.lang.String> list_str50 = studentInfo48.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b54 = studentInfo52.addRestaurantToFavorites("hi!");
    studentInfo52.setCampusId("hi!");
    boolean b58 = studentInfo52.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str59 = studentInfo52.getFavRestaurants();
    studentInfo48.setFavProducts(list_str59);
    boolean b62 = studentInfo48.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo63 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo65 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str66 = studentInfo65.getFavProducts();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str69 = new java.util.ArrayList<java.lang.String>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str69, str_array68);
    studentInfo65.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str69);
    java.util.List<java.lang.String> list_str72 = studentInfo65.getFavRestaurants();
    studentInfo63.setFavRestaurants(list_str72);
    studentInfo48.setFavProducts(list_str72);
    boolean b76 = studentInfo48.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo78 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str79 = studentInfo78.getFavProducts();
    java.lang.String[] str_array81 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str82 = new java.util.ArrayList<java.lang.String>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str82, str_array81);
    studentInfo78.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str82);
    java.util.List<java.lang.String> list_str85 = studentInfo78.getFavRestaurants();
    java.lang.String str86 = studentInfo78.getCampusId();
    java.util.List<java.lang.String> list_str87 = studentInfo78.getFavRestaurants();
    studentInfo48.setFavRestaurants(list_str87);
    studentInfo36.setFavRestaurants(list_str87);
    studentInfo0.setFavRestaurants(list_str87);
    
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
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!"+ "'", str86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str87);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    java.lang.String str4 = studentInfo0.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str10, str_array9);
    studentInfo6.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str10);
    java.util.List<java.lang.String> list_str13 = studentInfo6.getFavRestaurants();
    boolean b15 = studentInfo6.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str18 = studentInfo17.getFavProducts();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    studentInfo17.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str21);
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo17.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str28 = studentInfo27.getFavProducts();
    boolean b30 = studentInfo27.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str31 = studentInfo27.getFavProducts();
    java.util.List<java.lang.String> list_str32 = studentInfo27.getFavProducts();
    studentInfo17.setFavProducts(list_str32);
    boolean b35 = studentInfo17.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo17.getFavProducts();
    studentInfo6.setFavRestaurants(list_str36);
    studentInfo0.setFavProducts(list_str36);
    boolean b40 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setLastName("");
    
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setFirstName("hi!");
    java.lang.String str11 = userInfo0.getLastName();
    java.lang.String str12 = userInfo0.getType();
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

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
    boolean b35 = studentInfo1.delRestaurantFromFavorites("");
    
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
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "hi!", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    java.lang.String str5 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("hi!");
    java.lang.String str13 = userInfo0.getFirstName();
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str3 = studentInfo2.getFavProducts();
    boolean b5 = studentInfo2.delProductFromFavorites("");
    boolean b7 = studentInfo2.delProductFromFavorites("");
    boolean b9 = studentInfo2.addRestaurantToFavorites("");
    java.lang.String str10 = studentInfo2.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str16);
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo2.setFavRestaurants(list_str19);
    boolean b22 = studentInfo2.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo24 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str25 = studentInfo24.getFavProducts();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    studentInfo24.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str28);
    java.util.List<java.lang.String> list_str31 = studentInfo24.getFavRestaurants();
    studentInfo24.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    boolean b37 = studentInfo34.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str38 = studentInfo34.getFavProducts();
    java.util.List<java.lang.String> list_str39 = studentInfo34.getFavProducts();
    studentInfo24.setFavProducts(list_str39);
    boolean b42 = studentInfo24.delRestaurantFromFavorites("hi!");
    boolean b44 = studentInfo24.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str45 = studentInfo24.getFavRestaurants();
    studentInfo2.setFavProducts(list_str45);
    studentInfo1.setFavRestaurants(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setType("hi!");
    userInfo0.setType("");
    
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo9 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b11 = studentInfo9.addRestaurantToFavorites("hi!");
    studentInfo9.setCampusId("hi!");
    boolean b15 = studentInfo9.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str16 = studentInfo9.getFavProducts();
    studentInfo1.setFavProducts(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavRestaurants();
    boolean b8 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str9 = studentInfo0.getFavRestaurants();
    studentInfo0.setCampusId("");
    
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    java.lang.String str7 = userInfo3.getType();
    userInfo3.setLastName("");
    userInfo3.setFirstName("");
    userInfo3.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    boolean b10 = studentInfo0.addProductToFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    java.lang.String str9 = studentInfo1.getCampusId();
    java.util.List<java.lang.String> list_str10 = studentInfo1.getFavRestaurants();
    boolean b12 = studentInfo1.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str13 = studentInfo1.getFavProducts();
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    userInfo3.setFirstName("");
    java.lang.String str6 = userInfo3.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("");
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getType();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str11 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setType("hi!");
    java.lang.String str15 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    java.lang.String str7 = userInfo3.getType();
    userInfo3.setLastName("");
    java.lang.String str10 = userInfo3.getLastName();
    java.lang.String str11 = userInfo3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavRestaurants();
    boolean b10 = studentInfo0.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    java.lang.String str5 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("hi!");
    
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str16);
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo12.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    boolean b25 = studentInfo22.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str26 = studentInfo22.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo22.getFavProducts();
    studentInfo12.setFavProducts(list_str27);
    boolean b30 = studentInfo12.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo12.getFavProducts();
    studentInfo1.setFavRestaurants(list_str31);
    java.util.List<java.lang.String> list_str33 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo34 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str35 = studentInfo34.getFavProducts();
    boolean b37 = studentInfo34.addProductToFavorites("");
    studentInfo34.setCampusId("");
    boolean b41 = studentInfo34.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str42 = studentInfo34.getFavRestaurants();
    boolean b44 = studentInfo34.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str45 = studentInfo34.getFavProducts();
    studentInfo1.setFavRestaurants(list_str45);
    boolean b48 = studentInfo1.delProductFromFavorites("");
    
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
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

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
    boolean b21 = studentInfo1.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str22 = studentInfo1.getFavRestaurants();
    boolean b24 = studentInfo1.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str25 = studentInfo1.getFavProducts();
    
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
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getFirstName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

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
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    boolean b17 = studentInfo14.delProductFromFavorites("");
    boolean b19 = studentInfo14.delProductFromFavorites("");
    boolean b21 = studentInfo14.addProductToFavorites("");
    java.lang.String str22 = studentInfo14.getCampusId();
    studentInfo14.setCampusId("hi!");
    java.util.List<java.lang.String> list_str25 = studentInfo14.getFavProducts();
    studentInfo0.setFavProducts(list_str25);
    
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
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str4 = studentInfo0.getFavProducts();
    boolean b6 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b8 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

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
    boolean b22 = studentInfo1.addRestaurantToFavorites("");
    
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

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("hi!");
    
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    boolean b7 = studentInfo0.delRestaurantFromFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b13 = studentInfo0.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str14 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo16 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str17 = studentInfo16.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    boolean b21 = studentInfo18.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str22 = studentInfo18.getFavProducts();
    studentInfo16.setFavProducts(list_str22);
    java.lang.String str24 = studentInfo16.getCampusId();
    java.util.List<java.lang.String> list_str25 = studentInfo16.getFavRestaurants();
    boolean b27 = studentInfo16.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo29 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str30 = studentInfo29.getFavProducts();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<java.lang.String>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str33, str_array32);
    studentInfo29.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str33);
    java.util.List<java.lang.String> list_str36 = studentInfo29.getFavRestaurants();
    studentInfo29.setCampusId("hi!");
    boolean b40 = studentInfo29.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo41 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str42 = studentInfo41.getFavProducts();
    boolean b44 = studentInfo41.addProductToFavorites("");
    studentInfo41.setCampusId("");
    java.util.List<java.lang.String> list_str47 = studentInfo41.getFavProducts();
    studentInfo29.setFavRestaurants(list_str47);
    java.lang.String str49 = studentInfo29.getCampusId();
    java.util.List<java.lang.String> list_str50 = studentInfo29.getFavRestaurants();
    studentInfo16.setFavRestaurants(list_str50);
    studentInfo0.setFavRestaurants(list_str50);
    java.lang.String str53 = studentInfo0.getCampusId();
    
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
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

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
    boolean b46 = studentInfo0.delProductFromFavorites("hi!");
    
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
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getFirstName();
    java.lang.String str7 = userInfo0.getType();
    java.lang.String str8 = userInfo0.getLastName();
    userInfo0.setType("");
    java.lang.String str11 = userInfo0.getFirstName();
    
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str13 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

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
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str28 = studentInfo27.getFavProducts();
    java.util.List<java.lang.String> list_str29 = studentInfo27.getFavProducts();
    studentInfo1.setFavRestaurants(list_str29);
    boolean b32 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b34 = studentInfo1.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo36 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str37 = studentInfo36.getFavProducts();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    studentInfo36.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str40);
    java.util.List<java.lang.String> list_str43 = studentInfo36.getFavRestaurants();
    studentInfo36.setCampusId("hi!");
    boolean b47 = studentInfo36.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str49 = studentInfo48.getFavProducts();
    boolean b51 = studentInfo48.addProductToFavorites("");
    studentInfo48.setCampusId("");
    java.util.List<java.lang.String> list_str54 = studentInfo48.getFavProducts();
    studentInfo36.setFavRestaurants(list_str54);
    java.lang.String str56 = studentInfo36.getCampusId();
    java.util.List<java.lang.String> list_str57 = studentInfo36.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo59 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b61 = studentInfo59.addRestaurantToFavorites("hi!");
    studentInfo59.setCampusId("hi!");
    boolean b65 = studentInfo59.delRestaurantFromFavorites("");
    studentInfo59.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo69 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str70 = studentInfo69.getFavProducts();
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str73 = new java.util.ArrayList<java.lang.String>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str73, str_array72);
    studentInfo69.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str73);
    java.util.List<java.lang.String> list_str76 = studentInfo69.getFavRestaurants();
    studentInfo59.setFavProducts(list_str76);
    studentInfo36.setFavRestaurants(list_str76);
    java.util.List<java.lang.String> list_str79 = studentInfo36.getFavProducts();
    studentInfo1.setFavRestaurants(list_str79);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str79);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str3 = studentInfo0.getFavRestaurants();
    java.lang.String str4 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b7 = studentInfo5.addRestaurantToFavorites("hi!");
    studentInfo5.setCampusId("hi!");
    boolean b11 = studentInfo5.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str12 = studentInfo5.getFavRestaurants();
    studentInfo1.setFavProducts(list_str12);
    boolean b15 = studentInfo1.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b19 = studentInfo17.addRestaurantToFavorites("hi!");
    boolean b21 = studentInfo17.delProductFromFavorites("hi!");
    studentInfo17.setCampusId("hi!");
    studentInfo17.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    studentInfo26.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    boolean b33 = studentInfo30.addProductToFavorites("");
    studentInfo30.setCampusId("");
    boolean b37 = studentInfo30.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str38 = studentInfo30.getFavRestaurants();
    studentInfo26.setFavProducts(list_str38);
    studentInfo17.setFavProducts(list_str38);
    studentInfo1.setFavProducts(list_str38);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("");
    userInfo0.setLastName("hi!");
    java.lang.String str8 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    userInfo0.setLastName("hi!");
    userInfo0.setType("");
    userInfo0.setFirstName("");
    java.lang.String str13 = userInfo0.getLastName();
    userInfo0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("");
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    boolean b5 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    boolean b9 = studentInfo0.delProductFromFavorites("hi!");
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavProducts();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addRestaurantToFavorites("");
    boolean b14 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str15 = studentInfo1.getFavRestaurants();
    
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
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    userInfo0.setLastName("hi!");
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

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
    boolean b35 = studentInfo1.addRestaurantToFavorites("hi!");
    boolean b37 = studentInfo1.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo38 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str39 = studentInfo38.getFavProducts();
    boolean b41 = studentInfo38.delProductFromFavorites("");
    java.lang.String str42 = studentInfo38.getCampusId();
    java.util.List<java.lang.String> list_str43 = studentInfo38.getFavProducts();
    java.util.List<java.lang.String> list_str44 = studentInfo38.getFavRestaurants();
    com.example.unifood.models.StudentInfo studentInfo46 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b48 = studentInfo46.addProductToFavorites("");
    boolean b50 = studentInfo46.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo52 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b54 = studentInfo52.addProductToFavorites("");
    boolean b56 = studentInfo52.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo58 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str59 = studentInfo58.getFavProducts();
    java.util.List<java.lang.String> list_str60 = studentInfo58.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo62 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b64 = studentInfo62.addRestaurantToFavorites("hi!");
    studentInfo62.setCampusId("hi!");
    boolean b68 = studentInfo62.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str69 = studentInfo62.getFavRestaurants();
    studentInfo58.setFavProducts(list_str69);
    studentInfo52.setFavProducts(list_str69);
    studentInfo46.setFavProducts(list_str69);
    studentInfo38.setFavRestaurants(list_str69);
    studentInfo1.setFavRestaurants(list_str69);
    
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
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str69);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo8 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str9 = studentInfo8.getFavRestaurants();
    studentInfo0.setFavProducts(list_str9);
    studentInfo0.setCampusId("");
    boolean b14 = studentInfo0.addProductToFavorites("");
    
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
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.addRestaurantToFavorites("");
    studentInfo0.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

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
    java.util.List<java.lang.String> list_str65 = studentInfo0.getFavProducts();
    boolean b67 = studentInfo0.addProductToFavorites("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.addProductToFavorites("");
    studentInfo0.setCampusId("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.addRestaurantToFavorites("");
    studentInfo0.setCampusId("hi!");
    boolean b12 = studentInfo0.delProductFromFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    java.lang.String str6 = userInfo0.getType();
    userInfo0.setFirstName("");
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("");
    java.lang.String str6 = userInfo0.getLastName();
    java.lang.String str7 = userInfo0.getType();
    java.lang.String str8 = userInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    java.lang.String str6 = studentInfo1.getCampusId();
    boolean b8 = studentInfo1.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str9 = studentInfo1.getFavRestaurants();
    boolean b11 = studentInfo1.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str20 = studentInfo12.getFavRestaurants();
    studentInfo1.setFavProducts(list_str20);
    boolean b23 = studentInfo1.addRestaurantToFavorites("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

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
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    boolean b28 = studentInfo25.delProductFromFavorites("");
    boolean b30 = studentInfo25.delProductFromFavorites("");
    boolean b32 = studentInfo25.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str34 = studentInfo33.getFavProducts();
    studentInfo33.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    boolean b40 = studentInfo37.addProductToFavorites("");
    studentInfo37.setCampusId("");
    boolean b44 = studentInfo37.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str45 = studentInfo37.getFavRestaurants();
    studentInfo33.setFavProducts(list_str45);
    studentInfo25.setFavRestaurants(list_str45);
    studentInfo0.setFavProducts(list_str45);
    
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
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str8 = userInfo0.getType();
    
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getType();
    userInfo3.setLastName("hi!");
    java.lang.String str7 = userInfo3.getType();
    userInfo3.setLastName("");
    userInfo3.setFirstName("");
    userInfo3.setLastName("");
    userInfo3.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

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
    boolean b21 = studentInfo1.addProductToFavorites("");
    
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
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str16);
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo12.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    boolean b25 = studentInfo22.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str26 = studentInfo22.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo22.getFavProducts();
    studentInfo12.setFavProducts(list_str27);
    boolean b30 = studentInfo12.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo12.getFavProducts();
    studentInfo1.setFavRestaurants(list_str31);
    java.util.List<java.lang.String> list_str33 = studentInfo1.getFavProducts();
    boolean b35 = studentInfo1.addRestaurantToFavorites("");
    
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
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    boolean b7 = studentInfo4.addProductToFavorites("");
    studentInfo4.setCampusId("");
    boolean b11 = studentInfo4.delRestaurantFromFavorites("");
    boolean b13 = studentInfo4.delProductFromFavorites("");
    studentInfo4.setCampusId("hi!");
    boolean b17 = studentInfo4.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b21 = studentInfo19.addRestaurantToFavorites("hi!");
    studentInfo19.setCampusId("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo19.getFavProducts();
    studentInfo4.setFavProducts(list_str24);
    studentInfo1.setFavProducts(list_str24);
    java.util.List<java.lang.String> list_str27 = studentInfo1.getFavRestaurants();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

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
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

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
    java.lang.String str52 = studentInfo0.getCampusId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    boolean b9 = studentInfo1.delProductFromFavorites("");
    boolean b11 = studentInfo1.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    java.util.List<java.lang.String> list_str15 = studentInfo13.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo17 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b19 = studentInfo17.addRestaurantToFavorites("hi!");
    studentInfo17.setCampusId("hi!");
    boolean b23 = studentInfo17.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo17.getFavRestaurants();
    studentInfo13.setFavProducts(list_str24);
    boolean b27 = studentInfo13.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo28 = new com.example.unifood.models.StudentInfo();
    com.example.unifood.models.StudentInfo studentInfo30 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo30.getFavProducts();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<java.lang.String>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str34, str_array33);
    studentInfo30.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str34);
    java.util.List<java.lang.String> list_str37 = studentInfo30.getFavRestaurants();
    studentInfo28.setFavRestaurants(list_str37);
    studentInfo13.setFavProducts(list_str37);
    boolean b41 = studentInfo13.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo43 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str44 = studentInfo43.getFavProducts();
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<java.lang.String>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str47, str_array46);
    studentInfo43.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str47);
    java.util.List<java.lang.String> list_str50 = studentInfo43.getFavRestaurants();
    java.lang.String str51 = studentInfo43.getCampusId();
    java.util.List<java.lang.String> list_str52 = studentInfo43.getFavRestaurants();
    studentInfo13.setFavRestaurants(list_str52);
    studentInfo1.setFavRestaurants(list_str52);
    com.example.unifood.models.StudentInfo studentInfo56 = new com.example.unifood.models.StudentInfo("hi!");
    com.example.unifood.models.StudentInfo studentInfo57 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str58 = studentInfo57.getFavProducts();
    boolean b60 = studentInfo57.addProductToFavorites("");
    studentInfo57.setCampusId("");
    boolean b64 = studentInfo57.delRestaurantFromFavorites("");
    boolean b66 = studentInfo57.delProductFromFavorites("");
    studentInfo57.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo69 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str70 = studentInfo69.getFavProducts();
    boolean b72 = studentInfo69.addProductToFavorites("");
    studentInfo69.setCampusId("");
    boolean b76 = studentInfo69.delRestaurantFromFavorites("");
    boolean b78 = studentInfo69.delProductFromFavorites("");
    studentInfo69.setCampusId("hi!");
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str83 = new java.util.ArrayList<java.lang.String>();
    boolean b84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str83, str_array82);
    studentInfo69.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str83);
    studentInfo57.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str83);
    studentInfo56.setFavProducts((java.util.List<java.lang.String>)arraylist_str83);
    studentInfo1.setFavProducts((java.util.List<java.lang.String>)arraylist_str83);
    java.util.List<java.lang.String> list_str89 = studentInfo1.getFavRestaurants();
    
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
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str89);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    java.lang.String str9 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    java.lang.String str12 = userInfo0.getLastName();
    userInfo0.setLastName("");
    userInfo0.setLastName("");
    userInfo0.setFirstName("hi!");
    userInfo0.setFirstName("hi!");
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    userInfo0.setFirstName("hi!");
    userInfo0.setType("");
    java.lang.String str11 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str10 = studentInfo6.getFavProducts();
    java.util.List<java.lang.String> list_str11 = studentInfo6.getFavProducts();
    studentInfo1.setFavProducts(list_str11);
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delProductFromFavorites("");
    boolean b18 = studentInfo13.delProductFromFavorites("");
    boolean b20 = studentInfo13.addProductToFavorites("");
    java.lang.String str21 = studentInfo13.getCampusId();
    studentInfo13.setCampusId("hi!");
    boolean b25 = studentInfo13.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo13.getFavProducts();
    studentInfo1.setFavProducts(list_str26);
    boolean b29 = studentInfo1.addRestaurantToFavorites("");
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

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
    boolean b14 = studentInfo1.delRestaurantFromFavorites("");
    
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
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

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

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    java.lang.String str4 = userInfo3.getFirstName();
    java.lang.String str5 = userInfo3.getFirstName();
    userInfo3.setLastName("hi!");
    java.lang.String str8 = userInfo3.getFirstName();
    java.lang.String str9 = userInfo3.getFirstName();
    
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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

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
    studentInfo1.setFavRestaurants(list_str41);
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

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    studentInfo1.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str5);
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavRestaurants();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    studentInfo12.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str16);
    java.util.List<java.lang.String> list_str19 = studentInfo12.getFavRestaurants();
    studentInfo12.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    boolean b25 = studentInfo22.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str26 = studentInfo22.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo22.getFavProducts();
    studentInfo12.setFavProducts(list_str27);
    boolean b30 = studentInfo12.delRestaurantFromFavorites("hi!");
    java.util.List<java.lang.String> list_str31 = studentInfo12.getFavProducts();
    studentInfo1.setFavRestaurants(list_str31);
    java.util.List<java.lang.String> list_str33 = studentInfo1.getFavRestaurants();
    
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
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo1.getFavProducts();
    boolean b10 = studentInfo1.delRestaurantFromFavorites("hi!");
    boolean b12 = studentInfo1.addProductToFavorites("hi!");
    
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

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setFirstName("hi!");
    userInfo0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

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
    boolean b23 = studentInfo0.addRestaurantToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    java.util.List<java.lang.String> list_str27 = studentInfo25.getFavProducts();
    java.lang.String str28 = studentInfo25.getCampusId();
    boolean b30 = studentInfo25.delRestaurantFromFavorites("hi!");
    boolean b32 = studentInfo25.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str33 = studentInfo25.getFavProducts();
    boolean b35 = studentInfo25.addRestaurantToFavorites("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo25.getFavRestaurants();
    studentInfo0.setFavProducts(list_str36);
    
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
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.delRestaurantFromFavorites("");
    boolean b9 = studentInfo1.addProductToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo13 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str14 = studentInfo13.getFavProducts();
    boolean b16 = studentInfo13.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str17 = studentInfo13.getFavProducts();
    studentInfo1.setFavProducts(list_str17);
    studentInfo1.setCampusId("hi!");
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    java.lang.String str6 = ownerInfo1.getRestaurantId();
    java.lang.String str7 = ownerInfo1.getRestaurantId();
    java.lang.String str8 = ownerInfo1.getRestaurantId();
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    java.lang.String str10 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavRestaurants();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

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
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str36 = studentInfo35.getFavProducts();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<java.lang.String>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str39, str_array38);
    studentInfo35.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str39);
    java.util.List<java.lang.String> list_str42 = studentInfo35.getFavRestaurants();
    studentInfo35.setCampusId("hi!");
    java.util.List<java.lang.String> list_str45 = studentInfo35.getFavProducts();
    studentInfo0.setFavProducts(list_str45);
    boolean b48 = studentInfo0.delProductFromFavorites("");
    
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
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

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
    boolean b35 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str36 = studentInfo0.getFavRestaurants();
    
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
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str4 = studentInfo1.getFavRestaurants();
    boolean b6 = studentInfo1.delProductFromFavorites("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    java.lang.String str4 = studentInfo1.getCampusId();
    boolean b6 = studentInfo1.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str7 = null;
    studentInfo1.setFavRestaurants(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

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
    boolean b44 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b46 = studentInfo0.delRestaurantFromFavorites("hi!");
    
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
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

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
    java.util.List<java.lang.String> list_str31 = studentInfo0.getFavRestaurants();
    boolean b33 = studentInfo0.addRestaurantToFavorites("");
    
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
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

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
    boolean b22 = studentInfo1.addRestaurantToFavorites("");
    
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
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

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
    boolean b15 = studentInfo12.addProductToFavorites("");
    studentInfo12.setCampusId("");
    boolean b19 = studentInfo12.delRestaurantFromFavorites("");
    boolean b21 = studentInfo12.delProductFromFavorites("");
    studentInfo12.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b27 = studentInfo25.addProductToFavorites("");
    boolean b29 = studentInfo25.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str32 = studentInfo31.getFavProducts();
    java.util.List<java.lang.String> list_str33 = studentInfo31.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo35 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b37 = studentInfo35.addRestaurantToFavorites("hi!");
    studentInfo35.setCampusId("hi!");
    boolean b41 = studentInfo35.addProductToFavorites("hi!");
    java.util.List<java.lang.String> list_str42 = studentInfo35.getFavRestaurants();
    studentInfo31.setFavProducts(list_str42);
    studentInfo25.setFavProducts(list_str42);
    studentInfo12.setFavProducts(list_str42);
    studentInfo12.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo48 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str49 = studentInfo48.getFavProducts();
    boolean b51 = studentInfo48.delProductFromFavorites("");
    boolean b53 = studentInfo48.delProductFromFavorites("");
    boolean b55 = studentInfo48.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo56 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str57 = studentInfo56.getFavProducts();
    studentInfo56.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo60 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str61 = studentInfo60.getFavProducts();
    boolean b63 = studentInfo60.addProductToFavorites("");
    studentInfo60.setCampusId("");
    boolean b67 = studentInfo60.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str68 = studentInfo60.getFavRestaurants();
    studentInfo56.setFavProducts(list_str68);
    studentInfo48.setFavRestaurants(list_str68);
    studentInfo12.setFavRestaurants(list_str68);
    studentInfo0.setFavRestaurants(list_str68);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str68);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

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
    java.util.List<java.lang.String> list_str38 = studentInfo0.getFavProducts();
    
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
    org.junit.Assert.assertNotNull(list_str38);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

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
    java.util.List<java.lang.String> list_str22 = studentInfo0.getFavProducts();
    
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
    org.junit.Assert.assertNotNull(list_str22);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    java.util.List<java.lang.String> list_str3 = studentInfo1.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    boolean b7 = studentInfo4.addProductToFavorites("");
    studentInfo4.setCampusId("");
    boolean b11 = studentInfo4.delRestaurantFromFavorites("");
    boolean b13 = studentInfo4.delProductFromFavorites("");
    studentInfo4.setCampusId("hi!");
    boolean b17 = studentInfo4.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b21 = studentInfo19.addRestaurantToFavorites("hi!");
    studentInfo19.setCampusId("hi!");
    java.util.List<java.lang.String> list_str24 = studentInfo19.getFavProducts();
    studentInfo4.setFavProducts(list_str24);
    studentInfo1.setFavProducts(list_str24);
    com.example.unifood.models.StudentInfo studentInfo27 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str28 = studentInfo27.getFavProducts();
    studentInfo27.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo31 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str32 = studentInfo31.getFavProducts();
    boolean b34 = studentInfo31.addProductToFavorites("");
    studentInfo31.setCampusId("");
    boolean b38 = studentInfo31.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str39 = studentInfo31.getFavRestaurants();
    studentInfo27.setFavProducts(list_str39);
    studentInfo1.setFavProducts(list_str39);
    com.example.unifood.models.StudentInfo studentInfo42 = new com.example.unifood.models.StudentInfo();
    boolean b44 = studentInfo42.delProductFromFavorites("");
    boolean b46 = studentInfo42.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo47 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str48 = studentInfo47.getFavProducts();
    boolean b50 = studentInfo47.addProductToFavorites("");
    studentInfo47.setCampusId("");
    java.util.List<java.lang.String> list_str53 = studentInfo47.getFavProducts();
    studentInfo42.setFavRestaurants(list_str53);
    java.util.List<java.lang.String> list_str55 = studentInfo42.getFavProducts();
    studentInfo1.setFavProducts(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    java.lang.String str2 = ownerInfo1.getRestaurantId();
    java.lang.String str3 = ownerInfo1.getRestaurantId();
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    ownerInfo1.setRestaurantId("");
    ownerInfo1.setRestaurantId("");
    java.lang.String str9 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

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
    boolean b17 = studentInfo0.addProductToFavorites("");
    boolean b19 = studentInfo0.delProductFromFavorites("");
    
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
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getFirstName();
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    userInfo0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str2 = studentInfo1.getFavProducts();
    studentInfo1.setCampusId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addProductToFavorites("hi!");
    boolean b5 = studentInfo1.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    boolean b9 = studentInfo6.delProductFromFavorites("");
    boolean b11 = studentInfo6.delProductFromFavorites("");
    boolean b13 = studentInfo6.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    studentInfo14.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo18 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str19 = studentInfo18.getFavProducts();
    boolean b21 = studentInfo18.addProductToFavorites("");
    studentInfo18.setCampusId("");
    boolean b25 = studentInfo18.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str26 = studentInfo18.getFavRestaurants();
    studentInfo14.setFavProducts(list_str26);
    studentInfo6.setFavRestaurants(list_str26);
    studentInfo6.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo32 = new com.example.unifood.models.StudentInfo("");
    com.example.unifood.models.StudentInfo studentInfo33 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str34 = studentInfo33.getFavProducts();
    boolean b36 = studentInfo33.delProductFromFavorites("");
    boolean b38 = studentInfo33.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str39 = studentInfo33.getFavRestaurants();
    studentInfo32.setFavProducts(list_str39);
    studentInfo6.setFavRestaurants(list_str39);
    studentInfo1.setFavRestaurants(list_str39);
    
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
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str6 = studentInfo0.getFavProducts();
    boolean b8 = studentInfo0.delProductFromFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    java.util.List<java.lang.String> list_str12 = studentInfo10.getFavProducts();
    java.lang.String str13 = studentInfo10.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo14 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str15 = studentInfo14.getFavProducts();
    boolean b17 = studentInfo14.delProductFromFavorites("");
    boolean b19 = studentInfo14.delProductFromFavorites("");
    boolean b21 = studentInfo14.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo22 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str23 = studentInfo22.getFavProducts();
    studentInfo22.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo26 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str27 = studentInfo26.getFavProducts();
    boolean b29 = studentInfo26.addProductToFavorites("");
    studentInfo26.setCampusId("");
    boolean b33 = studentInfo26.delRestaurantFromFavorites("");
    java.util.List<java.lang.String> list_str34 = studentInfo26.getFavRestaurants();
    studentInfo22.setFavProducts(list_str34);
    studentInfo14.setFavRestaurants(list_str34);
    studentInfo10.setFavProducts(list_str34);
    studentInfo0.setFavProducts(list_str34);
    
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
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

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
    boolean b34 = studentInfo0.delRestaurantFromFavorites("hi!");
    boolean b36 = studentInfo0.addRestaurantToFavorites("hi!");
    boolean b38 = studentInfo0.addRestaurantToFavorites("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo2 = new com.example.unifood.models.StudentInfo();
    boolean b4 = studentInfo2.addProductToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo6 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str7 = studentInfo6.getFavProducts();
    studentInfo2.setFavRestaurants(list_str7);
    studentInfo0.setFavProducts(list_str7);
    java.util.List<java.lang.String> list_str10 = studentInfo0.getFavRestaurants();
    boolean b12 = studentInfo0.addProductToFavorites("hi!");
    java.lang.String str13 = studentInfo0.getCampusId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    boolean b4 = studentInfo0.delProductFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo5 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str6 = studentInfo5.getFavProducts();
    boolean b8 = studentInfo5.addProductToFavorites("");
    studentInfo5.setCampusId("");
    java.util.List<java.lang.String> list_str11 = studentInfo5.getFavProducts();
    studentInfo0.setFavRestaurants(list_str11);
    studentInfo0.setCampusId("");
    com.example.unifood.models.StudentInfo studentInfo15 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str16 = studentInfo15.getFavProducts();
    boolean b18 = studentInfo15.delProductFromFavorites("");
    boolean b20 = studentInfo15.delProductFromFavorites("");
    boolean b22 = studentInfo15.addRestaurantToFavorites("");
    java.lang.String str23 = studentInfo15.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo25 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str26 = studentInfo25.getFavProducts();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array28);
    studentInfo25.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str29);
    java.util.List<java.lang.String> list_str32 = studentInfo25.getFavRestaurants();
    studentInfo15.setFavRestaurants(list_str32);
    boolean b35 = studentInfo15.addProductToFavorites("hi!");
    com.example.unifood.models.StudentInfo studentInfo37 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str38 = studentInfo37.getFavProducts();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    studentInfo37.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str41);
    java.util.List<java.lang.String> list_str44 = studentInfo37.getFavRestaurants();
    studentInfo37.setCampusId("hi!");
    com.example.unifood.models.StudentInfo studentInfo47 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str48 = studentInfo47.getFavProducts();
    boolean b50 = studentInfo47.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str51 = studentInfo47.getFavProducts();
    java.util.List<java.lang.String> list_str52 = studentInfo47.getFavProducts();
    studentInfo37.setFavProducts(list_str52);
    boolean b55 = studentInfo37.delRestaurantFromFavorites("hi!");
    boolean b57 = studentInfo37.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str58 = studentInfo37.getFavRestaurants();
    studentInfo15.setFavProducts(list_str58);
    studentInfo0.setFavProducts(list_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
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
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

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
    studentInfo1.setCampusId("hi!");
    java.util.List<java.lang.String> list_str34 = studentInfo1.getFavProducts();
    
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
    org.junit.Assert.assertNotNull(list_str34);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    java.lang.String str4 = userInfo0.getLastName();
    java.lang.String str5 = userInfo0.getFirstName();
    java.lang.String str6 = userInfo0.getType();
    java.lang.String str7 = userInfo0.getLastName();
    java.lang.String str8 = userInfo0.getType();
    userInfo0.setType("");
    
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
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

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
    java.util.List<java.lang.String> list_str73 = studentInfo0.getFavProducts();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str73);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

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
    boolean b79 = studentInfo1.delProductFromFavorites("hi!");
    
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
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delProductFromFavorites("");
    boolean b5 = studentInfo0.delProductFromFavorites("");
    boolean b7 = studentInfo0.addRestaurantToFavorites("");
    java.util.List<java.lang.String> list_str8 = studentInfo0.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo10 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str11 = studentInfo10.getFavProducts();
    studentInfo0.setFavProducts(list_str11);
    boolean b14 = studentInfo0.addRestaurantToFavorites("");
    boolean b16 = studentInfo0.delProductFromFavorites("");
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    java.lang.String str5 = userInfo0.getType();
    userInfo0.setType("");
    java.lang.String str8 = userInfo0.getType();
    java.lang.String str9 = userInfo0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    com.example.unifood.models.StudentInfo studentInfo1 = new com.example.unifood.models.StudentInfo("hi!");
    boolean b3 = studentInfo1.addRestaurantToFavorites("hi!");
    studentInfo1.setCampusId("hi!");
    boolean b7 = studentInfo1.addProductToFavorites("hi!");
    boolean b9 = studentInfo1.delRestaurantFromFavorites("");
    boolean b11 = studentInfo1.addRestaurantToFavorites("");
    com.example.unifood.models.StudentInfo studentInfo12 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str13 = studentInfo12.getFavProducts();
    boolean b15 = studentInfo12.delProductFromFavorites("");
    boolean b17 = studentInfo12.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str18 = studentInfo12.getFavProducts();
    com.example.unifood.models.StudentInfo studentInfo19 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str20 = studentInfo19.getFavProducts();
    boolean b22 = studentInfo19.delProductFromFavorites("");
    boolean b24 = studentInfo19.delProductFromFavorites("");
    boolean b26 = studentInfo19.addRestaurantToFavorites("");
    java.lang.String str27 = studentInfo19.getCampusId();
    com.example.unifood.models.StudentInfo studentInfo29 = new com.example.unifood.models.StudentInfo("hi!");
    java.util.List<java.lang.String> list_str30 = studentInfo29.getFavProducts();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<java.lang.String>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str33, str_array32);
    studentInfo29.setFavRestaurants((java.util.List<java.lang.String>)arraylist_str33);
    java.util.List<java.lang.String> list_str36 = studentInfo29.getFavRestaurants();
    studentInfo19.setFavRestaurants(list_str36);
    boolean b39 = studentInfo19.addRestaurantToFavorites("");
    java.lang.String str40 = studentInfo19.getCampusId();
    boolean b42 = studentInfo19.addProductToFavorites("");
    java.util.List<java.lang.String> list_str43 = studentInfo19.getFavRestaurants();
    studentInfo12.setFavRestaurants(list_str43);
    studentInfo1.setFavProducts(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str43);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    com.example.unifood.models.OwnerInfo ownerInfo0 = new com.example.unifood.models.OwnerInfo();
    ownerInfo0.setRestaurantId("hi!");
    java.lang.String str3 = ownerInfo0.getRestaurantId();
    ownerInfo0.setRestaurantId("");
    ownerInfo0.setRestaurantId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("hi!");
    userInfo0.setFirstName("");
    java.lang.String str6 = userInfo0.getLastName();
    java.lang.String str7 = userInfo0.getFirstName();
    java.lang.String str8 = userInfo0.getType();
    java.lang.String str9 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

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
    java.util.List<java.lang.String> list_str15 = studentInfo1.getFavRestaurants();
    boolean b17 = studentInfo1.delRestaurantFromFavorites("");
    
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
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    boolean b2 = studentInfo0.delProductFromFavorites("");
    boolean b4 = studentInfo0.delProductFromFavorites("");
    java.util.List<java.lang.String> list_str5 = null;
    studentInfo0.setFavRestaurants(list_str5);
    java.util.List<java.lang.String> list_str7 = studentInfo0.getFavProducts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "hi!");
    java.lang.String str4 = userInfo3.getLastName();
    userInfo3.setFirstName("");
    java.lang.String str7 = userInfo3.getFirstName();
    userInfo3.setType("");
    java.lang.String str10 = userInfo3.getLastName();
    userInfo3.setLastName("hi!");
    java.lang.String str13 = userInfo3.getFirstName();
    java.lang.String str14 = userInfo3.getFirstName();
    java.lang.String str15 = userInfo3.getLastName();
    java.lang.String str16 = userInfo3.getType();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    java.lang.String str2 = userInfo0.getLastName();
    userInfo0.setType("hi!");
    java.lang.String str5 = userInfo0.getLastName();
    userInfo0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    com.example.unifood.models.UserInfo userInfo3 = new com.example.unifood.models.UserInfo("hi!", "", "");
    userInfo3.setFirstName("");
    userInfo3.setFirstName("hi!");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    java.lang.String str9 = userInfo0.getType();
    java.lang.String str10 = userInfo0.getFirstName();
    java.lang.String str11 = userInfo0.getFirstName();
    
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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    userInfo0.setType("hi!");
    java.lang.String str6 = userInfo0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

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
    java.util.List<java.lang.String> list_str23 = studentInfo1.getFavRestaurants();
    boolean b25 = studentInfo1.delProductFromFavorites("");
    
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
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("hi!");
    userInfo0.setFirstName("");
    userInfo0.setFirstName("");
    java.lang.String str11 = userInfo0.getLastName();
    java.lang.String str12 = userInfo0.getType();
    
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    com.example.unifood.models.UserInfo userInfo0 = new com.example.unifood.models.UserInfo();
    java.lang.String str1 = userInfo0.getType();
    userInfo0.setLastName("");
    java.lang.String str4 = userInfo0.getType();
    userInfo0.setType("");
    userInfo0.setType("");
    userInfo0.setFirstName("hi!");
    userInfo0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    com.example.unifood.models.StudentInfo studentInfo0 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str1 = studentInfo0.getFavProducts();
    boolean b3 = studentInfo0.delRestaurantFromFavorites("");
    com.example.unifood.models.StudentInfo studentInfo4 = new com.example.unifood.models.StudentInfo();
    java.util.List<java.lang.String> list_str5 = studentInfo4.getFavProducts();
    studentInfo0.setFavRestaurants(list_str5);
    boolean b8 = studentInfo0.delProductFromFavorites("");
    boolean b10 = studentInfo0.delProductFromFavorites("hi!");
    boolean b12 = studentInfo0.delProductFromFavorites("");
    boolean b14 = studentInfo0.addProductToFavorites("");
    boolean b16 = studentInfo0.delProductFromFavorites("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    com.example.unifood.models.OwnerInfo ownerInfo1 = new com.example.unifood.models.OwnerInfo("hi!");
    ownerInfo1.setRestaurantId("");
    java.lang.String str4 = ownerInfo1.getRestaurantId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

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
    boolean b46 = studentInfo0.addRestaurantToFavorites("");
    
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
    org.junit.Assert.assertTrue(b46 == true);

  }

}
