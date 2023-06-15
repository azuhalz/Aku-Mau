package com.example.mobiledevelopment.data.retrofit

import com.example.mobiledevelopment.data.response.MateriItem
import com.example.mobiledevelopment.data.response.MateriResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("materi")
    fun getMateri(): Call<ArrayList<MateriResponseItem>>

    @GET("judul")
    fun getJudul(): Call<ArrayList<MateriItem>>

    @GET("isi")
    fun getIsi(): Call<ArrayList<MateriItem>>
}