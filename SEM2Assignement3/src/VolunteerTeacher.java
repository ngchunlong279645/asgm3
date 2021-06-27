import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class VolunteerTeacher extends JFrame {

	private JPanel contentPane;
	private JTextField teacherName;
	private JTextField teacherAge;
	private JTextField teacherEmail;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VolunteerTeacher frame = new VolunteerTeacher();
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
	public VolunteerTeacher() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 165, 0)));
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(0, 0, 1030, 510);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 165, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(0, 0, 193, 571);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserHome frame = new UserHome() ;
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel.setForeground(Color.BLACK);
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
		lblEvent.setBounds(10, 160, 93, 48);
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
		lblDonation.setBounds(10, 283, 132, 48);
		panel_1.add(lblDonation);
		
		JLabel lblVolunteer = new JLabel("VOLUNTEER");
		lblVolunteer.setForeground(Color.WHITE);
		lblVolunteer.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblVolunteer.setBounds(10, 413, 174, 48);
		panel_1.add(lblVolunteer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 165, 0)));
		panel_2.setBackground(new Color(255, 215, 0));
		panel_2.setBounds(186, 0, 844, 508);
		panel.add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 69, 0)));
		panel_4.setBackground(new Color(240, 230, 140));
		panel_4.setBounds(21, 111, 252, 276);
		panel_2.add(panel_4);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(20, 30, 62, 14);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("Age");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(20, 63, 62, 14);
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("Gender");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(20, 100, 62, 14);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Subject");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(20, 136, 62, 14);
		panel_4.add(label_4);
		
		teacherName = new JTextField();
		teacherName.setFont(new Font("Tahoma", Font.BOLD, 11));
		teacherName.setColumns(10);
		teacherName.setBounds(100, 27, 127, 20);
		panel_4.add(teacherName);
		
		teacherAge = new JTextField();
		teacherAge.setFont(new Font("Tahoma", Font.BOLD, 11));
		teacherAge.setColumns(10);
		teacherAge.setBounds(100, 60, 127, 20);
		panel_4.add(teacherAge);
		
		JComboBox teacherGender = new JComboBox();
		teacherGender.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Female", "Male"}));
		teacherGender.setFont(new Font("Tahoma", Font.BOLD, 11));
		teacherGender.setBounds(98, 97, 129, 20);
		panel_4.add(teacherGender);
		
		JComboBox teacherSubject = new JComboBox();
		teacherSubject.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "English", "Science", "Malay", "Chinese", "Computer", "Account"}));
		teacherSubject.setFont(new Font("Tahoma", Font.BOLD, 11));
		teacherSubject.setBounds(98, 133, 129, 20);
		panel_4.add(teacherSubject);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(20, 183, 62, 14);
		panel_4.add(label_5);
		
		teacherEmail = new JTextField();
		teacherEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		teacherEmail.setColumns(10);
		teacherEmail.setBounds(100, 180, 127, 20);
		panel_4.add(teacherEmail);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 69, 0)));
		panel_5.setBackground(new Color(240, 230, 140));
		panel_5.setBounds(21, 398, 791, 87);
		panel_2.add(panel_5);
		
		JButton button = new JButton("ADD RECORD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				
				model1.addRow(new Object[]{
						teacherName.getText(),
						teacherAge.getText(),
						teacherGender.getSelectedItem(),
						teacherSubject.getSelectedItem(),
						teacherEmail.getText(),		
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Event Update confirmed", "Event Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(10, 23, 135, 38);
		panel_5.add(button);
		
		JButton button_1 = new JButton("RESET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherName.setText("");
				teacherAge.setText("");
				teacherGender.setSelectedItem("Make a selection");
				teacherSubject.setSelectedItem("Make a selection");
				teacherEmail.setText("");		
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(155, 23, 94, 38);
		panel_5.add(button_1);
		
		JButton button_2 = new JButton("DELETE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model1.removeRow(table.getSelectedRow());
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(468, 23, 94, 38);
		panel_5.add(button_2);
		
		JButton button_3 = new JButton("EXIT");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(687, 23, 94, 38);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("PRINT");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(364, 23, 94, 38);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("UPLOAD");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Ivy Ng\\Desktop\\java tutorials\\SEM2Assignement3\\src\\teacherList.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBounds(572, 23, 105, 38);
		panel_5.add(button_5);
		
		JButton button_6 = new JButton("UPDATE");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model1.setValueAt(teacherName.getText(),i,0);
			    	model1.setValueAt(teacherAge.getText(),i,1);
			    	model1.setValueAt(teacherGender.getSelectedItem(),i,2);
			    	model1.setValueAt(teacherSubject.getSelectedItem(),i,3);
			    	model1.setValueAt(teacherEmail.getText(),i,4);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(260, 23, 94, 38);
		panel_5.add(button_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 69, 0)));
		panel_6.setBackground(new Color(176, 224, 230));
		panel_6.setBounds(283, 111, 529, 276);
		panel_2.add(panel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 509, 254);
		panel_6.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Age", "Gender", "Subject", "Email"
				}
			));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBounds(745, 11, 89, 23);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 165, 0));
		
		JLabel label = new JLabel("Teacher Registration System");
		label.setFont(new Font("Tahoma", Font.BOLD, 45));
		label.setBounds(68, 36, 696, 51);
		panel_2.add(label);
	}
}
