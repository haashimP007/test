package tictactoe;

import javax.swing.SwingUtilities;

public class MainXO {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				new TicTacToeGUI();
				
				
				
			}
			
		}
				);
		
		

	}

}
