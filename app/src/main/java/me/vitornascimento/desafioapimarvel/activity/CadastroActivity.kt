package me.vitornascimento.desafioapimarvel.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*
import me.vitornascimento.desafioapimarvel.R
import me.vitornascimento.desafioapimarvel.helper.AsteriskPasswordTransformationMethod

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        inputPassword.transformationMethod =
            AsteriskPasswordTransformationMethod()

        toolbar.setNavigationOnClickListener {
            this.onBackPressed()
        }

        btnFinalizaCadastro.setOnClickListener {
            startActivity(Intent(this, ComicsListActivity::class.java))
        }
    }
}