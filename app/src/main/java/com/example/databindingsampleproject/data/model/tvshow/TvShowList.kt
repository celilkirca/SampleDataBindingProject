package com.example.databindingsampleproject.data.model.tvshow


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val tvShowModels: List<TvShowModel>
)