import java.io.*;
import java.lang.Math;
import java.util.*;

public class Greatball extends Ball{
    public Greatball(String name){
        super(name);
        chance += Math.random()+20; 
    }
}