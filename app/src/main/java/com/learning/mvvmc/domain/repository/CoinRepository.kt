package com.learning.mvvmc.domain.repository

import com.learning.mvvmc.data.remote.dto.CoinDetailDto
import com.learning.mvvmc.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(id: String): CoinDetailDto
}