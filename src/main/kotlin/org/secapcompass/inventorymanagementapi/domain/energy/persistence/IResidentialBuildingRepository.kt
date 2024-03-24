package org.secapcompass.inventorymanagementapi.domain.energy.persistence

interface IResidentialBuildingRepository {

    fun save(building: ResidentialBuildingDao): ResidentialBuildingDao

    fun findBuildingById(id: Long): ResidentialBuildingDao
}