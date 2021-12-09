package com.example.diplomnaya

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CompAdapter(private val  compList:List<Data_comp>):RecyclerView.Adapter<CompViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompViewHolder {

        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.card_compute_baikal,parent,false)
        return CompViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CompViewHolder, position: Int) {

        val comp1=compList[position]
        holder.bind(comp1)
    }

    override fun getItemCount(): Int {

        return compList.size
    }
}