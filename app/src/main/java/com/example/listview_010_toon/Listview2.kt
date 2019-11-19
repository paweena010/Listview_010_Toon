package com.example.listview_010_toon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.listview_2.*

class Listview2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_2)

        val tile =intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val result = intent.extras?.getString(MainActivity().KEY_RESULT,"")

        tv_tile.setText(tile)
        tv_result.setText (result)
        btn_back.setOnClickListener {
            finish()


        }
    }
}