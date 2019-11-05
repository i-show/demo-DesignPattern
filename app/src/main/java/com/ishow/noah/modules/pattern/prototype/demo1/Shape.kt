package com.ishow.noah.modules.pattern.prototype.demo1

/**
 * Created by yuhaiyang on 2019-11-05.
 * 图形
 */

abstract class Shape : Cloneable {
    var type: Int? = null
    var name: String? = null

    abstract fun draw()

     public override fun clone(): Shape {
        return super.clone() as Shape
    }
}