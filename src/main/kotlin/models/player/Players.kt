package models.player

import models.enums.Position
import java.util.UUID

class Players(
    val uuid: String = UUID.randomUUID().toString(),
    var name: String,
    var position: Position,
    var rating: Int,
    var skill: Skills,
    var fitness: String,
    var injured: Injured,
)