package com.wzx.databindingdemo.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.bean.Msg;

/**
 * 描述 TODO
 * Created by Administrator on 2018/3/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements IBaseView {

    protected ViewDataBinding mViewDataBinding;

    protected abstract int getLayoutId();

    protected abstract void initViews(Bundle saveInstanceState);

    protected abstract void requestData(boolean isRefresh);

    protected void setWindowParams() {

    }

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setWindowParams();

        mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());

        initViews(saveInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        requestData(true);
    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onErrors(Msg msg) {

    }
}
