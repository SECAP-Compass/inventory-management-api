package org.secapcompass.inventorymanagementapi.domain.energy.persistence

import jakarta.persistence.Entity
import org.secapcompass.inventorymanagementapi.domain.energy.entity.ResidentialBuilding
import org.secapcompass.inventorymanagementapi.domain.energy.vo.Address

@Entity(name = "residential_building")
class ResidentialBuildingDao(name: String, address: Address) : BuildingDao(name, address) {

    constructor(residentialBuilding: ResidentialBuilding)
            : this(residentialBuilding.name, residentialBuilding.address) {
    }
}

fun ResidentialBuildingDao.toResidentialBuilding() = ResidentialBuilding(this)