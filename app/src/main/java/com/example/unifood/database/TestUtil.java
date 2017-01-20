package com.example.unifood.database;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 19/01/17.
 */

public class TestUtil {

    public static void insertFakeData(SQLiteDatabase db){
        if(db == null){
            return;
        }
        //create a list of fake guests
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(UserContract.UserEntry.COLUMN_FIRST_NAME, "Johny");
        cv.put(UserContract.UserEntry.COLUMN_LAST_NAME, "ta Ouvindo");
        cv.put(UserContract.UserEntry.COLUMN_PASSWORD, "drinkee");
        cv.put(UserContract.UserEntry.COLUMN_UNIVERSITY, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(UserContract.UserEntry.COLUMN_FIRST_NAME, "Sofia");
        cv.put(UserContract.UserEntry.COLUMN_LAST_NAME, "ta ligando");
        cv.put(UserContract.UserEntry.COLUMN_PASSWORD, "matadora");
        cv.put(UserContract.UserEntry.COLUMN_UNIVERSITY, 1);
        list.add(cv);
        //insert all guests in one transaction
        try
        {
            db.beginTransaction();
            //clear the table first
            db.delete (UserContract.UserEntry.TABLE_NAME,null,null);
            //go through the list and add one by one
            for(ContentValues c:list){
                db.insert(UserContract.UserEntry.TABLE_NAME, null, c);
            }
            db.setTransactionSuccessful();
        }
        catch (SQLException e) {
            //too bad :(
        }
        finally
        {
            db.endTransaction();
        }

    }
}
