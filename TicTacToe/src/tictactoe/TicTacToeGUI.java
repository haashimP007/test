package tictactoe;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TicTacToeGUI extends JFrame {
	
	private Container pane;
	private String CurrentPlayer;
	private JButton [] [] board;
	private boolean HasWinner;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem quit;
	private JMenuItem newGame;
	
	public TicTacToeGUI() {
		
		super();
		pane = getContentPane();
		pane.setLayout(new GridLayout(3,3));
		setTitle("Tic Tac Toe");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		CurrentPlayer = "X";
		board = new JButton [3] [3];
		HasWinner = false;
		initializeBoard();
		initializeMenuBar();
		
		
	}
	
	private void initializeMenuBar() {
		
		menuBar = new JMenuBar();
		menu = new JMenu("Options");
		newGame = new JMenuItem("New Game");
		
		newGame.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				resetBoard();
				
			}
		});
		
		quit = new JMenuItem("Quit");
		quit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		menu.add(newGame);
		menu.add(quit);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
	}
	
	private void resetBoard() {
		
		CurrentPlayer = "X";
		HasWinner = false;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j].setText(null);
				
			}
		}
		
	}
	
	private void initializeBoard() {
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				JButton btn = new JButton();
				btn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,100));
				board [i][j] = btn;
				btn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						if (((JButton)e.getSource()).getText().equals("") &&
								HasWinner == false) {
							btn.setText(CurrentPlayer);
							HasWinner();
							togglePlayer();
						}
					}
					
				});
				pane.add(btn);
				
				}
		}
	}
	
	private void togglePlayer() {
		
		if(CurrentPlayer.equals("X")) {
			CurrentPlayer = "O";
		}
		else {
			CurrentPlayer = "X";
		}
	}
	
	private void HasWinner() {
		
		/////////////////////Winning combinations in horizantal//////////////////////////////
		
		if(board [0][0].getText().equals(CurrentPlayer) && board[1][0].getText().equals(CurrentPlayer) && board[2][0].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
			
		}
		
        if(board [0][1].getText().equals(CurrentPlayer) && board[1][1].getText().equals(CurrentPlayer) && board[2][1].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}
        
        if(board [0][2].getText().equals(CurrentPlayer) && board[1][2].getText().equals(CurrentPlayer) && board[2][2].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}
        
        ////////////////////Winning combinations in vertical//////////////////////////
        
        if(board [0][0].getText().equals(CurrentPlayer) && board[0][1].getText().equals(CurrentPlayer) && board[0][2].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}
        
       if(board [1][0].getText().equals(CurrentPlayer) && board[1][1].getText().equals(CurrentPlayer) && board[1][2].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}
       
       if(board [2][0].getText().equals(CurrentPlayer) && board[2][1].getText().equals(CurrentPlayer) && board[2][2].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}
		
       ///////////////////Winning combinations in diagonal//////////////////////////
       
       if(board [0][0].getText().equals(CurrentPlayer) && board[1][1].getText().equals(CurrentPlayer) && board[2][2].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}
		
       if(board [2][0].getText().equals(CurrentPlayer) && board[1][1].getText().equals(CurrentPlayer) && board[0][2].getText().equals(CurrentPlayer)) {
			
			JOptionPane.showMessageDialog(null, "Player " + CurrentPlayer + "HasWon");
			HasWinner = true;
		}	
	}
}
