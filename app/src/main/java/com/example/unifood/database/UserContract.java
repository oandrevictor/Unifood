package com.example.unifood.database;

import android.provider.BaseColumns;

/**
 * Created by root on 19/01/17.
 */

public class UserContract {

    public static final class UserEntry implements BaseColumns{
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_FIRST_NAME = "firstName";
        public static final String COLUMN_LAST_NAME = "lastName";
        public static final String COLUMN_PASSWORD = "password";
        public static final String COLUMN_TIMESTAMP = "timestamp";
        public static final String COLUMN_UNIVERSITY = "university";

    }
}
