package com.cycolabs.p30retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumService {
    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>

    @GET("albums")
    suspend fun getSpecificAlbums(@Query("userId") userId:Int): Response<Albums>
}
//Getting a collection of Albums from JSON, from server
//must specify the get endpoint of remote URL

//suspend fun getSpecificAlbums(@Query("userId") userId:Int): Response<Albums>
//endpoint is going to use with a search query, and response of albums
//albums?userId=5