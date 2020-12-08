package me.vitornascimento.desafioapimarvel.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import me.vitornascimento.desafioapimarvel.R
import me.vitornascimento.desafioapimarvel.helper.AsteriskPasswordTransformationMethod

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputPassword.transformationMethod =
                AsteriskPasswordTransformationMethod()

        btnLogin.setOnClickListener {
            startActivity(Intent(this, ComicsListActivity::class.java))
        }

        btnCadastro.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))
        }
    }
}