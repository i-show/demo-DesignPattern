package com.ishow.noah.modules.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ishow.noah.R
import com.ishow.noah.modules.base.mvvm.viewmodel.AppBaseViewModel

/**
 * Created by yuhaiyang on 2019-10-25.
 */
class MainViewModel (app: Application) : AppBaseViewModel(app) {

    private val _title = MutableLiveData<String>()
    val title: LiveData<String>
        get() = _title

    override fun init() {
        super.init()
        _title.value = context.getString(R.string.app_name)
    }

    fun updateTitle(title: String) {
        _title.value = title
    }
}