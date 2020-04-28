import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame{
    private int pressCount = 1;
        public GUI(){
            super("Testing Button");
            Container c = getContentPane();
            c.setLayout(new FlowLayout());
            JButton jb = new JButton("Press me");
            c.add(jb);

            jb.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                { System.out.println("Pressed" + pressCount++); }
            } );

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pack();
            setVisible(true);
        }
        
    public static void main(String[] args){
        new GUI();
   }

}