package org.secapcompass.inventorymanagementapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InventoryManagementApiApplication

fun main(args: Array<String>) {
    runApplication<InventoryManagementApiApplication>(*args)
}
