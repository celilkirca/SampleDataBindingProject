package com.example.databindingsampleproject.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.databindingsampleproject.data.model.actor.ActorModel

@Dao
interface ActorsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveActors(actors: List<ActorModel>)

    @Query("DELETE FROM popular_actors")
    suspend fun deleteAllActors()

    @Query("SELECT * FROM popular_actors")
    suspend fun getActors(): List<ActorModel>

}