package com.ishow.noah.modules.base.mvvm.view

import androidx.databinding.ViewDataBinding
import com.ishow.noah.modules.base.mvvm.viewmodel.AppBaseViewModel
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.InputStream

/**
 * Created by yuhaiyang on 2019-12-26.
 *
 */
abstract class AppPatternFragment<T : ViewDataBinding, VM : AppBaseViewModel> : AppBindFragment<T, VM>() {

    private val defaultDescription = "### 设计模式  \n" +
            "暂时没有提示信息哦"

    /**
     * 获取说明
     */
    fun getDescription(): String? {
        val assets = context?.assets ?: return null
        var inputStream: InputStream? = null
        return try {
            inputStream = assets.open("pattern/description/${getDescriptionName()}")
            inputStream.bufferedReader().use(BufferedReader::readText)
        } catch (e: FileNotFoundException) {
            defaultDescription
        } finally {
            inputStream?.close()
        }
    }

    abstract fun getDescriptionName(): String


}