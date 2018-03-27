package com.wzx.databindingdemo.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.base.BaseActivity;
import com.wzx.databindingdemo.base.recyclerview.IBindingBean;
import com.wzx.databindingdemo.base.recyclerview.RVBindingAdapter;
import com.wzx.databindingdemo.databinding.ActivityMainBinding;
import com.wzx.databindingdemo.viewmodel.MainViewModel;

import java.util.List;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class MainActivity extends BaseActivity {

    private RVBindingAdapter mAdapter;
    private MainViewModel mViewModel;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(Bundle saveInstanceState) {
        mAdapter = new RVBindingAdapter();

        ActivityMainBinding dataBinding = (ActivityMainBinding) mViewDataBinding;
        dataBinding.setLayoutManager(new LinearLayoutManager(this));
        dataBinding.setAdapter(mAdapter);

        mViewModel = new MainViewModel(this);
    }

    @Override
    protected void requestData(boolean isRefresh) {
        mViewModel.getLearn();
    }

    public void showLearnClass(List<IBindingBean> list) {
        mAdapter.updateData(list, true);
    }
}
