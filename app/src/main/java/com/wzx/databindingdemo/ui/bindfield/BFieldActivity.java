package com.wzx.databindingdemo.ui.bindfield;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.databinding.ActivityBfieldBinding;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class BFieldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityBfieldBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bfield);
        binding.setUser(new ObservableField<>("field"));
    }
}
