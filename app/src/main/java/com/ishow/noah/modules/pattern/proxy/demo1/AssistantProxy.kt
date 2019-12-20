package com.ishow.noah.modules.pattern.proxy.demo1

import com.ishow.common.widget.PrintView

/**
 * Created by yuhaiyang on 2019-10-31.
 * 老板的助手
 *
 * 老板没有时间去买票，助手代理老板去买票
 */
class AssistantProxy(private val fly: IFly) : IFly {

    override fun buyTickets() {
        PrintView.print("小秘书，确认老板时间")
        PrintView.print("小秘书，确认飞机起飞时间")
        PrintView.print("小秘书，确认飞机上是否有餐食")
        PrintView.print("小秘书，预定接机车辆")
        PrintView.print("小秘书，预定酒店")
        fly.buyTickets()
        PrintView.print("---购票流程结束---")
    }

}