import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class form
{
    JFrame jfrm;
    JButton b1;
    form()
    {
        jfrm= new JFrame();
        jfrm.setVisible(true);
        jfrm.setLayout(null);
        jfrm.setSize(500,500);
        JLabel l1 = new JLabel("Name : ");
	    JLabel l2 = new JLabel("Roll Number : ");
	    JLabel l3 = new JLabel("Mobile Number : ");
        JLabel l4 = new JLabel("Gender");
	    JTextField t1 = new JTextField(20);
	    JTextField t2 = new JTextField(20);
	    JTextField t3 = new JTextField(20);
        JRadioButton m = new JRadioButton("Male");
        JRadioButton f = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(m);
        bg.add(f);
        b1= new JButton("Save");
        l1.setBounds(20,20,100,20);
		t1.setBounds(140,20,100,20);
		l2.setBounds(20,50,100,20);
		t2.setBounds(140,50,100,20);
		l3.setBounds(20,80,100,20);
		t3.setBounds(140,80,100,20);
        l4.setBounds(20,110,100,20);
        m.setBounds(140,110,80,20);
        f.setBounds(230,110,100,20);
        b1.setBounds(20,140,80,20);
        jfrm.add(l1);
        jfrm.add(t1);
        jfrm.add(l2);
        jfrm.add(t2);
        jfrm.add(l3);
        jfrm.add(t3);
        jfrm.add(l4);
        jfrm.add(m);
        jfrm.add(f);
        jfrm.add(b1);
        b1.addActionListener( new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    String Gender;
                    Connection con = null;
                    Statement stmt = null;
                try
                {
                    Class.forName("com.mysql.jdbc.Driver"); 
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "mllab");
                    stmt = con.createStatement();
                    if (m.isSelected()) 
                    {
                     Gender = "male";
                    } else
                    {
                        Gender = "female";
                    }
                    String str = "INSERT INTO details VALUES ('" + t1.getText() + "', '" + t2.getText() + "', '" + t3.getText() + "', '" + Gender + "')";
                    stmt.executeUpdate(str); 
                } 
                catch (ClassNotFoundException e2) 
                {
                    e2.printStackTrace();
                } 
                catch (SQLException e1) 
                {
                    e1.printStackTrace();
                } 
            }
            }
        );

    }
    public static void main(String[] args)
    {
        new form();
    }
}