package com.laomao.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by laomao on 16/10/11.
 */

public class SpUtil {
    static SharedPreferences prefs;

    public static void init(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static int getPage() {
        return prefs.getInt("joke_page",1);
    }

    public static void setPage(int page) {
        prefs.edit().putInt("joke_page",page).commit();
    }
}
