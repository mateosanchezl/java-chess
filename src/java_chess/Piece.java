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
    protected BufferedImage image;
    protected String LIGHT_IMAGE_FILE;
    protected String DARK_IMAGE_FILE;
    protected int row;
    protected int col;

    public Piece(PieceColour colour, String lightImagePath, String darkImagePath, int row, int col) {
        this.moves = new ArrayList<>();
        this.colour = colour;
        this.LIGHT_IMAGE_FILE = lightImagePath;
        this.DARK_IMAGE_FILE = darkImagePath;
        this.row = row;
        this.col = col;

        String fileName = this.colour == PieceColour.LIGHT ? this.LIGHT_IMAGE_FILE : this.DARK_IMAGE_FILE;
        URL imageUrl = getClass().getResource("/piece_images/" + fileName);

        if (imageUrl != null) {
            try {
                this.image = ImageIO.read(imageUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Image not found: " + "/piece_images/" + fileName);
        }
    }

    public void draw(Graphics2D g2, int x, int y, int size) {
        if (image != null) {
            g2.drawImage(image, x, y, size, size, null);
        }
    }

    ;

    //	int[][] with row, col coords of each possible move
    public abstract ArrayList<int[]> getLegalMoves(Board b);

    public abstract void move(Board b);

    public abstract void setPos(int x, int y);
    
}
