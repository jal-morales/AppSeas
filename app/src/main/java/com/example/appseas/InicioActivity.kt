package com.example.appseas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //definir Array
        val abecedarioSeña=arrayOf(
            arrayOf("A", "Descripción de la seña para A"),
            arrayOf("B", "Descripción de la seña para B"),
            arrayOf("C", "Descripción de la seña para C"),
            arrayOf("D", "Descripción de la seña para D"),
            arrayOf("E", "Descripción de la seña para E"),
            arrayOf("F", "Descripción de la seña para F"),
            arrayOf("G", "Descripción de la seña para G"),
            arrayOf("H", "Descripción de la seña para H"),
            arrayOf("I", "Descripción de la seña para I"),
            arrayOf("J", "Descripción de la seña para J"),
            arrayOf("K", "Descripción de la seña para K"),
            arrayOf("L", "Descripción de la seña para L"),
            arrayOf("M", "Descripción de la seña para M"),
            arrayOf("N", "Descripción de la seña para N"),
            arrayOf("O", "Descripción de la seña para O"),
            arrayOf("P", "Descripción de la seña para P"),
            arrayOf("Q", "Descripción de la seña para Q"),
            arrayOf("R", "Descripción de la seña para R"),
            arrayOf("S", "Descripción de la seña para S"),
            arrayOf("T", "Descripción de la seña para T"),
            arrayOf("U", "Descripción de la seña para U"),
            arrayOf("V", "Descripción de la seña para V"),
            arrayOf("W", "Descripción de la seña para W"),
            arrayOf("X", "Descripción de la seña para X"),
            arrayOf("Y", "Descripción de la seña para Y"),
            arrayOf("Z", "Descripción de la seña para Z")
        )

        val contenido:TextView= findViewById(R.id.content_App)
        val concatenarContenido= abecedarioSeña.joinToString(separator = "\n\n"){
            abecedarioSeña->"${abecedarioSeña[0]}\n${abecedarioSeña[1]}"
        }
        contenido.text=concatenarContenido

        // Encuentra el botón por su ID
        val volverInicioButton: Button = findViewById(R.id.CerrarSession_App)
        volverInicioButton.setOnClickListener {
            // Redirige a LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Opcional: cerrar RegisterActivity si no se debe regresar a ella
        }
    }

}