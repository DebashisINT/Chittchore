package com.chittchorefsm.features.stockAddCurrentStock.api

import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.location.model.ShopRevisitStatusRequest
import com.chittchorefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.chittchorefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.chittchorefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.chittchorefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}