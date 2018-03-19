package com.laulee.androidmvvmdemo.bindingadapter;

import android.databinding.BindingAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public final class ListViewBindingAdapter {

    @BindingAdapter("adapter")
    public static void setAdapter(ListView listView, BaseAdapter adapter){
        listView.setAdapter(adapter);
    }
}
