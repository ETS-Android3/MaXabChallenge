package com.example.feature_currencyconverter.presentation.currencies.ui.adapter

import android.view.View
import com.example.core.base.presentation.viewholder.BaseViewHolder
import com.example.feature_currencyconverter.databinding.CurrencyItemBinding

class CurrencyViewHolder(
    itemView: View,
    private val itemClickAction: (item: Any) -> Unit
) : BaseViewHolder<Any>(itemView) {

    private val binding = CurrencyItemBinding.bind(itemView)

    override fun onBind(item: Any?) {
        item?.let {

            setOnItemClick(item)
        }
    }

    private fun setOnItemClick(item: Any) {
        binding.root.setOnClickListener {
            itemClickAction.invoke(item)
        }
    }
}
