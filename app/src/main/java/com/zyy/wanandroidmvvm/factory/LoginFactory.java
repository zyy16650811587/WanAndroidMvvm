package com.zyy.wanandroidmvvm.factory;

import android.util.Log;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.LoginBean;
import com.zyy.wanandroidmvvm.bean.RegisterBean;
import com.zyy.wanandroidmvvm.http.HttpManager;
import com.zyy.wanandroidmvvm.uitle.RxUtils;

import java.util.HashMap;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class LoginFactory extends ViewModel {
    static MutableLiveData<LoginBean> mutableLiveData=new MutableLiveData<>();

    public  MutableLiveData<LoginBean> setMyRegister(HashMap<String,String> hashMap){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData();
        }
        HttpManager.getInstance().getService(ApiServer.class).setLogin(hashMap)
                .compose(RxUtils.<LoginBean>thread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        mutableLiveData.postValue(loginBean);
                        Log.e("TAG Login OK ",loginBean.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("TAG Login NO ", e.getMessage());
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
