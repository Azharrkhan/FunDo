package com.example.fundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.fundo.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers.Main

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        goToLogInPage()
    }

    private fun goToLogInPage() {

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, LogIn())
            fragmentTransaction.commit()
        }
    }


//        var btnNext = findViewById<TextView>(R.id.btnNext)
//        btnNext.setOnClickListener {
//            val intent = Intent(this, User_Registration::class.java)
//            startActivity(intent)

//            var btnPre = findViewById<TextView>(R.id.btnPre)
//            btnPre.setOnClickListener {
//                val intent = Intent(this, Main::class.java)
//                startActivity(intent)
