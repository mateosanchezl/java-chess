package java_chess;

import java.util.ArrayList;
import java.util.Random;

public class MoveGenerator {
    Random rnd = new Random();
    Board b;

    public MoveGenerator(Board b) {
        this.b = b;
    }

    public ArrayList<ArrayList<int[]>> getAllPossibleMoves() {
        ArrayList<ArrayList<int[]>> moves = new ArrayList<>();
        for (Square[] row : this.b.getBoard()) {
            for (Square sq : row) {
                if (sq.getPiece() != null && sq.getPiece().getColour() == b.pieceColourTurn()) {
                    Piece pc = sq.getPiece();
                    if (pc.getClass() == Pawn.class) {
                        moves.add(pc.getLegalMoves(this.b));
                    }
                }

            }
        }
        return moves;
    }

    public int[] getRandomMove() {
        ArrayList<ArrayList<int[]>> moves = getAllPossibleMoves();
        int numPieceMoves = moves.size();

        int rndPieceIdx = rnd.nextInt(numPieceMoves);
        int rndMoveIdx = rnd.nextInt(moves.get(0).size());

        return moves.get(rndPieceIdx).get(rndMoveIdx);
    }
}
