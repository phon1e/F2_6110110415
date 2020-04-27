import java.util.*;

public class PokeballRand {

    public static ArrayList<Ball> getPokemonballs(int num){  
        ArrayList<Ball> balls = new ArrayList<Ball>();
        
        if(num<1){
            return balls;
        }
        int pokeballNum = (int)(Math.random())+2 ;           //rand pokeball
        
        for(int i=0; i<pokeballNum; ++i){
            int type = (int)(Math.random()*2);
            if(type == 0){
                balls.add(new Pokeball("Poke ball"));
            }else if(type == 1){
                balls.add(new Greatball("Great ball"));
            }else if(type == 2){
                balls.add(new Ultraball("Ultra ball"));
            }
        }
        return balls;
    }
}