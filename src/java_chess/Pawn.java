package java_chess;

public class Pawn extends Piece {
    private final int val = 1;

    public Pawn(PieceColour colour, int i, int j) {
        super(colour, "Chess_plt60.png", "Chess_pdt60.png", i, j);
    }

    @Override
    public int[][] getLegalMoves(Board b) {
        if (this.colour == PieceColour.LIGHT) {
            // Pawn hasn't moved
            if (this.moves.isEmpty()) {
                // Square empty
                if (b.getBoard()[this.row - 2][this.col].getPiece() == null) {
                    if (b.getBoard()[this.row - 1][this.col].getPiece() == null) {
                        int[][] moves = {
                                {-2, 0},
                                {-1, 0}
                        };

                        return moves;
                    }

                }
            }
        }
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
