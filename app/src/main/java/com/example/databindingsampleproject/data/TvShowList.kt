package com.example.databindingsampleproject.data


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val tvShowModels: List<TvShowModel>
)