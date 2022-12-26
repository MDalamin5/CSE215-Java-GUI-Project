package others;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import menus.SellerMenu;

public class SellerInvoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellerInvoice frame = new SellerInvoice();
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
	public SellerInvoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 110, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Invoice");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(287, 10, 140, 54);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 15));
		textPane.setEditable(false);
		textPane.setBounds(0, 74, 684, 399);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SellerMenu sm = new SellerMenu();
				sm.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(254, 222, 190));
		btnNewButton.setBounds(45, 21, 85, 27);
		contentPane.add(btnNewButton);
	}

}