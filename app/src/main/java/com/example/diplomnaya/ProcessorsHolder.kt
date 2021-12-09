package com.example.diplomnaya

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ProcessorsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { // создаем обертку для элемента списка процессоров

    val name_proc:TextView=itemView.findViewById(R.id.type_processors_text)  // создаем переменные и связываем их с элементами списка
    val opis_proc:TextView=itemView.findViewById(R.id.opisanie_processors_text)
    fun bind(processors:Processors)   // создаем функцию для приема данных с класа данных
    {
        name_proc.text="Название процессора - ${processors.Name_processors}"            // записываем в элементы списка данные из класса данных
        opis_proc.text="Описание процессора - ${processors.opisanie}"
        //img_proc.drawable=${processors.img_processors}

    }
}