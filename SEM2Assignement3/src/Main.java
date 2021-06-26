import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 140, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 872, 423);
		contentPane.add(panel);
		
		JButton button_5 = new JButton("Login in");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();	
				frame.setVisible(true);
				setVisible(false);
			}
		});
		button_5.setBounds(772, 96, 89, 23);
		panel.add(button_5);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Tekton Pro", Font.BOLD, 18));
		button_5.setBackground(SystemColor.textHighlight);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 140, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(0, 0, 872, 96);
		panel.add(panel_1);
		
		JLabel lblWelcomeToSol = new JLabel("WELCOME TO SOL 24/7 ORGANISATION");
		lblWelcomeToSol.setForeground(new Color(255, 255, 255));
		lblWelcomeToSol.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		lblWelcomeToSol.setBounds(10, 11, 862, 74);
		panel_1.add(lblWelcomeToSol);
		
		JButton button = new JButton("");	//youtube link
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.youtube.com/user/sols247"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setIcon(new ImageIcon(Main.class.getResource("/IMAGE/youtube-icon.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(816, 239, 33, 37);
		panel.add(button);
		
		JButton button_1 = new JButton("");	//twitter link
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://twitter.com/SOLS247"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setIcon(new ImageIcon(Main.class.getResource("/IMAGE/twitter-icon.png")));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(816, 200, 33, 28);
		panel.add(button_1);
		
		JButton button_2 = new JButton(""); //offical website link
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.sols247.org/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setIcon(new ImageIcon(Main.class.getResource("/IMAGE/social-media-icon.png")));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(816, 161, 33, 28);
		panel.add(button_2);
		
		JButton button_3 = new JButton("");	// facebook link
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.facebook.com/SOLS247/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setIcon(new ImageIcon(Main.class.getResource("/IMAGE/facebook-icon.png")));
		button_3.setBounds(816, 122, 33, 28);
		panel.add(button_3);
		
		JButton button_4 = new JButton("JOIN US ! !");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserRegistration frame = new UserRegistration();	
				frame.setVisible(true);
				setVisible(false);
			}
		});
		button_4.setForeground(new Color(160, 82, 45));
		button_4.setFont(new Font("Tekton Pro Ext", Font.BOLD, 30));
		button_4.setBounds(95, 329, 211, 37);
		panel.add(button_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/IMAGE/10003490_684354198272969_1131493672_n.png")));
		label.setBounds(10, 90, 851, 325);
		panel.add(label);
	}
}
