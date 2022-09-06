package com.chittchorefsm.features.viewAllOrder.interf

import com.chittchorefsm.app.domain.NewOrderProductEntity
import com.chittchorefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}