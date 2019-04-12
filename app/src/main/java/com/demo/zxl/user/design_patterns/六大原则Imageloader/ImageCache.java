package com.demo.zxl.user.design_patterns.六大原则Imageloader;

import android.graphics.Bitmap;

/**
 * Created by user on 2019/2/23.
 */

public interface ImageCache {
    void put(String url, Bitmap bitmap);
    Bitmap get(String url);
}
