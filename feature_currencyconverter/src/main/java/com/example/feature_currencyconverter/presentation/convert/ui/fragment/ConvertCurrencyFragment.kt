package com.example.feature_currencyconverter.presentation.convert.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.core.base.presentation.fragment.BaseFragment
import com.example.core.di.ViewModelFactory
import com.example.feature_currencyconverter.databinding.FragmentConvertCurrencyBinding
import com.example.feature_currencyconverter.presentation.convert.model.CountryRateConverter
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

    override fun init() {
        setData(args.countryConverter)
        observeBaseCurrencyAmountChange()
    }

    private fun observeBaseCurrencyAmountChange() {
        binding.baseCountryCurrencyTv.addTextChangedListener {
            val convertedAmount = convertCurrencyViewModel.convert(
                it.toString().toDouble(),
                args.countryConverter.selectedCountryRate ?: 0.0
            )
            setConvertedAmount(convertedAmount)
        }
    }

    private fun setData(countryRateConverter: CountryRateConverter) {
        binding.baseCountryCurrencyTv.setText(countryRateConverter.baseCountryRate.toString())
        binding.baseCountryIsoCodeTv.text = countryRateConverter.baseCountryISO
        binding.countryIsoCodeTv.text = countryRateConverter.selectedCountryISO
        binding.countryCurrencyTv.text = countryRateConverter.selectedCountryRate.toString()
    }

    private fun setConvertedAmount(convertedAmount: String) {
        binding.countryCurrencyTv.text = convertedAmount
    }


}
