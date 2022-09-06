package com.chittchorefsm.features.location.shopRevisitStatus

import com.chittchorefsm.features.location.shopdurationapi.ShopDurationApi
import com.chittchorefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}