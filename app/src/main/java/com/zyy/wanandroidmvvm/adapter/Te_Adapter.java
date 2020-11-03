package com.zyy.wanandroidmvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.internal.schedulers.NewThreadWorker;

import com.donkingliang.labels.LabelsView;
import com.zyy.wanandroidmvvm.R;
import com.zyy.wanandroidmvvm.bean.NavigationBean;

import java.util.ArrayList;
import java.util.List;

public class Te_Adapter extends RecyclerView.Adapter {

    Context context;
    List<NavigationBean.DataBean> lisl;

    public Te_Adapter(Context context, List<NavigationBean.DataBean> lisl) {
        this.context = context;
        this.lisl = lisl;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_square, parent, false);
        final holder1 holder1 = new holder1(inflate);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onclicket!=null){

                    onclicket.onTcklister(holder1.getLayoutPosition());


                }

            }
        });
        return holder1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder1 hoder1 = (holder1) holder;
        NavigationBean.DataBean dataBean = lisl.get(position);
        hoder1.tv_name.setText(dataBean.getName());
        List<NavigationBean.DataBean.ArticlesBean> children = dataBean.getArticles();

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <children.size() ; i++) {
            strings.add(children.get(i).getTitle());

        }
        hoder1.laview.setLabels(strings);

    }

    @Override
    public int getItemCount() {
        return lisl.size();
    }

    class holder1 extends RecyclerView.ViewHolder {
        LabelsView laview;
        TextView tv_name;
        public holder1(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            laview = itemView.findViewById(R.id.laview);
        }
    }
    public interface Onclicket{
        void onTcklister(int position);
    }
    private Onclicket onclicket;

    public void setOnclicket(Onclicket onclicket) {
        this.onclicket = onclicket;
    }
}
