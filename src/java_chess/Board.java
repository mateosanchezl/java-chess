package java_chess;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Map;

public class Board {
    public static final int nRows = 8;
    public static final int nCols = 8;

    public static final int sizeMultiplier = 5;
    public static final int boardSqSize = 20 * sizeMultiplier;

    private static final Color dark = new Color(139, 69, 19);
    private static final Color light = new Color(245, 245, 220);

    private Square[][] board;
    private boolean initialised = false;

    private void initialisePieceRow(Square[] row, PieceColour colour, int rowIndex) {
        Map<Integer, Piece> initialPiecePlacementMap = Map.of(0, new Rook(colour, rowIndex, 0), 1, new Knight(colour, rowIndex, 1), 2,
                new Bishop(colour, rowIndex, 2), 3, new Queen(colour, rowIndex, 3), 4, new King(colour, rowIndex, 4), 5, new Bishop(colour, rowIndex, 5), 6,
                new Knight(colour, rowIndex, 6), 7, new Rook(colour, rowIndex, 7));

        for (int i = 0; i < row.length; i++) {
            row[i].setPiece(initialPiecePlacementMap.get(i));
        }
    }

    public int getBoardSqSize() {
        return boardSqSize;
    }

    public void initialiseState() {
        this.board = new Square[nRows][nCols];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                // Get colour
                Color sqColour = (i + j) % 2 == 0 ? light : dark;
                // Set square
                board[i][j] = new Square(i, j, sqColour, boardSqSize);
                // Set pawn rows
                if (i == 1)
                    board[i][j].setPiece(new Pawn(PieceColour.DARK, i, j));
                else if (i == 6)
                    board[i][j].setPiece(new Pawn(PieceColour.LIGHT, i, j));

            }

            if (i == 0)
                initialisePieceRow(this.board[i], PieceColour.DARK, i);
            else if (i == 7)
                initialisePieceRow(this.board[i], PieceColour.LIGHT, i);
        }

        this.initialised = true;
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[i][j].getPiece() != null) {
                    if (this.board[i][j].getPiece().getClass() == Pawn.class) {
                        ArrayList<int[]> legMoves = this.board[i][j].getPiece().getLegalMoves(this);
                        System.out.println("Pawn at " + i + " " + j + " has moves: ");
                        for (int[] move : legMoves) {
                            System.out.println(move[0] + " " + move[1]);
                        }
                    }
                }
            }
        }

    }

    public Square[][] getBoard() {
        return this.board;
    }

    public void showState() {
        for (Square[] row : this.board) {
            for (Square sq : row) {
                if (sq.getPiece() != null) {

                    System.out.print("[ " + sq.getPiece().getChar() + " ]");
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.print("\n");
        }
    }

    public void setBoard(Square[][] board) {
        this.board = board;
    }

}
