import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ArithmeticOperations {
    public static void main(String[] args) { 	
        JFrame frame = new JFrame("Menu Bar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
		frame.setLayout(null);
		JLabel l1=new JLabel("Enter Number 1: ");
		JLabel l2=new JLabel("Enter Number 2: ");
		JLabel l3=new JLabel("Result: ");
		final JTextField t1 = new JtextField(20);
		final JTextField t2 = new JTextField(20);
		final JTextField t3 = new JTextField(20);        
        JMenuBar menuBar = new JMenuBar();        
        JMenu aoMenu = new JMenu("Arithmetic_operation");
        JMenuItem addItem = new JMenuItem("Add");
        JMenuItem subItem = new JMenuItem("Sub");
        JMenuItem multItem = new JMenuItem("mult");
		JMenuItem divItem = new JMenuItem("div");
		addItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int cal=n1+n2;
				t3.setText(Integer.toString(cal));
			}
		});
		subItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				if(n1>n2){
					int cal=n1-n2;
				}
				else if(n2>n1){
					int cal=n2-n1;
				}
				t3.setText(Integer.toString(cal));
			}
		});
		multItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int cal=n1*n2;
				t3.setText(Integer.toString(cal));
			}
		});
		divItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				if(n1>n2){
					int cal=n1/n2;
				}
				else if(n2>n1){
					int cal=n2/n1;
				}
				t3.setText(Integer.toString(cal));
			}
		});
        aoMenu.add(addItem);
        aoMenu.add(subItem);
		aoMenu.add(multItem);
		aoMenu.add(divItem);
        aoMenu.addSeparator();
        menuBar.add(aoMenu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}

