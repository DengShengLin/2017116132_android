package com.android.qzs.qzsrecycleview;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qzs on 2016/7/11.
 */
class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private Context context;
    private List<String> list;

    //构造方法
    public RecycleAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.item_home, parent,
                false));
        return holder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tv.setText(list.get(position));
        holder.tv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.size() == 0) {
                    Snackbar.make(v, "无法删除", Snackbar.LENGTH_SHORT).show();
                } else {
                    //删除自带默认动画
                    removeData(position);
                }
            }
        });
        holder.tv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editData(position);
            }
        });

    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    //  添加数据
    public void addData(int position) {
//      在list中添加数据，并通知条目加入一条
        list.add(position, "我是备忘录" + position);
        //添加动画
        notifyItemInserted(position);
    }

    //修改数据
    public void editData(int position){
        list.set(position,"备忘录"+position+"已经改变");
        //修改动画
        notifyItemChanged(position);
    }

    //  删除数据
    public void removeData(int position) {
        list.remove(position);
        //删除动画
        notifyItemRemoved(position);
        notifyDataSetChanged();
    }
    /**
     * ViewHolder的类，用于缓存控件
     */
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv, tv_delete,tv_edit;
        //因为删除有可能会删除中间条目，然后会造成角标越界，所以必须整体刷新一下！
        public MyViewHolder(View view) {
            super(view);
            tv = (TextView) view.findViewById(R.id.id_num);
            tv_delete = (TextView) view.findViewById(R.id.tv_delete);
            tv_edit = (TextView) view.findViewById(R.id.tv_edit);
        }
    }
}
