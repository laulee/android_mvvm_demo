package com.laulee.androidmvvmdemo.vm;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.laulee.androidmvvmdemo.BR;
import com.laulee.androidmvvmdemo.R;
import com.laulee.androidmvvmdemo.model.Food;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;
import me.tatarka.bindingcollectionadapter2.collections.MergeObservableList;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class HeadFootRecyclerVM implements ViewModel {

    private ObservableList<SimpleItemVM> viewItemList = new ObservableArrayList<>();
    public MergeObservableList<Object> items = new MergeObservableList<>().insertItem("Header").insertList(viewItemList).insertItem("Foot");

    public final OnItemBind<Object> onItemBind = new OnItemBind<Object>() {
        @Override
        public void onItemBind(ItemBinding itemBinding, int position, Object item) {
            if (String.class.equals(item.getClass())) {
                itemBinding.set(BR.simpleVM, R.layout.simple_item);
            } else if (SimpleItemVM.class.equals(item.getClass())) {
                itemBinding.set(BR.simpleVM, R.layout.simple_item);
            }
        }
    };

    public HeadFootRecyclerVM() {
        initData();
    }

    private void initData() {
        for (int i = 0; i < 50; i++) {
            Food food = new Food("food 123","eat food","http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
            viewItemList.add(new SimpleItemVM(food));
        }
    }
}
