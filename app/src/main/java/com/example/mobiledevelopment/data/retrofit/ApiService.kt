package com.example.mobiledevelopment.data.retrofit

import com.example.mobiledevelopment.data.response.MateriResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("materi")
    fun getMateri(): Call<MateriResponse>
}