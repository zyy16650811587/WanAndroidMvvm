package com.zyy.wanandroidmvvm.fragment.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.adapter.XiangAdapter;
import com.zyy.wanandroidmvvm.bean.XiangBean;
import com.zyy.wanandroidmvvm.factory.XiangFactory;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private RecyclerView rcy_xiangmu;
    private ArrayList<XiangBean.DataBean.DatasBean> beans;
    private XiangAdapter xiangAdapter;
    private int id;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflate = inflater.inflate(R.layout.fragment_blank, container, false);
        id = getArguments().getInt("id");
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        rcy_xiangmu = inflate.findViewById(R.id.rcy_xiangmu);
        rcy_xiangmu.setLayoutManager(new LinearLayoutManager(getContext()));
        rcy_xiangmu.addItemDecoration(new DividerItemDecoration(getActivity(),RecyclerView.VERTICAL));

        beans = new ArrayList<>();
        xiangAdapter = new XiangAdapter(beans, getActivity());
        rcy_xiangmu.setAdapter(xiangAdapter);

        XiangFactory xiangFactory = new ViewModelProvider(this).get(XiangFactory.class);
        xiangFactory.setXiangmu(id).observe(this, new Observer<List<XiangBean.DataBean.DatasBean>>() {
            @Override
            public void onChanged(List<XiangBean.DataBean.DatasBean> datasBeans) {
                beans.addAll(datasBeans);
                xiangAdapter.notifyDataSetChanged();
                Log.e("nnnnn","99999 :"+datasBeans.toString());

            }
        });


    }
}
