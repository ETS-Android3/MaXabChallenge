package com.example.feature_currencyconverter.presentation.currencies.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_currencyconverter.R
import com.example.feature_currencyconverter.domain.model.CurrencyRate

class CurrenciesAdapter(
    private val itemClickAction: (item: CurrencyRate) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var currencies: MutableList<CurrencyRate> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CurrencyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.currency_item, parent, false),
            itemClickAction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = currencies[position]
        handleBinding(holder, item)
    }

    private fun handleBinding(
        holder: RecyclerView.ViewHolder,
        item: CurrencyRate?
    ) {
        (holder as CurrencyViewHolder).onBind(item)
    }


    override fun getItemCount() = currencies.size

    @SuppressLint("NotifyDataSetChanged")
    internal fun setItems(result: MutableList<CurrencyRate> = mutableListOf()) {
        currencies = result
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun clear() {
        currencies.clear()
        notifyDataSetChanged()
    }
}
