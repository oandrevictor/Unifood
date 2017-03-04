package com.example.unifood.models;


import java.util.UUID;

public class Product {

    private String id;
    private String name;
    private String description;
    private float cost;
    private boolean availability;

    private final String EMPTY = new String();

    public Product() {
        this.id = UUID.randomUUID().toString();
        this.description = EMPTY;
        this.availability = true;
    }

    public Product(String name, float cost, String description) {
        this();
        this.name = name;
        this.cost = cost;
        this.description = description;
    }


    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
