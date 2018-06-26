package com.yinzh.hanbase.qsbase.common.widget.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.qsmaxmin.qsbase.common.utils.QsHelper;

/**
 * Created by sky on 15/2/28. dialog 基类
 */
public abstract class QsDialogFragment extends DialogFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, getDialogTheme());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().setCanceledOnTouchOutside(true);
        final Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams params = window.getAttributes();
            setAttribute(params);
            window.setAttributes(params);
        }
        View dialogView = getDialogView(inflater, container);
        QsHelper.getInstance().getViewBindHelper().bind(this, dialogView);
        return dialogView;
    }

    protected void setAttribute(WindowManager.LayoutParams params) {
        params.gravity = Gravity.BOTTOM;
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
    }

    protected abstract int getDialogTheme();

    protected abstract View getDialogView(LayoutInflater inflater, ViewGroup container);

    protected String initTag() {
        return QsHelper.getInstance().getApplication().isLogOpen() ? getClass().getSimpleName() : "QsDialogFragment";
    }

    public void onViewClick(View view) {
    }
}
