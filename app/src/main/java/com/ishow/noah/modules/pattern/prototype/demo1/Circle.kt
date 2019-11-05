package com.ishow.noah.modules.pattern.prototype.demo1

import android.util.Log

/**
 * Created by yuhaiyang on 2019-11-05.
 * 圆形
 */
class Circle : Shape() {
    override fun draw() {
        Log.i("yhy", "draw: circle")
    }

}