package com.wzx.databindingdemo.ui.bindevent;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.MyHandlers;
import com.wzx.databindingdemo.Presenter;
import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.Task;
import com.wzx.databindingdemo.databinding.ActivityBeventBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class BEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityBeventBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bevent);
        binding.setHandler(new MyHandlers());
        binding.setTask(new Task(this));
        binding.setPresenter(new Presenter());
    }
}
