package com.example.databindingsampleproject.data
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movieModels: List<MovieModel>
)