package com.ishow.noah.modules.pattern.decorator

import android.os.Bundle
import android.view.View
import com.ishow.common.widget.PrintView
import com.ishow.noah.R
import com.ishow.noah.databinding.FDecoratorPatternBinding
import com.ishow.noah.modules.base.mvvm.view.AppBindFragment
import com.ishow.noah.modules.pattern.decorator.demo1.OneSkill
import com.ishow.noah.modules.pattern.decorator.demo1.TwoSkill
import com.ishow.noah.modules.pattern.decorator.demo1.YaSe
import kotlinx.android.synthetic.main.f_decorator_pattern.*

/**
 * Created by yuhaiyang on 2019-10-31.
 */
class DecoratorPatternFragment : AppBindFragment<FDecoratorPatternBinding, DecoratorPatternViewModel>() {

    override fun getLayout(): Int = R.layout.f_decorator_pattern

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        PrintView.init( printView)

        test.setOnClickListener {
            PrintView.reset()
            val hero = YaSe()
            val skill1 = OneSkill(hero)
            val skill2 = TwoSkill(skill1)
            skill2.learn()
        }
    }

    override fun getDescription(): String? {
        return "### 装饰模式 \n" +
                "装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。\n" +
                "#### 优点 \n" +
                "装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。\n" +
                "#### 缺点 \n" +
                "多层装饰比较复杂\n" +
                "#### 使用场景 \n" +
                "1. 游戏中英雄的技能\n" +
                "2. 炒菜中添加菜品的顺序 \n" +
                "#### 实现方式 \n" +
                "1. 定义接口 \n" +
                "2. 业务主体实现接口 \n" +
                "3. 装饰功能实现接口并传入业务主体实现类"


    }
}