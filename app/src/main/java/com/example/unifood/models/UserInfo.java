package com.example.unifood.models;

import java.util.UUID;

public class UserInfo {

    private String firstName;
    private String lastName;
    private String type;
    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String type) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }



}
