package com.learning.mvvmc.presentation.coin_detail
import com.learning.mvvmc.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
