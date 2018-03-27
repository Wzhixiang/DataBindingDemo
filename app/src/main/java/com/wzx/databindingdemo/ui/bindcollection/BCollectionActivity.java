package com.wzx.databindingdemo.ui.bindcollection;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.databinding.ActivityBcollectionBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class BCollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savaInstateState){
        super.onCreate(savaInstateState);
        ActivityBcollectionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bcollection);
        ObservableMap<String, Object> user = new ObservableArrayMap<>();
        user.put("name", "王治湘");
        binding.setUser(user);
    }
}
