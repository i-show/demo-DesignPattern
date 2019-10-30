package com.ishow.noah.modules.pattern.decorator

import android.os.Bundle
import android.util.Log
import android.view.View
import com.ishow.noah.R
import com.ishow.noah.databinding.ADecoratorPatternBinding
import com.ishow.noah.modules.base.mvvm.view.AppBindActivity
import com.ishow.noah.modules.pattern.decorator.demo1.HelloSkill
import com.ishow.noah.modules.pattern.decorator.demo1.OneSkill
import com.ishow.noah.modules.pattern.decorator.demo1.TwoSkill
import com.ishow.noah.modules.pattern.decorator.demo1.YaSe
import kotlinx.android.synthetic.main.a_decorator_pattern.*

/**
 * Created by yuhaiyang on 2019-10-30.
 * 装饰模式
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 优点：
 * 1. 可以简化原有的类信息
 * 2. 区分了核心功能和装饰功能
 * 缺点：
 *  多层装饰比较复杂
 * 典型应用场景：
 *  1. InputStream 应用场景
 *  2. 照片处理可以思考使用装饰模式
 *
 * 思考：
 *  装饰模式是否存在可逆性
 */
class DecoratorPatternActivity : AppBindActivity<ADecoratorPatternBinding, DecoratorPatternViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindContentView(R.layout.a_decorator_pattern)
        test.setOnClickListener {
            val hero = YaSe()
            val skill1 = OneSkill(hero)
            val skill2 = TwoSkill(skill1)
            skill2.learn()
        }
    }


}