package com.example.shiftappas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shiftappas.model.City
import com.example.shiftappas.holder.CityListViewHolder
import com.example.shiftappas.listener.CityListener
import com.example.shiftappas.R

class CityListAdapter: RecyclerView.Adapter<CityListViewHolder>() {

    private val cityList: MutableList<City> = mutableListOf()
    private var cityListener: CityListener? = null

    fun setCityList(cityList: List<City>){
        this.cityList.clear()
        this.cityList.addAll(cityList)

        notifyDataSetChanged()
    }

    fun setCityListener(cityListener: CityListener){
       this.cityListener =  cityListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return CityListViewHolder(
            view,
            cityListener
        )
    }

    override fun getItemCount(): Int {
        return cityList.count()
    }

    override fun onBindViewHolder(holder: CityListViewHolder, position: Int) {
        holder.bind(cityList[position])

    }
}