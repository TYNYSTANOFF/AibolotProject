package com.example.aibolotproject.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aibolotproject.databinding.ItemServicesBinding

class ServicesAdapter (
    private var onItemClick: () -> Unit
        ) : RecyclerView.Adapter<ServicesAdapter.ServicesViewHolder>() {

    private var views = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicesViewHolder {
        return ServicesViewHolder(
            ItemServicesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ServicesViewHolder, position: Int) {
        holder.bind(views[position])
    }

    override fun getItemCount() = views.size

    inner class ServicesViewHolder(private val binding: ItemServicesBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(views: String) {
            itemView.setOnClickListener {
                onItemClick.invoke()
            }
        }
    }

}