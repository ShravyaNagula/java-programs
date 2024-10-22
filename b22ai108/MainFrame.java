import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainFrame extends JFrame 
{
    public MainFrame() 
	{    
        setTitle("Main Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);       
        JButton openFrameButton = new JButton("click to open new Frame");
        openFrameButton.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) 
			{                
                NewFrame newFrame = new NewFrame();
                newFrame.setVisible(true);
            }
        });       
        add(openFrameButton);
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(()->{
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
class NewFrame extends JFrame {
    public NewFrame() 
	{        
        setTitle("New Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);        
        JLabel label = new JLabel("New Frame", SwingConstants.CENTER);
        add(label);
    }
}  







