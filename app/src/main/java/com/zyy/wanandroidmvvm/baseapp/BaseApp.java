package com.zyy.wanandroidmvvm.baseapp;

import android.app.Application;

public class BaseApp extends Application {
    public static BaseApp baseApp;

    public static BaseApp getApp(){
        return baseApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApp = this;
    }
}
