package mock.team

import mock.NameMock
import mock.team.stadium.MockStadium
import models.team.PlayingStyle
import models.team.Team
import utils.Randoms

class MockTeam {

    companion object {
        const val MIN_NUM_TEAMS = 1
        const val MAX_NUM_TEAMS = 32
    }

    fun getMockTeam(): Team = createMockTeams()[0]

    fun getMockTeams(numTeam: Int = MIN_NUM_TEAMS): ArrayList<Team> {
        val _numTeam = if (numTeam in MIN_NUM_TEAMS..MAX_NUM_TEAMS) numTeam else (MIN_NUM_TEAMS..MAX_NUM_TEAMS).random()

        return createMockTeams(_numTeam)
    }

    private fun createMockTeams(numberTeams: Int = 1): ArrayList<Team>{
        val mockTeams: ArrayList<Team> = ArrayList()

        val nameMock = NameMock()
        for (i in 1..numberTeams) {
            mockTeams.add(
                Team(
                    name = nameMock.getTeamName(),
                    formation = Randoms().getRandomItemFromAnyEnum(),
                    playingStyle = PlayingStyle().randomPlayingStyle(),
                    players = ,
                    stadium = MockStadium().getMockStadium()
                )
            )
        }

        return mockTeams
    }
}