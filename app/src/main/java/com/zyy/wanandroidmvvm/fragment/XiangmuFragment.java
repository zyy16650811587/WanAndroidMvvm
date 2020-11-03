package com.zyy.wanandroidmvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.factory.XiangmuFactory;
import com.zyy.wanandroidmvvm.adapter.TabVpAdapter;
import com.zyy.wanandroidmvvm.bean.XiangmuTabBean;
import com.zyy.wanandroidmvvm.fragment.fragment.BlankFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;


/**
 * A simple {@link Fragment} subclass.
 */
public class XiangmuFragment extends Fragment {

    private TabLayout tlb;
    private ViewPager vp;

    public XiangmuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_xiangmu, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        tlb=inflate.findViewById(R.id.tlb);
        vp=inflate.findViewById(R.id.vp);
        final ArrayList<String> strings = new ArrayList<>();
        final ArrayList<Fragment> fragments = new ArrayList<>();

        XiangmuFactory xiangmuFactory = new ViewModelProvider(this).get(XiangmuFactory.class);
        xiangmuFactory.setXiangmu().observe(this, new Observer<List<XiangmuTabBean.DataBean>>() {
            @Override
            public void onChanged(List<XiangmuTabBean.DataBean> dataBeans) {
                for (int i = 0; i <dataBeans.size() ; i++) {
                    BlankFragment blankFragment = new BlankFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("id",dataBeans.get(i).getId());
                    blankFragment.setArguments(bundle);
                    strings.add(dataBeans.get(i).getName());
                    fragments.add(blankFragment);

                }
                TabVpAdapter tabVpAdapter = new TabVpAdapter(getChildFragmentManager(), 0, fragments, strings);
                vp.setAdapter(tabVpAdapter);
                tlb.setupWithViewPager(vp);
                tlb.setTabMode(TabLayout.MODE_SCROLLABLE);


            }
        });


    }
}
