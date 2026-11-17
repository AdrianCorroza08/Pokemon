import java.util.Random;
/**
 * Clase principal de la aplicación. Crea dos pokemon, un combate entre
 * ellos y lo comienza.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PokemonApp
{
    public static void main(String[] args){
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;
        
        Random random = new Random();
        
        Combate combate = new Combate(pokemon1, pokemon2);
        combate.comenzar();
    }
}
