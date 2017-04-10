package dot.and.box;

import java.awt.*;
import javax.swing.*;

public class boardWindow extends JPanel {
	
	int x1,y1,x2,y2 ,com;
        int a,b,h,w;
        int check ;
        
	public boardWindow(int a , int b , int c , int d,int e){
		
		this.x1= a;
		this.y1=b;
		this.x2 = c;
		this.y2 =d ;
		this.com = e;
	}
	
	public void setCordinate(int a , int b , int c , int d,int e){
		this.x1= a;
		this.y1=b;
		this.x2 = c;
		this.y2 =d ;
		this.com = e;
	}
        
        public void setStart(int x , int y,int height , int width,int che){
            this.a = x; 
            this.b = y ;
            this.h = height ;
            this.w = width ;
            this.check = che ;
        
        }
		
	
	public void paint(Graphics g) {
		
		
		g.setColor(Color.BLACK);
			
		
		g.fillOval(195, 10, 10, 10);
		g.fillOval(295, 10, 10, 10);
		g.fillOval(395, 10, 10, 10);
                g.fillOval(495, 10, 10, 10);
                g.fillOval(595, 10, 10, 10);

		
		g.fillOval(195, 110, 10, 10);
		g.fillOval(295, 110, 10, 10);
		g.fillOval(395, 110, 10, 10);
                g.fillOval(495, 110, 10, 10);
                g.fillOval(595, 110, 10, 10);

		
		g.fillOval(195, 210, 10, 10);
		g.fillOval(295, 210, 10, 10);
		g.fillOval(395, 210, 10, 10);
                g.fillOval(495, 210, 10, 10);
                g.fillOval(595, 210, 10, 10);

		
		g.fillOval(195, 310, 10, 10);
		g.fillOval(295, 310, 10, 10);
		g.fillOval(395, 310, 10, 10);
                g.fillOval(495, 310, 10, 10);
                g.fillOval(595, 310, 10, 10);
                
                
                g.fillOval(195, 410, 10, 10);
		g.fillOval(295, 410, 10, 10);
		g.fillOval(395, 410, 10, 10);
                g.fillOval(495, 410, 10, 10);
                g.fillOval(595, 410, 10, 10);
		
                
                
		if(this.com==1  )
		{
			g.setColor(Color.RED);
			g.drawLine(x1,y1,x2,y2);
		}
		if(this.com==2)
		{
			g.setColor(new Color(10,100,20));
			g.drawLine(x1,y1,x2,y2);
		}
		if(check==1 ){
                    g.fillRect(a, b, h, w);
                    this.check = 0;
                    
                }
                
               
                
	}
	

}