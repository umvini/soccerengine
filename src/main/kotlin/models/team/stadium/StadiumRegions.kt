package models.team.stadium

class StadiumRegions(
    val general: Int,
    val bleachers: Int,
    val cabin: Int,
    val chair: Int
) {
    fun sumNumberSeats(): Int {
        return general+bleachers+cabin+chair
    }
}