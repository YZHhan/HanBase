package com.yinzh.hanbase.common.listview.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.yinzh.hanbase.common.listview.holder.BaseViewHolder;

import java.util.ArrayList;

/*
 * @Author yinzh
 * @Date   2018/6/27 11:29
 * @Description
 */public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {

    private ArrayList<T> data;

    public BaseAdapter(ArrayList<T> data) {
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public T getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseViewHolder<T> baseViewHolder;
        if(view == null){
            baseViewHolder = getHolder();
        } else {
            baseViewHolder = (BaseViewHolder<T>) view.getTag();
        }
        baseViewHolder.refreshView(getItem(i));

        return baseViewHolder.getRootView();
    }


    public abstract BaseViewHolder<T> getHolder();

}
