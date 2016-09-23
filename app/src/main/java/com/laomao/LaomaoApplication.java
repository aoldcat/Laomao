package com.laomao;

import android.app.Application;

import com.antfortune.freeline.FreelineCore;

/**
 * Created by laomao on 16/9/23.
 */

public class LaomaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FreelineCore.init(this);
    }
}
