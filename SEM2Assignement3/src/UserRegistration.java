import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class UserRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField pass;
	private JTextField cfmpass;
	private JTable table;
	private static String name,psw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration frame = new UserRegistration();
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
	public UserRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 676, 267);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(329, 28, 318, 196);
		panel.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 298, 175);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Password", "Date", "Time"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUserName.setBounds(22, 54, 62, 14);
		panel.add(lblUserName);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.BOLD, 11));
		username.setColumns(10);
		username.setBounds(154, 51, 127, 20);
		panel.add(username);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(22, 95, 62, 14);
		panel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfirmPassword.setBounds(22, 137, 111, 14);
		panel.add(lblConfirmPassword);
		
		pass = new JTextField();
		pass.setFont(new Font("Tahoma", Font.BOLD, 11));
		pass.setColumns(10);
		pass.setBounds(154, 92, 127, 20);
		panel.add(pass);
		
		cfmpass = new JTextField();
		cfmpass.setFont(new Font("Tahoma", Font.BOLD, 11));
		cfmpass.setColumns(10);
		cfmpass.setBounds(154, 134, 127, 20);
		panel.add(cfmpass);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText("");
				pass.setText("");
				cfmpass.setText("");
			}
		});
		resetButton.setBounds(74, 194, 89, 23);
		panel.add(resetButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				SimpleDateFormat date = new SimpleDateFormat("dd:MMM:yyyy");
				
		
				if(!pass.getText().equals(cfmpass.getText())) {
					JOptionPane.showMessageDialog(null, "Password does not match");
				}
				else {
				model.addRow(new Object[]{
						username.getText(),
						pass.getText(),
						date.format(new Date()),
						java.time.LocalTime.now(),
				});				
				}
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
																// null or not Integer will throw exception
			        name = String.valueOf(model.getValueAt(i, 0));
			        psw = String.valueOf(model.getValueAt(i, 1));
				}
			
			}
		});
		registerButton.setBounds(192, 194, 89, 23);
		panel.add(registerButton);
		
		JLabel lblNewLabel = new JLabel(">>Click here back to login<<");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login frame = new Login();		//display login page
				frame.setUserName(name);	
				frame.setPassword(psw);	
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel.setBounds(102, 235, 179, 14);
		panel.add(lblNewLabel);
	}
}
