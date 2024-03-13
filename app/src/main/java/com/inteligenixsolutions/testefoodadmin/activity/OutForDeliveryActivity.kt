package com.inteligenixsolutions.testefoodadmin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.adapter.OutForDeliveryAdapter
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityOutForDeliveryBinding

class OutForDeliveryActivity : AppCompatActivity() {
 private val binding: ActivityOutForDeliveryBinding by lazy  {
     ActivityOutForDeliveryBinding.inflate(layoutInflater)
 }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.backBtn.background= null
        binding.backBtn.setOnClickListener {
            finish()
        }

        val  customerName = arrayListOf("Afif hossain", "Binoy", "Rakib Hossain")
        val  moneyStatus = arrayListOf("received", "notReceived", "pending")

        val outAdapter = OutForDeliveryAdapter(customerName, moneyStatus)
        binding.outForDeliveryRcv.adapter= outAdapter




    }
}