import java.awt.event.*;
public class AnonymousClass extends StaticEvent implements ActionListener
{
	AnonymousClass()
	{
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("Hello");
	}
	public static void main(String args[])
	{
		new StaticEvent();
		new AnonymousClass();
	}
}
	
