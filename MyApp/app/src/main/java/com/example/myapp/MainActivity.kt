package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.myapp.databinding.ActivityMainBinding

private const val LOG_TAG_YENTED = "YENTED"

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.viewModel = MainViewModel()
        binding?.lifecycleOwner = this
        binding?.executePendingBindings()

        binding?.viewModel?.timer?.observe(this, {
            Log.d(LOG_TAG_YENTED, it)
        })
    }
}