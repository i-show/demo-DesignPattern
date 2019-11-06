package com.ishow.noah.modules.pattern.template

import android.os.Bundle
import android.view.View
import com.ishow.noah.R
import com.ishow.noah.databinding.FTemplatePatternBinding
import com.ishow.noah.modules.base.mvvm.view.AppBindFragment
import com.ishow.noah.modules.pattern.template.demo1.AMenu
import com.ishow.noah.modules.pattern.template.demo1.PotatoFloss
import com.ishow.noah.modules.pattern.template.demo1.TomatoEggs
import com.ishow.noah.widget.LogView
import kotlinx.android.synthetic.main.f_template_pattern.*

/**
 * Created by yuhaiyang on 2019-11-06.
 * 模板方法模式
 * 通常使用情况：
 * 1. 封装基础类
 * 2. 通常说的 把方法抽一下 都是模板方法
 */
class TemplatePatternFragment : AppBindFragment<FTemplatePatternBinding, TemplatePatternViewModel>() {

    override fun getLayout(): Int = R.layout.f_template_pattern

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test.setOnClickListener {
            LogView.log("准备做土豆丝", true)
            val potato: AMenu = PotatoFloss()
            potato.cooking()
            LogView.log("准备做番茄炒蛋")
            val tomatoEggs = TomatoEggs()
            tomatoEggs.cooking()

            logView.show()
        }
    }
}