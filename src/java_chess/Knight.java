package java_chess;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Knight extends Piece {
	private final String LIGHT_IMAGE_FILE = "Chess_nlt60.png";
	private final String DARK_IMAGE_FILE = "Chess_ndt60.png";
	private BufferedImage image;
	private String imagePath;
	private final int val = 3;
	
	public Knight(PieceColour colour) {
		super(colour);
		String fileName = colour == PieceColour.LIGHT ? LIGHT_IMAGE_FILE : DARK_IMAGE_FILE;

        // Use getClass().getResource() to load the image
        URL imageUrl = getClass().getResource("/piece_images/" + fileName);

        if (imageUrl != null) {
            try {
                image = ImageIO.read(imageUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Image not found: " + "/piece_images/" + fileName);
        }
	}

	@Override
	public int[][] getLegalMoves(Board b) {
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

	@Override
	public void draw(Graphics2D g2, int x, int y, int size) {
		if (image != null) {
			g2.drawImage(image, x, y, size, size, null);
		}
	}

}
