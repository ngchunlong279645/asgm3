import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageUserPage extends JFrame {

	private JPanel contentPane;
	private static JTextArea description;
	private static JTextArea vision;
	private static JTextArea mission ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageUserPage frame = new ManageUserPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static JTextArea getDS() {
		return description;
	}
	
	public static  JTextArea getVS() {
		return vision;
	}
	
	public static  JTextArea getMS() {
		return mission;
	}

	/**
	 * Create the frame.
	 */
	public ManageUserPage() {
		setBounds(100, 100, 836, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 820, 478);
		contentPane.add(panel);
		
		JLabel lblSetDescription = new JLabel("Set Description :\r\n");
		lblSetDescription.setForeground(Color.WHITE);
		lblSetDescription.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblSetDescription.setBounds(25, 41, 158, 22);
		panel.add(lblSetDescription);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserHome frame = new UserHome();
				//frame.setDescription(description.getText());
				//frame.setVision(vision.getText());
				//frame.setMission(mission.getText());
				frame.setVisible(true);
				setVisible(false);
				
			}
		});
		button.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		button.setBackground(new Color(255, 105, 180));
		button.setBounds(725, 6, 89, 23);
		panel.add(button);
		
		JLabel lblSetVision = new JLabel("Set Vision :\r\n");
		lblSetVision.setForeground(Color.WHITE);
		lblSetVision.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblSetVision.setBounds(25, 242, 158, 22);
		panel.add(lblSetVision);
		
		JLabel lblSetMission = new JLabel("Set Mission :\r\n");
		lblSetMission.setForeground(Color.WHITE);
		lblSetMission.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblSetMission.setBounds(423, 242, 158, 22);
		panel.add(lblSetMission);
		
		description = new JTextArea();
		description.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		description.setText("SOLS 24/7 is a leading in-person and online education provider for the\r\npoor. Starting out as experts in teaching English to those with zero or \r\nvery basic English proficiency, we have since branched out to \r\nencompass Employable English skills for school, university, business \r\npurposes as well as becoming a job preparation and digital education \r\nprovider.");
		description.setBounds(179, 40, 607, 161);
		panel.add(description);
		
		vision = new JTextArea();
		vision.setText("SOLS 24/7 envisions that people from all \r\ncommunities \u2013 regardless of race, \r\nreligion or gender \u2013 will have access to \r\neducation and social empowerment \r\nservices, resulting in developed societies \r\nwith equal opportunities for all.");
		vision.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		vision.setBounds(25, 284, 363, 161);
		panel.add(vision);
		
		mission = new JTextArea();
		mission.setText("Our mission is to serve, educate \r\n& empower the bottom 40% of \r\nthe population with FREE \r\neducation, personal \r\ndevelopment & employment \r\nsupport.");
		mission.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		mission.setBounds(423, 286, 363, 161);
		panel.add(mission);
	}
}
