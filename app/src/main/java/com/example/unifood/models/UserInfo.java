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

/* The following method are not in this class. To-be removed.
    public void rate(int rate, String comment, Restaurant restaurant) {

        this.util = Util.getInstancia();
        String currentDate = util.getCurrentDate();

        Review myRate = new Review(id, rate, comment, currentDate);

        restaurant.addRate(myRate.getId());
    }

    public void editReview(Restaurant restaurant) {
        //TODO
    }
*/


    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
