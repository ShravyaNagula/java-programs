import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.awt.event.*; 
import java.util.logging.Level;
import java.io.FileWriter;
import java.io.IOException;

public class DisplayFile implements ActionListener{  
JLabel l1,l2;  
JTextArea area;  
JButton b;  
DisplayFile() {  
    JFrame f= new JFrame();  
    l1=new JLabel();  
    l1.setBounds(50,25,100,30);  
    l2=new JLabel();  
    l2.setBounds(160,25,100,30);  
    area=new JTextArea();  
    area.setBounds(20,75,250,200);  
    b=new JButton("Display");  
    b.setBounds(100,300,120,30);  
    b.addActionListener(this);  
    f.add(l1);f.add(l2);f.add(area);f.add(b);  
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  
	try(FileWriter w = new FileWriter("File.txt",true)){
		
		w.write(text);
	}
	catch(IOException a){
		System.out.print("ERROR"+a);
	}
}  
public static void main(String[] args) {  
    new DisplayFile();  
	
}
}
