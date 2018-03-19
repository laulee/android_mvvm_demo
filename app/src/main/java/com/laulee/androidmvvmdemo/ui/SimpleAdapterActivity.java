package com.laulee.androidmvvmdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.databinding.ActivitySimpleAdapterBinding;
import com.laulee.androidmvvmdemo.vm.SimpleAdapterVM;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class SimpleAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySimpleAdapterBinding activitySimpleAdapterBinding = DataBindingUtil.setContentView(this, R.layout.activity_simple_adapter);
        activitySimpleAdapterBinding.setViewModel(new SimpleAdapterVM());
    }
}
