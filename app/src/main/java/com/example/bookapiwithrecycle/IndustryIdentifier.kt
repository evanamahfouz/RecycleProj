package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class IndustryIdentifier {
    @SerializedName("type")
    @Expose
    private var type: String? = null
    @SerializedName("identifier")
    @Expose
    private var identifier: String? = null

    fun getType(): String? {
        return type
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getIdentifier(): String? {
        return identifier
    }

    fun setIdentifier(identifier: String) {
        this.identifier = identifier
    }
}