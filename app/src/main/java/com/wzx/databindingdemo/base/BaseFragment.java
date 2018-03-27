package com.wzx.databindingdemo.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wzx.databindingdemo.bean.Msg;


/**
 * 描述 TODO
 * Created by Administrator on 2018/3/20.
 */

public abstract class BaseFragment extends Fragment implements IBaseView {

    protected ViewDataBinding mViewDataBinding;

    protected abstract int getLayoutId();

    protected abstract void initViews(Bundle saveInstanceState);

    protected abstract void requestData(boolean isRefresh);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewDataBinding = DataBindingUtil.inflate(
                LayoutInflater.from(container.getContext()),
                getLayoutId(),
                container,
                false);

        return mViewDataBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
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
