package com.kgren.otelrfk11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.b.*

class B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.b)

        val intent = intent
        val name = intent.getStringExtra("a1")
        val username = intent.getStringExtra("b1")

        a1Text.text = "İsminiz : "+name
        b1Text.text = "Kullanıcı Adınız : "+username
    }

    fun geri(view: View){

        val intent2 = Intent(applicationContext, A::class.java)
        startActivity(intent2)
    }

    fun ileri(view: View){

        val intent3 = Intent(applicationContext, C::class.java)
        startActivity(intent3)
    }

}
