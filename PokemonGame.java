import java.io.*;

public class PokemonGame{
    public static void main(String[] args){
        Pokemon p1 = new Pokemon("Eevee", 1, 12, 6, 6, 6); //ID LV HP Atk Def Speed
        p1.displayPokemon();
        Pokemon p2 = new Pokemon("Pikachu",1, 10, 5, 5, 5);
        p2.displayPokemon();
    }
}
