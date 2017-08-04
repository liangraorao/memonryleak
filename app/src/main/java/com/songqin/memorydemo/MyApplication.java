package com.songqin.memorydemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by admin on 2017/7/2.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);

}
        }
