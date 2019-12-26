package com.ishow.noah.modules.base.mvvm.view

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.databinding.ViewDataBinding
import com.ishow.common.app.mvvm.view.BindFragment
import com.ishow.common.modules.image.show.PreviewImageDialog
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

        val struct: ImageView? = view.findViewById(R.id.struct)
        struct?.setOnClickListener {
            val dialog = PreviewImageDialog<Drawable>()
            dialog.setData(struct.drawable)
            dialog.show(supportFragmentManager)
        }
    }


}

