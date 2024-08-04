package com.example.i_fit

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun OnClickBowlCalorico(view: View) {
        startActivity(Intent(this, BowlCalorico::class.java))
    }

    fun OnClickMarmitasSemanais(view: View) {
        startActivity(Intent(this, MarmitasSemanais::class.java))
    }

    fun onClickSalada(view: View) {
        startActivity(Intent(this, Salada::class.java))
    }

    fun onClickArrozFrango(view: View) {
        startActivity(Intent(this, ArrozFrango::class.java))
    }
}