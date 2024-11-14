package java_chess;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Chess");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		window.pack();
		

		
		gamePanel.startGameThread();
		 
	}

}
