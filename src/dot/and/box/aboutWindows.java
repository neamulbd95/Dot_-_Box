package dot.and.box;

import javax.swing.*;
import java.awt.*;

public class aboutWindows extends JFrame{
	
	private JFrame f3 ;
	private JPanel p3 ;
	
	public aboutWindows(){
		f3 = new JFrame("About");
		f3.setVisible(true);
		f3.setMinimumSize(new Dimension(500, 300));
		f3.setResizable(true);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		p3 = new JPanel();
		p3.setMinimumSize(new Dimension(700, 450));
		p3.setMaximumSize(new Dimension(700, 450));
		p3.setPreferredSize(new Dimension(700, 450));
		p3.setBackground(Color.WHITE);
		p3.setLayout(new BorderLayout(0, 0));
		setContentPane(p3);
	    
	        f3.add(p3);
		
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(700, 450));
		panel2.setMinimumSize(new Dimension(700, 450));
		panel2.setBackground(Color.WHITE);
		//p3.add(panel2);
                
                p3.add(panel2, BorderLayout.CENTER);
		
                String s = "(neamulbd95) & (abid_hasan112) ";
                        /*+ "Dots and boxes is a pencil and paper game for two players first published in 1889 by Édouard Lucas.\n" +
                           "\n" +
                            "Starting with an empty grid of dots, players take turns, adding a single horizontal or vertical line between two unjoined adjacent dots. A player who completes the fourth side of a 1×1 box earns one point and takes another turn. The game ends when no more lines can be placed. The winner of the game is the player with the most points.";*/
		JLabel l3 = new JLabel(s);
                JLabel space1 = new JLabel("          ");
                JLabel l4 = new JLabel("&");
		
		panel2.add(l3);
                panel2.add(space1);
                panel2.add(l4);
                
		p3.setFont(new Font("Algerian", Font.BOLD, 150));
	
	}
}