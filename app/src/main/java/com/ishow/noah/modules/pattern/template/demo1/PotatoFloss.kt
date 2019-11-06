package com.ishow.noah.modules.pattern.template.demo1

import com.ishow.noah.widget.LogView

/**
 * Created by yuhaiyang on 2019-11-06.
 * 炒土豆丝
 */

class PotatoFloss : AMenu() {
    override fun preparingIngredients() {
        LogView.log("准备 土豆1个，香葱2根，辣椒1棵")
    }

    override fun dealWith() {
        LogView.log("1. 先把土豆切丝")
        LogView.log("2. 香葱切碎")
        LogView.log("3. 辣椒小段")
    }

    override fun cook() {
        LogView.log("热油下锅，翻炒2分钟 加入香葱和辣椒， 再炒2分钟 加入少量水 出锅")
    }

}