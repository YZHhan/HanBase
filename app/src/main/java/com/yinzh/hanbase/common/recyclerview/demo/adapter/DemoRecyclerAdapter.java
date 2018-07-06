package com.yinzh.hanbase.common.recyclerview.demo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/*
 * @Author yinzh
 * @Date   2018/6/27 15:28
 * @Description
 */public class DemoRecyclerAdapter extends RecyclerView.Adapter{

    /**
     * 主要返回的是拿到布局，进而返回ViewHolder
     * @return
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    /**
     * 拿到ViewHolder中的控件对其赋值操作
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    /**
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return 0;
    }
}
