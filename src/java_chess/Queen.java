package java_chess;

public class Queen extends Piece {
    private final int val = 9;

    public Queen(PieceColour colour, int i, int j) {
        super(colour, "Chess_qlt60.png", "Chess_qdt60.png", i, j);
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
