package com.zyy.wanandroidmvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.bean.NewBean;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewRcyAdapter extends RecyclerView.Adapter {
    private ArrayList<NewBean.DataBean> list;
    private Context context;

    public NewRcyAdapter(ArrayList<NewBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_know_list, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        NewBean.DataBean dataBean = list.get(position);
        ViewHolder holder1 = (ViewHolder) holder;
        List<NewBean.DataBean.ChildrenBean> children = dataBean.getChildren();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < children.size(); i++) {
            stringBuilder.append(children.get(i).getName());
            stringBuilder.append("   ");
        }

        holder1.tv_know_title.setText(stringBuilder.toString());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static
    class ViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public TextView tv_know_name;
        public TextView tv_know_title;
        public ImageView iv_know_img;

        public ViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.tv_know_name = (TextView) rootView.findViewById(R.id.tv_know_name);
            this.tv_know_title = (TextView) rootView.findViewById(R.id.tv_know_title);
            this.iv_know_img = (ImageView) rootView.findViewById(R.id.iv_know_img);
        }

    }
}
