package com.ishow.noah.modules.pattern.prototype.demo1

import android.util.Log
import com.ishow.noah.widget.LogView

/**
 * Created by yuhaiyang on 2019-11-05.
 * 圆形
 */
class Circle : Shape() {
    override fun draw() {
        LogView.log("draw: circle")
    }

}