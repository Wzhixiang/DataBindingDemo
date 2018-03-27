package com.wzx.databindingdemo;

import android.content.Context;
import android.content.Intent;

import com.wzx.databindingdemo.ui.bindUseRes.BUseResActivity;
import com.wzx.databindingdemo.ui.bindcollection.BCollectionActivity;
import com.wzx.databindingdemo.ui.bindevent.BEventActivity;
import com.wzx.databindingdemo.ui.bindfield.BFieldActivity;
import com.wzx.databindingdemo.ui.binditem.BItemActivity;
import com.wzx.databindingdemo.ui.bindobject.BObjectActivity;
import com.wzx.databindingdemo.ui.bindtwoway.BTwoWayActivity;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class Presenter {

    /**
     * @param context
     */
    public void toBObjectActivity(Context context) {
        context.startActivity(new Intent(context, BObjectActivity.class));
    }

    public void toFieldActivity(Context context) {
        context.startActivity(new Intent(context, BFieldActivity.class));
    }

    public void toCollectionActivity(Context context) {
        context.startActivity(new Intent(context, BCollectionActivity.class));
    }

    public void toBEventActivity(Context context) {
        context.startActivity(new Intent(context, BEventActivity.class));
    }

    public void toBItemActivity(Context context) {
        context.startActivity(new Intent(context, BItemActivity.class));
    }

    public void toBTwoWayActivity(Context context) {
        context.startActivity(new Intent(context, BTwoWayActivity.class));
    }

    public void toBUseResActivity(Context context) {
        context.startActivity(new Intent(context, BUseResActivity.class));
    }



    public void onDoTask(Task task) {
        task.run();
    }

}
