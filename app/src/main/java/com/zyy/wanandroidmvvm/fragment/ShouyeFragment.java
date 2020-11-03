package com.zyy.wanandroidmvvm.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.factory.MyBannerFactorty;
import com.zyy.wanandroidmvvm.factory.ShouFactory;
import com.zyy.wanandroidmvvm.adapter.ShouyeAdapter;
import com.zyy.wanandroidmvvm.bean.BannanBean;
import com.zyy.wanandroidmvvm.bean.ShouYeBean;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShouyeFragment extends Fragment {

    private Banner banner_item;

    private List<BannanBean.DataBean> data;
    private RecyclerView rcy;
    private ShouyeAdapter shouyeAdapter;
    private ArrayList<ShouYeBean.DataBean.DatasBean> beans;

    public ShouyeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_shouye, container, false);
        initView(inflate);

        return inflate;
    }

    private void initView(View inflate) {

        banner_item = inflate.findViewById(R.id.banner_item);
        rcy = inflate.findViewById(R.id.rcy);
        beans = new ArrayList<>();
        rcy.setLayoutManager(new LinearLayoutManager(getContext()));
        shouyeAdapter = new ShouyeAdapter(beans, getActivity());
        rcy.setAdapter(shouyeAdapter);


        MyBannerFactorty myBannerFactorty = new ViewModelProvider(this).get(MyBannerFactorty.class);

        myBannerFactorty.setBean().observe(this, new Observer<BannanBean>() {
            @Override
            public void onChanged(BannanBean dataBean) {
                data = dataBean.getData();
                Log.e("zyy", "5555" + dataBean.getData().toString());

                banner_item.setImages(data)
                        .setImageLoader(new ImageLoader() {
                            @Override
                            public void displayImage(Context context, Object path, ImageView imageView) {
                                BannanBean.DataBean bean = (BannanBean.DataBean) path;

                                Glide.with(context).load(bean.getImagePath()).into(imageView);
                                String imagePath = bean.getImagePath();
                                Log.e("zyy", "9999" + imagePath);
                            }
                        })
                        .setDelayTime(2000)
                        .isAutoPlay(true)
                        .start();
            }
        });

//        final ArrayList<BannanBean.DataBean> bannanBeans = new ArrayList<>();


        ShouFactory shouFactory = new ViewModelProvider(this).get(ShouFactory.class);
        shouFactory.setShou().observe(this, new Observer<List<ShouYeBean.DataBean.DatasBean>>() {
            @Override
            public void onChanged(List<ShouYeBean.DataBean.DatasBean> datasBeans) {
                beans.addAll(datasBeans);
                shouyeAdapter.notifyDataSetChanged();
            }
        });


    }
}
