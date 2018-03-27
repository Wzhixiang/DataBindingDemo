package com.wzx.databindingdemo.ui.binditem;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.bean.User;
import com.wzx.databindingdemo.databinding.ActivityBitemBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class BItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityBitemBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bitem);
        ObservableList<User> list = new ObservableArrayList<>();
        list.add(new User("name1"));
        list.add(new User("name2"));
        list.add(new User("name3"));
        list.add(new User("name4"));
    }
}
