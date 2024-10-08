package com.example.appseas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private  lateinit var registrarse_btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        registrarse_btn=findViewById(R.id.registering_user)

        registrarse_btn.setOnClickListener {
            val intent= Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Configuración del botón de iniciar sesión
        val loginButton: Button = findViewById(R.id.inicio_App)
        loginButton.setOnClickListener {
            // Redirigir a la actividad que muestra activity_home.xml
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }


    }
}