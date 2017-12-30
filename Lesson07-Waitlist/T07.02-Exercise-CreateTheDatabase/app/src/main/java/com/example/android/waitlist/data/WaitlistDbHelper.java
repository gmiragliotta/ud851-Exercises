package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.waitlist.data.WaitlistContract.*;

// Complete (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper {

    // Complete (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"
    private static final String DATABASE_NAME = "waitlist.db";

    // Complete (3) Create a static final int called DATABASE_VERSION and set it to 1
    private static final int DATABASE_VERSION = 1;

    // Complete (4) Create a Constructor that takes a context and calls the parent constructor

    public WaitlistDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    // Complete (5) Override the onCreate method

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Complete (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table
        String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE " + WaitlistEntry.TABLE_NAME + " (" +
                WaitlistEntry._ID + "INTEGER AUTOINCREMENT PRIMARY KEY," +
                WaitlistEntry.COLUMN_GUEST_NAME + "TEXT NOT NULL," +
                WaitlistEntry.COLUMN_PARTY_SIZE + "INTEGER NOT NULL," +
                WaitlistEntry.COLUMN_TIMESTAMP + "DATE DEFAULT CURRENT_TIMESTAMP"
                + ");";

        // Complete (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE
        db.execSQL(SQL_CREATE_WAITLIST_TABLE);
    }



    // Complete (8) Override the onUpgrade method
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Complete (9) Inside, execute a drop table query, and then call onCreate to re-create it
        db.execSQL("DROP TABLE " + WaitlistEntry.TABLE_NAME + ";");
        onCreate(db);
    }



}