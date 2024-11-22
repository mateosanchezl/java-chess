package java_chess;

public class Knight extends Piece {
    private final int val = 3;

    public Knight(PieceColour colour, int i, int j) {
        super(colour, "Chess_nlt60.png", "Chess_ndt60.png", i, j);
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
