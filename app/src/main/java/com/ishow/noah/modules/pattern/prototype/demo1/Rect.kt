package com.ishow.noah.modules.pattern.prototype.demo1

import com.ishow.noah.widget.LogView

/**
 * Created by yuhaiyang on 2019-11-05.
 *
 */
class Rect : Shape() {
    override fun draw() {
        LogView.log("draw: rect")
    }
}