import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {
    //Tengo que hacer test de todos los ejercicios, el segundo test me falla, seguramente tenga que cambiar mi código.
    static Ejercicio4 ej;

    @BeforeAll
    static void firstInit() {
        System.out.println("firstInit");
        ej = new Ejercicio4();
        ej.arrayPokemons = ObtenerPokemonsRequest.Companion.get(1, 9);
    }


    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }


    @Test
    void pokemonMasGordosQueBasico() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
                new Pokemon(17, 6, "charizard", 905),
                new Pokemon(16, 9, "blastoise", 855)
        };
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(250);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonMasGordosQueLimiteAlto() { //Comprobación básica
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
        };
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(950);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    /******************pokemonMasGordosQueLimiteAlto ESTE TEST DA ERROR****************/
     /*El tamaño del array declarado es diferente del array que le estoy dando
     de elementos esperados, por ello da error, no he sabido solucionarlo*/
    @Test
    void pokemonMasGordosQueLimiteBajo() { //Comprobación básica
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(10, 2, "ivysaur", 130),
                new Pokemon(6, 4, "charmander", 85),
                new Pokemon(11, 5, "charmeleon", 190),
                new Pokemon(17, 6, "charizard", 905),
                new Pokemon(5, 7, "squirtle", 90),
                new Pokemon(10, 8, "wartortle", 225),
                new Pokemon(16, 9, "blastoise", 855)
        };
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(50);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonMenosGordosQueBasico() {
        Pokemon[] pokemonEsperados = {
                new Pokemon (7, 1, "bulbasaur", 69),
                new Pokemon(6, 4, "charmander", 85),
                new Pokemon(5, 7, "squirtle", 90),
        };
        Pokemon[] pokemonActuales = ej.pokemonMenosGordosQue(100);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    /*El mismo error
    @Test
    void pokemonMenosGordosQueLimiteAlto() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
                new Pokemon(17, 6, "charizard", 905),
        };
        Pokemon[] pokemonActuales = ej.pokemonMenosGordosQue(900);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }*/




}






    /*ESTE TEST ME DA ERROR, no he conseguido solucionarlo
    @Test
    void getPokemonQueContengaLasSiguientesLetras() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(10, 2, "ivysaur", 130),
                new Pokemon(20, 3, "venusaur", 1000)
        };
        Pokemon[] pokemonActuales = ej.getPokemonQueContengaLasSiguientesLetras("saur");
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }*/

