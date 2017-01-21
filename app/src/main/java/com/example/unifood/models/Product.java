package com.example.unifood.models;


public class Product {

    private String id;
    private String name;
    private String description;
    private float cost;
    private boolean availability;

    private final String EMPTY = new String();

    public Product() {

    }

    public Product(String id, String name, float cost, boolean availability) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.availability = availability;
        this.description = EMPTY;
    }


    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
