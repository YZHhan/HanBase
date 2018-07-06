package com.yinzh.hanbase.common.listview.holder;

import android.view.View;

/*
 * @Author yinzh
 * @Date   2018/6/27 11:23
 * @Description:
 */
public abstract class BaseViewHolder<T> {

    //一个Item的跟布局
    private View mRootView;
    //一个Item的数据
    private T mData;


    public BaseViewHolder() {
        mRootView = initView();

        // 打一个标记
        mRootView.setTag(this);
    }

    /**
     * 加载布局文件
     * 初始化控件ID
     */
    public abstract View initView();


    /**
     * 返回Item的布局对象
     *
     * @return
     */
    public View getRootView() {
        if (mRootView == null) throw new RuntimeException("The mRootView  is null");
        return mRootView;
    }


    // 设置当前item的数据
    public void setData(T data) {
        this.mData = data;
        refreshView(data);
    }

    // 获取当前item的数据
    public T getData() {
        return mData;
    }

    // 4. 根据数据来刷新界面
    public abstract void refreshView(T data);


}
