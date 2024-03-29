package com.inteligenixsolutions.testefoodadmin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {

            startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
        }
    }
}