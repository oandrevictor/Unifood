package com.example.unifood;

import android.database.sqlite.SQLiteDatabase;

import com.example.unifood.database.DbHelper;
import com.example.unifood.database.contracts.UserContract;

/**
 * Created by oandrevictor on 20/01/17.
 */

public class User {


    public User create(String firstName, String lastName, String email, String password, int university){

        return null;
    }

    private boolean checkfirstName(String firstName){
        // TODO Add Logic for Checking user name

        return false;
    }


    private boolean checkLastName(String latName){
        // TODO Add Logic for Checking last name
        return false;
    }


    private boolean checkEmail(String email){
        if (email!=null && email.contains("@")){
            return true;
        }
        // TODO Add Logic for Checking email
        return false;
    }


    private boolean checkPassword(String password){
        if (password != null && password.length()>=6 ){
            return true;
        }
        return false;
    }

    private boolean university(int university){
        // TODO Add Logic for checking university existence
        return false;
    }

    public static int remove(SQLiteDatabase db, int id){
        String selection = UserContract.UserEntry._ID + " LIKE ?";
    // Specify arguments in placeholder order.
    // Issue SQL statement.
            return db.delete(UserContract.UserEntry.TABLE_NAME, selection, new String[]{Integer.toString(id)});
    }

}
