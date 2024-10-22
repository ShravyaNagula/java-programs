import java.awt.*;    
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;      
public class WindowExample extends Frame implements WindowListener {      
    WindowExample() {     
        addWindowListener(this);          
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
public static void main(String[] args) {    
    new WindowExample();    
}      
public void windowActivated (WindowEvent w) {    
    System.out.println("activated");    
}     
public void windowClosed (WindowEvent w) {    
    System.out.println("closed");    
}     
public void windowClosing (WindowEvent w) {    
    System.out.println("closing");    
    dispose();    
}     
public void windowDeactivated (WindowEvent w) {    
    System.out.println("deactivated");    
}     
public void windowDeiconified (WindowEvent w) {    
    System.out.println("deiconified");    
}     
public void windowIconified(WindowEvent w) {    
    System.out.println("iconified");    
}    
public void windowOpened(WindowEvent w) {    
    System.out.println("opened");    
}    
}    