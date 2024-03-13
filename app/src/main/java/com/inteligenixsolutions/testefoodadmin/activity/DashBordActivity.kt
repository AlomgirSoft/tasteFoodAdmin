package com.inteligenixsolutions.testefoodadmin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inteligenixsolutions.testefoodadmin.databinding.ActivityDeshBordBinding

class DashBordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeshBordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeshBordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addMenuItem.setOnClickListener {
            startActivity(Intent(this@DashBordActivity, AddItemActivity::class.java))
        }


        binding.allItemMenuLayout.setOnClickListener {
            startActivity(Intent(this@DashBordActivity, AllItemActivity::class.java))
        }
        binding.orderDispatchLayout.setOnClickListener {
            startActivity(Intent(this@DashBordActivity, OutForDeliveryActivity::class.java))
        }
        binding.adminProfile.setOnClickListener {
            startActivity(Intent(this@DashBordActivity, AdminProfileActivity::class.java))
        }
        binding.createNewUserLayout.setOnClickListener {
            startActivity(Intent(this@DashBordActivity, CreateNewUserActivity::class.java))
        }
        binding.pendingTv.setOnClickListener {
            startActivity(Intent(this@DashBordActivity, PendingOrderActivity::class.java))
        }
    }
}