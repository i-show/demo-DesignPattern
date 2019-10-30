package com.ishow.noah.manager

import com.ishow.noah.enties.Sample
import com.ishow.noah.modules.pattern.decorator.DecoratorPatternActivity

/**
 * Created by yuhaiyang on 2017/10/12.
 * 管理器
 */

object SampleManager {


    val samples: MutableList<Sample>
        get() {
            val list = ArrayList<Sample>()
            list.add(Sample.instance("装饰模式", DecoratorPatternActivity::class.java))
            return list
        }
}
