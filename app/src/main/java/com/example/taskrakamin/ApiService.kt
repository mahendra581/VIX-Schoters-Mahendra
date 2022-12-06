package com.example.taskrakamin


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

class ApiService {
    interface ApiInterface {
        @GET("top-headlines")
        fun getHeadlines(
            @Query("country") country: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

        @GET("top-headlines")
        fun getSports(
            @Query("country") country: String?,
            @Query("category") category: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

        @GET("top-headlines")
        fun getTechnology(
            @Query("country") country: String?,
            @Query("category") category: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

        @GET("top-headlines")
        fun getBusiness(
            @Query("country") country: String?,
            @Query("category") category: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

        @GET("top-headlines")
        fun getHealth(
            @Query("country") country: String?,
            @Query("category") category: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

        @GET("top-headlines")
        fun getEntertainment(
            @Query("country") country: String?,
            @Query("category") category: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

        @GET("everything")
        fun getNewsSearch(
            @Query("q") keyword: String?,
            @Query("language") language: String?,
            @Query("apiKey") apiKey: String?
        ): Call<ModelNews>

    }
}