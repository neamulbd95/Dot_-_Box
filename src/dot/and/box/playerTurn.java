package dot.and.box;
public class playerTurn{

	
	boolean gameOver = false;
	Player p1;
	Player p2;
	

	public playerTurn(Player p1, Player p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		
		this.p1.setTurn(true);
		this.p2.setTurn(false);
			
	}
	
	public boolean checkScore(int[][] box)
	{
		for(int i = 0; i < box.length; i++)
		{
			if(box[i][4] == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public boolean checkGameOver(int[][][] totalBoxes)
	{
		
		for(int i = 0; i < totalBoxes.length; i++)
		{
			for(int x = 0; x < totalBoxes[i].length; x++)
			{
				
					if(totalBoxes[i][x][4] == 0)
					{
						return false;
					}
				
			}
		}
		return true;
	}
}
