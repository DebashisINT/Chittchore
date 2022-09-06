package com.chittchorefsm.features.stockCompetetorStock.api

import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.orderList.model.NewOrderListResponseModel
import com.chittchorefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.chittchorefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}