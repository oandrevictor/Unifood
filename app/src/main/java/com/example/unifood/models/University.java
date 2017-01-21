package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Restaurant> restaurants;

    public University() {

    }

    public University(String name) {
        this.name = name;
        this.restaurants = new ArrayList<>();
    }
}
