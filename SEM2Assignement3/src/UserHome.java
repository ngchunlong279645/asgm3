import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserHome extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrSolsIs;
	private JTextArea txtrSolsEnvisions ;
	private JTextArea txtrOurMissionIs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHome frame = new UserHome();
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
	public UserHome() {
		setTitle("Home");
		setBounds(100, 100, 844, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 165, 0)));
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(0, 0, 828, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 165, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(0, 0, 193, 434);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 40, 93, 48);
		panel_1.add(lblNewLabel);
		
		JLabel lblEvent = new JLabel("EVENT");
		lblEvent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Event frame = new Event() ;
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblEvent.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblEvent.setBounds(10, 134, 93, 48);
		panel_1.add(lblEvent);
		
		JLabel lblDonation = new JLabel("DONATION");
		lblDonation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Donation frame = new Donation();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblDonation.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblDonation.setBounds(10, 232, 132, 48);
		panel_1.add(lblDonation);
		
		JLabel lblVolunteer = new JLabel("VOLUNTEER");
		lblVolunteer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VolunteerTeacher frame = new VolunteerTeacher ();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblVolunteer.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblVolunteer.setBounds(10, 345, 174, 48);
		panel_1.add(lblVolunteer);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setBounds(729, 11, 89, 23);
		panel.add(btnNewButton);
		
		JLabel label = new JLabel("Who Are We ?");
		label.setForeground(new Color(128, 0, 128));
		label.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 35));
		label.setBounds(217, 40, 204, 47);
		panel.add(label);
		
		txtrSolsIs = new JTextArea();
		JTextArea d =ManageUserPage.getDS();	// get the description text from ManageUser
		if(d!=null) {
		txtrSolsIs=d;		
		}
		//txtrSolsIs.setText("SOLS 24/7 is a leading in-person and online education provider for the\r\npoor. Starting out as experts in teaching English to those with zero or \r\nvery basic English proficiency, we have since branched out to \r\nencompass Employable English skills for school, university, business \r\npurposes as well as becoming a job preparation and digital education \r\nprovider.");
		txtrSolsIs.setForeground(Color.WHITE);
		txtrSolsIs.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		txtrSolsIs.setBackground(new Color(106, 90, 205));
		txtrSolsIs.setBounds(217, 86, 576, 118);
		panel.add(txtrSolsIs);
		
		JLabel label_1 = new JLabel("Vision");
		label_1.setForeground(new Color(0, 0, 139));
		label_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		label_1.setBounds(217, 227, 146, 25);
		panel.add(label_1);
		
		txtrSolsEnvisions = new JTextArea();
		JTextArea v =ManageUserPage.getVS();	// get the vision text from ManageUser
		if(v!=null) {
		txtrSolsEnvisions=v;
		}
		//txtrSolsEnvisions.setText("SOLS 24/7 envisions that people from all \r\ncommunities \u2013 regardless of race, \r\nreligion or gender \u2013 will have access to \r\neducation and social empowerment \r\nservices, resulting in developed societies \r\nwith equal opportunities for all.");
		txtrSolsEnvisions.setForeground(Color.WHITE);
		txtrSolsEnvisions.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		txtrSolsEnvisions.setBackground(new Color(102, 205, 170));
		txtrSolsEnvisions.setBounds(217, 252, 273, 143);
		panel.add(txtrSolsEnvisions);
		
		JLabel label_2 = new JLabel("Mission");
		label_2.setForeground(new Color(47, 79, 79));
		label_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		label_2.setBounds(520, 222, 130, 34);
		panel.add(label_2);
		
		txtrOurMissionIs = new JTextArea();
		JTextArea m =ManageUserPage.getMS();	// get mission text from ManageUser
		if(m!=null) {
		txtrOurMissionIs=m;
		}
		//txtrOurMissionIs.setText("Our mission is to serve, educate \r\n& empower the bottom 40% of \r\nthe population with FREE \r\neducation, personal \r\ndevelopment & employment \r\nsupport.");
		txtrOurMissionIs.setForeground(Color.WHITE);
		txtrOurMissionIs.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		txtrOurMissionIs.setBackground(new Color(221, 160, 221));
		txtrOurMissionIs.setBounds(520, 253, 273, 142);
		panel.add(txtrOurMissionIs);
	}
}
