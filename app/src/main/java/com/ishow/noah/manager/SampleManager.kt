package com.ishow.noah.manager

import com.ishow.noah.enties.Sample
import com.ishow.noah.modules.pattern.decorator.DecoratorPatternFragment
import com.ishow.noah.modules.pattern.prototype.PrototypeFragment
import com.ishow.noah.modules.pattern.proxy.ProxyPatternFragment
import com.ishow.noah.modules.pattern.template.TemplatePatternFragment

/**
 * Created by yuhaiyang on 2017/10/12.
 * 管理器
 */

object SampleManager {


    val samples: MutableList<Sample>
        get() {
            val list = ArrayList<Sample>()
            list.add(Sample.instance("装饰模式", DecoratorPatternFragment::class.java))
            list.add(Sample.instance("代理模式", ProxyPatternFragment::class.java))
            list.add(Sample.instance("原型模式", PrototypeFragment::class.java))
            list.add(Sample.instance("模板模式", TemplatePatternFragment::class.java))
            return list
        }
}
