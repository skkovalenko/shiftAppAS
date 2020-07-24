package com.example.shiftappas.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shiftappas.R
import kotlinx.android.synthetic.main.activity_detail_city.*

class DetailCityActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_city)

        val parameters = intent.getStringArrayListExtra("City")
        cityName.text = parameters?.get(0)
        temperature.text = parameters?.get(1)
        description.text = parameters?.get(2)

    }
}