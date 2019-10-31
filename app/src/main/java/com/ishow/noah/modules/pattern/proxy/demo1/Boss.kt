package com.ishow.noah.modules.pattern.proxy.demo1

import android.util.Log

/**
 * Created by yuhaiyang on 2019-10-31.
 * 老板
 * 描述： 老板需要买飞机票才能做飞机
 */
class Boss : IFly {
    override fun buyTickets() {
        Log.i("yhy", "老板买票了")
    }

}
