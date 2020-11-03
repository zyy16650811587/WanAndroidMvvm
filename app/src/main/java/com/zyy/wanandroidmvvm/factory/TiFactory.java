package com.zyy.wanandroidmvvm.factory;

import android.util.Log;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.NewBean;
import com.zyy.wanandroidmvvm.bean.ShouYeBean;
import com.zyy.wanandroidmvvm.bean.TixiBean;

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

public class TiFactory extends ViewModel {
    static MutableLiveData<List<NewBean.DataBean>> mutableLiveData=new MutableLiveData<>();
    public MutableLiveData<List<NewBean.DataBean>> setShou(){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData<>();

        }
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiServer.XIANGMUTAB_BASE)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiServer apiServer = build.create(ApiServer.class);
        Observable<NewBean> newBeanObservable = apiServer.newBean();
        newBeanObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NewBean newBean) {
                    mutableLiveData.postValue(newBean.getData());
                    Log.e("zyyy","onNext"+newBean.getData().toString());
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
