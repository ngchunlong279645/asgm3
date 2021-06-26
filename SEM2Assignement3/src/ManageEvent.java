import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageEvent extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField eventName;
	private JTextField eventDate;
	private JTextField eventTime;
	private JTextField eventLoc;
	private JTextField eventP;
	DefaultTableModel model1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageEvent frame = new ManageEvent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static JTable getTable() {
		return table;
	}

	/**
	 * Create the frame.
	 */
	public ManageEvent() {
		setBounds(100, 100, 690, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 674, 444);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) SystemColor.activeCaption));
		panel_1.setBackground(new Color(220, 220, 220));
		panel_1.setBounds(55, 31, 577, 194);
		panel.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 557, 172);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"World Book and Copyright Day", "18/6/2021", "3pm", "Bukit Aman", "3"},
					{"International Day of Families", "15/7/2021", "4pm", "Bukit Tinggi", "4"},
					{"International Day of Happiness", "9/9/2021", "5pm", "Bukit Raja", "5"},
				},
				new String[] {
					"Event Name", "Date", "Time", "Location", "Ticket Price"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(162);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Event Name :");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(30, 263, 147, 25);
		panel.add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblDate.setBounds(30, 314, 147, 25);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time :");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblTime.setBounds(30, 371, 147, 25);
		panel.add(lblTime);
		
		JLabel lblLocation = new JLabel("Location :");
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblLocation.setBounds(357, 268, 147, 25);
		panel.add(lblLocation);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price :");
		lblTicketPrice.setForeground(Color.WHITE);
		lblTicketPrice.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblTicketPrice.setBounds(357, 319, 147, 25);
		panel.add(lblTicketPrice);
		
		eventName = new JTextField();
		eventName.setBounds(170, 265, 134, 20);
		panel.add(eventName);
		eventName.setColumns(10);
		
		eventDate = new JTextField();
		eventDate.setColumns(10);
		eventDate.setBounds(170, 316, 134, 20);
		panel.add(eventDate);
		
		eventTime = new JTextField();
		eventTime.setColumns(10);
		eventTime.setBounds(170, 373, 134, 20);
		panel.add(eventTime);
		
		eventLoc = new JTextField();
		eventLoc.setColumns(10);
		eventLoc.setBounds(498, 270, 134, 20);
		panel.add(eventLoc);
		
		eventP = new JTextField();
		eventP.setColumns(10);
		eventP.setBounds(498, 316, 134, 20);
		panel.add(eventP);
		
		JButton resetBtn = new JButton("reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventName.setText("");
				eventDate.setText("");
				eventTime.setText("");
				eventLoc.setText("");
				eventP.setText("");
			}
		});
		resetBtn.setBounds(357, 399, 66, 23);
		panel.add(resetBtn);
		
		JButton submitBtn = new JButton("submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Event frame = new Event(); 
					frame.setVisible(true);
					setVisible(false);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		submitBtn.setForeground(new Color(255, 255, 255));
		submitBtn.setBackground(new Color(255, 105, 180));
		submitBtn.setBounds(589, 6, 79, 23);
		panel.add(submitBtn);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
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
		btnDelete.setBounds(456, 399, 79, 23);
		panel.add(btnDelete);
		
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model1 = (DefaultTableModel) table.getModel();
				
				model1.addRow(new Object[]{
						eventName.getText(),
						eventDate.getText(),
						eventTime.getText(),
						eventLoc.getText(),
						eventP.getText(),		
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Event Update confirmed", "Event Management System",
								JOptionPane.OK_OPTION);
					}
				}

				
			}
		});
		btnAdd.setBounds(563, 399, 66, 23);
		panel.add(btnAdd);
	}
}
