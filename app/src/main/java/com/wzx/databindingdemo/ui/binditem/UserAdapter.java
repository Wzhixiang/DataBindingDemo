package com.wzx.databindingdemo.ui.binditem;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.wzx.databindingdemo.R;
import com.wzx.databindingdemo.bean.User;
import com.wzx.databindingdemo.databinding.ItemNameBinding;

import java.util.List;

/**
 * 描述 TODO
 * Created by Administrator on 2018/2/27.
 */

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<User> mData;

    public UserAdapter(Context context, List<User> list) {
        this.mContext = context;
        this.mData = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder((ItemNameBinding) DataBindingUtil.inflate(
                LayoutInflater.from(mContext), R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof UserViewHolder) {
            ItemNameBinding binding = ((UserViewHolder) holder).getBinding();

//            if (position % 2 == 0) {
//                binding.setError(ContextCompat.getDrawable(mContext, R.mipmap.ic_launcher_round));
//            } else {
//                binding.setUrl(ContextCompat.getDrawable(mContext, R.mipmap.ic_launcher));
//            }


            binding.setUser(mData.get(position));
            binding.executePendingBindings();
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        private ItemNameBinding mBinding;

        public UserViewHolder(ItemNameBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        public ItemNameBinding getBinding() {
            return mBinding;
        }

        public void setBinding(ItemNameBinding binding) {
            mBinding = binding;
        }
    }
}