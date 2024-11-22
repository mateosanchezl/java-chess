package java_chess;

import java.util.ArrayList;

public class King extends Piece {
    public King(PieceColour colour, int i, int j) {
        super(colour, "Chess_klt60.png", "Chess_kdt60.png", i, j);
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
