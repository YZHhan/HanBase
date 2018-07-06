package com.yinzh.hanbase.common.recyclerview.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.qsmaxmin.qsbase.common.widget.toast.QsToast;
import com.yinzh.hanbase.R;
import com.yinzh.hanbase.common.recyclerview.demo.adapter.MyRecyclerAdapter;
import com.yinzh.hanbase.common.recyclerview.demo.model.MyModel;

import java.util.ArrayList;

/*
 * @Author yinzh
 * @Date   2018/6/27 15:15
 * @Description
 */
public class RecyclerActivity extends Activity{

    private ArrayList <MyModel> mDataList;
    private static final String[] TITLE = {"Animation", "MultipleItem", "Header/Footer", "PullToRefresh", "Section", "EmptyView", "DragAndSwipe", "ItemClick", "ExpandableItem", "DataBinding"};
    private static final int[] IMG = {R.mipmap.gv_animation, R.mipmap.gv_multipleltem, R.mipmap.gv_header_and_footer, R.mipmap.gv_pulltorefresh, R.mipmap.gv_section, R.mipmap.gv_empty, R.mipmap.gv_drag_and_swipe, R.mipmap.gv_item_click, R.mipmap.gv_expandable, R.mipmap.gv_databinding};



    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initView();
        initData();
        initAdapter();



    }

    private void initView(){
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }


    private void initData(){
        mDataList = new ArrayList<>();

        for (int i = 0; i < TITLE.length; i++) {
            MyModel myModel = new MyModel();
            myModel.setTitle(TITLE[i]);
            myModel.setImageResource(IMG[i]);
            mDataList.add(myModel);
        }
    }

    private void initAdapter(){
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(R.layout.home_itme_view, mDataList);
        myRecyclerAdapter.openLoadAnimation();
        myRecyclerAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                QsToast.show(TITLE[position]);
            }
        });


        recyclerView.setAdapter(myRecyclerAdapter);
    }

}
