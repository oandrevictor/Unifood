package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidFirstNameException;
import com.example.unifood.exceptions.InvalidLastNameException;
import com.example.unifood.exceptions.InvalidTypeException;
import com.example.unifood.exceptions.UserException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit tests for User Info model.
 *
 * Created by Rafaela Araújo on 23/02/2017.
 */
public class UserInfoTest {

    private final String USER_NAME = "User A";
    private final String USER_LAST_NAME = "User A";
    private final String USER_TYPE = "student";

    private final String NEW_USER_NAME = "User A";
    private final String NEW_USER_LAST_NAME = "User A";
    private final String NEW_USER_TYPE = "owner";

    private UserInfo user;

    @Before
    public void setUser(){
        try {
            user = new UserInfo(USER_NAME, USER_LAST_NAME, USER_TYPE);
        } catch (UserException e) {
            Assert.fail();
        }
    }

    @Test
    public void getUserInfoTest() {
        Assert.assertEquals(USER_NAME, user.getFirstName());
        Assert.assertEquals(USER_LAST_NAME, user.getLastName());
        Assert.assertEquals(USER_TYPE, user.getType());
    }

    @Test
    public void invalidUserTest() {
        UserInfo user = null;

        try {
            user = new UserInfo(null, USER_LAST_NAME, USER_TYPE);
        } catch (UserException e) {
            Assert.assertEquals(e.getClass(), InvalidFirstNameException.class);
        }
    }

    @Test
    public void editUserTest() {
        user.setFirstName(NEW_USER_NAME);
        user.setLastName(NEW_USER_LAST_NAME);
        user.setType(NEW_USER_TYPE);

        Assert.assertEquals(NEW_USER_NAME, user.getFirstName());
        Assert.assertEquals(NEW_USER_LAST_NAME, user.getLastName());
        Assert.assertEquals(NEW_USER_TYPE, user.getType());
    }

    @Test
    public void testEditEmptyFirstNameUserInfoTest(){
        try {
            user.setFirstName("");
        } catch (Exception e) {
            Assert.assertEquals(e.getClass(), InvalidFirstNameException.class);
        }

        try {
            user.setLastName("");
        } catch (Exception e) {
            Assert.assertEquals(e.getClass(), InvalidLastNameException.class);
        }

        try {
            user.setType("");
        } catch (Exception e) {
            Assert.assertEquals(e.getClass(), InvalidTypeException.class);
        }
    }

    @Test
    public void testEditNullUserInfoTest(){
        try {
            user.setFirstName(null);
        } catch (Exception e) {
            Assert.assertEquals(e.getClass(), InvalidFirstNameException.class);
        }

        try {
            user.setLastName(null);
        } catch (Exception e) {
            Assert.assertEquals(e.getClass(), InvalidLastNameException.class);
        }

        try {
            user.setType(null);
        } catch (Exception e) {
            Assert.assertEquals(e.getClass(), InvalidTypeException.class);
        }
    }
}