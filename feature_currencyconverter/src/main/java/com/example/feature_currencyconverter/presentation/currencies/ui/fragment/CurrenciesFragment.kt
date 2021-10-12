package com.example.feature_currencyconverter.presentation.currencies.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.base.presentation.activity.BaseActivity
import com.example.core.base.presentation.fragment.BaseFragment
import com.example.core.di.utils.InjectUtils
import com.example.feature_currencyconverter.databinding.FragmentCurrenciesBinding
import com.example.feature_currencyconverter.di.DaggerCurrencyConverterComponent
import com.example.feature_currencyconverter.presentation.currencies.ui.adapter.CurrenciesAdapter
import com.example.maxabchallenge.app.getMaxabApp

class CurrenciesFragment : BaseFragment() {
    private lateinit var binding: FragmentCurrenciesBinding

    private val currenciesAdapter by lazy{
        CurrenciesAdapter{

        }
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


    override fun init() {

        initCurrenciesRv()
        onCurrenciesLoaded(listOf("d","d","d","d","d"))
    }

    private fun initCurrenciesRv() {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = currenciesAdapter
    }


    private fun onCurrenciesLoaded(result: List<Any>) {

        currenciesAdapter.setProducts(result.toMutableList())
    }
}
