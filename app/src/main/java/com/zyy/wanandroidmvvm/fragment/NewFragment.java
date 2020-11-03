package com.zyy.wanandroidmvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.adapter.NewRcyAdapter;
import com.zyy.wanandroidmvvm.bean.NewBean;
import com.zyy.wanandroidmvvm.factory.NewFractory;

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
public class NewFragment extends Fragment {

    private RecyclerView rcy_new;
    private ArrayList<NewBean.DataBean> list;

    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_new, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        rcy_new=inflate.findViewById(R.id.rcy_new);
        rcy_new.setLayoutManager(new LinearLayoutManager(getActivity()));
        list = new ArrayList<>();
        final NewRcyAdapter newRcyAdapter = new NewRcyAdapter(list, getActivity());
        rcy_new.setAdapter(newRcyAdapter);

        NewFractory newFractory = new ViewModelProvider(this).get(NewFractory.class);
        newFractory.setXiangmu().observe(this, new Observer<List<NewBean.DataBean>>() {
            @Override
            public void onChanged(List<NewBean.DataBean> dataBeans) {
                list.addAll(dataBeans);
                newRcyAdapter.notifyDataSetChanged();
            }
        });


    }
}
