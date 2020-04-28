import java.io.*;
import java.lang.Math;
import java.util.*;

public class Pikachu extends Pokemon{
    public Pikachu(String name){
        super(name);                                //name
        hp =10+ (int)(Math.random()*100)+50;        // hp
        catchR = 10;
    }
    

    public void attack(Pokemon enemy){
        System.out.println(" Pokemon " + name + " attack " + enemy.getName()+" enemy hp =" + enemy.getHp());        //damage
        enemy.damage(10);
    }
}