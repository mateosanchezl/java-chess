package java_chess;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Rook extends Piece {
    private final int val = 1;

    public Rook(PieceColour colour, int i, int j) {
        super(colour, i, j, colour == PieceColour.LIGHT ? 'r' : 'R');
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
