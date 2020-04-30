import java.io.*;
import java.lang.Math;
import java.util.*;

public class Rattata extends Pokemon{
    public Rattata(String name){
        super(name);                                //name
        hp =10+ (int)(Math.random()*100)+30;        // hp
        catchR = 10;
    }
    
    public void attack(Pokemon enemy){
        System.out.println(" Pokemon " + name + " attack " + enemy.getName()+" enemy hp =" + enemy.getHp());        //damage
        enemy.damage(10);
    }
}