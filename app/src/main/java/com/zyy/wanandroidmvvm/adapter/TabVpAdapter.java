package com.zyy.wanandroidmvvm.adapter;



import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabVpAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> list;
    ArrayList<String> strings;
    public TabVpAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<Fragment> list, ArrayList<String> strings) {
        super(fm, behavior);
        this.list = list;
        this.strings=strings;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
