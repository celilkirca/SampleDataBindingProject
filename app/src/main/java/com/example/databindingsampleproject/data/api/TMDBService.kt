package com.example.databindingsampleproject.data.api

import com.example.databindingsampleproject.data.model.actor.ActorList
import com.example.databindingsampleproject.data.model.movie.MovieList
import com.example.databindingsampleproject.data.model.tvshow.TvShowList
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ): Result<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShow(
        @Query(
            "api_key"
        ) apiKey: String
    ): Result<TvShowList>

    @GET("person/popular")
    suspend fun getPopularActors(
        @Query(
            "api_key"
        ) apiKey: String
    ): Result<ActorList>
}