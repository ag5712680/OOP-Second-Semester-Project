import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class REGFILE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField DobField;
	private JTextField AddressField;
	private JTextField CONField;
	private JTextField salaryField;
	private JTextField NameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGFILE frame = new REGFILE();
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
	public REGFILE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 729);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("NAME");
		name.setFont(new Font("Tahoma", Font.BOLD, 20));
		name.setBounds(10, 10, 134, 47);
		contentPane.add(name);
		
		JLabel dob = new JLabel("DOB");
		dob.setFont(new Font("Tahoma", Font.BOLD, 20));
		dob.setBounds(10, 79, 134, 47);
		contentPane.add(dob);
		
		JLabel address = new JLabel("ADDRESS");
		address.setFont(new Font("Tahoma", Font.BOLD, 20));
		address.setBounds(10, 162, 134, 47);
		contentPane.add(address);
		
		JLabel contact = new JLabel("CONTACT");
		contact.setFont(new Font("Tahoma", Font.BOLD, 20));
		contact.setBounds(10, 250, 134, 47);
		contentPane.add(contact);
		
		JLabel salary = new JLabel("SALARY");
		salary.setFont(new Font("Tahoma", Font.BOLD, 20));
		salary.setBounds(10, 345, 134, 47);
		contentPane.add(salary);
		
		JLabel DEP = new JLabel("DEPARTMENT");
		DEP.setFont(new Font("Tahoma", Font.BOLD, 20));
		DEP.setBounds(10, 443, 174, 47);
		contentPane.add(DEP);
		
		JLabel DES = new JLabel("DESIGNATION");
		DES.setFont(new Font("Tahoma", Font.BOLD, 20));
		DES.setBounds(10, 553, 185, 47);
		contentPane.add(DES);
		
		DobField = new JTextField();
		DobField.setColumns(10);
		DobField.setBounds(216, 79, 212, 47);
		contentPane.add(DobField);
		
		AddressField = new JTextField();
		AddressField.setColumns(10);
		AddressField.setBounds(216, 180, 212, 47);
		contentPane.add(AddressField);
		
		CONField = new JTextField();
		CONField.setColumns(10);
		CONField.setBounds(216, 268, 212, 47);
		contentPane.add(CONField);
		
		salaryField = new JTextField();
		salaryField.setColumns(10);
		salaryField.setBounds(216, 345, 212, 47);
		contentPane.add(salaryField);
		
		JComboBox DepcomboBox = new JComboBox();
		DepcomboBox.setFont(new Font("Tahoma", Font.BOLD, 21));
		DepcomboBox.setModel(new DefaultComboBoxModel(new String[] {"RSCI", "RIPS", "RIPP"}));
		DepcomboBox.setBackground(new Color(255, 255, 255));
		DepcomboBox.setBounds(235, 443, 193, 47);
		contentPane.add(DepcomboBox);
		
		JComboBox des = new JComboBox();
		des.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		des.setModel(new DefaultComboBoxModel(new String[] {"lecture", "senior lec", "testing"}));
		des.setBounds(235, 553, 193, 47);
		contentPane.add(des);
		
		JButton btnOok = new JButton("submit");
		btnOok.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnOok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
                String name = NameField.getText();
                String dob = DobField.getText();
                 String address = AddressField.getText();
                String contact = CONField.getText();
                String salary = salaryField.getText();

                String designation =(String) des.getSelectedItem();
               

  
	                JOptionPane.showMessageDialog(REGFILE.this, "Name: " + name + "\nDoB: " + dob + "address: " + address + "\nCon: " + contact+"\nsalary" + salary   );
	                JOptionPane.showMessageDialog(REGFILE.this, " good bacha");
			}
		});
		btnOok.setBounds(507, 570, 248, 83);
		contentPane.add(btnOok);
		
		NameField = new JTextField();
		NameField.setColumns(10);
		NameField.setBounds(216, 10, 212, 47);
		contentPane.add(NameField);
	}	
}