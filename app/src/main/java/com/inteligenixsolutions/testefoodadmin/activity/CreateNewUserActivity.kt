package com.inteligenixsolutions.testefoodadmin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityCreateNewUserBinding

class CreateNewUserActivity : AppCompatActivity() {
    private val binding:ActivityCreateNewUserBinding by lazy {
        ActivityCreateNewUserBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backBtn.background = null
        binding.backBtn.setOnClickListener {
            finish()
        }
    }
}