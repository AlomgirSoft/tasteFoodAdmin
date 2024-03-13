package com.inteligenixsolutions.testefoodadmin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.R
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityAdminProfileBinding

class AdminProfileActivity : AppCompatActivity() {

    private val binding:ActivityAdminProfileBinding by lazy {
        ActivityAdminProfileBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.backBtn.background = null
        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.edName.isEnabled =false
        binding.edAdress.isEnabled =false
        binding.edEmail.isEnabled =false
        binding.edPhone.isEnabled =false
        binding.edPassword.isEnabled =false

        var isEnable= false

        binding.editProfile.setOnClickListener {

            isEnable = ! isEnable
            binding.edName.isEnabled =isEnable
            binding.edAdress.isEnabled =isEnable
            binding.edEmail.isEnabled =isEnable
            binding.edPhone.isEnabled =isEnable
            binding.edPassword.isEnabled =isEnable
            if (isEnable){
                binding.edName.requestFocus()
            }
        }

    }
}