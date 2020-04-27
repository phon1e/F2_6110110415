import java.io.*;
import java.lang.Math;
import java.util.*;

public class Pokeball  extends Ball{
    public Pokeball(String name){
        super(name);
        chance += Math.random()+10; 
    }
}