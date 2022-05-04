import com.google.gson.Gson

var gson = Gson()

class PokemonInvalido : Exception()

fun main() {
    val pokemon1 = ObtenerPokemonRequest.get(1)
    val pokemon2 = ObtenerPokemonRequest.get(1)

}


/**
 *  Esta función utiliza las varialbes pokemon1 y pokemon2 para calcular que ponemos gana en una pelea
 *  @return al pokemon ganador
 */
fun pelea(pokemon1: Pokemon?, pokemon2: Pokemon?): Pokemon? {
    if (pokemon2 == null || pokemon1 == null) throw PokemonInvalido()
    return when {
        pokemon1.weight > pokemon2.weight -> pokemon1
        pokemon1.weight < pokemon2.weight -> pokemon2
        else -> null
    }
}