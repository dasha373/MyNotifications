package com.courses.android.mynotifications.app;

import android.app.Application;

import com.courses.android.mynotifications.helper.ParseUtils;

/**
 * Created by Asus on 25.07.2015.
 */
public class MyApplication extends Application {
    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        // register with parse
        ParseUtils.registerParse(this);
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
