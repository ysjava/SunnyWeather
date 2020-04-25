package com.demo.sunnyweather.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.demo.sunnyweather.R
import com.demo.sunnyweather.logic.model.Place

/**
 * Created by White paper on 2020/4/25
 * Describe :
 */
class PlaceAdapter(
    private val fragment: Fragment,
    private val placeList: List<Place>
) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.tv_place_name)
        val address: TextView = view.findViewById(R.id.tv_place_address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_place, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = placeList[position].name
        holder.address.text = placeList[position].address
    }
}