package com.chittchorefsm.features.viewAllOrder.interf

import com.chittchorefsm.app.domain.NewOrderGenderEntity
import com.chittchorefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}