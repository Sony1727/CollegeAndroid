 package com.example.studentdatabaseapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    static String DbName="College.db";
    static String TableName="student";
    static  String co1="id";
    static  String co2="Name";
    static String co3="Rollno";
    static  String co4="Admno";
    static  String co5="college";

    public DatabaseHelper(Context context) {
        super(context, DbName, null, 1 );
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table "+ TableName+"("+
                co1 +" integer primary key autoincrement,"+
                co2+" text,"+
                co3+" text,"+
                co4+" text,"+
                co5+" text)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
public boolean insertdata(String Name,String Rollno,String Admno,String college) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues content = new ContentValues();
    content.put(co2, Name);
    content.put(co3, Rollno);
    content.put(co4, Admno);
    content.put(co5, college);
    long status = db.insert(TableName, null, content);
    if (status == -1) {
        return false;

    } else {
        return true;
    }


}

}


