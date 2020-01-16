package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Pdf {
    @SerializedName("isAvailable")
    @Expose
    private var isAvailable: Boolean? = null
        get() = field

    @SerializedName("acsTokenLink")
    @Expose
    private var acsTokenLink: String? = null
        get() = field

}