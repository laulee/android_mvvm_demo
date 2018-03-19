package com.laulee.androidmvvmdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.databinding.ActivityRecycleviewBinding;
import com.laulee.androidmvvmdemo.vm.RecyclerVM;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class RecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecycleviewBinding recycleviewBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycleview);
        RecyclerVM recyclerVM = new RecyclerVM(this);
        recycleviewBinding.setViewModel(recyclerVM);
        recyclerVM.getData();
    }
}
