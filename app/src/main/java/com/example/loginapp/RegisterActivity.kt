package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private var name: String = ""
    private var email: String = ""
    private var password: String = ""

    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        editTextName = findViewById(R.id.editTextName)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonRegister = findViewById(R.id.buttonRegister)

        buttonRegister.setOnClickListener(View.OnClickListener {
            name = editTextName.text.toString()
            email = editTextEmail.text.toString()
            password = editTextPassword.text.toString()



            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("password", password)
            startActivity(intent)


            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                // Aqui você pode realizar ações com as variáveis 'name', 'email' e 'password'.
                Toast.makeText(this, "Dados do usuário registrados com sucesso!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        })

        val cadastro = findViewById<Button>(R.id.buttonIrLogin)

        cadastro.setOnLongClickListener{
            irParaLogin()
            true // Adicione esta linha para retornar 'true'
        }




    }

    private fun irParaLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
