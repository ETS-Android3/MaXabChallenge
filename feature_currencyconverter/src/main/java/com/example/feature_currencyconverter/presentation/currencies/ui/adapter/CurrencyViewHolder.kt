package com.example.feature_currencyconverter.presentation.currencies.ui.adapter

import android.view.View
import com.example.core.base.presentation.viewholder.BaseViewHolder
import com.example.feature_currencyconverter.databinding.CurrencyItemBinding
import com.example.feature_currencyconverter.domain.model.CountryRate

class CurrencyViewHolder(
    itemView: View,
    private val itemClickAction: (item: CountryRate) -> Unit
) : BaseViewHolder<CountryRate>(itemView) {

    private val binding = CurrencyItemBinding.bind(itemView)

    override fun onBind(item: CountryRate?) {
        item?.let {
            binding.countryIsoCodeTv.text = it.iso
            binding.countryCurrencyTv.text = it.rate.toString()
            setOnItemClick(item)
        }
    }

    private fun setOnItemClick(item: CountryRate) {
        binding.root.setOnClickListener {
            itemClickAction.invoke(item)
        }
    }
}
