package com.zyy.wanandroidmvvm.factory;

import android.util.Log;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.BannanBean;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyBannerFactorty extends ViewModel {
    /*
    *  static MutableLiveData<JavaBean>mutableLiveData=new MutableLiveData<>();
    public MutableLiveData<JavaBean> setuser(){
        //JavaBean javaBean = new JavaBean();
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData<>();
        }
    *
    *
    * */



    static MutableLiveData<BannanBean >mutableLiveData=new MutableLiveData<>();
    public MutableLiveData<BannanBean> setBean (){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData<>();
        }

        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiServer.BANNER_BASE)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiServer apiServer = build.create(ApiServer.class);
        Observable<BannanBean> banner = apiServer.Banner();
        banner.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannanBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BannanBean dataBean) {
                        mutableLiveData.postValue(dataBean);
                        Log.e("zyy","onNext"+dataBean.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("zyy","onError"+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });


        return mutableLiveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.e("zyy","onCleared"+11111);
    }
}
