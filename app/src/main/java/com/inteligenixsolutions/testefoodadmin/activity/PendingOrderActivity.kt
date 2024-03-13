package com.inteligenixsolutions.testefoodadmin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.R
import com.inteligenixsolutions.testefoodadmin.adapter.PendingOrderAdapter
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityPendingOrderBinding

class PendingOrderActivity : AppCompatActivity() {
    private val binding: ActivityPendingOrderBinding by lazy {
        ActivityPendingOrderBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.backBtn.background= null
        binding.backBtn.setOnClickListener {
            finish()
        }

        val  customerName = arrayListOf("Afif hossain", "Binoy", "Rakib Hossain")
        val  quantity = arrayListOf("4", "6", "2")
        val  foodMenuImage = arrayListOf(R.drawable.food1, R.drawable.food2, R.drawable.food3)

        val outAdapter = PendingOrderAdapter(customerName, quantity,foodMenuImage, this )
        binding.pendingOrderRcv.adapter= outAdapter








    }
}