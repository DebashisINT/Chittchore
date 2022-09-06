package com.chittchorefsm.features.newcollectionreport

import com.chittchorefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}