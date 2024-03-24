package org.secapcompass.inventorymanagementapi.domain.energy.vo

import jakarta.persistence.Embeddable

@Embeddable
data class Address(
    val province: String,
    val district: String,
    val street: String,
    val buildingNumber: Int,
    val indoorNumber: Int,
    val zipCode: String
) {

    constructor() : this("", "","", -1, -1, "") {}
}
