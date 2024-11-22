package java_chess;

import java.util.ArrayList;

public class Pawn extends Piece {
    private final int val = 1;

    public Pawn(PieceColour colour, int i, int j) {
        super(colour, "Chess_plt60.png", "Chess_pdt60.png", i, j);
    }

    @Override
    public ArrayList<int[]> getLegalMoves(Board b) {
        ArrayList<int[]> legalMoves = new ArrayList<>();
        Square[][] boardMatrix = b.getBoard();

        // TODO: Array out of bounds fix
        if (this.colour == PieceColour.LIGHT) {
            // Move forward
            if (boardMatrix[this.row - 1][this.col].getPiece() == null) {
                legalMoves.add(new int[]{-1, 0});
            }
            // Pawn hasn't moved
            if (this.moves.isEmpty()) {
                // Check double move
                if (boardMatrix[this.row - 2][this.col].getPiece() == null && boardMatrix[this.row - 1][this.col].getPiece() == null) {
                    legalMoves.add(new int[]{-2, 0});
                }

            }
            // Take on diagonals
            if (boardMatrix[this.row - 1][this.col + 1].getPiece().getClass() == Pawn.class) {
                legalMoves.add(new int[]{-1, 1});
            }
            if (boardMatrix[this.row - 1][this.col - 1].getPiece().getClass() == Pawn.class) {
                legalMoves.add(new int[]{-1, -1});
            }

        } else {
            if (boardMatrix[this.row + 1][this.col].getPiece() == null) {
                legalMoves.add(new int[]{1, 0});
            }

            if (this.moves.isEmpty()) {
                if (boardMatrix[this.row + 2][this.col].getPiece() == null && boardMatrix[this.row + 1][this.col].getPiece() == null) {
                    legalMoves.add(new int[]{2, 0});
                }
            }

            if (boardMatrix[this.row + 1][this.col + 1].getPiece() != null) {   // TODO: Add this check for light colour
                if (boardMatrix[this.row + 1][this.col + 1].getPiece().getClass() == Pawn.class) {
                    legalMoves.add(new int[]{1, 1});
                }
            }

            if (boardMatrix[this.row + 1][this.col - 1].getPiece() != null) {
                if (boardMatrix[this.row + 1][this.col - 1].getPiece().getClass() == Pawn.class) {
                    legalMoves.add(new int[]{1, -1});
                }
            }


        }
        return legalMoves;
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
