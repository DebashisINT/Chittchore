package com.chittchorefsm.features.login.model.productlistmodel

import com.chittchorefsm.app.domain.ModelEntity
import com.chittchorefsm.app.domain.ProductListEntity
import com.chittchorefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}