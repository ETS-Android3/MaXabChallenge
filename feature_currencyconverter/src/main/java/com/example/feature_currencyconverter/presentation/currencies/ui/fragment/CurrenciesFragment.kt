package com.example.feature_currencyconverter.presentation.currencies.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.base.presentation.activity.BaseActivity
import com.example.core.base.presentation.extension.*
import com.example.core.base.presentation.fragment.BaseFragment
import com.example.core.di.ViewModelFactory
import com.example.core.di.utils.InjectUtils
import com.example.feature_currencyconverter.databinding.FragmentCurrenciesBinding
import com.example.feature_currencyconverter.di.DaggerCurrencyConverterComponent
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate
import com.example.feature_currencyconverter.presentation.currencies.ui.adapter.CurrenciesAdapter
import com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel
import com.example.maxabchallenge.app.getMaxabApp
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
        DaggerCurrencyConverterComponent
            .builder()
            .application(requireActivity().getMaxabApp())
            .baseComponent(InjectUtils.provideBaseComponent(requireActivity().getMaxabApp()))
            .build()
            .inject(requireActivity() as BaseActivity)
        super.onAttach(context)
    }

    private val stateObserver = Observer<CurrenciesViewModel.ViewState> {
        setData(it.country)
        binding.progressRootView.rootView.handleVisibility(it.isLoading)
        binding.errorRootView.rootView.handleVisibility(it.isError)
    }


    private fun setData(country: Country?) {
        country?.let {
            currenciesAdapter.setItems(country.rates)
            binding.selectedCountryRootView.countryCurrencyTv.text = country.selectedCountry
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

    private fun onCountrySelected(countryRate: CountryRate) {
        currenciesViewModel.navigateToConvertCurrency(countryRate)
    }


}
