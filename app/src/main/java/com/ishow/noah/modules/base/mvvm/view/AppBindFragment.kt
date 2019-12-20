package com.ishow.noah.modules.base.mvvm.view

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.ishow.common.app.mvvm.view.BindFragment
import com.ishow.common.widget.PrintView
import com.ishow.noah.R
import com.ishow.noah.modules.base.mvvm.viewmodel.AppBaseViewModel


abstract class AppBindFragment<T : ViewDataBinding, VM : AppBaseViewModel> : BindFragment<T, VM>() {
    override fun canBindViewModel(): Boolean {
        return viewModelClass != AppBaseViewModel::class.java
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 初始化Printer
        val printer: View? = view.findViewById(R.id.printView)
        if (printer is PrintView) {
            PrintView.init(printer)
        }
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

