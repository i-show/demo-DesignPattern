package com.ishow.noah.modules.pattern.prototype

import android.os.Bundle
import android.view.View
import com.ishow.noah.R
import com.ishow.noah.databinding.FPrototypeBinding
import com.ishow.noah.modules.base.mvvm.view.AppBindFragment
import com.ishow.noah.modules.pattern.prototype.demo1.ShapeCache
import com.ishow.noah.widget.LogView
import kotlinx.android.synthetic.main.f_prototype.*

/**
 * Created by yuhaiyang on 2019-11-05.
 * 原型模式
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 优点： 1、性能提高。 2、逃避构造函数的约束。
 * 缺点：1. Java 存在深拷贝和浅拷贝的问题 2. 需要实现Cloneable接口
 *
 * 使用场景：
 * 1. 资源优化
 * 2. 对象初始化需要消耗很大资源
 */
class PrototypeFragment : AppBindFragment<FPrototypeBinding, PrototypeViewModel>() {

    override fun getLayout(): Int = R.layout.f_prototype

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test.setOnClickListener {
            LogView.reset()

            val cache = ShapeCache()
            cache.cache()

            val shape = cache.getShape(1)
            shape?.draw()

            val rect = cache.getShape(2)
            rect?.draw()

            logView.show()
        }
    }
}