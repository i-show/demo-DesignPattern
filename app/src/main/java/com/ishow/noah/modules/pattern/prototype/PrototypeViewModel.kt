package com.ishow.noah.modules.pattern.prototype

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ishow.noah.modules.base.mvvm.viewmodel.AppBaseViewModel

/**
 * Created by yuhaiyang on 2019-11-05.
 */
class PrototypeViewModel (app: Application) : AppBaseViewModel(app) {

    private val _test = MutableLiveData<String>()
    val test: LiveData<String>
        get() = _test

}