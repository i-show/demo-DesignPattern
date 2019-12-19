package com.ishow.noah.modules.pattern.decorator.demo1

import com.ishow.common.widget.PrintView

/**
 * Created by yuhaiyang on 2019-10-30.
 *
 */
class TwoSkill(hero: IHero) : HelloSkill(hero) {

    override fun learn() {
        super.learn()
        PrintView.print("学习二技能")
    }
}