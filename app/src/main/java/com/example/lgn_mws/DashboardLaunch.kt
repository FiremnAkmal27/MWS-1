package com.example.lgn_mws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardLaunch : AppCompatActivity() {
    private lateinit var txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_launch)

        txt = findViewById(R.id.txtview2)

    }
}