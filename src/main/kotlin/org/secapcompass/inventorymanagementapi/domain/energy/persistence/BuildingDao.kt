package org.secapcompass.inventorymanagementapi.domain.energy.persistence

import jakarta.persistence.Embedded
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.secapcompass.inventorymanagementapi.domain.energy.vo.Address

@MappedSuperclass
abstract class BuildingDao(
    val name: String,

    @Embedded
    val address: Address
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
