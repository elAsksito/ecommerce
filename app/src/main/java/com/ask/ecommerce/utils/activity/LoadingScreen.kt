package com.ask.ecommerce.utils.activity

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.view.WindowManager
import com.ask.ecommerce.R

class LoadingScreen {

    private var loadingDialog: Dialog? = null;

    fun showLoadingScreen(context: Context){
        loadingDialog = Dialog(context).apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setContentView(R.layout.activity_loading_screen)
            setCancelable(false)

            window?.setLayout(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT
            )
            window?.setBackgroundDrawableResource(android.R.color.transparent)
        }
        loadingDialog?.show()
    }

    fun hideLoading() {
        loadingDialog?.dismiss()
    }
}