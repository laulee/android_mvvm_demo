package com.laulee.androidmvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.laulee.androidmvvmdemo.databinding.ActivityMainBinding;
import com.laulee.androidmvvmdemo.vm.MainVM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainVM mainVM = new MainVM(this);
        viewDataBinding.setVariable(BR.viewModel, mainVM);
    }
}
