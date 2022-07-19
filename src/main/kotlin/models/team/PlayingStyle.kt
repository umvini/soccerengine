package models.team

import models.enums.Marking
import models.enums.Style
import utils.Randoms

class PlayingStyle(
    val marking: Marking = Randoms().getRandomItemFromAnyEnum(),
    val style: Style = Randoms().getRandomItemFromAnyEnum()
) {
    fun randomPlayingStyle(): PlayingStyle {
        return PlayingStyle(
            marking = Randoms().getRandomItemFromAnyEnum(),
            style = Randoms().getRandomItemFromAnyEnum()
        )
    }
}