package com.chittchorefsm.features.lead.api

import com.chittchorefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.chittchorefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}