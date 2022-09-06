package com.chittchorefsm.features.dashboard.presentation.api.dayStartEnd

import com.chittchorefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.chittchorefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}