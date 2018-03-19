package com.laulee.androidmvvmdemo.vm;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.view.View;

import com.laulee.androidmvvmdemo.ui.BasicActivity;
import com.laulee.androidmvvmdemo.ui.HeadFootRecyclerActivity;
import com.laulee.androidmvvmdemo.ui.ImageActivity;
import com.laulee.androidmvvmdemo.ui.ListViewActivity;
import com.laulee.androidmvvmdemo.ui.RecycleViewActivity;
import com.laulee.androidmvvmdemo.ui.SimpleAdapterActivity;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class MainVM implements ViewModel{
    public Activity activity;
    public ObservableField<String> basic = new ObservableField<>("Basic demo");

    public MainVM(Activity activity) {
        this.activity = activity;
    }

    public void openBasic(View view){
        Intent intent = new Intent(activity, BasicActivity.class);
        activity.startActivity(intent);
    }

    public void openImage(View view){
        Intent intent = new Intent(activity, ImageActivity.class);
        activity.startActivity(intent);
    }

    public void openListView(View view){
        Intent intent = new Intent(activity, ListViewActivity.class);
        activity.startActivity(intent);
    }

    public void openRecycleView(View view){
        Intent intent = new Intent(activity, RecycleViewActivity.class);
        activity.startActivity(intent);
    }

    public void openSimpleAdapter(View view){
        Intent intent = new Intent(activity, SimpleAdapterActivity.class);
        activity.startActivity(intent);
    }

    public void openHeadFootRecycler(View view){
        Intent intent = new Intent(activity, HeadFootRecyclerActivity.class);
        activity.startActivity(intent);
    }
}
