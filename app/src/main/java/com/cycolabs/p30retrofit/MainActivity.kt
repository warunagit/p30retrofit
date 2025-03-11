package com.cycolabs.p30retrofit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}