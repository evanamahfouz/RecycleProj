package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class IndustryIdentifier {
    @SerializedName("type")
    @Expose
    private var type: String? = null
        get() = field

    @SerializedName("identifier")
    @Expose
    private var identifier: String? = null
        get() = field


}