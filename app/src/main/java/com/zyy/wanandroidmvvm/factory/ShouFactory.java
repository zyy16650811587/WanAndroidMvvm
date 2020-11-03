package com.zyy.wanandroidmvvm.factory;

import android.util.Log;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.BannanBean;
import com.zyy.wanandroidmvvm.bean.ShouYeBean;

import java.util.List;

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

public class ShouFactory extends ViewModel {
    static MutableLiveData<List<ShouYeBean.DataBean.DatasBean>> mutableLiveData=new MutableLiveData<>();
    public MutableLiveData<List<ShouYeBean.DataBean.DatasBean>> setShou(){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData<>();

        }
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiServer.SHOU_BEAN)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiServer apiServer = build.create(ApiServer.class);
        Observable<ShouYeBean> shouYeBeanObservable = apiServer.ShouBean();
        shouYeBeanObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShouYeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ShouYeBean shouYeBean) {
                    mutableLiveData.postValue(shouYeBean.getData().getDatas());
                    Log.e("zyy","onNext"+shouYeBean.getData().getDatas().toString());
                    }

                    @Override
                    public void onError(Throwable e) {

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
    }
}
