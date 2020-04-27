import java.io.*;
import java.lang.Math;
import java.util.*;

public class Ultraball extends Ball{
    public Ultraball(String name){
        super(name);
        chance += Math.random()+50; 
    }
}