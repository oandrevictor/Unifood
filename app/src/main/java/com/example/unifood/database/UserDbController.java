package com.example.unifood.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.unifood.database.contracts.UserContract;
import com.example.unifood.database.contracts.UserContract.UserEntry;
/**
 * Created by oandrevictor on 20/01/17.
 */

public class UserDbController {

    private SQLiteDatabase db;
    private DbHelper dbHelper;
    private long id;

    public UserDbController(Context context){
        dbHelper = new DbHelper(context);
    }

    public long addUser(String firstName, String lastName, String email, String password, int university){
        ContentValues content;
        long result;

        db = dbHelper.getWritableDatabase();
        content = new ContentValues();
        content.put(UserContract.UserEntry.COLUMN_FIRST_NAME, firstName);
        content.put(UserContract.UserEntry.COLUMN_LAST_NAME, lastName);
        content.put(UserContract.UserEntry.COLUMN_EMAIL, email);
        content.put(UserContract.UserEntry.COLUMN_PASSWORD, password);
        content.put(UserContract.UserEntry.COLUMN_UNIVERSITY, university);

        result =  db.insert(UserContract.UserEntry.TABLE_NAME , null, content);
        id = result;
        db.close();
        return result;

    }

    public Cursor getById(long id){
        Cursor cursor;
        String[] fields =  {UserEntry._ID,UserEntry.COLUMN_FIRST_NAME,UserEntry.COLUMN_LAST_NAME,UserEntry.COLUMN_EMAIL,UserEntry.COLUMN_UNIVERSITY};
        String where = UserEntry._ID + "=" + id;
        db = dbHelper.getReadableDatabase();
        cursor = db.query(UserEntry.TABLE_NAME,fields,where, null, null, null, null, null);
    // If second param is null, it will return all? if so, go do DbHelper
        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public String getName(){
        Cursor cursor = getById(id);
        return cursor.getString(cursor.getColumnIndex(UserEntry.COLUMN_FIRST_NAME));
    }

    public String getLastName(){
        Cursor cursor = getById(id);
        return cursor.getString(cursor.getColumnIndex(UserEntry.COLUMN_LAST_NAME));
    }

    public void update(long id, String firstName, String lastName, String email, String password, int university){
        ContentValues content;
        db = dbHelper.getWritableDatabase();

        String where = UserEntry._ID + "=" + id;

        content = new ContentValues();
        content.put(UserEntry.COLUMN_FIRST_NAME, firstName);
        content.put(UserEntry.COLUMN_LAST_NAME, lastName);
        content.put(UserEntry.COLUMN_EMAIL, email);
        content.put(UserEntry.COLUMN_PASSWORD, password);
        content.put(UserEntry.COLUMN_UNIVERSITY, university);

        db.update(UserEntry.TABLE_NAME,content,where,null);
        db.close();
    }

    public Cursor getAll() {
        db = dbHelper.getWritableDatabase();
        return db.query(
                UserContract.UserEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                UserContract.UserEntry.COLUMN_TIMESTAMP
        );
    }

    public long delete(long id){
        /*String where = UserEntry._ID + "=" + id;
        db = dbHelper.getReadableDatabase();
        long result = db.delete(UserEntry.TABLE_NAME,where,null);
        db.close();*/
        db = dbHelper.getWritableDatabase();
        long result = dbHelper.deleteFrom(db,UserEntry.TABLE_NAME,id);
        return result;
    }

    private boolean checkFirstName(String firstName){
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

    private boolean checkUniversity(int university){
        // TODO Add Logic for checking university existence
        return false;
    }

}
