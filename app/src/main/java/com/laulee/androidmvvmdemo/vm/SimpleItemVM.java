package com.laulee.androidmvvmdemo.vm;

import android.databinding.ObservableField;

import com.laulee.androidmvvmdemo.model.Food;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class SimpleItemVM implements ViewModel{

    public ObservableField<Food> food = new ObservableField<>();

    public SimpleItemVM(Food foodObservableField) {
        this.food.set(foodObservableField);
    }
}
