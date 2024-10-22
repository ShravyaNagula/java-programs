import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class RectangleFrame {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Rectangle Boxes Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); 

       
        JPanel panel = new CustomPanel();
        frame.add(panel);

        
        frame.setVisible(true);
    }
}


class CustomPanel extends JPanel {

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        Graphics2D g2d = (Graphics2D) g;

        
        g2d.setColor(Color.BLUE);
        g2d.drawRect(50, 50, 100, 50);

        g2d.setColor(Color.BLUE);
        g2d.drawRect(200, 50, 100, 50); 

        g2d.setColor(Color.BLUE);
        g2d.drawRect(125, 150, 100, 50); 
}
