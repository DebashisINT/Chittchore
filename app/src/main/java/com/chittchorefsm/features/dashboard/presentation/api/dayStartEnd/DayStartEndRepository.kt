package com.chittchorefsm.features.dashboard.presentation.api.dayStartEnd

import com.chittchorefsm.app.Pref
import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.chittchorefsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.chittchorefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.chittchorefsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}