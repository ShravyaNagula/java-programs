import javax.swing.*;
import java.awt.event.*;

public class WindowListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Listener");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(frame,
                    "Are you sure you want to exit?", "Confirm Exit",
                    JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized");
            }
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window restored");
            }
        });

        frame.setVisible(true);
    }
}
