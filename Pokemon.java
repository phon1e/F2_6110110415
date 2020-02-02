import java.io.*;
class Pokemon{
    private String id;
    private int LV, HP, Atk, Def, Speed;

    public Pokemon(String id, int LV, int HP, int Atk, int Def, int Speed){// default Constructor of stat
        this.id = id;
        this.LV = LV;
        this.HP = HP;
        this.Atk = Atk;
        this.Def = Def;
        this.Speed = Speed;
    }
    public Bag(){
        Pokemon n1 = new Pokemon();
    }

    public void displayPokemon(){
        System.out.println("\nID = " + this.id);
        System.out.println("LV = " + this.LV);
        System.out.println("maxHP = " + this.HP);
        System.out.println("Atk = "+ this.Atk);
        System.out.println("Def = "+ this.Def );
        System.out.println("Speed = "+ this.Speed +"\n");

    }

}
