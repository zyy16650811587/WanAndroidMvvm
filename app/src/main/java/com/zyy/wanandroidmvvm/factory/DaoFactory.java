package com.zyy.wanandroidmvvm.factory;

import android.util.Log;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.NavigationBean;
import com.zyy.wanandroidmvvm.bean.XiangmuTabBean;
import com.zyy.wanandroidmvvm.http.HttpManager;
import com.zyy.wanandroidmvvm.uitle.RxUtils;

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

public class DaoFactory extends ViewModel {
    static MutableLiveData<List<NavigationBean.DataBean>> mutableLiveData=new MutableLiveData<>();
    public  MutableLiveData<List<NavigationBean.DataBean>> setdao(){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData();
        }
        HttpManager.getInstance().getService(ApiServer.class).daoBean()
                .compose(RxUtils.<NavigationBean>thread())
                .subscribe(new Observer<NavigationBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NavigationBean navigationBean) {
                    mutableLiveData.postValue(navigationBean.getData());
                    Log.e("zyy","onNext"+navigationBean.getData().toString());
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
