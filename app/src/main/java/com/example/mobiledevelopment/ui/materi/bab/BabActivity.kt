package com.example.mobiledevelopment.ui.materi.bab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobiledevelopment.data.response.MateriItem
import com.example.mobiledevelopment.data.response.MateriResponseItem
import com.example.mobiledevelopment.databinding.ActivityBabBinding

class BabActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getParcelableExtra<MateriResponseItem>("MATERI_RESPONSE_ITEM")
        binding.rvBab.setHasFixedSize(true)
        binding.rvBab.layoutManager = LinearLayoutManager(this)
        val adapter = BabAdapter(item?.materi as ArrayList<MateriItem>)
        binding.rvBab.adapter = adapter
    }
}