package mock

import models.Referee
import utils.Randoms
import utils.Utils

class MockReferee {

    companion object {
        const val MIN_NUM_REFEREE = 1
        const val MAX_NUM_REFEREES = Int.MAX_VALUE

        const val MIN_NUM_REFEREE_PERSONALITY = 30
        const val MAX_NUM_REFEREE_PERSONALITY = 80
    }

    fun getMockReferee(): Referee = createMockReferees()[0]

    fun getMockReferees(numReferee: Int = MIN_NUM_REFEREE): ArrayList<Referee> {
        val _numReferees = if (numReferee in MIN_NUM_REFEREE..MAX_NUM_REFEREES) numReferee else (MIN_NUM_REFEREE..MAX_NUM_REFEREES).random()

        return createMockReferees(_numReferees)
    }

    private fun createMockReferees(numberReferees: Int = 1): ArrayList<Referee>{
        val mockReferees: ArrayList<Referee> = ArrayList()

        val nameMock = NameMock()
        for (i in 1..numberReferees) {
            mockReferees.add(
               Referee(
                   name = nameMock.getCompleteName(),
                   nationality = Randoms().getRandomItemFromAnyEnum(),
                   personality = Utils().getIntRandomNumber(
                       minNum = MIN_NUM_REFEREE_PERSONALITY,
                       maxNum = MAX_NUM_REFEREE_PERSONALITY
                   )
               )
            )
        }

        return mockReferees
    }
}