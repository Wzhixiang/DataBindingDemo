package com.wzx.databindingdemo.base.recyclerview;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述 TODO RecyclerView.Adapter
 * Created by Administrator on 2018/3/2.
 */

public class RVBindingAdapter extends RecyclerView.Adapter<BindingViewHolder> {

    private List<IBindingBean> mList;

    public RVBindingAdapter() {
        mList = new ArrayList<>();
    }

    public RVBindingAdapter(List<IBindingBean> list) {
        mList = list;
    }

    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return mList.get(position).setItemLayout();
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        viewType,
                        parent,
                        false);
        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, final int position) {
        holder.bindData(mList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onItemClick(mList.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void updateData(@NonNull List<IBindingBean> list, boolean isRefresh) {
        if (mList == null) {
            mList = new ArrayList<>();
        }
        if (isRefresh) {
            mList.clear();
        }
        mList.addAll(list);
        notifyDataSetChanged();
    }

    private ItemClickListener mListener;

    public void setItemClickListener(ItemClickListener listener) {
        this.mListener = listener;
    }
}
