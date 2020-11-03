package com.zyy.wanandroidmvvm.factory;

import android.util.Log;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.XiangBean;
import com.zyy.wanandroidmvvm.bean.XiangmuTabBean;

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

public class XiangFactory extends ViewModel {
    static MutableLiveData<List<XiangBean.DataBean.DatasBean>> mutableLiveData=new MutableLiveData<>();
    public  MutableLiveData<List<XiangBean.DataBean.DatasBean>> setXiangmu(int id){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData();
        }
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiServer.XIANG_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiServer apiServer = build.create(ApiServer.class);
        Observable<XiangBean> xiangBeanObservable = apiServer.XiangBean("project/list/1/json?cid="+id);
        xiangBeanObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<XiangBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(XiangBean xiangBean) {
                    mutableLiveData.postValue(xiangBean.getData().getDatas());
                    Log.e("zyy","onNext111111111"+xiangBean.getData().getDatas().toString());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


        return  mutableLiveData;

    }

    @Override
    protected void onCleared() {
        super.onCleared();

    }


}
