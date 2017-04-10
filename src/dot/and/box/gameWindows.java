package dot.and.box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gameWindows extends JFrame implements MouseListener{
	
	
	Graphics g ;
	
	private JFrame f2 ;
	private JLabel la2;
	private JLabel la4;
	private JLabel la5;

	
	int[] h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,h16,h17,h18,h19,h20;
        int[] v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12 ,v13,v14,v15,v16,v17,v18,v19,v20 ;
	int[][] b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16 ;
	int[][][] totalBoxes;
	int line ;
	
	Player p1;
	Player p2;
	playerTurn t;
	
	boardWindow br = new boardWindow(0,0,0,0,0);
	panelWindows pw ;

	
	public gameWindows(){
		f2 = new JFrame("IN GAME");
		f2.setVisible(true);
		f2.setMinimumSize(new Dimension(750, 600));
		f2.setResizable(true);
		f2.setBackground(Color.YELLOW);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f2.add(br);
		
		pw = new panelWindows(this);
		
		 Line();
		 box();
		 
		this.p1	= new Player(1);
		this.p2	= new Player(2);
		this.t 	= new playerTurn(p1, p2);
		

		this.f2.addMouseListener(this);
		
	}
	public JFrame getFrame(){
            return f2 ;

        }
	

	
	public void Line(){
		this.h1= new int[] {200,45,300,45,0};
		this.h2= new int[] {300,45,400,45,0};
		this.h3= new int[] {400,45,500,45,0};
                this.h4= new int[] {500,45,600,45,0};
                
		this.h5= new int[] {200,145,300,145,0};
		this.h6= new int[] {300,145,400,145,0};
		this.h7= new int[] {400,145,500,145,0};
                this.h8= new int[] {500,145,600,145,0};
                
		this.h9=  new int[] {200,245,300,245,0};
		this.h10= new int[] {300,245,400,245,0};
		this.h11= new int[] {400,245,500,245,0};
                this.h12= new int[] {500,245,600,245,0};
		
                this.h13= new int[] {200,345,300,345,0};
		this.h14= new int[] {300,345,400,345,0};
		this.h15= new int[] {400,345,500,345,0};
                this.h16= new int[] {500,345,600,345,0};
                
                this.h17= new int[] {200,445,300,445,0};
		this.h18= new int[] {300,445,400,445,0};
		this.h19= new int[] {400,445,500,445,0};
                this.h20= new int[] {500,445,600,445,0};
                
                
                
		this.v1= new int[] {200,50,200,140,0};
		this.v2= new int[] {300,50,300,140,0};
		this.v3= new int[] {400,50,400,140,0};
                this.v4= new int[] {500,50,500,140,0};
                this.v5= new int[] {600,50,600,140,0};
                
		this.v6= new int[] {200,150,200,240,0};
		this.v7= new int[] {300,150,300,240,0};
                this.v8= new int[] {400,150,400,240,0};
                this.v9= new int[] {500,150,500,240,0};
		this.v10= new int[] {600,150,600,240,0};
                
		this.v11= new int[] {200,250,200,340,0};
                this.v12= new int[] {300,250,300,340,0};                
                this.v13= new int[] {400,250,400,340,0};
		this.v14= new int[] {500,250,500,340,0};
		this.v15= new int[] {600,250,600,340,0};
                
                this.v16= new int[] {200,350,200,440,0};                                
                this.v17= new int[] {300,350,300,440,0};
		this.v18= new int[] {400,350,400,440,0};
		this.v19= new int[] {500,350,500,440,0};
                this.v20= new int[] {600,350,600,440,0};
	}
	
	public void box(){
		this.b1 = new int[][]{this.h1, this.v1, this.h5,this.v2};
		this.b2 = new int[][]{this.h2, this.v2, this.h6,this.v3};
		this.b3 = new int[][]{this.h3, this.v3, this.h7,this.v4};
		this.b4 = new int[][]{this.h4, this.v4, this.h8,this.v5};
                
		this.b5 = new int[][]{this.h5, this.v6, this.h9,this.v7};
		this.b6 = new int[][]{this.h6, this.v7, this.h10,this.v8};
		this.b7 = new int[][]{this.h7, this.v8, this.h11,this.v9};
		this.b8 = new int[][]{this.h8, this.v9, this.h12,this.v10};
                
                this.b9 = new int[][]{this.h9, this.v11, this.h13,this.v12};
		this.b10 = new int[][]{this.h10, this.v12, this.h14,this.v13};
		this.b11 = new int[][]{this.h11, this.v13, this.h15,this.v14};
		this.b12 = new int[][]{this.h12, this.v14, this.h16,this.v15};
                
                this.b13 = new int[][]{this.h13, this.v16, this.h17,this.v17};
		this.b14 = new int[][]{this.h14, this.v17, this.h18,this.v18};
		this.b15 = new int[][]{this.h15, this.v18, this.h19,this.v19};
		this.b16 = new int[][]{this.h16, this.v19, this.h20,this.v20};
		
		this.totalBoxes = new int [] [] [] {this.b1,this.b2,this.b3,this.b4,this.b5,this.b6,this.b7,this.b8,this.b9,this.b10,this.b11,
                                                    this.b12,this.b13,this.b14,this.b15,this.b16};
                
	}
	
	

	public void switchPointers()
	{
		
	
		if(this.p1.getHasTurn())
		{
			System.out.println("PLAYER 1");
			this.pw. getla5().setText("Player 1 's Turn");
		}
		else
		{
			System.out.println("PLAYER 2");
			this.pw. getla5().setText("Player 2 's Turn");
		}
	}
	
	public void points()
	{
		if(this.p1.getHasTurn())
		{
			this.p1.scorePoints();
			
			this. pw.getla2().setText(Integer.toString(this.p1.getScore()));
			
			
		}
		else
		{
			this.p2.scorePoints();
			
			this.pw.getla4().setText(Integer.toString(this.p2.getScore()));
			
		}
	}
	

	
	
	
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
			if(this.p1.getHasTurn()){
				
				this.line = 1;
			}
			else{
				this.line = 2;
			}

		
		if((205 < e.getX()) && (e.getX() < 295) && (35 < e.getY()) && (e.getY() < 55)){
			
			System.out.println("h1");
			
			if(this.h1[4] == 0)
				{
					this.h1[4] = this.line;
					
					
					if(this.t.checkScore(this.b1))
					{
						points();
                                                br.setStart(200, 15, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(200,15,300,15,h1[4]);
					br.repaint();
					
				}

		}
		
		
		if((305 < e.getX()) && (e.getX() < 395) && (35 < e.getY()) && (e.getY() < 55)){
			
			System.out.println("h2");
		
			if(this.h2[4] == 0)
				{
					this.h2[4] = this.line;
					
					
					if(this.t.checkScore(this.b2))
					{
						points();
                                                br.setStart(300, 15, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(300,15,400,15,h2[4]);
					br.repaint();
					
				}

		}
		
		
		if((405 < e.getX()) && (e.getX() < 495) && (35 < e.getY()) && (e.getY() < 55)){
			
			System.out.println("h3");
		
		
			if(this.h3[4] == 0)
				{
					this.h3[4] = this.line;
					
					
					if(this.t.checkScore(this.b3))
					{
						points();
                                                br.setStart(400, 15, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(400,15,500,15,h3[4]);
					br.repaint();
					
				}

		}
		
		
		if((505 < e.getX()) && (e.getX() < 595) && (35 < e.getY()) && (e.getY() < 55)){
			
			System.out.println("h4");
		
			if(this.h4[4] == 0)
				{
					this.h4[4] = this.line;
					
					if(this.t.checkScore(this.b4))
					{
						points();
                                                br.setStart(500, 15, 99, 99,1);
                                                br.repaint();
					}
					
					else{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(500,15,600,15,h4[4]);
					br.repaint();
					
				}

		}
		
		
		
		if((205 < e.getX()) && (e.getX() < 295) && (135 < e.getY()) && (e.getY() < 155)){
			
			System.out.println("h5");
		
			if(this.h5[4] == 0)
				{
					this.h5[4] = this.line;
					
					if(this.t.checkScore(this.b1))
					{
						points();
                                                br.setStart(200, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b5))
					{
						points();
                                                br.setStart(200, 115, 99, 99,3);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b1) || this.t.checkScore(this.b5)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
					}
					br.setCordinate(200,115,300,115,h5[4]);
					br.repaint();
				}

		}
		
		if((305 < e.getX()) && (e.getX() < 395) && (135 < e.getY()) && (e.getY() < 155)){
			
			System.out.println("h6");
		
			if(this.h6[4] == 0)
				{
					this.h6[4] = this.line;
					
					if(this.t.checkScore(this.b2))
					{
						points();
                                                br.setStart(300, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b6))
					{
						points();
                                                br.setStart(300, 115, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b2) || this.t.checkScore(this.b6)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(300,115,400,115,h6[4]);
					br.repaint();
					
				}

		}
		
		
		
		if((405 < e.getX()) && (e.getX() < 495) && (135 < e.getY()) && (e.getY() < 155)){
			
			System.out.println("h7");
			if(this.h7[4] == 0){
					this.h7[4] = this.line;
					
					if(this.t.checkScore(this.b7))
					{
						points();
                                                br.setStart(400, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b3))
					{
						points();
                                                br.setStart(400, 115, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b7) || this.t.checkScore(this.b3)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(400,115,500,115,h7[4]);
					br.repaint();
					
				}

		}
		
		
		if((505 < e.getX()) && (e.getX() < 595) && (135 < e.getY()) && (e.getY() < 155)){
			
			System.out.println("h8");
			if(this.h8[4] == 0)
				{
					this.h8[4] = this.line;
					
					if(this.t.checkScore(this.b4))
					{
						points();
                                                br.setStart(500, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b8))
					{
						points();
                                                br.setStart(500, 115, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b4) || this.t.checkScore(this.b8)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
	
					}
					br.setCordinate(500,115,600,115,h8[4]);
					br.repaint();
					
				}

		}
		
		
		
		
		
		if((205 < e.getX()) && (e.getX() < 295) && (235 < e.getY()) && (e.getY() < 255)){
			
			System.out.println("h9");
			if(this.h9[4] == 0){
					this.h9[4] = this.line;
					
					if(this.t.checkScore(this.b5))
					{
						points();
                                                br.setStart(200, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b9))
					{
						points();
                                                br.setStart(200, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b5) || this.t.checkScore(this.b9)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(200,215,300,215,h9[4]);
					br.repaint();
					
				}

		}
		
		
		
		
		if((305 < e.getX()) && (e.getX() < 395) && (235 < e.getY()) && (e.getY() < 255)){
			
			System.out.println("h10");
			if(this.h10[4] == 0)
				{
					this.h10[4] = this.line;
					
					
					if(this.t.checkScore(this.b6))
					{
						points();
                                                br.setStart(300, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b10))
					{
						points();
                                                br.setStart(300, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b6) || this.t.checkScore(this.b10)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(300,215,400,215,h10[4]);
					br.repaint();
					
				}

			}
		
		
		
		if((405 < e.getX()) && (e.getX() < 495) && (235 < e.getY()) && (e.getY() < 255)){
			
			System.out.println("h11");
			if(this.h11[4] == 0)
				{
					this.h11[4] = this.line;
					
					
					if(this.t.checkScore(this.b7))
					{
						points();
                                                br.setStart(400, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b11))
					{
						points();
                                                br.setStart(400, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b7) || this.t.checkScore(this.b11)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
		
					}
					br.setCordinate(400,215,500,215,h11[4]);
					br.repaint();
					
				}

		}
		
		
		
		if((505 < e.getX()) && (e.getX() < 595) && (235 < e.getY()) && (e.getY() < 255)){
			
			System.out.println("h12");
			if(this.h12[4] == 0)
				{
					this.h12[4] = this.line;
					
					
					if(this.t.checkScore(this.b8))
					{
						points();
                                                br.setStart(500, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b12))
					{
						points();
                                                br.setStart(500, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b8) || this.t.checkScore(this.b12)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(500,215,600,215,h12[4]);
					br.repaint();
				}

		}
		
		
		
		if((205 < e.getX()) && (e.getX() < 295) && (335 < e.getY()) && (e.getY() < 355)){
			
			System.out.println("h13");
			
			if(this.h13[4] == 0)
				{
					this.h13[4] = this.line;
					
					
					if(this.t.checkScore(this.b13))
					{
						points();
                                                br.setStart(200, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b9))
					{
						points();
                                                br.setStart(200, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b13) || this.t.checkScore(this.b9)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(200,315,300,315,h13[4]);
					br.repaint();
					
				}

		}
		
		if((305 < e.getX()) && (e.getX() < 395) && (335 < e.getY()) && (e.getY() < 355)){
			
			System.out.println("h14");
			
			if(this.h14[4] == 0)
				{
					this.h14[4] = this.line;
					
					
					if(this.t.checkScore(this.b10))
					{
						points();
                                                br.setStart(300, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b14))
					{
						points();
                                                br.setStart(300, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b10) || this.t.checkScore(this.b14)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(300,315,400,315,h14[4]);
					br.repaint();
					
				}

		}
		
		
		if((405 < e.getX()) && (e.getX() < 495) && (335 < e.getY()) && (e.getY() < 355)){
			
			System.out.println("h15");
			
			if(this.h15[4] == 0)
				{
					this.h15[4] = this.line;
					
					
					if(this.t.checkScore(this.b11))
					{
						points();
                                                br.setStart(400, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b15))
					{
						points();
                                                br.setStart(400, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b15) || this.t.checkScore(this.b11)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(400,315,500,315,h15[4]);
					br.repaint();
					
				}

		}
		
		if((505 < e.getX()) && (e.getX() < 595) && (335 < e.getY()) && (e.getY() < 355)){
			
			System.out.println("h16");
			
			if(this.h16[4] == 0)
				{
					this.h16[4] = this.line;
					
					
					if(this.t.checkScore(this.b12))
					{
						points();
                                                br.setStart(500, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b16))
					{
						points();
                                                br.setStart(500, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b12) || this.t.checkScore(this.b16)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(500,315,600,315,h16[4]);
					br.repaint();
					
				}

		}
		
		
		
		if((205 < e.getX()) && (e.getX() < 295) && (435 < e.getY()) && (e.getY() < 455)){
			
			System.out.println("h17");
			
			if(this.h17[4] == 0)
				{
					this.h17[4] = this.line;
					
					
					if(this.t.checkScore(this.b13))
					{
						points();
                                                br.setStart(200, 315, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(200,415,300,415,h17[4]);
					br.repaint();
					
				}

		}
		
		if((305 < e.getX()) && (e.getX() < 395) && (435 < e.getY()) && (e.getY() < 455)){
			
			System.out.println("h18");
			
			if(this.h18[4] == 0)
				{
					this.h18[4] = this.line;
					
					
					if(this.t.checkScore(this.b14))
					{
						points();
                                                br.setStart(300, 315, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(300,415,400,415,h18[4]);
					br.repaint();
					
				}

		}
		
		if((405 < e.getX()) && (e.getX() < 495) && (435 < e.getY()) && (e.getY() < 455)){
			
			System.out.println("h19");
			
			if(this.h19[4] == 0)
				{
					this.h19[4] = this.line;
					
					
					if(this.t.checkScore(this.b15))
					{
						points();
                                                br.setStart(400, 315, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(400,415,500,415,h19[4]);
					br.repaint();
					
				}

		}
		
		if((505 < e.getX()) && (e.getX() < 595) && (435 < e.getY()) && (e.getY() < 455)){
			
			System.out.println("h20");
			
			if(this.h20[4] == 0)
				{
					this.h20[4] = this.line;
					
					
					if(this.t.checkScore(this.b16))
					{
						points();
                                                br.setStart(500, 315, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();

					}
					br.setCordinate(500,415,600,415,h20[4]);
					br.repaint();
					
				}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//verticle
		if((190 < e.getX()) && (e.getX() < 210) && (50 < e.getY()) && (e.getY() < 140)){
			
			System.out.println("v1");
		
			if(this.v1[4] == 0)
				{
					this.v1[4] = this.line;
					
					
					if(this.t.checkScore(this.b1))
					{
						points();
                                                br.setStart(200, 15, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(200,15,200,115,v1[4]);
					br.repaint();
					
				}

		}
		
		
		if((290 < e.getX()) && (e.getX() < 310) && (50 < e.getY()) && (e.getY() < 140)){
			
			System.out.println("v2");
			if(this.v2[4] == 0)
				{
					this.v2[4] = this.line;
					
					if(this.t.checkScore(this.b2))
					{
						points();
                                                br.setStart(300, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b1))
					{
						points();
                                                br.setStart(200, 15, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b2) || this.t.checkScore(this.b1)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(300,15,300,115,v2[4]);
					br.repaint();
					
				}

		}
		
		
		
		if((390 < e.getX()) && (e.getX() < 410) && (50 < e.getY()) && (e.getY() < 140)){
			
			System.out.println("v3");
			if(this.v3[4] == 0)
				{
					this.v3[4] = this.line;
					
					if(this.t.checkScore(this.b2))
					{
						points();
                                                br.setStart(300, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b3))
					{
						points();
                                                br.setStart(400, 15, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b2) || this.t.checkScore(this.b3)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(400,15,400,115,v3[4]);
					br.repaint();
				}

		}
		
		
		
		if((490 < e.getX()) && (e.getX() < 510) && (50 < e.getY()) && (e.getY() < 140)){
			
			System.out.println("v4");
			if(this.v4[4] == 0)
				{
					this.v4[4] = this.line;
					
					
					if(this.t.checkScore(this.b3))
					{
						points();
                                                br.setStart(400, 15, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b4))
					{
						points();
                                                br.setStart(500, 15, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b4) || this.t.checkScore(this.b3)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(500,15,500,115,v4[4]);
					br.repaint();
				}


		}
		
		
		
		
		if((590 < e.getX()) && (e.getX() < 610) && (50 < e.getY()) && (e.getY() < 140)){
			
			System.out.println("v5");
				if(this.v5[4] == 0)
				{
					this.v5[4] = this.line;
					
					
					if(this.t.checkScore(this.b4))
					{
						points();
                                                br.setStart(500, 15, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(600,15,600,115,v5[4]);
					br.repaint();
						
				}


		}
		
		
		
		
		
		if((190 < e.getX()) && (e.getX() < 210) && (150 < e.getY()) && (e.getY() < 240)){
			
			System.out.println("v6");
			if(this.v6[4] == 0)
				{
					this.v6[4] = this.line;
					
					if(this.t.checkScore(this.b5))
					{
						points();
                                                br.setStart(200, 115, 99, 99,1);
                                                br.repaint();
					}
				
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(200,115,200,215,v6[4]);
					br.repaint();
				}

		}
		
		
		
		if((290 < e.getX()) && (e.getX() < 310) && (150 < e.getY()) && (e.getY() < 240)){
			
			System.out.println("v7");
			if(this.v7[4] == 0)
				{
					this.v7[4] = this.line;
					
					if(this.t.checkScore(this.b6))
					{
						points();
                                                br.setStart(300, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b5))
					{
						points();
                                                br.setStart(200, 115, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b6) || this.t.checkScore(this.b5)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(300,115,300,215,v7[4]);
					br.repaint();
				}

		}
		
		
		
		if((390 < e.getX()) && (e.getX() < 410) && (150 < e.getY()) && (e.getY() < 240)){
			
			System.out.println("v8");
			if(this.v8[4] == 0)
				{
					this.v8[4] = this.line;
					
					
					if(this.t.checkScore(this.b6))
					{
						points();
                                                br.setStart(300, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b7))
					{
						points();
                                                br.setStart(400, 115, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b6) || this.t.checkScore(this.b7)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
						
					}
					br.setCordinate(400,115,400,215,v8[4]);
					br.repaint();
				}


		}
		
		
		
		
		if((490 < e.getX()) && (e.getX() < 510) && (150 < e.getY()) && (e.getY() < 240)){
			
			System.out.println("v9");
			if(this.v9[4] == 0)
				{
					this.v9[4] = this.line;
					
					
					if(this.t.checkScore(this.b7))
					{
						points();
                                                br.setStart(400, 115, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b8))
					{
						points();
                                                br.setStart(500, 115, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b7) || this.t.checkScore(this.b8)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
						
					}
					br.setCordinate(500,115,500,215,v9[4]);
					br.repaint();
				}


		}
		
		
		
		if((590 < e.getX()) && (e.getX() < 610) && (150 < e.getY()) && (e.getY() < 240)){
			
			System.out.println("v10");
			if(this.v10[4] == 0)
				{
					this.v10[4] = this.line;
					
					if(this.t.checkScore(this.b8))
					{
						points();
                                                br.setStart(500, 115, 99, 99,1);
                                                br.repaint();
					}
					
					
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(600,115,600,215,v10[4]);
					br.repaint();
				}

		}
		
		
		
		
		
		if((190 < e.getX()) && (e.getX() < 210) && (250 < e.getY()) && (e.getY() < 340)){
			
			System.out.println("v11");
			if(this.v11[4] == 0)
				{
					this.v11[4] = this.line;
					
					if(this.t.checkScore(this.b9))
					{
						points();
                                                br.setStart(200, 215, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(200,215,200,315,v11[4]);
					br.repaint();
				}

		}
		
		
		
		if((290 < e.getX()) && (e.getX() < 310) && (250 < e.getY()) && (e.getY() < 340)){
			
			System.out.println("v12");
			if(this.v12[4] == 0)
				{
					this.v12[4] = this.line;
					
					
					if(this.t.checkScore(this.b9))
					{
						points();
                                                br.setStart(200, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b10))
					{
						points();
                                                br.setStart(300, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b9) || this.t.checkScore(this.b10)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
						
					}
					br.setCordinate(300,215,300,315,v12[4]);
					br.repaint();
					
				}


		}
		
		if((390 < e.getX()) && (e.getX() < 410) && (250 < e.getY()) && (e.getY() < 340)){
			
			System.out.println("v13");
		
			if(this.v13[4] == 0)
				{
					this.v13[4] = this.line;
					
					
					if(this.t.checkScore(this.b10))
					{
						points();
                                                br.setStart(300, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b11))
					{
						points();
                                                br.setStart(400, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b10) || this.t.checkScore(this.b11)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(400,215,400,315,v13[4]);
					br.repaint();
					
				}

		}
		
		if((490 < e.getX()) && (e.getX() < 510) && (250 < e.getY()) && (e.getY() < 340)){
			
			System.out.println("v14");
		
			if(this.v14[4] == 0)
				{
					this.v14[4] = this.line;
					
					
					if(this.t.checkScore(this.b11))
					{
						points();
                                                br.setStart(400, 215, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b12))
					{
						points();
                                                br.setStart(500, 215, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b12) || this.t.checkScore(this.b11)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(500,215,500,315,v14[4]);
					br.repaint();
					
				}

		}
		if((590 < e.getX()) && (e.getX() < 610) && (250 < e.getY()) && (e.getY() < 340)){
			
			System.out.println("v15");
		
			if(this.v15[4] == 0)
				{
					this.v15[4] = this.line;
					
					
					if(this.t.checkScore(this.b12))
					{
						points();
                                                br.setStart(500, 215, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(600,215,600,315,v15[4]);
					br.repaint();
					
				}

		}
		
		
		if((190 < e.getX()) && (e.getX() < 210) && (350 < e.getY()) && (e.getY() < 440)){
			
			System.out.println("v16");
		
			if(this.v16[4] == 0)
				{
					this.v16[4] = this.line;
					
					
					if(this.t.checkScore(this.b13))
					{
						points();
                                                br.setStart(200, 315, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(200,315,200,415,v16[4]);
					br.repaint();
					
				}

		}
		
		if((290 < e.getX()) && (e.getX() < 310) && (350 < e.getY()) && (e.getY() < 440)){
			
			System.out.println("v17");
		
			if(this.v17[4] == 0)
				{
					this.v17[4] = this.line;
					
					
					if(this.t.checkScore(this.b13))
					{
						points();
                                                br.setStart(200, 315, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b14))
					{
						points();
                                                br.setStart(300, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b13) || this.t.checkScore(this.b14)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(300,315,300,415,v17[4]);
					br.repaint();
					
				}

		}
		if((390 < e.getX()) && (e.getX() < 410) && (350 < e.getY()) && (e.getY() < 440)){
			
			System.out.println("v18");
		
			if(this.v18[4] == 0)
				{
					this.v18[4] = this.line;
					
					
					if(this.t.checkScore(this.b14))
					{
						points();
                                                br.setStart(300, 315, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b15))
					{
						points();
                                                br.setStart(400, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b14) || this.t.checkScore(this.b15)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(400,315,400,415,v18[4]);
					br.repaint();
					
				}

		}
		if((490 < e.getX()) && (e.getX() < 510) && (350 < e.getY()) && (e.getY() < 440)){
			
			System.out.println("v19");
		
			if(this.v19[4] == 0)
				{
					this.v19[4] = this.line;
					
					
					if(this.t.checkScore(this.b15))
					{
						points();
                                                br.setStart(400, 315, 99, 99,1);
                                                br.repaint();
					}
					if(this.t.checkScore(this.b16))
					{
						points();
                                                br.setStart(500, 315, 99, 99,1);
                                                br.repaint();
					}
					
					if(!(this.t.checkScore(this.b16) || this.t.checkScore(this.b15)))
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(500,315,500,415,v19[4]);
					br.repaint();
					
				}

		}
		
		if((590 < e.getX()) && (e.getX() < 610) && (350 < e.getY()) && (e.getY() < 440)){
			
			System.out.println("v20");
		
			if(this.v20[4] == 0)
				{
					this.v20[4] = this.line;
					
					
					if(this.t.checkScore(this.b16))
					{
						points();
                                                br.setStart(500, 315, 99, 99,1);
                                                br.repaint();
					}
					else
					{
						this.p1.switchTurn();
						this.p2.switchTurn();
						this.switchPointers();
						
					}
					br.setCordinate(600,315,600,415,v20[4]);
					br.repaint();
					
				}

		}
		
		
		
		if(this.t.checkGameOver(this.totalBoxes))
		{
			overWindow over = new overWindow(this);
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