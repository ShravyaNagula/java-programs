import java.awt.*;
import javax.swing.*;
public class StaticEvent
{
	JButton b1;
	JLabel l1;
	JTextField t1;
	JFrame f=new JFrame("First Frame");
	StaticEvent()
	{
		f.setLayout(new FlowLayout());
		b1=new JButton("Button");
		l1=new JLabel("Label");
		f.add(b1);
		f.add(l1);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

		