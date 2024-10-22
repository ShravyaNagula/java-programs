import java.util.Calender;
import java.util.GregorianCalender;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Formatter;
class FirstJFrame implements ActionListener
{
JFrame jfrm;
JLabel jlbl1;
JButton jbtn;
FirstFrame()
{
jfrm = new JFrame("First JFrame Program");
jfrm.setSize(500,400);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jfrm.setVisible(true);
jfrm.setLayout(null);
jlbl1= new JLabel("Hello");
jlbl1.setBounds(100,80,200,50);
jfrm.add(jlbl1);
jbtn = new JButton("Click");
jbtn.setBounds(100,150,100,60);
jfrm.add(jbtn);
jbtn.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
GregorianCalendar time = new GregorianCalendar();
int hour = time.get(Calendar.HOUR_OF_DAY);
int min = time.get(Calendar.MINUTE);
int day = time.get(Calendar.DAY_OF_MONTH);
int month = time.get(Calendar.MONTH);
int year =  time.get(Calendar.YEAR);
System.out.println("The current time is\t"+hour+":"+min);
System.out.println("Today's date is\t"+month+"/"+day+"/"+year);
if(hour<12)
System.out.println("Good Morning");
else if(hour<17 && !(hour==12))
System.out.println("Good Afternoon");
else if(hour==12)
System.out.println("Good Noon");
else
System.out.println("Good Evening");
public static void main(String args[])
{
new FirstFrame();
}
}