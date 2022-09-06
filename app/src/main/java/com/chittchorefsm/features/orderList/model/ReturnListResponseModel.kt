package com.chittchorefsm.features.orderList.model

import com.chittchorefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}