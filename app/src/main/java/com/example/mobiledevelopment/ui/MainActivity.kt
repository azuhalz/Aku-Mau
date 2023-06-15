package com.example.mobiledevelopment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiledevelopment.databinding.ActivityMainBinding
import com.example.mobiledevelopment.ui.latihansoal.subsoal.SubSoalActivity
import com.example.mobiledevelopment.ui.materi.subtes.MateriActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMateri.setOnClickListener {
            startActivity(Intent(this@MainActivity, MateriActivity::class.java))
        }

        binding.btnLatsol.setOnClickListener {
            startActivity(Intent(this@MainActivity, SubSoalActivity::class.java))
        }
    }
}