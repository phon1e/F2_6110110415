import java.awt.*;
import javax.swing.*;



public class IconImage extends JFrame{
    public ImageIcon image1;
    public JLabel label1;

    IconImage(){
        setLayout(new FlowLayout());                            //set layout

        image1 = new ImageIcon(getClass().getResource("pika.jpg"));     //get image from source
        
        label1 = new JLabel(image1);
        add(label1);                    //add image to label
    }
}
