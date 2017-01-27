package com.example.unifood.models;

import java.util.UUID;

public class UserInfo {

    private String id;
    private String firstName;
    private String lastName;
    private String type;

    private  Util util;


    public UserInfo() {
        this.id = UUID.randomUUID().toString();;


    }

    public UserInfo(String firstName, String lastName, String type) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }


    public void rate(int rate, String comment, Restaurant restaurant) {

        this.util = Util.getInstancia();
        String currentDate = util.getCurrentDate();

        Review myRate = new Review(id, rate, comment, currentDate);

        restaurant.addRate(myRate.getId());
    }

    public void editReview(Restaurant restaurant) {
        //TODO
    }



    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
