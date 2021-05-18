package com.example.moskow.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moskow.R
import com.example.moskow.main.model.Mood
import java.util.*

class Adapter(var items : ArrayList<Mood>) : RecyclerView.Adapter<Adapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView5)
        val textView: TextView = itemView.findViewById(R.id.textView9)

        fun bind(item: Mood) {
            imageView.setImageResource(item.img)
            textView.text = item.txt

        }

    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder =
            CardViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false))

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
            holder.bind(items[position])

    }
}
