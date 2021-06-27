import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField UserNameTextField;
	private JPasswordField PasswordTextField;
	private static String username,password;
	private JComboBox loginAs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setUserName(String name) {   // set the user name 
		this.username=name;
	}
	
	public void setPassword(String pass) {	// set the password 
		this.password=pass;
	}

	/**
	 * Create the frame.
	 */

	public Login() {
		setTitle("Admin Login Page");
		setBounds(0, 0, 915, 514); //set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBorder(null);
		panel.setBounds(0, 0, 899, 475);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel_1_2.setBackground(new Color(240, 230, 140));
		panel_1_2.setBounds(401, 132, 214, 53);
		panel.add(panel_1_2);
		
		JLabel UserNameLabel = new JLabel("User Name");
		UserNameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		UserNameLabel.setBounds(50, 11, 125, 31);
		panel_1_2.add(UserNameLabel);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel_1_3.setBackground(new Color(240, 230, 140));
		panel_1_3.setBounds(401, 222, 214, 53);
		panel.add(panel_1_3);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PasswordLabel.setBounds(57, 11, 115, 31);
		panel_1_3.add(PasswordLabel);
		
		UserNameTextField = new JTextField();
		UserNameTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		UserNameTextField.setBounds(638, 132, 243, 53);
		panel.add(UserNameTextField);
		UserNameTextField.setColumns(10);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					if(UserNameTextField.getText().equals("A") && PasswordTextField.getText().equals("a")&&loginAs.getSelectedItem().equals("Admin")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						AdminHome frame = new AdminHome(); //calling admin frame/window
						frame .setModalExclusionType(null);
						frame.setVisible(true);
						setVisible(false);
					}
					else if(UserNameTextField.getText().equals(username) && PasswordTextField.getText().equals(password)&&loginAs.getSelectedItem().equals("User")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						UserHome frame = new UserHome();	// calling user frame
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
					}
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
				}
			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		LoginButton.setBounds(668, 401, 187, 53);
		panel.add(LoginButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNameTextField.setText("");
				PasswordTextField.setText("");
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		ResetButton.setBounds(439, 401, 187, 53);
		panel.add(ResetButton);
		
		JLabel TitleLabel = new JLabel("SOL 24/7\r\n ORGANISATION");
		TitleLabel.setBounds(413, 45, 468, 59);
		panel.add(TitleLabel);
		TitleLabel.setForeground(new Color(255, 255, 255));
		TitleLabel.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(0, 0, 391, 475);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/IMAGE/SOL24.PNG")));
		lblNewLabel.setBounds(78, 24, 159, 178);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/IMAGE/Capture.PNG")));
		lblNewLabel_1.setBounds(0, 223, 391, 252);
		panel_1.add(lblNewLabel_1);
		
		PasswordTextField = new JPasswordField();
		PasswordTextField.setBounds(634, 222, 247, 53);
		panel.add(PasswordTextField);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
			    frame.setVisible(true);
			    setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		button.setBackground(new Color(250, 128, 114));
		button.setBounds(800, 11, 89, 23);
		panel.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(401, 309, 214, 53);
		panel.add(panel_2);
		
		JLabel lblType = new JLabel("Login As");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblType.setBounds(57, 11, 115, 31);
		panel_2.add(lblType);
		
		loginAs = new JComboBox();
		loginAs.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		loginAs.setModel(new DefaultComboBoxModel(new String[] {"User", "Admin"}));
		loginAs.setBounds(638, 309, 243, 53);
		panel.add(loginAs);
	}
}
