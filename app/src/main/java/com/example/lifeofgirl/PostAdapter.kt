package com.example.lifeofgirl

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(context: Context, list: ArrayList<RecyclerData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    private val context: Context = context
    var list: ArrayList<RecyclerData> = list

    private inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        var profile_photo: ImageView = itemView.findViewById(R.id.pfp)
        var name: TextView = itemView.findViewById(R.id.username)
        var timestamp: TextView = itemView.findViewById(R.id.timestamp)
        var user_post: TextView = itemView.findViewById(R.id.user_post)
        var likes: TextView = itemView.findViewById(R.id.likes)
        var shares: TextView = itemView.findViewById(R.id.shares)

        fun bind(position: Int) {
            name.text = list[position].name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false)
        return UserViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as UserViewHolder).bind(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}