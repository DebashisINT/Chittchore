package com.chittchorefsm.features.viewAllOrder.interf

import com.chittchorefsm.app.domain.NewOrderGenderEntity
import com.chittchorefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}