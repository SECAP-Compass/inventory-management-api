package org.secapcompass.inventorymanagementapi.domain.energy.entity

import org.secapcompass.inventorymanagementapi.domain.Measurement
import org.secapcompass.inventorymanagementapi.domain.energy.vo.Address
import java.math.BigDecimal

abstract class Building(
    val id: Long? = null,
    var name: String,
    val address: Address
) {

    abstract fun getEnergyConsumption(): Measurement<BigDecimal>
    abstract fun getEnergyProduction(): Measurement<BigDecimal>
    abstract fun getGasEmission(): Measurement<BigDecimal>
}