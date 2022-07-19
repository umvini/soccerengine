package models.team.stadium

import models.enums.Nationality
import java.util.UUID

class Stadium(
    var uuid: String,
    var name: String,
    var regions: StadiumRegions,
    var totalCapacity: Int = 0,
    var nationality: Nationality
) {

    constructor(name: String, regions: StadiumRegions, nationality: Nationality) : this (
        uuid = UUID.randomUUID().toString(),
        name = name,
        regions = regions,
        totalCapacity = regions.sumNumberSeats(),
        nationality = nationality
    )

    constructor(name: String, general: Int, bleachers: Int, cabin: Int, chair: Int, nationality: Nationality) : this (
        uuid = UUID.randomUUID().toString(),
        name = name,
        regions = StadiumRegions(general, bleachers, cabin, chair),
        totalCapacity = StadiumRegions(general, bleachers, cabin, chair).sumNumberSeats(),
        nationality = nationality
    )
}