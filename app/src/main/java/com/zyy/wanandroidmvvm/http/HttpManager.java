package com.zyy.wanandroidmvvm.http;

import com.google.gson.Gson;
import com.zyy.wanandroidmvvm.ApiServer;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {

    private static volatile HttpManager httpManager;
    private HttpManager(){

    }

    public static HttpManager getInstance(){
        if (httpManager == null) {
            synchronized (HttpManager.class){
                if (httpManager == null) {
                    httpManager=new HttpManager();
                }
            }
        }
        return httpManager;
    }

    private Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(ApiServer.XIANG_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getOkHttpClient())
                .build();
    }

    private OkHttpClient getOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5,TimeUnit.SECONDS)
                .build();
    }



    public <T> T getService(Class<T>mClass){
        return getRetrofit().create(mClass);
    }
}
