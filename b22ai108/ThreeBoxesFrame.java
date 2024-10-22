import javax.swing.*;
import java.awt.*;

public class ThreeBoxesFrame {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Three Boxes Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); 
        frame.setLayout(new GridLayout(1, 3)); 

        
        JPanel box1 = new JPanel();
        box1.setBackground(Color.RED);

        JPanel box2 = new JPanel();
        box2.setBackground(Color.GREEN);

        JPanel box3 = new JPanel();
        box3.setBackground(Color.BLUE);

        
        frame.add(box1);
        frame.add(box2);
        frame.add(box3);

        
        frame.setVisible(true);
    }
}
