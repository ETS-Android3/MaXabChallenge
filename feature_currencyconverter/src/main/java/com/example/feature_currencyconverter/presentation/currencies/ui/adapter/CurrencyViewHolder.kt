package com.example.feature_currencyconverter.presentation.currencies.ui.adapter

import android.view.View
import com.example.core.base.presentation.viewholder.BaseViewHolder
import com.example.feature_currencyconverter.databinding.CurrencyItemBinding
import com.example.feature_currencyconverter.domain.model.CurrencyRate

class CurrencyViewHolder(
    itemView: View,
    private val itemClickAction: (item: CurrencyRate) -> Unit
) : BaseViewHolder<CurrencyRate>(itemView) {

    private val binding = CurrencyItemBinding.bind(itemView)

    override fun onBind(item: CurrencyRate?) {
        item?.let {
            binding.countryIsoCodeTv.text = it.iso
            binding.countryCurrencyTv.text = it.rate.toString()
            setOnItemClick(item)
        }
    }

    private fun setOnItemClick(item: CurrencyRate) {
        binding.root.setOnClickListener {
            itemClickAction.invoke(item)
        }
    }
}
