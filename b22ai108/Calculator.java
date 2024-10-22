import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import java.awt.event.*;
public class Calculator
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		f.setLayout(null);
		JLabel lb1 = new JLabel("Enter number 1: ");
		JLabel lb2 = new JLabel("Enter number 2: ");
		JLabel lb3 = new JLabel("Result: ");
		final JTextField t1 = new JTextField(20);
		final JTextField t2 = new JTextField(20);
		final JTextField t3 = new JTextField(20);
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Subtract");
		JButton b3 = new JButton("Multiplication");
		JButton b4 = new JButton("Divide");
		lb1.setBounds(20,20,100,20);
		t1.setBounds(140,20,100,20);
		lb2.setBounds(20,50,100,20);
		t2.setBounds(140,50,100,20);
		lb3.setBounds(20,80,100,20);
		t3.setBounds(140,80,100,20);
		b1.setBounds(80,120,80,20);
		b2.setBounds(180,120,80,20);
		b3.setBounds(280,120,80,20);
		b4.setBounds(380,20,80,20);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int cal = n1+n2;
				t3.setText(Integer.toString(cal));
			}
			
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int cal = 0;
				if(n1>n2)
					cal = n1-n2;
				else if (n2>n1)
					cal = n2-n1;
				t3.setText(Integer.toString(cal));
				
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int cal = n1*n2;
				t3.setText(Integer.toString(cal));
			}
			
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int cal = 0;
				if(n1>n2)
					cal=n1/n2;
				else if(n2>n1)
					cal=n2/n1;
				t3.setText(Integer.toString(cal));
			}
			
		});
		
		f.add(lb1);
		f.add(t1);
		f.add(lb2);
		f.add(t2);
		f.add(lb3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
		f.setSize(700,250);
	
		
		
		
	}
}