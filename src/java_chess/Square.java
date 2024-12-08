package java_chess;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Square {
    private int row;
    private int col;
    private int size;
    private Color colour;
    private Piece piece = null;

    public Square(int row, int col, Color colour, int size) {
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.size = size;
    }

    public int[] getPos() {
        int[] pos = {this.row, this.col};
        return pos;
    }

    public Color getColour() {
        return this.colour;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void clear() {
        this.piece = null;
    }

}
