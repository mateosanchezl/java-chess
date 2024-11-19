package java_chess;

import java.awt.Color;
import java.awt.Graphics2D;
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

	private void initialisePieceRow(Square[] row, PieceColour colour) {
		Map<Integer, Piece> initialPiecePlacementMap = Map.of(0, new Rook(colour), 1, new Knight(colour), 2,
				new Bishop(colour), 3, new Queen(colour), 4, new King(colour), 5, new Bishop(colour), 6,
				new Knight(colour), 7, new Rook(colour));

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
					board[i][j].setPiece(new Pawn(PieceColour.DARK));
				else if (i == 6)
					board[i][j].setPiece(new Pawn(PieceColour.LIGHT));

			}

			if (i == 0)
				initialisePieceRow(this.board[i], PieceColour.DARK);
			else if (i == 7)
				initialisePieceRow(this.board[i], PieceColour.LIGHT);
		}

		this.initialised = true;
	}

	public void draw(Graphics2D g2, int padding) {
		if (this.initialised) {
			int x = 0 + padding / 2;
			int y = 0 + padding / 2;

			for (Square[] row : this.board) {
				for (Square sq : row) {
					sq.draw(x, y, g2);
					x += boardSqSize;
				}
				x = 0 + padding / 2;
				y += boardSqSize;
			}
		}
	}

	public Square[][] getBoard() {
		return this.board;
	}

	public void setBoard(Square[][] board) {
		this.board = board;
	}

}
