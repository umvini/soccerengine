package mock.team.stadium

import mock.NameMock
import models.team.stadium.Stadium
import utils.Randoms

class MockStadium {

    fun getMockStadium(): Stadium = createMockStadium()[0]

    fun createMockStadium(numberStadiums: Int = 1): ArrayList<Stadium> {
        val mockStadiums: ArrayList<Stadium> = ArrayList()

        val nameMock = NameMock()
        for (i in 1..numberStadiums) {
            mockStadiums.add(
                Stadium(
                    name = "${nameMock.getTeamName()} Stadium",
                    regions = MockStadiumRegions().createMockStadiumRegions(enum = Randoms().getRandomItemFromAnyEnum()),
                    nationality = Randoms().getRandomItemFromAnyEnum()
                )
            )
        }

        return mockStadiums
    }
}