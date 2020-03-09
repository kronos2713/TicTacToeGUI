import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.SystemColor;

public class App extends JFrame {

	private JFrame frame;
	private String turn = "X";
	private String playerX = "Player one";
	private String playerO = "Player one";
	private int playerXCount = 0;
	private int playerOCount = 0;
	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b3 = new JButton("");
	JButton b4 = new JButton("");
	JButton b5 = new JButton("");
	JButton b6 = new JButton("");
	JButton b7 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	private final JButton btnScorex = new JButton("");
	private final JButton btnScoreo = new JButton("");
	
	private void setScore() {
		btnScorex.setText(playerX + " score=" + String.valueOf(playerXCount));
		btnScoreo.setText(playerO + " score=" + String.valueOf(playerOCount));
	}
	private void getPName() {
		playerX = JOptionPane.showInputDialog(this,"Player X name", "Player Name:", JOptionPane.INFORMATION_MESSAGE);
		playerO = JOptionPane.showInputDialog(this,"Player O name", "Player Name:", JOptionPane.INFORMATION_MESSAGE);
		if(playerX.equals("")) {
			playerX = "Player X";
		}
		if(playerO.equals("")) {
			playerO = "Player O";
		}
	}
	
	private void determineTurn() {
		if(turn.equalsIgnoreCase("X")) {
			turn = "O";
		}else {
			turn = "X";
		}
	}
	
	private void xWin() {
		JOptionPane.showMessageDialog(this, playerX + " wins!!!");
		playerXCount++;
		setScore();
		reset();
	}
	
	private void oWin() {
		JOptionPane.showMessageDialog(this, playerO + " wins!!!");
		playerOCount++;
		setScore() ;
		reset();
	}
	
	private void tie() {

		String one =b1.getText();
		String two = b2.getText();
		String three = b3.getText();
		String four = b4.getText();
		String five = b5.getText();
		String six = b6.getText();
		String seven = b7.getText();
		String eight = b8.getText();
		String nine = b9.getText();
		
		if(one != "" && two != "" && three != "" && four != "" && five != "" && six != ""  && seven != "" && eight != "" && nine != "" && tieWin() == false) {
			
			JOptionPane.showMessageDialog(this, "It's a tie!!!");
			reset();
		}
	}
	
	private void reset() {
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		
	}

	private void Win() {
		String one =b1.getText();
		String two = b2.getText();
		String three = b3.getText();
		String four = b4.getText();
		String five = b5.getText();
		String six = b6.getText();
		String seven = b7.getText();
		String eight = b8.getText();
		String nine = b9.getText();
		
		// X wins
		if(one == "X" && two == "X" && three == "X") {
			xWin();
		}else if(four == "X" && five == "X" && six == "X") {
			xWin();
		}
		else if(seven == "X" && eight == "X" && nine == "X") {
			xWin();
		}else if(one == "X" && five == "X" && nine == "X") {
			xWin();
		}else if(three == "X" && five == "X" && seven == "X") {
			xWin();
		}else if(one == "X" && four == "X" && seven == "X") {
			xWin();
		}else if(two == "X" && five == "X" && eight == "X") {
			xWin();
		}else if(three == "X" && six == "X" && nine == "X") {
			xWin();
		}
		
		//O wins
		if(one == "O" && two == "O" && three == "O") {
			oWin();
		}else if(four == "O" && five == "O" && six == "O") {
			oWin();
		}
		else if(seven == "O" && eight == "O" && nine == "O") {
			oWin();
		}else if(one == "O" && five == "O" && nine == "O") {
			oWin();
		}else if(three == "O" && five == "O" && seven == "O") {
			oWin();
		}else if(one == "O" && four == "O" && seven == "O") {
			oWin();
		}else if(two == "O" && five == "O" && eight == "O") {
			oWin();
		}else if(three == "O" && six == "O" && nine == "O") {
			oWin();
		}
	}
	
	private boolean tieWin() {

		String one =b1.getText();
		String two = b2.getText();
		String three = b3.getText();
		String four = b4.getText();
		String five = b5.getText();
		String six = b6.getText();
		String seven = b7.getText();
		String eight = b8.getText();
		String nine = b9.getText();
		
		// X wins
		if(one == "X" && two == "X" && three == "X") {
			return true;
		}else if(four == "X" && five == "X" && six == "X") {
			return true;
		}
		else if(seven == "X" && eight == "X" && nine == "X") {
			return true;
		}else if(one == "X" && five == "X" && nine == "X") {
			return true;
		}else if(three == "X" && five == "X" && seven == "X") {
			return true;
		}else if(one == "X" && four == "X" && seven == "X") {
			return true;
		}else if(two == "X" && five == "X" && eight == "X") {
			return true;
		}else if(three == "X" && six == "X" && nine == "X") {
			return true;
		}else if(one == "O" && two == "O" && three == "O") {
			return true;
		}else if(four == "O" && five == "O" && six == "O") {
			return true;
		}
		else if(seven == "O" && eight == "O" && nine == "O") {
			return true;
		}else if(one == "O" && five == "O" && nine == "O") {
			return true;
		}else if(three == "O" && five == "O" && seven == "O") {
			return true;
		}else if(one == "O" && four == "O" && seven == "O") {
			return true;
		}else if(two == "O" && five == "O" && eight == "O") {
			return true;
		}else if(three == "O" && six == "O" && nine == "O") {
			return true;
		}
		
		return false;
	}
	
	private void newGame() {
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		playerXCount = 0;
		playerOCount = 0;
        
		if (JOptionPane.showConfirmDialog(null, "Do you want to keep the same players?", "New Game",
		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		    // yes option
		} else {
		   getPName();
		}
		setScore();
	}
	

	public static void main(String[] args) {
		 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(0, 139, 139));
		frame.setBackground(new Color(0, 255, 255));
		frame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frame.setType(Type.UTILITY);
		frame.setTitle("TicTacToe2.0");
		frame.setBounds(100, 100, 860, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		getPName();
		setScore();
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b1.getText();
				if(a.equals("")) {
					b1.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b1.setForeground(Color.RED);
					}else {
						b1.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
				
				
			}
		});
		b1.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b1.setBackground(new Color(255, 222, 173));
		b1.setBounds(10, 10, 200, 160);
		frame.getContentPane().add(b1);
		
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b2.getText();
				if(a.equals("")) {
					b2.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b2.setForeground(Color.RED);
					}else {
						b2.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b2.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b2.setBackground(new Color(255, 222, 173));
		b2.setBounds(220, 10, 200, 160);
		frame.getContentPane().add(b2);
		
	
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b3.getText();
				if(a.equals("")) {
					b3.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b3.setForeground(Color.RED);
					}else {
						b3.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b3.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b3.setBackground(new Color(255, 222, 173));
		b3.setBounds(430, 10, 200, 160);
		frame.getContentPane().add(b3);
		

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b4.getText();
				if(a.equals("")) {
					b4.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b4.setForeground(Color.RED);
					}else {
						b4.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b4.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b4.setBackground(new Color(255, 222, 173));
		b4.setBounds(10, 180, 200, 160);
		frame.getContentPane().add(b4);
	

		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b5.getText();
				if(a.equals("")) {
					b5.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b5.setForeground(Color.RED);
					}else {
						b5.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b5.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b5.setBackground(new Color(255, 222, 173));
		b5.setBounds(220, 180, 200, 160);
		frame.getContentPane().add(b5);
		
	
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b6.getText();
				if(a.equals("")) {
					b6.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b6.setForeground(Color.RED);
					}else {
						b6.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b6.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b6.setBackground(new Color(255, 222, 173));
		b6.setBounds(430, 180, 200, 160);
		frame.getContentPane().add(b6);
		
	
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b7.getText();
				if(a.equals("")) {
					b7.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b7.setForeground(Color.RED);
					}else {
						b7.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b7.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b7.setBackground(new Color(255, 222, 173));
		b7.setBounds(10, 350, 200, 160);
		frame.getContentPane().add(b7);
		
	
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b8.getText();
				if(a.equals("")) {
					b8.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b8.setForeground(Color.RED);
					}else {
						b8.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b8.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b8.setBackground(new Color(255, 222, 173));
		b8.setBounds(220, 350, 200, 160);
		frame.getContentPane().add(b8);
		

		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = b9.getText();
				if(a.equals("")) {
					b9.setText(turn);
					if(turn.equalsIgnoreCase("X")) {
						b9.setForeground(Color.RED);
					}else {
						b9.setForeground(Color.blue);
					}
					determineTurn();
					Win();
					tie();
				}else {
					JOptionPane.showMessageDialog(frame, "Slot already taken, try another");
				}
			}
		});
		b9.setFont(new Font("Segoe Print", Font.BOLD, 99));
		b9.setBackground(new Color(255, 222, 173));
		b9.setBounds(430, 350, 200, 160);
		frame.getContentPane().add(b9);
		
		JButton newGame = new JButton("New Game");
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		newGame.setForeground(Color.BLUE);
		newGame.setFont(new Font("Tahoma", Font.BOLD, 28));
		newGame.setBounds(640, 26, 200, 50);
		frame.getContentPane().add(newGame);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(null, "Do you want to exit the game?", "Exit Game",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
				  
				}
			
				
			}
		});
		btnExit.setForeground(Color.BLUE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnExit.setBounds(640, 108, 200, 50);
		frame.getContentPane().add(btnExit);
		btnScorex.setForeground(Color.RED);
		btnScorex.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnScorex.setBounds(10, 520, 396, 93);
		
		frame.getContentPane().add(btnScorex);
		btnScoreo.setForeground(Color.BLUE);
		btnScoreo.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnScoreo.setBounds(440, 520, 396, 93);
		
		frame.getContentPane().add(btnScoreo);
		
		
	}
}