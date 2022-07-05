package models.enums

enum class Position(val desc: String) {
    GK("goal-keeper"), // Goalkeeper
    CB("center-back"), LB("left-back"), RB("right-back"), // Defenders/Backs
    DM("defensive-midfielder"), CM("central-midfielder"), AM("attacking-midfielder "), // Midfield
    CF("center-forward"), ST("Striker"), SA("second-striker") // Attackers
}
//    New Positions
//    LWB("left-wing-back"), RWB("right-wing-back"),
//    LM("right-midfielder"), RM("right-midfielder"),
