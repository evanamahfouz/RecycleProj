package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SearchInfo {
    @SerializedName("textSnippet")
    @Expose
    private var textSnippet: String? = null
    get() = field


}