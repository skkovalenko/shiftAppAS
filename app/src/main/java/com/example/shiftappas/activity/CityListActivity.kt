package com.example.shiftappas.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shiftappas.*
import com.example.shiftappas.adapter.CityListAdapter
import com.example.shiftappas.listener.CityListener
import com.example.shiftappas.model.City
import kotlinx.android.synthetic.main.activity_city_list.*

class CityListActivity: AppCompatActivity() {

    private val сityList = listOf(
        City(
            "Москва",
            (Math.random() * 150 - 75).toInt()
        ),
        City(
            "CПб",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Екат",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Омск",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Томск",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Челяба",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Владик",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Торжок",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Самара",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Казань",
            (Math.random() * 100 - 50).toInt()
        ),
        City(
            "Город N",
            (Math.random() * 100 - 50).toInt()
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_list)

        val adapter = CityListAdapter()
        recyclerViewListCity.adapter = adapter
        recyclerViewListCity.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        adapter.setCityList(сityList)

        adapter.setCityListener(object :
            CityListener {
            override fun onCityClick(city: City) {
                val intent = Intent(this@CityListActivity, DetailCityActivity::class.java)
                var cityTemperature = if(city.temperature >= 0){
                    "+" + city.temperature.toString()
                }else city.temperature.toString()
                intent.putStringArrayListExtra("City", arrayListOf(city.name, cityTemperature, city.getDescription()))
                startActivity(intent)
            }
        })
    }
}