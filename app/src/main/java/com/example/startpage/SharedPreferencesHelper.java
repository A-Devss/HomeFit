package com.example.startpage;
import android.content.Context;
import android.content.SharedPreferences;
public class SharedPreferencesHelper {
    private static final String SHARED_PREF_FILE = "com.example.startpage";
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    public static void initialize(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREF_FILE, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static void setValue(String key, int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getValue(String key, int defaultValue) {
        return sharedPreferences.getInt(key, defaultValue);
    }
    public static void updateValue(String key, int newValue) {
        editor.putInt(key, newValue);
        editor.apply();
    }
    public static int getUpdatedValue(String key, int defaultValue) {
        return sharedPreferences.getInt(key, defaultValue);
    }
}
