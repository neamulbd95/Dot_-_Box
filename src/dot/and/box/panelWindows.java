package dot.and.box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panelWindows extends JFrame implements ActionListener{
	
        gameWindows gw;
        
	private JFrame f3 ;
	private JLabel la2;
	private JLabel la4;
	private JLabel la5;
        private JButton bt ;

	
	public panelWindows(gameWindows gw){
            
                this.gw = gw;
		
		f3 = new JFrame("IN GAME");
		f3.setVisible(true);
		f3.setMinimumSize(new Dimension(190, 450));
		f3.setResizable(false);
		f3.setBackground(Color.black);
                f3.setAlwaysOnTop (true);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel222 = new JPanel();
		panel222.setPreferredSize(new Dimension(190, 450));
		panel222.setBackground(Color.RED);
		f3.getContentPane().add(panel222);
		
		
		
		JLabel score = new JLabel("Score");
		score.setFont(new Font("Calibri", Font.BOLD, 18));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setPreferredSize(new Dimension(190, 14));
		panel222.add(score);
		
		panel222.setLayout(new BoxLayout(panel222, BoxLayout.Y_AXIS));	
		
		JLabel l = new JLabel("PLAYER 1");
		l.setFont(new Font("Calibri ", Font.PLAIN, 15));
		l.setForeground(Color.YELLOW);
		panel222.add(l);
		
		this.la2 = new JLabel("0");
		la2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel222.add(this.la2);
		
		JLabel space = new JLabel("                           ");
		panel222.add(space);
		
		JLabel l3 = new JLabel("PLAYER 2");
		l3.setFont(new Font("Calibri ", Font.PLAIN, 15));
		panel222.add(l3);
		
		this.la4 = new JLabel("0");
		la4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel222.add(this.la4);
		
		
		JLabel newLabel = new JLabel("                          ");                                                                                                                           
		panel222.add(newLabel);                                                                                                                               
			
		JLabel newLabel2 = new JLabel("                          ");
		panel222.add(newLabel2);
		
		JLabel newLabel3 = new JLabel("                          ");
		panel222.add(newLabel3);
		
		JLabel newLabel4 = new JLabel("                          ");
		panel222.add(newLabel4);
		
		JLabel newLabel5 = new JLabel("                          ");
		panel222.add(newLabel5);
		
		this.la5 = new JLabel ("Player 1 's Turn");
		la5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		this.la5.setForeground(new Color(10,100,20));
		panel222.add(this.la5);
                
                
                JLabel newLabel6 = new JLabel("                          ");
		panel222.add(newLabel6);
                
                
                JLabel newLabel7 = new JLabel("                          ");
		panel222.add(newLabel7);
                
                
                JLabel newLabel8 = new JLabel("                          ");
		panel222.add(newLabel8);
                
                JLabel newLabel9 = new JLabel("                          ");
		panel222.add(newLabel9);
                
                
                JLabel newLabel10 = new JLabel("                          ");
		panel222.add(newLabel10);
                
                JLabel newLabel11 = new JLabel("                          ");
		panel222.add(newLabel11);
                
                
                bt = new JButton("RESTART");
                bt.setPreferredSize(new Dimension(70, 20));
		
		
		panel222.setLayout(new BoxLayout(panel222, BoxLayout.Y_AXIS));
		panel222.add(bt);
                
                this.bt.addActionListener(this);
                
	}
        
        public void actionPerformed(ActionEvent event){
			String c=event.getActionCommand();
			if(c.equals("RESTART")){
                                gw.getFrame().dispose();
                                this.f3.dispose();
				new gameWindows();
			}
		
		}
	
	
	public JLabel getla2(){
		return this.la2;
	}
	
	public JLabel getla4(){
		return this.la4;
	}
	
	public JLabel getla5(){
		return this.la5;
	}
	
	
	
}