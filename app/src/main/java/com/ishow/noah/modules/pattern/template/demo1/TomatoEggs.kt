package com.ishow.noah.modules.pattern.template.demo1

import com.ishow.noah.widget.LogView

/**
 * Created by yuhaiyang on 2019-11-06.
 * 番茄炒蛋
 */
class TomatoEggs : AMenu() {

    override fun preparingIngredients() {
        LogView.log("准备1个番茄2个蛋")
    }

    override fun dealWith() {
        LogView.log("1. 把蛋打碎 2. 番茄去皮，并切小块 ")
    }

    override fun cook() {
        LogView.log("现炒蛋，再炒番茄 2分钟出锅就好")
    }

}