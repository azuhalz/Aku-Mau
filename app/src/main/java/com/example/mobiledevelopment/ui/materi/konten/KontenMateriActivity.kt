package com.example.mobiledevelopment.ui.materi.konten

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobiledevelopment.data.response.MateriItem
import com.example.mobiledevelopment.databinding.ActivityKontenMateriBinding

class KontenMateriActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKontenMateriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKontenMateriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getParcelableExtra<MateriItem>("MATERI_ITEM")
        binding.apply {
            tvJudul.text = item?.judul
            tvIsi.text = item?.isi
        }
    }
}