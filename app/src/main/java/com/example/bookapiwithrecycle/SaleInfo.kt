package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SaleInfo {

    @SerializedName("country")
    @Expose
    private var country: String? = null
    @SerializedName("saleability")
    @Expose
    private var saleability: String? = null
    @SerializedName("isEbook")
    @Expose
    private var isEbook: Boolean? = null

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String) {
        this.country = country
    }

    fun getSaleability(): String? {
        return saleability
    }

    fun setSaleability(saleability: String) {
        this.saleability = saleability
    }

    fun getIsEbook(): Boolean? {
        return isEbook
    }

    fun setIsEbook(isEbook: Boolean?) {
        this.isEbook = isEbook
    }
}