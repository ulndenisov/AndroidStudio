package com.example.diplomnaya

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class CompViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    private val compImage:ImageView=itemView.findViewById(R.id.comp_img)
    private val compText:TextView=itemView.findViewById(R.id.comp_text)
fun bind(comp:Data_comp)
{
    compText.text=comp.name
    compImage.setImageResource(comp.img)


}


}