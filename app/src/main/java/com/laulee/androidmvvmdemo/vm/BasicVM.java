package com.laulee.androidmvvmdemo.vm;

import android.app.Activity;
import android.databinding.ObservableField;
import android.view.View;

import com.laulee.androidmvvmdemo.model.User;

import java.util.Random;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class BasicVM implements ViewModel {

    public Activity activity;
    public ObservableField<User> user = new ObservableField<>(new User("张三",20));

    public BasicVM(Activity activity) {
        this.activity = activity;
    }

    public void refresh(View view){
        User userModel = new User("李四"+System.currentTimeMillis(), 21);
        user.set(userModel);
    }
}
