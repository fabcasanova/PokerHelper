package com.phatsmalone.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class PHDatabaseHelper extends SQLiteOpenHelper {

    private static final String DBNAME = "pokerhelper";
    private static final int DBVERSION = 2;
    private static final String TABLE_NAME = "ID";
    private static final String COL1 = "ID";
    private static final String COL2 = "Name";
    private static final String COL3 = "Position";
    private static final String COL4 = "Handrange";
    private static final String COL5 = "Notes";

    public PHDatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL2 + " TEXT, " +  COL3 + " TEXT, " + COL4 + " VAR, " + COL5 + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    //add names in add names fragment
    public boolean addPlayerName(String name){

        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, name);

        System.out.println("Added Name " + name + "to " + TABLE_NAME);
        long result = db.insert(TABLE_NAME, null, contentValues);

        //check
        if(result == -1) {return false;}
        else {return true;}
    }

    //get names for player information spinner
    public List<String> getNames(){
        List<String> names = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                names.add(cursor.getString(1));

            }while(cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return names;
    }

    //extract based on position for a specific player
    public Cursor extractPlayerData(SQLiteDatabase db, String playerName, String playerNotes,
                                 String playerPosition, Double handRange){
        Cursor data = null;

        return  data;
    }

}