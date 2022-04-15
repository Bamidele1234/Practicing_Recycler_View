package com.example.scrollview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.scrollview.R
import com.example.scrollview.model.Values

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Values>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(view: View ): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.title)
        val secondary: TextView = view.findViewById(R.id.secondary_text)
        val additional: TextView = view.findViewById(R.id.additional_text)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val adapterLayout = LayoutInflater.from(parent.context)
           .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val item = dataset[position]
        holder.title.text = context.resources.getString(item.stringTitleId)
        holder.secondary.text = context.resources.getString(item.stringSecId)
        holder.additional.text = context.resources.getString(item.stringAddId)
        holder.imageView.setImageResource(item.imageId)
    }

    override fun getItemCount() = dataset.size

}