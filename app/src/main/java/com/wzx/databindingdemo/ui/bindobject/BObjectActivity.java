package com.wzx.databindingdemo.ui.bindobject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.bean.User;
import com.wzx.databindingdemo.databinding.ActivityBobjectBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class BObjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityBobjectBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bobject);
        User user = new User("view绑定model");
        binding.setUser(user);
    }
}
