package com.chittchorefsm.features.viewAllOrder.interf

import com.chittchorefsm.app.domain.NewOrderGenderEntity
import com.chittchorefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}