import java.io.*;
import java.lang.Math;
import java.util.*;

public class Evee extends Pokemon{
    public Evee(String name){
        super(name);
        hp =10+ (int)(Math.random()*100)+10;

    }
  

    public void attack(Pokemon enemy){
        System.out.println("Pokemon" + name + " attack " + enemy.getName() +" enemy hp =" + enemy.getHp());
        enemy.damage(10);
    }
}