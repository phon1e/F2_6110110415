import java.io.*;
import java.lang.Math;
import java.util.*;

public abstract class Ball{
    protected String name;
    protected int chance;

    public Ball(String name){
        this.name = name;
        this.chance = (int)(Math.random())+5;
    }

    public Ball(){
                    //dynamic constructor
    }
    
    public String getName(){        //get name
        return  name;
    }

    public String toString(){           //get name from magic text wwwww
        return name;
    }
}