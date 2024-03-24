package org.secapcompass.inventorymanagementapi.application

import org.secapcompass.inventorymanagementapi.application.dto.request.CreateResidentialBuildingCommand
import org.secapcompass.inventorymanagementapi.domain.energy.entity.ResidentialBuilding
import org.secapcompass.inventorymanagementapi.domain.energy.entity.toDao
import org.secapcompass.inventorymanagementapi.domain.energy.persistence.ResidentialBuildingDao
import org.secapcompass.inventorymanagementapi.infrastructure.persistence.ResidentialBuildingRepository
import org.springframework.stereotype.Service

@Service
class EnergyService(
    private val residentialBuildingRepository: ResidentialBuildingRepository
) {

    fun createResidentialBuilding(command: CreateResidentialBuildingCommand): ResidentialBuildingDao {
        val residentialBuilding = ResidentialBuilding(command)

        // maybe some business logic idk.

        return residentialBuildingRepository.save(residentialBuilding.toDao())
    }

    fun getResidentialBuildingById(id: Long): ResidentialBuildingDao {
        return  residentialBuildingRepository.findBuildingById(id)
    }
}