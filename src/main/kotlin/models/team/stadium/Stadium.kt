package models.team.stadium

import models.enums.Nationality
import java.util.UUID

class Stadium(
    var uuid: String,
    var regions: StadiumRegions,
    var totalCapacity: Int = 0,
    var nationality: Nationality
) {

    constructor(uuid: String, regions: StadiumRegions, nationality: Nationality) : this (
        uuid = uuid,
        regions = regions,
        totalCapacity = regions.sumNumberSeats(),
        nationality = nationality
    )

    constructor(general: Int, bleachers: Int, cabin: Int, chair: Int, nationality: Nationality) : this (
        uuid = UUID.randomUUID().toString(),
        regions = StadiumRegions(general, bleachers, cabin, chair),
        totalCapacity = StadiumRegions(general, bleachers, cabin, chair).sumNumberSeats(),
        nationality = nationality
    )
}