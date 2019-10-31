package com.ishow.noah.modules.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ishow.common.extensions.open
import com.ishow.common.extensions.showFragment
import com.ishow.noah.R
import com.ishow.noah.databinding.AMainBinding
import com.ishow.noah.enties.Sample
import com.ishow.noah.modules.base.mvvm.view.AppBindActivity

/**
 * Created by yuhaiyang on 2019-10-25.
 */
class MainActivity : AppBindActivity<AMainBinding, MainViewModel>() {

    private val listFragment = ListFragment.newInstance()
    private var lastFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindContentView(R.layout.a_main)

        val fragmentManager = supportFragmentManager
        fragmentManager.addOnBackStackChangedListener {
            if (fragmentManager.backStackEntryCount == 0) {
                dataBinding.vm?.updateTitle(getString(R.string.app_name))
            }
        }
    }

    override fun initViewModel(vm: MainViewModel) {
        super.initViewModel(vm)
        showFragment(listFragment)
    }

    fun showDetail(sample: Sample) {
        val fragment = sample.action.newInstance() as? Fragment ?: return

        dataBinding.vm?.updateTitle(sample.name)
        lastFragment = fragment
        showFragment(fragment, listFragment)
    }
}