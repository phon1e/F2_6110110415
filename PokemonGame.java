import java.io.*;

public class PokemonGame{
    public static void main(String[] args){
        //Pokemon p1 = new Pokemon(); //ID 
        Eevee p1 = new Eevee();
        p1.setID(01);
        p1.setName("Eevee");
        p1.displayPokemon();
    }
}
