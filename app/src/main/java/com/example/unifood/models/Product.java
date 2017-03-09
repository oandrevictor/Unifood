package com.example.unifood.models;


import com.example.unifood.exceptions.InvalidDescriptionException;
import com.example.unifood.exceptions.InvalidProductCost;
import com.example.unifood.exceptions.InvalidProductName;
import com.example.unifood.exceptions.ProductException;

import java.util.UUID;

import static com.google.android.gms.common.api.Status.st;

public class Product {

    private String id;
    private String name;
    private String description;
    private float cost;
    private boolean availability;

    public Product() {
        this.id = UUID.randomUUID().toString();
        this.description = "";
        this.availability = true;
    }

    public Product(String name, float cost, String description) throws ProductException{
        this();
        validate(name,cost,description);
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    private boolean validate(String name, float cost, String description) throws ProductException {
        return validateProductName(name) &&
        validateCost(cost) &&
        validateDescription(description);
    }

    private boolean validateDescription(String description) throws InvalidDescriptionException {
        if (description!=null &&  description.length() < 140 && description.length() < 140){
            return true;
        }
        throw new InvalidDescriptionException();
    }

    private boolean validateCost(float cost) throws InvalidProductCost {
        if (cost >= 0){
            return true;

        }
        throw new InvalidProductCost();
    }

    private boolean validateProductName(String name) throws InvalidProductName {
        if (name!= null && name.length() >2){
            return true;
        }
        throw new InvalidProductName();
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
        return this.description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public boolean isAvailable() {
        return this.availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
