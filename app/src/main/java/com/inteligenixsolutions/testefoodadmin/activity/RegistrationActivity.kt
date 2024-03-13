package com.inteligenixsolutions.testefoodadmin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityRejisretionBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRejisretionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRejisretionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.singBtn.setOnClickListener {
            startActivity(Intent(this@RegistrationActivity, DashBordActivity::class.java))
        }
    }
}