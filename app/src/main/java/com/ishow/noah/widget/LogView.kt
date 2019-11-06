package com.ishow.noah.widget

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.*

/**
 * Created by yuhaiyang on 2019-11-05.
 * 输出log的View
 */
class LogView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    TextView(context, attrs, defStyleAttr) {

    private var showJob: Job? = null

    fun show() {
        val isActive = showJob?.isActive ?: false
        if (isActive) {
            showJob?.cancel()
        }
        if (currentLog.isNullOrEmpty()) {
            return
        }
        val log = currentLog!!
        show(log.toCharArray(), 1, log.length)
    }

    private fun show(text: CharArray, len: Int, size: Int) {
        if (len - 1 >= size) return
        setText(text, 0, len)
        showJob = GlobalScope.launch(Dispatchers.Main) {
            delay(50)
            show(text, len + 1, size)
        }
    }


    companion object {
        private const val TAG = "LogView"

        private var currentLog: String? = null

        fun reset() {
            currentLog = null
        }

        fun log(log: String, reset: Boolean = false) {
            currentLog = if (reset || currentLog == null) {
                log
            } else {
                "$currentLog \n$log"
            }
            Log.i(TAG, log)
        }
    }
}