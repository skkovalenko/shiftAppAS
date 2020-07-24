package com.example.shiftappas.holder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shiftappas.model.City
import com.example.shiftappas.R
import com.example.shiftappas.listener.CityListener

class CityListViewHolder(itemView: View, private val cityListener: CityListener?): RecyclerView.ViewHolder(itemView) {

    private val title: TextView = itemView.findViewById(R.id.cityTitle)

    fun bind(city: City){
        title.text = city.name
        itemView.setOnClickListener {
            cityListener?.onCityClick(city)
        }
    }
}