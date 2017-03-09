package com.example.unifood.models;

import com.example.unifood.exceptions.InvalidRestaurantIdException;
import com.example.unifood.exceptions.OwnerException;

/**
 * Created by gabim on 05/02/2017.
 */

public class OwnerInfo {

    private String restaurantId;

    public OwnerInfo(){
    }

    public OwnerInfo(String restaurantId) throws OwnerException{

        validate(restaurantId);
        this.restaurantId = restaurantId;
    }

    private boolean validate(String restaurantId) throws InvalidRestaurantIdException {
        if (restaurantId!= null ){return true;}
        throw new InvalidRestaurantIdException();
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        if (restaurantId != null) {
            this.restaurantId = restaurantId;
        }
    }
}
