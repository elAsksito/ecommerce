package com.ask.ecommerce

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ask.ecommerce.utils.activity.LoadingScreen

class MainActivity : AppCompatActivity() {

    private lateinit var loadingScreen: LoadingScreen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        loadingScreen = LoadingScreen()
        showLoading()
    }

    private fun showLoading() {
        loadingScreen.showLoadingScreen(this)
    }
}