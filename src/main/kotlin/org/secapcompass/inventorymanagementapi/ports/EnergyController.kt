package org.secapcompass.inventorymanagementapi.ports

import org.secapcompass.inventorymanagementapi.application.EnergyService
import org.secapcompass.inventorymanagementapi.application.dto.request.CreateResidentialBuildingCommand
import org.secapcompass.inventorymanagementapi.domain.energy.persistence.ResidentialBuildingDao
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping ("energy")
class EnergyController(
    private val energyService: EnergyService
) {

    @PostMapping("/residentialBuilding")
    fun createResidentialBuilding(@RequestBody command: CreateResidentialBuildingCommand): ResidentialBuildingDao =
        energyService.createResidentialBuilding(command)

    @GetMapping("/residentialBuilding/{id}")
    fun getResidentialBuilding(@PathVariable id: Long) = energyService.getResidentialBuildingById(id)
}