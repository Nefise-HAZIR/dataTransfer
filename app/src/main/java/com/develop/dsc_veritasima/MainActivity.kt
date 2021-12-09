package com.develop.dsc_veritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.develop.dsc_veritasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent=Intent(this,kullaniciBilgiActivity::class.java)
            intent.putExtra("isim",binding.editTextName.text.toString())
            intent.putExtra("yas",binding.editTextYas.text.toString().toInt())
            startActivity(intent)
        }
    }
}