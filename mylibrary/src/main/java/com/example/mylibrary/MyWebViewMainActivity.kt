package com.example.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MyWebViewMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val redirectUrl: String = intent.getStringExtra("redirectUrl").toString()
        val mywebview: WebView = findViewById(R.id.webView)

        mywebview.loadUrl(redirectUrl)
    }
}