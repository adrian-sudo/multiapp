package com.adrianlozano.androidmaster

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adrianlozano.androidmaster.firstapp.FirstAppActivity
import com.adrianlozano.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludarApp.setOnClickListener { navigateToSaludarApp() }
        btnIMCApp.setOnClickListener {navigateToIMCApp()}
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    fun navigateToSaludarApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}