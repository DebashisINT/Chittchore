package com.chittchorefsm.features.addAttendence.model

import com.chittchorefsm.base.BaseResponse


/**
 * Created by Saikat on 31-08-2018.
 */
class WorkTypeResponseModel : BaseResponse() {
    var worktype_list: ArrayList<WorkTypeListData>? = null
}