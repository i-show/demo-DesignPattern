package com.ishow.noah.modules.main

import android.os.Bundle
import android.view.View
import com.ishow.common.extensions.showFragment
import com.ishow.noah.R
import com.ishow.noah.databinding.AMainBinding
import com.ishow.noah.enties.Sample
import com.ishow.noah.modules.base.mvvm.view.AppBindActivity
import com.ishow.noah.modules.base.mvvm.view.AppBindFragment
import com.ishow.noah.widget.DescriptionDialog

/**
 * Created by yuhaiyang on 2019-10-25.
 */
class MainActivity : AppBindActivity<AMainBinding, MainViewModel>() {

    private val listFragment = ListFragment.newInstance()
    private var lastFragment: AppBindFragment<*, *>? = null
    private var descriptionDialog: DescriptionDialog? = null

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
        lastFragment = listFragment
    }

    fun showDetail(sample: Sample) {
        val fragment = sample.action.newInstance() as? AppBindFragment<*, *> ?: return

        dataBinding.vm?.updateTitle(sample.name)
        lastFragment = fragment
        showFragment(fragment, listFragment)
    }


    override fun onRightClick(v: View) {
        super.onRightClick(v)
        val dialog: DescriptionDialog = if (descriptionDialog == null) {
            DescriptionDialog(this)
        } else {
            descriptionDialog!!
        }
        descriptionDialog = dialog

        lastFragment?.let {
            dialog.setText(it.getDescription())
            dialog.show()
        }
    }
}