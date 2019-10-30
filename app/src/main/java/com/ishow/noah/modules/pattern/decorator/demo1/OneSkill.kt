package com.ishow.noah.modules.pattern.decorator.demo1

import android.util.Log

/**
 * Created by yuhaiyang on 2019-10-30.
 *
 */
class OneSkill( hero: IHero) : HelloSkill(hero) {

    override fun learn() {
        super.learn()
        Log.i("yhy", "learn: 学习一技能")
    }
}