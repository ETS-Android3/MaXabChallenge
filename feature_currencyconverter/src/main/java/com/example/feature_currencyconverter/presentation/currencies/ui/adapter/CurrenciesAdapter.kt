package com.example.feature_currencyconverter.presentation.currencies.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_currencyconverter.R

class CurrenciesAdapter(
    private val itemClickAction: (item: Any) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var products: MutableList<Any?> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CurrencyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.currency_item, parent, false),
            itemClickAction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = products[position]
        handleBinding(holder, item)
    }

    private fun handleBinding(
        holder: RecyclerView.ViewHolder,
        item: Any?
    ) {
        (holder as CurrencyViewHolder).onBind(item)
    }


    override fun getItemCount() = products.size ?: 0

    @SuppressLint("NotifyDataSetChanged")
    fun setProducts(result: MutableList<Any?>) {
        products = result
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun clear() {
        products.clear()
        notifyDataSetChanged()
    }
}
