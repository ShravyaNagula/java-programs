import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileReadJTextArea{
	JFrame jfrm;
	JButton jbtn1, jbtn2;
	JTextArea jta;
	JScrollPane jsp;
	JFileChooser jfc;
	String FName;
	FileReadJTextArea(){
		FName = "";
		jfrm = new JFrame("Reading File and Display in Text Area");
		jfrm.setSize(400, 300);
		jfrm.setLayout(new FlowLayout());
		jbtn1 = new JButton("File Chooser");
		jfrm.add(jbtn1);
		jbtn1 = new JButton("Read File");
		jfrm.add(jbtn2);
		jta = new JTextArea();
		jta.setRows(10);
		jta.setColumns(20);
		jsp = new JScrollPane(jta);
		jfrm.add(jsp);
		jbtn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jfc = new JFileChooser();
				jfc.setMultiSelectionEnabled(Boolean.false);
				if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
					FName = jfc.getSelectedFile().getAbsolutePath();
					jta.setText(FName);
				}
			}
		});
		jbtn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String res = "";
				try(Scanner sc = new Scanner(new File(FName))){
					while(sc.hasNext()){
						res += sc.nextLine() + "\n";
					}
				}
				catch(FileNotFoundException ex){
					System.out.println("FileNotFoundException occured"+ex);
				}
				
			}
		});
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
	public static void main(String[] args){
		new FileReadJTextArea();
	}
}