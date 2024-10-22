import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class Registration 
{
	JFrame jfrm;
	Registration(){
		jfrm=new JFrame();
		jfrm.setSize(500,500);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setLayout(null);
		JLabel l1=new JLabel("Name: ");
		JTextField t1=new JTextField(20);
		JLabel l2=new JLabel("Rollno: ");
		JTextField t2=new JTextField(20);
		JLabel l3=new JLabel("Mobile.no: ");
		JTextField t3=new JTextField(20);
		 JLabel l4=new JLabel("Password: ");
		JPasswordField t4=new JPasswordField(20);
		JLabel l5=new JLabel("Gender: ");
		JRadioButton r1=new JRadioButton("Male");
		JRadioButton r2=new JRadioButton("Female");
		JButton b1=new JButton("Submit");
		jfrm.add(l1);
		jfrm.add(t1);
		jfrm.add(l2);
		jfrm.add(t2);
		jfrm.add(l3);
		jfrm.add(t3);
		jfrm.add(l4);
		jfrm.add(t4);
		jfrm.add(l4);
		jfrm.add(l5);
		ButtonGroup btn=new ButtonGroup();
		btn.add(r1);
		btn.add(r2);
		jfrm.add(r1);
		jfrm.add(r2);
		jfrm.add(b1);
		l1.setBounds(20,20,100,20);
		t1.setBounds(140,20,100,20);
		l2.setBounds(20,50,100,20);
		t2.setBounds(140,50,100,20);
		l3.setBounds(20,80,100,20);
		t3.setBounds(140,80,100,20);
		l4.setBounds(20,110,100,20);
		t4.setBounds(140,110,100,20);
		l5.setBounds(20,130,100,20);
		r1.setBounds(140,130,80,20);
		r2.setBounds(230,130,100,20);
		b1.setBounds(20,17S0,80,20);
		jfrm.setVisible(true);
	}
	public static void main(String args[])
	{
		new Registration();
	}
}