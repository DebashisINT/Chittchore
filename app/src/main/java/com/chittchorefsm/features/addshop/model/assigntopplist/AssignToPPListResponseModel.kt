package com.chittchorefsm.features.addshop.model.assigntopplist

import com.chittchorefsm.base.BaseResponse

/**
 * Created by Saikat on 03-10-2018.
 */
class AssignToPPListResponseModel : BaseResponse() {
    var assigned_to_pp_list: List<AssignToPPListDataModel>? = null
}