package com.laulee.androidmvvmdemo.vm;

import android.app.Activity;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;

import com.laulee.androidmvvmdemo.adapter.RecyclerAdapter;
import com.laulee.androidmvvmdemo.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class RecyclerVM implements ViewModel {

    public ObservableField<LinearLayoutManager> layoutManager = new ObservableField<>();
    public ObservableField<RecyclerAdapter> recyclerAdapter = new ObservableField<>() ;

    public RecyclerVM(Activity activity) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        this.layoutManager.set(linearLayoutManager);
    }

    public void getData(){
        RecyclerAdapter adapter = new RecyclerAdapter(initData());
        recyclerAdapter.set(adapter);
    }

    private List<Food> initData() {
        List<Food> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Food food = new Food("123","de","http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
            list.add(food);
        }
        return list;
    }
}
