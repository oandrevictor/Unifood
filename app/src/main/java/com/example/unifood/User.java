package com.example.unifood;

import android.content.Context;
import android.database.Cursor;

import com.example.unifood.database.UserDbController;


import com.example.unifood.database.contracts.UserContract.UserEntry;
/**
 * Created by oandrevictor on 20/01/17.
 */

public class User {
    private long id;
    private UserDbController userDbController;

    public User(Context context){
        userDbController = new UserDbController(context);
    }

    public long create(Context context, String firstName, String lastName, String email, String password, int university){
        return userDbController.addUser(firstName,lastName,email,password,university);
    }


    public String getName(){
        Cursor cursor = userDbController.getById(id);
        return cursor.getString(cursor.getColumnIndex(UserEntry.COLUMN_FIRST_NAME));
    }

    public String getLastName(){
        Cursor cursor = userDbController.getById(id);
        return cursor.getString(cursor.getColumnIndex(UserEntry.COLUMN_FIRST_NAME));
    }

    public long destroy(){
        return userDbController.delete(id);
    }


}
