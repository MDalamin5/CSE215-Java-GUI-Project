package LOGandREG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField user;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 964, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		panel_1.setBackground(new Color(51, 204, 153));
		panel_1.setBounds(6, 6, 952, 575);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(357, 6, 589, 563);
		panel_3.setBackground(new Color(153, 153, 255));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		user = new JTextField();
		user.setBounds(243, 46, 316, 39);
		panel_3.add(user);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(243, 113, 316, 39);
		panel_3.add(pass);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(119, 57, 79, 16);
		panel_3.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(119, 124, 79, 16);
		panel_3.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String un=user.getText();
				String pas=pass.getText();
				
				if(un.equals("admin")&&pas.equals("123")) {
					JOptionPane.showMessageDialog(null, "Login Successfull");
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid user name and Password");
				}
			}
		});
		btnNewButton.setBounds(326, 203, 117, 29);
		panel_3.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(948, 571, -116, -55);
		frame.getContentPane().add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(437, 6, 487, 560);
		frame.getContentPane().add(panel);
	}
}
