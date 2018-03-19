package com.laulee.androidmvvmdemo.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.databinding.RecyclerItemBinding;
import com.laulee.androidmvvmdemo.model.Food;
import com.laulee.androidmvvmdemo.vm.RecyclerItemVM;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {

    private List<Food> foodList = new ArrayList<>();

    public RecyclerAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.recycler_item,parent,false);
        return new RecyclerViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RecyclerViewHolder)holder).getItemBinding().setViewModel(new RecyclerItemVM(foodList.get(position)));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        RecyclerItemBinding itemBinding;
        public RecyclerViewHolder(RecyclerItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }

        public RecyclerItemBinding getItemBinding(){
            return itemBinding;
        }
    }
}
