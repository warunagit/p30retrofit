package com.cycolabs.p30retrofit

import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {
    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>
}
//Getting a collection of Albums from JSON, from server
//must specify the get endpoint of remote URL