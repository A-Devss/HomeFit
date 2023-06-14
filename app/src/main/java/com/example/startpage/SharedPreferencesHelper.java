package com.example.startpage;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Button;

public class SharedPreferencesHelper {
    private static final String SHARED_PREF_FILE = "com.example.startpage";
    private static final String KEY_INCREMENTED_VALUE1 = "INCREMENTED_VALUE1";
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    public static void initialize(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREF_FILE, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public static void saveText(String key, String value){
        editor.putString(key, value);
        editor.apply();
    }
    public static String displayText(String key, String defaultValue){
        return sharedPreferences.getString(key, defaultValue);
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
    public static void incrementValue() {
        int currentValue = sharedPreferences.getInt(KEY_INCREMENTED_VALUE1, 0);
        int incrementedValue = currentValue + 1;

        editor.putInt(KEY_INCREMENTED_VALUE1, incrementedValue);
        editor.apply();
    }
    public static int getIncrementedValue(Context context) {
        return sharedPreferences.getInt(KEY_INCREMENTED_VALUE1, 0);
    }
    public static void saveName(String key, String name){
        editor.putString(key, name);
        editor.apply();
    }
    public static String displayName(String key, String defaultValue){
        return sharedPreferences.getString(key, defaultValue);
    }
    public static void saveWeight(String key, String name){
        editor.putString(key, name);
        editor.apply();
    }
    public static String displayWeight(String key, String defaultValue){
        return sharedPreferences.getString(key, defaultValue);
    }

    public static void saveHeight(String key, String name){
        editor.putString(key, name);
        editor.apply();
    }
    public static String displayHeight(String key, String defaultValue){
        return sharedPreferences.getString(key, defaultValue);
    }

    public static void saveGender(String key, String name){
        editor.putString(key, name);
        editor.apply();
    }
    public static String displayGender(String key, String defaultValue){
        return sharedPreferences.getString(key, defaultValue);
    }
}
