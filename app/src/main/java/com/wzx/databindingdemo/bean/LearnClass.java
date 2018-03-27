package com.wzx.databindingdemo.bean;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.base.recyclerview.IBindingBean;

/**
 * 描述 TODO
 * Created by Administrator on 2018/3/27.
 */

public class LearnClass implements IBindingBean{

    @Override
    public int setItemLayout() {
        return R.layout.item_learn_class;
    }

    public interface Type {
        int LEARN_CLASS_OBJECT = 1;
        int LEARN_CLASS_FIELD = 2;
        int LEARN_CLASS_COLLECTION = 3;
        int LEARN_CLASS_EVENT = 4;
        int LEARN_CLASS_LIST = 5;
        int LEARN_CLASS_BINDING = 6;
        int LEARN_CLASS_USERD = 7;

    }

    private String name;
    private int action;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
}
