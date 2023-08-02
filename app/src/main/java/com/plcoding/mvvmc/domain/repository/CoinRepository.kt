package com.plcoding.mvvmc.domain.repository

import com.plcoding.mvvmc.data.remote.dto.CoinDetailDto
import com.plcoding.mvvmc.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(id: String): CoinDetailDto
}