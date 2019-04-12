package com.demo.zxl.user.design_patterns.六大原则Imageloader;

import android.graphics.Bitmap;

/**
 * Created by user on 2019/4/13.
 */

public class Use {
    public void use(){
        ImageLoader imageLoader = new ImageLoader();
        //设置缓存
        imageLoader.setImageCache(new DoubleCache());
        //自定义缓存
        imageLoader.setImageCache(new ImageCache() {
            @Override
            public void put(String url, Bitmap bitmap) {

            }

            @Override
            public Bitmap get(String url) {
                return null;
            }
        });
    }
}
