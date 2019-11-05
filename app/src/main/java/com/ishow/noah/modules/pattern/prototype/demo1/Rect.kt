package com.ishow.noah.modules.pattern.prototype.demo1

import android.util.Log

/**
 * Created by yuhaiyang on 2019-11-05.
 *
 */
class Rect : Shape() {
    override fun draw() {
        Log.i("yhy", "draw: rect")
    }

}