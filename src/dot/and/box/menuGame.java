package dot.and.box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class menuGame extends JFrame  implements MouseListener {

	private JFrame f;
	private JPanel panel;
	private JLabel l;
	private JLabel l2;
	private JLabel l3;

    
    public menuGame(){
        f= new JFrame("DOT & BOX");
	f.setVisible(true);
        f.setMinimumSize(new Dimension(650, 450));
	f.setResizable(false);
        f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	JPanel panel6 = new JPanel();
	panel6.setPreferredSize(new Dimension(650, 450));
	panel6.setBackground(Color.BLACK);
	panel6.setLayout(new BorderLayout(0, 0));
	setContentPane(panel6);   
	    
	 f.add(panel6);   

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(250, 450));
	panel.setBackground(new Color(46,16,16));
	panel.setLayout(new BorderLayout(0, 0));
	setContentPane(panel);
	    
	panel6.add(panel, BorderLayout.WEST);
        
	    
	JPanel panel2 = new JPanel();
	panel2.setPreferredSize(new Dimension(400, 450));
	panel2.setBackground(new Color(10,100,20));
	panel2.setLayout(new GridBagLayout());
	panel6.add(panel2, BorderLayout.EAST);
	
	
	
	JLabel newLabel = new JLabel("  Dots & Boxes ");
	panel2.add(newLabel);
	newLabel.setFont(new Font("Castellar", Font.BOLD, 40));
	newLabel.setForeground(new Color(0,0,51));
	
	
	
	JLabel newLabel2 = new JLabel("                                                 ");                                                                                                                           
	panel.add(newLabel2);                                                                                                                               
		
	JLabel newLabel3 = new JLabel("                                     ");
	panel.add(newLabel3);
	
	JLabel newLabel4 = new JLabel("                                    ");
	panel.add(newLabel4);
	
	JLabel newLabel5 = new JLabel("                                    ");
	panel.add(newLabel5);
	
	JLabel newLabel6 = new JLabel("                                      ");
	panel.add(newLabel6);
	
	JLabel newLabel7 = new JLabel("                                  ");
	panel.add(newLabel7);
	
	JLabel newLabel8 = new JLabel("                                 ");
	panel.add(newLabel8);
	
	JLabel newLabel9 = new JLabel("                               ");
	panel.add(newLabel9);
	
	
	
	
	
	this.l = new JLabel(" NEW GAME ");
	this.l.setFont(new Font("FORTE", Font.PLAIN, 33));
	this.l.setForeground(Color.BLACK);
	this.l.setToolTipText("Click to play New game");
        this.l.setBounds(0, 0, 140, 40);
	
	
	this.l2 = new JLabel(" ABOUT ");
	this.l2.setFont(new Font("FORTE", Font.PLAIN, 33));
	this.l2.setForeground(Color.BLACK);
	this.l2.setToolTipText("Click to see about the games");
	

	this.l3 = new JLabel(" EXIT ");
	this.l3.setFont(new Font("FORTE", Font.PLAIN, 33));
	this.l3.setForeground(Color.BLACK);
	this.l3.setLocation(400, 300);
	
	
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));	
	panel.add(this.l);
	panel.add(this.l2);
	panel.add(this.l3);
	
	
	this.l.addMouseListener(this);
	this.l2.addMouseListener(this);
	this.l3.addMouseListener(this);
	
		
	
       }

	public void mouseClicked(MouseEvent e) {

		if(e.getSource() == this.l)
		{
			System.out.println("Game is opening");
			new gameWindows();
			this.f.dispose();
			
		}
		if(e.getSource() == this.l2)
		{
			System.out.println("About this Game");
			new aboutWindows();	
			this.f.setEnabled(false);
		}
		if(e.getSource() == this.l3)
		{
			System.out.println("Game is closing");
			//System.exit(0);
			new exitWindow();
			this.f.setEnabled(false);
			
		}
		
	}


	public void mouseEntered(MouseEvent e) {
		
		if(e.getSource() == this.l)
		{
			this.l.setForeground(Color.red);
			
		}
		if(e.getSource() == this.l2)
		{
			this.l2.setForeground(Color.red);
			
		}
		if(e.getSource() == this.l3)
		{
			this.l3.setForeground(Color.red);
			
		}
		
		this.repaint();
	}


	public void mouseExited(MouseEvent e) {
	
		if(e.getSource() == this.l)
		{
			this.l.setForeground(Color.BLACK);
			
		}
		if(e.getSource() == this.l2)
		{
			this.l2.setForeground(Color.BLACK);
			
		}
		if(e.getSource() == this.l3)
		{
			this.l3.setForeground(Color.BLACK);
			
		}
		
		this.repaint();
	}


	public void mousePressed(MouseEvent e) {
		
		if(e.getSource() == this.l)
		{
			this.l.setForeground(Color.YELLOW);
			
		}
		if(e.getSource() == this.l2)
		{
			this.l2.setForeground(Color.YELLOW);
			
		}
		if(e.getSource() == this.l3)
		{
			this.l3.setForeground(Color.YELLOW);
			
		}
		
	}


	public void mouseReleased(MouseEvent arg0) {
		
	}
	
	    
    }
    

