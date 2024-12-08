package java_chess;

import java.util.ArrayList;

public class Queen extends Piece {
    private final int val = 9;

    public Queen(PieceColour colour, int i, int j) {
        super(colour, i, j, colour == PieceColour.LIGHT ? 'q' : 'Q');
    }

    @Override
    public ArrayList<int[]> getLegalMoves(Board b) {
        // TODO Auto-generated method stu
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
