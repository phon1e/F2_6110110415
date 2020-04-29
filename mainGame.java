import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;

public class mainGame extends JFrame{

    private Trainer trainer;
    private Pokemon pokemons;
    protected String nName;
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainPanel, mainPanel2, choiceButtonPanel;
    JLabel titleNameLabel, trainerNameLabel, pokemonNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);   //set tite font size
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton, quitButton, choice1, choice2, choice3, choice4, statButton ;                                        
    JTextArea mainTextArea, subTextArea;
    

    TitleScreenHandler tsHandler = new TitleScreenHandler();        //creare title screenhandler for status menu
    public mainGame(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        this.pokemons = pokemons;
        pokemonNameLabel = new JLabel();
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);             // set bg color black
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
        
        

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("> Welcome to Pokemon Game <"); 
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setLayout(new GridLayout(2, 1));
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");                       //create start button
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);                     // disable painted white magic line

        quitButton = new JButton("QUIT");                         // create quit button
        quitButton.setBackground(Color.black);                     
        quitButton.setForeground(Color.white);
        quitButton.setFont(normalFont);
        quitButton.addActionListener(tsHandler);        
        quitButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        startButtonPanel.add(quitButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);

        }

    public void back(){                                    // try some back func but didnt work
        choiceButtonPanel.setVisible(false);
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);               // close current items in screen when click button
        startButtonPanel.setVisible(false);

        mainPanel = new JPanel();
        mainPanel.setBounds(100, 100, 600, 250);
        mainPanel.setBackground(Color.black);
        con.add(mainPanel);

        mainTextArea = new JTextArea("MENU");     // MENU => Pokemon's Status/ Catch some pokemon/  Pokemon in Bag
        mainTextArea.setBounds(100,100,600,150);
        mainTextArea.setBackground(Color.black);                  
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1)); // set layout button position (y : x)
        con.add(choiceButtonPanel);

        choice1 = new JButton("Pokemon's Status ");      // button 1
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);                 //add in panel;
        choice1.setFocusPainted(false);         
        choice1.addActionListener(tsHandler);   
        
        choice2 = new JButton("Nick Name");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        choice2.setFocusPainted(false);
        choice2.addActionListener(tsHandler);
        
        choice3 = new JButton("Pokemon in Bag");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        choice3.setFocusPainted(false);
        choice3.addActionListener(tsHandler);

        choice4 = new JButton("BACK");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);
        choice4.setFocusPainted(false);
        choice4.addActionListener(tsHandler);
    }

    public class TitleScreenHandler implements ActionListener{  // create ActionLister tsHandler for click button action
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == startButton)                    // check when click button
                createGameScreen();
            else if(e.getSource() == quitButton)            
                System.exit(0);                                 //close program
            else if(e.getSource() == choice1)
                statusInfo();
            else if(e.getSource() == choice2)
                rename(nName);
            else if(e.getSource() == choice4){
                back();
                createGameScreen();
            }

        }
    }

    public void rename(String nName){
        TextField tf = new TextField(nName);
    }

    public void statusInfo(){     
                                                            // status info of pokemon
        mainPanel.setVisible(false);                        // close recent items in current page
        choiceButtonPanel.setVisible(false);
        mainPanel2 = new JPanel();
        mainPanel2.setBounds(100, 100, 600, 250);
        mainPanel2.setBackground(Color.black);
        con.add(mainPanel2);
        
        mainTextArea = new JTextArea("INFO\nTrainer Name: " + this.trainer.getName());     // show player info
        mainTextArea.setBounds(100,100,600,150);
        mainTextArea.setBackground(Color.black);                  
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainPanel2.add(mainTextArea);

        statButton = new JButton("STAT");                       //create start button
        statButton.setBackground(Color.black);
        statButton.setForeground(Color.white);
        statButton.setFont(normalFont);
        statButton.addActionListener(tsHandler);
        statButton.setFocusPainted(false);
        statButton.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));          //call pokemonstatus to show 
                IconImage ic = new IconImage();
                ic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ic.setVisible(true);
                ic.setSize(180, 180);;
            }
        });

        String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";
        }

        pokemonNameLabel.setText(pName);
        mainPanel2.add(statButton);

    }

}
