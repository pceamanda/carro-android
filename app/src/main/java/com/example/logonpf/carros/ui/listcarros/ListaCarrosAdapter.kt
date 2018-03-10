package com.example.logonpf.carros.ui.listcarros

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.logonpf.carros.R
import com.example.logonpf.carros.model.Carro

/**
 * Created by prado on 10/03/2018.
 */
class ListaCarrosAdapter(private val carros: List<Carro>,
                         private val context: Context) : RecyclerView.Adapter<ListaCarrosAdapter.MeuViewHolder>() {

    override fun getItemCount(): Int {
        return carros.size
    }

    override fun onBindViewHolder(holder: MeuViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_carro, parent, false)
        return MeuViewHolder(view)
    }

    class MeuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}