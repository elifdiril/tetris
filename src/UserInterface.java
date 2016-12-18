/**
* @author Ertugrul
 */

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

// To create graphics , i will use swing tools
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
 
/* This class creates a user interface. For example, there will be a "start game" button and with event
 * handling this button will start the game. Also there will be settings button to allow player choose 
 * difficulty and other options. And so on .. 
 */
public class UserInterface extends JFrame {
	
	private CustomPanel mainPanel;   // Main Menu 

	
	private UserInterface(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new CardLayout());
		setBounds(0, 0, 1000, 500);
		setLocationRelativeTo(null);   // to appear in center 
		
		// Initializing our custom panel with background image 
		try {
			mainPanel = new CustomPanel("src/new_images/bg.jpg",1000,500);

		} catch (IOException e1) {
			System.out.println("IO Exception");
		}

		
		setContentPane(mainPanel);
		mainPanel.setLayout(new GridBagLayout());
		setResizable(false);     // no need to be full size for Tetris game menu
		
		/* Buttons and their functions */
		JButton button1  = new JButton(""); // Start Game  
		JButton button2 = new JButton("");  // Settings
		JButton button3  = new JButton(""); //Controls
		JButton button4 = new JButton("");  // High Scores
		JButton button5  = new JButton(""); // Exit
		
		// 2 images for every button. Extra images are for rollover effect.
		ImageIcon b1_roll = new ImageIcon("src/new_images/play.png");
		button1.setIcon(new ImageIcon("src/new_images/r_play.png"));
		ImageIcon b2_roll = new ImageIcon("src/new_images/settings.png");
		button2.setIcon(new ImageIcon("src/new_images/r_settings.png"));
		ImageIcon b3_roll = new ImageIcon("src/new_images/gamepad.png");
		button3.setIcon(new ImageIcon("src/new_images/r_gamepad.png"));
		ImageIcon b4_roll = new ImageIcon("src/new_images/scores.png");
		button4.setIcon(new ImageIcon("src/new_images/r_scores.png"));
		ImageIcon b5_roll = new ImageIcon("src/new_images/exit.png");
		button5.setIcon(new ImageIcon("src/new_images/r_exit.png"));
		
		// to delete button frame for better looking 
		Border emptyBorder = BorderFactory.createEmptyBorder();
		button1.setBorder(emptyBorder);
		button1.setOpaque(false);
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false);
		
		button2.setBorder(emptyBorder);
		button2.setOpaque(false);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		
		button3.setBorder(emptyBorder);
		button3.setOpaque(false);
		button3.setContentAreaFilled(false);
		button3.setBorderPainted(false);
		
		button4.setBorder(emptyBorder);
		button4.setOpaque(false);
		button4.setContentAreaFilled(false);
		button4.setBorderPainted(false);
	
		button5.setBorder(emptyBorder);
		button5.setOpaque(false);
		button5.setContentAreaFilled(false);
		button5.setBorderPainted(false);
		
		// adding buttons mouseover effect.
		button1.setRolloverIcon(b1_roll);
		button2.setRolloverIcon(b2_roll);
		button3.setRolloverIcon(b3_roll);
		button4.setRolloverIcon(b4_roll);
		button5.setRolloverIcon(b5_roll);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets= new Insets(15,45,15,20);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.weightx=1;
		gbc.weighty=1;
		add(button1,gbc);
		gbc.gridx = 1;
		add(button2,gbc);
		gbc.gridx = 2;
		add(button3,gbc);
		gbc.gridx = 3;
		add(button4,gbc);
		gbc.gridx = 4;
		add(button5,gbc);

		// Add functionality to exit button. It's trivial.
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
	}
	
	public static void main(String[] args) {
			JFrame game = new UserInterface ();
			game.setVisible(true);
	}

}

