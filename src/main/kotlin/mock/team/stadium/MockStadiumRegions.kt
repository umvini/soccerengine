package mock.team.stadium

import models.team.stadium.StadiumRegions
import utils.Utils

class MockStadiumRegions {

    enum class SizeStadiumRegions {
        VERY_SMALL, SMALL, MEDIUM, LARGE, VERY_LARGE
    }

    fun createMockStadiumRegions(enum: SizeStadiumRegions): StadiumRegions {
        return when (enum) {
            SizeStadiumRegions.VERY_SMALL -> {
                StadiumRegions(
                    general = Utils().getIntRandomNumber(minNum = 1800, maxNum = 3600),
                    bleachers = Utils().getIntRandomNumber(minNum = 8000, maxNum = 16000),
                    cabin = Utils().getIntRandomNumber(minNum = 7000, maxNum = 140),
                    chair = Utils().getIntRandomNumber(minNum = 900, maxNum = 1800)
                )
            }

            SizeStadiumRegions.SMALL -> {
                StadiumRegions(
                    general = Utils().getIntRandomNumber(minNum = 3600, maxNum = 7200),
                    bleachers = Utils().getIntRandomNumber(minNum = 16000, maxNum = 32000),
                    cabin = Utils().getIntRandomNumber(minNum = 140, maxNum = 280),
                    chair = Utils().getIntRandomNumber(minNum = 1800, maxNum = 3600)
                )
            }

            SizeStadiumRegions.MEDIUM -> {
                StadiumRegions(
                    general = Utils().getIntRandomNumber(minNum = 7200, maxNum = 10800),
                    bleachers = Utils().getIntRandomNumber(minNum = 32000, maxNum = 48000),
                    cabin = Utils().getIntRandomNumber(minNum = 280, maxNum = 420),
                    chair = Utils().getIntRandomNumber(minNum = 3600, maxNum = 5400)
                )
            }

            SizeStadiumRegions.LARGE -> {
                StadiumRegions(
                    general = Utils().getIntRandomNumber(minNum = 10800, maxNum = 14400),
                    bleachers = Utils().getIntRandomNumber(minNum = 48000, maxNum = 64000),
                    cabin = Utils().getIntRandomNumber(minNum = 420, maxNum = 560),
                    chair = Utils().getIntRandomNumber(minNum = 5400, maxNum = 7200)
                )
            }
            SizeStadiumRegions.VERY_LARGE -> {
                StadiumRegions(
                    general = Utils().getIntRandomNumber(minNum = 14400 , maxNum = 18000),
                    bleachers = Utils().getIntRandomNumber(minNum = 64000, maxNum = 80000),
                    cabin = Utils().getIntRandomNumber(minNum = 560, maxNum = 700),
                    chair = Utils().getIntRandomNumber(minNum = 7200, maxNum = 9000)
                )
            }

        }
    }
}