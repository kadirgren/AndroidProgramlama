package com.kgren.otelrfk11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.a.*

class A : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a)
    }

    fun gonder(view: View){

        val intent = Intent(applicationContext, B::class.java)

        intent.putExtra("a1",aText.text.toString())
        intent.putExtra("b1",bText.text.toString())

        startActivity(intent)
    }

}
