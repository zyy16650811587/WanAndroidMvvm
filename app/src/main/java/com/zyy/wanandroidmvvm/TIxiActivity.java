package com.zyy.wanandroidmvvm;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.zyy.wanandroidmvvm.bean.NewBean;
import com.zyy.wanandroidmvvm.factory.TIxiFractory;
import com.zyy.wanandroidmvvm.fragment.fragment.TIxiFragment4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

public class TIxiActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_ixi);
        initView();
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp = (ViewPager) findViewById(R.id.vp);
        Intent intent = getIntent();
        List<NewBean.DataBean> list = (List<NewBean.DataBean>) intent.getSerializableExtra("list");

        final ArrayList<String> strings = new ArrayList<>();
        final ArrayList<Fragment> fragments = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            TIxiFragment4 tIxiFragment4 = new TIxiFragment4();
                   Bundle bundle = new Bundle();



        }










//        TIxiFractory tIxiFractory = new ViewModelProvider(this).get(TIxiFractory.class);
//        tIxiFractory.setXiti().observe(this, new Observer<List<NewBean.DataBean>>() {
//            @Override
//            public void onChanged(List<NewBean.DataBean> dataBeans) {
//                for (int i = 0; i <dataBeans.size() ; i++) {
//                    List<NewBean.DataBean.ChildrenBean> children = dataBeans.get(i).getChildren();
//                    TIxiFragment4 tIxiFragment4 = new TIxiFragment4();
//                    Bundle bundle = new Bundle();
//
//                    bundle.putSerializable("id",children.get(i).getId());
//                    tIxiFragment4.setArguments(bundle);
//
//
//
//                }
//
//
//            }
//        });


    }
}
