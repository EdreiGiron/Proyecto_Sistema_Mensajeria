package com.umg.umessage

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class IniciarSesionActivity : ComponentActivity() {

    private lateinit var tvRegister: TextView
    private lateinit var llRegister: LinearLayout
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion_activity)
// Inicialización de vistas
        tvRegister = findViewById(R.id.tvRegister)
        llRegister = findViewById(R.id.llRegister)
        btnLogin = findViewById(R.id.btnIniciarSesion)
        btnRegister = findViewById(R.id.btnRegister)

        // Configuración de clics
        tvRegister.setOnClickListener {
            toggleRegisterView()
        }

        btnRegister.setOnClickListener {
            // Aquí debes implementar la lógica para el registro de usuario
            // Por ejemplo, validación de datos y llamada a una función de registro
        }

        btnLogin.setOnClickListener {
            // Aquí debes implementar la lógica para el inicio de sesión
            // Por ejemplo, validación de datos y llamada a una función de inicio de sesión
        }
    }

    private fun toggleRegisterView() {
        if (llRegister.visibility == View.VISIBLE) {
            llRegister.visibility = View.GONE
            btnLogin.visibility = View.VISIBLE
            tvRegister.text = "¿No tienes una cuenta? Regístrate"
            btnLogin.text = "Iniciar Sesión"
        } else {
            llRegister.visibility = View.VISIBLE
            tvRegister.text = "¿Ya tienes una cuenta? Inicia Sesión"
            btnLogin.visibility = View.INVISIBLE
        }
    }
}