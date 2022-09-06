package com.chittchorefsm.features.stockAddCurrentStock.api

import com.chittchorefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.chittchorefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}