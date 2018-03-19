package com.laulee.androidmvvmdemo.bindingadapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public final class RecyclerViewBindingAdapter {

    @BindingAdapter("layoutManager")
    public static void setLayoutManager(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager){
        recyclerView.setLayoutManager(layoutManager);
    }

    @BindingAdapter("notifyAdapter")
    public static void setNotifyAdapter(RecyclerView recyclerView, RecyclerView.Adapter adapter){
        recyclerView.setAdapter(adapter);
    }
}
