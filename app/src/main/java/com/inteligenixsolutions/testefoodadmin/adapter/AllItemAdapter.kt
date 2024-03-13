package com.inteligenixsolutions.testefoodadmin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inteligenixsolutions.testefoodadmin.databinding.ItemAllBinding

class AllItemAdapter(
    private val menuItemName: ArrayList<String>,
    private val menuItemPrice: ArrayList<String>,
    private val menuItemImage: ArrayList<Int>
) : RecyclerView.Adapter<AllItemAdapter.AllVH>() {

    val itemQueantities= IntArray(menuItemName.size){1}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllVH {
        return AllVH(ItemAllBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun onBindViewHolder(holder: AllVH, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
       return menuItemName.size
    }


    inner class AllVH(val binding: ItemAllBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            binding.apply {
                val quantity=itemQueantities[position]
                foodNameTv.text = menuItemName[position]
                priceTv.text = menuItemPrice[position]
                popularFoodImageView.setImageResource(menuItemImage[position])
                countItemTv.text=quantity.toString()

                mainsTvBtn.setOnClickListener{
                    decreaseQuantitiy(position)


                }
                addTvBtn.setOnClickListener {
                    increaseQuantitiy(position)
                }
                deleteBtn.setOnClickListener {
                    deleteQuantitiy(position)
                }

            }
        }

        private fun increaseQuantitiy(position: Int) {
            if (itemQueantities[position]<10){
                itemQueantities[position]++
                binding.countItemTv.text = itemQueantities[position].toString()
            }

        }
        private fun decreaseQuantitiy(position: Int) {
            if (itemQueantities[position]>1){
                itemQueantities[position]--
                binding.countItemTv.text = itemQueantities[position].toString()
            }

        }
        private fun deleteQuantitiy(position: Int) {

                 menuItemName.removeAt(position)
                 menuItemPrice.removeAt(position)
                 menuItemImage.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,menuItemName.size)


        }

    }
}