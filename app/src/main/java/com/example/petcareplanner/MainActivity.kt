package com.example.petcareplanner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_homepage -> selectedFragment = HomepageFragment()
                R.id.nav_feeding -> selectedFragment = FeedingFragment()
                R.id.nav_vet -> selectedFragment = VetFragment()
                R.id.nav_exercise -> selectedFragment = ExerciseFragment()
                R.id.nav_grooming -> selectedFragment = GroomingFragment()
            }
            selectedFragment?.let {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, it).commit()
            }
            true
        }

        // Set default fragment
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, LandingPageFragment()).commit()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        // Navigate back to the landing page
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, LandingPageFragment()).commit()
        return true
    }
}
