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

    /********************Método pokemonMasGordosQue*******************/
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



    public Pokemon[] getPokemonMasGordo() {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0, j = 0;
        long aux=0;
        int weight[] = new int[arrayPokemons.length];
        for (Pokemon pokemon : arrayPokemons) {
            weight[j]= (int) pokemon.getWeight();
            j++;
            if (peso[j]<peso[j-1])
                aux=peso[j];

            if (pokemon.getWeight() > peso) {
                out[i] = pokemon;
                i++;
            }

        }
        //Probar con systemarraycopy

        // TODO

    }




    /*******************EJERCICIOS******************/
    public Pokemon[] getPokemonMenosGordo(int peso) {

        // TODO

    }

    public Pokemon[] getPokemonPesoEntre(int pesoMaximo, int pesoMinimo) { // pesoMaximo y pesoMinimo no incluidos

        // TODO

    }

    public Pokemon[] getPokemonNombreMasLargoQue(int peso) {

        // TODO

    }

    public Pokemon[] getPokemonNombreMasCortoQue(int longitud) {

        // TODO

    }

    public Pokemon[] getPokemonConLetras(String letras)  {

    } // Atención, esta operación debe devolver un array de pokemons vacio si letras fuera null.










}

