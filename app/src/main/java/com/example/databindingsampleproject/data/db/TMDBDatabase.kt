package com.example.databindingsampleproject.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.databindingsampleproject.data.model.actor.ActorModel
import com.example.databindingsampleproject.data.model.movie.MovieModel
import com.example.databindingsampleproject.data.model.tvshow.TvShowModel

@Database(
    entities = [MovieModel::class, TvShowModel::class, ActorModel::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun actorsDao(): ActorsDao
}