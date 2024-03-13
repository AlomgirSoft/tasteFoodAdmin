package com.inteligenixsolutions.testefoodadmin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityAddItemBinding

class AddItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.background= null
        binding.backBtn.setOnClickListener {
            finish()
        }
        binding.editTextIngredients.background= null
        binding.shotDescription.background= null

        binding.itemAddImageTv.setOnClickListener  {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }

        binding.backBtn.setOnClickListener {
            finish()
        }
    }

    val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){ uri->
            if (uri != null){

                binding.itemFoodImageView.setImageURI(uri)

            }
    }
}