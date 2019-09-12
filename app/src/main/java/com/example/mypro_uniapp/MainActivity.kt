package com.example.mypro_uniapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //PandoraEntry
//        Intent intent =  Intent();
//        startActivity(new Intent(MainActivity.this,PandoraEntry.class));
        findViewById<TextView>(R.id.testCLick).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
//                Toast.makeText(this@MainActivity, "you have clicked Button2", Toast.LENGTH_SHORT).show()
                gotoUni_app()
            }
        })
        findViewById<TextView>(R.id.webview).setOnClickListener(object :View.OnClickListener {
            override fun onClick(p0: View?) {
                gotoUni_app_webview()
            }
        })

    }
    fun gotoUni_app(){
        val intent = Intent()
        intent.setClass(this,SDK_WebApp().javaClass)
        startActivity(intent)
    }
    fun gotoUni_app_webview(){
        val intent = Intent()
        intent.setClass(this,SDK_WebView().javaClass)
        startActivity(intent)
    }
}
