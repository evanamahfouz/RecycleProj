package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VolumeInfo {
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("subtitle")
    @Expose
    private var subtitle: String? = null
    @SerializedName("authors")
    @Expose
    private var authors: List<String>? = null
    @SerializedName("publisher")
    @Expose
    private var publisher: String? = null
    @SerializedName("publishedDate")
    @Expose
    private var publishedDate: String? = null
    @SerializedName("description")
    @Expose
    private var description: String? = null
    @SerializedName("industryIdentifiers")
    @Expose
    private var industryIdentifiers: List<IndustryIdentifier>? = null
    @SerializedName("readingModes")
    @Expose
    private var readingModes: ReadingModes? = null
    @SerializedName("printType")
    @Expose
    private var printType: String? = null
    @SerializedName("maturityRating")
    @Expose
    private var maturityRating: String? = null
    @SerializedName("allowAnonLogging")
    @Expose
    private var allowAnonLogging: Boolean? = null
    @SerializedName("contentVersion")
    @Expose
    private var contentVersion: String? = null
    @SerializedName("panelizationSummary")
    @Expose
    private var panelizationSummary: PanelizationSummary? = null
    @SerializedName("imageLinks")
    @Expose
    private var imageLinks: ImageLinks? = null
    @SerializedName("language")
    @Expose
    private var language: String? = null
    @SerializedName("previewLink")
    @Expose
    private var previewLink: String? = null
    @SerializedName("infoLink")
    @Expose
    private var infoLink: String? = null
    @SerializedName("canonicalVolumeLink")
    @Expose
    private var canonicalVolumeLink: String? = null
    @SerializedName("pageCount")
    @Expose
    private var pageCount: Int? = null
    @SerializedName("categories")
    @Expose
    private var categories: List<String>? = null
    @SerializedName("averageRating")
    @Expose
    private var averageRating: Double? = null
    @SerializedName("ratingsCount")
    @Expose
    private var ratingsCount: Int? = null

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getSubtitle(): String? {
        return subtitle
    }

    fun setSubtitle(subtitle: String) {
        this.subtitle = subtitle
    }

    fun getAuthors(): List<String>? {
        return authors
    }

    fun setAuthors(authors: List<String>) {
        this.authors = authors
    }

    fun getPublisher(): String? {
        return publisher
    }

    fun setPublisher(publisher: String) {
        this.publisher = publisher
    }

    fun getPublishedDate(): String? {
        return publishedDate
    }

    fun setPublishedDate(publishedDate: String) {
        this.publishedDate = publishedDate
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getIndustryIdentifiers(): List<IndustryIdentifier>? {
        return industryIdentifiers
    }

    fun setIndustryIdentifiers(industryIdentifiers: List<IndustryIdentifier>) {
        this.industryIdentifiers = industryIdentifiers
    }

    fun getReadingModes(): ReadingModes? {
        return readingModes
    }

    fun setReadingModes(readingModes: ReadingModes) {
        this.readingModes = readingModes
    }

    fun getPrintType(): String? {
        return printType
    }

    fun setPrintType(printType: String) {
        this.printType = printType
    }

    fun getMaturityRating(): String? {
        return maturityRating
    }

    fun setMaturityRating(maturityRating: String) {
        this.maturityRating = maturityRating
    }

    fun getAllowAnonLogging(): Boolean? {
        return allowAnonLogging
    }

    fun setAllowAnonLogging(allowAnonLogging: Boolean?) {
        this.allowAnonLogging = allowAnonLogging
    }

    fun getContentVersion(): String? {
        return contentVersion
    }

    fun setContentVersion(contentVersion: String) {
        this.contentVersion = contentVersion
    }

    fun getPanelizationSummary(): PanelizationSummary? {
        return panelizationSummary
    }

    fun setPanelizationSummary(panelizationSummary: PanelizationSummary) {
        this.panelizationSummary = panelizationSummary
    }

    fun getImageLinks(): ImageLinks? {
        return imageLinks
    }

    fun setImageLinks(imageLinks: ImageLinks) {
        this.imageLinks = imageLinks
    }

    fun getLanguage(): String? {
        return language
    }

    fun setLanguage(language: String) {
        this.language = language
    }

    fun getPreviewLink(): String? {
        return previewLink
    }

    fun setPreviewLink(previewLink: String) {
        this.previewLink = previewLink
    }

    fun getInfoLink(): String? {
        return infoLink
    }

    fun setInfoLink(infoLink: String) {
        this.infoLink = infoLink
    }

    fun getCanonicalVolumeLink(): String? {
        return canonicalVolumeLink
    }

    fun setCanonicalVolumeLink(canonicalVolumeLink: String) {
        this.canonicalVolumeLink = canonicalVolumeLink
    }

    fun getPageCount(): Int? {
        return pageCount
    }

    fun setPageCount(pageCount: Int?) {
        this.pageCount = pageCount
    }

    fun getCategories(): List<String>? {
        return categories
    }

    fun setCategories(categories: List<String>) {
        this.categories = categories
    }

    fun getAverageRating(): Double? {
        return averageRating
    }

    fun setAverageRating(averageRating: Double?) {
        this.averageRating = averageRating
    }

    fun getRatingsCount(): Int? {
        return ratingsCount
    }

    fun setRatingsCount(ratingsCount: Int?) {
        this.ratingsCount = ratingsCount
    }

}