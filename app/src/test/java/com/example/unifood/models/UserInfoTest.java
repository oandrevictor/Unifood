package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidFirstNameException;
import com.example.unifood.exceptions.UserException;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Unit tests for User Info model.
 *
 * Created by Rafaela Araújo on 23/02/2017.
 */
public class UserInfoTest {

    private final String USER_NAME = "User A";
    private final String USER_LAST_NAME = "User A";
    private final String USER_TYPE = "Student";

    private final String NEW_USER_NAME = "User A";
    private final String NEW_USER_LAST_NAME = "User A";
    private final String NEW_USER_TYPE = "Student";


    @Test
    public void constructorTest() {
        UserInfo user = null;
        try {
            user = new UserInfo(USER_NAME, USER_LAST_NAME, USER_TYPE);
        } catch (UserException e) {
            Assert.fail();
        }

        Assert.assertEquals(USER_NAME, user.getFirstName());
        Assert.assertEquals(USER_LAST_NAME, user.getLastName());
        Assert.assertEquals(USER_TYPE, user.getType());
    }

    @Test
    public void editUserTest() {
        UserInfo user = null;
        try {
            user = new UserInfo(USER_NAME, USER_LAST_NAME, USER_TYPE);
        } catch (UserException e) {
            Assert.fail();
        }

        user.setFirstName(NEW_USER_NAME);
        user.setLastName(NEW_USER_LAST_NAME);
        user.setType(NEW_USER_TYPE);

        Assert.assertEquals(NEW_USER_NAME, user.getFirstName());
        Assert.assertEquals(NEW_USER_LAST_NAME, user.getLastName());
        Assert.assertEquals(NEW_USER_TYPE, user.getType());
    }
}