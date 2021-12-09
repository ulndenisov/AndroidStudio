package com.example.diplomnaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val KEY_STR="Передача" // создаем переменную , которую передадим во второй экран активити для вывода ее сверху экрана
class Next1 : AppCompatActivity() {
lateinit var List_Processors:RecyclerView  // создаем объект список
   lateinit var TextView1:TextView   // создаем объект как текстовое поле и сюда передадим надпись с 1 активити
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next1)

      val list_proc: List<Processors> = listOf (
        Processors("Байкал - М","Процессор АРМ архитектуры для рабочих станций. Содержит 4 ядра  с созданием 8 потоков. Так же в микропроцессор встроено графическое ядро Mali с 8 ядрами."),
        Processors("Байкал - С","Процессор с 48 ядрами. Предназначен для серверных систем. Это самый совершенный отечественный процессор на сегодняшний день."),
        Processors("Байкал - М","Процессор АРМ архитектуры для рабочих станций. Содержит 4 ядра  с созданием 8 потоков. Так же в микропроцессор встроено графическое ядро Mali с 8 ядрами."),
        Processors("Байкал - С","Процессор с 48 ядрами. Предназначен для серверных систем. Это самый совершенный отечественный процессор на сегодняшний день."),
        Processors("Байкал - М","Процессор АРМ архитектуры для рабочих станций. Содержит 4 ядра  с созданием 8 потоков. Так же в микропроцессор встроено графическое ядро Mali с 8 ядрами."),
        Processors("Байкал - С","Процессор с 48 ядрами. Предназначен для серверных систем. Это самый совершенный отечественный процессор на сегодняшний день."),
        Processors("Байкал - М","Процессор АРМ архитектуры для рабочих станций. Содержит 4 ядра  с созданием 8 потоков. Так же в микропроцессор встроено графическое ядро Mali с 8 ядрами.")



      )


        TextView1=findViewById(R.id.textView_next1)               // связываем объект с текстовым полем
        val str_temp: String? = intent.extras?.getString(KEY_STR)  // извлекаем в переменную переданной из 1 активити сообщение
        TextView1.text=str_temp                                    // передаем в текстовое поле переменную для отображения на экране

        List_Processors=findViewById(R.id.list_processors)              //  связываем объект список со список на экране
List_Processors.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false) //для вывода вертикально в один столбец списка задаем менеджер с линейной вертикальной верстклой
          List_Processors.adapter=ListAdapter(list_proc)

    }


}