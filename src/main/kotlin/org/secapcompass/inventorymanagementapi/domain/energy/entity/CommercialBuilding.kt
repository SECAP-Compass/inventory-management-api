package org.secapcompass.inventorymanagementapi.domain.energy.entity

import org.secapcompass.inventorymanagementapi.domain.Measurement
import org.secapcompass.inventorymanagementapi.domain.Quantity
import org.secapcompass.inventorymanagementapi.domain.energy.vo.Address
import java.math.BigDecimal

class CommercialBuilding(id: Long, name: String, address: Address) : Building(id, name, address) {
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