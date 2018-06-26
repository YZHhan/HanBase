package com.yinzh.hanbase.qsbase.mvp.fragment;

import com.qsmaxmin.qsbase.common.widget.ptr.PtrFrameLayout;
import com.qsmaxmin.qsbase.common.widget.ptr.PtrUIHandler;

/**
 * @CreateBy qsmaxmin
 * @Date 2017/7/4 11:08
 * @Description
 */

public interface QsIPullHeaderViewPagerFragment extends QsIHeaderViewPagerFragment {

    PtrUIHandler getPtrUIHandlerView();

    void onRefresh();

    void startRefreshing();

    void stopRefreshing();

    void openPullRefreshing();

    void closePullRefreshing();

    PtrFrameLayout getPtrFrameLayout();
}
