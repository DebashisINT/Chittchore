package com.chittchorefsm.features.newcollection.model

import com.chittchorefsm.app.domain.CollectionDetailsEntity
import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}