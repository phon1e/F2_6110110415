import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;


public class TextField extends JFrame{          //create status panel
    String name;
    JButton lvlupButton;
    Pokemon pokemon;
    public TextField(String name){
        this.name = name;

        JPanel jp =new JPanel();
        JLabel jl = new JLabel(); 
        JTextField jt = new JTextField(30);
        JButton jb =new JButton("Enter");

        setTitle("Nick Name of:" +" Pikachu");
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jp.add(jt);
       
        jt.addActionListener(new ActionListener()
        {
               public void actionPerformed(ActionEvent e)
               {
                     String input = jt.getText();
                     jl.setText("renamed: " + input); 
               }
        });

        jp.add(jb);
        jb.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                       String input = jt.getText();
                       jl.setText(input);
                }
        });
        
        jp.add(jl);
        add(jp);

 }
        

    }
