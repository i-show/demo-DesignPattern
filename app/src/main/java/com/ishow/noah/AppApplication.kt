package com.ishow.noah

import android.app.Application
import com.ishow.noah.manager.PushManager

/**
 * Application
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PushManager.getInstance().init(this)
    }
}
