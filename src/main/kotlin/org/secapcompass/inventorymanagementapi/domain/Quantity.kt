package org.secapcompass.inventorymanagementapi.domain

data class Quantity<T : Number>(val value: T, val unit: String) {

    override fun toString(): String {
        return "$value $unit"
    }
}