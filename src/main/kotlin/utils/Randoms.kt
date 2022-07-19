package utils

class Randoms {
    inline fun <reified T : Enum<T>> getRandomItemFromAnyEnum(): T  {
        return enumValues<T>()[(0 until enumValues<T>().size).random()]
    }
}