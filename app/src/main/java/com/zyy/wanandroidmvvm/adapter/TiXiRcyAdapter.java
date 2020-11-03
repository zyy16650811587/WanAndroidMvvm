package com.zyy.wanandroidmvvm.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.donkingliang.labels.LabelsView;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.TIxiActivity;
import com.zyy.wanandroidmvvm.bean.NewBean;
import com.zyy.wanandroidmvvm.bean.TixiBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class TiXiRcyAdapter extends RecyclerView.Adapter {
    private ArrayList<NewBean.DataBean> list;

    private Context context;

    public TiXiRcyAdapter(ArrayList<NewBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_square, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        NewBean.DataBean dataBean = list.get(position);
        ViewHolder holder1= (ViewHolder) holder;
        holder1.tv_name.setText(dataBean.getName());
        List<NewBean.DataBean.ChildrenBean> children = dataBean.getChildren();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < children.size(); i++) {
            strings.add(children.get(i).getName());

        }
        holder1.laview.setLabels(strings);
        holder1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewBean.DataBean dataBean1 = list.get(position);
                List<NewBean.DataBean.ChildrenBean> children1 = dataBean1.getChildren();
                Intent intent = new Intent(context, TIxiActivity.class);
                intent.putExtra("list", (Serializable) children1);
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
        public View rootView;
        public TextView tv_name;
        public LabelsView laview;

        public ViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.tv_name = (TextView) rootView.findViewById(R.id.tv_name);
            this.laview = (LabelsView) rootView.findViewById(R.id.laview);
        }
        public interface OnClict{
            void onclick(int position);
        }
        private OnClict onClict;

        public void setOnClict(OnClict onClict) {
            this.onClict = onClict;
        }
    }
}
