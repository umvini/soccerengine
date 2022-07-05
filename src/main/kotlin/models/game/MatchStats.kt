package models.game

import models.player.Players

class MatchStats (
    val goals: Int,
    val shots: Int,
    val shotsOnTarget: Int,
    val possession: Int,
    val passes: Int,
    val passesAccuracy: Int,
    val fouls: Int,
    val yellowCards: ArrayList<Players>,
    val redCards: ArrayList<Players>,
    val offsides: Int,
    val corners: Int
)