package com.example.databindingsampleproject.data.model.actor


import com.google.gson.annotations.SerializedName

data class ActorList(
    @SerializedName("results")
    val actorModels: List<ActorModel>
)