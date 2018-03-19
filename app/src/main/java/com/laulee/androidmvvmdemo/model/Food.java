package com.laulee.androidmvvmdemo.model;

import android.databinding.ObservableField;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class Food {
    public ObservableField<String> title = new ObservableField<>();
    public ObservableField<String> description =new ObservableField<>();
    public ObservableField<String> imageUrl= new ObservableField<>();

    public Food(String title, String description, String imageUrl) {
        this.title.set( title);
        this.description .set( description);
        this.imageUrl.set( imageUrl);
    }
}
