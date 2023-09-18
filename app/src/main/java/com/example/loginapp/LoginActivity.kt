package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextSenha)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        buttonLogin.setOnClickListener(View.OnClickListener {
            val inputEmail = editTextEmail.text.toString()
            val inputPassword = editTextPassword.text.toString()

            if (inputEmail == email && inputPassword == password) {
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email ou senha incorretos.", Toast.LENGTH_SHORT).show()
            }
        })


        val cadastro = findViewById<Button>(R.id.buttonCadastro)

        cadastro.setOnLongClickListener{
            irParaCadastro()
            true
        }


    }

    private fun irParaCadastro() {

        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)

    }
}
