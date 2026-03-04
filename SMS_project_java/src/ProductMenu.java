import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;

public class ProductMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductMenu frame = new ProductMenu();
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
	public ProductMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 547);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton listbtn = new JButton("LIST OF PRODUCTS");
		listbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListJframe ln = new ListJframe();
				ln.setVisible(true);
				dispose();
				
			}
		});
		listbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listbtn.setBounds(297, 145, 180, 70);
		contentPane.add(listbtn);
		
		JButton btnNewButton_1_2 = new JButton(" BILLS REPORT");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(297, 278, 180, 70);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel = new JLabel("PRODUCT PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(238, 10, 318, 91);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_2_1 = new JButton("EXIST");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage ln = new MainPage ();
				ln.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2_1.setBounds(297, 408, 180, 70);
		contentPane.add(btnNewButton_1_2_1);
	}

}
