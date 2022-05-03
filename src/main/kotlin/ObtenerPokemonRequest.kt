import okhttp3.OkHttpClient
import okhttp3.Request

class ObtenerPokemonRequest {

    companion object {
        fun get(pokemonId : Int): Pokemon {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/${pokemonId}")
                .build()
            val response = client.newCall(request).execute()

            if (response.isSuccessful) {
                response.body?.string().let { responseBody ->
                    return gson.fromJson(responseBody, Pokemon::class.java)
                }

            } else
                throw ObtenerPokemonsRequest.ExceptionEnRed()
        }

        fun get(pokemonName : String): Pokemon {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/${pokemonName}")
                .build()
            val response = client.newCall(request).execute()

            if (response.isSuccessful) {
                response.body?.string().let { responseBody ->
                    return gson.fromJson(responseBody, Pokemon::class.java)
                }

            } else
                throw ObtenerPokemonsRequest.ExceptionEnRed()
        }
    }
}