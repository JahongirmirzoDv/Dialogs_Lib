package com.example.dialogslib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialogslib.databinding.ActivityMainBinding
import com.example.materialdialogs.ColorPicker
import com.example.materialdialogs.ConnectWifi

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ConnectWifi.show(this)
    }
}