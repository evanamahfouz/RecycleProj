package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Epub {
    @SerializedName("isAvailable")
    @Expose
    private var isAvailable: Boolean? = null
    @SerializedName("acsTokenLink")
    @Expose
    private var acsTokenLink: String? = null

    fun getIsAvailable(): Boolean? {
        return isAvailable
    }

    fun setIsAvailable(isAvailable: Boolean?) {
        this.isAvailable = isAvailable
    }

    fun getAcsTokenLink(): String? {
        return acsTokenLink
    }

    fun setAcsTokenLink(acsTokenLink: String) {
        this.acsTokenLink = acsTokenLink
    }
}