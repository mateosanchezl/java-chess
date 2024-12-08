package java_chess;

import java.util.ArrayList;

public class Knight extends Piece {
    private final int val = 3;

    public Knight(PieceColour colour, int i, int j) {
        super(colour, i, j, colour == PieceColour.LIGHT ? 'n' : 'N');
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
