package com.demo.zxl.user.design_patterns.六大原则Imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 内存缓存
 * Created by user on 2019/2/23.
 */

public class MemeryCache implements ImageCache {
    private LruCache<String, Bitmap> mMemeryCache;

    public MemeryCache() {
        //计算最大内存
        int maxMemery = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //取1/4的可用内存作为缓存
        int cacheSize = maxMemery / 4;
        mMemeryCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemeryCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        return mMemeryCache.get(url);
    }
}
