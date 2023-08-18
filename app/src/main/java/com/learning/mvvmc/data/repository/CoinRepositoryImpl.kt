package com.learning.mvvmc.data.repository

import com.learning.mvvmc.data.remote.CoinPaprikaApi
import com.learning.mvvmc.data.remote.dto.CoinDetailDto
import com.learning.mvvmc.data.remote.dto.CoinDto
import com.learning.mvvmc.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(id: String): CoinDetailDto {
        return api.getCoinById(id)
    }
}