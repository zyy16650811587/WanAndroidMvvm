package com.zyy.wanandroidmvvm.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.zyy.wanandroidmvvm.PublicWebActivity;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.bean.BannanBean;
import com.zyy.wanandroidmvvm.bean.ShouYeBean;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.RecyclerView;

public class ShouyeAdapter extends RecyclerView.Adapter {
    private ArrayList<ShouYeBean.DataBean.DatasBean> list;
    private Context context;

    public ShouyeAdapter(ArrayList<ShouYeBean.DataBean.DatasBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_rcy, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflate);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ShouYeBean.DataBean.DatasBean datasBean = list.get(position);
        ViewHolder holder1= (ViewHolder) holder;
       holder1.viewDataBinding.setVariable(BR.ShouyeBean,datasBean);
       holder1.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ShouYeBean.DataBean.DatasBean datasBean1 = list.get(position);
               String link = datasBean1.getLink();
               Intent intent = new Intent(context, PublicWebActivity.class);
               intent.putExtra("url", link);
               context.startActivity(intent);
           }
       });





    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static
    class ViewHolder extends RecyclerView.ViewHolder {

        ViewDataBinding viewDataBinding=null;

        public ViewHolder(@NonNull ViewDataBinding itemView) {
            super(itemView.getRoot());
           this.viewDataBinding=itemView;
        }

//        public ViewHolder(ViewDataBinding rootView){
//            this.viewDataBinding = rootView;
//            rootView.getRoot();
//
//        }
public interface Onclicket{
    void onTcklister(int position);
}
        private Te_Adapter.Onclicket onclicket;

        public void setOnclicket(Te_Adapter.Onclicket onclicket) {
            this.onclicket = onclicket;
        }



    }
}
