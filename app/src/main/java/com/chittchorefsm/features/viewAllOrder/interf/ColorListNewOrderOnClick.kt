package com.chittchorefsm.features.viewAllOrder.interf

import com.chittchorefsm.app.domain.NewOrderColorEntity
import com.chittchorefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}