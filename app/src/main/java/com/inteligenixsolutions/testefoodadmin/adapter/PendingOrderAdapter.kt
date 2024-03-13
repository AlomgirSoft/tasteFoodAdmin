package com.inteligenixsolutions.testefoodadmin.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.inteligenixsolutions.testefoodadmin.databinding.ItemAllBinding
import com.inteligenixsolutions.testefoodadmin.databinding.ItemForDeliveryBinding
import com.inteligenixsolutions.testefoodadmin.databinding.ItemOrderStatusBinding

class PendingOrderAdapter(
    private val customerName: ArrayList<String>,
    private val quantity: ArrayList<String>,
    private val foodMenuImage: ArrayList<Int>,
    private val context: Context

) : RecyclerView.Adapter<PendingOrderAdapter.PendingOrderVH>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PendingOrderVH {
        return PendingOrderVH(ItemOrderStatusBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun onBindViewHolder(holder: PendingOrderVH, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
       return customerName.size
    }


    inner class PendingOrderVH(val binding: ItemOrderStatusBinding) : RecyclerView.ViewHolder(binding.root) {
   var  isAccepted= false
        fun bind(position: Int) {
            binding.apply {
           customerNameTv.text = customerName[position]
                quantityCountTV.text = quantity[position]
                popularFoodImageView.setImageResource(foodMenuImage[position])



             orderPendingBtn.apply {
              if (!isAccepted){
               text = "Accept"
              }else{
                  text = "Dispatch"
              }

                 setOnClickListener{
                     if (!isAccepted){
                         text = "Dispatch"
                         isAccepted = true
                         showToast("Order is Accepted")

                     }else{
                           customerName.removeAt(adapterPosition)
                         notifyItemRemoved(adapterPosition)
                         showToast("Order is Dispatched")

                     }
                 }



             }


            }
        }

  private fun showToast(message:String){
      Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
  }

    }
}