package com.ishow.noah.modules.pattern.prototype.demo1

/**
 * Created by yuhaiyang on 2019-11-05.
 *
 */

class ShapeCache {
    private val cache = HashMap<Int, Shape>()

    fun getShape(type: Int): Shape? {
        val shape = cache[type]
        return shape?.clone()
    }

    fun cache() {
        val circle = Circle()
        circle.type = 1
        cache[circle.type!!] = circle

        val rect = Rect()
        rect.type = 2
        cache[2] = rect
    }
}