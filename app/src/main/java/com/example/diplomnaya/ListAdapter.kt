package com.example.diplomnaya

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list_proc:List<Processors>): RecyclerView.Adapter<ProcessorsHolder>() { // создаем адаптьер и помещаем в него список процессоров
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProcessorsHolder {
     val itemView=LayoutInflater.from(parent.context).inflate(R.layout.itel_list_processors,parent,false)
        return ProcessorsHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProcessorsHolder, position: Int) {
        val proc=list_proc[position]
        holder.bind(proc)
    }

    override fun getItemCount(): Int {  // запрос на получение количества элементов в списке процессоров
        return list_proc.size

    }  //создаем адаптер чтобы данные передать от холдера в список
}