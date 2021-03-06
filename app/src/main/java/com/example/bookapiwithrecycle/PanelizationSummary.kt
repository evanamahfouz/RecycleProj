package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PanelizationSummary {
    @SerializedName("containsEpubBubbles")
    @Expose
    private var containsEpubBubbles: Boolean? = null
        get() = field

    @SerializedName("containsImageBubbles")
    @Expose
    private var containsImageBubbles: Boolean? = null
        get() = field


}