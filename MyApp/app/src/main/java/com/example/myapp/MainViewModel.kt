package com.example.myapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    val timer = MutableLiveData<String>()

    init {
        timer.value = "Edit Text"
    }

    fun write(){
        timer.value = "YENTED"
    }
}