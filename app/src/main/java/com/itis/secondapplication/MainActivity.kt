package com.itis.secondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.itis.secondapplication.databinding.ActivityContainerBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityContainerBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newBinding = ActivityContainerBinding.inflate(layoutInflater)
        binding = newBinding
        setContentView(newBinding.root)

        var controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController

        findViewById<BottomNavigationView>(R.id.bnv_main).apply {
            setupWithNavController(controller)
        }

        binding?.bnvMain?.setOnItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, controller)
            return@setOnItemSelectedListener true
        }
    }
}