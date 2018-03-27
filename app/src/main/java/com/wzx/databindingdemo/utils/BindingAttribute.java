package com.wzx.databindingdemo.utils;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

/**
 * 描述 TODO
 * Created by Administrator on 2018/3/27.
 */

public class BindingAttribute {

    @BindingAdapter(value = {"layoutManager", "adapter"}, requireAll = false)
    public static void setAdapter(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager,
                                  RecyclerView.Adapter adapter) {
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
