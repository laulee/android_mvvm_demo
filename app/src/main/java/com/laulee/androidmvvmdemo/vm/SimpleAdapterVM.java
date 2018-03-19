package com.laulee.androidmvvmdemo.vm;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;

import com.laulee.androidmvvmdemo.BR;
import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.model.Food;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class SimpleAdapterVM implements ViewModel {

    public ObservableList<SimpleItemVM> viewModelObservableList = new ObservableArrayList<>();

    public ItemBinding<SimpleItemVM> itemBinding = ItemBinding.of(BR.simpleVM,
            R.layout.simple_item);

    public SimpleAdapterVM() {
        initData();
    }

    private void initData() {
        for (int i = 0; i < 50; i++) {
            Food food = new Food("food","eat food","http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
            viewModelObservableList.add(new SimpleItemVM(food));
        }
    }
}
