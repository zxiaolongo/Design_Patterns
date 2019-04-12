package com.demo.zxl.user.design_patterns.六大原则Imageloader;

import android.graphics.Bitmap;

/**
 * Created by user on 2019/2/23.
 */

public class DoubleCache  implements ImageCache{
    ImageCache mMermeryCache = new MemeryCache();
    ImageCache mDisCache = new DiskCache();
    @Override
    public void put(String url, Bitmap bitmap) {
        mMermeryCache.put(url,bitmap);
        mDisCache.put(url,bitmap);
    }
    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMermeryCache.get(url);
        if (bitmap == null){
            bitmap = mDisCache.get(url);
        }
        return bitmap;
    }

}
