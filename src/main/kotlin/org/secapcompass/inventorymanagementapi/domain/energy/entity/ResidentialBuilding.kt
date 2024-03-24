package org.secapcompass.inventorymanagementapi.domain.energy.entity

import org.secapcompass.inventorymanagementapi.application.dto.request.CreateResidentialBuildingCommand
import org.secapcompass.inventorymanagementapi.domain.Measurement
import org.secapcompass.inventorymanagementapi.domain.energy.persistence.ResidentialBuildingDao
import org.secapcompass.inventorymanagementapi.domain.energy.vo.Address
import java.math.BigDecimal

class ResidentialBuilding(id: Long? = null, name: String, address: Address)
    : Building(id, name, address) {

    constructor(command: CreateResidentialBuildingCommand) : this(name = command.name, address = command.address)

    constructor(dao: ResidentialBuildingDao) : this(dao.id, dao.name, dao.address)

    override fun getEnergyConsumption(): Measurement<BigDecimal> {
        TODO("Not yet implemented")
    }

    override fun getEnergyProduction(): Measurement<BigDecimal> {
        TODO("Not yet implemented")
    }

    override fun getGasEmission(): Measurement<BigDecimal> {
        TODO("Not yet implemented")
    }
}

fun ResidentialBuilding.toDao() = ResidentialBuildingDao(this)