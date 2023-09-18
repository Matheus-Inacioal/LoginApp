package com.example.loginapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val validEmail = "turmadeandroid@praxis.com"
    private val validPassword = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextSenha)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener(View.OnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email == validEmail && password == validPassword) {

                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email ou senha incorretos.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
