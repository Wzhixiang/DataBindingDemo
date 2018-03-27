package com.wzx.databindingdemo.ui.binditem;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.bean.User;

import java.util.List;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class Utils {

    /**
     * 单参
     * @param recyclerView
     * @param list
     */
    @BindingAdapter("data")
    public static void setData(RecyclerView recyclerView, List<User> list) {
        recyclerView.setLayoutManager(
                new LinearLayoutManager(recyclerView.getContext(),
                        LinearLayoutManager.VERTICAL,
                        false));
        recyclerView.setAdapter(new UserAdapter(recyclerView.getContext(), list));
    }

    /**
     * 多参
     * @param imageView
     * @param url
     * @param errorDrawable
     */
    @BindingAdapter({"url", "error"})
    public static void loadImage(ImageView imageView, String url, String errorDrawable) {
        if (url == null) {
            imageView.setImageResource(R.mipmap.ic_launcher_round);
        } else {
            imageView.setImageResource(R.mipmap.ic_launcher);
        }

    }
}

