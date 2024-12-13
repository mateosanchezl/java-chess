package java_chess;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public abstract class Piece {
    protected ArrayList<ArrayList<Integer>> moves;
    protected PieceColour colour;
    protected int row;
    protected int col;
    protected char pieceChar;

    public Piece(PieceColour colour, int row, int col, char pieceChar) {
        this.moves = new ArrayList<>();
        this.colour = colour;
        this.row = row;
        this.col = col;
        this.pieceChar = pieceChar;
    }

    //	int[][] with row, col coords of each possible move
    public abstract ArrayList<int[]> getLegalMoves(Board b);

    public abstract void move(Board b);

    public abstract void setPos(int x, int y);

    public char getChar() {
        return this.pieceChar;
    }

    public PieceColour getColour() {
        return this.colour;
    }

}
