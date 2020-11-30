package mastermind;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class MastermindGame {

	protected static final Window LOST_lbl = null;
	protected static final Window WIN_lbl = null;
	private JFrame frame;
	int difficulty_var = 12;
	int trys;
	
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
	
	int X_Position_Last_Try_var = 140;
	int correct_color;
	int correct_position;
	private JTextField textField;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MastermindGame window = new MastermindGame();
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
	public MastermindGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 500, 1290, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//////////////Code buttons(In the right)////////////////////
		
		JButton color_btn1 = new JButton("");
		color_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				color_btn1_var ++;
				
				if (color_btn1_var >= 6) {
					
					color_btn1_var = 0;
				}
				
				if (color_btn1_var == 0) {
					
					color_btn1.setBackground(Color.blue);
				}
				
                if (color_btn1_var == 1) {
					
					color_btn1.setBackground(Color.red);
				}
                
                if (color_btn1_var == 2) {
					
					color_btn1.setBackground(Color.yellow);
				}
                
                if (color_btn1_var == 3) {
					
					color_btn1.setBackground(Color.green);
				}
                
                if (color_btn1_var == 4) {
					
					color_btn1.setBackground(Color.orange);
				}
                
                if (color_btn1_var == 5) {
					
					color_btn1.setBackground(Color.magenta);
				}
			}
		});
		color_btn1.setBounds(1100, 37, 109, 63);
		color_btn1.setBackground(Color.blue);
		frame.getContentPane().add(color_btn1);
		
		JButton color_btn2 = new JButton("");
		color_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               color_btn2_var ++;
				
				if (color_btn2_var >= 6) {
					
					color_btn2_var = 0;
				}
				
				if (color_btn2_var == 0) {
					
					color_btn2.setBackground(Color.blue);
				}
				
                if (color_btn2_var == 1) {
					
					color_btn2.setBackground(Color.red);
				}
                
                if (color_btn2_var == 2) {
					
					color_btn2.setBackground(Color.yellow);
				}
                
                if (color_btn2_var == 3) {
					
					color_btn1.setBackground(Color.green);
				}
                
                if (color_btn2_var == 4) {
					
					color_btn2.setBackground(Color.orange);
				}
                
                if (color_btn2_var == 5) {
					
					color_btn2.setBackground(Color.magenta);
				}
			}
		});
		color_btn2.setBounds(1100, 158, 109, 63);
		color_btn2.setBackground(Color.blue);
		frame.getContentPane().add(color_btn2);
		
		JButton color_btn3 = new JButton("");
		color_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               color_btn3_var ++;
				
				if (color_btn3_var >= 6) {
					
					color_btn3_var = 0;
				}
				
				if (color_btn3_var == 0) {
					
					color_btn3.setBackground(Color.blue);
				}
				
                if (color_btn3_var == 1) {
					
					color_btn3.setBackground(Color.red);
				}
                
                if (color_btn3_var == 2) {
					
					color_btn3.setBackground(Color.yellow);
				}
                
                if (color_btn3_var == 3) {
					
					color_btn3.setBackground(Color.green);
				}
                
                if (color_btn3_var == 4) {
					
					color_btn3.setBackground(Color.orange);
				}
                
                if (color_btn3_var == 5) {
					
					color_btn3.setBackground(Color.magenta);
				}
			}
		});
		color_btn3.setBounds(1100, 282, 109, 63);
		color_btn3.setBackground(Color.blue);
		frame.getContentPane().add(color_btn3);
		
		JButton color_btn4 = new JButton("");
		color_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               color_btn4_var ++;
				
				if (color_btn4_var >= 6) {
					
					color_btn4_var = 0;
				}
				
				if (color_btn4_var == 0) {
					
					color_btn4.setBackground(Color.blue);
				}
				
                if (color_btn4_var == 1) {
					
					color_btn4.setBackground(Color.red);
				}
                
                if (color_btn4_var == 2) {
					
					color_btn4.setBackground(Color.yellow);
				}
                
                if (color_btn4_var == 3) {
					
					color_btn4.setBackground(Color.green);
				}
                
                if (color_btn4_var == 4) {
					
					color_btn4.setBackground(Color.orange);
				}
                
                if (color_btn4_var == 5) {
					
					color_btn4.setBackground(Color.magenta);
				}
			}
		});
		color_btn4.setBounds(1100, 395, 109, 63);
		color_btn4.setBackground(Color.blue);
		frame.getContentPane().add(color_btn4);
		
		JButton Ok_btn = new JButton("OK_btn");
		Ok_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				color_btn1.setVisible(false);
				color_btn2.setVisible(false);
				color_btn3.setVisible(false);
				color_btn4.setVisible(false);
				
				Window guess_color_btn1 = null;
				guess_color_btn1.setVisible(true);
				Window guess_color_btn2 = null;
				guess_color_btn2.setVisible(true);
				Window guess_color_btn3 = null;
				guess_color_btn3.setVisible(true);
				Window guess_color_btn4 = null;
				guess_color_btn4.setVisible(true);
				
				Ok_btn.setVisible(false);
				
			}
		});
		Ok_btn.setFont(new Font("Arial", Font.BOLD, 20));
		Ok_btn.setBounds(1100, 515, 109, 55);
		frame.getContentPane().add(Ok_btn);
		
		/////////////////////Guess buttons(in the left)///////////////////////////////////
		
		JButton guess_color_btn1 = new JButton("");
		guess_color_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess_color_btn1_var++;
				
				if (guess_color_btn1_var >= 6) {
					
					guess_color_btn1_var = 0;
				}
				
				if (guess_color_btn1_var == 0) {
					
					guess_color_btn1.setBackground(Color.blue);
				}
				
                if (guess_color_btn1_var == 1) {
					
					guess_color_btn1.setBackground(Color.red);
				}
                
                if (guess_color_btn1_var == 2) {
					
					guess_color_btn1.setBackground(Color.yellow);
				}
                
                if (guess_color_btn1_var == 3) {
					
					guess_color_btn1.setBackground(Color.green);
				}
                
                if (guess_color_btn1_var == 4) {
					
					guess_color_btn1.setBackground(Color.orange);
				}
                
                if (guess_color_btn1_var == 5) {
					
					guess_color_btn1.setBackground(Color.magenta);
				}
			}
		});
		guess_color_btn1.setBounds(33, 37, 109, 55);
		guess_color_btn1.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn1);
		
		JButton guess_color_btn2 = new JButton("");
		guess_color_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
              guess_color_btn2_var++;
				
				if (guess_color_btn2_var >= 6) {
					
					guess_color_btn2_var = 0;
				}
				
				if (guess_color_btn2_var == 0) {
					
					guess_color_btn2.setBackground(Color.blue);
				}
				
                if (guess_color_btn2_var == 1) {
					
					guess_color_btn2.setBackground(Color.red);
				}
                
                if (guess_color_btn2_var == 2) {
					
					guess_color_btn2.setBackground(Color.yellow);
				}
                
                if (guess_color_btn2_var == 3) {
					
					guess_color_btn2.setBackground(Color.green);
				}
                
                if (guess_color_btn2_var == 4) {
					
					guess_color_btn2.setBackground(Color.orange);
				}
                
                if (guess_color_btn2_var == 5) {
					
					guess_color_btn2.setBackground(Color.magenta);
				}
			}
		});
		guess_color_btn2.setBounds(33, 158, 109, 63);
		guess_color_btn2.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn2);
		
		JButton guess_color_btn3 = new JButton("");
		guess_color_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                guess_color_btn3_var++;
				
				if (guess_color_btn3_var >= 6) {
					
					guess_color_btn3_var = 0;
				}
				
				if (guess_color_btn3_var == 0) {
					
					guess_color_btn3.setBackground(Color.blue);
				}
				
                if (guess_color_btn3_var == 1) {
					
					guess_color_btn3.setBackground(Color.red);
				}
                
                if (guess_color_btn3_var == 2) {
					
					guess_color_btn3.setBackground(Color.yellow);
				}
                
                if (guess_color_btn3_var == 3) {
					
					guess_color_btn3.setBackground(Color.green);
				}
                
                if (guess_color_btn3_var == 4) {
					
					guess_color_btn3.setBackground(Color.orange);
				}
                
                if (guess_color_btn3_var == 5) {
					
					guess_color_btn3.setBackground(Color.magenta);
				}
			}
		});
		guess_color_btn3.setBounds(33, 282, 109, 63);
		guess_color_btn3.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn3);
		
		JButton guess_color_btn4 = new JButton("");
		guess_color_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                guess_color_btn4_var++;
				
				if (guess_color_btn4_var >= 6) {
					
					guess_color_btn4_var = 0;
				}
				
				if (guess_color_btn4_var == 0) {
					
					guess_color_btn4.setBackground(Color.blue);
				}
				
                if (guess_color_btn4_var == 1) {
					
					guess_color_btn4.setBackground(Color.red);
				}
                
                if (guess_color_btn4_var == 2) {
					
					guess_color_btn4.setBackground(Color.yellow);
				}
                
                if (guess_color_btn4_var == 3) {
					
					guess_color_btn4.setBackground(Color.green);
				}
                
                if (guess_color_btn4_var == 4) {
					
					guess_color_btn4.setBackground(Color.orange);
				}
                
                if (guess_color_btn4_var == 5) {
					
					guess_color_btn4.setBackground(Color.magenta);
				}
			}
		});
		guess_color_btn4.setBounds(33, 395, 109, 55);
		guess_color_btn4.setBackground(Color.blue);
		frame.getContentPane().add(guess_color_btn4);
		
		JButton Guess_btn = new JButton("GUESS_btn");
		Guess_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				correct_color = 0;
				correct_position = 0;
				trys++;
				
				
				
				
				JButton Last_Try_1 = new JButton("");
				
				if (guess_color_btn1_var == 0) {
					
					Last_Try_1.setBackground(Color.blue);
					System.out.println("MSG!!!" + guess_color_btn1_var);
				}
				
				else if(guess_color_btn1_var == 1) {
					
					Last_Try_1.setBackground(Color.red);
					System.out.println("MSG!!!" + guess_color_btn1_var);
				}
				
                else if(guess_color_btn1_var == 2) {
					
					Last_Try_1.setBackground(Color.yellow);
				}
				
                else if(guess_color_btn1_var == 3) {
					
					Last_Try_1.setBackground(Color.green);
				}
				
				
                else if(guess_color_btn1_var == 4) {
					
					Last_Try_1.setBackground(Color.orange);
				}
				
				
               else if(guess_color_btn1_var == 5) {
					
					Last_Try_1.setBackground(Color.magenta);
				}
				
               else {
            	   
            	   System.out.println("Error!!!" + guess_color_btn1_var);
               }
				
				Last_Try_1.setEnabled(false);
				Last_Try_1.setBounds(X_Position_Last_Try_var, 110, 40, 40);
				frame.getContentPane().add(Last_Try_1);
				frame.getContentPane().repaint();
				
               JButton Last_Try_2 = new JButton("");
				
				if (guess_color_btn2_var == 0) {
					
					Last_Try_2.setBackground(Color.blue);
				}
				
				else if(guess_color_btn2_var == 1) {
					
					Last_Try_2.setBackground(Color.red);
				}
				
                else if(guess_color_btn2_var == 2) {
					
					Last_Try_2.setBackground(Color.yellow);
				}
				
                else if(guess_color_btn2_var == 3) {
					
					Last_Try_2.setBackground(Color.green);
				}
				
				
                else if(guess_color_btn2_var == 4) {
					
					Last_Try_2.setBackground(Color.orange);
				}
				
				
               else if(guess_color_btn2_var == 5) {
					
					Last_Try_2.setBackground(Color.magenta);
				}
				
				Last_Try_2.setEnabled(false);
				Last_Try_2.setBounds(X_Position_Last_Try_var, 200, 40, 40);
				frame.getContentPane().add(Last_Try_2);
				frame.getContentPane().repaint();
				
              JButton Last_Try_3 = new JButton("");
				
				if (guess_color_btn3_var == 0) {
					
					Last_Try_3.setBackground(Color.blue);
				}
				
				else if(guess_color_btn3_var == 1) {
					
					Last_Try_3.setBackground(Color.red);
				}
				
                else if(guess_color_btn3_var == 2) {
					
					Last_Try_3.setBackground(Color.yellow);
				}
				
                else if(guess_color_btn3_var == 3) {
					
					Last_Try_3.setBackground(Color.green);
				}
				
				
                else if(guess_color_btn3_var == 4) {
					
					Last_Try_3.setBackground(Color.orange);
				}
				
				
               else if(guess_color_btn3_var == 5) {
					
					Last_Try_3.setBackground(Color.magenta);
				}
				
				Last_Try_3.setEnabled(false);
				Last_Try_3.setBounds(X_Position_Last_Try_var, 290, 40, 40);
				frame.getContentPane().add(Last_Try_3);
				frame.getContentPane().repaint();
				
               JButton Last_Try_4 = new JButton("");
				
				if (guess_color_btn4_var == 0) {
					
					Last_Try_4.setBackground(Color.blue);
				}
				
				else if(guess_color_btn4_var == 1) {
					
					Last_Try_4.setBackground(Color.red);
				}
				
                else if(guess_color_btn4_var == 2) {
					
					Last_Try_4.setBackground(Color.yellow);
				}
				
                else if(guess_color_btn4_var == 3) {
					
					Last_Try_4.setBackground(Color.green);
				}
				
				
                else if(guess_color_btn4_var == 4) {
					
					Last_Try_4.setBackground(Color.orange);
				}
				
				
               else if(guess_color_btn4_var == 5) {
					
					Last_Try_4.setBackground(Color.magenta);
				}
				
				Last_Try_4.setEnabled(false);
				Last_Try_4.setBounds(X_Position_Last_Try_var, 380, 40, 40);
				frame.getContentPane().add(Last_Try_4);
				frame.getContentPane().repaint();
				
				temp_color_btn1_var = color_btn1_var;
				temp_color_btn2_var = color_btn2_var;
				temp_color_btn3_var = color_btn3_var;
				temp_color_btn4_var = color_btn4_var;
				
				if (guess_color_btn1_var == temp_color_btn1_var) {
					
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
			
				
                if (guess_color_btn2_var == temp_color_btn1_var) {
					
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
				
				
               if (guess_color_btn3_var == temp_color_btn1_var) {
					
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
               
               if (guess_color_btn4_var == temp_color_btn1_var) {
					
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
               Last_Try_Correct_Color_1.setBounds(X_Position_Last_Try_var, 400, 15, 15);
               Last_Try_Correct_Color_1.setBackground(Color.white);
               if (correct_color >= 1) {
            	   
            	   Last_Try_Correct_Color_1.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Color_1.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_1 );
               frame.getContentPane().repaint();
               
               JButton Last_Try_Correct_Color_2 = new JButton("");
               
               Last_Try_Correct_Color_2.setEnabled(false);
               Last_Try_Correct_Color_2.setBounds(X_Position_Last_Try_var + 25, 400, 15, 15);
               Last_Try_Correct_Color_2.setBackground(Color.white);
               if (correct_color >= 2) {
            	   
            	   Last_Try_Correct_Color_2.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Color_2.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_2 );
               frame.getContentPane().repaint();
               
               JButton Last_Try_Correct_Color_3 = new JButton("");
               
               Last_Try_Correct_Color_3.setEnabled(false);
               Last_Try_Correct_Color_3.setBounds(X_Position_Last_Try_var, 410, 15, 15);
               Last_Try_Correct_Color_3.setBackground(Color.white);
               if (correct_color >= 3) {
            	   
            	   Last_Try_Correct_Color_3.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Color_3.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_3);
               frame.getContentPane().repaint();
               
               JButton Last_Try_Correct_Color_4 = new JButton("");
               
               Last_Try_Correct_Color_4.setEnabled(false);
               Last_Try_Correct_Color_4.setBounds(X_Position_Last_Try_var + 25, 425, 15, 15);
               Last_Try_Correct_Color_4.setBackground(Color.white);
               if (correct_color >= 4) {
            	   
            	   Last_Try_Correct_Color_4.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Color_4.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Color_4);
               frame.getContentPane().repaint();
               
              JButton Last_Try_Correct_Position_1 = new JButton("");
               
               Last_Try_Correct_Position_1.setEnabled(false);
               Last_Try_Correct_Position_1.setBounds(X_Position_Last_Try_var, 460, 15, 15);
               Last_Try_Correct_Position_1.setBackground(Color.black);
               if (correct_color >= 1) {
            	   
            	   Last_Try_Correct_Position_1.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Position_1.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Position_1 );
               frame.getContentPane().repaint();
               
               JButton Last_Try_Correct_Position_2 = new JButton("");
               
               Last_Try_Correct_Position_2.setEnabled(false);
               Last_Try_Correct_Position_2.setBounds(X_Position_Last_Try_var + 25, 460, 15, 15);
               Last_Try_Correct_Position_2.setBackground(Color.black);
               if (correct_color >= 2) {
            	   
            	   Last_Try_Correct_Position_2.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Position_2.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Position_2 );
               frame.getContentPane().repaint();
               
               JButton Last_Try_Correct_Position_3 = new JButton("");
               
               Last_Try_Correct_Position_3.setEnabled(false);
               Last_Try_Correct_Position_3.setBounds(X_Position_Last_Try_var, 485, 15, 15);
               Last_Try_Correct_Position_3.setBackground(Color.black);
               if (correct_color >= 3) {
            	   
            	   Last_Try_Correct_Position_3.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Position_3.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Position_3);
               frame.getContentPane().repaint();
               
               JButton Last_Try_Correct_Position_4 = new JButton("");
               
               Last_Try_Correct_Position_4.setEnabled(false);
               Last_Try_Correct_Position_4.setBounds(X_Position_Last_Try_var + 25, 485, 15, 15);
               Last_Try_Correct_Position_4.setBackground(Color.black);
               if (correct_color >= 4) {
            	   
            	   Last_Try_Correct_Position_4.setVisible(true);
               }
               
               else {
            	   
            	   Last_Try_Correct_Position_4.setVisible(false);
               }
               frame.getContentPane().add(Last_Try_Correct_Position_4);
               frame.getContentPane().repaint();
                             
               textField.setText("" + correct_color);
               
               if (difficulty_var == 12) {
            	   
            	   X_Position_Last_Try_var = X_Position_Last_Try_var + 85;
               }
               
               if (difficulty_var == 16) {
            	   
            	   X_Position_Last_Try_var = X_Position_Last_Try_var + 62;
               }
               
               if (difficulty_var == 8) {
            	   
            	   X_Position_Last_Try_var = X_Position_Last_Try_var + 133;
               }
               
				
				if (correct_position == 4) {
					
					guess_color_btn1.setEnabled(false);
					guess_color_btn2.setEnabled(false);
					guess_color_btn3.setEnabled(false);
					guess_color_btn4.setEnabled(false);
					
					color_btn1.setVisible(true);
					color_btn1.setEnabled(false);
					color_btn2.setVisible(true);
					color_btn2.setEnabled(false);
					color_btn3.setVisible(true);
					color_btn3.setEnabled(false);
					color_btn4.setVisible(true);
					color_btn4.setEnabled(false);
					
					Guess_btn.setVisible(false);
					
					WIN_lbl.setVisible(true);
					
				}
				
				else if (trys == difficulty_var) {
					
					guess_color_btn1.setEnabled(false);
					guess_color_btn2.setEnabled(false);
					guess_color_btn3.setEnabled(false);
					guess_color_btn4.setEnabled(false);
					
					color_btn1.setVisible(true);
					color_btn1.setEnabled(false);
					color_btn2.setVisible(true);
					color_btn2.setEnabled(false);
					color_btn3.setVisible(true);
					color_btn3.setEnabled(false);
					color_btn4.setVisible(true);
					color_btn4.setEnabled(false);
					
					Guess_btn.setVisible(false);
					
					LOST_lbl.setVisible(true);
					
				}
				
				
				
				
				
				
				
			}
		});
		Guess_btn.setFont(new Font("Arial", Font.BOLD, 13));
		Guess_btn.setBounds(33, 515, 109, 55);
		frame.getContentPane().add(Guess_btn);
		
		textField = new JTextField();
		textField.setBounds(422, 511, 259, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel WIN_lbl = new JLabel("You found the correct color combination");
		WIN_lbl.setForeground(Color.GREEN);
		WIN_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		WIN_lbl.setFont(new Font("Arial", Font.BOLD, 30));
		WIN_lbl.setBounds(209, 584, 640, 43);
		WIN_lbl.setVisible(false);
		frame.getContentPane().add(WIN_lbl);
		
		JLabel LOST_lbl = new JLabel("No more attemps,you lost");
		LOST_lbl.setForeground(Color.RED);
		LOST_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		LOST_lbl.setFont(new Font("Arial", Font.BOLD, 30));
		LOST_lbl.setBounds(281, 656, 492, 43);
		LOST_lbl.setVisible(false);
		frame.getContentPane().add(LOST_lbl);
		
		JLabel lblTry = new JLabel("try X/X");
		lblTry.setHorizontalAlignment(SwingConstants.CENTER);
		lblTry.setFont(new Font("Arial", Font.BOLD, 30));
		lblTry.setBounds(405, 723, 202, 35);
		frame.getContentPane().add(lblTry);
	}
}
