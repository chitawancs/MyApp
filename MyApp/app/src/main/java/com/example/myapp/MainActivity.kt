package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.myapp.databinding.ActivityMainBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

private const val LOG_TAG_YENTED = "YENTED"

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.viewModel = MainViewModel()
        binding?.lifecycleOwner = this
        binding?.executePendingBindings()

        binding?.viewModel?.timer?.observe(this, {
            Log.d("LOG_TAG_YENTED", it)
        })


    }
}