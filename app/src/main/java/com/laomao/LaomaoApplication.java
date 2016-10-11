package com.laomao;

import android.app.Application;
import android.content.Context;

import com.antfortune.freeline.FreelineCore;
import com.laomao.utils.SpUtil;

/**
 * Created by laomao on 16/9/23.
 */

public class LaomaoApplication extends Application {
    private static LaomaoApplication laomaoApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        FreelineCore.init(this);
        laomaoApplication=this;
        SpUtil.init(this);
    }
    public static Context getAppContext(){return laomaoApplication;}
}
