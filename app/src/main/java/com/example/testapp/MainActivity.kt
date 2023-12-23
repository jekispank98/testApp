package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayMainFragment()
    }

    private fun displayMainFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, MainFragment.newInstance())
            .commit()
    }
}