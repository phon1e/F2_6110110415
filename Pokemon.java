import java.io.*;
import java.lang.Math;
import java.util.*;

public abstract class Pokemon{
    protected String name;
    protected int id, lv, hp, atk, def, speed, exp, expMax, catchR;
  

    public Pokemon(String name){// default Constructor of stat          //cnostruct
        this.name = name;
        this.hp= 10+ (int)(Math.random()*100)+10;
        this.lv = 1;
        this.atk = 5 + (int)(Math.random()*7);
        this.def = 1 + (int)(Math.random()*7);
        this.speed = 1 + (int)(Math.random()*5);
        this.expMax = 5;
        this.exp = 0;
    }

    public Pokemon(String name, int maxHP){//Dynamic Constructor
     
    }

    //Method
    public boolean damage(int value){                   //dmg calculation func
        int curHP = hp - value;
        if(curHP == 0)
            return false;
        
        if(curHP>= 0)
            this.hp = curHP;
        else
            this.hp = 0;
            return true;
    }

    public String getName(){        //get name
        return  name;
    }

    public String toString(){           //get name from magic text wwwww
        return name;
    }
    
    public int getHp(){                 //get hp
        return  hp;
    }

    public abstract void attack(Pokemon enemy);

    public void lvUp(){                             //level up func
        System.out.printf("\nLV UP!! %d=>%d\n",lv,lv+1);
        lv++;
        hp += 1 + (int)(Math.random()*4);;
        atk += 1 + (int)(Math.random()*4);;
        def += 1 + (int)(Math.random()*4);;
        speed += 1 + (int)(Math.random()*4);;
        expMax+=5;
    }
    
}