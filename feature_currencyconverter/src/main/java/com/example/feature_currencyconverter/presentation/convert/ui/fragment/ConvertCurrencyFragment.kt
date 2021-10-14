package com.example.feature_currencyconverter.presentation.convert.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.core.base.presentation.fragment.BaseFragment
import com.example.core.di.ViewModelFactory
import com.example.feature_currencyconverter.databinding.FragmentConvertCurrencyBinding
import com.example.feature_currencyconverter.di.ext.initCurrencyConverterComponent
import com.example.feature_currencyconverter.presentation.convert.model.CurrencyRateConverter
import com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel
import javax.inject.Inject

class ConvertCurrencyFragment : BaseFragment() {
    private lateinit var binding: FragmentConvertCurrencyBinding
    private val args: ConvertCurrencyFragmentArgs by navArgs()


    @Inject
    internal lateinit var convertViewModelFactory: ViewModelFactory<ConvertCurrencyViewModel>
    private val convertCurrencyViewModel by lazy {
        ViewModelProvider(requireActivity(), convertViewModelFactory)[ConvertCurrencyViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConvertCurrencyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onAttach(context: Context) {
        requireActivity().initCurrencyConverterComponent()
        super.onAttach(context)
    }

    override fun init() {
        setData(args.countryConverter)
        observeBaseCurrencyAmountChange()
    }

    private fun observeBaseCurrencyAmountChange() {
        binding.baseCountryCurrencyTv.addTextChangedListener { amount ->
            amount?.let {
                if (amount.isNotEmpty() && amount.isNotBlank()) {
                    convertCurrency(amount.toString())
                }else
                    convertCurrency("0.0")
            }
        }
    }

    private fun convertCurrency(amount: String) {
        val convertedAmount = convertCurrencyViewModel.convert(
            amount.toDouble(),
            args.countryConverter.selectedCountryRate ?: 0.0
        )
        setConvertedAmount(convertedAmount)
    }

    private fun setData(currencyRateConverter: CurrencyRateConverter) {
        binding.baseCountryCurrencyTv.setText(currencyRateConverter.baseCountryRate.toString())
        binding.baseCountryIsoCodeTv.text = currencyRateConverter.baseCountryISO
        binding.countryIsoCodeTv.text = currencyRateConverter.selectedCountryISO
        binding.countryCurrencyTv.text = currencyRateConverter.selectedCountryRate.toString()
    }

    private fun setConvertedAmount(convertedAmount: String) {
        binding.countryCurrencyTv.text = convertedAmount
    }


}
