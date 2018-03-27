package com.wzx.databindingdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class Task implements Runnable{
    private Context mContext;

    public Task(Context context) {
        this.mContext = context;
    }

    @Override
    public void run() {
        Toast.makeText(mContext, "任务：提示Toast", Toast.LENGTH_SHORT).show();
    }
}
