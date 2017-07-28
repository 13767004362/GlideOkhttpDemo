package com.xingen.glideokhttp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      GlideApp.with(this).load("https://github.com/bumptech/glide/raw/master/static/glide_logo.png").into(main_iv)
    }
}
