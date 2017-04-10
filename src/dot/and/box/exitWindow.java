package dot.and.box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exitWindow extends JFrame implements ActionListener{
	private JFrame exitFrame ;
	private JPanel epan ;
	private JButton b1 ;
	private JButton b2 ;
	
	public exitWindow(){
		
		exitFrame = new JFrame("EXIT_CONFIRMATION");
		exitFrame.setSize(500,200);
		exitFrame.setVisible(true);
		exitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		epan = new JPanel();
		epan.setSize(500,250);
		epan.setBackground(Color.BLACK);
		exitFrame.add(epan);
		
		JLabel elabel = new JLabel("Do you want to EXIT the game ?", JLabel.CENTER);
		elabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		elabel.setForeground(Color.CYAN);
		epan.add(elabel);
		
		
		b1 = new JButton ("YES") ;
		b1.setPreferredSize(new Dimension(70, 20));
		
		b2 = new JButton ("NO") ;
		b2.setPreferredSize(new Dimension(70, 20));
		
		
		epan.setLayout(new BoxLayout(epan, BoxLayout.Y_AXIS));
		epan.add(b1);
		
		
		JLabel newLabel2 = new JLabel("                                                                    ");                                                                                                                           
		epan.add(newLabel2);                                                                                                                               
			
		epan.add(b2);
		
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent event){
			String c=event.getActionCommand();
			if(c.equals("YES")){
				System.exit(0);
			}
			else{
				this.exitFrame.dispose();
			}
		}
	
}
	