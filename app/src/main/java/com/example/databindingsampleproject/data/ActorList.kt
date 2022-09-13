package com.example.databindingsampleproject.data


import com.google.gson.annotations.SerializedName

data class ActorList(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val actorModels: List<ActorModel>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)