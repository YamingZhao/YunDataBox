package com.ishare.yun.yundatabox;

import android.app.Application;
import android.content.Context;

import zuo.biao.library.base.BaseApplication;

/**
 * Created by i310736(Yaming.Zhao@sap.com) on 02/10/2018.
 */

public class YunDataBoxApplication extends Application {
    public static Context CONTEXT;
    private final static String TAG = "YogalemonApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        CONTEXT = this;

        init();
    }

    private void init() {
        BaseApplication.init(this);
//        LoggerManager.sLogger.i("Application init");
//
//        OkHttpClient okHttpClient = new OkHttpClient(); // build on your own
//
//        SharedPreferencesManager.createInstance(this);
//
//        GradientManager.getInstance().init(this, null);
//
//        WXManager.registerToWx(this);
    }
}
