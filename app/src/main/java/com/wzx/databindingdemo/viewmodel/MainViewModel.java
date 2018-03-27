package com.wzx.databindingdemo.viewmodel;

import com.wzx.databindingdemo.base.recyclerview.IBindingBean;
import com.wzx.databindingdemo.bean.LearnClass;
import com.wzx.databindingdemo.ui.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述 TODO
 * Created by Administrator on 2018/3/27.
 */

public class MainViewModel {

    private MainActivity mActivity;

    public MainViewModel(MainActivity activity) {
        this.mActivity = activity;
    }

    public void getLearn() {
        List<IBindingBean> list = new ArrayList<>();
        LearnClass learnClass = new LearnClass();
        learnClass.setName("object");
        learnClass.setAction(LearnClass.Type.LEARN_CLASS_OBJECT);
        list.add(learnClass);
        mActivity.showLearnClass(list);
    }

}
