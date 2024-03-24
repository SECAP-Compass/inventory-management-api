package org.secapcompass.inventorymanagementapi.infrastructure.persistence

import org.secapcompass.inventorymanagementapi.domain.energy.persistence.IResidentialBuildingRepository
import org.secapcompass.inventorymanagementapi.domain.energy.persistence.ResidentialBuildingDao
import org.secapcompass.inventorymanagementapi.exceptions.DomainNotFoundException
import org.springframework.data.jpa.repository.JpaRepository

interface ResidentialBuildingRepository : IResidentialBuildingRepository, JpaRepository<ResidentialBuildingDao, Long> {
    private companion object {
        const val RESIDENTIAL_BUILDING_NOT_FOUND = "residential.building.not.found"
    }

    override fun save(building: ResidentialBuildingDao): ResidentialBuildingDao = save(building)


    override fun findBuildingById(id: Long): ResidentialBuildingDao {
        return findById(id).orElseThrow { DomainNotFoundException(RESIDENTIAL_BUILDING_NOT_FOUND) }
    }
}