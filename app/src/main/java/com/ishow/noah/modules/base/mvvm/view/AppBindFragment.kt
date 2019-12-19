package com.ishow.noah.modules.base.mvvm.view

import androidx.databinding.ViewDataBinding
import com.ishow.common.app.mvvm.view.BindFragment
import com.ishow.noah.modules.base.mvvm.viewmodel.AppBaseViewModel


abstract class AppBindFragment<T : ViewDataBinding, VM : AppBaseViewModel> : BindFragment<T, VM>() {
    override fun canBindViewModel(): Boolean {
        return viewModelClass != AppBaseViewModel::class.java
    }


    /**
     * 获取说明
     */
    open fun getDescription(): String? {
        return "### 模式 \n" +
                "。\n" +
                "#### 优点 \n" +
                " \n" +
                "#### 缺点 \n" +
                " \n" +
                "#### 使用场景 \n" +
                "1. \n" +
                "2. "
    }
}

