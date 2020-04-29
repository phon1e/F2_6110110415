import java.awt.*;
import javax.swing.*;



public class IconImage extends JFrame{
    public ImageIcon image1;
    public JLabel label1;

    IconImage(){
        setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("pika.jpg"));
        
        label1 = new JLabel(image1);
        add(label1);
    }
}
