import java.util.*;

public class PokemonRand  {

    public static ArrayList<Pokemon> getPokemons(int num){  
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        
        if(num<1){
            return pokemons;
        }
        int pokemonNum = (int)(Math.random()*num)+2 ;           //rand pokemon
        
        for(int i=0; i<pokemonNum; ++i){
            int type = (int)(Math.random()*2);
            if(type == 0){
                pokemons.add(new Pikachu("Wild Pikachu"));
            }else if(type == 1){
                pokemons.add(new Evee("wild Evee"));
            }else if(type == 2){
                pokemons.add(new Raichu("Raichu"));
            }
        }
        return pokemons;
    }
}