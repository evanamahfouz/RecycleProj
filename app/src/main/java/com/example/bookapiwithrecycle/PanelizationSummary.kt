package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PanelizationSummary {
    @SerializedName("containsEpubBubbles")
    @Expose
    private var containsEpubBubbles: Boolean? = null
    @SerializedName("containsImageBubbles")
    @Expose
    private var containsImageBubbles: Boolean? = null

    fun getContainsEpubBubbles(): Boolean? {
        return containsEpubBubbles
    }

    fun setContainsEpubBubbles(containsEpubBubbles: Boolean?) {
        this.containsEpubBubbles = containsEpubBubbles
    }

    fun getContainsImageBubbles(): Boolean? {
        return containsImageBubbles
    }

    fun setContainsImageBubbles(containsImageBubbles: Boolean?) {
        this.containsImageBubbles = containsImageBubbles
    }
}