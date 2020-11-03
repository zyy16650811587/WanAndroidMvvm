package com.zyy.wanandroidmvvm.factory;

import android.util.Log;
import android.widget.VideoView;

import com.zyy.wanandroidmvvm.ApiServer;
import com.zyy.wanandroidmvvm.bean.NavigationBean;
import com.zyy.wanandroidmvvm.bean.RegisterBean;
import com.zyy.wanandroidmvvm.http.HttpManager;
import com.zyy.wanandroidmvvm.uitle.RxUtils;

import java.util.HashMap;
import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RegisFactory extends ViewModel {

    static MutableLiveData<RegisterBean> mutableLiveData=new MutableLiveData<>();

    public  MutableLiveData<RegisterBean> setMyRegister(HashMap<String,String> hashMap){
        if(mutableLiveData!=null){
            mutableLiveData=new MutableLiveData();
        }
        HttpManager.getInstance().getService(ApiServer.class).getRegister(hashMap)
                .compose(RxUtils.<RegisterBean>thread())
                .subscribe(new Observer<RegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterBean registerBean) {
                    mutableLiveData.postValue(registerBean);
                    Log.e("zhuyuanyun ","1111"+registerBean.toString());
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
