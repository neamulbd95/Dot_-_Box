package dot.and.box;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class overWindow extends JFrame implements MouseListener{
	
	gameWindows gw;
        panelWindows pw2 ;

        
        private JFrame overFrame ;
	private JLabel la;
        //private JLabel comla;

	
	public overWindow(gameWindows gw){
            
                this.gw = gw;
		
		overFrame = new JFrame("GAME OVER");
		overFrame.setVisible(true);
		overFrame.setMinimumSize(new Dimension(600, 150));
                overFrame.setLocationRelativeTo(null);
		overFrame.setResizable(false);
		overFrame.setBackground(new Color(10,100,20));
		overFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel2221 = new JPanel();
		panel2221.setPreferredSize(new Dimension(600, 250));
		panel2221.setBackground(new Color(178,255,102));
		overFrame.getContentPane().add(panel2221);
		
		JLabel space = new JLabel("                           ");
		panel2221.add(space);
                
             
		
		JLabel score = new JLabel("GAME OVER");
		score.setFont(new Font("Calibri", Font.BOLD, 30));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setPreferredSize(new Dimension(190, 14));
		panel2221.add(score);
		
		panel2221.setLayout(new BoxLayout(panel2221, BoxLayout.Y_AXIS));
                
                JLabel space2 = new JLabel("                           ");
		panel2221.add(space);
                
                JLabel space3 = new JLabel("                           ");
		panel2221.add(space);
                
                JLabel space4 = new JLabel("                           ");
		panel2221.add(space);
		
		this.la = new JLabel ("RESTART");
		la.setFont(new Font("Tahoma", Font.PLAIN, 25));
		this.la.setForeground(Color.BLACK);
		panel2221.add(this.la);
                
                this.la.addMouseListener(this);
                

         
	}
	
        public JFrame getFrame(){
            return this.overFrame;
        }
        
        public void mouseClicked(MouseEvent e) {
            if(e.getSource() == this.la)
		{
			System.out.println("Game is Re-Opening");
			new gameWindows();
			this.overFrame.dispose();
                        this.gw.getFrame().dispose();
			
		}
		
	}
	public void mouseReleased(MouseEvent arg0) {
		
	}
	public void mouseEntered(MouseEvent arg0) {
		
	}
	public void mouseExited(MouseEvent arg0) {
		
	}

	public void mousePressed(MouseEvent arg0) {
		
	}
	
}