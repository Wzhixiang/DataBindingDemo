package com.wzx.databindingdemo;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class MyHandlers {

    public void onClick(View view){
        Snackbar.make(view, "提示Snackbar",Snackbar.LENGTH_SHORT).show();
    }
}
