package com.laulee.androidmvvmdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.adapter.ListAdapter;
import com.laulee.androidmvvmdemo.databinding.ActivityListviewBinding;
import com.laulee.androidmvvmdemo.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListviewBinding activityListviewBinding = DataBindingUtil.setContentView(this, R.layout.activity_listview);
        activityListviewBinding.setAdapter(new ListAdapter(initData()));
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
