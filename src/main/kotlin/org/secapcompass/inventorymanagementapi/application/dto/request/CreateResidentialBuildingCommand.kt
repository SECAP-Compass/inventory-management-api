package org.secapcompass.inventorymanagementapi.application.dto.request

import org.secapcompass.inventorymanagementapi.domain.energy.vo.Address

data class CreateResidentialBuildingCommand(
    val name: String, val address: Address
)
