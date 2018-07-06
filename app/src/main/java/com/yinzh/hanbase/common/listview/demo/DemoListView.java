package com.yinzh.hanbase.common.listview.demo;

import android.view.View;

import com.yinzh.hanbase.common.listview.adapter.BaseAdapter;
import com.yinzh.hanbase.common.listview.holder.BaseViewHolder;

import java.util.ArrayList;

/*
 * @Author yinzh
 * @Date   2018/6/27 11:51
 * @Description
 */
public class DemoListView {

    class DemoViewHolder extends BaseViewHolder<String>{

        @Override
        public View initView() {

            return null;
        }

        @Override
        public void refreshView(String data) {

        }
    }


    class DemoAdapter extends BaseAdapter<String> {


        public DemoAdapter(ArrayList<String> data) {
            super(data);
        }

        @Override
        public BaseViewHolder<String> getHolder() {
            return new DemoViewHolder();
        }
    }
}
