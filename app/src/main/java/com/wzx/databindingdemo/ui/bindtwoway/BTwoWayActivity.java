package com.wzx.databindingdemo.ui.bindtwoway;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.bean.User;
import com.wzx.databindingdemo.databinding.ActivityBtwowayBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/28.
 */

public class BTwoWayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityBtwowayBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_btwoway);
        binding.setUser(new User("王治湘"));
    }
}
