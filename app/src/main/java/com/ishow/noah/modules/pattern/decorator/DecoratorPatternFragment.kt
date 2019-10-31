package com.ishow.noah.modules.pattern.decorator

import android.os.Bundle
import android.view.View
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
        test.setOnClickListener {
            val hero = YaSe()
            val skill1 = OneSkill(hero)
            val skill2 = TwoSkill(skill1)
            skill2.learn()
        }
    }
}