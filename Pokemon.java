import java.io.*;
import java.lang.Math;
import java.util.*;

class Pokemon{
    //Base on Pokemon sword and shield ,2020 ,nintendo switch
    private String;
    protected String name;
    private String[] type = {"Bug", "Dark", "Dragon", "Electric", "Fairy", "Fighting", "Fire", "Flying", "Ghost", "Grass", "Ground", "Ice", "Normal", "Poison", "Psychic", "Rock", "Steel", "Water"};
    private int id,lv, hp, atk, def, speed, exp, expMax;

    public Pokemon(){//Dynamic Constructor

    }

    public Pokemon(int id, String name){// default Constructor of stat
        this.id = id;
        this.name = name;
        this.lv = 1;
        this.hp = 10 + (int)(Math.random()*10); // min + rand*(max-min) randLength
        this.atk = 5 + (int)(Math.random()*7);
        this.def = 1 + (int)(Math.random()*7);
        this.speed = 1 + (int)(Math.random()*5);
        this.expMax = 5;
        this.exp = 0;
    }
    //Method
    public void setID(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void lvUp(){ 
        System.out.printf("\nLV UP!! %d=>%d\n",lv,lv+1);
        lv++;
        hp += 1 + (int)(Math.random()*4);;
        atk += 1 + (int)(Math.random()*4);;
        def += 1 + (int)(Math.random()*4);;
        speed += 1 + (int)(Math.random()*4);;
        expMax+=5;
        displayPokemon();
    }

    public void rareCandy(){
        System.out.printf("-------------RARE CANDY!!-------------\n");
        for(int i=1; i<=expMax; i++){
            exp++;
        }
            lvUp();
    }
    
    public void displayPokemon(){
        System.out.println("\n-------------STATUS-------------");
        System.out.println("ID = " + this.id);
        System.out.println("Name = "+ this.name);
        System.out.println("LV = " + this.lv);
        System.out.println("maxHP = " + this.hp);
        System.out.println("Atk = "+ this.atk);
        System.out.println("Def = "+ this.def );
        System.out.println("Speed = "+ this.speed );
        System.out.printf("exp = %d / %d\n",this.exp, this.expMax );
    }

}

class Eevee extends Pokemon{
   
}
