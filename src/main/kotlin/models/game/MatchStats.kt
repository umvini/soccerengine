package models.game

import models.player.Player

class MatchStats (
    val goals: Int,
    val shots: Int,
    val shotsOnTarget: Int,
    val possession: Int,
    val passes: Int,
    val passesAccuracy: Int,
    val fouls: Int,
    val yellowCards: ArrayList<Player>,
    val redCards: ArrayList<Player>,
    val offsides: Int,
    val corners: Int
)