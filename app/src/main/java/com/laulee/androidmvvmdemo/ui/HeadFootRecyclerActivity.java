package com.laulee.androidmvvmdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.databinding.ActivityHeadFootRecyclerBinding;
import com.laulee.androidmvvmdemo.vm.HeadFootRecyclerVM;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class HeadFootRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHeadFootRecyclerBinding activityHeadFootRecyclerBinding = DataBindingUtil.setContentView(this, R.layout.activity_head_foot_recycler);
        activityHeadFootRecyclerBinding.setViewModel(new HeadFootRecyclerVM());
    }
}
