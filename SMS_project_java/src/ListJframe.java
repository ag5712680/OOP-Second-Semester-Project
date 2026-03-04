import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListJframe extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ProductMangement ps;
	private JTextArea listBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListJframe frame = new ListJframe();
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
	public ListJframe() {
		ps=new ProductMangement(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 556);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setForeground(SystemColor.windowText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 listBox = new JTextArea();
		 listBox.setEditable(false);
		listBox.setBounds(24, 56, 629, 438);
		contentPane.add(listBox);
		
		JButton btnNewButton = new JButton("<BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductMenu ln = new ProductMenu();
				ln.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(41, 10, 106, 36);
		contentPane.add(btnNewButton);
		
		JButton btnAdd = new JButton("<ADD ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ps.add_item();
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(672, 133, 173, 76);
		contentPane.add(btnAdd);
		
		JButton btnNewButton_2 = new JButton("<DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ps.deleteItem();
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(672, 242, 173, 76);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("<PURCHASE ITEMS");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ps.PurchaseItems();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(672, 356, 173, 76);
		contentPane.add(btnNewButton_2_1);
	}
	public void display(Product p) {
		listBox.append(p.itemcode + "\t"+p.itemname + "\t"+p.itemprice + "\t"+p.quantity + "\n");
	}
	public void resetBox(){
		listBox.setText("");
		listBox.append("ID\tName\t price\t Quantity\n");
    }
}
