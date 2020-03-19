package source;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class NextPiece extends Piece {

	public NextPiece(BufferedImage block, int[][] coords, Board board, int color) {
		super(block, coords, board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {
		for (int y = 0; y < coords.length; y++) {
			for (int x = 0; x < coords[y].length; x++) {
				if (coord_point(x, y)==true && len(0)==0)
					g.drawImage(block, x * Board.BLOCKSIZE + 425, y * Board.BLOCKSIZE + 2 * board.getIndentY() - 5,
							null);
				else if (coord_point(x, y)==true && len(0)==1)
					g.drawImage(block, x * Board.BLOCKSIZE + 415, y * Board.BLOCKSIZE + 2 * board.getIndentY(), null);
				else if (coord_point(x,y)==true)
					g.drawImage(block, x * Board.BLOCKSIZE + 440, y * Board.BLOCKSIZE + 2 * board.getIndentY() - 5,
							null);
			}
		}
	}

}
