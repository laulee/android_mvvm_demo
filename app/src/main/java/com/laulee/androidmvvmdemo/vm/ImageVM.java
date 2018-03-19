package com.laulee.androidmvvmdemo.vm;

import android.databinding.ObservableField;
import android.view.View;

/**
 * 作者：Created by Laulee
 * 时间：2018/3/19.
 */

public class ImageVM implements ViewModel {

    private boolean isOne = true;
    public ObservableField<String> imagePath = new ObservableField<>("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");

    public void refreshImage(View view) {
        if (isOne) {
            imagePath.set("http://pic-bucket.nosdn.127.net/photo/0001/2018-03-19/DD8QR84400AO0001NOS.jpg");
        } else {
            imagePath.set("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
        }
        isOne=!isOne;
    }
}
