package com.zyy.wanandroidmvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.adapter.Te_Adapter;
import com.zyy.wanandroidmvvm.adapter.VPAdapter;
import com.zyy.wanandroidmvvm.bean.NavigationBean;
import com.zyy.wanandroidmvvm.factory.DaoFactory;
import com.zyy.wanandroidmvvm.fragment.fragment.BlankFragment2;
import com.zyy.wanandroidmvvm.fragment.fragment.BlankFragment3;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


/**
 * A simple {@link Fragment} subclass.
 */
public class DaohangFragment extends Fragment {

    private TabLayout mTab;
    private ViewPager mVp;
    private RecyclerView mDaoRcy;

    public DaohangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_daohang, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(@NonNull final View itemView) {
        ArrayList<Fragment> fragments = new ArrayList<>();

        mTab = (TabLayout) itemView.findViewById(R.id.tab);
        mVp = (ViewPager) itemView.findViewById(R.id.vp);
        BlankFragment2 blankFragment2 = new BlankFragment2();
        BlankFragment3 blankFragment3 = new BlankFragment3();
        fragments.add(blankFragment2);
        fragments.add(blankFragment3);


        VPAdapter vpAdapter = new VPAdapter(getChildFragmentManager(), 0, fragments);
        mVp.setAdapter(vpAdapter);
        mTab.setupWithViewPager(mVp);
        mTab.getTabAt(0).setText("体系");
        mTab.getTabAt(1).setText("导航");



    }
}
