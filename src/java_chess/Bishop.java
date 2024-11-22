package java_chess;

import java.util.ArrayList;

public class Bishop extends Piece {
    private final int val = 3;

    public Bishop(PieceColour colour, int i, int j) {
        super(colour, "Chess_blt60.png", "Chess_bdt60.png", i, j);
    }

    @Override
    public ArrayList<int[]> getLegalMoves(Board b) {
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
