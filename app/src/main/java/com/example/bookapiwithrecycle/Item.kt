package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Item {

    @SerializedName("kind")
    @Expose
    private var kind: String? = null
    @SerializedName("id")
    @Expose
    private var id: String? = null
    @SerializedName("etag")
    @Expose
    private var etag: String? = null
    @SerializedName("selfLink")
    @Expose
    private var selfLink: String? = null
    @SerializedName("volumeInfo")
    @Expose
    private var volumeInfo: VolumeInfo? = null
    @SerializedName("saleInfo")
    @Expose
    private var saleInfo: SaleInfo? = null
    @SerializedName("accessInfo")
    @Expose
    private var accessInfo: AccessInfo? = null
    @SerializedName("searchInfo")
    @Expose
    private var searchInfo: SearchInfo? = null

    fun getKind(): String? {
        return kind
    }

    fun setKind(kind: String) {
        this.kind = kind
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getEtag(): String? {
        return etag
    }

    fun setEtag(etag: String) {
        this.etag = etag
    }

    fun getSelfLink(): String? {
        return selfLink
    }

    fun setSelfLink(selfLink: String) {
        this.selfLink = selfLink
    }

    fun getVolumeInfo(): VolumeInfo? {
        return volumeInfo
    }

    fun setVolumeInfo(volumeInfo: VolumeInfo) {
        this.volumeInfo = volumeInfo
    }

    fun getSaleInfo(): SaleInfo? {
        return saleInfo
    }

    fun setSaleInfo(saleInfo: SaleInfo) {
        this.saleInfo = saleInfo
    }

    fun getAccessInfo(): AccessInfo? {
        return accessInfo
    }

    fun setAccessInfo(accessInfo: AccessInfo) {
        this.accessInfo = accessInfo
    }

    fun getSearchInfo(): SearchInfo? {
        return searchInfo
    }

    fun setSearchInfo(searchInfo: SearchInfo) {
        this.searchInfo = searchInfo
    }

}