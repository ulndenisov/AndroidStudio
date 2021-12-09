package com.example.diplomnaya

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

import com.example.diplomnaya.databinding.ActivityWithFragmentBinding


private const val KEY_STR="Передача" // создаем переменную ключ по которой будет извлекаться передаваемое сообщение
class ActivityWithFragment : AppCompatActivity() {

   // lateinit var Button1: Button // создаем объект кнопку для перехода на окно с RecyleView
   // lateinit var Button2: Button // создаем объект кнопку для перехода на окно с RecyleView
   // lateinit var Button3: Button // создаем объект кнопку для перехода на окно с RecyleView

    lateinit var binding: ActivityWithFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWithFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button2.setOnClickListener { supportFragmentManager.beginTransaction().replace(R.id.container_fragments,BlankFragment2.newInstance()).commit() }
        binding.button1.setOnClickListener { supportFragmentManager.beginTransaction().replace(R.id.container_fragments,BlankFragment1.newInstance()).commit() }
        binding.button3.setOnClickListener { supportFragmentManager.beginTransaction().replace(R.id.container_fragments,BlankFragment3.newInstance()).commit() }
        supportFragmentManager.beginTransaction().replace(R.id.container_fragments,BlankFragment1.newInstance()).commit()


       // Button1=findViewById(R.id.button1) // связываеми объект с кнопкой на форме для перехода на окно с RecyleView
      //  Button2=findViewById(R.id.button2) // связываеми объект с кнопкой на форме для перехода на окно с RecyleView
      //  Button3=findViewById(R.id.button3) // связываеми объект с кнопкой на форме для перехода на окно с RecyleView




    }
}