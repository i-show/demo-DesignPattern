package com.ishow.noah.modules.pattern.proxy.demo1

import android.util.Log

/**
 * Created by yuhaiyang on 2019-10-31.
 * 老板的助手
 *
 * 老板没有时间去买票，助手代理老板去买票
 */
class AssistantProxy(private val fly: IFly) : IFly {

    override fun buyTickets() {
        Log.i("yhy", "确认飞机的时间点是否OK")
        Log.i("yhy", "确认飞机上有没有餐食")
        fly.buyTickets()
        Log.i("yhy", "买票成功")
    }

}