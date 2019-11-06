package com.ishow.noah.modules.pattern.template.demo1

/**
 * Created by yuhaiyang on 2019-11-06.
 *
 */
abstract class AMenu {
    fun cooking() {
        preparingIngredients()
        dealWith()
        cook()
    }

    /**
     * 准备食材
     */
    protected abstract fun preparingIngredients()

    /**
     * 处理
     */
    protected abstract fun dealWith()

    /**
     * 处理
     */
    protected abstract fun cook()

}