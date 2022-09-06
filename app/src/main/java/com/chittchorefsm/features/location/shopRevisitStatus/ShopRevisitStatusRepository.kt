package com.chittchorefsm.features.location.shopRevisitStatus

import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.location.model.ShopDurationRequest
import com.chittchorefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}