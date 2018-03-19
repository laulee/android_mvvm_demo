package com.laulee.androidmvvmdemo.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.databinding.ListviewItemBinding;
import com.laulee.androidmvvmdemo.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class ListAdapter extends BaseAdapter {

    private List<Food> foodList = new ArrayList<>();

    public ListAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View contentView, ViewGroup viewGroup) {
        ListviewItemBinding binding ;
        if(contentView==null){
            binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.listview_item,viewGroup,false);
            contentView = binding.getRoot();
        }else{
            binding = DataBindingUtil.getBinding(contentView);
        }

        bindingHolder(binding,foodList.get(i));
        return contentView;
    }

    private void bindingHolder(ListviewItemBinding binding,Food food) {
        binding.setFood(food);
    }
}
