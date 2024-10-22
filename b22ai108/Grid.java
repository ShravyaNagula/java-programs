import javax.swing.*;
import java.awt.*;
public class Grid{
Grid(){
JFrame jfrm = new JFrame("Grid Layout");
jfrm.setSize(400,300);
jfrm.setLayout(new GridLayout(3,3,10,10));
JButton btn1=new JButton("1");
JButton btn2=new JButton("2");
JButton btn3=new JButton("3");
JButton btn4=new JButton("4");
JButton btn5=new JButton("5");
jfrm.add(btn1);
jfrm.add(btn2);
jfrm.add(btn3);
jfrm.add(btn4);
jfrm.add(btn5);
jfrm.setVisible(true);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
new Grid();
}
}