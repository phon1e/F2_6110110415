import java.io.*;
import java.lang.Math;
class Pokemon{
    private String id;
    private int lv, hp, atk, def, speed, exp, expMax;

    public Pokemon(String id){// default Constructor of stat
        this.id = id;
        this.lv = 1;
        this.hp = 10 + (int)(Math.random()*10); // min + rand*(max-min) randLength
        this.atk = 5 + (int)(Math.random()*7);
        this.def = 1 + (int)(Math.random()*7);
        this.speed = 1 + (int)(Math.random()*5);
        this.expMax = 5;
        this.exp = 0;
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

    public void train(){
        System.out.printf("-------------Training-------------\n");
        for(int i=1; i<=expMax; i++){
            exp++;
        }
            lvUp();
    }
    
    public void displayPokemon(){
        System.out.println("\n-------------STATUS-------------");
        System.out.println("ID = " + this.id);
        System.out.println("LV = " + this.lv);
        System.out.println("maxHP = " + this.hp);
        System.out.println("Atk = "+ this.atk);
        System.out.println("Def = "+ this.def );
        System.out.println("Speed = "+ this.speed );
        System.out.printf("exp = %d / %d\n",this.exp, this.expMax );

    }

}
