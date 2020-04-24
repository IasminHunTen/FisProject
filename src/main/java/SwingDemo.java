import java.awt.Dimension;

import javax.swing.*;
public class SwingDemo {
     
	public static void main(String[] args) {
       JFrame frame=new JFrame("Demo Swing");
       JLabel label=new JLabel();
       label.setText("We are ready");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(300,100));
       frame.add(label);
       
      
       frame.setVisible(true);
	}
}
