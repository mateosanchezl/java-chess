package java_chess;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	// Thread
	Thread gameThread;

	// Board
	Board board = new Board();
	
	// Screen settings
	final private int gridSquares = Board.nRows; // 8x8
	final private int gridSquareSize = board.getBoardSqSize();
	final private int padding = 100;
	
	final private int screenWidth = gridSquareSize * gridSquares + padding;
	final private int screenHeight = gridSquareSize * gridSquares + padding;
	




	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
		
		// Initialise board
		board.initialiseState();

	}

	@Override
	public void run() {
		while (gameThread != null) {
			update();
			repaint();
		}
	}

	public void update() {
		
	}

	// Draw
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; 

		board.draw(g2, padding);
		
	}
		

}
