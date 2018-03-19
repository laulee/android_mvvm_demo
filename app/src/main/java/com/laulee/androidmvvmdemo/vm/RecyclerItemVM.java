package com.laulee.androidmvvmdemo.vm;

import android.databinding.ObservableField;

import com.laulee.androidmvvmdemo.model.Food;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class RecyclerItemVM implements ViewModel {

    public ObservableField<Food> food = new ObservableField<>();

    public RecyclerItemVM(Food food) {
        this.food .set(food);
    }
}
