package com.chittchorefsm.features.location.api

import com.chittchorefsm.app.Pref
import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.location.model.AppInfoInputModel
import com.chittchorefsm.features.location.model.AppInfoResponseModel
import com.chittchorefsm.features.location.model.ShopDurationRequest
import com.chittchorefsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}