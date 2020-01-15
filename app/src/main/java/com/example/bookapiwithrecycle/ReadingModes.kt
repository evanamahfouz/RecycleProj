package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReadingModes {
    @SerializedName("text")
    @Expose
    private var text: Boolean? = null
    @SerializedName("image")
    @Expose
    private var image: Boolean? = null

    fun getText(): Boolean? {
        return text
    }

    fun setText(text: Boolean?) {
        this.text = text
    }

    fun getImage(): Boolean? {
        return image
    }

    fun setImage(image: Boolean?) {
        this.image = image
    }
}