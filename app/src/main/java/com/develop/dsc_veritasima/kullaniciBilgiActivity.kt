package com.develop.dsc_veritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.develop.dsc_veritasima.databinding.ActivityKullaniciBilgiBinding

class kullaniciBilgiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKullaniciBilgiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityKullaniciBilgiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenIsim=intent.getStringExtra("isim")
        val gelenYas=intent.getIntExtra("yas",0)

        binding.isimText.text=gelenIsim
        binding.yasText.text=gelenYas.toString()
    }
}