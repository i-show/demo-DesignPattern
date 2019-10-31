package com.ishow.noah.modules.pattern.proxy

import android.os.Bundle
import android.view.View
import com.ishow.noah.R
import com.ishow.noah.databinding.FProxyPatternBinding
import com.ishow.noah.modules.base.mvvm.view.AppBindFragment
import com.ishow.noah.modules.pattern.proxy.demo1.AssistantProxy
import com.ishow.noah.modules.pattern.proxy.demo1.Boss
import kotlinx.android.synthetic.main.f_proxy_pattern.*

/**
 * Created by yuhaiyang on 2019-10-31.
 * 1. 静态代理
 *
 * 2. 动态JDK代理
 *
 * 3. Cglib 代理
 *
 * 例子：老总每天都有很多事情需要处理，根本没有时间来买飞机票，这个时候就需要助理来帮助去买飞机票
 *
 * 个人见解：
 * 代理模式主要用于，核心类处理核心内容不需要处理一些非核心内容（例如检测是否准确），保持核心类的干净
 * 一些检测的逻辑交给代理类来处理
 *
 * 可以使用的场景：
 * 例如：我系统的核心功能是播放电影， X、Y、Z站要用我的系统，并且都进行了个性化设置。 那么我自己的核心内容不能去判断X，Y，Z是否是合理的
 * 所以这个时候使用代理类 去进行操作一番 再进入我们的核心逻辑
 */
class ProxyPatternFragment : AppBindFragment<FProxyPatternBinding, ProxyPatternViewModel>() {

    override fun getLayout(): Int = R.layout.f_proxy_pattern

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test.setOnClickListener {
            val boss = Boss()
            val assistant = AssistantProxy(boss)
            assistant.buyTickets()
        }
    }
}