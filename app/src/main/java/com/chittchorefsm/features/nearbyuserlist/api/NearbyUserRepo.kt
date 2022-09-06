package com.chittchorefsm.features.nearbyuserlist.api

import com.chittchorefsm.app.Pref
import com.chittchorefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.chittchorefsm.features.newcollection.model.NewCollectionListResponseModel
import com.chittchorefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}