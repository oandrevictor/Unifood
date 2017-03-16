package com.example.unifood.models;

import com.example.unifood.R;
import com.example.unifood.exceptions.InvalidLastNameException;
import com.example.unifood.exceptions.InvalidFirstNameException;
import com.example.unifood.exceptions.InvalidTypeException;
import com.example.unifood.exceptions.UserException;

public class UserInfo {
    static final String STUDENT_TYPE = "student";
    static final String OWNER_TYPE = "owner";

    private String firstName;
    private String lastName;
    private String type;
    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String type) throws UserException {
        this();
        validate(firstName,lastName,type);
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
/// VALIDATION METHODS

    private boolean validate(String firstName, String lastName, String type) throws UserException{
        return validateFirstName(firstName) ||
        validateLastName(lastName) ||
        validateType(type);
    }

    private boolean validateFirstName(String firstName) throws InvalidFirstNameException {
        if (firstName != null && firstName.length() >=3 ){
            return true;
        }
        throw new InvalidFirstNameException();
    }

    private boolean validateType(String type) throws InvalidTypeException {
        if (type != null){
            if (type.equals(OWNER_TYPE) || type.equals(STUDENT_TYPE)){
                return true;
            }
        }
        throw new InvalidTypeException();
    }

    private boolean validateLastName(String lastName) throws InvalidLastNameException {
        if (lastName!= null && lastName.length() >3){
            return true;
        }
        throw new InvalidLastNameException();
    }
}
