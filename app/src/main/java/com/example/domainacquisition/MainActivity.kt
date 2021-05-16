package com.example.domainacquisition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "https://twitter.com/home"

        //中に入ったURL（String）をドメインのみの文字型に変更する。
        val domein = UrlDomein().hen(text)
        //出力「twitter.com」

        Log.d("debag",domein)

        //中に入ったURL（String）がURLかどうか判断をする。
        val check = UrlDomein().check(text)
        //出力「true」

        Log.d("debag",check.toString())
    }
}