package com.zyy.wanandroidmvvm.fragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.adapter.TiXiRcyAdapter;
import com.zyy.wanandroidmvvm.bean.NewBean;
import com.zyy.wanandroidmvvm.factory.TiFactory;

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
public class BlankFragment2 extends Fragment {

    private RecyclerView mTixiRcy;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank2, container, false);
        initView(inflate);

        return inflate;
    }

    private void initView(View inflate) {


        mTixiRcy = (RecyclerView) inflate.findViewById(R.id.rcy_tixi);
        mTixiRcy.setLayoutManager(new LinearLayoutManager(getContext()));
        final ArrayList<NewBean.DataBean> list = new ArrayList<>();
        final TiXiRcyAdapter tiXiRcyAdapter = new TiXiRcyAdapter(list, getActivity());
        mTixiRcy.setAdapter(tiXiRcyAdapter);

        TiFactory tiFactory = new ViewModelProvider(this).get(TiFactory.class);
        tiFactory.setShou().observe(this, new Observer<List<NewBean.DataBean>>() {
            @Override
            public void onChanged(List<NewBean.DataBean> dataBeans) {
             list.addAll(dataBeans);
             tiXiRcyAdapter.notifyDataSetChanged();
            }
        });


    }
}
