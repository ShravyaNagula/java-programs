import javax.swing.*;
import java.awt.*;
public class Border{
Border(){
JFrame jfrm = new JFrame("Border Layout");
jfrm.setSize(400,300);
BorderLayout layout = new BorderLayout();
layout.setHgap(10);
layout.setVgap(10);
jfrm.setLayout(layout);
JButton btn1=new JButton("NORTH");
JButton btn2=new JButton("EAST");
JButton btn3=new JButton("SOUTH");
JButton btn4=new JButton("WEST");
JButton btn5=new JButton("CENTER");
jfrm.add(btn1,BorderLayout.NORTH);
jfrm.add(btn2,BorderLayout.EAST);
jfrm.add(btn3,BorderLayout.SOUTH);
jfrm.add(btn4,BorderLayout.WEST);
jfrm.add(btn5,BorderLayout.CENTER);
jfrm.setVisible(true);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
new Border();
}
}