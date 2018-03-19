package com.laulee.androidmvvmdemo.bindingadapter;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public final class ImageViewBindingAdapter {

    @BindingAdapter("imagePath")
    public static void setImagePath(ImageView imageView,String path){
        Glide.with(imageView.getContext()).load(path).into(imageView);
    }
}
