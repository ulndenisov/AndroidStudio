package com.example.diplomnaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val KEY_STR="Передача" // создаем переменную , которую передадим во второй экран активити для вывода ее сверху экрана
class MaterialActivity : AppCompatActivity() {

    lateinit var compRecycleView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)

        compRecycleView=findViewById(R.id.comp_recycle_view)

        val compList:List<Data_comp>  = listOf(

            Data_comp("Большой квадратный корпус", R.drawable.comp1),
            Data_comp("Моноблок", R.drawable.comp2),
            Data_comp("Мини блок", R.drawable.comp3),
            Data_comp("Отладочная плата+", R.drawable.comp4)


        )

        compRecycleView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        compRecycleView.adapter=CompAdapter(compList)
    }
}