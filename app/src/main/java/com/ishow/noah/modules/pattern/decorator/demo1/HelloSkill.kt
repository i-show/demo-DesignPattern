package com.ishow.noah.modules.pattern.decorator.demo1

/**
 * Created by yuhaiyang on 2019-10-30.
 * 英雄技能
 */
open class HelloSkill(private val hero: IHero) : IHero {

    override fun learn() {
        hero.learn()
    }
}
