package com.example.lgn_mws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLgn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLgn = findViewById(R.id.btnLgn)
        btnLgn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val dashboardpage = Intent(this, DashboardLaunch::class.java)

        startActivity(dashboardpage)
    }

}