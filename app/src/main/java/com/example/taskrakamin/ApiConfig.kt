package com.example.taskrakamin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface ApiConfig {
    companion object {
        const val BASE_URL = "https://newsapi.org/v2/everything?q=tesla&from=2022-11-06&sortBy=publishedAt&apiKey=4ef9e57542644ea3a1b614d7532e13a8"
    }
    fun getApiClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Companion.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}