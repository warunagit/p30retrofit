package com.cycolabs.p30retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //Web services:
    //download-upload data, Authentication, Store images, Upload files...
    //API: Appplication Programming Interface use for apllication's functionality and data communication
    //JSON: Data will be transfer in JSON format. Should parse to required data type to use.
    //JSON: JavaScript Object Notation. It is super lightweight.
    //App -> Request with params -> RETROFIT -> Uri and HTTP method -> Server
    //Server -> Response in JSON format -> RETROFIT -> Kotlin Object -> App
    //RETFROFIT provides authentication and POJO parse conversion for "source" of object.

    //1-add dependencies: LiveData,ViewModel,Coroutine,Reftrofit,okhttp-logging
    //2-add permissions: internet, network-state, wifi-state
    //3-Implementation of Retrofit needs: POJO Data classes, Service Interface / API, Retrofit Instance
    //POJO-for parse JSON data using GSON in background, automatically
    //POJO class can create manually or using jsonschema2pojo.org.
    //To serialize JSON, requires a converter.
    //API is to define different methods which going to use for network transactions
    //Retrofit is for retrofit instance that to make network calls
    //json element contains Array [], Objects {}, key-value pairs
    //"students":[{"name":"Jhon","Age":23},{"name":"Nina","Age":36},..]
    //https://jsonplaceholder.typicode.com/ free api
    //https://jsonplaceholder.typicode.com/albums
    //https://www.jsonschema2pojo.org/#google_vignette

    //NEED 4 CLASSESS
    //4-Create class: AlbumItem
    //HTTP Request: GET is only to retrieve data. POST is only to send sensitive data to server.
    //HTTP Response: sending from server to client. carried out result of the action or state or error.
    //HTTP response codes: contains pre-specified server app tier codes.
    //5-Create class: Albums
    //6-API service interface
    //http://www.musicapp.baseurl.com/endpoint
    //7-create interface: AlbumService
    //8-create class: RetrofitInstance
    //9-code MainActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitService = RetrofitInstance
            .getRetrofitInstcance()
            .create(AlbumService::class.java)

        val responseLiveData: LiveData<Response<Albums>> = liveData {
            val response = retrofitService.getAlbums()
            emit(response)
        }

        responseLiveData.observe(this, Observer {
            val albumsList = it.body()?.listIterator()

            if(albumsList != null){
                while (albumsList.hasNext()){
                    val albumItem = albumsList.next()
                    Log.i("TAGY",albumItem.title)
                }
            }
        })
    }
}