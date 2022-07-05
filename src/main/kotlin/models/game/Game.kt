package models.game

import models.Referee
import models.team.Team
import models.team.stadium.Stadium

class Game(
    var homeTeam: Team,
    var homeMatchStats: MatchStats,
    var awayTeam: Team,
    var awayMatchStats: MatchStats,
    val referee: Referee,
    val staduim: Stadium
) {

}