package com.zyy.wanandroidmvvm.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zyy.wanandroidmvvm.BR;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.XIangWebActivity;
import com.zyy.wanandroidmvvm.bean.XiangBean;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class XiangAdapter extends RecyclerView.Adapter {
    private ArrayList<XiangBean.DataBean.DatasBean> list;
    private Context context;

    public XiangAdapter(ArrayList<XiangBean.DataBean.DatasBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context),
                R.layout.xiang_rcy, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final XiangBean.DataBean.DatasBean datasBean = list.get(position);
        ViewHolder holder1= (ViewHolder) holder;
        holder1.viewDataBinding.setVariable(BR.XiangBean,datasBean);
        holder1.viewDataBinding.executePendingBindings();
        holder1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XiangBean.DataBean.DatasBean datasBean1 = list.get(position);
                String link = datasBean1.getLink();
                Intent intent = new Intent(context, XIangWebActivity.class);
                intent.putExtra("url",link);
                context.startActivity(intent);
            }
        });
//        holder1.setOnclicklis(new ViewHolder.Onclicklis() {
//            @Override
//            public void onClick(int position) {
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        Log.e("xxxxx","list:  "+list.size());
        return list.size();

    }

    public static
    class ViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding viewDataBinding;


        public ViewHolder(ViewDataBinding rootView) {
            super(rootView.getRoot());
            this.viewDataBinding = rootView;


        }
        public interface Onclicklis{
            void onClick(int position);
        }
        private Onclicklis onclicklis;

        public void setOnclicklis(Onclicklis onclicklis) {
            this.onclicklis = onclicklis;
        }
    }
}
