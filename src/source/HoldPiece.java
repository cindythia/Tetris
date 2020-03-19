package source;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class HoldPiece extends Piece {

	public HoldPiece(BufferedImage block, int[][] coords, Board board, int color) {
		super(block, coords, board, color);
		// TODO Auto-generated constructor stub
	}
	
	public bool coord_point(int x, int y)
	{
		if(coords[y][x]!=0)	{
			return true;
		}
		else{
			return false;
		}
	}
	public int len(int n)
	{
		if (coords[n].length !=4 && coords[n].length !=2){
			return 0;
		}
		else if (coords[n].length ==4){
			return 1;
		return -1;
	}
	@Override
	public void render(Graphics g) {
		for (int y = 0; y < coords.length; y++) {
			for (int x = 0; x < coords[y].length; x++) {
				//if (coords[y][x] != 0 && coords[0].length != 4 && coords[0].length != 2)
				//	g.drawImage(block, x * Board.BLOCKSIZE + 425, y * Board.BLOCKSIZE + 2 * board.getIndentY() + 80,
				//			null);
				//else if (coords[y][x] != 0 && coords[0].length == 4)
				//	g.drawImage(block, x * Board.BLOCKSIZE + 415, y * Board.BLOCKSIZE + 2 * board.getIndentY() + 85,
				//			null);
				//else if (coords[y][x] != 0)
				//	g.drawImage(block, x * Board.BLOCKSIZE + 440, y * Board.BLOCKSIZE + 2 * board.getIndentY() + 80,
				//			null);
				
				if(coord_point(x, y) ==true && len(0)==0){
					g.drawImage(block, x * Board.BLOCKSIZE + 425, y * Board.BLOCKSIZE + 2 * board.getIndentY() + 80,
							null);
				else if(coords_point(x, y)==true && len(0)==1){
					g.drawImage(block, x * Board.BLOCKSIZE + 415, y * Board.BLOCKSIZE + 2 * board.getIndentY() + 85,
							null);
				}
				else if (coords_point(x, y)==true){
					g.drawImage(block, x * Board.BLOCKSIZE + 440, y * Board.BLOCKSIZE + 2 * board.getIndentY() + 80,
							null);
				}
			}
		}
	}

}
