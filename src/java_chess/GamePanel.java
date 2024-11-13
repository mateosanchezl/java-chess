package java_chess;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	
	// Screen settings
	final int gridSquareSize = 10;
	final int gridSquares = 8; // 8x8
	final int mult = 5;
	final int screenWidth = gridSquareSize * gridSquares * mult;
	final int screenHeight = gridSquareSize * gridSquares * mult;
	
	// Thread
	Thread gameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		while(gameThread != null) {
			update();
			repaint();
		}
	}
	
	public void update() {
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.black);
		g2.fillRect(20, 20, 50, 50);
	}
	
	
	
}
