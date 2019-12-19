package com.ishow.noah.widget

import android.content.Context
import android.os.Bundle
import com.ishow.common.widget.dialog.BaseDialog
import com.ishow.noah.R
import io.noties.markwon.Markwon
import kotlinx.android.synthetic.main.dialog_description.*

/**
 * Created by yuhaiyang on 2019-12-19.
 *
 */
class DescriptionDialog(context: Context) : BaseDialog(context) {

    private val markdown = Markwon.create(context)
    private var content: String? = null

    init {
        markdown.plugins
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_description)
        setWidthProportion(0.9F)
        exit.setOnClickListener { dismiss() }
        showContent()
    }

    fun setText(content: String?) {
        this.content = content
        showContent()
    }


    private fun showContent() {
        if (content.isNullOrEmpty()) {
            return
        }
        val detail = content!!
        text?.let {
            markdown.setMarkdown(it, detail)
        }
    }
}