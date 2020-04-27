import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import jdk.internal.platform.Container;

public class PokemonStatus extends JFrame{          //create status panel
    Pokemon pokemon;
    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status:" + pokemon.getName());
        this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel(pokemon.getName());
        JLabel hp = new JLabel("HP : "+pokemon.getHp());
        
        c.add(name);
        c.add(hp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}