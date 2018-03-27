package com.wzx.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 描述 TODO 继承BaseObservable（被观察者）
 * Created by Administrator on 2018/2/27.
 */

public class User extends BaseObservable{

    private String name;

    private String task;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String task) {
        this.name = name;
        this.task = task;
    }

    /**
     * @Bindable注解起到绑定数据作用
     * @return
     */
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //通知数据改变
        notifyPropertyChanged(com.wzx.databindingdemo.BR.name);
    }

    @Bindable
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
        notifyPropertyChanged(com.wzx.databindingdemo.BR.task);
    }
}
