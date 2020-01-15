package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AccessInfo {
    @SerializedName("country")
    @Expose
    private var country: String? = null
    @SerializedName("viewability")
    @Expose
    private var viewability: String? = null
    @SerializedName("embeddable")
    @Expose
    private var embeddable: Boolean? = null
    @SerializedName("publicDomain")
    @Expose
    private var publicDomain: Boolean? = null
    @SerializedName("textToSpeechPermission")
    @Expose
    private var textToSpeechPermission: String? = null
    @SerializedName("epub")
    @Expose
    private var epub: Epub? = null
    @SerializedName("pdf")
    @Expose
    private var pdf: Pdf? = null
    @SerializedName("webReaderLink")
    @Expose
    private var webReaderLink: String? = null
    @SerializedName("accessViewStatus")
    @Expose
    private var accessViewStatus: String? = null
    @SerializedName("quoteSharingAllowed")
    @Expose
    private var quoteSharingAllowed: Boolean? = null

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String) {
        this.country = country
    }

    fun getViewability(): String? {
        return viewability
    }

    fun setViewability(viewability: String) {
        this.viewability = viewability
    }

    fun getEmbeddable(): Boolean? {
        return embeddable
    }

    fun setEmbeddable(embeddable: Boolean?) {
        this.embeddable = embeddable
    }

    fun getPublicDomain(): Boolean? {
        return publicDomain
    }

    fun setPublicDomain(publicDomain: Boolean?) {
        this.publicDomain = publicDomain
    }

    fun getTextToSpeechPermission(): String? {
        return textToSpeechPermission
    }

    fun setTextToSpeechPermission(textToSpeechPermission: String) {
        this.textToSpeechPermission = textToSpeechPermission
    }

    fun getEpub(): Epub? {
        return epub
    }

    fun setEpub(epub: Epub) {
        this.epub = epub
    }

    fun getPdf(): Pdf? {
        return pdf
    }

    fun setPdf(pdf: Pdf) {
        this.pdf = pdf
    }

    fun getWebReaderLink(): String? {
        return webReaderLink
    }

    fun setWebReaderLink(webReaderLink: String) {
        this.webReaderLink = webReaderLink
    }

    fun getAccessViewStatus(): String? {
        return accessViewStatus
    }

    fun setAccessViewStatus(accessViewStatus: String) {
        this.accessViewStatus = accessViewStatus
    }

    fun getQuoteSharingAllowed(): Boolean? {
        return quoteSharingAllowed
    }

    fun setQuoteSharingAllowed(quoteSharingAllowed: Boolean?) {
        this.quoteSharingAllowed = quoteSharingAllowed
    }

}