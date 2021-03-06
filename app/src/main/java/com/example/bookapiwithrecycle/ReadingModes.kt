package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReadingModes {
    @SerializedName("text")
    @Expose
    private var text: Boolean? = null
        get() = field

    @SerializedName("image")
    @Expose
    private var image: Boolean? = null
        get() = field



}