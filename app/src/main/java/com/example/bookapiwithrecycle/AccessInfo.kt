package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AccessInfo {
    @SerializedName("country")
    @Expose
    private var country: String? = null
        get() = field

    @SerializedName("viewability")
    @Expose
    private var viewability: String? = null
        get() = field

    @SerializedName("embeddable")
    @Expose
    private var embeddable: Boolean? = null
        get() = field

    @SerializedName("publicDomain")
    @Expose
    private var publicDomain: Boolean? = null
        get() = field

    @SerializedName("textToSpeechPermission")
    @Expose
    private var textToSpeechPermission: String? = null
        get() = field

    @SerializedName("epub")
    @Expose
    private var epub: Epub? = null
        get() = field

    @SerializedName("pdf")
    @Expose
    private var pdf: Pdf? = null
        get() = field

    @SerializedName("webReaderLink")
    @Expose
    private var webReaderLink: String? = null
        get() = field

    @SerializedName("accessViewStatus")
    @Expose
    private var accessViewStatus: String? = null
        get() = field


    @SerializedName("quoteSharingAllowed")
    @Expose
    private var quoteSharingAllowed: Boolean? = null
        get() = field


}