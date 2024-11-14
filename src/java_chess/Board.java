package java_chess;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Board {
	public static final int nRows = 8;
	public static final int nCols = 8;

	public static final int sizeMultiplier = 5;
	public static final int boardSqSize = 20 * sizeMultiplier;

	private static final Color dark = new Color(139, 69, 19);
	private static final Color light = new Color(245, 245, 220);

	private Square[][] board;

	public int getBoardSqSize() {
		return boardSqSize;
	}

	public void initialiseState() {
		this.board = new Square[nRows][nCols];
		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				Color sqColour = (i + j) % 2 == 0 ? light : dark;
				board[i][j] = new Square(i, j, sqColour, boardSqSize);
			}
		}
	}

	public void draw(Graphics2D g2, int padding) {
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

	public Square[][] getBoard() {
		return this.board;
	}

	public void setBoard(Square[][] board) {
		this.board = board;
	}

}
