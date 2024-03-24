package org.secapcompass.inventorymanagementapi.domain

data class Measurement<T: Number>(val quantity: Quantity<T>, val period: Period, val timestamp: Long)
