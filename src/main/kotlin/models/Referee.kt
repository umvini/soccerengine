package models

import models.enums.Nationality
import java.util.UUID

class Referee(
    val uuid: String = UUID.randomUUID().toString(),
    var name: String,
    var nationality: Nationality,
    var personality: Int
)
