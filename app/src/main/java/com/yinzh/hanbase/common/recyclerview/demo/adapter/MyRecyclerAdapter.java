package com.yinzh.hanbase.common.recyclerview.demo.adapter;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yinzh.hanbase.R;
import com.yinzh.hanbase.common.recyclerview.demo.model.MyModel;

import java.util.List;

/*
 * @Author yinzh
 * @Date   2018/6/28 10:53
 * @Description
 */
public class MyRecyclerAdapter extends BaseQuickAdapter<MyModel, BaseViewHolder> {

    public MyRecyclerAdapter(int layoutResId, @Nullable List<MyModel> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyModel item) {
        helper.setText(R.id.tv_text, item.getTitle());
        helper.setImageResource(R.id.iv_image, item.getImageResource());

    }
}
