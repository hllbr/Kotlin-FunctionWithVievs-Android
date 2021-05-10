package com.hllbr.functionwithvievs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { println("Hello World") }//görünümlerle çalışmanın farklı bir yöntemi ...
        //Fonksioynları Görünümlerle birlikte kullanımları =

    }
    fun helloKotlin(view : View){
        //view : View bu fonksiyon bir görünüm tarafından kullanılacak anlamına geliyor.
        println("Hello Kotlin")
        textView.text = "Hello Kotlin"
    }
}