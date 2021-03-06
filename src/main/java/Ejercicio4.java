public class Ejercicio4 {

    public Pokemon[] arrayPokemons = new Pokemon[0];

    public void iniciarEjercicio4() {
        System.out.println("Empezando el ej4");
        for (Pokemon pokemon : arrayPokemons) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de pokemonMasGordoQue");
        Pokemon[] resultadoEj1 = pokemonMasGordosQue(225);
        for (Pokemon pokemon : resultadoEj1) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de pokemonMenosGordoQue");
        Pokemon[] resultadoEj2 = pokemonMenosGordosQue(225);
        for (Pokemon pokemon : resultadoEj2) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de pokemonBetween");
        Pokemon[] resultadoEj3 = getPokemonPesoEntre(800,150);
        for (Pokemon pokemon : resultadoEj3) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de getPokemonNombreMasLargoQue");
        Pokemon[] resultadoEj4 = getPokemonNombreMasLargoQue(8);
        for (Pokemon pokemon : resultadoEj4) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de getPokemonNombreMasCortoQue");
        Pokemon[] resultadoEj5 = getPokemonNombreMasCortoQue(8);
        for (Pokemon pokemon : resultadoEj5) {
            System.out.println(pokemon);
        }

        System.out.println("Resultado de getPokemonQueContengaLasSiguientesLetras");
        Pokemon[] resultadoEj6 = getPokemonQueContengaLasSiguientesLetras("ab");
        for (Pokemon pokemon : resultadoEj6) {
            System.out.println(pokemon);
        }

    }

    /*****************************Método pokemonMasGordosQue**************************/
    public Pokemon[] pokemonMasGordosQue(Integer peso) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() > peso) {
                out[i] = pokemon;
                i++;
            }
        }

        //TODO probar con el copy Array of, a ver si sale.

        /*
        if (i==9) {
            Pokemon[] outWithoutNull = new Pokemon[i + 1];
        }*/
        Pokemon[] outWithoutNull = new Pokemon[i];
        for (int j=0;j<outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;
    }



    /*****************************Método pokemonMenosGordosQue************************/
    /**
     * @param peso
     * @return
     */
    public Pokemon[] pokemonMenosGordosQue(Integer peso) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() < peso) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] outWithoutNull = new Pokemon[i];
        for (int j=0;j<=outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;
    }

    /*****************************Método getPokemonPesoEntre*************************/
    public Pokemon[] getPokemonPesoEntre(int pesoMaximo, int pesoMinimo) { // pesoMaximo y pesoMinimo no incluidos
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() < pesoMaximo && pokemon.getWeight() > pesoMinimo) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] outWithoutNull = new Pokemon[i];
        for (int j=0;j<=outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;
    }

    /*****************************Método getPokemonNombreMasLargoQue*************************/
    //si hay uno menor de 7 letras da error porque no encuentra ninguno.
    public Pokemon[] getPokemonNombreMasLargoQue(int longitud) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getName().length() > longitud) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] outWithoutNull = new Pokemon[i];
        for (int j=0;j<=outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;
    }

    /*****************************Método getPokemonNombreMasCortoQue*************************/
    public Pokemon[] getPokemonNombreMasCortoQue(int longitud) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getName().length() < longitud) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] outWithoutNull = new Pokemon[i];
        for (int j=0;j<=outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;
    }

    /********************MÉTODO getPokemonQueContengaLasSiguientesLetras**********************/
    public Pokemon[] getPokemonQueContengaLasSiguientesLetras(String letras)  {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            char [] arrayLetras = letras.toCharArray();

            boolean encontrado = true;
            for (char letra : arrayLetras) {
                if (pokemon.getName().contains(String.valueOf(letra))) { //pongo ""+char para pasarlo a String
                    encontrado = false;
                    break;
                }
            }
            if(encontrado) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] outWithoutNull = new Pokemon[i];
        for (int j=0;j<=outWithoutNull.length;j++) {
            if(out[j]!=null) {
                outWithoutNull[j] = out[j];
            }
        }
        return outWithoutNull;

    } // Atención, esta operación debe devolver un array de pokemons vacio si letras fuera null.

    // No hay que tener en cuenta el orden
    /*
FIN EJERCICIOS
*******************************************/
}
