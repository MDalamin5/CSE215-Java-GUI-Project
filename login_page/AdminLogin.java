package login_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;

public class AdminLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 66));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Admin\r\n");
		btnNewButton.setFont(new Font("Nunito SemiBold", Font.PLAIN, 35));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(130, 205, 71));
		btnNewButton.setBounds(0, 310, 684, 82);
		contentPane.add(btnNewButton);
		
		JButton btnSellerLogin = new JButton("Seller\r\n");
		btnSellerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SellerLogWindow slw = new SellerLogWindow();
				slw.setVisible(true);
				dispose();
			}
		});
		btnSellerLogin.setForeground(Color.WHITE);
		btnSellerLogin.setFont(new Font("Nunito SemiBold", Font.PLAIN, 35));
		btnSellerLogin.setBackground(new Color(84, 180, 53));
		btnSellerLogin.setBounds(0, 391, 684, 82);
		contentPane.add(btnSellerLogin);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(new Color(240, 255, 66));
		txtpnLogin.setFont(new Font("Nunito ExtraBold", Font.BOLD, 45));
		txtpnLogin.setText("LogIn");
		txtpnLogin.setBounds(264, 113, 166, 82);
		contentPane.add(txtpnLogin);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogWindow adminLogWindow = new AdminLogWindow();
				adminLogWindow.setVisible(true);
				dispose();
				
				
			}
		});
	}
}