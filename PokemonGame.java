import java.util.*;
import java.io.*;

public class PokemonGame{                               //6110110415
    public static void main(String[] args){
        System.out.println("WELCOME TO Phonie's POKEMON GAME ! !");
        Trainer t = new Trainer("Phonie");
        new mainGame(t);              // activate GUI
        //t.play();                       // play game
        System.out.println("End");
    
    }
}
