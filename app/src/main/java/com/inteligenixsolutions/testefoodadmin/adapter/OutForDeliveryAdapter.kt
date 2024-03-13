package com.inteligenixsolutions.testefoodadmin.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inteligenixsolutions.testefoodadmin.databinding.ItemAllBinding
import com.inteligenixsolutions.testefoodadmin.databinding.ItemForDeliveryBinding

class OutForDeliveryAdapter(
    private val customerName: ArrayList<String>,
    private val moneyStatus: ArrayList<String>,

) : RecyclerView.Adapter<OutForDeliveryAdapter.OutForDeliveryVH>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutForDeliveryVH {
        return OutForDeliveryVH(ItemForDeliveryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun onBindViewHolder(holder: OutForDeliveryVH, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
       return customerName.size
    }


    inner class OutForDeliveryVH(val binding: ItemForDeliveryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            binding.apply {
           customerNameTV.text = customerName[position]
                deliveryTypeTv.text = moneyStatus[position]

                val colorMap  = mapOf("received" to Color.GREEN,"notReceived" to Color.RED,"pending" to Color.GRAY)
                deliveryTypeTv.setTextColor(colorMap[moneyStatus[position]]?: Color.BLACK)
                statusColor.backgroundTintList = ColorStateList.valueOf(colorMap[moneyStatus[position]]?: Color.BLACK)



            }
        }



    }
}