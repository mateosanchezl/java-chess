package java_chess;

import java.util.ArrayList;

public abstract class Piece {
	protected final String PIECE_IMAGE_BASE_PATH = "./piece_images/";
	protected ArrayList<ArrayList<Integer>> moves;
	protected PieceColour colour;
	
	public Piece(PieceColour colour) {
		this.moves = new ArrayList<ArrayList<Integer>>();
		this.colour = colour;
	}
	
//	int[][] with row, col coords of each possible move
	public abstract int[][] getLegalMoves(Board b);

	public abstract void move(Board b);

	public abstract void draw();
	
	public abstract void setPos(int x, int y);

}
