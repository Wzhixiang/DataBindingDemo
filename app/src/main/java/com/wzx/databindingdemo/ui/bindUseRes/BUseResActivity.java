package com.wzx.databindingdemo.ui.bindUseRes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.databinding.ActivityBuseresBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/3/1.
 */

public class BUseResActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityBuseresBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_buseres);
        binding.setName("引用资源文件");
    }
}
