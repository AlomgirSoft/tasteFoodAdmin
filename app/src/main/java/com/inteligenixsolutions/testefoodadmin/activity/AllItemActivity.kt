package com.inteligenixsolutions.testefoodadmin.activity

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.inteligenixsolutions.testefoodadmin.R
import com.inteligenixsolutions.testefoodadmin.adapter.AllItemAdapter
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityAllItemBinding

class AllItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAllItemBinding
    private lateinit var allItemAdapter: AllItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backBtn.background = null
        binding.backBtn.setOnClickListener {
            finish()
        }
        val menuName = arrayListOf("Burger","Pizza", "Nag Momo","Pasta")
        val menuPrice = arrayListOf("$10","$20", "$15","$14")
        val menuImage = arrayListOf(R.drawable.food1, R.drawable.food2,R.drawable.food3,R.drawable.food4)


        allItemAdapter = AllItemAdapter(menuName,menuPrice,menuImage)

        binding.allItemRcv.adapter = allItemAdapter





    }

}