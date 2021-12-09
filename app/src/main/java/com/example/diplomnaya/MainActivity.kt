package com.example.diplomnaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
private const val KEY_STR="Передача" // создаем переменную ключ по которой будет извлекаться передаваемое сообщение
class MainActivity : AppCompatActivity() {

   lateinit var NextButtonActiviti: Button // создаем объект кнопку для перехода на окно с RecyleView

    lateinit var NextButtonActivitiFragment: Button // создаем объект кнопку для перехода на окно с Fragments

    lateinit var NextButtonActivitiMaterial: Button // создаем объект кнопку для перехода на окно с Fragments

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   NextButtonActiviti=findViewById(R.id.button_next) // связываеми объект с кнопкой на форме для перехода на окно с RecyleView
        NextButtonActivitiFragment=findViewById(R.id.button_fragments) // связываеми объект с кнопкой на форме для перехода на новое окно с Fragments
        NextButtonActivitiMaterial=findViewById(R.id.button_material) // связываеми объект с кнопкой на форме для перехода на новое окно с Fragments
        NextButtonActiviti.setOnClickListener()
        {
            val NextActivitiIntent1:Intent=Intent(this,Next1::class.java) //создаем интент
            NextActivitiIntent1.putExtra(KEY_STR,"Отечественные микропроцессоры")            // передаем строку в новую активити
            startActivity(NextActivitiIntent1)                                         // запускаем новую активити экран

        }

        NextButtonActivitiFragment.setOnClickListener()
        {
            val NextActivitiIntent1:Intent=Intent(this,ActivityWithFragment::class.java) //создаем интент
            NextActivitiIntent1.putExtra(KEY_STR,"Отечественные микропроцессоры")            // передаем строку в новую активити
            startActivity(NextActivitiIntent1)                                         // запускаем новую активити экран

        }

        NextButtonActivitiMaterial.setOnClickListener()
        {
            val NextActivitiIntent1:Intent=Intent(this,MaterialActivity::class.java) //создаем интент
            //NextActivitiIntent1.putExtra(KEY_STR,"Отечественные микропроцессоры")            // передаем строку в новую активити
            startActivity(NextActivitiIntent1)                                         // запускаем новую активити экран

        }

    }


}