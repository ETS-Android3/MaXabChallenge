package com.example.feature_currencyconverter.presentation.currencies.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.base.presentation.extension.*
import com.example.core.base.presentation.fragment.BaseFragment
import com.example.core.di.ViewModelFactory
import com.example.feature_currencyconverter.databinding.FragmentCurrenciesBinding
import com.example.feature_currencyconverter.di.ext.initCurrencyConverterComponent
import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate
import com.example.feature_currencyconverter.presentation.currencies.ui.adapter.CurrenciesAdapter
import com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel
import javax.inject.Inject

class CurrenciesFragment : BaseFragment() {
    private lateinit var binding: FragmentCurrenciesBinding

    private val currenciesAdapter by lazy {
        CurrenciesAdapter {
            onCountrySelected(it)
        }
    }

    @Inject
    internal lateinit var currenciesViewModelFactory: ViewModelFactory<CurrenciesViewModel>
    private val currenciesViewModel by lazy {
        ViewModelProvider(requireActivity(), currenciesViewModelFactory)[CurrenciesViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCurrenciesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onAttach(context: Context) {
        requireActivity().initCurrencyConverterComponent()
        super.onAttach(context)
    }

    private val stateObserver = Observer<CurrenciesViewModel.ViewState> {
        setData(it.currency)
        binding.progressRootView.rootView.handleVisibility(it.isLoading)
        binding.errorRootView.rootView.handleVisibility(it.isError)
    }


    private fun setData(currency: Currency?) {
        currency?.let {
            currenciesAdapter.setItems(currency.rates)
            binding.selectedCountryRootView.countryCurrencyTv.text = currency.selectedCountry
        }
    }


    override fun init() {
        initCurrenciesRv()
        observe(currenciesViewModel.stateLiveData, stateObserver)
        currenciesViewModel.postLasState()
    }

    override fun onViewClicked() {
        binding.errorRootView.btnRetry.setOnClickListener {
            currenciesViewModel.loadData()
        }
    }

    private fun initCurrenciesRv() {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = currenciesAdapter
    }

    private fun onCountrySelected(currencyRate: CurrencyRate) {
        currenciesViewModel.navigateToConvertCurrency(currencyRate)
    }


}
