import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;

public class OpenPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField email;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenPage frame = new OpenPage();
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
	public OpenPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeback = new JLabel("WELCOME BACK");
		welcomeback.setBounds(72, 10, 680, 117);
		welcomeback.setFont(new Font("Tahoma", Font.BOLD, 34));
		welcomeback.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(welcomeback);
		
		JLabel username = new JLabel("USER NAME");
		username.setFont(new Font("Tahoma", Font.BOLD, 18));
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setBounds(47, 145, 191, 59);
		contentPane.add(username);
		
		email = new JTextField();
		email.setBounds(293, 160, 231, 36);
		contentPane.add(email);
		email.setColumns(10);
		
		JLabel password = new JLabel("PASSWORD");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setFont(new Font("Tahoma", Font.BOLD, 18));
		password.setBounds(47, 259, 191, 59);
		contentPane.add(password);
		
		pass = new JTextField();
		pass.setBounds(293, 274, 228, 36);
		contentPane.add(pass);
		pass.setColumns(10);
		
		JButton submitbtn = new JButton("SUBMIT");
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = email.getText();
				String password = pass.getText();
				
				if(username.equals("admin") && password.equals("1234")) {
					MainPage ln = new MainPage();
					ln.setVisible(true);
					dispose();
				}else {
					System.out.println("you enter a wrrong username and password ");
				}
				
				
			}
		});
		submitbtn.setBounds(317, 374, 168, 67);
		contentPane.add(submitbtn);
	}
}
