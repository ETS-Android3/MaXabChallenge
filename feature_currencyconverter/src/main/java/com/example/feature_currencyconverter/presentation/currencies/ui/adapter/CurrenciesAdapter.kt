package com.example.feature_currencyconverter.presentation.currencies.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_currencyconverter.R
import com.example.feature_currencyconverter.domain.model.CountryRate

class CurrenciesAdapter(
    private val itemClickAction: (item: CountryRate) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var countries: MutableList<CountryRate> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CurrencyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.currency_item, parent, false),
            itemClickAction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = countries[position]
        handleBinding(holder, item)
    }

    private fun handleBinding(
        holder: RecyclerView.ViewHolder,
        item: CountryRate?
    ) {
        (holder as CurrencyViewHolder).onBind(item)
    }


    override fun getItemCount() = countries.size ?: 0

    @SuppressLint("NotifyDataSetChanged")
    internal fun setItems(result: MutableList<CountryRate> = mutableListOf()) {
        countries = result
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun clear() {
        countries.clear()
        notifyDataSetChanged()
    }
}
