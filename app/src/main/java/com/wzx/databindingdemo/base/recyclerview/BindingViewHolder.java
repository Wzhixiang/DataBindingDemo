package com.wzx.databindingdemo.base.recyclerview;


import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.wzx.databindingdemo.BR;


/**
 * 描述 TODO
 * Created by Administrator on 2018/3/2.
 */

public class BindingViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding mBinding;

    public BindingViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    public void bindData(IBindingBean item){
        mBinding.setVariable(BR.item, item);

    }

    public ViewDataBinding getBinding() {
        return mBinding;
    }
}
