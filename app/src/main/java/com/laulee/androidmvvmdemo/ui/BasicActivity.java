package com.laulee.androidmvvmdemo.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.databinding.ActivityBasicBinding;
import com.laulee.androidmvvmdemo.vm.BasicVM;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding activityBasicBinding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
        activityBasicBinding.setViewModel(new BasicVM(this));
    }
}
