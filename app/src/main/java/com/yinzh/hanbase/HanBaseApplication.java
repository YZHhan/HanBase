package com.yinzh.hanbase;

import com.qsmaxmin.qsbase.QsApplication;
import com.qsmaxmin.qsbase.common.http.HttpBuilder;

/*
 * @Author yinzh
 * @Date   2018/6/28 15:03
 * @Description
 */
public class HanBaseApplication extends QsApplication{
    @Override
    public boolean isLogOpen() {
        return false;
    }

    @Override
    public void initHttpAdapter(HttpBuilder httpBuilder) {

    }
}
