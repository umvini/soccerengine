package models.player

import models.enums.Position
import java.util.UUID

class Player(
    val uuid: String = UUID.randomUUID().toString(),
    var name: String,
    var lastName: String,
    var position: Position,
    var rating: Int,
    var skill: Skills,
    var fitness: String,
    var injured: Injured? = null,
)