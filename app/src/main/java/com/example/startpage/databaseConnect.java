package com.example.startpage;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.icu.text.UnicodeSetSpanner;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class databaseConnect extends SQLiteOpenHelper{

    private static final String TAG = "DatabaseHelper";
    private Context context;
    private static final String DATABASE_NAME = "fitness3.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "user_profile2";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "Name";
    private static final String COLUMN_WEIGHT = "Weight";
    private static final String COLUMN_HEIGHT = "Height";
    private static final String COLUMN_GENDER = "Gender";

    public databaseConnect(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_WEIGHT + " TEXT, " +
                COLUMN_HEIGHT + " TEXT, " +
                COLUMN_GENDER + " TEXT); ";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void addUser(String name, String weight, String height, String gender){
        if( name.isEmpty()||weight.isEmpty()||height.isEmpty()||gender.isEmpty())
        {
            Toast.makeText(context, "Please fill all details", Toast.LENGTH_SHORT).show();
        }else{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLUMN_NAME, name);
            cv.put(COLUMN_WEIGHT, weight);
            cv.put(COLUMN_HEIGHT, height);
            cv.put(COLUMN_GENDER, gender);


            Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM user_profile2", null);
            cursor.moveToFirst();
            int count = cursor.getInt(0);
            cursor.close();

            if (count==0){
                long result = db.insert(TABLE_NAME, null, cv);
                Log.e(TAG, "insertData" +result);
                Toast.makeText(context, "Created successfully", Toast.LENGTH_SHORT).show();

            }else {
                Toast.makeText(context, "Cannot make another profile", Toast.LENGTH_SHORT).show();

            }
        }
    }
    public Cursor getFirstRowData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, new String[]{COLUMN_NAME, COLUMN_WEIGHT, COLUMN_HEIGHT, COLUMN_GENDER},
                null, null, null, null, null, "1");
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }
}
