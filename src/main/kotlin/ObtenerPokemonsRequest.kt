import okhttp3.OkHttpClient
import okhttp3.Request

class ObtenerPokemonsRequest {

    class ExceptionEnRed : Exception()

    class ExceptionEnId : Exception()

    companion object {
        fun get(pokemonPrimeroId : Int, pokemonUltimoId : Int): Array<Pokemon> {
            if (pokemonPrimeroId > pokemonUltimoId)
                throw ExceptionEnId()

            val client = OkHttpClient()
            val list = mutableListOf<Pokemon>()
            for (i in pokemonPrimeroId .. pokemonUltimoId) {
                val request = Request.Builder()
                    .url("https://pokeapi.co/api/v2/pokemon/${i}")
                    .build()
                val response = client.newCall(request).execute()

                if (response.isSuccessful) {
                    response.body?.string().let { responseBody ->

                        list.add(gson.fromJson(responseBody, Pokemon::class.java))
                    }

                } else
                    throw ExceptionEnRed()
            }
            return list.toTypedArray()
        }

    }

}