package com.kgren.otelrfk11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.d.*

class D : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d)

        val intent4 = intent

        val yerName = intent4.getStringExtra("name")

        textView.text = yerName

        imageView.setImageBitmap(selectedGlobalBitmap)
    }
}
