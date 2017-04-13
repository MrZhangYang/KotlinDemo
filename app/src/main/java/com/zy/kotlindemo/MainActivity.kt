package com.zy.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "hello world!" + add(1, 3)
    }

    fun add(x: Int, y: Int): Int = x + y

//    fun add(x: Int, y: Int): Int {
//        return x + y
//    }
}
