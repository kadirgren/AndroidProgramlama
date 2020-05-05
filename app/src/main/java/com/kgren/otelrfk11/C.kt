package com.kgren.otelrfk11

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.c.*

var selectedGlobalBitmap : Bitmap? = null

class C : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c)

        //Veri

        var otelKısımlar = ArrayList<String>()
        otelKısımlar.add("Yatak Odası")
        otelKısımlar.add("Banyo")
        otelKısımlar.add("Kafeterya")
        otelKısımlar.add("Havuz")
        otelKısımlar.add("Bar")
        otelKısımlar.add("Hamam")
        otelKısımlar.add("Sauna")
        otelKısımlar.add("Spor Salonu")

        //Image
        val yatak = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.yatak)
        val banyo = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.banyo)
        val kafeterya = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kafeterya)
        val havuz = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.havuz)
        val bar = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bar)
        val hamam = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.hamam)
        val sauna = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.sauna)
        val spor = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spor)

        var yerImages = ArrayList<Bitmap>()
        yerImages.add(yatak)
        yerImages.add(banyo)
        yerImages.add(kafeterya)
        yerImages.add(havuz)
        yerImages.add(bar)
        yerImages.add(hamam)
        yerImages.add(sauna)
        yerImages.add(spor)


        //Adapter : Layout & Data

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,otelKısımlar)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val intent4 = Intent(applicationContext,D::class.java)


            intent4.putExtra("name",otelKısımlar[position])

            selectedGlobalBitmap = yerImages[position]
            startActivity(intent4)

        }
    }
}
