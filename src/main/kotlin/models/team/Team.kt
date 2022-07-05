package models.team

import models.enums.Formation
import models.player.Players
import models.team.stadium.Stadium
import java.util.UUID

class Team(
    val uuid: String = UUID.randomUUID().toString(),
    var name: String,
    var formation: Formation,
    var playingStyle: PlayingStyle,
    var players: Players,
    var stadium: Stadium
)