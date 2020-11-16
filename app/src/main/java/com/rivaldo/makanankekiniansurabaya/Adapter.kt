package com.rivaldo.makanankekiniansurabaya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class Adapter(val list:ArrayList<Food>) : RecyclerView.Adapter<Adapter.Holder>() {

    private var onItemClickCallback : OnItemClickCallback? = null

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
   inner class Holder(val view: View) : RecyclerView.ViewHolder(view) {

       fun bind(fooditems: Food) {
            with(view) {
                img_view.setImageResource(fooditems.image)
                tv_name.text = fooditems.name
                tv_desc.text = fooditems.description
            }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: Adapter.Holder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}