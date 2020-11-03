package com.zyy.wanandroidmvvm.fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zyy.wanandroidmvvm.PublicWebActivity;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.adapter.Te_Adapter;
import com.zyy.wanandroidmvvm.bean.NavigationBean;
import com.zyy.wanandroidmvvm.factory.DaoFactory;

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
public class BlankFragment3 extends Fragment {

    private RecyclerView mZhishiRcy;

    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank3, container, false);
        initView(inflate);
        return inflate;

    }

    private void initView(View inflate) {
        mZhishiRcy = (RecyclerView) inflate.findViewById(R.id.rcy_zhishi);

        mZhishiRcy.setLayoutManager(new LinearLayoutManager(getActivity()));
        final ArrayList<NavigationBean.DataBean> list = new ArrayList<>();

        final Te_Adapter te_adapter = new Te_Adapter(getActivity(), list);

        mZhishiRcy.setAdapter(te_adapter);
        DaoFactory daoFactory = new ViewModelProvider(this).get(DaoFactory.class);
        daoFactory.setdao().observe(this, new Observer<List<NavigationBean.DataBean>>() {
            @Override
            public void onChanged(List<NavigationBean.DataBean> dataBeans) {
                list.addAll(dataBeans);
                te_adapter.notifyDataSetChanged();
            }
        });




    }
}
