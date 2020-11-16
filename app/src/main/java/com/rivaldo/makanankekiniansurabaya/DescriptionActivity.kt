package com.rivaldo.makanankekiniansurabaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.item_list.*

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val getbundle = intent.getBundleExtra("selecteddata")
        val image = getbundle?.getInt("image")
        image?.let { image_decs.setImageResource(it) }
        if (getbundle != null) {
            txt_judul.text = getbundle.getString("nama")
        }
        if (getbundle != null) {
            desc.text = getbundle.getString("desc")
        }
    }
}