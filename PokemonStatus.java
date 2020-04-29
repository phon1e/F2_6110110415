import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PokemonStatus extends JFrame{          //create status panel
    Pokemon pokemon;
    JButton lvlupButton;

    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status");
        this.pokemon = pokemon;
        int lv = 1;

        Container c = getContentPane();
        JLabel info = new JLabel("Name : " +pokemon.getName() +" HP: "+ pokemon.getHp());
        lvlupButton = new JButton("LEVEL UP");
        
        c.add(lvlupButton);
        c.add(info);
        

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

    }
}