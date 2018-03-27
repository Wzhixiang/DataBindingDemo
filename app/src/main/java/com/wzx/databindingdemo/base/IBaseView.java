package com.wzx.databindingdemo.base;


import com.wzx.databindingdemo.bean.Msg;

/**
 * 描述 TODO
 * Created by Administrator on 2018/3/20.
 */

public interface IBaseView {

    void onLoading();

    void onCompleted();

    void onErrors(Msg msg);
}
