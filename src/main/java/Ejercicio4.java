public class Ejercicio4 {

    public Pokemon[] arrayPokemons = new Pokemon[0];

    public void iniciarEjercicio4() {
        System.out.println("Empezando el ej4");
        for (Pokemon pokemon : arrayPokemons) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de pokemonMasGordoQue");
        Pokemon[] result = pokemonMasGordosQue(225);
        for (Pokemon pokemon : result) {
            System.out.println(pokemon);
        }
    }


    public Pokemon[] pokemonMasGordosQue(Integer peso) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0, j = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() > peso) {
                out[i] = pokemon;
                i++;
            }
        }

        Pokemon[] outWithoutNull = new Pokemon[i];
        i=0;
        for (j=0;j<=outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;
    }

}

