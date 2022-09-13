package com.example.databindingsampleproject.data.model.movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movieModels: List<MovieModel>
)