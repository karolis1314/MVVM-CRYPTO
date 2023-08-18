package com.learning.mvvmc.presentation.coin_list

import com.learning.mvvmc.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
