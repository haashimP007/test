package mastermind;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Game {

	private JFrame frame;
	int difficulty;
	int trys;
	int X_Position_Last_Try_Var = 140;
	int correct_color = 0;
	int correct_position = 0;
	
	int color_btn1_var = 0;
	int color_btn2_var = 0;
	int color_btn3_var = 0;
	int color_btn4_var = 0;
	
	int guess_color_btn1_var = 0;
	int guess_color_btn2_var = 0;
	int guess_color_btn3_var = 0;
	int guess_color_btn4_var = 0;
	
	int temp_color_btn1_var = 0;
	int temp_color_btn2_var = 0;
	int temp_color_btn3_var = 0;
	int temp_color_btn4_var = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//////////////Code buttons in the right//////////////
		
		////////////////Game actions//////////////////////
		
		JButton color_btn1 = new JButton("");
		color_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 guess_color_btn1_var++;
					
					if (guess_color_btn1_var >= 6) {
						color_btn1_var = 0;
					}
					
					if (guess_color_btn1_var == 0) {
						color_btn1.setBackground(Color.blue);
					}
					
					if (guess_color_btn1_var == 1) {
						color_btn1.setBackground(Color.red);
					}
					
					if (guess_color_btn1_var == 2) {
						color_btn1.setBackground(Color.yellow);
					}
					
					if (guess_color_btn1_var == 3) {
						color_btn1.setBackground(Color.green);
					}
					
					if (guess_color_btn1_var == 4) {
						color_btn1.setBackground(Color.pink);
					}
					
					if (guess_color_btn1_var == 5) {
						color_btn1.setBackground(Color.magenta);
					}
				
				
			}
		});
		color_btn1.setBounds(42, 39, 92, 57);
		color_btn1.setBackground(Color.blue);
		frame.getContentPane().add(color_btn1);
		
		JButton color_btn2 = new JButton("");
		color_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess_color_btn2_var++;
				
				if (guess_color_btn2_var >= 6) {
					color_btn2_var = 0;
				}
				
				if (guess_color_btn2_var == 0) {
					color_btn2.setBackground(Color.blue);
				}
				
				if (guess_color_btn2_var == 1) {
					color_btn2.setBackground(Color.red);
				}
				
				if (guess_color_btn2_var == 2) {
					color_btn2.setBackground(Color.yellow);
				}
				
				if (guess_color_btn2_var == 3) {
					color_btn2.setBackground(Color.green);
				}
				
				if (guess_color_btn2_var == 4) {
					color_btn2.setBackground(Color.pink);
				}
				
				if (guess_color_btn2_var == 5) {
					color_btn2.setBackground(Color.magenta);
				}
			
				
			}
		});
		color_btn2.setBounds(42, 154, 92, 63);
		color_btn2.setBackground(Color.blue);
		frame.getContentPane().add(color_btn2);
		
		JButton color_btn3 = new JButton("");
		color_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess_color_btn3_var++;
				
				if (guess_color_btn3_var >= 6) {
					color_btn3_var = 0;
				}
				
				if (guess_color_btn3_var == 0) {
					color_btn3.setBackground(Color.blue);
				}
				
				if (guess_color_btn3_var == 1) {
					color_btn3.setBackground(Color.red);
				}
				
				if (guess_color_btn3_var == 2) {
					color_btn3.setBackground(Color.yellow);
				}
				
				if (guess_color_btn3_var == 3) {
					color_btn3.setBackground(Color.green);
				}
				
				if (guess_color_btn3_var == 4) {
					color_btn3.setBackground(Color.pink);
				}
				
				if (guess_color_btn3_var == 5) {
					color_btn3.setBackground(Color.magenta);
				}
			
			}
		});
		color_btn3.setBounds(42, 266, 92, 63);
		color_btn3.setBackground(Color.blue);
		frame.getContentPane().add(color_btn3);
		
		JButton color_btn4 = new JButton("");
		color_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess_color_btn4_var++;
				
				if (guess_color_btn4_var >= 6) {
					color_btn4_var = 0;
				}
				
				if (guess_color_btn4_var == 0) {
					color_btn4.setBackground(Color.blue);
				}
				
				if (guess_color_btn4_var == 1) {
					color_btn4.setBackground(Color.red);
				}
				
				if (guess_color_btn4_var == 2) {
					color_btn4.setBackground(Color.yellow);
				}
				
				if (guess_color_btn4_var == 3) {
					color_btn4.setBackground(Color.green);
				}
				
				if (guess_color_btn4_var == 4) {
					color_btn4.setBackground(Color.pink);
				}
				
				if (guess_color_btn4_var == 5) {
					color_btn4.setBackground(Color.magenta);
				}
			
			}
		});
		color_btn4.setBounds(36, 377, 98, 63);
		color_btn4.setBackground(Color.blue);
		frame.getContentPane().add(color_btn4);
		
		
		////////////////Guess buttons in the right////////////////////////////////////////////////////////////
		
		JButton guess_color_btn1 = new JButton("");
		guess_color_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                color_btn1_var++;
				
				if (color_btn1_var >= 6) {
					color_btn1_var = 0;
				}
				
				if (color_btn1_var == 0) {
					guess_color_btn1.setBackground(Color.blue);
				}
				
				if (color_btn1_var == 1) {
					guess_color_btn1.setBackground(Color.red);
				}
				
				if (color_btn1_var == 2) {
					guess_color_btn1.setBackground(Color.yellow);
				}
				
				if (color_btn1_var == 3) {
					guess_color_btn1.setBackground(Color.green);
				}
				
				if (color_btn1_var == 4) {
					guess_color_btn1.setBackground(Color.pink);
				}
				
				if (color_btn1_var == 5) {
					guess_color_btn1.setBackground(Color.magenta);
				}
				
			}
		});
		guess_color_btn1.setBounds(920, 39, 92, 57);
		guess_color_btn1.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn1);
		
		JButton guess_color_btn2 = new JButton("");
		guess_color_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                color_btn2_var++;
				
				if (color_btn2_var >= 6) {
					color_btn2_var = 0;
				}
				
				if (color_btn2_var == 0) {
					guess_color_btn2.setBackground(Color.blue);
				}
				
				if (color_btn2_var == 1) {
					guess_color_btn2.setBackground(Color.red);
				}
				
				if (color_btn2_var == 2) {
					guess_color_btn2.setBackground(Color.yellow);
				}
				
				if (color_btn2_var == 3) {
					guess_color_btn2.setBackground(Color.green);
				}
				
				if (color_btn2_var == 4) {
					guess_color_btn2.setBackground(Color.pink);
				}
				
				if (color_btn2_var == 5) {
					guess_color_btn2.setBackground(Color.magenta);
				}
				
			}
		});
		guess_color_btn2.setBounds(927, 154, 85, 63);
		guess_color_btn2.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn2);
		
		JButton guess_color_btn3 = new JButton("");
		guess_color_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 color_btn3_var++;
					
					if (color_btn3_var >= 6) {
						color_btn3_var = 0;
					}
					
					if (color_btn3_var == 0) {
						guess_color_btn3.setBackground(Color.blue);
					}
					
					if (color_btn3_var == 1) {
						guess_color_btn3.setBackground(Color.red);
					}
					
					if (color_btn3_var == 2) {
						guess_color_btn3.setBackground(Color.yellow);
					}
					
					if (color_btn3_var == 3) {
						guess_color_btn3.setBackground(Color.green);
					}
					
					if (color_btn3_var == 4) {
						guess_color_btn3.setBackground(Color.pink);
					}
					
					if (color_btn3_var == 5) {
						guess_color_btn3.setBackground(Color.magenta);
					}
					
			}
		});
		guess_color_btn3.setBounds(927, 266, 85, 63);
		guess_color_btn3.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn3);
		
		JButton guess_color_btn4 = new JButton("");
		guess_color_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 color_btn4_var++;
					
					if (color_btn4_var >= 6) {
						color_btn4_var = 0;
					}
					
					if (color_btn4_var == 0) {
						guess_color_btn4.setBackground(Color.blue);
					}
					
					if (color_btn4_var == 1) {
						guess_color_btn4.setBackground(Color.red);
					}
					
					if (color_btn4_var == 2) {
						guess_color_btn4.setBackground(Color.yellow);
					}
					
					if (color_btn4_var == 3) {
						guess_color_btn4.setBackground(Color.green);
					}
					
					if (color_btn4_var == 4) {
						guess_color_btn4.setBackground(Color.pink);
					}
					
					if (color_btn4_var == 5) {
						guess_color_btn4.setBackground(Color.magenta);
					}
					
			}
		});
		guess_color_btn4.setBounds(927, 377, 85, 63);
		guess_color_btn4.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn4);
		
		JButton guessOKbtn = new JButton("OKGuess");
		
		JLabel WINlbl = new JLabel("Congratulation,you found the color");
		WINlbl.setHorizontalAlignment(SwingConstants.CENTER);
		WINlbl.setForeground(Color.green);
		WINlbl.setFont(new Font("Century Gothic", Font.BOLD, 54));
		WINlbl.setBounds(52, 593,1100, 100);
		WINlbl.setEnabled(false);
		frame.getContentPane().add(WINlbl);
		frame.repaint();
		
		JLabel LOSTlbl = new JLabel("Erro,the color does not match");
		LOSTlbl.setHorizontalAlignment(SwingConstants.CENTER);
		LOSTlbl.setForeground(Color.red);
		LOSTlbl.setFont(new Font("Century Gothic", Font.BOLD, 54));
		LOSTlbl.setBounds(46, 450,1100, 100);
		LOSTlbl.setEnabled(false);
		frame.getContentPane().add(LOSTlbl);
		frame.repaint();
		
		guessOKbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				
				color_btn1.setVisible(false);
				color_btn2.setVisible(false);
				color_btn3.setVisible(false);
				color_btn4.setVisible(false);
				
				guess_color_btn1.setVisible(false);
				guess_color_btn2.setVisible(false);
				guess_color_btn3.setVisible(false);
				guess_color_btn4.setVisible(false);
				
				guessOKbtn.setVisible(false);
				
				JButton Last_Try_1 = new JButton("");
				
				if (guess_color_btn1_var == 0) {
					
					Last_Try_1.setBackground(Color.blue);
				}
				
				else if (guess_color_btn1_var == 1) {
					
					Last_Try_1.setBackground(Color.red);
				}
				
                else if (guess_color_btn1_var == 2) {
					
					Last_Try_1.setBackground(Color.yellow);
				}
				
                else if (guess_color_btn1_var == 3) {
					
					Last_Try_1.setBackground(Color.green);
				}
				
                else if (guess_color_btn1_var == 4) {
					
					Last_Try_1.setBackground(Color.orange);
				}
				
                else if (guess_color_btn1_var == 5) {
					
					Last_Try_1.setBackground(Color.magenta);
				}
				
                else {
                	
                	System.out.println("Error;;; " + guess_color_btn1_var);
                }
                
				Last_Try_1.setEnabled(false);
                Last_Try_1.setBounds(X_Position_Last_Try_Var, 110, 40, 40);
                frame.getContentPane().add(Last_Try_1);
                frame.repaint();
                
               JButton Last_Try_2 = new JButton("");
				
				if (guess_color_btn2_var == 0) {
					
					Last_Try_2.setBackground(Color.blue);
				}
				
				else if (guess_color_btn2_var == 1) {
					
					Last_Try_2.setBackground(Color.red);
				}
				
                else if (guess_color_btn2_var == 2) {
					
					Last_Try_2.setBackground(Color.yellow);
				}
				
                else if (guess_color_btn2_var == 3) {
					
					Last_Try_2.setBackground(Color.green);
				}
				
                else if (guess_color_btn2_var == 4) {
					
					Last_Try_2.setBackground(Color.orange);
				}
				
                else if (guess_color_btn2_var == 5) {
					
					Last_Try_2.setBackground(Color.magenta);
				}
                
				Last_Try_2.setEnabled(false);
                Last_Try_2.setBounds(X_Position_Last_Try_Var, 200, 40, 40);
                frame.getContentPane().add(Last_Try_2);
                frame.repaint();
                
                JButton Last_Try_3 = new JButton("");
				
				if (guess_color_btn3_var == 0) {
					
					Last_Try_3.setBackground(Color.blue);
				}
				
				else if (guess_color_btn3_var == 1) {
					
					Last_Try_3.setBackground(Color.red);
				}
				
                else if (guess_color_btn3_var == 2) {
					
					Last_Try_3.setBackground(Color.yellow);
				}
				
                else if (guess_color_btn3_var == 3) {
					
					Last_Try_3.setBackground(Color.green);
				}
				
                else if (guess_color_btn3_var == 4) {
					
					Last_Try_3.setBackground(Color.orange);
				}
				
                else if (guess_color_btn3_var == 5) {
					
					Last_Try_3.setBackground(Color.magenta);
				}
                
				Last_Try_3.setEnabled(false);
                Last_Try_3.setBounds(X_Position_Last_Try_Var, 200, 40, 40);
                frame.getContentPane().add(Last_Try_3);
                frame.repaint();
                
               JButton Last_Try_4 = new JButton("");
				
				if (guess_color_btn4_var == 0) {
					
					Last_Try_4.setBackground(Color.blue);
				}
				
				else if (guess_color_btn4_var == 1) {
					
					Last_Try_4.setBackground(Color.red);
				}
				
                else if (guess_color_btn4_var == 2) {
					
					Last_Try_4.setBackground(Color.yellow);
				}
				
                else if (guess_color_btn4_var == 3) {
					
					Last_Try_4.setBackground(Color.green);
				}
				
                else if (guess_color_btn2_var == 4) {
					
					Last_Try_4.setBackground(Color.orange);
				}
				
                else if (guess_color_btn4_var == 5) {
					
					Last_Try_4.setBackground(Color.magenta);
				}
                
				Last_Try_4.setEnabled(false);
                Last_Try_4.setBounds(X_Position_Last_Try_Var, 290, 40, 40);
                frame.getContentPane().add(Last_Try_4);
                frame.repaint();
                
                temp_color_btn1_var = guess_color_btn1_var;
                temp_color_btn2_var = guess_color_btn2_var;
                temp_color_btn3_var = guess_color_btn3_var;
                temp_color_btn4_var = guess_color_btn4_var;
                
                
                if (guess_color_btn1_var == temp_color_btn1_var ) {
                	
                	correct_color++;
                	temp_color_btn1_var = -10;
                }
                
                else if (guess_color_btn1_var == temp_color_btn2_var) {
                	
                	correct_color++;
                	temp_color_btn2_var = -10;
                	
                }
                
                
                else if (guess_color_btn1_var == temp_color_btn3_var) {
                	
                	correct_color++;
                	temp_color_btn3_var = -10;
                	
                }
                
                else if (guess_color_btn1_var == temp_color_btn4_var) {
                	
                	correct_color++;
                	temp_color_btn4_var = -10;
                	
                }
                
                if (guess_color_btn2_var == temp_color_btn1_var ) {
                	
                	correct_color++;
                	temp_color_btn1_var = -10;
                }
                
                else if (guess_color_btn2_var == temp_color_btn2_var) {
                	
                	correct_color++;
                	temp_color_btn2_var = -10;
                	
                }
                
                
                else if (guess_color_btn2_var == temp_color_btn3_var) {
                	
                	correct_color++;
                	temp_color_btn3_var = -10;
                	
                }
                
                else if (guess_color_btn2_var == temp_color_btn4_var) {
                	
                	correct_color++;
                	temp_color_btn4_var = -10;
                	
                }
                
                if (guess_color_btn3_var == temp_color_btn1_var ) {
                	
                	correct_color++;
                	temp_color_btn1_var = -10;
                }
                
                else if (guess_color_btn3_var == temp_color_btn2_var) {
                	
                	correct_color++;
                	temp_color_btn2_var = -10;
                	
                }
                
                
                else if (guess_color_btn3_var == temp_color_btn3_var) {
                	
                	correct_color++;
                	temp_color_btn3_var = -10;
                	
                }
                
                else if (guess_color_btn3_var == temp_color_btn4_var) {
                	
                	correct_color++;
                	temp_color_btn4_var = -10;
                	
                }
                
               if (guess_color_btn4_var == temp_color_btn1_var ) {
                	
                	correct_color++;
                	temp_color_btn1_var = -10;
                }
                
                else if (guess_color_btn4_var == temp_color_btn2_var) {
                	
                	correct_color++;
                	temp_color_btn2_var = -10;
                	
                }
                
                
                else if (guess_color_btn4_var == temp_color_btn3_var) {
                	
                	correct_color++;
                	temp_color_btn3_var = -10;
                	
                }
                
                else if (guess_color_btn4_var == temp_color_btn4_var) {
                	
                	correct_color++;
                	temp_color_btn4_var = -10;
                	
                }
                
               if (guess_color_btn1_var == color_btn1_var) {
            	   
            	   correct_position++;
               }
               
               if (guess_color_btn2_var == color_btn2_var) {
            	   
            	   correct_position++;
               }
               
               if (guess_color_btn3_var == color_btn3_var) {
            	   
            	   correct_position++;
               }
               
               if (guess_color_btn4_var == color_btn4_var) {
            	   
            	   correct_position++;
               }
               
               JButton Last_Try_Correct_Color_1 = new JButton("");
               
               Last_Try_Correct_Color_1.setEnabled(false);
               Last_Try_Correct_Color_1.setBounds(X_Position_Last_Try_Var, 400, 15, 15);
               Last_Try_Correct_Color_1.setBackground(Color.white);
               if (correct_color >= 1) {
            	   
            	   Last_Try_Correct_Color_1.setVisible(true);
               }
               else {
            	   
            	   Last_Try_Correct_Color_1.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_1);
               frame.repaint();
               
              JButton Last_Try_Correct_Color_2 = new JButton("");
               
               Last_Try_Correct_Color_2.setEnabled(false);
               Last_Try_Correct_Color_2.setBounds(X_Position_Last_Try_Var + 10, 390, 15, 15);
               Last_Try_Correct_Color_2.setBackground(Color.white);
               if (correct_color >= 1) {
            	   
            	   Last_Try_Correct_Color_2.setVisible(true);
               }
               else {
            	   
            	   Last_Try_Correct_Color_2.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_2);
               frame.repaint();
               
              JButton Last_Try_Correct_Color_3 = new JButton("");
               
               Last_Try_Correct_Color_3.setEnabled(false);
               Last_Try_Correct_Color_3.setBounds(X_Position_Last_Try_Var, 425, 15, 15);
               Last_Try_Correct_Color_3.setBackground(Color.white);
               if (correct_color >= 1) {
            	   
            	   Last_Try_Correct_Color_3.setVisible(true);
               }
               else {
            	   
            	   Last_Try_Correct_Color_3.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_3);
               frame.repaint();
               
               JButton Last_Try_Correct_Color_4 = new JButton("");
               
               Last_Try_Correct_Color_4.setEnabled(false);
               Last_Try_Correct_Color_4.setBounds(X_Position_Last_Try_Var + 25, 410, 15, 15);
               Last_Try_Correct_Color_4.setBackground(Color.white);
               if (correct_color >= 1) {
            	   
            	   Last_Try_Correct_Color_4.setVisible(true);
               }
               else {
            	   
            	   Last_Try_Correct_Color_4.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_4);
               frame.repaint();
               
               
               
                
                X_Position_Last_Try_Var =  X_Position_Last_Try_Var + 50;
                
                JLabel textField = null;
				textField.setText("" + correct_color);
                
				
			}
		});
		guessOKbtn.setFont(new Font("Arial", Font.BOLD, 14));
		guessOKbtn.setBounds(42, 538, 103, 59);
		frame.getContentPane().add(guessOKbtn);
		
		JButton OKbtn = new JButton("OK");
		OKbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		OKbtn.setFont(new Font("Arial", Font.BOLD, 20));
		OKbtn.setBounds(914, 538, 98, 59);
		frame.getContentPane().add(OKbtn);
	}
}
