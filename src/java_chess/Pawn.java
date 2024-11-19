package java_chess;

public class Pawn extends Piece {
	private final int val = 1;

	public Pawn(PieceColour colour) {
		super(colour, "Chess_plt60.png", "Chess_pdt60.png");
	}

	@Override
	public int[][] getLegalMoves(Board b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move(Board b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub

	}

}
