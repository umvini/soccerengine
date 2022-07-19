package mock.player

import mock.NameMock
import models.enums.Position
import models.player.Player
import utils.Utils

class MockPlayers {
    companion object {
        const val MIN_NUM_PLAYERS = 11
        const val MAX_NUM_PLAYERS = 23
        const val MIN_AGE_PLAYERS = 17
        const val MAX_AGE_PLAYERS = 45
        const val MAX_INT_GOAL_KEEPER_ = 3
    }

    fun getMockPlayers(numPlayers: Int = MIN_NUM_PLAYERS): ArrayList<Player>{
        val _numPlayers = if (numPlayers in MIN_NUM_PLAYERS..MAX_NUM_PLAYERS) numPlayers else (MIN_NUM_PLAYERS..MAX_NUM_PLAYERS).random()

        return createMockPlayers(_numPlayers)
    }

    private fun createMockPlayers(numPlayers: Int): ArrayList<Player>{
        val mockPlayers: ArrayList<Player> = ArrayList()

        val nameMock = NameMock()
        for (i in 1..numPlayers) {
            when (i) {
                1 -> { //GOAL-KEEPER
                    mockPlayers.add(
                        Player(
                            name = nameMock.getName(),
                            lastName = nameMock.getLastName(),
                            position = Position.GK,
                            rating = Utils().getIntRandomNumber(minNum = 50)
                        )
                    )
                }
                in 2..5 -> { // DEFENDER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.D.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.T.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
                in 6..9 -> { // MIDFIELDER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.M.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.T.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
                in 10..11 -> { // ATTACKER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.A.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.T.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
                in 12..13 -> { //SUB GOAL-KEEPER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.G.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.S.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until MAX_INT_GOAL_KEEPER_).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until MAX_INT_GOAL_KEEPER_).random()].name)) //Second Characteristic
                }
                in 14..15 -> { //SUB DEFENDER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.D.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.S.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
                in 16..17 -> { //SUB MIDFIELDER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.M.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.S.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
                in 18..19 -> { //SUB ATTACKER
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.A.name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.S.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
                else -> { //OUT PLAYERS
                    mockPlayers.add(arrayListOf(
                        nameMock.getName(), //Name Player
                        Position.values()[(0 until Position.values().size).random()].name, //Position Player
                        Utils().getStringRandomNumber(), //StatAtt Player
                        Utils().getStringRandomNumber(), //statDef Player
                        Status.O.name, //Status Player
                        Nationality.values()[(0 until Nationality.values().size).random()].name, //Nationality or Nationality Player
                        Utils().getStringRandomNumber(minNum = MIN_AGE_PLAYERS, maxNum = MAX_AGE_PLAYERS), //Age Player
                        nameMock.getLastName(), //LastName Player
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name, //First Characteristic
                        PlayerCharacteristic.values()[(0 until PlayerCharacteristic.values().size).random()].name)) //Second Characteristic
                }
            }
        }

        return mockPlayers
    }
}