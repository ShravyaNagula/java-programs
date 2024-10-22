import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TwoFrames
{
JFrame twoFrames=new JFrame("Main Frame");
twoFrames.setSize(300,200);
twoFrames.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
twoFrames.setlayout(null);
JButton openButton=new JButton("click to open new Frame");
openButton.setBounds(50,50,200,30);
openButton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
Jframe twoFrames=new JFrame("New Frame");
twoFrames.setSize(300,200);
twoFrames.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
twoFrames.setLayout(null);
JLabel label=new JLabel("New Frame");
label.setBounds(50,50,200,30);
twoFrames.add(label);
twoFrames.setVisible(true);
}
});
twoframes.add(openButton);
twoFrames.setVisible(true);
}
}