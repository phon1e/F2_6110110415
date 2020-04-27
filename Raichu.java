import java.io.*;
import java.lang.Math;
import java.util.*;

public class Raichu extends Pikachu{
    public Raichu(String name){             //pikachu sub species
        super(name);   
        hp=10+ (int)(Math.random()*100)+10;
    }

    public void attack(Pokemon enemy){
        System.out.println(" Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(200);
    }
}