package java_chess;

import java.awt.Graphics2D;
import java.util.ArrayList;

public abstract class Piece {
	protected ArrayList<ArrayList<Integer>> moves;
	protected PieceColour colour;
	
	public Piece(PieceColour colour) {
		this.moves = new ArrayList<ArrayList<Integer>>();
		this.colour = colour;
	}
	
//	int[][] with row, col coords of each possible move
	public abstract int[][] getLegalMoves(Board b);

	public abstract void move(Board b);

	public abstract void draw(Graphics2D g2, int x, int y, int size);
	
	public abstract void setPos(int x, int y);

}
