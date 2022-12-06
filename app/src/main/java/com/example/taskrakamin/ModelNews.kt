package com.example.taskrakamin

import com.google.gson.annotations.SerializedName

class ModelNews {
    data class ModelNews(
        @SerializedName("status")
        val status: String = "",

        @SerializedName("totalResults")
        val totalResults: Int = 0,

        @SerializedName("articles")
        val modelArticle: List<ModelArticle> = emptyList()
    )
}