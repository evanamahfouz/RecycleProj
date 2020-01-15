package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BookObject {

    @SerializedName("kind")
    @Expose
    private var kind: String? = null
    @SerializedName("totalItems")
    @Expose
    private var totalItems: Int? = null
    @SerializedName("items")
    @Expose
    private var items: List<Item>? = null

    private var it:List<String>?=null
    fun getKind(): String? {
        return kind
    }

    fun setKind(kind: String) {
        this.kind = kind
    }

    fun getTotalItems(): Int? {
        return totalItems
    }

    fun setTotalItems(totalItems: Int?) {
        this.totalItems = totalItems
    }

    fun getItems(): List<Item>? {
        return items
    }

    fun setItems(items: List<Item>) {
        this.items = items
    }

}