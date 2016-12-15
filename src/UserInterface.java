/**
 * @author Ertugrul
 */

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;  // To create graphics , i will use swing tools
 
/* This class creates a user interface. For example, there will be a "start game" button and with event
 * handling this button will start the game. Also there will be settings button to allow player choose 
 * difficulty and other options. And so on .. 
 */
public class UserInterface extends JFrame {
	
	private JPanel mainPanel;   // Main Menu 

	
	private UserInterface(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new CardLayout());
		setBounds(0, 0, 500, 500);
		setLocationRelativeTo(null);   // to appear in center 
		mainPanel = new JPanel();
		setContentPane(mainPanel);
		mainPanel.setLayout(new GridBagLayout());
		setResizable(false);     // no need to be full size for Tetris game menu

		/* Buttons and their functions */
		JButton button1  = new JButton("Start Game");   
		JButton button2 = new JButton("Settings");
		JButton button3  = new JButton("Controls");
		JButton button4 = new JButton("High Scores");
		JButton button5  = new JButton("Exit");

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets= new Insets(15, 15, 15, 15);
		gbc.gridx = 0;
		gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
		
        add(button1,gbc);
		
		gbc.gridy = 2;
		add(button2,gbc);
		
		gbc.gridy = 3;
		add(button3,gbc);
		
		gbc.gridy = 4;
		add(button4,gbc);
		
		gbc.gridy = 5;
		add(button5,gbc);
	}
	
	public static void main(String[] args) {
			JFrame game = new UserInterface ();
			game.setVisible(true);
	}

}

