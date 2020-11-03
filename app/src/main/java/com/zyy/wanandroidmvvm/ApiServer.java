package com.zyy.wanandroidmvvm;

import com.zyy.wanandroidmvvm.bean.BannanBean;
import com.zyy.wanandroidmvvm.bean.LoginBean;
import com.zyy.wanandroidmvvm.bean.NavigationBean;
import com.zyy.wanandroidmvvm.bean.NewBean;
import com.zyy.wanandroidmvvm.bean.RegisterBean;
import com.zyy.wanandroidmvvm.bean.ShouYeBean;
import com.zyy.wanandroidmvvm.bean.TixiBean;
import com.zyy.wanandroidmvvm.bean.XiangBean;
import com.zyy.wanandroidmvvm.bean.XiangmuTabBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ApiServer {
    String BANNER_BASE = "https://www.wanandroid.com/";

    @GET("banner/json")
    Observable<BannanBean> Banner();

    String SHOU_BEAN = "https://www.wanandroid.com/";

    @GET("article/list/0/json")
    Observable<ShouYeBean> ShouBean();

    String XIANGMUTAB_BASE = "https://www.wanandroid.com/";

    @GET("project/tree/json")
    Observable<XiangmuTabBean> XiangmuTab();

    @GET("tree/json")
    Observable<NewBean> newBean();

    @GET("navi/json")
    Observable<NavigationBean> daoBean();


    String XIANG_URL = "https://www.wanandroid.com/";

    @GET
    Observable<XiangBean> XiangBean(@Url String url);


    @POST("user/register")
    @FormUrlEncoded
    Observable<RegisterBean> getRegister(@FieldMap Map<String, String> map);

    //登录
    @POST("user/login")
    @FormUrlEncoded
    Observable<LoginBean> setLogin(@FieldMap Map<String, String> map);


}
