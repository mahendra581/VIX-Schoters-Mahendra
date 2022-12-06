package com.example.taskrakamin

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class ModelArticle(
    @SerializedName("source")
    var modelSource: ModelSource?,

    @SerializedName("author")
    var author: String = "",

    @SerializedName("title")
    var title: String = "",

    @SerializedName("description")
    var description: String = "",

    @SerializedName("url")
    var url: String = "",

    @SerializedName("urlToImage")
    var urlToImage: String = "",

    @SerializedName("publishedAt")
    var publishedAt: String = ""
) : Parcelable

@Parcelize
data class ModelSource(
    @SerializedName("id")
    val id: String? = "",

    @SerializedName("name")
    val name: String? = ""
) : Parcelable